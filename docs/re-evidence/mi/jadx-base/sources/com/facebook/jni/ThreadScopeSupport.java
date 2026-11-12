package com.facebook.jni;

import com.facebook.soloader.SoLoader;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class ThreadScopeSupport {
    static {
        SoLoader.q("fb");
    }

    @v07
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    private static native void runStdFunctionImpl(long j);
}
