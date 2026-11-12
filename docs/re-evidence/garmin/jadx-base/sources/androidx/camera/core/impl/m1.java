package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public interface m1 extends j2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f5632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f5633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f5634j;

    static {
        Class cls = Integer.TYPE;
        f5632h = x0.a.a(cls, "camerax.core.imageInput.inputFormat");
        f5633i = x0.a.a(cls, "camerax.core.imageInput.secondaryInputFormat");
        f5634j = x0.a.a(b0.b0.class, "camerax.core.imageInput.inputDynamicRange");
    }

    default boolean G() {
        return b(f5634j);
    }

    default int Q() {
        return ((Integer) f(f5633i, 0)).intValue();
    }

    default b0.b0 o() {
        b0.b0 b0Var = (b0.b0) f(f5634j, b0.b0.f13853c);
        b0Var.getClass();
        return b0Var;
    }

    default int z() {
        return ((Integer) e(f5632h)).intValue();
    }
}
