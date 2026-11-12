package com.huawei.agconnect.apms;

import com.google.gson.JsonPrimitive;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {
    public static final Float abc = Float.valueOf(Float.NaN);
    public static final Boolean bcd = Boolean.FALSE;

    public static JsonPrimitive abc(String str) {
        if (str == null) {
            str = Constants.NULL;
        }
        return new JsonPrimitive(str);
    }

    public static JsonPrimitive abc(Boolean bool) {
        if (bool == null) {
            bool = bcd;
        }
        return new JsonPrimitive(bool);
    }

    public static JsonPrimitive abc(Number number) {
        if (number == null) {
            number = abc;
        }
        return new JsonPrimitive(number);
    }
}
