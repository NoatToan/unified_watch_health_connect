package x5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lx5/v;", "", "a", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f188954b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f188955c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f188956d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f188957e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f188958f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f188959g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f188960h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f188961i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f188962j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f188963k = 9;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188964a;

    private /* synthetic */ v(int i14) {
        this.f188964a = i14;
    }

    public static final /* synthetic */ v a(int i14) {
        return new v(i14);
    }

    public static String b(int i14) {
        if (i14 == 0) {
            return "Unspecified";
        }
        if (i14 == f188955c) {
            return "Text";
        }
        if (i14 == f188956d) {
            return "Ascii";
        }
        if (i14 == f188957e) {
            return "Number";
        }
        if (i14 == f188958f) {
            return "Phone";
        }
        if (i14 == f188959g) {
            return "Uri";
        }
        if (i14 == f188960h) {
            return "Email";
        }
        if (i14 == f188961i) {
            return "Password";
        }
        if (i14 == f188962j) {
            return "NumberPassword";
        }
        return i14 == f188963k ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f188964a == ((v) obj).f188964a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f188964a);
    }

    public final String toString() {
        return b(this.f188964a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx5/v$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static int a() {
            return v.f188958f;
        }

        private a() {
        }
    }
}
