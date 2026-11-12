package vg1;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class j0 implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<dc0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f178114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f178115b;

    public j0(k0 k0Var, g0 g0Var) {
        this.f178115b = k0Var;
        this.f178114a = g0Var;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, dc0.a aVar) {
        dc0.a aVar2 = aVar;
        k0 k0Var = this.f178115b;
        ArrayList arrayList = k0Var.f178131m;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a0) it.next()).c(aVar2);
            }
        }
        DeviceSettingsDTO deviceSettingsDTO = aVar2.f59106a;
        if (deviceSettingsDTO != null && deviceSettingsDTO.f33910z1 != null) {
            ((zb0.e) KoinJavaComponent.get(zb0.e.class)).b(k0Var.f178120b, deviceSettingsDTO.F());
        }
        f0 f0Var = (f0) ((tr2.b) this.f178114a).f166132b;
        int i14 = f0.f178101h;
        f0Var.da();
        f0Var.ja();
        f0Var.ka();
        f0Var.la();
    }
}
