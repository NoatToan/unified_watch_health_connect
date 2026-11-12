package rx1;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dy1.v f154953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p f154954c;

    public /* synthetic */ e(dy1.v vVar, e23.p pVar, int i14) {
        this.f154952a = i14;
        this.f154953b = vVar;
        this.f154954c = pVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f154952a;
        dy1.v vVar = this.f154953b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    qx1.j.a(null, y.Q(mVar, R.string.workout_step_type_cooldown), vVar.f61643d.f61639a, this.f154954c, null, mVar, 0, 17);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    qx1.j.a(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7), y.Q(mVar2, R.string.workout_step_type_warmup), vVar.f61641b.f61639a, this.f154954c, null, mVar2, 0, 16);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    qx1.j.a(null, y.Q(mVar3, R.string.workout_step_type_warmup), vVar.f61641b.f61639a, this.f154954c, null, mVar3, 0, 17);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    qx1.j.a(null, y.Q(mVar4, R.string.lbl_cooldown), vVar.f61643d.f61639a, this.f154954c, null, mVar4, 0, 17);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    qx1.j.a(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7), y.Q(mVar5, R.string.workout_step_type_warmup), vVar.f61641b.f61639a, this.f154954c, null, mVar5, 0, 16);
                } else {
                    mVar5.e();
                }
                break;
            default:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    qx1.j.a(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7), y.Q(mVar6, R.string.workout_step_type_cooldown), vVar.f61643d.f61639a, this.f154954c, null, mVar6, 0, 16);
                } else {
                    mVar6.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
