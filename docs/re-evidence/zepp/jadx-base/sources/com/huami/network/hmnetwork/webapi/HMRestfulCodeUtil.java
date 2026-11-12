package com.huami.network.hmnetwork.webapi;

/* JADX INFO: loaded from: classes6.dex */
public class HMRestfulCodeUtil {
    private static final int a = 401;
    private static final int b = 409;

    public static boolean isAuthInvalid(int i) {
        return 401 == i;
    }

    public static boolean isConflict(int i) {
        return 409 == i;
    }
}
