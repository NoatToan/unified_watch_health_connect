package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseParser {
    public static final int ResponseActionDiscard = 0;
    public static final int ResponseActionRetry = 1;

    public static int parse(int i14) {
        if (i14 < 200 || i14 > 299) {
            return ((i14 < 300 || i14 > 399) && i14 >= 400 && i14 <= 499) ? 0 : 1;
        }
        return 0;
    }
}
