package dd0;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.PersonalInfoWizardActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import lc.u0;
import p005kotlin.Unit;
import q92.v;
import q92.x;
import v92.e0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PersonalInfoWizardActivity f59178b;

    public /* synthetic */ n(PersonalInfoWizardActivity personalInfoWizardActivity, int i14) {
        this.f59177a = i14;
        this.f59178b = personalInfoWizardActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f59177a;
        PersonalInfoWizardActivity personalInfoWizardActivity = this.f59178b;
        int i15 = 1;
        switch (i14) {
            case 0:
                v vVar = (v) obj;
                PersonalInfoWizardActivity.a aVar = PersonalInfoWizardActivity.f34487g;
                PersonalInfoWizardActivity personalInfoWizardActivity2 = this.f59178b;
                if (vVar == null) {
                    personalInfoWizardActivity2.hideProgressOverlay();
                    personalInfoWizardActivity2.displayFailedMessage();
                    personalInfoWizardActivity2.ga();
                } else if (q92.c.c(vVar)) {
                    a2 a2Var = a2.CONSENT;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "PersonalInfoWizardActivity", "showConsentFragment()");
                    personalInfoWizardActivity2.setTitle(personalInfoWizardActivity2.getString(R.string.golf_lbl_storage_processing_consent_title));
                    p92.o.x(p92.o.f136619a, personalInfoWizardActivity2, personalInfoWizardActivity2, new n(personalInfoWizardActivity2, i15), personalInfoWizardActivity2.f34490e, personalInfoWizardActivity2.f34491f, x.DI_CONNECT_UPLOAD, vVar, null, e0.UPDATE_DEVICE_UPLOAD_AUTOMATICALLY, s3.b(), false, 2368);
                } else {
                    personalInfoWizardActivity2.ga();
                }
                return Unit.INSTANCE;
            case 1:
                Fragment fragment = (Fragment) obj;
                PersonalInfoWizardActivity.a aVar2 = PersonalInfoWizardActivity.f34487g;
                fragment.getClass();
                androidx.fragment.app.v supportFragmentManager = personalInfoWizardActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                aVar3.l(R.id.device_setup_wizard_fragment, fragment, null);
                aVar3.e();
                return Unit.INSTANCE;
            default:
                g3 g3Var = (g3) obj;
                PersonalInfoWizardActivity.a aVar4 = PersonalInfoWizardActivity.f34487g;
                int i16 = PersonalInfoWizardActivity.b.f34492a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    com.garmin.android.apps.connectmobile.devices.model.l lVar = personalInfoWizardActivity.f59152a;
                    UserSettingsDTO userSettingsDTO = (UserSettingsDTO) g3Var.f35301b;
                    com.garmin.android.apps.connectmobile.devices.setup.wizard.g gVar = new com.garmin.android.apps.connectmobile.devices.setup.wizard.g();
                    Bundle bundle = new Bundle(2);
                    bundle.putParcelable("DEVICE_DTO", lVar);
                    bundle.putParcelable("PERSONAL_INFO_JSON", userSettingsDTO);
                    gVar.setArguments(bundle);
                    personalInfoWizardActivity.hideProgressOverlay();
                    androidx.fragment.app.v supportFragmentManager2 = personalInfoWizardActivity.getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(supportFragmentManager2);
                    aVar5.l(R.id.device_setup_wizard_fragment, gVar, null);
                    aVar5.e();
                } else if (i16 == 2) {
                    new androidx.appcompat.app.e.a(personalInfoWizardActivity).setTitle("").setMessage(R.string.msg_error_retrieving_user_profile_data).setPositiveButton(R.string.lbl_try_again, new m(personalInfoWizardActivity, 1)).setNegativeButton(android.R.string.cancel, new m(personalInfoWizardActivity, 2)).show();
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    int iE = personalInfoWizardActivity.f59153b.E();
                    cd0.g gVar2 = personalInfoWizardActivity.f59153b;
                    String string = gVar2.f26813a.getString(R.string.msg_device_setup_personal_info_processing, gVar2.f26814b.getF143516f());
                    j jVar = new j();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("LOADING_IMAGE_RES_ID", iE);
                    bundle2.putString("LOADING_MESSAGE", string);
                    jVar.setArguments(bundle2);
                    personalInfoWizardActivity.hideProgressOverlay();
                    androidx.fragment.app.v supportFragmentManager3 = personalInfoWizardActivity.getSupportFragmentManager();
                    supportFragmentManager3.getClass();
                    androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(supportFragmentManager3);
                    aVar6.l(R.id.device_setup_wizard_fragment, jVar, null);
                    aVar6.e();
                }
                return Unit.INSTANCE;
        }
    }
}
