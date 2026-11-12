package n62;

import com.garmin.android.apps.connectmobile.workouts.presentation.selectworkout.SelectWorkoutActivityActivity;
import e23.p;
import m52.k;
import mh1.i;
import o13.l;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f123879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectWorkoutActivityActivity f123880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f123881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f123882e;

    public /* synthetic */ a(k kVar, SelectWorkoutActivityActivity selectWorkoutActivityActivity, long j8, l lVar, int i14) {
        this.f123878a = i14;
        this.f123879b = kVar;
        this.f123880c = selectWorkoutActivityActivity;
        this.f123881d = j8;
        this.f123882e = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f123878a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                SelectWorkoutActivityActivity.a aVar = SelectWorkoutActivityActivity.f49549a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(1825602245, new a(this.f123879b, this.f123880c, this.f123881d, this.f123882e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                SelectWorkoutActivityActivity.a aVar2 = SelectWorkoutActivityActivity.f49549a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    c cVar = (c) this.f123882e.getValue();
                    SelectWorkoutActivityActivity selectWorkoutActivityActivity = this.f123880c;
                    boolean zR = mVar2.r(selectWorkoutActivityActivity);
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zR) {
                        objQ = new i(selectWorkoutActivityActivity, 25);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new i(selectWorkoutActivityActivity, 25);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(selectWorkoutActivityActivity);
                    long j8 = this.f123881d;
                    boolean zL = zR2 | mVar2.l(j8);
                    Object objQ2 = mVar2.q();
                    if (zL) {
                        objQ2 = new bb2.b(selectWorkoutActivityActivity, j8, 8);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new bb2.b(selectWorkoutActivityActivity, j8, 8);
                            mVar2.K(objQ2);
                        }
                    }
                    b.d(cVar, this.f123879b, aVar4, (e23.l) objQ2, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
