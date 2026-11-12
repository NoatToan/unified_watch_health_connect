package cc0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.ArrayList;
import jw.z;
import org.json.JSONObject;
import vg1.r0;

/* JADX INFO: loaded from: classes8.dex */
public class g extends com.garmin.android.library.backgroundtaskmanagement.b<dc0.a> {
    public g(long j8, r0 r0Var, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new dc0.a());
        ArrayList arrayList = new ArrayList();
        if (r0Var.f178151a != null) {
            arrayList.add(new dc0.b(this, j8, r0Var.f178151a, new bb2.b(this, j8, 2)));
        }
        UserSettingsDTO userSettingsDTO = r0Var.f178152b;
        if (userSettingsDTO != null || r0Var.f178153c != null || r0Var.f178154d) {
            String string = userSettingsDTO != null ? userSettingsDTO.t1().toString() : null;
            JSONObject jSONObject = r0Var.f178153c;
            String string2 = jSONObject != null ? jSONObject.toString() : null;
            a0.h hVar = new a0.h(9, this, string);
            if (string2 != null) {
                arrayList.add(new z(this, string2, hVar));
            } else if (string != null) {
                arrayList.add(new z(this, string, hVar));
            } else {
                i2.f(a2.DEVICES, "SaveSettingsOperation", "Missing user setting to save");
            }
        }
        if (arrayList.isEmpty()) {
            i2.f(a2.DEVICES, "SaveSettingsOperation", "Nothing to save - Fix me!");
        } else {
            c(arrayList);
        }
    }
}
