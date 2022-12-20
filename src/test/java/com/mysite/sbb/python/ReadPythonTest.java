package com.mysite.sbb.python;

import com.mysite.sbb.python.MyObject;
import com.mysite.sbb.python.ReadPython;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadPythonTest {
    @Test
    void 파이썬_테스트(){
        MyObject read = ReadPython.read("script", new String[]{"a", "b"});
        System.out.println("read = " + read.toString());
    }

}