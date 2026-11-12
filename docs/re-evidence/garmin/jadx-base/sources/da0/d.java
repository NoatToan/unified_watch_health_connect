package da0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.reschedule.RescheduleSTPWorkoutActivity;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;
import vd0.o1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f58686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f58687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f58688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f58689e;

    public /* synthetic */ d(oe0.s sVar, long j8, e23.a aVar, e23.a aVar2, int i14) {
        this.f58685a = 9;
        this.f58687c = sVar;
        this.f58686b = j8;
        this.f58688d = aVar;
        this.f58689e = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58685a;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f58689e;
        Object obj4 = this.f58688d;
        Object obj5 = this.f58687c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                f.d((o90.a) obj5, (u4.d) obj4, this.f58686b, (h4.r) obj3, (p3.m) obj, p0.t(3073));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ho.w.a((ho.y) obj5, (e23.a) obj4, this.f58686b, (e23.l) obj3, (p3.m) obj, p0.t(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ia0.a.b(this.f58686b, (h90.a) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                break;
            case 3:
                RescheduleSTPWorkoutActivity rescheduleSTPWorkoutActivity = (RescheduleSTPWorkoutActivity) obj5;
                Long l14 = (Long) obj4;
                WorkoutScheduleDTO workoutScheduleDTO = (WorkoutScheduleDTO) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                RescheduleSTPWorkoutActivity.a aVar2 = RescheduleSTPWorkoutActivity.f49530b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1885946451, new es.a(rescheduleSTPWorkoutActivity, l14, this.f58686b, workoutScheduleDTO, s9.c.c(rescheduleSTPWorkoutActivity.ca().f110550g, mVar), s9.c.c(rescheduleSTPWorkoutActivity.ca().f110546c, mVar), s9.c.c(rescheduleSTPWorkoutActivity.ca().f110548e, mVar)), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 4:
                hz.d dVar = (hz.d) obj5;
                String str = (String) obj4;
                a10.a aVar3 = (a10.a) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    o4.d0 d0VarA = o4.d0.a(this.f58686b);
                    String strValueOf = String.valueOf((int) dVar.f86389b);
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new m30.n(20);
                        mVar2.K(objQ);
                    }
                    m92.y.b(d0VarA, strValueOf, str, oi0.c.B(str, (e23.l) objQ, mVar2), aVar3.f242a.getString(R.string.activities_respiration_rate), null, mVar2, 384, 32);
                } else {
                    mVar2.e();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                me1.i.b((hz.d) obj5, (a10.a) obj4, (jz.a) obj3, this.f58686b, (p3.m) obj, p0.t(585));
                break;
            case 6:
                p1 p1Var = (p1) obj5;
                w4.a aVar4 = (w4.a) obj4;
                e23.a aVar5 = (e23.a) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    zf2.b bVar = (zf2.b) p1Var.getF182175a();
                    Object objQ2 = mVar3.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new m30.n(29);
                        mVar3.K(objQ2);
                    }
                    r1.b.a(bVar, null, (e23.l) objQ2, null, null, null, z3.f.c(1691765825, new dk0.j(aVar4, this.f58686b, aVar5, p1Var, 1), mVar3), mVar3, 1573248, 58);
                } else {
                    mVar3.e();
                }
                break;
            case 7:
                k2.h hVar = (k2.h) obj5;
                s11.d dVar2 = (s11.d) obj4;
                e23.l lVar = (e23.l) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    vx.c.a(l4.k.b(h4.r.S, hVar), Long.valueOf(dVar2.f155893o), dVar2.f155887i, dVar2.f155881c, dVar2.f155882d, true, this.f58686b, lVar, mVar4, 196608, 0);
                } else {
                    mVar4.e();
                }
                break;
            case 8:
                k31.c cVar = (k31.c) obj5;
                d31.c cVar2 = (d31.c) obj4;
                e23.l lVar2 = (e23.l) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    r31.f.b(cVar, cVar2, this.f58686b, null, lVar2, mVar5, 0, 0);
                } else {
                    mVar5.e();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                o1.a((oe0.s) obj5, this.f58686b, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(9));
                break;
            default:
                ((Integer) obj2).getClass();
                y31.b.a(this.f58686b, (String) obj5, (String) obj4, (String) obj3, (p3.m) obj, p0.t(24577));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(long j8, Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f58685a = i15;
        this.f58686b = j8;
        this.f58687c = obj;
        this.f58688d = obj2;
        this.f58689e = obj3;
    }

    public /* synthetic */ d(hz.d dVar, a10.a aVar, jz.a aVar2, long j8, int i14) {
        this.f58685a = 5;
        this.f58687c = dVar;
        this.f58688d = aVar;
        this.f58689e = aVar2;
        this.f58686b = j8;
    }

    public /* synthetic */ d(Object obj, Object obj2, long j8, Object obj3, int i14) {
        this.f58685a = i14;
        this.f58687c = obj;
        this.f58688d = obj2;
        this.f58686b = j8;
        this.f58689e = obj3;
    }

    public /* synthetic */ d(Object obj, Object obj2, long j8, Object obj3, int i14, int i15) {
        this.f58685a = i15;
        this.f58687c = obj;
        this.f58688d = obj2;
        this.f58686b = j8;
        this.f58689e = obj3;
    }

    public /* synthetic */ d(long j8, hz.d dVar, String str, a10.a aVar) {
        this.f58685a = 4;
        this.f58686b = j8;
        this.f58687c = dVar;
        this.f58688d = str;
        this.f58689e = aVar;
    }
}
