package aw1;

import com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FBTPlanWizardActivity f13322b;

    public /* synthetic */ a(FBTPlanWizardActivity fBTPlanWizardActivity, int i14) {
        this.f13321a = i14;
        this.f13322b = fBTPlanWizardActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f13321a;
        FBTPlanWizardActivity fBTPlanWizardActivity = this.f13322b;
        switch (i14) {
            case 0:
                FBTPlanWizardActivity.a aVar = FBTPlanWizardActivity.f45530e;
                if (fBTPlanWizardActivity.ca().H5().f61437c) {
                    dw1.a aVarH5 = fBTPlanWizardActivity.ca().H5();
                    aVarH5.f61435a.setValue(aVarH5.f61442h);
                } else {
                    fBTPlanWizardActivity.setResult(2);
                    fBTPlanWizardActivity.finish();
                }
                break;
            default:
                FBTPlanWizardActivity.a aVar2 = FBTPlanWizardActivity.f45530e;
                fBTPlanWizardActivity.ca().Q1.setValue(null);
                break;
        }
        return Unit.INSTANCE;
    }
}
