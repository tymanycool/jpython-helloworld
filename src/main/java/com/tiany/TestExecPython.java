package com.tiany;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试java和python的调用流程
 * @author webim
 *
 */
public enum TestExecPython
{
    INSTANCE;

    public void test()
    {
        String scriptFile = "E:\\workspace\\idea\\jpython-helloworld\\src\\main\\resources\\test.py";
        Map<String,String> properties = new HashMap<String,String>();
        properties.put("userName", "Demo");

        ExecPython.INSTANCE.execute(scriptFile, properties);
    }

    public static void main(String[] args)
    {
        TestExecPython.INSTANCE.test();
    }
}
