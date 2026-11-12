package com.facebook.jni;

import com.facebook.soloader.SoLoader;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class CpuCapabilitiesJni {
    static {
        SoLoader.q("fb");
    }

    @v07
    public static native boolean nativeDeviceSupportsNeon();

    @v07
    public static native boolean nativeDeviceSupportsVFPFP16();

    @v07
    public static native boolean nativeDeviceSupportsX86();
}
