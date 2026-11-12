package q5;

import o13.z;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f142828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f142829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f142830c;

    static {
        z.a aVar = z.f128618b;
        f142828a = (((long) 1023) << 50) ^ (-1);
        f142829b = (-1) ^ (((long) 33554431) << 25);
        long j8 = 33554431;
        f142830c = j8 | (((long) Math.min(0, 1023)) << 50) | (j8 << 25);
    }
}
