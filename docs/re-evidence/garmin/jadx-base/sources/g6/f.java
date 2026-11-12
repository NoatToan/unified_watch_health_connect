package g6;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lg6/f;", "", "a", "value", "", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements Comparable<f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f75994b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f75995c = Float.POSITIVE_INFINITY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f75996d = Float.NaN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f75997a;

    private /* synthetic */ f(float f14) {
        this.f75997a = f14;
    }

    public static final /* synthetic */ f a(float f14) {
        return new f(f14);
    }

    public static int b(float f14, float f15) {
        if (Float.isNaN(f14) || Float.isNaN(f15)) {
            return 0;
        }
        return Float.compare(f14, f15);
    }

    public static final boolean c(float f14, float f15) {
        return Float.compare(f14, f15) == 0;
    }

    public static String d(float f14) {
        if (Float.isNaN(f14)) {
            return "Dp.Unspecified";
        }
        return f14 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        return b(this.f75997a, fVar.f75997a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f75997a, ((f) obj).f75997a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f75997a);
    }

    public final String toString() {
        return d(this.f75997a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg6/f$a;", "", "<init>", "()V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
