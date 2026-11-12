package z10;

import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.ConsentDeleteDataActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConsentDeleteDataActivity f201215b;

    public /* synthetic */ q0(ConsentDeleteDataActivity consentDeleteDataActivity, int i14) {
        this.f201214a = i14;
        this.f201215b = consentDeleteDataActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f201214a;
        ConsentDeleteDataActivity consentDeleteDataActivity = this.f201215b;
        switch (i14) {
            case 0:
                q92.v vVar = (q92.v) obj;
                ConsentDeleteDataActivity.a aVar = ConsentDeleteDataActivity.f32160d;
                com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "ConsentDeleteDataActivity", "onCreate() consentStatus from server: " + vVar);
                consentDeleteDataActivity.aa(vVar);
                break;
            default:
                Fragment fragment = (Fragment) obj;
                ConsentDeleteDataActivity.a aVar3 = ConsentDeleteDataActivity.f32160d;
                fragment.getClass();
                androidx.fragment.app.v supportFragmentManager = consentDeleteDataActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(supportFragmentManager);
                aVar4.l(R.id.fragment_container_view, fragment, null);
                aVar4.e();
                break;
        }
        return Unit.INSTANCE;
    }
}
