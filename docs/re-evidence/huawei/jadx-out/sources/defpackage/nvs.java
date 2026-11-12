package defpackage;

import android.text.TextUtils;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nvs {
    public static num c(String str, boolean z) {
        num numVar;
        num numVarB;
        num numVar2 = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = Integer.parseInt(jSONObject.getString("status"));
            ReleaseLogUtil.d("R_Weight_BuildNewVersionInfoXmlUtil", " check new version status= ", Integer.valueOf(i));
            numVar = new num();
            try {
                if (z) {
                    numVarB = d(jSONObject, i);
                } else {
                    numVarB = b(jSONObject, i);
                }
                numVar2 = numVarB;
                e(numVar2, jSONObject);
                if (numVar2 != null || i != 0) {
                    return numVar2;
                }
                numVar = new num();
                numVar.e(1);
                return numVar;
            } catch (RuntimeException unused) {
                LogUtil.e("BuildNewVersionInfoXmlUtil", "buildNewVersionInfoXml RuntimeException");
                return numVar;
            } catch (Exception unused2) {
                LogUtil.e("BuildNewVersionInfoXmlUtil", "buildNewVersionInfoXml Exception");
                return numVar;
            }
        } catch (RuntimeException unused3) {
            numVar = numVar2;
        } catch (Exception unused4) {
            numVar = numVar2;
        }
    }

    private static num d(JSONObject jSONObject, int i) throws JSONException {
        JSONArray jSONArray;
        if (i == 1) {
            num numVar = new num();
            numVar.e(i);
            return numVar;
        }
        if (!jSONObject.has("versionPackageCheckResults") || (jSONArray = jSONObject.getJSONArray("versionPackageCheckResults")) == null || jSONArray.length() != 1) {
            return null;
        }
        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
        int i2 = Integer.parseInt(jSONObject2.getString("status"));
        LogUtil.a("BuildNewVersionInfoXmlUtil", "getVersionEnterpriseInfo check new version status= ", Integer.valueOf(i2));
        return b(jSONObject2, i2);
    }

    private static num b(JSONObject jSONObject, int i) throws JSONException {
        JSONArray jSONArray;
        if (i == 1) {
            num numVar = new num();
            numVar.e(i);
            return numVar;
        }
        if (!jSONObject.has("components") || (jSONArray = jSONObject.getJSONArray("components")) == null || jSONArray.length() != 1) {
            return null;
        }
        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
        LogUtil.a("BuildNewVersionInfoXmlUtil", "getComponentsInfo componentjson is ", jSONObject2.toString());
        num numVar2 = new num();
        numVar2.e(i);
        c(numVar2, jSONObject2);
        if (jSONObject2.has("ruleAttr")) {
            String string = jSONObject2.getString("ruleAttr");
            LogUtil.a("BuildNewVersionInfoXmlUtil", "getComponentsInfo ruleAttr = ", string);
            e(numVar2, string);
        }
        return numVar2;
    }

    private static void e(num numVar, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        if (jSONObject.has(NetworkService.Constants.CONFIG_SERVICE) && (jSONObject2 = jSONObject.getJSONObject(NetworkService.Constants.CONFIG_SERVICE)) != null && jSONObject2.has("forceRemind") && numVar != null) {
            numVar.d(Integer.parseInt(jSONObject2.getString("forceRemind")));
        }
        if (!jSONObject.has("autoPollingCycle") || numVar == null) {
            return;
        }
        numVar.b(Integer.parseInt(jSONObject.getString("autoPollingCycle")));
        LogUtil.a("BuildNewVersionInfoXmlUtil", "buildNewVersionInfoXml autoPollingCycle=", Integer.valueOf(numVar.c()));
    }

    private static void c(num numVar, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("name")) {
            numVar.i(jSONObject.getString("name"));
        }
        if (jSONObject.has("version")) {
            numVar.p(jSONObject.getString("version"));
        }
        if (jSONObject.has("versionID")) {
            numVar.r(jSONObject.getString("versionID"));
        }
        if (jSONObject.has("description")) {
            numVar.e(jSONObject.getString("description"));
        }
        if (jSONObject.has("url")) {
            numVar.s(jSONObject.getString("url"));
        }
        if (jSONObject.has("createTime")) {
            numVar.d(jSONObject.getString("createTime"));
        }
        if (jSONObject.has("size")) {
            numVar.g(jSONObject.getString("size"));
        }
        if (jSONObject.has("componentID")) {
            try {
                numVar.a(Integer.parseInt(jSONObject.getString("componentID")));
            } catch (NumberFormatException unused) {
                LogUtil.a("BuildNewVersionInfoXmlUtil", "handleComponentJson NumberFormatException");
            }
        }
    }

    private static void e(num numVar, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("BuildNewVersionInfoXmlUtil", "handleRuleAttr rules is empty");
            return;
        }
        try {
            nup nupVar = new nup(BaseApplication.getContext(), str);
            int iC = nupVar.c();
            LogUtil.a("BuildNewVersionInfoXmlUtil", "handleRuleAttr minAppCode is ", Integer.valueOf(iC), "appForcedUpdate is ", nupVar.e(), "forcedUpdate is ", nupVar.a());
            if (nupVar.c() != 0) {
                numVar.c(nupVar.c());
            }
            if (!TextUtils.isEmpty(nupVar.e()) && "true".equals(nupVar.e())) {
                numVar.c(nupVar.e());
            }
            if (TextUtils.isEmpty(nupVar.a()) || !"true".equals(nupVar.a())) {
                return;
            }
            numVar.h(nupVar.a());
        } catch (NumberFormatException | JSONException unused) {
            LogUtil.e("BuildNewVersionInfoXmlUtil", "handleRuleAttr NumberFormatException");
        }
    }
}
