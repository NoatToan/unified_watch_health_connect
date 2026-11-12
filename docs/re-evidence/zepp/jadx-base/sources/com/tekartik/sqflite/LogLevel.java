package com.tekartik.sqflite;

import io.flutter.plugin.common.MethodCall;

/* JADX INFO: loaded from: classes18.dex */
public class LogLevel {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    public static Integer a(MethodCall methodCall) {
        return (Integer) methodCall.argument(Constant.e);
    }

    public static boolean b(int i) {
        return i >= 1;
    }

    public static boolean c(int i) {
        return i >= 2;
    }
}
