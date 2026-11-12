package o3;

import g6.f;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.u;
import p13.x;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lo3/a;", "", "a", "value", "", "material3-window-size-class"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2468a f128743b = new C2468a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f128744c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f128745d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<a> f128746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<a> f128747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set<a> f128748g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f128749a;

    static {
        int i14 = 1;
        int i15 = 2;
        int i16 = 0;
        f128746e = u.m0(new a[]{new a(i16), new a(i14), new a(i15)});
        List<a> listK = x.k(new a(i15), new a(i14), new a(i16));
        f128747f = listK;
        f128748g = h0.g1(listK);
    }

    private /* synthetic */ a(int i14) {
        this.f128749a = i14;
    }

    public static final /* synthetic */ a a(int i14) {
        return new a(i14);
    }

    public static String b(int i14) {
        String str;
        StringBuilder sb3 = new StringBuilder("WindowHeightSizeClass.");
        if (i14 == 0) {
            str = "Compact";
        } else if (i14 == f128744c) {
            str = "Medium";
        } else {
            str = i14 == f128745d ? "Expanded" : "";
        }
        sb3.append(str);
        return sb3.toString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        int i14 = aVar.f128749a;
        f128743b.getClass();
        return f.b(C2468a.a(this.f128749a), C2468a.a(i14));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f128749a == ((a) obj).f128749a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128749a);
    }

    public final String toString() {
        return b(this.f128749a);
    }

    /* JADX INFO: renamed from: o3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo3/a$a;", "", "<init>", "()V", "material3-window-size-class"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2468a {
        public /* synthetic */ C2468a(j jVar) {
            this();
        }

        public static float a(int i14) {
            if (i14 == a.f128745d) {
                float f14 = 900;
                f.a aVar = f.f75994b;
                return f14;
            }
            if (i14 == a.f128744c) {
                float f15 = 480;
                f.a aVar2 = f.f75994b;
                return f15;
            }
            float f16 = 0;
            f.a aVar3 = f.f75994b;
            return f16;
        }

        private C2468a() {
        }
    }
}
