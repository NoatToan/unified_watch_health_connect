package com.airbnb.lottie.utils;

import com.airbnb.lottie.LottieLogger;

/* JADX INFO: loaded from: classes2.dex */
public class Logger {
    private static LottieLogger a = new LogcatLogger();

    public static void debug(String str) {
        a.debug(str);
    }

    public static void error(String str, Throwable th) {
        a.error(str, th);
    }

    public static void setInstance(LottieLogger lottieLogger) {
        a = lottieLogger;
    }

    public static void warning(String str) {
        a.warning(str);
    }

    public static void debug(String str, Throwable th) {
        a.debug(str, th);
    }

    public static void warning(String str, Throwable th) {
        a.warning(str, th);
    }
}
