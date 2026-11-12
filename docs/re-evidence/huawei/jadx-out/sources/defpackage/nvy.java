package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.watchface.videoedit.param.CanvasConfig;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nvy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f43849a = new HashMap<String, String>() { // from class: nvy.5
        {
            put("34fa0346-d46c-439d-9cb0-2f696618846b", "HuaweiCH18");
            put("33123f39-7fc1-420b-9882-a4b0d6c61100", "HuaweiCH100");
            put("ccd1f0f8-8c57-4bd7-a884-0ef38482f15f", "HuaweiAH100");
            put("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4", "LUP-B19");
            put("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4", "HAG-B19");
            put("b29df4e3-b1f7-4e40-960d-4cfb63ccca05", "HAG-B19");
            put("e835d102-af95-48a6-ae13-2983bc06f5c0", "HEM-B19");
        }
    };

    public static OutputStream d(Context context, String str, boolean z, nus nusVar) {
        LogUtil.a("convertJsonToStreamUtil", "convertVersionFilterJsonToStream JSON begin");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        nuo nuoVarA = nvp.a(context, str);
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject, nuoVarA, nusVar);
            if (z) {
                b(jSONObject, nuoVarA.j());
            } else {
                e(jSONObject, nuoVarA.j());
            }
            jSONObject.put("IMSI", nuoVarA.h());
            d(jSONObject, context, nuoVarA);
            JSONObject jSONObject2 = new JSONObject();
            if (nusVar != null && nusVar.j()) {
                jSONObject2.put("commonRules", e(nuoVarA, nusVar));
                jSONObject2.putOpt("versionPackageRules", a(jSONObject));
            } else {
                jSONObject2.put("components", a(nuoVarA));
                jSONObject2.putOpt("rules", jSONObject);
            }
            try {
                byteArrayOutputStream.write(jSONObject2.toString().getBytes(StandardCharsets.UTF_8));
                byteArrayOutputStream.flush();
            } catch (IOException e) {
                LogUtil.e("convertJsonToStreamUtil", "convertVersionFilterJsonToStream, IOException", e.getMessage());
            }
        } catch (JSONException unused) {
            LogUtil.e("convertJsonToStreamUtil", "convertVersionFilterJsonToStream, JSONException");
        }
        return byteArrayOutputStream;
    }

    public static OutputStream a(Context context, PackageInfo packageInfo, String str, boolean z, nus nusVar) {
        LogUtil.a("convertJsonToStreamUtil", "convertVersionFilterJsonToStream(bone) begin");
        boolean zC = HwVersionManager.b(BaseApplication.getContext()).c(nvd.b(nusVar.a()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        nuo nuoVarA = nvp.a(context, packageInfo.packageName);
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject, nuoVarA, nusVar);
            if (z) {
                b(jSONObject, CommonUtil.k(context));
            } else {
                e(jSONObject, str);
                a(jSONObject, str, nusVar, zC);
                String strP = nvd.p(context, str);
                if (!TextUtils.isEmpty(strP)) {
                    jSONObject.put("extra_info", strP);
                }
                if (!Utils.o() && nvd.j(nusVar.a())) {
                    String strA = nvd.a(context, str, zC);
                    if (!TextUtils.isEmpty(strA)) {
                        jSONObject.put("extra_info", strA);
                    }
                }
            }
            d(jSONObject, context, nuoVarA);
            a(context, str, jSONObject, nusVar.a(), zC);
            JSONObject jSONObject2 = new JSONObject();
            if (nusVar != null && nusVar.j()) {
                jSONObject2.put("commonRules", c(packageInfo, nusVar));
                jSONObject2.putOpt("versionPackageRules", a(jSONObject));
            } else {
                jSONObject2.put("components", b(packageInfo));
                jSONObject2.putOpt("rules", jSONObject);
            }
            try {
                byteArrayOutputStream.write(jSONObject2.toString().getBytes(StandardCharsets.UTF_8));
                byteArrayOutputStream.flush();
            } catch (IOException e) {
                LogUtil.e("convertJsonToStreamUtil", "convertVersionFilterJsonToStream(bone) IOException ", e.getMessage());
            }
        } catch (JSONException unused) {
            LogUtil.e("convertJsonToStreamUtil", "convertVersionFilterJsonToStream(bone), JSONException");
        }
        LogUtil.a("convertJsonToStreamUtil", "convertVersionFilterJsonToStream(bone) leave");
        return byteArrayOutputStream;
    }

    private static void e(JSONObject jSONObject, String str) throws JSONException {
        if (CommonUtil.s(str)) {
            jSONObject.put("deviceId", str);
        } else {
            jSONObject.put("IMEI", str);
        }
    }

    private static void a(JSONObject jSONObject, String str, nus nusVar, boolean z) throws JSONException {
        if (!Utils.o()) {
            LogUtil.a("convertJsonToStreamUtil", "Start addAirActiveRules");
            String strD = CommonUtil.d(BaseApplication.getContext(), false);
            if (!TextUtils.isEmpty(strD)) {
                jSONObject.put("udid", strD);
            }
        }
        if (z) {
            return;
        }
        String strK = nvd.k(BaseApplication.getContext(), str);
        if (nusVar != null && !TextUtils.isEmpty(nusVar.a())) {
            strK = nusVar.a();
        }
        String strA = nvn.a(str, strK);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        jSONObject.put("extra_info_new", strA);
    }

    private static void b(JSONObject jSONObject, String str) throws JSONException {
        if (CommonUtil.bt()) {
            jSONObject.put("udid", CommonUtil.q());
            jSONObject.put("deviceId", CommonUtil.k(BaseApplication.getContext()));
        }
        if (CommonUtil.bg()) {
            jSONObject.put("IMEI", str);
        }
        jSONObject.put("udid", CommonUtil.al());
        jSONObject.put("deviceId", CommonUtil.k(BaseApplication.getContext()));
    }

    private static void a(JSONObject jSONObject, nuo nuoVar, nus nusVar) throws JSONException {
        jSONObject.put("FingerPrint", nuoVar.a());
        if (nusVar == null || TextUtils.isEmpty(nusVar.d())) {
            jSONObject.put("DeviceName", nuoVar.c());
        } else {
            jSONObject.put("DeviceName", nusVar.d());
        }
        jSONObject.put("FirmWare", nuoVar.e());
        if (nusVar != null) {
            int iC = nusVar.c();
            if (iC == 0) {
                jSONObject.put("PackageType", "increment");
            } else if (iC == 1) {
                jSONObject.put("PackageType", CanvasConfig.FULL_CONFIG);
            } else {
                LogUtil.a("convertJsonToStreamUtil", "packageType unknown");
            }
        }
    }

    private static void d(JSONObject jSONObject, Context context, nuo nuoVar) throws JSONException {
        jSONObject.put("Language", nuoVar.f());
        jSONObject.put("OS", nuoVar.g());
        jSONObject.put("C_version", nuoVar.b());
        jSONObject.put("D_version", nuoVar.d());
        if (nuw.c(context)) {
            jSONObject.put("HotaVersion", nuoVar.i());
        }
    }

    private static void a(Context context, String str, JSONObject jSONObject, String str2, boolean z) throws JSONException {
        String strA = HwVersionManager.b(BaseApplication.getContext()).a();
        if (!TextUtils.isEmpty(strA)) {
            jSONObject.put("vendorcountry", strA);
        }
        if (z || !HwVersionManager.b(BaseApplication.getContext()).h()) {
            LogUtil.j("convertJsonToStreamUtil", "addGeneralRulesPart3(bone) is not electronic card");
            return;
        }
        LogUtil.a("convertJsonToStreamUtil", "addGeneralRulesPart3(bone) is electronic card");
        JSONObject jSONObject2 = new JSONObject();
        String strA2 = nvd.a(context, str, z);
        if (!TextUtils.isEmpty(strA2)) {
            jSONObject2 = new JSONObject(strA2);
        }
        jSONObject2.put("electronicCard", "Y");
        jSONObject.put("extra_info", jSONObject2.toString());
        nvd.a(str2, "hotaElectronic", "true");
    }

    public static OutputStream c(Context context, String str, String str2, String str3, String str4) {
        LogUtil.a("convertJsonToStreamUtil", "convertVersionFilterJsonToStream JSON begin");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("DeviceName", f43849a.get(str2));
            if (CommonUtil.s(str4)) {
                jSONObject.put("deviceId", str4);
            } else {
                jSONObject.put("IMEI", str4);
            }
            jSONObject.put("Language", nvp.b(context));
            jSONObject.put("OS", nvp.b());
            jSONObject.put("PackageType", CanvasConfig.FULL_CONFIG);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("componentID", "1");
            jSONObject2.put(DetailRect.CP_PACKAGE, str);
            jSONObject2.put("PackageVersionCode", str3);
            jSONObject2.put("PackageVersionName", str3);
            jSONObject2.put("FirmWare", d(str2));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("components", jSONArray);
            jSONObject3.putOpt("rules", jSONObject);
            try {
                byteArrayOutputStream.write(jSONObject3.toString().getBytes(StandardCharsets.UTF_8));
                byteArrayOutputStream.flush();
            } catch (IOException e) {
                LogUtil.e("convertJsonToStreamUtil", "convertVersionFilterJsonToStream, IOException", e.getMessage());
            }
        } catch (JSONException e2) {
            LogUtil.e("convertJsonToStreamUtil", "convertVersionFilterJsonToStream, JSONException", e2.getMessage());
        } catch (Exception unused) {
            LogUtil.e("convertJsonToStreamUtil", "convertVersionFilterJsonToStream, Exception");
        }
        return byteArrayOutputStream;
    }

    private static String d(String str) {
        if ("ccd1f0f8-8c57-4bd7-a884-0ef38482f15f".equals(str)) {
            return "FW_OS";
        }
        return "FW_SCALE";
    }

    private static JSONArray b(PackageInfo packageInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DetailRect.CP_PACKAGE, packageInfo.packageName);
        jSONObject.put("PackageVersionCode", String.valueOf(packageInfo.versionCode));
        jSONObject.put("PackageVersionName", packageInfo.versionName);
        if (packageInfo.signatures != null && packageInfo.signatures.length > 0 && packageInfo.signatures[0] != null) {
            jSONObject.put(HwPayConstant.KEY_SIGN, nuv.c(packageInfo.signatures[0].toCharsString()));
        }
        if (HwVersionManager.b(BaseApplication.getContext()).f()) {
            jSONObject.put("SearchType", "1");
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    private static JSONArray a(nuo nuoVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DetailRect.CP_PACKAGE, nuoVar.l());
        jSONObject.put("PackageVersionCode", nuoVar.k());
        jSONObject.put("PackageVersionName", nuoVar.m());
        jSONObject.put(HwPayConstant.KEY_SIGN, nuoVar.o());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    private static JSONArray a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("versionPackageType", 6);
        jSONObject2.put("rules", jSONObject);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject2);
        return jSONArray;
    }

    private static JSONObject c(PackageInfo packageInfo, nus nusVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DetailRect.CP_PACKAGE, packageInfo.packageName);
        jSONObject.put("PackageVersionCode", String.valueOf(packageInfo.versionCode));
        jSONObject.put("PackageVersionName", packageInfo.versionName);
        if (packageInfo.signatures != null && packageInfo.signatures.length > 0 && packageInfo.signatures[0] != null) {
            jSONObject.put(HwPayConstant.KEY_SIGN, nuv.c(packageInfo.signatures[0].toCharsString()));
        }
        jSONObject.put("Devicename", nusVar.b());
        jSONObject.put("enterprise", nusVar.e());
        if (HwVersionManager.b(BaseApplication.getContext()).f()) {
            jSONObject.put("SearchType", "1");
        }
        return jSONObject;
    }

    private static JSONObject e(nuo nuoVar, nus nusVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DetailRect.CP_PACKAGE, nuoVar.l());
        jSONObject.put("PackageVersionCode", nuoVar.k());
        jSONObject.put("PackageVersionName", nuoVar.m());
        jSONObject.put(HwPayConstant.KEY_SIGN, nuoVar.o());
        jSONObject.put("Devicename", nusVar.b());
        jSONObject.put("enterprise", nusVar.e());
        return jSONObject;
    }

    public static String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (e(jSONObject)) {
                return jSONObject.toString();
            }
            if (!jSONObject.has("rules")) {
                LogUtil.a("convertJsonToStreamUtil", "getVersionFilterLogContent not have rules");
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("rules");
            if (jSONObject2.has("IMEI")) {
                jSONObject2.put("IMEI", CommonUtil.n(jSONObject2.getString("IMEI")));
            }
            if (jSONObject2.has("udid")) {
                jSONObject2.put("udid", CommonUtil.n(jSONObject2.getString("udid")));
            }
            if (jSONObject2.has("deviceId")) {
                jSONObject2.put("deviceId", CommonUtil.n(jSONObject2.getString("deviceId")));
            }
            if (jSONObject2.has("extra_info")) {
                jSONObject2.put("extra_info", CommonUtil.n(jSONObject2.getString("extra_info")));
            }
            if (jSONObject2.has("extra_info_new")) {
                jSONObject2.put("extra_info_new", CommonUtil.n(jSONObject2.getString("extra_info_new")));
            }
            jSONObject.put("rules", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e) {
            LogUtil.e("convertJsonToStreamUtil", "getVersionFilterLogContent JSONException :", ExceptionUtils.c(e));
            return null;
        }
    }

    private static boolean e(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("versionPackageRules")) {
            JSONArray jSONArray = jSONObject.getJSONArray("versionPackageRules");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                c(jSONObject2);
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put("versionPackageRules", jSONArray2);
            return true;
        }
        LogUtil.a("convertJsonToStreamUtil", "getVersionFilterLogContent not have versionPackageRules");
        return false;
    }

    private static void c(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("rules")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("rules");
            if (jSONObject2.has("IMEI")) {
                jSONObject2.put("IMEI", CommonUtil.n(jSONObject2.getString("IMEI")));
            }
            if (jSONObject2.has("udid")) {
                jSONObject2.put("udid", CommonUtil.n(jSONObject2.getString("udid")));
            }
            if (jSONObject2.has("deviceId")) {
                jSONObject2.put("deviceId", CommonUtil.n(jSONObject2.getString("deviceId")));
            }
            if (jSONObject2.has("extra_info")) {
                jSONObject2.put("extra_info", CommonUtil.n(jSONObject2.getString("extra_info")));
            }
            if (jSONObject2.has("extra_info_new")) {
                jSONObject2.put("extra_info_new", CommonUtil.n(jSONObject2.getString("extra_info_new")));
            }
            jSONObject.put("rules", jSONObject2);
        }
    }
}
