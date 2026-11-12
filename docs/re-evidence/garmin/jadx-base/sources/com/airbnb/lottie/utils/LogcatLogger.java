package com.airbnb.lottie.utils;

import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieLogger;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class LogcatLogger implements LottieLogger {
    private static final Set<String> loggedMessages = new HashSet();

    @Override // com.airbnb.lottie.LottieLogger
    public void debug(String str) {
        debug(str, null);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void error(String str, Throwable th3) {
        boolean z14 = L.DBG;
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void warning(String str, Throwable th3) {
        Set<String> set = loggedMessages;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void debug(String str, Throwable th3) {
        boolean z14 = L.DBG;
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void warning(String str) {
        warning(str, null);
    }
}
