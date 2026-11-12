package com.google.android.exoplayer2;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q0 {
    public static int a(int formatSupport) {
        return b(formatSupport, 0, 0);
    }

    @SuppressLint({"WrongConstant"})
    public static int b(int formatSupport, int adaptiveSupport, int tunnelingSupport) {
        return formatSupport | adaptiveSupport | tunnelingSupport;
    }

    @SuppressLint({"WrongConstant"})
    public static int c(int supportFlags) {
        return supportFlags & 24;
    }

    @SuppressLint({"WrongConstant"})
    public static int d(int supportFlags) {
        return supportFlags & 7;
    }

    @SuppressLint({"WrongConstant"})
    public static int e(int supportFlags) {
        return supportFlags & 32;
    }
}
