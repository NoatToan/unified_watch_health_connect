package f2;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import f5.v1;
import g2.t0;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lf2/a0;", "Lf2/m;", "Lg2/t0;", "", FirebaseAnalytics.Param.INDEX, "", Action.KEY_ATTRIBUTE, "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "Lg6/o;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Lf5/v1;", "placeables", "Lg6/k;", "visualOffset", "contentType", "Lg2/b0;", "animator", "Lg6/a;", "constraints", "lane", TtmlNode.TAG_SPAN, "<init>", "(ILjava/lang/Object;ZIIZLg6/o;IILjava/util/List;JLjava/lang/Object;Lg2/b0;JIILkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0 implements m, t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f68149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f68150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f68151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f68152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g6.o f68153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f68154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f68155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<v1> f68156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f68157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f68158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g2.b0<a0> f68159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f68160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f68161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f68162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f68163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f68164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f68165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f68166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f68167t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f68168u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f68169v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f68170w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f68171x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f68172y;

    /* JADX WARN: Multi-variable type inference failed */
    private a0(int i14, Object obj, boolean z14, int i15, int i16, boolean z15, g6.o oVar, int i17, int i18, List<? extends v1> list, long j8, Object obj2, g2.b0<a0> b0Var, long j14, int i19, int i24) {
        long j15;
        this.f68148a = i14;
        this.f68149b = obj;
        this.f68150c = z14;
        this.f68151d = i15;
        this.f68152e = z15;
        this.f68153f = oVar;
        this.f68154g = i17;
        this.f68155h = i18;
        this.f68156i = list;
        this.f68157j = j8;
        this.f68158k = obj2;
        this.f68159l = b0Var;
        this.f68160m = j14;
        this.f68161n = i19;
        this.f68162o = i24;
        this.f68165r = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i25 = 0; i25 < size; i25++) {
            v1 v1Var = (v1) list.get(i25);
            iMax = Math.max(iMax, this.f68150c ? v1Var.f69145b : v1Var.f69144a);
        }
        this.f68163p = iMax;
        int i26 = i16 + iMax;
        this.f68164q = i26 >= 0 ? i26 : 0;
        boolean z16 = this.f68150c;
        int i27 = this.f68151d;
        if (z16) {
            j15 = (((long) i27) << 32) | (((long) iMax) & 4294967295L);
            g6.m.a aVar = g6.m.f76012b;
        } else {
            j15 = (((long) i27) & 4294967295L) | (((long) iMax) << 32);
            g6.m.a aVar2 = g6.m.f76012b;
        }
        this.f68168u = j15;
        g6.k.f76003b.getClass();
        this.f68169v = 0L;
        this.f68170w = -1;
        this.f68171x = -1;
    }

    @Override // f2.m
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF68168u() {
        return this.f68168u;
    }

    @Override // g2.t0
    public final int b() {
        return this.f68156i.size();
    }

    @Override // g2.t0
    public final void c(int i14, int i15, int i16, int i17) {
        r(i14, i15, i16, i17, -1, -1);
    }

    @Override // f2.m
    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getF68169v() {
        return this.f68169v;
    }

    @Override // g2.t0
    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getF68172y() {
        return this.f68172y;
    }

    @Override // g2.t0
    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getF68160m() {
        return this.f68160m;
    }

    @Override // g2.t0
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF68150c() {
        return this.f68150c;
    }

    @Override // f2.m, g2.t0
    /* JADX INFO: renamed from: getIndex, reason: from getter */
    public final int getF68148a() {
        return this.f68148a;
    }

    @Override // f2.m, g2.t0
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final Object getF68149b() {
        return this.f68149b;
    }

    @Override // f2.m
    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getF68171x() {
        return this.f68171x;
    }

    @Override // g2.t0
    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getF68164q() {
        return this.f68164q;
    }

    @Override // g2.t0
    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getF68161n() {
        return this.f68161n;
    }

    @Override // g2.t0
    public final void k() {
        this.f68172y = true;
    }

    @Override // g2.t0
    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getF68162o() {
        return this.f68162o;
    }

    @Override // f2.m
    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getF68170w() {
        return this.f68170w;
    }

    @Override // g2.t0
    public final Object n(int i14) {
        return this.f68156i.get(i14).getF81969t();
    }

    @Override // g2.t0
    public final long o(int i14) {
        return this.f68169v;
    }

    public final int p(long j8) {
        long j14;
        if (this.f68150c) {
            g6.k.a aVar = g6.k.f76003b;
            j14 = j8 & 4294967295L;
        } else {
            g6.k.a aVar2 = g6.k.f76003b;
            j14 = j8 >> 32;
        }
        return (int) j14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(v1.a aVar, boolean z14) {
        int i14;
        int i15;
        if (this.f68165r == Integer.MIN_VALUE) {
            b2.e.a("position() should be called first");
        }
        List<v1> list = this.f68156i;
        int size = list.size();
        int i16 = 0;
        while (i16 < size) {
            v1 v1Var = list.get(i16);
            int i17 = this.f68166s;
            boolean z15 = this.f68150c;
            int i18 = i17 - (z15 ? v1Var.f69145b : v1Var.f69144a);
            int i19 = this.f68167t;
            long j8 = this.f68169v;
            g2.v vVarA = this.f68159l.a(i16, this.f68149b);
            r4.c cVar = null;
            if (vVarA != null) {
                if (z14) {
                    vVarA.f75269r = j8;
                } else {
                    long j14 = vVarA.f75269r;
                    g2.v.f75250s.getClass();
                    long jE = g6.k.e(!g6.k.c(j14, g2.v.f75251t) ? vVarA.f75269r : j8, ((g6.k) vVarA.f75268q.getF182175a()).f76005a);
                    if (((p(j8) <= i18 && p(jE) <= i18) || (p(j8) >= i19 && p(jE) >= i19)) && ((Boolean) vVarA.f75259h.getF182175a()).booleanValue()) {
                        ge1.b.T(vVarA.f75252a, null, null, new g2.z(vVarA, null), 3);
                    }
                    j8 = jE;
                }
                cVar = vVarA.f75265n;
            } else {
                list = list;
                size = size;
            }
            if (this.f68152e) {
                g6.k.a aVar2 = g6.k.f76003b;
                if (z15) {
                    i14 = (int) (j8 >> 32);
                } else {
                    i14 = (this.f68165r - ((int) (j8 >> 32))) - (z15 ? v1Var.f69145b : v1Var.f69144a);
                }
                if (z15) {
                    i15 = (this.f68165r - ((int) (j8 & 4294967295L))) - (z15 ? v1Var.f69145b : v1Var.f69144a);
                } else {
                    i15 = (int) (j8 & 4294967295L);
                }
                j8 = (((long) i14) << 32) | (((long) i15) & 4294967295L);
            }
            long jE2 = g6.k.e(j8, this.f68157j);
            if (!z14 && vVarA != null) {
                vVarA.f75264m = jE2;
            }
            if (z15) {
                if (cVar != null) {
                    aVar.getClass();
                    v1.a.e(aVar, v1Var);
                    v1Var.z0(g6.k.e(jE2, v1Var.f69148e), 0.0f, cVar);
                } else {
                    v1.a.O(aVar, v1Var, jE2);
                }
            } else if (cVar != null) {
                v1.a.G(aVar, v1Var, jE2, cVar);
            } else {
                v1.a.F(aVar, v1Var, jE2);
            }
            i16++;
            list = list;
            size = size;
        }
    }

    public final void r(int i14, int i15, int i16, int i17, int i18, int i19) {
        long j8;
        boolean z14 = this.f68150c;
        int i24 = z14 ? i17 : i16;
        this.f68165r = i24;
        if (!z14) {
            i16 = i17;
        }
        if (z14 && this.f68153f == g6.o.Rtl) {
            i15 = (i16 - i15) - this.f68151d;
        }
        if (z14) {
            j8 = (((long) i14) & 4294967295L) | (((long) i15) << 32);
            g6.k.a aVar = g6.k.f76003b;
        } else {
            j8 = (((long) i15) & 4294967295L) | (((long) i14) << 32);
            g6.k.a aVar2 = g6.k.f76003b;
        }
        this.f68169v = j8;
        this.f68170w = i18;
        this.f68171x = i19;
        this.f68166s = -this.f68154g;
        this.f68167t = i24 + this.f68155h;
    }

    public /* synthetic */ a0(int i14, Object obj, boolean z14, int i15, int i16, boolean z15, g6.o oVar, int i17, int i18, List list, long j8, Object obj2, g2.b0 b0Var, long j14, int i19, int i24, p005kotlin.jvm.internal.j jVar) {
        this(i14, obj, z14, i15, i16, z15, oVar, i17, i18, list, j8, obj2, b0Var, j14, i19, i24);
    }
}
