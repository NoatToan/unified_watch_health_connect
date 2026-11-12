package com.facebook.jni;

import com.facebook.soloader.SoLoader;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class Countable {

    @v07
    private long mInstance = 0;

    static {
        SoLoader.q("fb");
    }

    public native void dispose();

    public void finalize() throws Throwable {
        dispose();
        super.finalize();
    }
}
