package b5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lb5/t;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15887b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15888c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15889d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15890e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f15891f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f15892g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f15893h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f15894i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f15895j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f15896k = 9;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f15897l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f15898m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f15899n = 12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15900a;

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f15900a == ((t) obj).f15900a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15900a);
    }

    public final String toString() {
        int i14 = f15888c;
        int i15 = this.f15900a;
        if (i15 == i14) {
            return "Press";
        }
        if (i15 == f15889d) {
            return "Release";
        }
        if (i15 == f15890e) {
            return "Move";
        }
        if (i15 == f15891f) {
            return "Enter";
        }
        if (i15 == f15892g) {
            return "Exit";
        }
        if (i15 == f15893h) {
            return "Scroll";
        }
        if (i15 == f15894i) {
            return "ScaleStart";
        }
        if (i15 == f15895j) {
            return "ScaleChange";
        }
        if (i15 == f15896k) {
            return "ScaleFinish";
        }
        if (i15 == f15897l) {
            return "PanStart";
        }
        if (i15 == f15898m) {
            return "Pan";
        }
        return i15 == f15899n ? "PanEnd" : "Unknown";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb5/t$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
