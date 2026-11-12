package com.huawei.hms.hwid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.hms.account.internal.ui.activity.AccountSignInHubActivity;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.request.AccountAuthParamsHelper;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.entity.account.AccountSignInRequest;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.utils.Util;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static Intent a(Context context, AccountAuthParams accountAuthParams, String str) {
        ar.b("[AccountSDK]AccountAuthUtil", "getSignInIntent", true);
        return a(context, accountAuthParams, str, 0, "");
    }

    public static Intent a(Context context, AccountAuthParams accountAuthParams, String str, String str2) {
        ar.b("[AccountSDK]AccountAuthUtil", "getIndependentSignInIntent", true);
        return a(context, accountAuthParams, str, 1, str2);
    }

    private static Intent a(Context context, AccountAuthParams accountAuthParams, String str, int i, String str2) {
        String str3;
        JSONObject jSONObject;
        if (i != 1) {
            str3 = "com.huawei.hms.account.signIn";
        } else {
            str3 = AuthInternalPickerConstant.IntentAction.ACTION_SIGN_IN_HUB;
        }
        Intent intent = new Intent(str3);
        try {
            intent.setPackage(context.getPackageName());
            intent.setClass(context, AccountSignInHubActivity.class);
            if (i == 1) {
                intent.putExtra("ACCESS_TOKEN", str2);
                intent.putExtra("INDEPENDENT_SIGN_IN_FLAG", i);
                try {
                    String signInParams = accountAuthParams.getSignInParams();
                    if (TextUtils.isEmpty(signInParams)) {
                        jSONObject = new JSONObject();
                    } else {
                        jSONObject = new JSONObject(signInParams);
                    }
                    jSONObject.put("ACCESS_TOKEN", str2);
                    jSONObject.put("INDEPENDENT_SIGN_IN_FLAG", i);
                    accountAuthParams.setSignInParams(jSONObject.toString());
                } catch (JSONException e) {
                    ar.d("[AccountSDK]AccountAuthUtil", "JSONException:" + e.getClass().getSimpleName(), true);
                }
                String appId = Util.getAppId(context);
                String packageName = context.getPackageName();
                b bVar = new b();
                bVar.b(appId);
                bVar.c(packageName);
                bVar.a(61300303L);
                bVar.d(str);
                AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
                accountSignInRequest.setAccountAuthParams(accountAuthParams);
                try {
                    intent.putExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDCPCLIENTINFO, bVar.c());
                    intent.putExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDSIGNINREQUEST, accountSignInRequest.toJson());
                } catch (JSONException e2) {
                    ar.d("[AccountSDK]AccountAuthUtil", "JSONException:" + e2.getClass().getSimpleName(), true);
                }
            } else {
                String appId2 = Util.getAppId(context);
                String packageName2 = context.getPackageName();
                b bVar2 = new b();
                bVar2.b(appId2);
                bVar2.c(packageName2);
                bVar2.a(61300303L);
                bVar2.d(str);
                AccountSignInRequest accountSignInRequest2 = new AccountSignInRequest();
                accountSignInRequest2.setAccountAuthParams(accountAuthParams);
                intent.putExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDCPCLIENTINFO, bVar2.c());
                intent.putExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDSIGNINREQUEST, accountSignInRequest2.toJson());
            }
        } catch (Exception e3) {
            ar.d("[AccountSDK]AccountAuthUtil", "Exception:" + e3.getClass().getSimpleName(), true);
        }
        return intent;
    }

    public static AccountAuthResult a(Intent intent) {
        ar.b("[AccountSDK]AccountAuthUtil", "getSignInResultFromIntent", true);
        if (intent == null || !intent.hasExtra("HUAWEIID_SIGNIN_RESULT")) {
            ar.d("[AccountSDK]AccountAuthUtil", "data or signInResult is null", true);
            return null;
        }
        try {
            return new AccountAuthResult().fromJson(intent.getStringExtra("HUAWEIID_SIGNIN_RESULT"));
        } catch (JSONException unused) {
            ar.d("[AccountSDK]AccountAuthUtil", "JSONException", true);
            return null;
        }
    }

    public static void a() {
        g.a().c();
    }

    public static AuthAccount b() {
        return g.a().b();
    }

    public static AccountAuthParams a(List<Scope> list) {
        AccountAuthParamsHelper accountAuthParamsHelper = new AccountAuthParamsHelper();
        if (ap.b(list).booleanValue()) {
            accountAuthParamsHelper.setScopeList(list);
        }
        return accountAuthParamsHelper.createParams();
    }

    public static void a(Window window) {
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ar.b("[AccountSDK]AccountAuthUtil", "android version is Higher than 9.0", true);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
            window.getDecorView().setSystemUiVisibility(5894);
            return;
        }
        ar.b("[AccountSDK]AccountAuthUtil", "android version is Below 9.0", true);
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
            cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes2), 4096);
        } catch (RuntimeException e) {
            ar.d("[AccountSDK]AccountAuthUtil", "Adapt to the digging screen occur RuntimeException" + e.getClass().getSimpleName(), true);
        } catch (Exception e2) {
            ar.d("[AccountSDK]AccountAuthUtil", "Adapt to the digging screen occur exception" + e2.getClass().getSimpleName(), true);
        }
    }

    public static void a(Activity activity) {
        try {
            int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility | 1024);
            activity.getWindow().setStatusBarColor(0);
            activity.getWindow().setNavigationBarColor(0);
            if (Build.VERSION.SDK_INT >= 29) {
                activity.getWindow().setNavigationBarContrastEnforced(false);
            }
        } catch (Exception e) {
            ar.d("[AccountSDK]AccountAuthUtil", "exception occured:" + e.getClass().getSimpleName(), true);
        }
    }
}
