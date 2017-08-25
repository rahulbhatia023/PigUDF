package com.rahul.hadoop.pig.udf;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

import java.io.IOException;

public class TOUPPERCASE extends EvalFunc<String> {
    @Override
    public String exec(Tuple input) throws IOException {
        if (input == null || input.size() == 0) {
            return null;
        }
        String str = (String) input.get(0);
        return str.toUpperCase();
    }
}
