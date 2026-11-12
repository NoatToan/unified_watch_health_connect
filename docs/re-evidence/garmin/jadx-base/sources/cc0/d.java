package cc0;

import android.text.TextUtils;
import b71.i;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import lc.u0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class d extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final JSONArray f26692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f26693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f26694k;

    public interface a {
    }

    public d(com.garmin.android.library.backgroundtaskmanagement.b bVar, JSONArray jSONArray, a aVar) {
        super(bVar);
        this.f26692i = jSONArray;
        this.f26693j = aVar;
        this.f26694k = new ArrayList();
    }

    public static void d(JSONObject jSONObject, h hVar) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("deviceCategories");
            StringBuilder sb3 = new StringBuilder();
            int i14 = 0;
            while (i14 < jSONArray.length()) {
                sb3.append(jSONArray.getString(i14));
                i14++;
                if (i14 != jSONArray.length()) {
                    sb3.append(",");
                }
            }
            sb3.length();
        } catch (JSONException unused) {
            i2.f(a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask", "Non-critical exception parsing JSON key [deviceCategories].");
        }
    }

    public static void e(JSONObject jSONObject, h hVar) throws JSONException {
        try {
            jSONObject.getBoolean("bluetoothClassicDevice");
            try {
                jSONObject.getBoolean("bluetoothLowEnergyDevice");
            } catch (JSONException e4) {
                u0.v(e4, new StringBuilder("Failed to parse key [bluetoothLowEnergyDevice]. "), a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask");
                throw e4;
            }
        } catch (JSONException e14) {
            u0.v(e14, new StringBuilder("Failed to parse key [bluetoothClassicDevice]. "), a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask");
            throw e14;
        }
    }

    public static void f(JSONObject jSONObject, h hVar) {
        try {
            if (!jSONObject.isNull("productDisplayName")) {
                String strTrim = jSONObject.getString("productDisplayName").trim();
                if (strTrim.startsWith("Garmin") || strTrim.startsWith("GARMIN")) {
                    strTrim.substring(6, strTrim.length());
                }
            }
        } catch (JSONException unused) {
            i2.f(a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask", "Non-critical exception parsing JSON key [productDisplayName].");
        }
        try {
            if (jSONObject.isNull("displayName")) {
                return;
            }
            String string = jSONObject.getString("displayName");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            string.getClass();
        } catch (JSONException unused2) {
            i2.f(a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask", "Non-critical exception parsing JSON key [displayName].");
        }
    }

    public static void h(JSONObject jSONObject, h hVar) throws JSONException {
        try {
            String string = jSONObject.getString("partNumber");
            hVar.f26708a = string;
            try {
                string.substring(5, 9);
            } catch (IndexOutOfBoundsException e4) {
                i2.f(a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask", "Exception extracting 4 digit part number from [" + hVar.f26708a + "]:" + e4.getMessage());
                throw e4;
            }
        } catch (JSONException e14) {
            u0.v(e14, new StringBuilder("Failed to parse key [partNumber]."), a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask");
            throw e14;
        }
    }

    public static void i(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        for (char c14 : strTrim.toCharArray()) {
            if (c14 != '\\') {
                sb3.append(c14);
            }
        }
    }

    public static void j(JSONObject jSONObject, h hVar) {
        try {
            if (!jSONObject.isNull("imageUrl")) {
                String strTrim = jSONObject.getString("imageUrl").trim();
                if (!strTrim.isEmpty()) {
                    i(strTrim);
                }
            }
        } catch (JSONException unused) {
            i2.f(a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask", "Non-critical exception parsing JSON key [imageUrl].");
        }
        try {
            if (!jSONObject.isNull("deviceVideoPageLink")) {
                String strTrim2 = jSONObject.getString("deviceVideoPageLink").trim();
                if (!strTrim2.isEmpty()) {
                    i(strTrim2);
                }
            }
        } catch (JSONException unused2) {
            i2.f(a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask", "Non-critical exception parsing JSON key [deviceVideoPageLink].");
        }
        try {
            if (jSONObject.isNull("deviceEmbedVideoLink")) {
                return;
            }
            String strTrim3 = jSONObject.getString("deviceEmbedVideoLink").trim();
            if (strTrim3.isEmpty()) {
                return;
            }
            i(strTrim3);
        } catch (JSONException unused3) {
            i2.f(a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask", "Non-critical exception parsing JSON key [deviceEmbedVideoLink].");
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        JSONArray jSONArray = this.f26692i;
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                try {
                    g(jSONArray.getJSONObject(i14));
                } catch (JSONException e4) {
                    u0.v(e4, i.i(i14, "Error creating JSONObject from array position ", "; "), a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask");
                }
            }
        }
        e eVar = e.this;
        eVar.f26696n = this.f26694k;
        f fVar = (f) eVar.f50097g.get(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE);
        ArrayList arrayList = eVar.f26696n;
        fVar.getClass();
        if (arrayList != null) {
            eVar.b(eVar.f26700r);
        }
        eVar.j(eVar.f26698p, com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
    }

    public final void g(JSONObject jSONObject) {
        h hVar = new h();
        try {
            h(jSONObject, hVar);
            try {
                hVar.f26709b = jSONObject.getLong("deviceId");
                try {
                    jSONObject.getString("applicationKey");
                    e(jSONObject, hVar);
                    j(jSONObject, hVar);
                    f(jSONObject, hVar);
                    jSONObject.optInt("activeInd", -1);
                    d(jSONObject, hVar);
                    jSONObject.optBoolean("primaryActivityTrackerIndicator", false);
                    try {
                        if (!jSONObject.isNull("minGCMAndroidVersion")) {
                            jSONObject.getString("minGCMAndroidVersion");
                        }
                    } catch (JSONException unused) {
                        i2.f(a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask", "Non-critical exception parsing JSON key [minGCMAndroidVersion].");
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("softwareUpdates");
                    if (jSONArrayOptJSONArray != null) {
                        jSONArrayOptJSONArray.length();
                    }
                    if (!jSONObject.isNull("productSku")) {
                        jSONObject.optString("productSku");
                    }
                    if (!jSONObject.isNull("vivohubConfigurable")) {
                        hVar.f26710c = jSONObject.optBoolean("vivohubConfigurable", false);
                    }
                    if (!jSONObject.isNull("supportsSecondaryUsers") && jSONObject.optBoolean("supportsSecondaryUsers", false) && !jSONObject.isNull("isPrimaryUser")) {
                        jSONObject.optBoolean("isPrimaryUser", true);
                    }
                    this.f26694k.add(hVar);
                } catch (JSONException e4) {
                    i2.f(a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask", "Failed to parse key [applicationKey]." + e4.getMessage());
                    throw e4;
                }
            } catch (JSONException e14) {
                i2.f(a2.DEVICES, "JSONtoPOJOUserActiveDevicesTask", "Failed to parse key [deviceId]." + e14.getMessage());
                throw e14;
            }
        } catch (Exception unused2) {
        }
    }
}
