package m4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lm4/g;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f116466b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f116467c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f116468d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f116469e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f116470f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f116471g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f116472h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f116473i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f116474j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116475a;

    private /* synthetic */ g(int i14) {
        this.f116475a = i14;
    }

    public static final /* synthetic */ g a(int i14) {
        return new g(i14);
    }

    public static String b(int i14) {
        if (i14 == f116467c) {
            return "Next";
        }
        if (i14 == f116468d) {
            return "Previous";
        }
        if (i14 == f116469e) {
            return "Left";
        }
        if (i14 == f116470f) {
            return "Right";
        }
        if (i14 == f116471g) {
            return "Up";
        }
        if (i14 == f116472h) {
            return "Down";
        }
        if (i14 == f116473i) {
            return "Enter";
        }
        return i14 == f116474j ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f116475a == ((g) obj).f116475a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116475a);
    }

    public final String toString() {
        return b(this.f116475a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm4/g$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
