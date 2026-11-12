package jp2;

import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayCardVerificationActivity f99917b;

    public /* synthetic */ b(FitPayCardVerificationActivity fitPayCardVerificationActivity, int i14) {
        this.f99916a = i14;
        this.f99917b = fitPayCardVerificationActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f99916a;
        FitPayCardVerificationActivity fitPayCardVerificationActivity = this.f99917b;
        switch (i14) {
            case 0:
                FitPayCardVerificationActivity.b bVar = FitPayCardVerificationActivity.f51449m;
                hn2.c.U9(fitPayCardVerificationActivity, fitPayCardVerificationActivity, null, 12);
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                cVar.getClass();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(fitPayCardVerificationActivity, aVar, null);
                break;
            case 1:
                FitPayCardVerificationActivity.b bVar2 = FitPayCardVerificationActivity.f51449m;
                fitPayCardVerificationActivity.da();
                break;
            default:
                FitPayCardVerificationActivity.b bVar3 = FitPayCardVerificationActivity.f51449m;
                fitPayCardVerificationActivity.da();
                break;
        }
        return Unit.INSTANCE;
    }
}
