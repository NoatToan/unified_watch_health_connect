package z2;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1.o f201559a = new s1.o(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1.d2 f201560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f201561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s1.j1<n4.c> f201562d;

    static {
        yq.d dVar = new yq.d(17);
        yq.d dVar2 = new yq.d(18);
        s1.d2 d2Var = s1.e2.f155568a;
        f201560b = new s1.d2(dVar, dVar2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        f201561c = jFloatToRawIntBits;
        f201562d = new s1.j1<>(0.0f, 0.0f, n4.c.a(jFloatToRawIntBits), 3, null);
    }
}
