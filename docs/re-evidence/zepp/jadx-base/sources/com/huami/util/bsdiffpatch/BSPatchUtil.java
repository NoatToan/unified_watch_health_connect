package com.huami.util.bsdiffpatch;

/* JADX INFO: loaded from: classes15.dex */
public class BSPatchUtil {
    static {
        System.loadLibrary("bsdiffpatch");
    }

    public static native int bspatch(String str, String str2, String str3);
}
