package g6;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lg6/m;", "", "a", "packedValue", "", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f76012b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76013a;

    private /* synthetic */ m(long j8) {
        this.f76013a = j8;
    }

    public static final /* synthetic */ m a(long j8) {
        return new m(j8);
    }

    public static boolean b(long j8, Object obj) {
        return (obj instanceof m) && j8 == ((m) obj).f76013a;
    }

    public static final boolean c(long j8, long j14) {
        return j8 == j14;
    }

    public static String d(long j8) {
        return ((int) (j8 >> 32)) + " x " + ((int) (j8 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return b(this.f76013a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f76013a);
    }

    public final String toString() {
        return d(this.f76013a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg6/m$a;", "", "<init>", "()V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
