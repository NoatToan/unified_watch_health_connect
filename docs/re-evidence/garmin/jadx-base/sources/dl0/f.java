package dl0;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import e23.l;
import e23.r;
import l72.p2;
import o4.m1;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import w52.a1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d f60286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f60287c;

    public /* synthetic */ f(zc.d dVar, l lVar, int i14) {
        this.f60285a = i14;
        this.f60286b = dVar;
        this.f60287c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:64:0x0169  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        int i14 = this.f60285a;
        m.a aVar = m.f135153a;
        l lVar = this.f60287c;
        zc.d dVar = this.f60286b;
        boolean z14 = false;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                m mVar = (m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= mVar.k(iIntValue) ? 32 : 16;
                }
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    x1 x1Var = n.f135158a;
                    a aVar2 = (a) dVar.a(iIntValue);
                    if (aVar2 == null) {
                        mVar.C(-1529980287);
                        mVar.f();
                    } else {
                        mVar.C(-1529980286);
                        p2 p2Var = p2.f111205a;
                        String str = aVar2.f60267b;
                        String str2 = aVar2.f60268c;
                        k.f60296a.getClass();
                        z3.e eVar = k.f60298c;
                        z3.e eVar2 = k.f60299d;
                        boolean zB = mVar.B(lVar) | mVar.B(aVar2);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new g(z14 ? 1 : 0, lVar, aVar2);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new g(z14 ? 1 : 0, lVar, aVar2);
                                mVar.K(objQ);
                            }
                        }
                        p2Var.h(str, str2, null, null, null, false, false, eVar, eVar2, null, (e23.a) objQ, mVar, 113246208, 0, 636);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 1:
                int iIntValue3 = ((Integer) obj2).intValue();
                m mVar2 = (m) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= mVar2.k(iIntValue3) ? 32 : 16;
                }
                if (mVar2.n(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    x1 x1Var2 = n.f135158a;
                    ds1.a aVar3 = (ds1.a) dVar.a(iIntValue3);
                    if (aVar3 != null) {
                        io1.e.c(aVar3, lVar, mVar2, ds1.a.f61090f);
                    }
                } else {
                    mVar2.e();
                }
                break;
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                m mVar3 = (m) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= mVar3.k(iIntValue5) ? 32 : 16;
                }
                if (mVar3.n(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    x1 x1Var3 = n.f135158a;
                    WorkoutDTO workoutDTO = (WorkoutDTO) dVar.a(iIntValue5);
                    if (workoutDTO == null) {
                        mVar3.C(-2077896082);
                        mVar3.f();
                    } else {
                        mVar3.C(-2077896081);
                        h4.r rVarE = u1.n.e(h4.r.S, p6.b.a(d92.b.f58623a, mVar3), m1.f128891a);
                        boolean zB2 = mVar3.B(lVar) | mVar3.r(workoutDTO);
                        Object objQ2 = mVar3.q();
                        if (zB2) {
                            obj5 = objQ2;
                            h62.i iVar = new h62.i(lVar, workoutDTO, 1);
                            mVar3.K(iVar);
                            obj5 = iVar;
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                obj5 = objQ2;
                                h62.i iVar2 = new h62.i(lVar, workoutDTO, 1);
                                mVar3.K(iVar2);
                                obj5 = iVar2;
                            }
                        }
                        obj5 = objQ2;
                        a1.a(workoutDTO, rVarE, (e23.a) obj5, null, mVar3, WorkoutDTO.P0 | 3072);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
