package et1;

import i3.fe;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f2 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65585a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f65586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f65587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f65588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f65589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f65590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f65591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f65592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f65593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f65594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f65595k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f65596l;

    public /* synthetic */ f2(pt1.a0 a0Var, boolean z14, p3.p1 p1Var, e23.l lVar, e23.q qVar, e23.p pVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, e23.l lVar5, c2.w wVar) {
        this.f65587c = a0Var;
        this.f65586b = z14;
        this.f65588d = p1Var;
        this.f65589e = lVar;
        this.f65594j = qVar;
        this.f65595k = pVar;
        this.f65590f = lVar2;
        this.f65591g = lVar3;
        this.f65592h = lVar4;
        this.f65593i = lVar5;
        this.f65596l = wVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f65585a) {
            case 0:
                pt1.a0 a0Var = (pt1.a0) this.f65587c;
                p3.p1 p1Var = (p3.p1) this.f65588d;
                e23.l lVar = (e23.l) this.f65589e;
                e23.q qVar = (e23.q) this.f65594j;
                e23.p pVar = (e23.p) this.f65595k;
                e23.l lVar2 = (e23.l) this.f65590f;
                e23.l lVar3 = (e23.l) this.f65591g;
                e23.l lVar4 = (e23.l) this.f65592h;
                e23.l lVar5 = (e23.l) this.f65593i;
                c2.w wVar = (c2.w) this.f65596l;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                if (!a0Var.f140806d.isEmpty()) {
                    e2.f0.e(f0Var, -1, new z3.e(892531368, true, new aa2.r(a0Var, 18, p1Var, lVar)), 2);
                    List listB1 = p13.h0.b1(a0Var.f140806d);
                    f0Var.a(listB1.size(), new n2(new ep0.a(15), listB1), new o2(m2.f65716a, listB1), new z3.e(802480018, true, new p2(listB1, qVar, pVar, lVar2, lVar3, lVar4, lVar5)));
                } else if (this.f65586b) {
                    e2.f0.b(f0Var, null, new z3.e(-1163813077, true, new v(wVar, 4)), 3);
                    b.f65309a.getClass();
                    e2.f0.b(f0Var, null, b.f65310b, 3);
                }
                break;
            default:
                yg2.o oVar = (yg2.o) this.f65587c;
                yg2.h0 h0Var = (yg2.h0) this.f65588d;
                yg2.u0 u0Var = (yg2.u0) this.f65589e;
                e2.i0 i0Var = (e2.i0) this.f65590f;
                o53.b0 b0Var = (o53.b0) this.f65591g;
                bg2.j jVar = (bg2.j) this.f65592h;
                lc.y yVar = (lc.y) this.f65593i;
                fe feVar = (fe) this.f65594j;
                String str = (String) this.f65595k;
                String str2 = (String) this.f65596l;
                e2.f0 f0Var2 = (e2.f0) obj;
                f0Var2.getClass();
                for (yg2.a aVar : oVar.b()) {
                    o53.b0 b0Var2 = b0Var;
                    fe feVar2 = feVar;
                    gt1.j jVar2 = new gt1.j(this.f65586b, oVar, jVar, yVar, b0Var2, feVar2, str, str2);
                    e2.f0 f0Var3 = f0Var2;
                    bg2.j jVar3 = jVar;
                    yg2.h0 h0Var2 = h0Var;
                    lc.y yVar2 = yVar;
                    yg2.u0 u0Var2 = u0Var;
                    b0Var = b0Var2;
                    e2.i0 i0Var2 = i0Var;
                    yg2.q0.g(f0Var3, aVar, oVar, h0Var2, u0Var2, i0Var2, b0Var, jVar2);
                    str = str;
                    u0Var = u0Var2;
                    yVar = yVar2;
                    h0Var = h0Var2;
                    jVar = jVar3;
                    f0Var2 = f0Var3;
                    feVar = feVar2;
                    str2 = str2;
                    i0Var = i0Var2;
                }
                e2.f0 f0Var4 = f0Var2;
                bg2.j jVar4 = jVar;
                e2.i0 i0Var3 = i0Var;
                yg2.h0 h0Var3 = h0Var;
                lc.y yVar3 = yVar;
                yg2.u0 u0Var3 = u0Var;
                i53.c<yg2.a> cVarC = oVar.c();
                if (!cVarC.isEmpty()) {
                    yg2.f.f196976a.getClass();
                    e2.f0.b(f0Var4, null, yg2.f.f196977b, 3);
                    Iterator<yg2.a> it = cVarC.iterator();
                    while (it.hasNext()) {
                        yg2.q0.g(f0Var4, it.next(), oVar, h0Var3, u0Var3, i0Var3, b0Var, new wn2.f(oVar, 16, jVar4, yVar3));
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f2(yg2.o oVar, yg2.h0 h0Var, yg2.u0 u0Var, e2.i0 i0Var, o53.b0 b0Var, boolean z14, bg2.j jVar, lc.y yVar, fe feVar, String str, String str2) {
        this.f65587c = oVar;
        this.f65588d = h0Var;
        this.f65589e = u0Var;
        this.f65590f = i0Var;
        this.f65591g = b0Var;
        this.f65586b = z14;
        this.f65592h = jVar;
        this.f65593i = yVar;
        this.f65594j = feVar;
        this.f65595k = str;
        this.f65596l = str2;
    }
}
