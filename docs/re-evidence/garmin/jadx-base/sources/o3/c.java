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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lo3/c;", "", "a", "value", "", "material3-window-size-class"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements Comparable<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f128753b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f128754c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f128755d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<c> f128756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<c> f128757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set<c> f128758g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f128759a;

    static {
        int i14 = 1;
        int i15 = 2;
        int i16 = 0;
        f128756e = u.m0(new c[]{new c(i16), new c(i14), new c(i15)});
        List<c> listK = x.k(new c(i15), new c(i14), new c(i16));
        f128757f = listK;
        f128758g = h0.g1(listK);
    }

    private /* synthetic */ c(int i14) {
        this.f128759a = i14;
    }

    public static final /* synthetic */ c a(int i14) {
        return new c(i14);
    }

    public static String b(int i14) {
        String str;
        StringBuilder sb3 = new StringBuilder("WindowWidthSizeClass.");
        if (i14 == 0) {
            str = "Compact";
        } else if (i14 == f128754c) {
            str = "Medium";
        } else {
            str = i14 == f128755d ? "Expanded" : "";
        }
        sb3.append(str);
        return sb3.toString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        int i14 = cVar.f128759a;
        f128753b.getClass();
        return f.b(a.a(this.f128759a), a.a(i14));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f128759a == ((c) obj).f128759a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128759a);
    }

    public final String toString() {
        return b(this.f128759a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo3/c$a;", "", "<init>", "()V", "material3-window-size-class"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static float a(int i14) {
            if (i14 == c.f128755d) {
                float f14 = 840;
                f.a aVar = f.f75994b;
                return f14;
            }
            if (i14 == c.f128754c) {
                float f15 = 600;
                f.a aVar2 = f.f75994b;
                return f15;
            }
            float f16 = 0;
            f.a aVar3 = f.f75994b;
            return f16;
        }

        private a() {
        }
    }
}
