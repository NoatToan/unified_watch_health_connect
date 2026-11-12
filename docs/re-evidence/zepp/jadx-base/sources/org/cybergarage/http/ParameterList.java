package org.cybergarage.http;

import java.util.Vector;

/* JADX INFO: loaded from: classes23.dex */
public class ParameterList extends Vector {
    public Parameter at(int i) {
        return (Parameter) get(i);
    }

    public Parameter getParameter(int i) {
        return (Parameter) get(i);
    }

    public String getValue(String str) {
        Parameter parameter = getParameter(str);
        return parameter == null ? "" : parameter.getValue();
    }

    public Parameter getParameter(String str) {
        if (str == null) {
            return null;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            Parameter parameterAt = at(i);
            if (str.compareTo(parameterAt.getName()) == 0) {
                return parameterAt;
            }
        }
        return null;
    }
}
