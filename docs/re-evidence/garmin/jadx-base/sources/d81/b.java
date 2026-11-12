package d81;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f72.n0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i81.a f58287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f58288c;

    public /* synthetic */ b(i81.a aVar, e23.a aVar2, int i14) {
        this.f58286a = i14;
        this.f58287b = aVar;
        this.f58288c = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        p3.m mVar;
        Unit unit;
        int i14;
        int i15 = this.f58286a;
        i81.a aVar = this.f58287b;
        switch (i15) {
            case 0:
                u82.f fVar = (u82.f) obj2;
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((c2.t) obj).getClass();
                fVar.getClass();
                x1 x1Var = p3.n.f135158a;
                g81.c cVar = (g81.c) fVar.a();
                int iIntValue = ((Number) s9.c.c(aVar.f92258h, mVar2).getF182175a()).intValue();
                int iIntValue2 = ((Number) s9.c.c(aVar.f92259i, mVar2).getF182175a()).intValue();
                if (cVar == null) {
                    mVar2.C(-171557225);
                    mVar2.f();
                    unit = null;
                    mVar = mVar2;
                } else {
                    mVar2.C(-171557224);
                    boolean zR = mVar2.r(aVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR) {
                        objQ = new c(aVar, 0);
                        mVar2.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new c(aVar, 0);
                            mVar2.K(objQ);
                        }
                    }
                    e23.l lVar = (e23.l) objQ;
                    boolean zR2 = mVar2.r(aVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new c(aVar, 1);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new c(aVar, 1);
                            mVar2.K(objQ2);
                        }
                    }
                    mVar = mVar2;
                    g.b(cVar, iIntValue, iIntValue2, lVar, (e23.l) objQ2, this.f58288c, mVar, 0);
                    mVar.f();
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    if (fVar instanceof u82.f.b) {
                        mVar.C(-170558621);
                        mVar.f();
                    } else {
                        mVar.C(-170931582);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                        s62.a.f157643a.getClass();
                        p3.m mVar3 = mVar;
                        b82.n.c(n0.a(t62.c.f162799a), gl1.y.Q(mVar, R.string.common_no_data), gl1.y.Q(mVar, R.string.msg_endurance_score_sync_device), rVarC, null, mVar3, 0, 16);
                        mVar3.f();
                    }
                }
                break;
            default:
                o82.g gVar = (o82.g) obj;
                o82.a aVar3 = (o82.a) obj2;
                p3.m mVar4 = (p3.m) obj3;
                int iD = vb.h.d((Integer) obj4, gVar, aVar3);
                if ((iD & 6) == 0) {
                    i14 = (mVar4.k(gVar.ordinal()) ? 4 : 2) | iD;
                } else {
                    i14 = iD;
                }
                if ((iD & 48) == 0) {
                    i14 |= mVar4.B(aVar3) ? 32 : 16;
                }
                if (mVar4.n(i14 & 1, (i14 & 147) != 146)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i16 = y.a.f58371a[gVar.ordinal()];
                    e23.a aVar4 = this.f58288c;
                    if (i16 == 1) {
                        mVar4.C(-1074186060);
                        g.a(aVar3.f130843a, aVar, aVar4, mVar4, 0);
                        mVar4.f();
                    } else if (i16 != 2) {
                        mVar4.C(-1073545042);
                        r.b(aVar3, aVar, aVar4, mVar4, (i14 >> 3) & 14);
                        mVar4.f();
                    } else {
                        mVar4.C(-1073857429);
                        x.b(aVar3, aVar, aVar4, mVar4, (i14 >> 3) & 14);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
