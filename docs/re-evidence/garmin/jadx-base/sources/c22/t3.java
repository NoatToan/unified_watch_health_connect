package c22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/t3;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t3 f23255a = new t3();

    private t3() {
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, List list) {
        if (jSONObject != null && jSONObject2 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                Object objOpt2 = jSONObject2.opt(next);
                if (list != null && list.contains(next)) {
                    next.getClass();
                    arrayList.add(next);
                } else if (objOpt == null) {
                    if (objOpt2 != null) {
                        next.getClass();
                        arrayList.add(next);
                    }
                } else if (objOpt2 == null || !p005kotlin.jvm.internal.s.g(objOpt.toString(), objOpt2.toString())) {
                    next.getClass();
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                try {
                    return new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
                } catch (JSONException e4) {
                    String strN = fb1.c.n("Error creating delta JSONObject. ", e4.getMessage());
                    com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    aVar.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "UserSettingsJSONUtils", strN);
                }
            }
        }
        return null;
    }

    public static final JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        f23255a.getClass();
        return c(jSONObject, jSONObject2, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0055 A[Catch: JSONException -> 0x003b, TryCatch #0 {JSONException -> 0x003b, blocks: (B:11:0x001e, B:18:0x0032, B:29:0x004f, B:31:0x0055, B:33:0x005b, B:34:0x005f, B:23:0x003d, B:26:0x0046, B:35:0x006b, B:37:0x0071, B:39:0x0077, B:40:0x007b, B:43:0x0083, B:45:0x0091, B:46:0x0094), top: B:53:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x005f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static JSONObject c(JSONObject jSONObject, JSONObject jSONObject2, List list) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next != null) {
                try {
                    int iHashCode = next.hashCode();
                    if (iHashCode != -266964459) {
                        if (iHashCode != 8971247) {
                            if (iHashCode == 328202700 && next.equals("userSleep")) {
                                jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                                if (list == null && list.contains(next)) {
                                    jSONObject3.put(next, jSONObjectOptJSONObject);
                                } else {
                                    jSONObject3.put(next, a(jSONObjectOptJSONObject, jSONObject2.optJSONObject(next), list));
                                }
                            }
                        } else if (next.equals("userMenstrualCycleSettings")) {
                            jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                            if (list == null) {
                            }
                            jSONObject3.put(next, a(jSONObjectOptJSONObject, jSONObject2.optJSONObject(next), list));
                        }
                    } else if (next.equals("userData")) {
                        jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        if (list == null) {
                        }
                        jSONObject3.put(next, a(jSONObjectOptJSONObject, jSONObject2.optJSONObject(next), list));
                    }
                } catch (JSONException e4) {
                    String message = e4.getMessage();
                    com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    aVar.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "UserSettingsJSONUtils", message);
                }
            }
            Object objOpt = jSONObject.opt(next);
            if (list == null || !list.contains(next)) {
                Object objOpt2 = jSONObject2.opt(next);
                if (objOpt != null && (objOpt2 == null || !p005kotlin.jvm.internal.s.g(objOpt.toString(), objOpt2.toString()))) {
                    jSONObject3.put(next, objOpt);
                }
                Unit unit = Unit.INSTANCE;
            } else {
                jSONObject3.put(next, objOpt);
            }
        }
        if (jSONObject3.length() > 0) {
            return jSONObject3;
        }
        return null;
    }
}
