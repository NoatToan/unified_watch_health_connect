package org.tensorflow.lite;

/* JADX INFO: loaded from: classes3.dex */
public final class TensorFlowLite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Throwable f29583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f29584b = false;

    static {
        try {
            System.loadLibrary("tensorflowlite_jni");
            e = null;
        } catch (UnsatisfiedLinkError e) {
            e = e;
        }
        f29583a = e;
    }

    public static void a() {
        if (f29584b) {
            return;
        }
        try {
            nativeRuntimeVersion();
            f29584b = true;
        } catch (UnsatisfiedLinkError e) {
            e = e;
            Throwable th = f29583a;
            if (th != null) {
                e = th;
            }
            throw new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + e);
        }
    }

    public static String b() {
        a();
        return nativeRuntimeVersion();
    }

    private static native String nativeRuntimeVersion();

    private static native String nativeSchemaVersion();
}
