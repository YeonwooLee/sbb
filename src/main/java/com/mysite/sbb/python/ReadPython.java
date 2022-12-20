package com.mysite.sbb.python;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.google.gson.Gson;


public class ReadPython {
    public static MyObject read(String pythonProgramName, String[] args) {
        String workingDir = System.getProperty("user.dir");
        System.out.println("workingDir = " + workingDir);
        String path = workingDir + "\\src\\main\\java\\com\\mysite\\sbb\\python";
        String command = String.format("python %s\\%s.py", path, pythonProgramName);
        for (String arg : args) {
            command += " " + arg;
        }
        String result = "";
        MyObject mo = null;
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String output = in.readLine();

            mo = new Gson().fromJson(output, MyObject.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(mo==null) throw new RuntimeException("python 반환값 null");
        return mo;
    }


    public static void main(String[] args) {
        MyObject res = read("script", new String[] {"arg1", "arg2", "arg3asd"});

        System.out.println("r = " + res.toString());

    }
}
