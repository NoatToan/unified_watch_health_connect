package s5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ls5/z;", "", "a", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f157329b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f157330c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f157331d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f157332e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f157333f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f157334g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f157335h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f157336i = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f157337a;

    public static String a(int i14) {
        if (i14 == f157330c) {
            return "AboveBaseline";
        }
        if (i14 == f157331d) {
            return "Top";
        }
        if (i14 == f157332e) {
            return "Bottom";
        }
        if (i14 == f157333f) {
            return "Center";
        }
        if (i14 == f157334g) {
            return "TextTop";
        }
        if (i14 == f157335h) {
            return "TextBottom";
        }
        return i14 == f157336i ? "TextCenter" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f157337a == ((z) obj).f157337a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157337a);
    }

    public final String toString() {
        return a(this.f157337a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls5/z$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
