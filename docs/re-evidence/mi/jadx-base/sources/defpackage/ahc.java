package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.phonenum.bean.HttpError;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ahc extends xkh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vfc f1021b;

    public ahc(vfc vfcVar) {
        this.f1021b = vfcVar;
    }

    private String c(String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Base64.encodeToString(str.getBytes("utf-8"), 10);
    }

    private ork d(int i, ymk ymkVar, String str) throws IOException {
        return e(str, g(i, ymkVar));
    }

    private ork e(String str, ork orkVar) throws IOException {
        HashMap map = new HashMap();
        map.put("requestTime", "" + orkVar.f);
        map.put("code", "" + orkVar.f29627a);
        map.put("body", c(orkVar.f29628b));
        map.put("headers", c(f(orkVar.c)));
        return this.f1021b.b().a(new ymk.b().h(str).d(map).b());
    }

    private String f(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObjectB = w4f.b(map);
            if (jSONObjectB != null) {
                return jSONObjectB.toString().replace("\\", "");
            }
        } catch (JSONException e) {
            AccountLogger.log("HttpProxyParser", "joinToJson", e);
        }
        return null;
    }

    private ymk h(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("url");
        return new ymk.b().h(string).e(w4f.d(jSONObject.optJSONObject("headers"))).d(w4f.d(jSONObject.optJSONObject("formBody"))).c(jSONObject.optInt("followRedirects") == 1).b();
    }

    @Override // defpackage.xkh
    public ork a(int i, String str) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject(str);
        if ("http".equals(jSONObject.getString("result"))) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("httpRequest");
            return d(i, h(jSONObject2.getJSONObject("request")), jSONObject2.getString("followup"));
        }
        xkh xkhVar = this.f39215a;
        if (xkhVar != null) {
            return xkhVar.a(i, str);
        }
        throw new JSONException("result not support" + jSONObject);
    }

    public final ork g(int i, ymk ymkVar) {
        try {
            ork orkVarA = this.f1021b.b().a(ymkVar);
            AccountLogger.log("HttpProxyParser", "response " + orkVarA);
            return orkVarA;
        } catch (IOException e) {
            AccountLogger.log("HttpProxyParser", "request ", e);
            return HttpError.CELLULAR_NETWORK_IO_EXCEPTION.result();
        }
    }
}
