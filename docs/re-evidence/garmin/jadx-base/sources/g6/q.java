package g6;

import o53.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lg6/q;", "", "a", "packedValue", "", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f76018b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r[] f76019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f76020d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76021a;

    static {
        r.a aVar = r.f76022b;
        aVar.getClass();
        r rVarA = r.a(0L);
        aVar.getClass();
        r rVarA2 = r.a(r.f76023c);
        aVar.getClass();
        f76019c = new r[]{rVarA, rVarA2, r.a(r.f76024d)};
        f76020d = f0.H(Float.NaN, 0L);
    }

    private /* synthetic */ q(long j8) {
        this.f76021a = j8;
    }

    public static final /* synthetic */ q a(long j8) {
        return new q(j8);
    }

    public static final boolean b(long j8, long j14) {
        return j8 == j14;
    }

    public static final long c(long j8) {
        return f76019c[(int) ((j8 & 1095216660480L) >>> 32)].f76025a;
    }

    public static final float d(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static final boolean e(long j8) {
        return (j8 & 1095216660480L) == 8589934592L;
    }

    public static String f(long j8) {
        long jC = c(j8);
        r.a aVar = r.f76022b;
        aVar.getClass();
        if (r.b(jC, 0L)) {
            return "Unspecified";
        }
        aVar.getClass();
        if (r.b(jC, r.f76023c)) {
            return d(j8) + ".sp";
        }
        aVar.getClass();
        if (!r.b(jC, r.f76024d)) {
            return "Invalid";
        }
        return d(j8) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f76021a == ((q) obj).f76021a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f76021a);
    }

    public final String toString() {
        return f(this.f76021a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg6/q$a;", "", "<init>", "()V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
