package y2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.maps.android.BuildConfig;
import p005kotlin.Metadata;
import p006l2.o2;
import p13.j0;
import s5.x0;
import s5.y0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly2/h;", "", "", "text", "Ls5/x0;", TtmlNode.TAG_STYLE, "Lw5/q$b;", "fontFamilyResolver", "Ld6/p;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Ljava/lang/String;Ls5/x0;Lw5/q$b;IZIILkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f194081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x0 f194082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w5.q.b f194083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f194084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f194085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f194086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f194087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f194088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g6.c f194089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s5.b f194090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f194091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f194092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f194093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s5.u f194094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g6.o f194095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f194096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f194097q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f194098r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f194099s;

    private h(String str, x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16) {
        this.f194081a = str;
        this.f194082b = x0Var;
        this.f194083c = bVar;
        this.f194084d = i14;
        this.f194085e = z14;
        this.f194086f = i15;
        this.f194087g = i16;
        a.f194040b.getClass();
        this.f194088h = a.f194041c;
        long j8 = 0;
        g6.m.a aVar = g6.m.f76012b;
        this.f194092l = (j8 & 4294967295L) | (j8 << 32);
        g6.a.f75987b.getClass();
        this.f194096p = g6.a.C1525a.c(0, 0);
        this.f194097q = -1;
        this.f194098r = -1;
    }

    public static long f(h hVar, long j8, g6.o oVar) {
        x0 x0Var = hVar.f194082b;
        d.a aVar = d.f194048h;
        d dVar = hVar.f194093m;
        g6.c cVar = hVar.f194089i;
        cVar.getClass();
        w5.q.b bVar = hVar.f194083c;
        aVar.getClass();
        d dVarA = d.a.a(dVar, oVar, x0Var, cVar, bVar);
        hVar.f194093m = dVarA;
        return dVarA.a(hVar.f194087g, j8);
    }

    public final int a(int i14, g6.o oVar) {
        int i15 = this.f194097q;
        int i16 = this.f194098r;
        if (i14 == i15 && i15 != -1) {
            return i16;
        }
        long jA = g6.b.a(0, i14, 0, Integer.MAX_VALUE);
        if (this.f194087g > 1) {
            jA = f(this, jA, oVar);
        }
        s5.u uVarE = e(oVar);
        long jA2 = c.a(uVarE.a(), this.f194084d, jA, this.f194085e);
        boolean z14 = this.f194085e;
        int i17 = this.f194084d;
        int i18 = this.f194086f;
        int iA = o2.a(new s5.b((a6.d) uVarE, ((z14 || !c.b(i17)) && i18 >= 1) ? i18 : 1, this.f194084d, jA2, null).getHeight());
        int iK = g6.a.k(jA);
        if (iA < iK) {
            iA = iK;
        }
        this.f194097q = i14;
        this.f194098r = iA;
        return iA;
    }

    public final boolean b(long j8, g6.o oVar) {
        s5.u uVar;
        b.f194043b.getClass();
        this.f194099s = b.f194046e | (this.f194099s << 2);
        boolean z14 = true;
        long jF = this.f194087g > 1 ? f(this, j8, oVar) : j8;
        s5.b bVar = this.f194090j;
        boolean z15 = false;
        if (bVar != null && (uVar = this.f194094n) != null && !uVar.b() && oVar == this.f194095o && (g6.a.d(jF, this.f194096p) || (g6.a.j(jF) == g6.a.j(this.f194096p) && g6.a.l(jF) == g6.a.l(this.f194096p) && g6.a.i(jF) >= bVar.getHeight() && !bVar.f157131d.f162406e))) {
            if (!g6.a.d(jF, this.f194096p)) {
                s5.b bVar2 = this.f194090j;
                bVar2.getClass();
                long jA = (((long) o2.a(Math.min(bVar2.f157128a.f1493i.c(), bVar2.getWidth()))) << 32) | (((long) o2.a(bVar2.getHeight())) & 4294967295L);
                g6.m.a aVar = g6.m.f76012b;
                long jD = g6.b.d(jF, jA);
                this.f194092l = jD;
                int i14 = this.f194084d;
                d6.p.f57793b.getClass();
                if (i14 == d6.p.f57796e || (((int) (jD >> 32)) >= bVar2.getWidth() && ((int) (4294967295L & jD)) >= bVar2.getHeight())) {
                    z14 = false;
                }
                this.f194091k = z14;
                this.f194096p = jF;
            }
            return false;
        }
        s5.u uVarE = e(oVar);
        long jA2 = c.a(uVarE.a(), this.f194084d, jF, this.f194085e);
        boolean z16 = this.f194085e;
        int i15 = this.f194084d;
        int i16 = this.f194086f;
        s5.b bVar3 = new s5.b((a6.d) uVarE, ((z16 || !c.b(i15)) && i16 >= 1) ? i16 : 1, this.f194084d, jA2, null);
        this.f194096p = jF;
        long jA3 = (((long) o2.a(bVar3.getHeight())) & 4294967295L) | (((long) o2.a(bVar3.getWidth())) << 32);
        g6.m.a aVar2 = g6.m.f76012b;
        long jD2 = g6.b.d(jF, jA3);
        this.f194092l = jD2;
        int i17 = this.f194084d;
        d6.p.f57793b.getClass();
        if (i17 != d6.p.f57796e && (((int) (jD2 >> 32)) < bVar3.getWidth() || ((int) (jD2 & 4294967295L)) < bVar3.getHeight())) {
            z15 = true;
        }
        this.f194091k = z15;
        this.f194090j = bVar3;
        return true;
    }

    public final void c() {
        this.f194090j = null;
        this.f194094n = null;
        this.f194095o = null;
        this.f194097q = -1;
        this.f194098r = -1;
        g6.a.f75987b.getClass();
        this.f194096p = g6.a.C1525a.c(0, 0);
        long j8 = 0;
        g6.m.a aVar = g6.m.f76012b;
        this.f194092l = (j8 & 4294967295L) | (j8 << 32);
        this.f194091k = false;
    }

    public final void d(g6.c cVar) {
        long jA;
        g6.c cVar2 = this.f194089i;
        a.C3621a c3621a = a.f194040b;
        if (cVar != null) {
            jA = a.a(cVar.getF75991a(), cVar.getF75992b());
        } else {
            c3621a.getClass();
            jA = a.f194041c;
        }
        if (cVar2 == null) {
            this.f194089i = cVar;
            this.f194088h = jA;
        } else if (cVar == null || this.f194088h != jA) {
            this.f194089i = cVar;
            this.f194088h = jA;
            b.f194043b.getClass();
            this.f194099s = b.f194044c | (this.f194099s << 2);
            c();
        }
    }

    public final s5.u e(g6.o oVar) {
        s5.u dVar = this.f194094n;
        if (dVar == null || oVar != this.f194095o || dVar.b()) {
            this.f194095o = oVar;
            String str = this.f194081a;
            x0 x0VarA = y0.a(this.f194082b, oVar);
            j0 j0Var = j0.f134944a;
            g6.c cVar = this.f194089i;
            cVar.getClass();
            dVar = new a6.d(str, x0VarA, j0Var, j0Var, this.f194083c, cVar);
        }
        this.f194094n = dVar;
        return dVar;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb3.append(this.f194090j != null ? "<paragraph>" : BuildConfig.TRAVIS);
        sb3.append(", lastDensity=");
        sb3.append((Object) a.b(this.f194088h));
        sb3.append(", history=");
        return am.j.i(this.f194099s, ", constraints=$)", sb3);
    }

    public /* synthetic */ h(String str, x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(str, x0Var, bVar, i14, z14, i15, i16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(String str, x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        if ((i17 & 8) != 0) {
            d6.p.f57793b.getClass();
            i14 = d6.p.f57794c;
        }
        this(str, x0Var, bVar, i14, (i17 & 16) != 0 ? true : z14, (i17 & 32) != 0 ? Integer.MAX_VALUE : i15, (i17 & 64) != 0 ? 1 : i16, null);
    }
}
