package c22;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/n0;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f23167a = new n0();

    private n0() {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    public static final String a(JSONObject jSONObject, JSONObject jSONObject2, ArrayList arrayList) {
        JSONObject jSONObject3;
        f23167a.getClass();
        if (jSONObject == null || jSONObject2 == null) {
            jSONObject3 = null;
        } else {
            jSONObject3 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if (p005kotlin.jvm.internal.s.g(next, "alarms")) {
                        jSONObject3.put(next, k0.d(k0.a(k0.c(jSONObject2.optJSONArray("alarms")), k0.c(jSONObject.optJSONArray("alarms")))));
                    } else if (p005kotlin.jvm.internal.s.g(next, "dndEnabled")) {
                        jSONObject3.put(next, jSONObject.opt(next));
                    } else {
                        Object objOpt = jSONObject.opt(next);
                        if (arrayList == null || !arrayList.contains(next)) {
                            Object objOpt2 = jSONObject2.opt(next);
                            if (objOpt != null && (objOpt2 == null || !p005kotlin.jvm.internal.s.g(objOpt.toString(), objOpt2.toString()))) {
                                jSONObject3.put(next, objOpt);
                            }
                            Unit unit = Unit.INSTANCE;
                        } else {
                            jSONObject3.put(next, objOpt);
                        }
                    }
                } catch (JSONException e4) {
                    String strN = fb1.c.n("Error creating delta JSONObject. ", e4.getMessage());
                    com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    aVar.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "DeviceSettingsJSONUtils", strN);
                }
            }
            if (jSONObject3.length() == 0) {
                jSONObject3 = null;
            }
        }
        if (jSONObject3 != null) {
            return jSONObject3.toString();
        }
        return null;
    }

    public static final boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            if (jSONObject.length() != jSONObject2.length()) {
                return true;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject(next);
                String strOptString = jSONObject.optString(next);
                String strOptString2 = jSONObject2.optString(next);
                if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject2 == null) {
                    if (!TextUtils.equals(strOptString, strOptString2)) {
                        return true;
                    }
                } else if (b(jSONObjectOptJSONObject, jSONObjectOptJSONObject2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
