def main(args):
    # Do some processing with the arguments

    # Return the result
    result = {}
    result['gameId'] = str(args[0])

    result['top']="t"
    result['jungle']="jg"
    result['mid']="md"
    result['adc']="adc"
    result['support']="sp1"
    return result

if __name__ == "__main__":
    import sys
    result = main(sys.argv[1:])
    print(result) # 출력을 해야 들어감
