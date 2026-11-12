package p008y1;

import g6.f;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f193423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f193424b;

    static {
        f.a aVar = f.f75994b;
        f193423a = 6;
        f193424b = 1;
    }

    public static final boolean a(float f14) {
        return Float.isNaN(f14) || Math.abs(f14) < 0.5f;
    }
}
