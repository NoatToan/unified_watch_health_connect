package lo;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class r3 {
    private r3() {
    }

    public static JSONObject a(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, am.x0 x0Var) {
        try {
            if (x0Var == am.x0.C) {
                return hVar.f0();
            }
            if (hVar.f29452e <= 0) {
                return am.z0.R(x0Var.f4358a) ? hVar.g0() : hVar.e0();
            }
            JSONObject jSONObject = new JSONObject();
            to.o oVar = hVar.f29455h;
            if (oVar != null) {
                jSONObject.put("activityTypeDTO", oVar.m());
            }
            return jSONObject;
        } catch (JSONException e4) {
            lc.u0.v(e4, new StringBuilder("Get activity json object error: "), com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "SummaryResponseBuilder2");
            return null;
        }
    }
}
