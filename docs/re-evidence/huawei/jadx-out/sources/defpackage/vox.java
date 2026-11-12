package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class vox {
    private static vox d;

    private vox() {
    }

    public static vox d() {
        if (d == null) {
            d = new vox();
        }
        return d;
    }

    private String b() {
        String str;
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainSnsHicloud");
        String str2 = "version=0111&clientversion=" + vos.a();
        if (TextUtils.isEmpty(url)) {
            str = "https://SNS/client/ISNS/findUserV2?" + str2;
        } else {
            str = url + "/SNS/client/ISNS/findUserV2?" + str2;
        }
        return e(str);
    }

    private String c() {
        String str;
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainSnsHicloud");
        String str2 = "version=0111&clientversion=" + vos.a();
        if (TextUtils.isEmpty(url)) {
            str = "https://SNS/client/ISNS/getOtherUserInfo?" + str2;
        } else {
            str = url + "/SNS/client/ISNS/getOtherUserInfo?" + str2;
        }
        return e(str);
    }

    private String e() {
        String str;
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainSnsHicloud");
        String str2 = "version=0111&clientversion=" + vos.a();
        if (TextUtils.isEmpty(url)) {
            str = "https://SNS/client/ISNS/loginSNS?" + str2;
        } else {
            str = url + "/SNS/client/ISNS/loginSNS?" + str2;
        }
        return e(str);
    }

    private String e(String str) {
        int i;
        try {
            i = Integer.parseInt(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        } catch (NumberFormatException unused) {
            LogUtil.e("HealthZoneRequestUtil", "siteId exception");
            i = 1;
        }
        return String.format(Locale.ENGLISH, str, Integer.valueOf(i));
    }

    public gqd d(vod vodVar) {
        String strB = b();
        String json = new Gson().toJson(vodVar);
        LogUtil.d("getFindUserSync params: ", json);
        gqd gqdVar = new gqd();
        if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(json)) {
            LogUtil.j("HealthZoneRequestUtil", "getFindUserSync url or params invalidate");
            return gqdVar;
        }
        HashMap map = new HashMap(16);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "cookie");
        if (!TextUtils.isEmpty(strE)) {
            LogUtil.d("cookie: ", strE);
            map.put("Cookie", strE);
        }
        String strA = a(strB, json, map);
        LogUtil.d("getFindUserSync json: ", strA);
        try {
            gqdVar = (gqd) new Gson().fromJson(CommonUtil.ac(strA), gqd.class);
        } catch (JsonSyntaxException e) {
            LogUtil.e("HealthZoneRequestUtil", "FindUserV2Response fromJson exception :", e.getMessage());
            gqdVar.setResultCode(-1);
            gqdVar.setResultDesc(e.getMessage());
        }
        if (gqdVar == null) {
            gqdVar = new gqd();
            gqdVar.setResultCode(-1);
        }
        LogUtil.d("HealthZoneRequestUtil", "Response String: ", gqdVar.toString());
        return gqdVar;
    }

    public gqc b(gqf gqfVar) {
        String strC = c();
        String json = new Gson().toJson(gqfVar);
        LogUtil.d("getUserAllInfoSync params: ", json);
        gqc gqcVar = new gqc();
        if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(json)) {
            LogUtil.j("HealthZoneRequestUtil", "getUserAllInfoSync url or params invalidate");
            return gqcVar;
        }
        HashMap map = new HashMap(16);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "cookie");
        if (!TextUtils.isEmpty(strE)) {
            LogUtil.d("cookie: ", strE);
            map.put("Cookie", strE);
        }
        String strA = a(strC, json, map);
        LogUtil.a("getUserAllInfoSync json: ", strA);
        try {
            gqcVar = (gqc) new Gson().fromJson(CommonUtil.ac(strA), gqc.class);
        } catch (JsonSyntaxException e) {
            LogUtil.e("HealthZoneRequestUtil", "getUserAllInfoSync fromJson exception :", e.getMessage());
            gqcVar.e(-1);
        }
        if (gqcVar == null) {
            gqcVar = new gqc();
            gqcVar.e(-1);
        }
        LogUtil.d("HealthZoneRequestUtil", "getUserAllInfoSync response String: ", gqcVar.toString());
        return gqcVar;
    }

    public von b(vok vokVar) {
        String strE = e();
        String json = new Gson().toJson(vokVar);
        LogUtil.a("HealthZoneRequestUtil", "getUserLoginStatus paramString: ", json);
        von vonVar = new von();
        if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(json)) {
            LogUtil.j("HealthZoneRequestUtil", "getUserLoginStatus url or params invalidate");
            return vonVar;
        }
        try {
            vonVar = (von) new Gson().fromJson(CommonUtil.ac(a(strE, json, new HashMap())), von.class);
        } catch (JsonSyntaxException e) {
            LogUtil.e("HealthZoneRequestUtil", "getUserLoginStatus fromJson exception: JsonSyntaxException");
            vonVar.setResultCode(-1);
            vonVar.setResultDesc(e.getMessage());
        }
        if (vonVar == null) {
            vonVar = new von();
            vonVar.setResultCode(-1);
        }
        LogUtil.d("HealthZoneRequestUtil", "getUserLoginStatus response is :", vonVar.toString());
        return vonVar;
    }

    public static String a(String str, String str2, HashMap<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            return vou.b(BaseApplication.getContext(), str, str2, map);
        }
        return "";
    }
}
