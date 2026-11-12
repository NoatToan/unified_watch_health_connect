package z2;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f201841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f201842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p5.j0<w0> f201843c;

    static {
        float f14 = 25;
        g6.f.a aVar = g6.f.f75994b;
        f201841a = f14;
        f201842b = f14;
        f201843c = new p5.j0<>("SelectionHandleInfo", (e23.p) null, 2, (p005kotlin.jvm.internal.j) null);
    }

    public static final long a(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }
}
