package com.huami.quicklz;

/* JADX INFO: loaded from: classes12.dex */
public class QuickLz {
    static {
        System.loadLibrary("quicklz");
    }

    public native int compress(String str, String str2);

    public native int decompress(String str, String str2);
}
