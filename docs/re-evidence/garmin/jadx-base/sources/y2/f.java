package y2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.maps.android.BuildConfig;
import java.util.List;
import p005kotlin.Metadata;
import p006l2.l2;
import p006l2.o2;
import p13.j0;
import s5.p0;
import s5.q0;
import s5.x0;
import s5.y;
import s5.y0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ly2/f;", "", "Ls5/c;", "text", "Ls5/x0;", TtmlNode.TAG_STYLE, "Lw5/q$b;", "fontFamilyResolver", "Ld6/p;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Ls5/c$d;", "Ls5/y;", "placeholders", "Ll2/l2;", "autoSize", "<init>", "(Ls5/c;Ls5/x0;Lw5/q$b;IZIILjava/util/List;Ll2/l2;Lkotlin/jvm/internal/j;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s5.c f194059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w5.q.b f194060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f194061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f194062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f194063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f194064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<s5.c.d<y>> f194065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l2 f194066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f194067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f194068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g6.c f194069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x0 f194070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s5.q f194071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g6.o f194072n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q0 f194073o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f194074p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f194075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f194076r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f194077s;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly2/f$a;", "", "<init>", "(Ly2/f;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a implements g6.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q0 f194078a;

        public a() {
        }

        public final q0 e(long j8, long j14) {
            long jI;
            f fVar = f.this;
            x0 x0Var = fVar.f194070l;
            long jA = g6.q.e(j14) ? g.a(fVar.f194070l.f157322a.fontSize, j14) : j14;
            if (!g6.q.b(jA, fVar.f194070l.f157322a.fontSize)) {
                fVar.f(x0.a(fVar.f194070l, 0L, jA, null, null, 0L, null, null, 0, 0L, null, null, 16777213));
            }
            if (fVar.f194064f > 1) {
                g6.o oVar = fVar.f194072n;
                oVar.getClass();
                jI = fVar.i(j8, oVar);
            } else {
                jI = j8;
            }
            g6.o oVar2 = fVar.f194072n;
            oVar2.getClass();
            s5.o oVarB = fVar.b(jI, oVar2);
            g6.o oVar3 = fVar.f194072n;
            oVar3.getClass();
            q0 q0VarG = fVar.g(oVar3, jI, oVarB);
            this.f194078a = q0VarG;
            fVar.f(x0Var);
            return q0VarG;
        }

        @Override // g6.c
        public final float g0(long j8) {
            if (!g6.q.e(j8)) {
                return getF75991a() * H0(j8);
            }
            f fVar = f.this;
            if (g6.q.e(fVar.f194070l.f157322a.fontSize)) {
                vb.h.z("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
                return 0.0f;
            }
            long j14 = fVar.f194070l.f157322a.fontSize;
            g6.q.f76018b.getClass();
            if (g6.q.b(j14, g6.q.f76020d)) {
                vb.h.z("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
                return 0.0f;
            }
            return g6.q.d(j8) * g0(fVar.f194070l.f157322a.fontSize);
        }

        @Override // g6.c
        /* JADX INFO: renamed from: getDensity */
        public final float getF75991a() {
            g6.c cVar = f.this.f194069k;
            cVar.getClass();
            return cVar.getF75991a();
        }

        @Override // g6.i
        /* JADX INFO: renamed from: r0 */
        public final float getF75992b() {
            g6.c cVar = f.this.f194069k;
            cVar.getClass();
            return cVar.getF75992b();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(s5.c cVar, x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16, List list, l2 l2Var, int i17, p005kotlin.jvm.internal.j jVar) {
        int i18;
        if ((i17 & 8) != 0) {
            d6.p.f57793b.getClass();
            i18 = d6.p.f57794c;
        } else {
            i18 = i14;
        }
        this(cVar, x0Var, bVar, i18, (i17 & 16) != 0 ? true : z14, (i17 & 32) != 0 ? Integer.MAX_VALUE : i15, (i17 & 64) != 0 ? 1 : i16, (i17 & 128) != 0 ? null : list, (i17 & 256) != 0 ? null : l2Var, null);
    }

    public final int a(int i14, g6.o oVar) {
        int i15 = this.f194074p;
        int i16 = this.f194075q;
        if (i14 == i15 && i15 != -1) {
            return i16;
        }
        long jA = g6.b.a(0, i14, 0, Integer.MAX_VALUE);
        if (this.f194064f > 1) {
            jA = i(jA, oVar);
        }
        int iA = o2.a(b(jA, oVar).f157256e);
        int iK = g6.a.k(jA);
        if (iA < iK) {
            iA = iK;
        }
        this.f194074p = i14;
        this.f194075q = iA;
        return iA;
    }

    public final s5.o b(long j8, g6.o oVar) {
        s5.q qVarE = e(oVar);
        boolean z14 = this.f194062d;
        long jA = c.a(qVarE.a(), this.f194061c, j8, z14);
        boolean z15 = this.f194062d;
        int i14 = this.f194061c;
        int i15 = this.f194063e;
        int i16 = 1;
        if ((z15 || !c.b(i14)) && i15 >= 1) {
            i16 = i15;
        }
        return new s5.o(qVarE, jA, i16, this.f194061c, (p005kotlin.jvm.internal.j) null);
    }

    public final boolean c(long j8, g6.o oVar) {
        b.f194043b.getClass();
        this.f194077s = b.f194046e | (this.f194077s << 2);
        long jI = this.f194064f > 1 ? i(j8, oVar) : j8;
        q0 q0Var = this.f194073o;
        if (q0Var != null) {
            s5.o oVar2 = q0Var.f157281b;
            p0 p0Var = q0Var.f157280a;
            if (!oVar2.f157252a.b()) {
                g6.o oVar3 = p0Var.f157272h;
                long j14 = p0Var.f157274j;
                if (oVar == oVar3 && (g6.a.d(jI, j14) || (g6.a.j(jI) == g6.a.j(j14) && g6.a.l(jI) == g6.a.l(j14) && g6.a.i(jI) >= oVar2.f157256e && !oVar2.f157254c))) {
                    q0 q0Var2 = this.f194073o;
                    q0Var2.getClass();
                    if (g6.a.d(jI, q0Var2.f157280a.f157274j)) {
                        return false;
                    }
                    q0 q0Var3 = this.f194073o;
                    q0Var3.getClass();
                    this.f194073o = g(oVar, jI, q0Var3.f157281b);
                    return true;
                }
            }
        }
        l2 l2Var = this.f194066h;
        if (l2Var != null) {
            this.f194072n = oVar;
            long j15 = this.f194070l.f157322a.fontSize;
            if (this.f194076r == null) {
                this.f194076r = new a();
            }
            a aVar = this.f194076r;
            aVar.getClass();
            long jA = l2Var.a(aVar, j8, this.f194059a);
            if (g6.q.e(jA)) {
                jA = g.a(j15, jA);
            }
            long j16 = jA;
            if (this.f194076r == null) {
                this.f194076r = new a();
            }
            a aVar2 = this.f194076r;
            aVar2.getClass();
            q0 q0Var4 = aVar2.f194078a;
            if (q0Var4 != null) {
                p0 p0Var2 = q0Var4.f157280a;
                if (g6.q.b(j16, p0Var2.f157266b.f157322a.fontSize)) {
                    int i14 = p0Var2.f157270f;
                    int i15 = this.f194061c;
                    d6.p.a aVar3 = d6.p.f57793b;
                    if (i14 == i15) {
                        this.f194073o = q0Var4;
                        return true;
                    }
                }
            }
            f(x0.a(this.f194070l, 0L, j16, null, null, 0L, null, null, 0, 0L, null, null, 16777213));
        }
        this.f194073o = g(oVar, jI, b(jI, oVar));
        return true;
    }

    public final void d(g6.c cVar) {
        long jA;
        g6.c cVar2 = this.f194069k;
        y2.a.C3621a c3621a = y2.a.f194040b;
        if (cVar != null) {
            jA = y2.a.a(cVar.getF75991a(), cVar.getF75992b());
        } else {
            c3621a.getClass();
            jA = y2.a.f194041c;
        }
        if (cVar2 == null) {
            this.f194069k = cVar;
            this.f194068j = jA;
            return;
        }
        if (cVar == null || this.f194068j != jA) {
            this.f194069k = cVar;
            this.f194068j = jA;
            b.f194043b.getClass();
            this.f194077s = b.f194044c | (this.f194077s << 2);
            this.f194071m = null;
            this.f194073o = null;
            this.f194075q = -1;
            this.f194074p = -1;
            this.f194076r = null;
        }
    }

    public final s5.q e(g6.o oVar) {
        s5.q qVar = this.f194071m;
        if (qVar == null || oVar != this.f194072n || qVar.b()) {
            this.f194072n = oVar;
            s5.c cVar = this.f194059a;
            x0 x0VarA = y0.a(this.f194070l, oVar);
            g6.c cVar2 = this.f194069k;
            cVar2.getClass();
            w5.q.b bVar = this.f194060b;
            List list = this.f194065g;
            if (list == null) {
                list = j0.f134944a;
            }
            qVar = new s5.q(cVar, x0VarA, (List<s5.c.d<y>>) list, cVar2, bVar);
        }
        this.f194071m = qVar;
        return qVar;
    }

    public final void f(x0 x0Var) {
        boolean zD = x0Var.d(this.f194070l);
        this.f194070l = x0Var;
        if (zD) {
            return;
        }
        b.f194043b.getClass();
        this.f194077s <<= 2;
        this.f194071m = null;
        this.f194073o = null;
        this.f194075q = -1;
        this.f194074p = -1;
    }

    public final q0 g(g6.o oVar, long j8, s5.o oVar2) {
        float fMin = Math.min(oVar2.f157252a.a(), oVar2.f157255d);
        s5.c cVar = this.f194059a;
        x0 x0Var = this.f194070l;
        List list = this.f194065g;
        if (list == null) {
            list = j0.f134944a;
        }
        int i14 = this.f194063e;
        boolean z14 = this.f194062d;
        int i15 = this.f194061c;
        g6.c cVar2 = this.f194069k;
        cVar2.getClass();
        p0 p0Var = new p0(cVar, x0Var, list, i14, z14, i15, cVar2, oVar, this.f194060b, j8, (p005kotlin.jvm.internal.j) null);
        long jA = (((long) o2.a(fMin)) << 32) | (((long) o2.a(oVar2.f157256e)) & 4294967295L);
        g6.m.a aVar = g6.m.f76012b;
        return new q0(p0Var, oVar2, g6.b.d(j8, jA), null);
    }

    public final void h(s5.c cVar, x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16, List<s5.c.d<y>> list, l2 l2Var) {
        this.f194059a = cVar;
        f(x0Var);
        this.f194060b = bVar;
        this.f194061c = i14;
        this.f194062d = z14;
        this.f194063e = i15;
        this.f194064f = i16;
        this.f194065g = list;
        this.f194066h = l2Var;
        b.f194043b.getClass();
        this.f194077s = b.f194045d | (this.f194077s << 2);
        this.f194071m = null;
        this.f194073o = null;
        this.f194075q = -1;
        this.f194074p = -1;
        this.f194076r = null;
    }

    public final long i(long j8, g6.o oVar) {
        d.a aVar = d.f194048h;
        d dVar = this.f194067i;
        x0 x0Var = this.f194070l;
        g6.c cVar = this.f194069k;
        cVar.getClass();
        w5.q.b bVar = this.f194060b;
        aVar.getClass();
        d dVarA = d.a.a(dVar, oVar, x0Var, cVar, bVar);
        this.f194067i = dVarA;
        return dVarA.a(this.f194064f, j8);
    }

    public final String toString() {
        p0 p0Var;
        StringBuilder sb3 = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        q0 q0Var = this.f194073o;
        Object objA = BuildConfig.TRAVIS;
        sb3.append(q0Var != null ? "<TextLayoutResult>" : BuildConfig.TRAVIS);
        sb3.append(", lastDensity=");
        sb3.append((Object) y2.a.b(this.f194068j));
        sb3.append(", history=");
        sb3.append(this.f194077s);
        sb3.append(", constraints=");
        q0 q0Var2 = this.f194073o;
        if (q0Var2 != null && (p0Var = q0Var2.f157280a) != null) {
            objA = g6.a.a(p0Var.f157274j);
        }
        return wr.g.p(sb3, objA, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    private f(s5.c cVar, x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16, List<s5.c.d<y>> list, l2 l2Var) {
        this.f194059a = cVar;
        this.f194060b = bVar;
        this.f194061c = i14;
        this.f194062d = z14;
        this.f194063e = i15;
        this.f194064f = i16;
        this.f194065g = list;
        this.f194066h = l2Var;
        y2.a.f194040b.getClass();
        this.f194068j = y2.a.f194041c;
        this.f194070l = x0Var;
        this.f194074p = -1;
        this.f194075q = -1;
    }

    public /* synthetic */ f(s5.c cVar, x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16, List list, l2 l2Var, p005kotlin.jvm.internal.j jVar) {
        this(cVar, x0Var, bVar, i14, z14, i15, i16, list, l2Var);
    }
}
