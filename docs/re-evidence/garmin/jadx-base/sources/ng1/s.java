package ng1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class s implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f126006a;

    public s(q qVar) {
        this.f126006a = qVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        q qVar = this.f126006a;
        if (cVar == cVar2) {
            qVar.f126000n.x4(qVar.f125992f, "BaseUserSettings");
            Toast.makeText(qVar, R.string.msg_settings_saved_successfully, 0).show();
        }
        com.garmin.android.apps.connectmobile.g1.b(qVar, cVar);
        ((l80.b) KoinJavaComponent.get(l80.b.class)).n(qVar, qVar.f125992f, "BaseUserSettings");
        qVar.hideProgressOverlay();
        qVar.finish();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
    }
}
