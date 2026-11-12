package kz1;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.trainigplanintegration.EventTrainingPlanIntegrationActivity;
import e23.p;
import fg0.k;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import ww1.g;
import z02.b;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EventTrainingPlanIntegrationActivity f107786b;

    public /* synthetic */ a(EventTrainingPlanIntegrationActivity eventTrainingPlanIntegrationActivity, int i14) {
        this.f107785a = i14;
        this.f107786b = eventTrainingPlanIntegrationActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strR;
        int i14 = this.f107785a;
        EventTrainingPlanIntegrationActivity eventTrainingPlanIntegrationActivity = this.f107786b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                EventTrainingPlanIntegrationActivity.a aVar = EventTrainingPlanIntegrationActivity.f46267e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    b.a(false, null, null, null, false, f.c(-845412516, new a(eventTrainingPlanIntegrationActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                EventTrainingPlanIntegrationActivity.a aVar2 = EventTrainingPlanIntegrationActivity.f46267e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    k kVar = eventTrainingPlanIntegrationActivity.f46268a;
                    if (kVar != null) {
                        Parcelable.Creator<k> creator = k.CREATOR;
                        strR = kVar.r(false);
                        if (strR == null) {
                            strR = "";
                        }
                    } else {
                        strR = "";
                    }
                    eventTrainingPlanIntegrationActivity.ca(strR, eventTrainingPlanIntegrationActivity.f46269b, mVar2, g.f187762f << 3);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
