package hv;

import androidx.fragment.app.Fragment;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.bic.device.TellUsMoreActivity;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;
import q92.v;
import q92.x;
import v92.e0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TellUsMoreActivity f85776b;

    public /* synthetic */ l(TellUsMoreActivity tellUsMoreActivity, int i14) {
        this.f85775a = i14;
        this.f85776b = tellUsMoreActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f85775a) {
            case 0:
                v vVar = (v) obj;
                TellUsMoreActivity.a aVar = TellUsMoreActivity.f30729i;
                TellUsMoreActivity tellUsMoreActivity = this.f85776b;
                if (vVar == null) {
                    tellUsMoreActivity.hideProgressOverlay();
                    tellUsMoreActivity.displayFailedMessage();
                    tellUsMoreActivity.da();
                } else if (q92.c.c(vVar)) {
                    a2 a2Var = a2.CONSENT;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "TellUsMoreActivity", "showConsentFragment()");
                    tellUsMoreActivity.setTitle(tellUsMoreActivity.getString(R.string.golf_lbl_storage_processing_consent_title));
                    p92.o.x(p92.o.f136619a, tellUsMoreActivity, tellUsMoreActivity, new l(tellUsMoreActivity, 1), tellUsMoreActivity.f30733g, tellUsMoreActivity.f30734h, x.DI_CONNECT_UPLOAD, vVar, null, e0.UPDATE_DEVICE_UPLOAD_AUTOMATICALLY, s3.b(), false, 2368);
                } else {
                    tellUsMoreActivity.da();
                }
                break;
            default:
                Fragment fragment = (Fragment) obj;
                TellUsMoreActivity.a aVar2 = TellUsMoreActivity.f30729i;
                fragment.getClass();
                androidx.fragment.app.v supportFragmentManager = this.f85776b.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                aVar3.l(R.id.content_frame, fragment, null);
                aVar3.e();
                break;
        }
        return Unit.INSTANCE;
    }
}
