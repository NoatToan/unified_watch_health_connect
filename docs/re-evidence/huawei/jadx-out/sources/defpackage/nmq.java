package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.huawei.hms.utils.Util;
import com.huawei.hwidauth.api.ResultCallBack;
import com.huawei.hwidauth.c.j;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.hwidauth.ui.WebViewActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nmq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f43294c = "LOGIN_MODE_DEFAULT";

    public static void e(Context context, ResultCallBack<nml> resultCallBack) throws nmr {
        nox.b("HuaweiIdOAuthService", "signOut start.", true);
        if (context == null) {
            nox.a("HuaweiIdOAuthService", "context is null.", true);
            return;
        }
        String strB = noj.b();
        noj.b(context, 907115002, 0, "signOut start.", strB, "accountPickerH5.signOut_v2", "api_entry");
        if (resultCallBack == null) {
            nox.a("HuaweiIdOAuthService", "resultResultCallBack is null.", true);
            noj.b(context, 907115002, 404, "resultResultCallBack is null.", strB, "accountPickerH5.signOut_v2", "api_ret");
            throw new nmr("resultCallback is empty");
        }
        c(context, resultCallBack, strB);
    }

    private static void c(Context context, ResultCallBack<nml> resultCallBack, String str) {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.removeSessionCookie();
            cookieManager.removeAllCookie();
            nox.b("HuaweiIdOAuthService", "signOut success.", true);
            d(context, resultCallBack, "");
        } catch (RuntimeException e) {
            nox.a("HuaweiIdOAuthService", "RuntimeException", true);
            e(resultCallBack);
            noj.b(context, 907115002, 404, "RuntimeException:" + e.getMessage(), str, "accountPickerH5.signOut_v2", "api_ret");
        } catch (Exception e2) {
            nox.a("HuaweiIdOAuthService", "Exception", true);
            e(resultCallBack);
            noj.b(context, 907115002, 404, "Exception:" + e2.getMessage(), str, "accountPickerH5.signOut_v2", "api_ret");
        }
    }

    private static void e(ResultCallBack<nml> resultCallBack) {
        nox.b("HuaweiIdOAuthService", "setErrorResultCallBack start.", true);
        nms nmsVar = new nms(404, "Sign Out Fail");
        nmsVar.d(false);
        resultCallBack.onResult(new nml(nmsVar));
    }

    private static void d(Context context, ResultCallBack<nml> resultCallBack, String str) {
        nox.b("HuaweiIdOAuthService", "setSuccessResultCallBack start.", true);
        nms nmsVar = new nms(200, "Sign Out Success");
        nmsVar.d(true);
        resultCallBack.onResult(new nml(nmsVar));
        noj.b(context, 907115002, 200, "signOut success.", str, "accountPickerH5.signOut_v2", "api_ret");
    }

    public static void a(Activity activity, String str, String str2, String[] strArr, String str3, String str4, String str5, boolean z, ResultCallBack<nmu> resultCallBack) throws nmr {
        if (activity == null) {
            nox.a("HuaweiIdOAuthService", "activity is null.", true);
            return;
        }
        nmo nmoVarA = new nmo.c(activity).c(str2).b(strArr).b(str3).e(str4).a(resultCallBack).a();
        if (!TextUtils.isEmpty(str5)) {
            nmoVarA.e(str, str5, z);
        } else {
            nmoVarA.c(str);
        }
    }

    public static void d(Activity activity, String str, String str2, nnb nnbVar, String str3, ResultCallBack<nmn> resultCallBack) {
        nox.b("HuaweiIdOAuthService", "qrCodeAuthLogin start.", true);
        if (activity == null) {
            nox.a("HuaweiIdOAuthService", "activity is null.", true);
            return;
        }
        String strB = noj.b();
        noj.b(activity, 907115008, 0, "enter QRCodeAuth", strB, "accountPickerH5.qrCodeAuthLogin", "api_entry");
        if (TextUtils.isEmpty(str2) || nnbVar == null || resultCallBack == null || TextUtils.isEmpty(str)) {
            nox.a("HuaweiIdOAuthService", "QRCodeAuth param error", true);
            noj.b(activity, 907115008, 404, "QRCodeAuth param error", strB, "accountPickerH5.qrCodeAuthLogin", "api_ret");
            if (resultCallBack != null) {
                resultCallBack.onResult(new nmn(new nms(404, "QRCodeAuth param error")));
                return;
            }
            return;
        }
        if (!nom.i(activity)) {
            nox.a("HuaweiIdOAuthService", "network is unavailable.", true);
            noj.b(activity, 907115008, 2005, "QRCodeAuth network is unavailable.", strB, "accountPickerH5.qrCodeAuthLogin", "api_ret");
            nms nmsVar = new nms(2005, "Network is Unavailable");
            nmsVar.d(false);
            resultCallBack.onResult(new nmn(nmsVar));
            return;
        }
        e(activity, str, str2, str3, strB, nnbVar, resultCallBack);
    }

    private static void e(Activity activity, String str, String str2, String str3, String str4, nnb nnbVar, ResultCallBack<nmn> resultCallBack) {
        try {
            nom.d(resultCallBack);
            Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
            intent.putExtra("key_access_token", str2);
            intent.putExtra("key_app_id", Util.getAppId(activity));
            intent.putExtra("key_device_info", (Parcelable) DeviceInfo.a(activity, str3));
            intent.putExtra("key_oper", "scan_code_login");
            intent.putExtra("key_transId", str4);
            intent.putExtra("key_qr_code", nnbVar.a());
            intent.putExtra("key_qr_siteid", nnbVar.c());
            intent.putExtra("key_qr_code_source", nnbVar.d());
            intent.putExtra("grs_app_name", str);
            intent.setPackage(activity.getPackageName());
            activity.startActivity(intent);
        } catch (IllegalArgumentException e) {
            nox.a("HuaweiIdOAuthService", "IllegalArgumentException", true);
            noj.b(activity, 907115008, 404, "IllegalArgumentException:" + e.getMessage(), str4, "accountPickerH5.qrCodeAuthLogin", "api_ret");
        } catch (RuntimeException e2) {
            nox.a("HuaweiIdOAuthService", "RuntimeException", true);
            noj.b(activity, 907115008, 404, "RuntimeException:" + e2.getMessage(), str4, "accountPickerH5.qrCodeAuthLogin", "api_ret");
        } catch (Exception e3) {
            nox.a("HuaweiIdOAuthService", "Exception", true);
            noj.b(activity, 907115008, 404, "Exception:" + e3.getMessage(), str4, "accountPickerH5.qrCodeAuthLogin", "api_ret");
        }
    }

    public static void e(Activity activity, String str, String str2, String str3, ResultCallBack<nmw> resultCallBack) {
        nox.b("HuaweiIdOAuthService", "openPersonalInfo start.", true);
        if (activity == null) {
            nox.a("HuaweiIdOAuthService", "activity is null.", true);
            return;
        }
        String strB = noj.b();
        noj.b(activity, 907115006, 0, "enter openPersonalInfo", strB, "accountPickerH5.openPersonalInfo", "api_entry");
        if (TextUtils.isEmpty(str2) || resultCallBack == null || TextUtils.isEmpty(str)) {
            nox.a("HuaweiIdOAuthService", "openPersonalInfo param error", true);
            noj.b(activity, 907115006, 404, "openPersonalInfo param error", strB, "accountPickerH5.openPersonalInfo", "api_ret");
            if (resultCallBack != null) {
                resultCallBack.onResult(new nmw(new nms(404, "openPersonalInfo param error")));
                return;
            }
            return;
        }
        if (!nom.i(activity)) {
            nox.a("HuaweiIdOAuthService", "network is unavailable.", true);
            noj.b(activity, 907115006, 2005, "Network is Unavailable", strB, "accountPickerH5.openPersonalInfo", "api_ret");
            nms nmsVar = new nms(2005, "Network is Unavailable");
            nmsVar.d(false);
            resultCallBack.onResult(new nmw(nmsVar));
            return;
        }
        e(activity, str, str3, str2, strB, resultCallBack);
    }

    private static void e(Activity activity, String str, String str2, String str3, String str4, ResultCallBack<nmw> resultCallBack) {
        try {
            nom.b(resultCallBack);
            Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
            intent.putExtra("key_app_id", Util.getAppId(activity));
            intent.putExtra("key_device_info", (Parcelable) DeviceInfo.a(activity, str2));
            intent.putExtra("key_access_token", str3);
            intent.putExtra("key_oper", "open_personal_info");
            intent.putExtra("key_transId", str4);
            intent.putExtra("grs_app_name", str);
            intent.setPackage(activity.getPackageName());
            activity.startActivity(intent);
        } catch (IllegalArgumentException e) {
            nox.a("HuaweiIdOAuthService", "IllegalArgumentException", true);
            noj.b(activity, 907115006, 404, "IllegalArgumentException:" + e.getMessage(), str4, "accountPickerH5.openPersonalInfo", "api_ret");
        } catch (RuntimeException e2) {
            nox.a("HuaweiIdOAuthService", "RuntimeException", true);
            noj.b(activity, 907115006, 404, "RuntimeException:" + e2.getMessage(), str4, "accountPickerH5.openPersonalInfo", "api_ret");
        } catch (Exception e3) {
            nox.a("HuaweiIdOAuthService", "Exception", true);
            noj.b(activity, 907115006, 404, "Exception:" + e3.getMessage(), str4, "accountPickerH5.openPersonalInfo", "api_ret");
        }
    }

    public static void b(Activity activity, String str, String str2, String str3, String str4, ResultCallBack<nmt> resultCallBack) {
        nox.b("HuaweiIdOAuthService", "openAccountCenter start.", true);
        if (activity == null) {
            nox.a("HuaweiIdOAuthService", "activity is null.", true);
            return;
        }
        String strB = noj.b();
        noj.b(activity, 907115004, 0, "enter openAccountCenter", strB, "accountPickerH5.openAccountManager_v3", "api_entry");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || resultCallBack == null || TextUtils.isEmpty(str)) {
            nox.a("HuaweiIdOAuthService", "openAccountManager param error", true);
            noj.b(activity, 907115004, 404, "openAccountManager param error", strB, "accountPickerH5.openAccountManager_v3", "api_ret");
            if (resultCallBack != null) {
                resultCallBack.onResult(new nmt(new nms(404, "openAccountManager param error")));
                return;
            }
            return;
        }
        if (!nom.i(activity)) {
            nox.a("HuaweiIdOAuthService", "network is unavailable.", true);
            noj.b(activity, 907115004, 2005, "Network is Unavailable", strB, "accountPickerH5.openAccountManager_v3", "api_ret");
            nms nmsVar = new nms(2005, "Network is Unavailable");
            nmsVar.d(false);
            resultCallBack.onResult(new nmt(nmsVar));
            return;
        }
        a(activity, str, str2, str4, strB, str3, resultCallBack);
    }

    private static void a(Activity activity, String str, String str2, String str3, String str4, String str5, ResultCallBack<nmt> resultCallBack) {
        try {
            nom.i(resultCallBack);
            Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
            intent.putExtra("key_app_id", Util.getAppId(activity));
            intent.putExtra("key_access_token", str2);
            intent.putExtra("reqClientType", str3);
            intent.putExtra("key_transId", str4);
            intent.putExtra("key_device_info", (Parcelable) DeviceInfo.a(activity, str5));
            intent.putExtra("key_oper", "from_open_center_mng_new");
            intent.putExtra("key_login_mode", f43294c);
            intent.putExtra("grs_app_name", str);
            intent.setPackage(activity.getPackageName());
            activity.startActivity(intent);
        } catch (IllegalArgumentException e) {
            nox.a("HuaweiIdOAuthService", "enterAccountCenter IllegalArgumentException", true);
            noj.b(activity, 907115004, 404, "IllegalArgumentException:" + e.getMessage(), str4, "accountPickerH5.openAccountManager_v3", "api_ret");
        } catch (RuntimeException e2) {
            nox.a("HuaweiIdOAuthService", "RuntimeException", true);
            noj.b(activity, 907115004, 404, "RuntimeException:" + e2.getMessage(), str4, "accountPickerH5.openAccountManager_v3", "api_ret");
        } catch (Exception e3) {
            nox.a("HuaweiIdOAuthService", "Exception", true);
            noj.b(activity, 907115004, 404, "Exception:" + e3.getMessage(), str4, "accountPickerH5.openAccountManager_v3", "api_ret");
        }
    }

    public static void c(Activity activity, String str, String str2, String str3, String str4, ResultCallBack<nmk> resultCallBack) {
        nox.b("HuaweiIdOAuthService", "chkUserPassword start.", true);
        if (activity == null) {
            nox.a("HuaweiIdOAuthService", "activity is null.", true);
            return;
        }
        String strB = noj.b();
        noj.b(activity, 907115003, 0, "enter chkUserPassword", strB, "accountPickerH5.chkUserPassword_v3", "api_entry");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            nox.a("HuaweiIdOAuthService", "chkUserPassword param error", true);
            noj.b(activity, 907115003, 404, "chkUserPassword param error", strB, "accountPickerH5.chkUserPassword_v3", "api_ret");
            if (resultCallBack != null) {
                resultCallBack.onResult(new nmk("", new nms(404, "chkUserPassword param error")));
                return;
            }
            return;
        }
        if (!nom.i(activity)) {
            nox.a("HuaweiIdOAuthService", "network is unavailable.", true);
            noj.b(activity, 907115003, 2005, "Network is Unavailable", strB, "accountPickerH5.chkUserPassword_v3", "api_ret");
            nms nmsVar = new nms(2005, "Network is Unavailable");
            nmsVar.d(false);
            resultCallBack.onResult(new nmk("", nmsVar));
            return;
        }
        c(activity, str, str2, str3, strB, str4, resultCallBack);
    }

    private static void c(Activity activity, String str, String str2, String str3, String str4, String str5, ResultCallBack<nmk> resultCallBack) {
        try {
            nom.a(resultCallBack);
            Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
            intent.putExtra("key_app_id", Util.getAppId(activity));
            intent.putExtra("key_access_token", str2);
            intent.putExtra("key_check_password_type", str3);
            intent.putExtra("key_transId", str4);
            intent.putExtra("key_device_info", (Parcelable) DeviceInfo.a(activity, str5));
            intent.putExtra("key_oper", "verify_password_new");
            intent.putExtra("grs_app_name", str);
            intent.setPackage(activity.getPackageName());
            activity.startActivity(intent);
        } catch (IllegalArgumentException e) {
            nox.a("HuaweiIdOAuthService", "chkUserPassword IllegalArgumentException", true);
            noj.b(activity, 907115003, 404, "IllegalArgumentException:" + e.getMessage(), str4, "accountPickerH5.chkUserPassword_v3", "api_ret");
        } catch (RuntimeException e2) {
            nox.a("HuaweiIdOAuthService", "RuntimeException", true);
            noj.b(activity, 907115003, 404, "RuntimeException:" + e2.getMessage(), str4, "accountPickerH5.chkUserPassword_v3", "api_ret");
        } catch (Exception e3) {
            nox.a("HuaweiIdOAuthService", "Exception", true);
            noj.b(activity, 907115003, 404, "Exception:" + e3.getMessage(), str4, "accountPickerH5.chkUserPassword_v3", "api_ret");
        }
    }

    public static void c(final Context context, String str, String str2, final ResultCallBack<nmv> resultCallBack) throws nmr {
        nox.b("HuaweiIdOAuthService", "enter revoke", true);
        if (context == null) {
            nox.a("HuaweiIdOAuthService", "mContext is null.", true);
            return;
        }
        final String strB = noj.b();
        noj.b(context, 907115009, 0, "enter revoke", strB, "accountPickerH5.revoke", "api_entry");
        if (TextUtils.isEmpty(str2)) {
            nox.b("HuaweiIdOAuthService", "revoke parameter error: AT invalid", true);
            noj.b(context, 907115009, 404, "AT is empty", strB, "accountPickerH5.revoke", "api_ret");
            throw new nmr("AT is empty");
        }
        if (TextUtils.isEmpty(str)) {
            nox.b("HuaweiIdOAuthService", "revoke parameter error: grsAppName invalid", true);
            noj.b(context, 907115009, 404, "grsAppName is empty", strB, "accountPickerH5.revoke", "api_ret");
            throw new nmr("grsAppName is empty");
        }
        if (resultCallBack == null) {
            nox.b("HuaweiIdOAuthService", "revoke parameter error: resultCallBack is null", true);
            noj.b(context, 907115009, 404, "ResultResultCallBack is null", strB, "accountPickerH5.revoke", "api_ret");
            throw new nmr("ResultResultCallBack is null");
        }
        if (!nom.i(context)) {
            nox.a("HuaweiIdOAuthService", "network is unavailable.", true);
            noj.b(context, 907115009, 2005, "Network is Unavailable", strB, "accountPickerH5.revoke", "api_ret");
            nms nmsVar = new nms(2005, "Network is Unavailable");
            nmsVar.d(false);
            resultCallBack.onResult(new nmv(nmsVar));
            return;
        }
        nnk.a().b(context, str, new nnd(context, str2), new j() { // from class: nmq.3
            @Override // com.huawei.hwidauth.c.j
            public void onSuccess(String str3) {
                nox.b("HuaweiIdOAuthService", "revoke onSuccess", true);
                nox.b("HuaweiIdOAuthService", "revoke onSuccess response： " + str3, false);
                resultCallBack.onResult(new nmv(new nms(200, "success")));
                noj.b(context, 907115009, 200, "revoke success", strB, "accountPickerH5.revoke", "api_ret");
            }

            @Override // com.huawei.hwidauth.c.j
            public void onFailure(int i, String str3) {
                int iOptInt;
                nox.b("HuaweiIdOAuthService", "revoke fail", true);
                nox.b("HuaweiIdOAuthService", "revoke fail response： " + str3, false);
                try {
                    iOptInt = new JSONObject(str3).optInt("sub_error");
                    try {
                        nox.b("HuaweiIdOAuthService", "revoke fail:server errorCode=" + iOptInt, true);
                    } catch (JSONException unused) {
                        nox.a("HuaweiIdOAuthService", "revoke parse json exception", true);
                    }
                } catch (JSONException unused2) {
                    iOptInt = 0;
                }
                resultCallBack.onResult(new nmv(nmq.d(iOptInt, str3, 0)));
                noj.b(context, 907115009, 0, "revoke fail", strB, "accountPickerH5.revoke", "api_ret");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static nms d(int i, String str, int i2) {
        int i3;
        String str2;
        if (i == 31218 || i == 31202 || i == 11205 || i == 31204) {
            i3 = 2008;
            str2 = "AccessToken is invalid.";
        } else if (i == 60005) {
            i3 = 404;
            str2 = "Server handle error";
        } else {
            i3 = 2015;
            str2 = "oauth server inner error";
        }
        nox.b("HuaweiIdOAuthService", "revoke fail  sdkErrorCode=" + i3 + " sdkErrCodeDes=" + str2, true);
        return new nms(i3, str2);
    }

    public static void b(Activity activity, String str, String str2, String str3, ResultCallBack<nmw> resultCallBack) {
        nox.b("HuaweiIdOAuthService", "qrCodeAuthorize start.", true);
        if (activity == null) {
            nox.a("HuaweiIdOAuthService", "activity is null.", true);
            return;
        }
        String strB = noj.b();
        noj.b(activity, 907115011, 0, "enter qrCodeAuthorize", strB, "accountPickerH5.qrCodeAuthorize", "api_entry");
        if (TextUtils.isEmpty(str3) || resultCallBack == null || TextUtils.isEmpty(str)) {
            nox.a("HuaweiIdOAuthService", "qrCodeAuthorize param error", true);
            noj.b(activity, 907115011, 404, "qrCodeAuthorize param error", strB, "accountPickerH5.qrCodeAuthorize", "api_ret");
            if (resultCallBack != null) {
                resultCallBack.onResult(new nmw(new nms(404, "qrCodeAuthorize param error")));
                return;
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            String strOptString = jSONObject.optString("user_code");
            String strOptString2 = jSONObject.optString("verification_url");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                nox.a("HuaweiIdOAuthService", "userCode or verificationUrl is null", true);
                noj.b(activity, 907115011, 404, "qrCodeAuthorize param error", strB, "accountPickerH5.qrCodeAuthorize", "api_ret");
                resultCallBack.onResult(new nmw(new nms(404, "qrCodeAuthorize param error")));
            } else {
                if (!nom.i(activity)) {
                    nox.a("HuaweiIdOAuthService", "network is unavailable.", true);
                    noj.b(activity, 907115011, 2005, "Network is Unavailable", strB, "accountPickerH5.qrCodeAuthorize", "api_ret");
                    nms nmsVar = new nms(2005, "Network is Unavailable");
                    nmsVar.d(false);
                    resultCallBack.onResult(new nmw(nmsVar));
                    return;
                }
                b(activity, str, str2, strOptString, strOptString2, strB, resultCallBack);
            }
        } catch (JSONException e) {
            nox.a("HuaweiIdOAuthService", "JSONException", true);
            noj.b(activity, 907115011, 404, "Exception:" + e.getMessage(), strB, "accountPickerH5.qrCodeAuthorize", "api_ret");
            resultCallBack.onResult(new nmw(new nms(404, "exception occured")));
        }
    }

    private static void b(Activity activity, String str, String str2, String str3, String str4, String str5, ResultCallBack<nmw> resultCallBack) {
        try {
            nom.e(resultCallBack);
            Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
            intent.putExtra("key_app_id", Util.getAppId(activity));
            intent.putExtra("key_qr_code_source", TextUtils.isEmpty(str2) ? "0" : str2);
            intent.putExtra("user_code", str3);
            intent.putExtra("verification_url", str4);
            try {
                intent.putExtra("key_transId", str5);
                intent.putExtra("key_oper", "from_qr_authorize");
                intent.putExtra("grs_app_name", str);
                intent.setPackage(activity.getPackageName());
                activity.startActivity(intent);
            } catch (IllegalArgumentException e) {
                e = e;
                nox.a("HuaweiIdOAuthService", "openRealNameInfo IllegalArgumentException", true);
                noj.b(activity, 907115011, 404, "IllegalArgumentException:" + e.getMessage(), str5, "accountPickerH5.qrCodeAuthorize", "api_ret");
                resultCallBack.onResult(new nmw(new nms(404, "exception occured")));
            } catch (RuntimeException e2) {
                e = e2;
                nox.a("HuaweiIdOAuthService", "RuntimeException", true);
                noj.b(activity, 907115011, 404, "RuntimeException:" + e.getMessage(), str5, "accountPickerH5.qrCodeAuthorize", "api_ret");
                resultCallBack.onResult(new nmw(new nms(404, "exception occured")));
            } catch (Exception e3) {
                e = e3;
                nox.a("HuaweiIdOAuthService", "Exception", true);
                noj.b(activity, 907115011, 404, "Exception:" + e.getMessage(), str5, "accountPickerH5.qrCodeAuthorize", "api_ret");
                resultCallBack.onResult(new nmw(new nms(404, "exception occured")));
            }
        } catch (IllegalArgumentException e4) {
            e = e4;
        } catch (RuntimeException e5) {
            e = e5;
        } catch (Exception e6) {
            e = e6;
        }
    }
}
