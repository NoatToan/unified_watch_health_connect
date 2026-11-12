package com.huawei.operation.myhuawei;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.R;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.ddv;
import defpackage.feb;
import defpackage.ioi;
import defpackage.lsl;
import defpackage.oet;
import defpackage.ofe;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qri;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class MyHuaweiLogin {
    public static final String IS_START_LOGIN = "isStartLogin";
    private static final String MYHUAWEI_LOGIN_URL = "/achievement/threeRingTask/myHuawei/loginMyHuawei";
    private static final String MYHUAWEI_PRIVACY_URL = "/privacy/privacy-policy/";
    private static final String MYHUAWEI_PRIVACY_URL_KEY = "/privacy/";
    public static final String RELOAD_URL = "reloadUrl";
    private static final String TAG = "PluginOperation_MyHuaweiLogin";

    public static void myHuaweiLoginCloud(final UiCallback<String> uiCallback) {
        MyHuaweiLoginRequest myHuaweiLoginRequest = new MyHuaweiLoginRequest();
        myHuaweiLoginRequest.setTimeZone(lsl.q(System.currentTimeMillis()));
        myHuaweiLoginRequest.setAccessToken(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008));
        final HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.getContext());
        final String strC = ofe.c(healthDataCloudFactory.getBody(myHuaweiLoginRequest));
        LogUtil.a(TAG, "myHuaweiLoginCloud body: ", strC);
        GRSManager.c(BaseApplication.getContext()).d("achievementUrl", new GrsQueryCallback() { // from class: com.huawei.operation.myhuawei.MyHuaweiLogin.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                oet.d().c(str + MyHuaweiLogin.MYHUAWEI_LOGIN_URL, healthDataCloudFactory.getHeaders(), strC, MyHuaweiLoginResponse.class, new ResultCallback<MyHuaweiLoginResponse>() { // from class: com.huawei.operation.myhuawei.MyHuaweiLogin.1.1
                    @Override // com.huawei.networkclient.ResultCallback
                    public void onSuccess(MyHuaweiLoginResponse myHuaweiLoginResponse) {
                        LogUtil.a(MyHuaweiLogin.TAG, "myHuaweiLoginCloud onSuccess: ", myHuaweiLoginResponse);
                        if (myHuaweiLoginResponse.getResultCode() == 0) {
                            uiCallback.onSuccess(HandlerExecutor.a(), myHuaweiLoginResponse.getCookie());
                        } else {
                            uiCallback.onFailure(HandlerExecutor.a(), myHuaweiLoginResponse.getResultCode(), "");
                        }
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        ReleaseLogUtil.e(MyHuaweiLogin.TAG, "myHuaweiLoginCloud with ", th == null ? null : th.getMessage());
                        uiCallback.onFailure(HandlerExecutor.a(), -1, "");
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                ReleaseLogUtil.e(MyHuaweiLogin.TAG, "get GRS failed ");
                uiCallback.onFailure(HandlerExecutor.a(), -1, "");
            }
        });
    }

    public static void handleMyHuaweiLogin(String str, UiCallback<String> uiCallback, Activity activity) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.operation.myhuawei.MyHuaweiLogin$$ExternalSyntheticLambda0
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    ReleaseLogUtil.c(MyHuaweiLogin.TAG, "browsingToLogin with ", Integer.valueOf(i));
                }
            }, "");
            activity.finish();
            return;
        }
        if (String.valueOf(true).equals(ioi.d().c(405))) {
            myHuaweiLoginCloud(uiCallback);
        } else {
            buildMyHuaweiDialog(uiCallback, activity, str);
        }
    }

    public static void buildMyHuaweiDialog(final UiCallback<String> uiCallback, final Activity activity, String str) {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.operation.myhuawei.MyHuaweiLogin$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                MyHuaweiLogin.lambda$buildMyHuaweiDialog$3(activity, uiCallback);
            }
        });
    }

    static /* synthetic */ void lambda$buildMyHuaweiDialog$3(Activity activity, final UiCallback uiCallback) {
        if (activity == null) {
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(activity);
        builder.a(R.string.IDS_myhuawei_privacy_marketing_dialog_title).d(getDialogContent(false)).a(R.string.IDS_user_permission_ok, new View.OnClickListener() { // from class: com.huawei.operation.myhuawei.MyHuaweiLogin$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyHuaweiLogin.lambda$buildMyHuaweiDialog$1(uiCallback, view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.operation.myhuawei.MyHuaweiLogin$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyHuaweiLogin.lambda$buildMyHuaweiDialog$2(uiCallback, view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    static /* synthetic */ void lambda$buildMyHuaweiDialog$1(UiCallback uiCallback, View view) {
        ioi.d().e(405, true, null, null);
        myHuaweiLoginCloud(uiCallback);
    }

    static /* synthetic */ void lambda$buildMyHuaweiDialog$2(UiCallback uiCallback, View view) {
        ioi.d().e(405, false, null, null);
        uiCallback.onFailure(HandlerExecutor.a(), -1, "User Cancelled");
    }

    public static Map<String, Object> getMyHuaweiLogin(String str, String str2, boolean z) {
        HashMap map = new HashMap();
        map.put(IS_START_LOGIN, false);
        map.put(RELOAD_URL, str);
        if (isSupportMyHuaweiLogin()) {
            final HashMap map2 = new HashMap();
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.operation.myhuawei.MyHuaweiLogin$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MyHuaweiLogin.lambda$getMyHuaweiLogin$4(map2, countDownLatch);
                }
            });
            try {
                if (!countDownLatch.await(2L, TimeUnit.SECONDS)) {
                    ReleaseLogUtil.b(TAG, "getGrsUrl wait over time");
                    return map;
                }
                if (z && isMyHuaweiUrl(str, map2)) {
                    map.put(IS_START_LOGIN, true);
                    return map;
                }
                if (isMyHuaweiUpLogin(str, str2, map2)) {
                    map.put(IS_START_LOGIN, true);
                    map.put(RELOAD_URL, str2);
                }
            } catch (InterruptedException unused) {
                ReleaseLogUtil.e(TAG, "getGrsUrl InterruptedException");
                return map;
            }
        }
        return map;
    }

    static /* synthetic */ void lambda$getMyHuaweiLogin$4(HashMap map, CountDownLatch countDownLatch) {
        Context context = BaseApplication.getContext();
        map.put("domainMyHuawei", GRSManager.c(context).getUrl("domainMyHuawei"));
        map.put("domainMyHuaweiUpLogin", GRSManager.c(context).getUrl("domainMyHuaweiUpLogin"));
        map.put("domainMyHuaweiOauthLogin", GRSManager.c(context).getUrl("domainMyHuaweiOauthLogin"));
        countDownLatch.countDown();
    }

    private static boolean isMyHuaweiUpLogin(String str, String str2, HashMap<String, String> map) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strD = qqw.d((Map) map, "domainMyHuaweiUpLogin", "");
            String strD2 = qqw.d((Map) map, "domainMyHuaweiOauthLogin", "");
            boolean z = !TextUtils.isEmpty(strD) && str.contains(strD);
            boolean z2 = !TextUtils.isEmpty(strD2) && str.contains(strD2);
            if ((z || z2) && isMyHuaweiUrl(str2, map)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMyHuaweiUrl(String str, HashMap<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strD = qqw.d((Map) map, "domainMyHuawei", "");
        if (TextUtils.isEmpty(strD)) {
            return false;
        }
        String strB = feb.b(str);
        if (feb.c().c(strB)) {
            if (str.contains(strD + "/" + strB.toLowerCase(Locale.ENGLISH)) && !str.contains(MYHUAWEI_PRIVACY_URL_KEY)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSupportMyHuaweiLogin() {
        if (Utils.o() && VersionControlUtil.isSupportOperationAccount()) {
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
            String strD = feb.c().d(accountInfo);
            if (TextUtils.isEmpty(strD)) {
                LogUtil.c(TAG, "isSupportMyHuaweiLogin false: code=" + accountInfo + ", ver=" + strD);
                return false;
            }
            if (CommonUtil.e(CommonUtil.a(BaseApplication.getContext()), strD) >= 0) {
                return true;
            }
        }
        return false;
    }

    private static String[] getSupportCountry() {
        try {
            return BaseApplication.getContext().getResources().getStringArray(com.huawei.hwcommonmodel.R.array.my_huawei_login_country_code);
        } catch (Resources.NotFoundException e) {
            LogUtil.c(TAG, "isSupportMyHuaweiLogin meet exception: ", e.getMessage());
            return new String[0];
        }
    }

    public static SpannableString getDialogContent(boolean z) {
        int i;
        String strF = qre.f(R.string.IDS_myhuawei_privacy_statement);
        if (z) {
            i = R.string.IDS_myhuawei_privacy_dialog_content;
        } else {
            i = R.string.IDS_myhuawei_privacy_marketing_dialog_content;
        }
        SpannableString spannableString = new SpannableString(qre.a(i, strF));
        qri.a(spannableString, strF, new ClickableSpan() { // from class: com.huawei.operation.myhuawei.MyHuaweiLogin.2
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                MyHuaweiLogin.startH5Activity(MyHuaweiLogin.getMyHuaweiPrivacyUrl());
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(ContextCompat.getColor(BaseApplication.getContext(), R.color.common_colorAccent));
                textPaint.setUnderlineText(false);
            }
        });
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void startH5Activity(String str) {
        Intent intentCreateWebViewIntent = ddv.b().createWebViewIntent(BaseApplication.getContext(), new Bundle(), 268435456);
        if (intentCreateWebViewIntent != null) {
            intentCreateWebViewIntent.putExtra("url", str);
            BaseApplication.getContext().startActivity(intentCreateWebViewIntent);
        } else {
            LogUtil.c(TAG, "startH5Activity intent is null");
        }
    }

    public static String getMyHuaweiPrivacyUrl() {
        String accountInfo = LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1010);
        if ("GB".equals(accountInfo)) {
            accountInfo = "uk";
        }
        return GRSManager.c(BaseApplication.getContext()).getUrl("domainMyHuawei") + "/" + accountInfo.toLowerCase(Locale.ENGLISH) + MYHUAWEI_PRIVACY_URL;
    }
}
