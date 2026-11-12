package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mea {
    public static JSONObject a(String str, String str2, boolean z) {
        if (str2 == null) {
            LogUtil.j("JsonHelper", "createHeaderString commandString invalid param");
            return null;
        }
        LogUtil.a("JsonHelper", "createHeaderString commandString invalid param: ", str2);
        String strG = mdy.g();
        String strI = mdy.i();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("srcTranID", str);
            if (z) {
                jSONObject.put("version", "1.1");
                jSONObject.put("accessTokenAuth", b(strG, strI));
            } else {
                jSONObject.put("version", "1.0");
            }
            jSONObject.put("ts", System.currentTimeMillis() / 1000);
            jSONObject.put("commander", str2);
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("JsonHelper", "createHeaderObject, params invalid: ", str2);
            return null;
        }
    }

    public static String d(String str, int i, JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            LogUtil.j("JsonHelper", "createRequestString dataObject invalid");
            return null;
        }
        try {
            jSONObject2 = new JSONObject();
            jSONObject2.put("merchantID", str);
            jSONObject2.put("keyIndex", i);
            jSONObject2.put("data", jSONObject.toString());
        } catch (JSONException unused) {
            LogUtil.e("JsonHelper", "createRequestString dataObject params invalid");
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.toString();
    }

    public static String b(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static int a(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null) {
            LogUtil.j("JsonHelper", "getIntValue dataObject invalid");
            return -1;
        }
        if (jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return -1;
    }

    public static JSONObject b(String str, String str2) {
        LoginInit loginInit = LoginInit.getInstance(null);
        if (TextUtils.isEmpty(loginInit.getAccountInfo(1011))) {
            LogUtil.j("JsonHelper", "createServiceTokenAuthString, accountInfo invalid.");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userid", loginInit.getAccountInfo(1011));
            jSONObject.put("accessToken", loginInit.getAccountInfo(1008));
            jSONObject.put("appID", "com.huawei.health");
            jSONObject.put(DeviceInfo.TAG_DEVICE_ID, str);
            jSONObject.put("deviceType", 0);
            jSONObject.put("terminalType", str2);
            jSONObject.put("stSite", loginInit.getAccountInfo(1009));
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("JsonHelper", "createServiceTokenAuthString, accountInfo invalid.");
            return null;
        }
    }

    public static String a(mcy mcyVar, int i, mco mcoVar, int i2, int i3) {
        if (mcyVar == null || mcoVar == null) {
            LogUtil.j("JsonHelper", "getReqNextJsonResult, params or bean is null.");
            return "";
        }
        mcu mcuVar = new mcu();
        c(mcuVar, mcyVar);
        mcp mcpVar = new mcp();
        mcpVar.d(i);
        mcpVar.b(mcoVar);
        mcpVar.e(i2);
        mcpVar.c(i3);
        mcuVar.e(mcpVar);
        try {
            return new Gson().toJson(mcuVar);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    public static String d(mcy mcyVar, int i, int i2) {
        if (mcyVar == null) {
            LogUtil.j("JsonHelper", "getReqNextJsonResult, params is null");
            return "";
        }
        mcu mcuVar = new mcu();
        c(mcuVar, mcyVar);
        mcr mcrVar = new mcr();
        mcrVar.d(i);
        mcrVar.c(i2);
        mcuVar.e(mcrVar);
        try {
            return new Gson().toJson(mcuVar);
        } catch (JsonSyntaxException | IllegalArgumentException unused) {
            return null;
        }
    }

    private static void c(mcu mcuVar, mcy mcyVar) {
        mcuVar.b("2.0.6");
        mcuVar.e(mdy.g());
        mcuVar.c(mdy.i());
        mcuVar.h("1.0");
        mcuVar.g(mcyVar.a());
        mcuVar.a(mcyVar.e());
        mcuVar.d(mcyVar.c());
    }
}
