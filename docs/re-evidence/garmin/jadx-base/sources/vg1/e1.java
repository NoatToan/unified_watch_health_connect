package vg1;

import am.a2;
import android.os.Bundle;
import c22.t3;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class e1 implements a0<UserSettingsDTO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UserSettingsDTO f178099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f178100b;

    @Override // vg1.a0
    public final void b(Bundle bundle) {
        if (bundle != null) {
            UserSettingsDTO userSettingsDTO = (UserSettingsDTO) bundle.getParcelable("GCM_user_settings");
            this.f178099a = userSettingsDTO;
            if (userSettingsDTO != null) {
                this.f178100b = userSettingsDTO.t1();
            } else {
                this.f178100b = null;
            }
        }
    }

    @Override // vg1.a0
    public final void c(dc0.a aVar) {
        if (aVar != null) {
            UserSettingsDTO userSettingsDTO = aVar.f59107b;
            this.f178099a = userSettingsDTO;
            if (userSettingsDTO != null) {
                this.f178100b = userSettingsDTO.t1();
            } else {
                this.f178100b = null;
            }
        }
    }

    @Override // vg1.a0
    /* JADX INFO: renamed from: d */
    public final UserSettingsDTO getF178111a() {
        return this.f178099a;
    }

    @Override // vg1.a0
    public final boolean e() {
        UserSettingsDTO userSettingsDTO = this.f178099a;
        return (userSettingsDTO == null || this.f178100b == null || t3.b(userSettingsDTO.t1(), this.f178100b) == null) ? false : true;
    }

    @Override // vg1.a0
    public final void f(r0 r0Var) {
        UserSettingsDTO userSettingsDTO = this.f178099a;
        if (userSettingsDTO == null || this.f178100b == null) {
            return;
        }
        JSONObject jSONObjectB = t3.b(userSettingsDTO.t1(), this.f178100b);
        if (jSONObjectB != null) {
            r0Var.f178153c = jSONObjectB;
        }
        r0Var.f178152b = this.f178099a;
    }

    @Override // vg1.a0
    public final int g() {
        return 4;
    }

    @Override // vg1.a0
    public final void h(Bundle bundle) {
        a2.b(bundle, "GCM_user_settings", this.f178099a);
    }

    @Override // vg1.a0
    public final boolean hasModel() {
        return this.f178099a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg1.a0
    public final void i(DeviceSettingsDTO deviceSettingsDTO) {
        UserSettingsDTO userSettingsDTO = (UserSettingsDTO) deviceSettingsDTO;
        if (userSettingsDTO != null) {
            this.f178099a = userSettingsDTO;
        }
    }
}
