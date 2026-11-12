package bo2;

import android.content.DialogInterface;
import com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationActivity;
import e23.p;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlipayAppletInstallationActivity f19244b;

    public /* synthetic */ b(AlipayAppletInstallationActivity alipayAppletInstallationActivity, int i14) {
        this.f19243a = i14;
        this.f19244b = alipayAppletInstallationActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f19243a;
        AlipayAppletInstallationActivity alipayAppletInstallationActivity = this.f19244b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                AlipayAppletInstallationActivity.a aVar = AlipayAppletInstallationActivity.f51097j;
                dialogInterface.getClass();
                alipayAppletInstallationActivity.setResult(0);
                alipayAppletInstallationActivity.finish();
                break;
            default:
                alipayAppletInstallationActivity.setResult(0);
                alipayAppletInstallationActivity.finish();
                break;
        }
        return Unit.INSTANCE;
    }
}
