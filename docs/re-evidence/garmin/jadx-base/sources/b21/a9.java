package b21;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a9 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o13.h f14516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14518f;

    public /* synthetic */ a9(Object obj, boolean z14, o13.h hVar, Object obj2, Object obj3, int i14) {
        this.f14513a = i14;
        this.f14514b = obj;
        this.f14515c = z14;
        this.f14516d = hVar;
        this.f14517e = obj2;
        this.f14518f = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c5  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f14513a;
        int i15 = 0;
        Object obj5 = this.f14518f;
        Object obj6 = this.f14517e;
        o13.h hVar = this.f14516d;
        Object obj7 = this.f14514b;
        switch (i14) {
            case 0:
                lc.m0 m0Var = (lc.m0) obj7;
                lc.v vVar = (lc.v) obj2;
                p3.m mVar = (p3.m) obj3;
                int iB = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar);
                p3.x1 x1Var = p3.n.f135158a;
                u9.a(vVar, m0Var, this.f14515c, (x01.b) hVar, (x01.c) obj6, (x01.b) obj5, z3.f.c(-1223063956, new e9(m0Var, 2), mVar), mVar, ((iB >> 3) & 14) | 1572864);
                break;
            case 1:
                lc.m0 m0Var2 = (lc.m0) obj7;
                x01.b bVar = (x01.b) hVar;
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iB2 = androidx.room.a0.b((Integer) obj4, (r1.l) obj, vVar2);
                p3.x1 x1Var2 = p3.n.f135158a;
                u9.a(vVar2, m0Var2, this.f14515c, bVar, (x01.c) obj6, (x01.b) obj5, z3.f.c(369705535, new l9(vVar2, m0Var2, bVar, i15), mVar2), mVar2, ((iB2 >> 3) & 14) | 1572864);
                break;
            default:
                zc.d dVar = (zc.d) obj7;
                e23.l lVar = (e23.l) hVar;
                p3.p1 p1Var = (p3.p1) obj6;
                p3.p1 p1Var2 = (p3.p1) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                p3.m mVar3 = (p3.m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= mVar3.k(iIntValue) ? 32 : 16;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    Object objA = dVar.a(iIntValue);
                    objA.getClass();
                    WorkoutDTO workoutDTO = (WorkoutDTO) objA;
                    boolean zR = mVar3.r(workoutDTO);
                    Object objQ = mVar3.q();
                    p3.m.a aVar = p3.m.f135153a;
                    if (zR) {
                        objQ = new fk0.a(workoutDTO, 21, p1Var, p1Var2);
                        mVar3.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new fk0.a(workoutDTO, 21, p1Var, p1Var2);
                            mVar3.K(objQ);
                        }
                    }
                    e23.a aVar2 = (e23.a) objQ;
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarE = u1.n.e(l4.k.b(c2.l.z(aVar3, eVar.f97920e, eVar.f97918c), k2.i.a(j92.b.f97900c.f97911c)), j20.x.b(mVar3), o4.m1.f128891a);
                    if (this.f14515c) {
                        aVar2 = null;
                    }
                    e23.a aVar4 = aVar2;
                    boolean zB = mVar3.B(lVar) | mVar3.r(workoutDTO);
                    Object objQ2 = mVar3.q();
                    if (zB) {
                        objQ2 = new h62.i(lVar, workoutDTO, 0);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new h62.i(lVar, workoutDTO, 0);
                            mVar3.K(objQ2);
                        }
                    }
                    w52.a1.a(workoutDTO, rVarE, (e23.a) objQ2, aVar4, mVar3, WorkoutDTO.P0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
