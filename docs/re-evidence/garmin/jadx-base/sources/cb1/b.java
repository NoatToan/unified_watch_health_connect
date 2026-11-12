package cb1;

import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import org.json.JSONObject;
import p005kotlin.Unit;
import qb1.f;
import qb1.k;

/* JADX INFO: loaded from: classes9.dex */
public interface b {
    long a(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Unit> interfaceC0995b);

    Long b();

    Object c(k kVar);

    long d(f.c cVar);

    UserSettingsDTO getUserSettings();
}
