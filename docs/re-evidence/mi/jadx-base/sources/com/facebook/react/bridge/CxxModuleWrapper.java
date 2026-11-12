package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class CxxModuleWrapper extends CxxModuleWrapperBase {
    public CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        SoLoader.q(str);
        return makeDsoNative(SoLoader.y(str).getAbsolutePath(), str2);
    }

    private static native CxxModuleWrapper makeDsoNative(String str, String str2);
}
