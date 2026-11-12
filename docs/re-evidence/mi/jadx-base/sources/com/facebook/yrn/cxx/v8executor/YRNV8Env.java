package com.facebook.yrn.cxx.v8executor;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import defpackage.v07;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class YRNV8Env {

    @v07
    private final HybridData mHybridData = initHybrid();

    static {
        SoLoader.q("yrnv8executor");
    }

    public YRNV8Env() {
        initV8Isolate(getTimezoneId());
    }

    private String getTimezoneId() {
        return TimeZone.getDefault().getID();
    }

    private static native HybridData initHybrid();

    private native void initV8Isolate(String str);

    public void destroy() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.a();
        }
    }
}
