package dj0;

import a42.c0;
import e23.p;
import e23.r;
import p005kotlin.Unit;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import sm1.a0;
import sm1.q;
import sm1.s;
import u1.a2;
import u1.d2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59937a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f59938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f59939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f59940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f59941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f59942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f59943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o13.h f59944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f59945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f59946j;

    public /* synthetic */ l(s sVar, n82.f.a aVar, n82.f fVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, x3 x3Var, p1 p1Var, p1 p1Var2) {
        this.f59941e = sVar;
        this.f59942f = aVar;
        this.f59943g = fVar;
        this.f59938b = aVar2;
        this.f59939c = aVar3;
        this.f59944h = aVar4;
        this.f59945i = x3Var;
        this.f59940d = p1Var;
        this.f59946j = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        int i15;
        int i16 = this.f59937a;
        Object obj5 = this.f59946j;
        Object obj6 = this.f59945i;
        o13.h hVar = this.f59944h;
        Object obj7 = this.f59943g;
        Object obj8 = this.f59942f;
        Object obj9 = this.f59941e;
        switch (i16) {
            case 0:
                u82.d dVar = (u82.d) obj9;
                u82.d dVar2 = (u82.d) obj8;
                yi0.c cVar = (yi0.c) obj7;
                e23.l lVar = (e23.l) hVar;
                yi0.b bVar = (yi0.b) obj5;
                e23.l lVar2 = (e23.l) obj6;
                o82.g gVar = (o82.g) obj;
                o82.a aVar = (o82.a) obj2;
                p3.m mVar = (p3.m) obj3;
                int iD = vb.h.d((Integer) obj4, gVar, aVar);
                if ((iD & 6) == 0) {
                    i14 = (mVar.k(gVar.ordinal()) ? 4 : 2) | iD;
                } else {
                    i14 = iD;
                }
                if ((iD & 48) == 0) {
                    i14 |= mVar.B(aVar) ? 32 : 16;
                }
                int i17 = i14;
                if (mVar.n(i17 & 1, (i17 & 147) != 146)) {
                    x1 x1Var = p3.n.f135158a;
                    if (m.c.f59949a[gVar.ordinal()] == 1) {
                        mVar.C(1028863361);
                        u82.e.b(aVar, dVar, null, false, z3.f.c(147344103, new c0(cVar, lVar, this.f59938b, this.f59939c, this.f59940d), mVar), mVar, ((i17 >> 3) & 14) | 24576, 12);
                        mVar.f();
                    } else {
                        mVar.C(1029759509);
                        u82.e.b(aVar, dVar2, null, false, z3.f.c(-690070978, new c0((Object) dVar, (Object) cVar, (Object) bVar, lVar, (o13.h) lVar2, 13), mVar), mVar, ((i17 >> 3) & 14) | 24576, 12);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                s sVar = (s) obj9;
                n82.f.a aVar2 = (n82.f.a) obj8;
                n82.f fVar = (n82.f) obj7;
                e23.a aVar3 = (e23.a) hVar;
                x3 x3Var = (x3) obj6;
                p1 p1Var = (p1) obj5;
                o82.g gVar2 = (o82.g) obj;
                o82.a aVar4 = (o82.a) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iD2 = vb.h.d((Integer) obj4, gVar2, aVar4);
                if ((iD2 & 6) == 0) {
                    i15 = (mVar2.k(gVar2.ordinal()) ? 4 : 2) | iD2;
                } else {
                    i15 = iD2;
                }
                if ((iD2 & 48) == 0) {
                    i15 |= mVar2.B(aVar4) ? 32 : 16;
                }
                if (mVar2.n(i15 & 1, (i15 & 147) != 146)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i18 = sm1.r.h.f160179a[gVar2.ordinal()];
                    if (i18 == 1) {
                        mVar2.C(-1900814563);
                        u82.e.b(aVar4, sVar.f160192l, null, false, z3.f.c(-539750764, new ca0.e(fVar, aVar4, sVar, this.f59938b, this.f59939c, aVar3, x3Var), mVar2), mVar2, ((i15 >> 3) & 14) | 24576, 12);
                        mVar2.f();
                    } else if (i18 == 2 || i18 == 3) {
                        mVar2.C(-1897937732);
                        d2 d2VarA = a2.a(mVar2);
                        Object objQ = mVar2.q();
                        p3.m.f135153a.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = p0.n(null);
                            mVar2.K(objQ);
                        }
                        p1 p1Var2 = (p1) objQ;
                        com.garmin.android.apps.connectmobile.sleep.presentation.c cVar2 = ((a0) this.f59940d.getF182175a()).f160102r;
                        boolean z14 = !((Boolean) p1Var.getF182175a()).booleanValue() && aVar4.f130843a.compareTo(aVar2.f124965c) <= 0 && aVar2.f124965c.compareTo(aVar4.f130844b) <= 0;
                        Integer num = (Integer) p1Var2.getF182175a();
                        boolean zB = mVar2.B(d2VarA);
                        Object objQ2 = mVar2.q();
                        if (zB || objQ2 == c2565a) {
                            objQ2 = new sm1.r.c(p1Var2, d2VarA, p1Var, null);
                            mVar2.K(objQ2);
                        }
                        l0.e((p) objQ2, num, mVar2);
                        u82.e.a(aVar4, sVar.f160193m, null, d2VarA, z3.f.c(1070054347, new q(aVar4, sVar, fVar, cVar2, z14, p1Var2), mVar2), mVar2, ((i15 >> 3) & 14) | 24576, 4);
                        mVar2.f();
                    } else if (i18 != 4) {
                        mVar2.C(-199660816);
                        mVar2.f();
                    } else {
                        mVar2.C(-1895484020);
                        u82.e.b(aVar4, sVar.f160194n, null, false, z3.f.c(739606860, new ic1.k(aVar4, fVar, 3), mVar2), mVar2, ((i15 >> 3) & 14) | 24576, 12);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l(u82.d dVar, u82.d dVar2, yi0.c cVar, e23.l lVar, e23.a aVar, e23.a aVar2, p1 p1Var, yi0.b bVar, e23.l lVar2) {
        this.f59941e = dVar;
        this.f59942f = dVar2;
        this.f59943g = cVar;
        this.f59944h = lVar;
        this.f59938b = aVar;
        this.f59939c = aVar2;
        this.f59940d = p1Var;
        this.f59946j = bVar;
        this.f59945i = lVar2;
    }
}
