package dd0;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.PersonalInfoWizardActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PersonalInfoWizardActivity f59176b;

    public /* synthetic */ m(PersonalInfoWizardActivity personalInfoWizardActivity, int i14) {
        this.f59175a = i14;
        this.f59176b = personalInfoWizardActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f59175a;
        PersonalInfoWizardActivity personalInfoWizardActivity = this.f59176b;
        switch (i15) {
            case 0:
                PersonalInfoWizardActivity.a aVar = PersonalInfoWizardActivity.f34487g;
                personalInfoWizardActivity.finish();
                break;
            case 1:
                PersonalInfoWizardActivity.a aVar2 = PersonalInfoWizardActivity.f34487g;
                dialogInterface.dismiss();
                personalInfoWizardActivity.ga();
                break;
            default:
                PersonalInfoWizardActivity.a aVar3 = PersonalInfoWizardActivity.f34487g;
                dialogInterface.dismiss();
                personalInfoWizardActivity.setResult(0);
                personalInfoWizardActivity.finish();
                break;
        }
    }
}
