package androidx.camera.core.impl.utils;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceUtil {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5799a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5800b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5801c = 0;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    private SurfaceUtil() {
    }

    public static a a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.f5799a = iArrNativeGetSurfaceInfo[0];
        aVar.f5800b = iArrNativeGetSurfaceInfo[1];
        aVar.f5801c = iArrNativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
