package ng1;

import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class r implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<UserSettingsDTO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f126005a;

    public r(q qVar) {
        this.f126005a = qVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        q qVar = this.f126005a;
        qVar.hideProgressOverlay();
        if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS || qVar.f125995i == null) {
            com.garmin.android.apps.connectmobile.g1.b(qVar, cVar);
            qVar.finish();
        } else {
            qVar.showProgressOverlay();
            Object[] objArr = {String.valueOf(qVar.f125992f)};
            new lj0.j(qVar.f126001o).b(new lj0.i(lj0.f.f112996x, objArr));
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, UserSettingsDTO userSettingsDTO) {
        UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
        q qVar = this.f126005a;
        qVar.f125995i = userSettingsDTO2;
        qVar.f125996j = userSettingsDTO2.t1();
    }
}
