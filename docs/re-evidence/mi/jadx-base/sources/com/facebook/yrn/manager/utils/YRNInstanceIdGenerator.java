package com.facebook.yrn.manager.utils;

/* JADX INFO: loaded from: classes4.dex */
public class YRNInstanceIdGenerator {
    private static int mId;

    public static synchronized int getNextRootViewTag() {
        int i;
        i = mId + 1;
        mId = i;
        return i;
    }
}
