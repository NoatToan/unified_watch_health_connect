package com.huawei.secure.android.common.detect;

import com.huawei.hihealth.dictionary.model.HealthDataStatPolicy;
import com.huawei.secure.android.common.detect.utils.c;

/* JADX INFO: loaded from: classes15.dex */
public final class SD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22757a = "aegissec";

    static {
        try {
            System.loadLibrary(f22757a);
        } catch (UnsatisfiedLinkError unused) {
            c.b(HealthDataStatPolicy.SD, "load so UnsatisfiedLinkError");
        } catch (Throwable th) {
            c.b(HealthDataStatPolicy.SD, "load so throwable : " + th.getMessage());
        }
    }

    private SD() {
    }

    public static native boolean idj();

    public static native boolean iej();

    public static native boolean irpj();

    public static native boolean irtj();
}
