package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ocd {
    private static final String d = "ResponseMultiSIMService";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44103c;

    public String d() {
        return this.f44102b;
    }

    public String b() {
        return this.f44101a;
    }

    public int c() {
        return this.f44103c;
    }

    public void e(String str) {
        JSONObject jSONObject;
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            this.f44102b = jSONObject.optString("ManageUrl");
            this.f44101a = jSONObject.optString("PostData");
            this.f44103c = jSONObject.optInt("Timer2");
            if (ocq.f44154c.booleanValue()) {
                ocq.e(d, "Parse ResponseInfo to jsonObj result:" + jSONObject.toString());
            }
        } catch (JSONException unused) {
            ocq.e(d, "Parse ResponseInfo to jsonObj occured JSONException");
        }
    }
}
