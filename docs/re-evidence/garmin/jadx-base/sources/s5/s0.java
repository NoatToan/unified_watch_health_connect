package s5;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ls5/s0;", "", "Lw5/q$b;", "defaultFontFamilyResolver", "Lg6/c;", "defaultDensity", "Lg6/o;", "defaultLayoutDirection", "", "cacheSize", "<init>", "(Lw5/q$b;Lg6/c;Lg6/o;I)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f157297e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5.q.b f157298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6.c f157299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6.o f157300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f157301d;

    public s0(w5.q.b bVar, g6.c cVar, g6.o oVar, int i14) {
        this.f157298a = bVar;
        this.f157299b = cVar;
        this.f157300c = oVar;
        this.f157301d = i14 > 0 ? new o0(i14) : null;
    }

    public static q0 a(s0 s0Var, String str, x0 x0Var, long j8, int i14) {
        if ((i14 & 2) != 0) {
            x0.f157320d.getClass();
            x0Var = x0.f157321e;
        }
        x0 x0Var2 = x0Var;
        d6.p.f57793b.getClass();
        int i15 = d6.p.f57794c;
        long jB = (i14 & 32) != 0 ? g6.b.b(0, 0, 15) : j8;
        g6.o oVar = s0Var.f157300c;
        g6.c cVar = s0Var.f157299b;
        w5.q.b bVar = s0Var.f157298a;
        s0Var.getClass();
        return b(s0Var, new c(str, null, 2, null), x0Var2, i15, true, Integer.MAX_VALUE, null, jB, oVar, cVar, bVar, 32);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0147  */
    public static q0 b(s0 s0Var, c cVar, x0 x0Var, int i14, boolean z14, int i15, List list, long j8, g6.o oVar, g6.c cVar2, w5.q.b bVar, int i16) {
        x0 x0Var2;
        int i17;
        q0 q0Var;
        if ((i16 & 2) != 0) {
            x0.f157320d.getClass();
            x0Var2 = x0.f157321e;
        } else {
            x0Var2 = x0Var;
        }
        if ((i16 & 4) != 0) {
            d6.p.f57793b.getClass();
            i17 = d6.p.f57794c;
        } else {
            i17 = i14;
        }
        int i18 = 1;
        boolean z15 = (i16 & 8) != 0 ? true : z14;
        int iJ = Integer.MAX_VALUE;
        int i19 = (i16 & 16) != 0 ? Integer.MAX_VALUE : i15;
        List list2 = (i16 & 32) != 0 ? p13.j0.f134944a : list;
        long jB = (i16 & 64) != 0 ? g6.b.b(0, 0, 15) : j8;
        g6.o oVar2 = (i16 & 128) != 0 ? s0Var.f157300c : oVar;
        g6.c cVar3 = (i16 & 256) != 0 ? s0Var.f157299b : cVar2;
        w5.q.b bVar2 = (i16 & 512) != 0 ? s0Var.f157298a : bVar;
        o0 o0Var = s0Var.f157301d;
        p0 p0Var = new p0(cVar, x0Var2, list2, i19, z15, i17, cVar3, oVar2, bVar2, jB, (p005kotlin.jvm.internal.j) null);
        q0 q0Var2 = null;
        if (o0Var != null) {
            i iVar = new i(p0Var);
            p1.c0<i, q0> c0Var = o0Var.f157260a;
            if (c0Var != null) {
                q0Var = c0Var.get(iVar);
            } else if (p005kotlin.jvm.internal.s.g(o0Var.f157261b, iVar)) {
                q0Var = o0Var.f157262c;
            }
            if (q0Var != null && !q0Var.f157281b.f157252a.b()) {
                q0Var2 = q0Var;
            }
        }
        if (q0Var2 != null) {
            o oVar3 = q0Var2.f157281b;
            int iB = v.b(oVar3.f157255d);
            long jB2 = ((long) v.b(oVar3.f157256e)) & 4294967295L;
            g6.m.a aVar = g6.m.f76012b;
            return new q0(p0Var, q0Var2.f157281b, g6.b.d(jB, jB2 | (((long) iB) << 32)), null);
        }
        f157297e.getClass();
        q qVar = new q(p0Var.f157265a, y0.a(p0Var.f157266b, p0Var.f157272h), p0Var.f157267c, p0Var.f157271g, p0Var.f157273i);
        long j14 = p0Var.f157274j;
        int iL = g6.a.l(j14);
        int i24 = p0Var.f157270f;
        boolean z16 = p0Var.f157269e;
        if (!z16) {
            d6.p.f57793b.getClass();
            if (i24 == d6.p.f57795d || i24 == d6.p.f57797f || i24 == d6.p.f57798g) {
                if (g6.a.f(j14)) {
                    iJ = g6.a.j(j14);
                }
            }
        } else if (g6.a.f(j14)) {
            iJ = g6.a.j(j14);
        }
        int iE = iJ;
        if (z16) {
            i18 = p0Var.f157268d;
        } else {
            d6.p.f57793b.getClass();
            if (i24 != d6.p.f57795d && i24 != d6.p.f57797f && i24 != d6.p.f57798g) {
                i18 = p0Var.f157268d;
            }
        }
        if (iL != iE) {
            iE = j23.t.e(v.b(qVar.a()), iL, iE);
        }
        g6.a.C1525a c1525a = g6.a.f75987b;
        int i25 = g6.a.i(j14);
        c1525a.getClass();
        o oVar4 = new o(qVar, g6.a.C1525a.b(0, iE, 0, i25), i18, p0Var.f157270f, (p005kotlin.jvm.internal.j) null);
        long jCeil = (((long) ((int) Math.ceil(oVar4.f157256e))) & 4294967295L) | (((long) ((int) Math.ceil(oVar4.f157255d))) << 32);
        g6.m.a aVar2 = g6.m.f76012b;
        q0 q0Var3 = new q0(p0Var, oVar4, g6.b.d(j14, jCeil), null);
        if (o0Var != null) {
            p1.c0<i, q0> c0Var2 = o0Var.f157260a;
            if (c0Var2 != null) {
                c0Var2.put(new i(p0Var), q0Var3);
                return q0Var3;
            }
            o0Var.f157261b = new i(p0Var);
            o0Var.f157262c = q0Var3;
        }
        return q0Var3;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls5/s0$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ s0(w5.q.b bVar, g6.c cVar, g6.o oVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(bVar, cVar, oVar, (i15 & 8) != 0 ? 8 : i14);
    }
}
