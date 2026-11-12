package b5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lb5/m0;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15849b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15850c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15851d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15852e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f15853f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15854a;

    private /* synthetic */ m0(int i14) {
        this.f15854a = i14;
    }

    public static final /* synthetic */ m0 a(int i14) {
        return new m0(i14);
    }

    public static String b(int i14) {
        if (i14 == 1) {
            return "Touch";
        }
        if (i14 == 2) {
            return "Mouse";
        }
        if (i14 != 3) {
            return i14 != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            return this.f15854a == ((m0) obj).f15854a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15854a);
    }

    public final String toString() {
        return b(this.f15854a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb5/m0$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
