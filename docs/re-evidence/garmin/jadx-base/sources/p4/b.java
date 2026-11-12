package p4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lp4/b;", "", "a", "packedValue", "", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f135535b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f135536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f135537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f135538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f135539f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f135540a;

    static {
        long j8 = 3;
        long j14 = j8 << 32;
        f135536c = (((long) 0) & 4294967295L) | j14;
        f135537d = (((long) 1) & 4294967295L) | j14;
        f135538e = j14 | (((long) 2) & 4294967295L);
        f135539f = (j8 & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j8, long j14) {
        return j8 == j14;
    }

    public static String b(long j8) {
        if (a(j8, f135536c)) {
            return "Rgb";
        }
        if (a(j8, f135537d)) {
            return "Xyz";
        }
        if (a(j8, f135538e)) {
            return "Lab";
        }
        return a(j8, f135539f) ? "Cmyk" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f135540a == ((b) obj).f135540a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f135540a);
    }

    public final String toString() {
        return b(this.f135540a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp4/b$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
