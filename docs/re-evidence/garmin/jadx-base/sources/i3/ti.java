package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Li3/ti;", "", "a", "value", "", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ti {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f89828b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f89829c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f89830d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f89831e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f89832f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f89833g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f89834h = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89835a;

    public final boolean equals(Object obj) {
        if (obj instanceof ti) {
            return this.f89835a == ((ti) obj).f89835a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89835a);
    }

    public final String toString() {
        int i14 = f89829c;
        int i15 = this.f89835a;
        if (i15 == i14) {
            return "Above";
        }
        if (i15 == f89830d) {
            return "Below";
        }
        if (i15 == f89831e) {
            return "Left";
        }
        if (i15 == f89832f) {
            return "Right";
        }
        if (i15 == f89833g) {
            return "Start";
        }
        return i15 == f89834h ? "End" : "Invalid";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/ti$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
