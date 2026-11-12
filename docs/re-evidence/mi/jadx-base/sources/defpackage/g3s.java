package defpackage;

import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.util.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class g3s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18567b;
    public int c;
    public String d = ifs.a();
    public String e = y0t.d();
    public String f;
    public String g;

    public void a(String str) {
        this.f = str;
    }

    public void b(String str) {
        this.g = str;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("production", this.f18566a);
            jSONObject.put("reportType", this.c);
            jSONObject.put("clientInterfaceId", this.f18567b);
            jSONObject.put(CommonConstants.KEY_OS, this.d);
            jSONObject.put("miuiVersion", this.e);
            jSONObject.put(Constants.KEY_PACKAGE_NAME, this.f);
            jSONObject.put("sdkVersion", this.g);
            return jSONObject;
        } catch (JSONException e) {
            x9s.s(e);
            return null;
        }
    }

    public String d() {
        JSONObject jSONObjectC = c();
        return jSONObjectC == null ? "" : jSONObjectC.toString();
    }
}
