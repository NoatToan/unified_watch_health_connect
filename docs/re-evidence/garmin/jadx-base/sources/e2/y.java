package e2;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import f5.v1;
import g2.t0;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Le2/y;", "Le2/n;", "Lg2/t0;", "", FirebaseAnalytics.Param.INDEX, "", "Lf5/v1;", "placeables", "", "isVertical", "Lh4/d$b;", "horizontalAlignment", "Lh4/d$c;", "verticalAlignment", "Lg6/o;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "Lg6/k;", "visualOffset", "", Action.KEY_ATTRIBUTE, "contentType", "Lg2/b0;", "animator", "Lg6/a;", "constraints", "<init>", "(ILjava/util/List;ZLh4/d$b;Lh4/d$c;Lg6/o;ZIIIJLjava/lang/Object;Ljava/lang/Object;Lg2/b0;JLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y implements n, t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<v1> f62560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f62561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h4.d.b f62562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h4.d.c f62563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g6.o f62564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f62566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f62567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f62568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f62569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f62570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f62571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g2.b0<y> f62572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f62573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f62574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f62575q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f62576r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f62577s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f62578t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f62579u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f62580v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f62581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f62582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f62583y;

    /* JADX WARN: Multi-variable type inference failed */
    private y(int i14, List<? extends v1> list, boolean z14, h4.d.b bVar, h4.d.c cVar, g6.o oVar, boolean z15, int i15, int i16, int i17, long j8, Object obj, Object obj2, g2.b0<y> b0Var, long j14) {
        this.f62559a = i14;
        this.f62560b = list;
        this.f62561c = z14;
        this.f62562d = bVar;
        this.f62563e = cVar;
        this.f62564f = oVar;
        this.f62565g = z15;
        this.f62566h = i15;
        this.f62567i = i16;
        this.f62568j = i17;
        this.f62569k = j8;
        this.f62570l = obj;
        this.f62571m = obj2;
        this.f62572n = b0Var;
        this.f62573o = j14;
        this.f62576r = 1;
        this.f62580v = Integer.MIN_VALUE;
        int size = list.size();
        int i18 = 0;
        int iMax = 0;
        for (int i19 = 0; i19 < size; i19++) {
            v1 v1Var = (v1) list.get(i19);
            boolean z16 = this.f62561c;
            i18 += z16 ? v1Var.f69145b : v1Var.f69144a;
            iMax = Math.max(iMax, !z16 ? v1Var.f69145b : v1Var.f69144a);
        }
        this.f62575q = i18;
        int i24 = i18 + this.f62568j;
        this.f62577s = i24 >= 0 ? i24 : 0;
        this.f62578t = iMax;
        this.f62583y = new int[this.f62560b.size() * 2];
    }

    public final int a(long j8) {
        long j14;
        if (this.f62561c) {
            g6.k.a aVar = g6.k.f76003b;
            j14 = j8 & 4294967295L;
        } else {
            g6.k.a aVar2 = g6.k.f76003b;
            j14 = j8 >> 32;
        }
        return (int) j14;
    }

    @Override // g2.t0
    public final int b() {
        return this.f62560b.size();
    }

    @Override // g2.t0
    public final void c(int i14, int i15, int i16, int i17) {
        h(i14, i16, i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(v1.a aVar, boolean z14) {
        long j8;
        if (this.f62580v == Integer.MIN_VALUE) {
            b2.e.a("position() should be called first");
        }
        List<v1> list = this.f62560b;
        int size = list.size();
        int i14 = 0;
        while (i14 < size) {
            v1 v1Var = list.get(i14);
            int i15 = this.f62581w;
            boolean z15 = this.f62561c;
            int i16 = i15 - (z15 ? v1Var.f69145b : v1Var.f69144a);
            int i17 = this.f62582x;
            long jO = o(i14);
            g2.v vVarA = this.f62572n.a(i14, this.f62570l);
            r4.c cVar = null;
            if (vVarA != null) {
                if (z14) {
                    vVarA.f75269r = jO;
                } else {
                    long j14 = vVarA.f75269r;
                    g2.v.f75250s.getClass();
                    if (!g6.k.c(j14, g2.v.f75251t)) {
                        jO = vVarA.f75269r;
                    }
                    long jE = g6.k.e(jO, ((g6.k) vVarA.f75268q.getF182175a()).f76005a);
                    if (((a(jO) <= i16 && a(jE) <= i16) || (a(jO) >= i17 && a(jE) >= i17)) && ((Boolean) vVarA.f75259h.getF182175a()).booleanValue()) {
                        ge1.b.T(vVarA.f75252a, null, null, new g2.z(vVarA, null), 3);
                    }
                    jO = jE;
                }
                cVar = vVarA.f75265n;
            } else {
                list = list;
                size = size;
            }
            if (this.f62565g) {
                g6.k.a aVar2 = g6.k.f76003b;
                if (z15) {
                    j8 = (4294967295L & ((long) ((this.f62580v - ((int) (jO & 4294967295L))) - (z15 ? v1Var.f69145b : v1Var.f69144a)))) | (((long) ((int) (jO >> 32))) << 32);
                } else {
                    int i18 = (int) (jO & 4294967295L);
                    j8 = (4294967295L & ((long) i18)) | (((long) ((this.f62580v - ((int) (jO >> 32))) - (z15 ? v1Var.f69145b : v1Var.f69144a))) << 32);
                }
                jO = j8;
            }
            long jE2 = g6.k.e(jO, this.f62569k);
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
            i14++;
            list = list;
            size = size;
        }
    }

    @Override // g2.t0
    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getF62579u() {
        return this.f62579u;
    }

    @Override // g2.t0
    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getF62573o() {
        return this.f62573o;
    }

    @Override // g2.t0
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF62561c() {
        return this.f62561c;
    }

    @Override // e2.n, g2.t0
    /* JADX INFO: renamed from: getIndex, reason: from getter */
    public final int getF62559a() {
        return this.f62559a;
    }

    @Override // e2.n, g2.t0
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final Object getF62570l() {
        return this.f62570l;
    }

    @Override // e2.n
    /* JADX INFO: renamed from: getOffset, reason: from getter */
    public final int getF62574p() {
        return this.f62574p;
    }

    @Override // e2.n
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int getF62575q() {
        return this.f62575q;
    }

    public final void h(int i14, int i15, int i16) {
        int i17;
        this.f62574p = i14;
        boolean z14 = this.f62561c;
        this.f62580v = z14 ? i16 : i15;
        List<v1> list = this.f62560b;
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            v1 v1Var = list.get(i18);
            int i19 = i18 * 2;
            int[] iArr = this.f62583y;
            if (z14) {
                h4.d.b bVar = this.f62562d;
                if (bVar == null) {
                    b2.e.b("null horizontalAlignment when isVertical == true");
                    o2.c.f();
                    return;
                } else {
                    iArr[i19] = bVar.a(v1Var.f69144a, i15, this.f62564f);
                    iArr[i19 + 1] = i14;
                    i17 = v1Var.f69145b;
                }
            } else {
                iArr[i19] = i14;
                int i24 = i19 + 1;
                h4.d.c cVar = this.f62563e;
                if (cVar == null) {
                    b2.e.b("null verticalAlignment when isVertical == false");
                    o2.c.f();
                    return;
                } else {
                    iArr[i24] = cVar.a(v1Var.f69145b, i16);
                    i17 = v1Var.f69144a;
                }
            }
            i14 += i17;
        }
        this.f62581w = -this.f62566h;
        this.f62582x = this.f62580v + this.f62567i;
    }

    @Override // g2.t0
    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getF62577s() {
        return this.f62577s;
    }

    @Override // g2.t0
    /* JADX INFO: renamed from: j */
    public final int getF68161n() {
        return 0;
    }

    @Override // g2.t0
    public final void k() {
        this.f62579u = true;
    }

    @Override // g2.t0
    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getF62576r() {
        return this.f62576r;
    }

    @Override // g2.t0
    public final Object n(int i14) {
        return this.f62560b.get(i14).getF81969t();
    }

    @Override // g2.t0
    public final long o(int i14) {
        if (i14 != 0 || this.f62560b.size() != 0) {
            int i15 = i14 * 2;
            int[] iArr = this.f62583y;
            int i16 = iArr[i15];
            long j8 = ((long) i16) << 32;
            long j14 = (4294967295L & ((long) iArr[i15 + 1])) | j8;
            g6.k.a aVar = g6.k.f76003b;
            return j14;
        }
        int i17 = this.f62574p;
        if (this.f62561c) {
            long j15 = (4294967295L & ((long) i17)) | (((long) 0) << 32);
            g6.k.a aVar2 = g6.k.f76003b;
            return j15;
        }
        long j16 = (4294967295L & ((long) 0)) | (((long) i17) << 32);
        g6.k.a aVar3 = g6.k.f76003b;
        return j16;
    }

    public /* synthetic */ y(int i14, List list, boolean z14, h4.d.b bVar, h4.d.c cVar, g6.o oVar, boolean z15, int i15, int i16, int i17, long j8, Object obj, Object obj2, g2.b0 b0Var, long j14, p005kotlin.jvm.internal.j jVar) {
        this(i14, list, z14, bVar, cVar, oVar, z15, i15, i16, i17, j8, obj, obj2, b0Var, j14);
    }
}
