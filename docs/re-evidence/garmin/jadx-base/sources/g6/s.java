package g6;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lg6/s;", "", "a", "packedValue", "", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f76026b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76027a;

    private /* synthetic */ s(long j8) {
        this.f76027a = j8;
    }

    public static final /* synthetic */ s a(long j8) {
        return new s(j8);
    }

    public static long b(float f14, float f15, long j8, int i14) {
        if ((i14 & 1) != 0) {
            f14 = Float.intBitsToFloat((int) (j8 >> 32));
        }
        if ((i14 & 2) != 0) {
            f15 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
    }

    public static final float c(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float d(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static final long e(long j8, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) - Float.intBitsToFloat((int) (j14 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) - Float.intBitsToFloat((int) (j14 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long f(long j8, long j14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat((int) (j8 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat((int) (j8 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long g(float f14, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) * f14;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)) * f14)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String h(long j8) {
        return "(" + c(j8) + ", " + d(j8) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f76027a == ((s) obj).f76027a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f76027a);
    }

    public final String toString() {
        return h(this.f76027a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg6/s$a;", "", "<init>", "()V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
