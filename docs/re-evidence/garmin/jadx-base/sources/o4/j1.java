package o4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lo4/j1;", "", "a", "value", "", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f128873b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f128874c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f128875d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f128876e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f128877f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f128878a;

    public final boolean equals(Object obj) {
        if (obj instanceof j1) {
            return this.f128878a == ((j1) obj).f128878a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128878a);
    }

    public final String toString() {
        int i14 = this.f128878a;
        if (i14 == 0) {
            return "Difference";
        }
        if (i14 == f128874c) {
            return "Intersect";
        }
        if (i14 == f128875d) {
            return "Union";
        }
        if (i14 == f128876e) {
            return "Xor";
        }
        return i14 == f128877f ? "ReverseDifference" : "Unknown";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/j1$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
