package p5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lp5/l;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f136032b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f136033c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f136034d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f136035e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f136036f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f136037g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f136038h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f136039i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f136040j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136041a;

    private /* synthetic */ l(int i14) {
        this.f136041a = i14;
    }

    public static final /* synthetic */ l a(int i14) {
        return new l(i14);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f136041a == ((l) obj).f136041a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f136041a);
    }

    public final String toString() {
        int i14 = this.f136041a;
        if (i14 == 0) {
            return "Button";
        }
        if (i14 == f136033c) {
            return "Checkbox";
        }
        if (i14 == f136034d) {
            return "Switch";
        }
        if (i14 == f136035e) {
            return "RadioButton";
        }
        if (i14 == f136036f) {
            return "Tab";
        }
        if (i14 == f136037g) {
            return "Image";
        }
        if (i14 == f136038h) {
            return "DropdownList";
        }
        if (i14 == f136039i) {
            return "Picker";
        }
        return i14 == f136040j ? "Carousel" : "Unknown";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp5/l$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
