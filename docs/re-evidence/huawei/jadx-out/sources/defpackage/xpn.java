package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.wear.oversea.overseamanger.OverSeaMangerUtil;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class xpn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f53273b = Pattern.compile("(\\\\+/)");
    private static final String e = "JSONHelperTwo";

    public static JSONObject c(String str) {
        String str2 = e;
        xnd.b(str2, "JSONHelper createServiceTokenAuthStr  begin", false);
        LinkedHashMap<String, String> linkedHashMapE = e(str, "AccessTokenAuth");
        xmt xmtVarB = OverSeaMangerUtil.a(xml.d()).b();
        if (xmtVarB == null) {
            return new JSONObject();
        }
        String strO = xmtVarB.o();
        if (TextUtils.isEmpty(strO)) {
            xnd.b(str2, "createServiceTokenAuthStr, accountInfo is null.", false);
            linkedHashMapE.put("error_desc", "createAccessTokenAuthStr, accountInfo is null.");
            xob.d(0, "Wallet_create_st", linkedHashMapE);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userid", strO);
            jSONObject.put("appID", xmtVarB.c());
            jSONObject.put(DeviceInfo.TAG_DEVICE_ID, xmtVarB.d());
            jSONObject.put("deviceType", xmtVarB.i());
            jSONObject.put("serviceToken", xmtVarB.m());
            jSONObject.put("terminalType", xmtVarB.b());
            if (!xmtVarB.e().equals("CN")) {
                xnd.b(str2, "createServiceTokenAuthStr, stSite = " + xmtVarB.k(), false);
                jSONObject.put("stSite", xmtVarB.k() + "");
                jSONObject.put("countryCode", xmtVarB.e());
            }
            return jSONObject;
        } catch (JSONException unused) {
            linkedHashMapE.put("error_desc", "createAccessTokenAuthStr, accountInfo invalid.");
            xob.d(0, "Wallet_create_st", linkedHashMapE);
            xnd.b(e, "createServiceTokenAuthStr, accountInfo invalid.", false);
            return null;
        }
    }

    public static JSONObject e(String str) {
        String str2 = e;
        xnd.b(str2, "JSONHelper createAccessTokenAuthStr  begin", false);
        LinkedHashMap<String, String> linkedHashMapE = e(str, "AccessTokenAuth");
        xmt xmtVarB = OverSeaMangerUtil.a(xml.d()).b();
        if (xmtVarB == null) {
            return new JSONObject();
        }
        if (TextUtils.isEmpty(xmtVarB.o())) {
            xnd.b(str2, "createAccessTokenAuthStr, accountInfo is null.", false);
            linkedHashMapE.put("error_desc", "createAccessTokenAuthStr, accountInfo is null.");
            xob.d(0, "Wallet_create_st", linkedHashMapE);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userid", xmtVarB.o());
            jSONObject.put("appID", xmtVarB.c());
            jSONObject.put(DeviceInfo.TAG_DEVICE_ID, xmtVarB.d());
            jSONObject.put("deviceType", xmtVarB.i());
            jSONObject.put("accessToken", xmtVarB.m());
            jSONObject.put("terminalType", xmtVarB.b());
            if (!xmtVarB.e().equals("CN")) {
                xnd.b(str2, "createAccessTokenAuthStr, stSite = " + xmtVarB.k(), false);
                jSONObject.put("stSite", xmtVarB.k() + "");
                jSONObject.put("countryCode", xmtVarB.e());
            }
            return jSONObject;
        } catch (JSONException unused) {
            xnd.b(e, "createAccessTokenAuthStr, accountInfo invalid.", false);
            linkedHashMapE.put("error_desc", "createAccessTokenAuthStr, accountInfo invalid.");
            xob.d(0, "Wallet_create_st", linkedHashMapE);
            return null;
        }
    }

    private static LinkedHashMap<String, String> e(String str, String str2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(HeaderType.EVENT_ID, "Wallet_create_st");
        linkedHashMap.put("log_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(Long.valueOf(System.currentTimeMillis())));
        linkedHashMap.put("command_str", str);
        if (TextUtils.isEmpty(OverSeaMangerUtil.a(xml.d()).b().o())) {
            String str3 = e;
            xnd.b(str3, "JSONHelper " + str2 + ", getAccountInfo begin", false);
            linkedHashMap.put("error_desc", "JSONHelper " + str2 + ", uesrid isEmpty .");
            xob.d(0, "Wallet_create_st", linkedHashMap);
            xnd.b(str3, "JSONHelper " + str2 + ", accountLock lock wait interrupted.", false);
        }
        return linkedHashMap;
    }

    public static String d(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static String a(String str, int i, JSONObject jSONObject, Context context) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        xnd.c(e, "prepareRequestStr dataStr : " + jSONObject.toString(), true);
        try {
            jSONObject2 = new JSONObject();
            jSONObject2.put("merchantID", str);
            jSONObject2.put("keyIndex", i);
            jSONObject2.put("data", jSONObject.toString());
        } catch (JSONException unused) {
            Log.e("", "createRequestStr, params invalid.");
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            return null;
        }
        return a(jSONObject2.toString());
    }

    private static String a(String str) {
        return f53273b.matcher(str).replaceAll("/");
    }

    public static int b(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str)) {
            return -1;
        }
        return jSONObject.getInt(str);
    }
}
