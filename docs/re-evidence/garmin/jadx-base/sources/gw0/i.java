package gw0;

import i3.mc;
import java.util.List;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79618a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f79619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f79620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f79621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f79622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f79623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f79624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f79625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f79626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f79627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f79628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f79629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f79630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f79631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f79632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f79633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f79634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f79635r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f79636t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o13.h f79637v;

    public /* synthetic */ i(List list, List list2, boolean z14, i53.c cVar, b63.o oVar, pv0.q qVar, e23.l lVar, p1 p1Var, o53.b0 b0Var, mc mcVar, p1 p1Var2, i53.d dVar, mc mcVar2, e23.q qVar2, e23.a aVar, p1 p1Var3, p1 p1Var4, p1 p1Var5, e23.a aVar2) {
        this.f79622e = list;
        this.f79623f = list2;
        this.f79619b = z14;
        this.f79624g = cVar;
        this.f79625h = oVar;
        this.f79626i = qVar;
        this.f79627j = lVar;
        this.f79628k = p1Var;
        this.f79633p = b0Var;
        this.f79634q = mcVar;
        this.f79629l = p1Var2;
        this.f79636t = dVar;
        this.f79635r = mcVar2;
        this.f79637v = qVar2;
        this.f79620c = aVar;
        this.f79630m = p1Var3;
        this.f79631n = p1Var4;
        this.f79632o = p1Var5;
        this.f79621d = aVar2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        e23.a aVar;
        Object obj2;
        boolean z14;
        int i14;
        final gw1.c cVar;
        float f14;
        int i15 = this.f79618a;
        o13.h hVar = this.f79637v;
        Object obj3 = this.f79636t;
        Object obj4 = this.f79635r;
        Object obj5 = this.f79634q;
        Object obj6 = this.f79633p;
        Object obj7 = this.f79632o;
        Object obj8 = this.f79631n;
        Object obj9 = this.f79630m;
        Object obj10 = this.f79629l;
        Object obj11 = this.f79628k;
        Object obj12 = this.f79627j;
        e23.a aVar2 = this.f79621d;
        Object obj13 = this.f79626i;
        Object obj14 = this.f79625h;
        Object obj15 = this.f79624g;
        Object obj16 = this.f79623f;
        boolean z15 = this.f79619b;
        switch (i15) {
            case 0:
                List list = (List) obj16;
                p1 p1Var = (p1) obj11;
                o53.b0 b0Var = (o53.b0) obj6;
                mc mcVar = (mc) obj5;
                p1 p1Var2 = (p1) obj10;
                i53.d dVar = (i53.d) obj3;
                mc mcVar2 = (mc) obj4;
                e23.q qVar = (e23.q) hVar;
                p1 p1Var3 = (p1) obj9;
                p1 p1Var4 = (p1) obj8;
                p1 p1Var5 = (p1) obj7;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                e2.f0.b(f0Var, null, new z3.e(-1848670271, true, new ak0.j((i53.c) obj15, (b63.o) obj14, (pv0.q) obj13, (e23.l) obj12, p1Var, 22)), 3);
                List list2 = this.f79622e;
                boolean zIsEmpty = list2.isEmpty();
                e23.a aVar3 = this.f79620c;
                if (zIsEmpty) {
                    aVar = aVar3;
                } else {
                    d.f79577a.getClass();
                    e2.f0.b(f0Var, null, d.f79578b, 3);
                    aVar = aVar3;
                    f0Var.a(list2.size(), null, new j.o(j.n.f79695a, list2), new z3.e(802480018, true, new j.p(list2, b0Var, mcVar, p1Var2, dVar, mcVar2, p1Var, qVar, aVar, p1Var3, p1Var4, p1Var5)));
                }
                if (list.isEmpty()) {
                    obj2 = null;
                    z14 = true;
                } else {
                    d.f79577a.getClass();
                    e2.f0.b(f0Var, null, d.f79579c, 3);
                    z14 = true;
                    obj2 = null;
                    f0Var.a(list.size(), null, new j.r(j.q.f79710a, list), new z3.e(802480018, true, new j.s(list, b0Var, mcVar, p1Var2, dVar, mcVar2, p1Var, qVar, aVar, p1Var3, p1Var4, p1Var5)));
                }
                if (z15) {
                    e2.f0.b(f0Var, obj2, new z3.e(-1682602604, z14, new ak0.p(aVar2, 7)), 3);
                }
                break;
            default:
                x01.e eVar = (x01.e) obj16;
                i21.d dVar2 = (i21.d) obj15;
                final v21.e eVar2 = (v21.e) obj14;
                final g21.g gVar = (g21.g) obj13;
                g21.u uVar = (g21.u) obj12;
                g21.f0 f0Var2 = (g21.f0) obj11;
                i21.c cVar2 = (i21.c) obj10;
                e23.p pVar = (e23.p) obj9;
                o82.a aVar4 = (o82.a) obj8;
                e23.p pVar2 = (e23.p) obj7;
                u82.f fVar = (u82.f) obj6;
                e23.r rVar = (e23.r) obj5;
                e23.r rVar2 = (e23.r) obj4;
                n82.f fVar2 = (n82.f) obj3;
                e23.r rVar3 = (e23.r) hVar;
                e2.f0 f0Var3 = (e2.f0) obj;
                f0Var3.getClass();
                if (z15) {
                    e2.f0.b(f0Var3, null, new z3.e(1358619608, true, new gw1.e(eVar, 1, this.f79620c, aVar2)), 3);
                } else {
                    e2.f0.b(f0Var3, null, new z3.e(1790341679, true, new bv0.e(uVar, this.f79622e, eVar, eVar2, f0Var2, cVar2, dVar2, 2)), 3);
                    x01.f fVar3 = eVar.f188255d;
                    if (fVar3 != x01.f.NEVER) {
                        x01.f fVar4 = x01.f.ACTIVE;
                        final g80.e eVar3 = fVar3 == fVar4 ? new g80.e(11, pVar, aVar4) : null;
                        int i16 = 2;
                        final gw1.d dVar3 = fVar3 == fVar4 ? new gw1.d(pVar2, i16, aVar4, gVar) : null;
                        if (fVar3 == fVar4) {
                            i14 = 1;
                            cVar = new gw1.c(fVar, i14, rVar, gVar);
                        } else {
                            i14 = 1;
                            cVar = null;
                        }
                        final h21.w wVar = fVar3 == fVar4 ? new h21.w(rVar2, fVar2, gVar, i14) : null;
                        final h21.w wVar2 = fVar3 == fVar4 ? new h21.w(rVar2, fVar2, gVar, i16) : null;
                        final boolean zA = dVar2.f87279k.a();
                        h21.w wVar3 = new h21.w(rVar3, fVar2, gVar, 0);
                        gw1.d dVar4 = new gw1.d(dVar2, 1, eVar, fVar2);
                        eVar2.getClass();
                        e2.f0.e(f0Var3, null, new z3.e(1297561171, true, new aa2.r(gVar, 19, eVar, wVar3)), 3);
                        f21.d.f68493a.getClass();
                        e2.f0.b(f0Var3, null, f21.d.f68495c, 3);
                        i53.c<g21.f> cVar3 = gVar.f75421a;
                        int size = cVar3.size();
                        int i17 = 0;
                        while (i17 < size) {
                            g21.f fVar5 = (g21.f) p13.h0.e0(i17 - 1, cVar3);
                            final g21.f fVar6 = cVar3.get(i17);
                            if (i17 == 0) {
                                f14 = 0;
                                g6.f.a aVar5 = g6.f.f75994b;
                            } else {
                                boolean z16 = (fVar5 != null ? fVar5.f75416b : null) == null;
                                boolean z17 = fVar6.f75416b == null;
                                if (z16 && z17) {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f14 = j92.b.f97899b.f97921f;
                                } else {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f14 = j92.b.f97899b.f97919d;
                                }
                            }
                            final float f15 = f14;
                            final gw1.d dVar5 = dVar4;
                            e2.f0.b(f0Var3, null, new z3.e(-925384323, true, new e23.q() { // from class: f21.d0
                                @Override // e23.q
                                public final Object invoke(Object obj17, Object obj18, Object obj19) {
                                    p3.m mVar = (p3.m) obj18;
                                    int iIntValue = ((Integer) obj19).intValue();
                                    ((e2.d) obj17).getClass();
                                    if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        x1 x1Var = p3.n.f135158a;
                                        h0.a(c2.l.C(h4.r.S, 0.0f, f15, 0.0f, 0.0f, 13), eVar2, fVar6, eVar3, dVar3, cVar, wVar, wVar2, dVar5, gVar.f75423c, zA, mVar, 0);
                                    } else {
                                        mVar.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 3);
                            i17++;
                            dVar4 = dVar5;
                        }
                    }
                    h21.c.f81036a.getClass();
                    e2.f0.b(f0Var3, null, h21.c.f81037b, 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(boolean z14, x01.e eVar, i21.d dVar, v21.e eVar2, g21.g gVar, e23.a aVar, e23.a aVar2, g21.u uVar, List list, g21.f0 f0Var, i21.c cVar, e23.p pVar, o82.a aVar3, e23.p pVar2, u82.f fVar, e23.r rVar, e23.r rVar2, n82.f fVar2, e23.r rVar3) {
        this.f79619b = z14;
        this.f79623f = eVar;
        this.f79624g = dVar;
        this.f79625h = eVar2;
        this.f79626i = gVar;
        this.f79620c = aVar;
        this.f79621d = aVar2;
        this.f79627j = uVar;
        this.f79622e = list;
        this.f79628k = f0Var;
        this.f79629l = cVar;
        this.f79630m = pVar;
        this.f79631n = aVar3;
        this.f79632o = pVar2;
        this.f79633p = fVar;
        this.f79634q = rVar;
        this.f79635r = rVar2;
        this.f79636t = fVar2;
        this.f79637v = rVar3;
    }
}
