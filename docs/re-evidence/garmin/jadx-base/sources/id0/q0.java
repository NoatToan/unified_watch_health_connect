package id0;

import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid0/q0;", "Lc22/o0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 implements c22.o0 {
    @Override // c22.o0
    public final long a(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> interfaceC0995b) {
        interfaceC0995b.getClass();
        return cw.q.N().O(userSettingsDTO, jSONObject, interfaceC0995b);
    }

    @Override // c22.o0
    public final UserSettingsDTO b() {
        return GCMSettingManager.s();
    }
}
