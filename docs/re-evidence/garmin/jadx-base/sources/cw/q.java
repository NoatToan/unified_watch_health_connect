package cw;

import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import gw.g0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class q extends com.garmin.android.library.backgroundtaskmanagement.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q f55944b;

    private q() {
    }

    public static q N() {
        if (f55944b == null) {
            f55944b = new q();
        }
        return f55944b;
    }

    public final long M(com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b) {
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.k(this), interfaceC0995b);
    }

    public final long O(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b) {
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new g0(this, userSettingsDTO, jSONObject), interfaceC0995b);
    }
}
