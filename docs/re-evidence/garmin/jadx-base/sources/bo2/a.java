package bo2;

import com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationActivity;
import o53.f0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlipayAppletInstallationActivity f19242b;

    public /* synthetic */ a(AlipayAppletInstallationActivity alipayAppletInstallationActivity, int i14) {
        this.f19241a = i14;
        this.f19242b = alipayAppletInstallationActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f19241a;
        AlipayAppletInstallationActivity alipayAppletInstallationActivity = this.f19242b;
        switch (i14) {
            case 0:
                AlipayAppletInstallationActivity.a aVar = AlipayAppletInstallationActivity.f51097j;
                return alipayAppletInstallationActivity;
            default:
                AlipayAppletInstallationActivity.a aVar2 = AlipayAppletInstallationActivity.f51097j;
                alipayAppletInstallationActivity.getClass();
                gl.b.I(f0.w(alipayAppletInstallationActivity), null, new com.garmin.feature.garminpay.providers.gpay.alipay.a(alipayAppletInstallationActivity, null), 3);
                return Unit.INSTANCE;
        }
    }
}
