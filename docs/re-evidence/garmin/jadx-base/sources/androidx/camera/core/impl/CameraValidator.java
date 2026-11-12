package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class CameraValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0.t f5463a;

    public static class CameraIdListIncorrectException extends Exception {
        private final int mAvailableCameraCount;

        public CameraIdListIncorrectException(String str, int i14, Throwable th3) {
            super(str, th3);
            this.mAvailableCameraCount = i14;
        }

        public int getAvailableCameraCount() {
            return this.mAvailableCameraCount;
        }
    }

    public static class a {
        private a() {
        }

        public static int a(Context context) {
            return context.getDeviceId();
        }
    }

    static {
        b0.t.a aVar = new b0.t.a();
        aVar.a(2);
        f5463a = new b0.t(aVar.f14052a, null);
    }

    private CameraValidator() {
    }

    public static void a(Context context, r0 r0Var, b0.t tVar) throws CameraIdListIncorrectException {
        Integer numB;
        if (Build.VERSION.SDK_INT >= 34 && a.a(context) != 0) {
            LinkedHashSet<l0> linkedHashSetC = r0Var.c();
            a.a(context);
            linkedHashSetC.size();
            return;
        }
        IllegalArgumentException e4 = null;
        if (tVar != null) {
            try {
                numB = tVar.b();
                if (numB == null) {
                    return;
                }
            } catch (IllegalStateException unused) {
                return;
            }
        } else {
            numB = null;
        }
        String str = Build.DEVICE;
        PackageManager packageManager = context.getPackageManager();
        int i14 = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (tVar == null || numB.intValue() == 1)) {
                b0.t.f14049d.c(r0Var.c());
                i14 = 1;
            }
        } catch (IllegalArgumentException e14) {
            e4 = e14;
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (tVar == null || numB.intValue() == 0)) {
                b0.t.f14048c.c(r0Var.c());
                i14++;
            }
        } catch (IllegalArgumentException e15) {
            e4 = e15;
        }
        try {
            f5463a.c(r0Var.c());
            i14++;
        } catch (IllegalArgumentException unused2) {
        }
        if (e4 == null) {
            return;
        }
        r0Var.c().toString();
        throw new CameraIdListIncorrectException("Expected camera missing from device.", i14, e4);
    }
}
