package com.airbnb.lottie;

/* JADX INFO: loaded from: classes7.dex */
public interface LottieLogger {
    void debug(String str);

    void debug(String str, Throwable th3);

    void error(String str, Throwable th3);

    void warning(String str);

    void warning(String str, Throwable th3);
}
