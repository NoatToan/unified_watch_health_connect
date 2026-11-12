package lo;

import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;

/* JADX INFO: loaded from: classes7.dex */
public class s implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<com.garmin.android.apps.connectmobile.courses.model.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f113946a;

    public s(t tVar) {
        this.f113946a = tVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        g22.e.f(this.f113946a);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, com.garmin.android.apps.connectmobile.courses.model.e eVar2) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar3 = eVar2;
        f0 f0Var = this.f113946a.f113949a;
        f0Var.getClass();
        if (eVar3 != null) {
            f0Var.f113806m2 = new com.garmin.android.apps.connectmobile.courses.model.d(eVar3);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = f0Var.O;
            if (gCMComplexTwoLineButton == null || gCMComplexTwoLineButton.getVisibility() != 0) {
                return;
            }
            f0.v0(f0Var.O, eVar3.courseName);
        }
    }
}
