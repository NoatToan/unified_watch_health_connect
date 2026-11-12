package ig1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class h0 extends fb2.t<UserSettingsDTO, UserSettingsDTO.c> {
    public h0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        fb2.f.a((UserSettingsDTO) obj, "Model is required");
        return true;
    }

    @Override // fb2.t
    public final Map<UserSettingsDTO.c, CharSequence> q(UserSettingsDTO.c[] cVarArr) {
        UserSettingsDTO.c[] cVarArr2 = cVarArr;
        HashMap map = new HashMap();
        if (cVarArr2 != null) {
            for (UserSettingsDTO.c cVar : cVarArr2) {
                map.put(cVar, b(cVar.f43538b));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final UserSettingsDTO.c r(UserSettingsDTO userSettingsDTO) {
        UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
        fb2.f.a(userSettingsDTO2, "Model is required");
        return userSettingsDTO2.G();
    }

    @Override // fb2.t
    public final int t() {
        return R.id.user_settings_gender;
    }

    @Override // fb2.t
    public final String u() {
        return b(R.string.lbl_gender);
    }

    @Override // fb2.t
    public final UserSettingsDTO.c[] v(UserSettingsDTO userSettingsDTO) {
        return new UserSettingsDTO.c[]{UserSettingsDTO.c.MALE, UserSettingsDTO.c.FEMALE, UserSettingsDTO.c.NOT_SPECIFIED};
    }

    @Override // fb2.t
    public final void w(UserSettingsDTO.c cVar, UserSettingsDTO userSettingsDTO) {
        UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
        fb2.f.a(userSettingsDTO2, "Model is required");
        userSettingsDTO2.P0(cVar);
    }
}
