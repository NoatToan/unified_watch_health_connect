package zs;

import com.garmin.android.apps.connectmobile.activityrecording.presentation.ActivityRecordingActivity;
import dt.e;
import e23.l;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import yw2.h;
import z3.f;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityRecordingActivity f206781b;

    public /* synthetic */ a(ActivityRecordingActivity activityRecordingActivity, int i14) {
        this.f206780a = i14;
        this.f206781b = activityRecordingActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f206780a;
        ActivityRecordingActivity activityRecordingActivity = this.f206781b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ActivityRecordingActivity.a aVar = ActivityRecordingActivity.f30163b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(-486798420, new a(activityRecordingActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ActivityRecordingActivity.a aVar2 = ActivityRecordingActivity.f30163b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    c cVar = (c) activityRecordingActivity.f30164a.getValue();
                    boolean zR = mVar2.r(activityRecordingActivity);
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zR) {
                        objQ = new b(activityRecordingActivity, 1);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new b(activityRecordingActivity, 1);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(activityRecordingActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new h(activityRecordingActivity, 21);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new h(activityRecordingActivity, 21);
                            mVar2.K(objQ2);
                        }
                    }
                    e.a(cVar, aVar4, (l) objQ2, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
