package x5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lx5/p;", "", "a", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f188918b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f188919c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f188920d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f188921e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f188922f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f188923g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f188924h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f188925i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f188926j = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188927a;

    private /* synthetic */ p(int i14) {
        this.f188927a = i14;
    }

    public static final /* synthetic */ p a(int i14) {
        return new p(i14);
    }

    public static String b(int i14) {
        if (i14 == f188919c) {
            return "Unspecified";
        }
        if (i14 == 0) {
            return "None";
        }
        if (i14 == f188920d) {
            return "Default";
        }
        if (i14 == f188921e) {
            return "Go";
        }
        if (i14 == f188922f) {
            return "Search";
        }
        if (i14 == f188923g) {
            return "Send";
        }
        if (i14 == f188924h) {
            return "Previous";
        }
        if (i14 == f188925i) {
            return "Next";
        }
        return i14 == f188926j ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f188927a == ((p) obj).f188927a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f188927a);
    }

    public final String toString() {
        return b(this.f188927a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx5/p$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static int a() {
            return p.f188926j;
        }

        public static int b() {
            return p.f188925i;
        }

        private a() {
        }
    }
}
