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
public class ym5 extends xkh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vfc f40317b;

    public ym5(vfc vfcVar) {
        this.f40317b = vfcVar;
    }

    @Override // defpackage.xkh
    public ork a(int i, String str) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject(str);
        if ("data".equals(jSONObject.getString("result"))) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("dataRequest");
            return e(i, h(jSONObject2.getJSONObject("request")), jSONObject2.getString("followup"));
        }
        xkh xkhVar = this.f39215a;
        if (xkhVar != null) {
            return xkhVar.a(i, str);
        }
        throw new JSONException("result not support" + jSONObject);
    }

    public final String c(String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Base64.encodeToString(str.getBytes("utf-8"), 10);
    }

    public final ork d(int i, ymk ymkVar) {
        try {
            ork orkVarA = this.f40317b.a(i).a(ymkVar);
            AccountLogger.log("DataProxy", "data response" + orkVarA);
            return orkVarA;
        } catch (IOException e) {
            AccountLogger.log("DataProxy", "data request", e);
            return HttpError.CELLULAR_NETWORK_IO_EXCEPTION.result();
        }
    }

    public final ork e(int i, ymk ymkVar, String str) throws IOException {
        return f(str, d(i, ymkVar));
    }

    public final ork f(String str, ork orkVar) throws IOException {
        HashMap map = new HashMap();
        map.put("requestTime", "" + orkVar.f);
        map.put("code", "" + orkVar.f29627a);
        map.put("body", c(orkVar.f29628b));
        map.put("headers", c(g(orkVar.c)));
        return this.f40317b.b().a(new ymk.b().h(str).d(map).b());
    }

    public final String g(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObjectB = w4f.b(map);
            if (jSONObjectB != null) {
                return jSONObjectB.toString().replace("\\", "");
            }
        } catch (JSONException e) {
            AccountLogger.log("DataProxy", "joinToJson", e);
        }
        return null;
    }

    public final ymk h(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("url");
        return new ymk.b().h(string).e(w4f.d(jSONObject.optJSONObject("headers"))).d(w4f.d(jSONObject.optJSONObject("formBody"))).c(jSONObject.optInt("followRedirects") == 1).b();
    }
}
