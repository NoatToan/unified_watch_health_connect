package com.huawei.operation.vmall;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import androidx.core.content.ContextCompat;
import com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.R;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ddq;
import defpackage.ddv;
import defpackage.ifp;
import defpackage.ioi;
import defpackage.pjn;
import defpackage.qre;
import defpackage.qri;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class AuthVmall {
    private static final long CID_MAX_AGE_SECOND = 259200;
    private static final String COOKIE = "cookie";
    private static final String EUID = "euid";
    private static final String TAG = "AuthVmall";
    private static final String VMALL_LOGIN_URL = "/achievement/vmall/accessTokenLogin";
    private static final String VMALL_PRIVACY_URL_FORMAT = "%1$s/terms/scope/huawei/hmvmall/privacy-statement.htm?code=%2$s&branchid=0&language=%3$s&contenttag=default";
    private static String cookieStr = "";

    private AuthVmall() {
    }

    public static void vmallAtLogin(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        final JSONObject publicParams = getPublicParams(context, getPrivateParams(context));
        final HashMap<String, String> headers = getHeaders(context);
        LogUtil.e(TAG, "vmallAtLogin param: ", publicParams);
        GRSManager.c(context).d("achievementUrl", new GrsQueryCallback() { // from class: com.huawei.operation.vmall.AuthVmall.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.a(AuthVmall.TAG, "request vmall login.");
                ddq.d().doPost(str + AuthVmall.VMALL_LOGIN_URL, publicParams, headers, new IBaseResponseCallback() { // from class: com.huawei.operation.vmall.AuthVmall.1.1
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        if (obj instanceof String) {
                            AuthVmall.handleRequestResult((String) obj, iBaseResponseCallback);
                        } else {
                            LogUtil.d(AuthVmall.TAG, "onResponse not instanceof String");
                            iBaseResponseCallback.a(i, null);
                        }
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.d(AuthVmall.TAG, "GRSManager getUrl failed:", Integer.valueOf(i));
                iBaseResponseCallback.a(i, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRequestResult(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d(TAG, "post vmall login result is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("resultCode");
            LogUtil.a(TAG, "post vmall login resultCode: ", Integer.valueOf(i));
            if (i == 0) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                if (!jSONObject2.isNull(COOKIE)) {
                    saveCookie(jSONObject2.getString(COOKIE));
                    iBaseResponseCallback.a(0, null);
                    return;
                } else {
                    LogUtil.d(TAG, "post vmall login result is null");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
            }
            LogUtil.c(TAG, "post vmall login result failed: ", Integer.valueOf(i));
            iBaseResponseCallback.a(i, null);
        } catch (JSONException e) {
            LogUtil.c(TAG, "JSONException is ", e.getMessage());
            iBaseResponseCallback.a(-1, null);
        }
    }

    private static HashMap<String, String> getHeaders(Context context) {
        HashMap<String, String> map = new HashMap<>();
        map.put("x-huid", LoginInit.getInstance(context).getAccountInfo(1011));
        map.put("x-version", CommonUtil.c(context));
        return map;
    }

    private static JSONObject getPrivateParams(Context context) {
        AtLoginVmallReqBean atLoginVmallReqBean = new AtLoginVmallReqBean();
        LoginInit loginInit = LoginInit.getInstance(context);
        String accountInfo = loginInit.getAccountInfo(1010);
        atLoginVmallReqBean.setAccessToken(loginInit.getAccountInfo(1008));
        atLoginVmallReqBean.setLang(pjn.b(null));
        atLoginVmallReqBean.setCountry(accountInfo);
        atLoginVmallReqBean.setVersion(Long.valueOf(CommonUtil.e(context)));
        atLoginVmallReqBean.setBeCode(accountInfo);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timeZone", HiDateUtil.c((String) null));
            jSONObject.put(CloudParamKeys.INFO, parseListToJsonString(atLoginVmallReqBean));
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.c(TAG, "JSONException: ", e.getMessage());
            return jSONObject;
        }
    }

    private static JSONObject parseListToJsonString(AtLoginVmallReqBean atLoginVmallReqBean) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("accessToken", atLoginVmallReqBean.getAccessToken());
            jSONObject.put("lang", atLoginVmallReqBean.getLang());
            jSONObject.put("country", atLoginVmallReqBean.getCountry());
            jSONObject.put("version", atLoginVmallReqBean.getVersion());
            jSONObject.put(CloudParamKeys.BECODE, atLoginVmallReqBean.getBeCode());
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.d(TAG, "JSONException", e.getMessage());
            return jSONObject;
        }
    }

    private static JSONObject getPublicParams(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
            LoginInit loginInit = LoginInit.getInstance(context);
            jSONObject.put("token", loginInit.getAccountInfo(1008));
            jSONObject.put("appId", OperationUtils.getAppId(BaseApplication.getContext()));
            jSONObject.put("deviceType", PhoneInfoUtils.getPhoneType());
            String deviceId = loginInit.getDeviceId();
            if (TextUtils.isEmpty(deviceId)) {
                deviceId = "clientnull";
            }
            jSONObject.put("deviceId", deviceId);
            jSONObject.put("sysVersion", OperationUtils.getSysVersion());
            jSONObject.put("bindDeviceType", String.valueOf(CommonUtil.h(context)));
            jSONObject.put("appType", String.valueOf(AppTypeUtils.getAppType()));
            jSONObject.put("ts", String.valueOf(System.currentTimeMillis()));
            jSONObject.put("iVersion", String.valueOf(CommonUtil.e(context)));
            jSONObject.put("language", pjn.b(null));
            jSONObject.put("environment", String.valueOf(CommonUtil.o(context)));
            if (Utils.o()) {
                jSONObject.put("siteId", loginInit.getAccountInfo(1009));
            }
            jSONObject.put("upDeviceType", loginInit.getDeviceType());
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.c(TAG, "JSONException: ", e.getMessage());
            return jSONObject;
        }
    }

    private static void saveCookie(String str) {
        cookieStr = str;
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20006), COOKIE, str, new StorageParams());
    }

    public static void setCookie(String str) {
        LogUtil.a(TAG, "enter setCookie().");
        if (TextUtils.isEmpty(str)) {
            LogUtil.c(TAG, "setCookie() url is null");
            return;
        }
        String strE = cookieStr;
        if (TextUtils.isEmpty(strE)) {
            strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(20006), COOKIE);
            if (!TextUtils.isEmpty(strE)) {
                cookieStr = strE;
            }
        }
        if (TextUtils.isEmpty(strE) || !strE.contains(EUID)) {
            LogUtil.c(TAG, "storeVmallCookie is null or no euid");
            return;
        }
        CookieManager cookieManager = CookieManager.getInstance();
        String cookieCid = getCookieCid(str);
        cookieManager.setAcceptCookie(true);
        for (String str2 : strE.split(",")) {
            if (!TextUtils.isEmpty(str2)) {
                cookieManager.setCookie(str, str2);
            }
        }
        cookieManager.setCookie(str, "hasLogin=1610334747531");
        if (!TextUtils.isEmpty(cookieCid)) {
            cookieManager.setCookie(str, cookieCid);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.d(TAG, "CookieManager cookie2: ", CookieManager.getInstance().getCookie(str));
    }

    private static String getCookieCid(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d(TAG, "getCookieCid url is empty!");
            return "";
        }
        String cookie = CookieManager.getInstance().getCookie(str);
        if (TextUtils.isEmpty(cookie) || !cookie.contains("cps_id=")) {
            LogUtil.d(TAG, "getCookieCid cid doesn't exist!");
            return "";
        }
        for (String str2 : cookie.split(";")) {
            if (str2.contains("cps_id=")) {
                LogUtil.a(TAG, "getCookieCid cid cookie:", str2);
                return str2.trim() + ";max-age=259200;path=/";
            }
        }
        return "";
    }

    public static void showAuthDialog(Activity activity, final CommonSingleCallback<Boolean> commonSingleCallback) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        final Dialog dialog = new Dialog(activity, R.style.CustomDialog);
        View viewInflate = View.inflate(activity, R.layout.layout_vmall_auth_dialog, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.tv_dialog_content);
        healthTextView.setText(getAuthDialogContent(activity));
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView.setHighlightColor(activity.getColor(android.R.color.transparent));
        viewInflate.findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.vmall.AuthVmall$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthVmall.lambda$showAuthDialog$0(dialog, commonSingleCallback, view);
            }
        });
        viewInflate.findViewById(R.id.btn_agree).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.operation.vmall.AuthVmall$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthVmall.lambda$showAuthDialog$1(dialog, commonSingleCallback, view);
            }
        });
        dialog.setContentView(viewInflate);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            window.setAttributes(attributes);
        }
        dialog.show();
    }

    static /* synthetic */ void lambda$showAuthDialog$0(Dialog dialog, CommonSingleCallback commonSingleCallback, View view) {
        dialog.dismiss();
        ioi.d().e(401, false, null, null);
        if (commonSingleCallback != null) {
            commonSingleCallback.callback(false);
        }
    }

    static /* synthetic */ void lambda$showAuthDialog$1(Dialog dialog, CommonSingleCallback commonSingleCallback, View view) {
        dialog.dismiss();
        ioi.d().e(401, true, null, null);
        if (commonSingleCallback != null) {
            commonSingleCallback.callback(true);
        }
    }

    private static SpannableString getAuthDialogContent(final Activity activity) {
        String strF = qre.f(R.string.IDS_hwh_vmall_privacy_statement);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_authorized_by_vmall_privacy_dialog_content, strF));
        qri.a(spannableString, strF, new ClickableSpan() { // from class: com.huawei.operation.vmall.AuthVmall.2
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                String url = GRSManager.c(activity).getUrl("domainLegalCloudHuawei");
                String accountInfo = LoginInit.getInstance(activity).getAccountInfo(1010);
                String lowerCase = "GB".equals(accountInfo) ? "uk" : accountInfo.toLowerCase(Locale.ENGLISH);
                String lowerCase2 = LanguageUtil.a().toLowerCase(Locale.ENGLISH);
                Intent intentCreateWebViewIntent = ddv.b().createWebViewIntent(activity, null, 268435456);
                intentCreateWebViewIntent.putExtra("url", String.format(Locale.ENGLISH, AuthVmall.VMALL_PRIVACY_URL_FORMAT, url, lowerCase, lowerCase2));
                activity.startActivity(intentCreateWebViewIntent);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(ContextCompat.getColor(activity, R.color.common_colorAccent));
                textPaint.setUnderlineText(false);
            }
        });
        return spannableString;
    }

    public static String decodeRealUrl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strE = ifp.e(ifp.e(str));
        if (strE.contains(Constants.SUFFIX_URL)) {
            strE = strE.substring(strE.indexOf(Constants.SUFFIX_URL) + 4);
        }
        if (strE.toLowerCase(Locale.ENGLISH).startsWith("https://")) {
            return strE;
        }
        return str2 + strE;
    }
}
