package ho2;

import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PushProvMainActivity f84840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a f84841c;

    public /* synthetic */ e(PushProvMainActivity pushProvMainActivity, com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar, int i14) {
        this.f84839a = i14;
        this.f84840b = pushProvMainActivity;
        this.f84841c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f84839a;
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar = this.f84841c;
        PushProvMainActivity pushProvMainActivity = this.f84840b;
        switch (i14) {
            case 0:
                PushProvMainActivity.a aVar2 = PushProvMainActivity.f51161t;
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar, null);
                break;
            default:
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                a aVar3 = new a(pushProvMainActivity, 8);
                cVar.getClass();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar, aVar3);
                break;
        }
        return Unit.INSTANCE;
    }
}
