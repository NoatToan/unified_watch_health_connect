package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class obk {
    private static final String d = "MultiSIMServiceInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<obq> f44051a = new ArrayList<>();
    obs e;

    public void a(String str) {
        JSONObject jSONObject;
        try {
            if (str == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("PairedDeviceList");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    obq obqVar = new obq();
                    obqVar.e(jSONArrayOptJSONArray.get(i).toString());
                    this.f44051a.add(obqVar);
                }
            }
            obs obsVar = new obs();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("PrimaryDevice");
            if (jSONObjectOptJSONObject != null) {
                obsVar.a(jSONObjectOptJSONObject.toString());
            }
            this.e = obsVar;
            if (ocq.f44154c.booleanValue()) {
                ocq.e(d, "PrimaryDevice to json string = " + jSONObject.toString());
            }
        } catch (JSONException unused) {
            ocq.e(d, "Parse response information occured JSONException");
        }
    }

    public ArrayList<obq> b() {
        return this.f44051a;
    }

    public obs d() {
        return this.e;
    }
}
