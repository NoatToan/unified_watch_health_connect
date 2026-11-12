package a5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"La5/j;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1233b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1234c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1235d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f1236e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f1237f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f1238g = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1239a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f1239a == ((j) obj).f1239a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1239a);
    }

    public final String toString() {
        int i14 = f1234c;
        int i15 = this.f1239a;
        if (i15 == i14) {
            return "UserInput";
        }
        if (i15 == f1235d) {
            return "SideEffect";
        }
        return i15 == f1238g ? "Relocate" : "Invalid";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La5/j$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
