package d6;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ld6/j;", "", "a", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f57765b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57766c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f57767d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f57768e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f57769f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f57770g = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57771a;

    private /* synthetic */ j(int i14) {
        this.f57771a = i14;
    }

    public static final /* synthetic */ j a(int i14) {
        return new j(i14);
    }

    public static String b(int i14) {
        if (i14 == f57766c) {
            return "Ltr";
        }
        if (i14 == f57767d) {
            return "Rtl";
        }
        if (i14 == f57768e) {
            return "Content";
        }
        if (i14 == f57769f) {
            return "ContentOrLtr";
        }
        if (i14 == f57770g) {
            return "ContentOrRtl";
        }
        return i14 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f57771a == ((j) obj).f57771a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57771a);
    }

    public final String toString() {
        return b(this.f57771a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/j$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
