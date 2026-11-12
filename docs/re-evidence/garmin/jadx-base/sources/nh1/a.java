package nh1;

import androidx.lifecycle.z0;
import ch1.t0;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.devices.indexbpm.IndexBpmAppearanceActivity;
import lc.u0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IndexBpmAppearanceActivity f126142b;

    public /* synthetic */ a(IndexBpmAppearanceActivity indexBpmAppearanceActivity, int i14) {
        this.f126141a = i14;
        this.f126142b = indexBpmAppearanceActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f126141a;
        IndexBpmAppearanceActivity indexBpmAppearanceActivity = this.f126142b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                IndexBpmAppearanceActivity.ja(indexBpmAppearanceActivity, g3Var);
                return;
            default:
                int i15 = IndexBpmAppearanceActivity.f43074t;
                g3Var.getClass();
                int i16 = IndexBpmAppearanceActivity.b.f43079a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    indexBpmAppearanceActivity.showProgressOverlay();
                    return;
                }
                if (i16 == 2) {
                    indexBpmAppearanceActivity.hideProgressOverlay();
                    indexBpmAppearanceActivity.displayFailedMessage();
                    return;
                }
                if (i16 != 3) {
                    u0.r();
                    return;
                }
                indexBpmAppearanceActivity.hideProgressOverlay();
                DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) g3Var.f35301b;
                if (deviceSettingsDTO != null) {
                    indexBpmAppearanceActivity.f43078r = deviceSettingsDTO.B;
                    indexBpmAppearanceActivity.f43077q = deviceSettingsDTO;
                    t0 t0Var = indexBpmAppearanceActivity.f43076p;
                    if (t0Var != null) {
                        t0Var.m(t0Var.g(indexBpmAppearanceActivity, deviceSettingsDTO));
                        return;
                    } else {
                        s.m("displayNameField");
                        throw null;
                    }
                }
                return;
        }
    }
}
