package com.huawei.hms.support.picker.common;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.UserManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.huawei.hms.a.a.c.a;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hms.common.utils.AccountPickerEmuiUtil;
import com.huawei.hms.support.api.entity.hwid.AccountPickerSignInRequest;
import com.huawei.hms.support.picker.activity.AccountPickerSignInHubActivity;
import com.huawei.hms.support.picker.request.AccountPickerParams;
import com.huawei.hms.support.picker.result.AccountPickerResult;
import com.huawei.hms.support.picker.result.AuthAccountPicker;
import com.huawei.hms.utils.Util;
import defpackage.nox;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AccountPickerUtil {
    private static final String DISPLAYSIDEREGIONEX = "com.huawei.android.view.DisplaySideRegionEx";
    private static final String HUAWEI_ANDROID_VIEW_LAYOUTPARAMSEX = "com.huawei.android.view.LayoutParamsEx";
    private static final String HWFLAGS = "addHwFlags";
    private static final int LAYOUT_IN_DISPLAY = 1;
    private static final int SECURE_SCREENSHOT = 4096;
    private static final String TAG = "[ACCOUNTSDK]AccountPickerUtil";
    private static final String WINDOW_MANAGER_EX_LAYOUT_PARAMS_EX = "com.huawei.android.view.WindowManagerEx$LayoutParamsEx";
    private static Boolean isPhoneStillInLockMode;

    public static void clearSignInAccountCache() {
        a.a().c();
    }

    public static AuthAccountPicker getCachedSignInAccount() {
        return a.a().b();
    }

    public static AccountPickerResult getSignInResultFromIntent(Intent intent) {
        nox.b(TAG, "getSignInResultFromIntent", true);
        if (intent == null || !intent.hasExtra("HUAWEIID_SIGNIN_RESULT")) {
            nox.a(TAG, "data or signInResult is null", true);
            return null;
        }
        try {
            return new AccountPickerResult().fromJson(intent.getStringExtra("HUAWEIID_SIGNIN_RESULT"));
        } catch (JSONException unused) {
            nox.a(TAG, "JSONException", true);
            return null;
        }
    }

    public static Intent getSignInIntent(Context context, AccountPickerParams accountPickerParams, String str, String str2, int i, boolean z) {
        nox.b(TAG, "getSignInIntent", true);
        Intent intent = new Intent(AuthInternalPickerConstant.IntentAction.ACTION_SIGN_IN_HUB);
        try {
            intent.setPackage(context.getPackageName());
            if (z) {
                nox.b(TAG, "pickerType is " + i, true);
                try {
                    JSONObject jSONObject = new JSONObject(accountPickerParams.getSignInParams());
                    jSONObject.put(AuthInternalPickerConstant.SignInReqKey.PICKER_TYPE, i);
                    accountPickerParams.setSignInParams(jSONObject.toString());
                } catch (JSONException e) {
                    nox.a(TAG, "JSONException:" + e.getClass().getSimpleName(), true);
                }
                intent.setClass(context, AccountPickerSignInHubActivity.class);
                intent.putExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDSIGNINREQUEST, str2);
                intent.putExtra(AuthInternalPickerConstant.SignInReqKey.IS_NEW_SERVICE, z);
                String appId = Util.getAppId(context);
                String packageName = context.getPackageName();
                com.huawei.hms.a.a.a.a aVar = new com.huawei.hms.a.a.a.a();
                aVar.setAppId(appId);
                aVar.setPackageName(packageName);
                aVar.setHmsSdkVersion(61300303L);
                aVar.setSubAppId(str);
                AccountPickerSignInRequest accountPickerSignInRequest = new AccountPickerSignInRequest();
                accountPickerSignInRequest.setAccountPickerParams(accountPickerParams);
                try {
                    intent.putExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDCPCLIENTINFO, aVar.toJson());
                    intent.putExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDSIGNINREQUEST, accountPickerSignInRequest.toJson());
                } catch (JSONException e2) {
                    nox.a(TAG, "JSONException:" + e2.getClass().getSimpleName(), true);
                }
            } else {
                intent.setClass(context, AccountPickerSignInHubActivity.class);
                intent.putExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDSIGNINREQUEST, str2);
                intent.putExtra(AuthInternalPickerConstant.SignInReqKey.IS_NEW_SERVICE, z);
                String appId2 = Util.getAppId(context);
                String packageName2 = context.getPackageName();
                com.huawei.hms.a.a.a.a aVar2 = new com.huawei.hms.a.a.a.a();
                aVar2.setAppId(appId2);
                aVar2.setPackageName(packageName2);
                aVar2.setHmsSdkVersion(61300303L);
                aVar2.setSubAppId(str);
                AccountPickerSignInRequest accountPickerSignInRequest2 = new AccountPickerSignInRequest();
                accountPickerSignInRequest2.setAccountPickerParams(accountPickerParams);
                intent.putExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDCPCLIENTINFO, aVar2.toJson());
                intent.putExtra(AuthInternalPickerConstant.SignInReqKey.HUAWEIIDSIGNINREQUEST, accountPickerSignInRequest2.toJson());
            }
        } catch (Exception e3) {
            nox.a(TAG, "Exception:" + e3.getClass().getSimpleName(), true);
        }
        return intent;
    }

    public static Intent getSignInByMcpIntent(Context context, AccountPickerParams accountPickerParams, String str, String str2, int i, boolean z) {
        Intent signInIntent = getSignInIntent(context, accountPickerParams, str, str2, i, z);
        signInIntent.putExtra(AuthInternalPickerConstant.SignInReqKey.MCP_SIGN_IN, true);
        return signInIntent;
    }

    public static boolean networkIsAvaiable(Context context) {
        nox.b(TAG, "enter networkIsAvaiable", true);
        if (context == null) {
            nox.a(TAG, "context is null", true);
            return false;
        }
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        if (systemService == null) {
            nox.a(TAG, "connectivity is null,so networkIsAvaiable is unaviable", true);
            return false;
        }
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) systemService).getAllNetworkInfo();
        if (allNetworkInfo == null || allNetworkInfo.length == 0) {
            nox.b(TAG, "NetworkInfo is null,so networkIsAvaiable is unaviable", true);
            return false;
        }
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                return true;
            }
        }
        nox.b(TAG, "NetworkInfo state is unaviable", true);
        return false;
    }

    public static void setEMUI10StatusBarColor(Activity activity) {
        if (AccountPickerEmuiUtil.isAboveEMUI100()) {
            initOnApplyWindowInsets(activity);
        }
    }

    private static void initOnApplyWindowInsets(Activity activity) {
        nox.b(TAG, "begin initOnApplyWindowInsets", true);
        final ViewGroup viewGroup = (ViewGroup) activity.getWindow().findViewById(R.id.content);
        if (viewGroup == null) {
            nox.a(TAG, "sRootView is null", true);
        } else {
            setLayoutDisplaySide(activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.huawei.hms.support.picker.common.AccountPickerUtil.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    try {
                        Object objInvoke = Class.forName(AccountPickerUtil.WINDOW_MANAGER_EX_LAYOUT_PARAMS_EX).getMethod("getDisplaySideRegion", WindowInsets.class).invoke(null, windowInsets);
                        if (objInvoke == null) {
                            nox.b(AccountPickerUtil.TAG, "Non-hypersurface equipment", true);
                        } else {
                            Rect rect = (Rect) Class.forName(AccountPickerUtil.DISPLAYSIDEREGIONEX).getMethod("getSafeInsets", new Class[0]).invoke(objInvoke, new Object[0]);
                            nox.b(AccountPickerUtil.TAG, "safeInsets Left and Right: " + rect.left + ":" + rect.right, true);
                            nox.b(AccountPickerUtil.TAG, "safeInsets Top and BOttom: " + rect.top + ":" + rect.bottom, true);
                            ViewGroup viewGroup2 = viewGroup;
                            if (viewGroup2 != null) {
                                viewGroup2.setPadding(rect.left, 0, rect.right, 0);
                            }
                        }
                    } catch (ClassNotFoundException unused) {
                        nox.a(AccountPickerUtil.TAG, "ClassNotFoundException", true);
                    } catch (IllegalAccessException unused2) {
                        nox.a(AccountPickerUtil.TAG, "IllegalAccessException", true);
                    } catch (NoSuchMethodException unused3) {
                        nox.a(AccountPickerUtil.TAG, "NoSuchMethodException", true);
                    } catch (InvocationTargetException unused4) {
                        nox.a(AccountPickerUtil.TAG, "InvocationTargetException", true);
                    } catch (Throwable th) {
                        nox.a(AccountPickerUtil.TAG, "onApplyWindowInsets: " + th.getClass().getSimpleName(), true);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    private static void setLayoutDisplaySide(Activity activity) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        try {
            Class<?> cls = Class.forName(WINDOW_MANAGER_EX_LAYOUT_PARAMS_EX);
            cls.getMethod("setDisplaySideMode", Integer.TYPE).invoke(cls.getDeclaredConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 1);
        } catch (ClassNotFoundException unused) {
            nox.a(TAG, "ClassNotFoundException", true);
        } catch (IllegalAccessException unused2) {
            nox.a(TAG, "IllegalAccessException", true);
        } catch (InstantiationException unused3) {
            nox.a(TAG, "InstantiationException", true);
        } catch (NoSuchMethodException unused4) {
            nox.a(TAG, "NoSuchMethodException", true);
        } catch (InvocationTargetException unused5) {
            nox.a(TAG, "InvocationTargetException", true);
        } catch (Throwable th) {
            nox.a(TAG, "setDisplaySideMode: " + th.getClass().getSimpleName(), true);
        }
    }

    public static boolean isPhoneStillInLockMode(Context context) {
        if (context == null) {
            nox.a(TAG, "context is null", true);
            return false;
        }
        Boolean bool = isPhoneStillInLockMode;
        if (bool != null && !bool.booleanValue()) {
            nox.b(TAG, "isPhoneStillInLockMode is already false", true);
            return false;
        }
        UserManager userManager = (UserManager) context.getApplicationContext().getSystemService(UserManager.class);
        if (userManager == null) {
            nox.a(TAG, "userManager is null.", true);
            return false;
        }
        if (!userManager.isUserUnlocked()) {
            nox.a(TAG, "isPhoneStillInLockMode true", true);
            isPhoneStillInLockMode = true;
        } else {
            isPhoneStillInLockMode = false;
            nox.b(TAG, "isPhoneStillInLockMode false", true);
        }
        nox.a(TAG, "Build.VERSION.SDK_INT : " + Build.VERSION.SDK_INT + " isPhoneStillInLockMode " + isPhoneStillInLockMode, true);
        Boolean bool2 = isPhoneStillInLockMode;
        if (bool2 == null) {
            return false;
        }
        return bool2.booleanValue();
    }

    public static boolean isPcSimulator(String str) {
        nox.b(TAG, "isPcSimulator start.", true);
        try {
            return "true".equalsIgnoreCase(new JSONObject(str).optString("isPcSimulator", ""));
        } catch (JSONException unused) {
            nox.a(TAG, "isPcSimulator: JsonException", true);
            return false;
        } catch (Exception unused2) {
            nox.a(TAG, "isPcSimulator: Exception", true);
            return false;
        }
    }

    public static void setFullScreenAdaptCutout(Window window) {
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            nox.b(TAG, "android version is Higher than 9.0", true);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
            window.getDecorView().setSystemUiVisibility(1280);
            return;
        }
        nox.b(TAG, "android version is lower than 9.0", true);
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        try {
            Class<?> cls = Class.forName(HUAWEI_ANDROID_VIEW_LAYOUTPARAMSEX);
            cls.getMethod(HWFLAGS, Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes2), 4096);
        } catch (RuntimeException e) {
            nox.a(TAG, "RuntimeException occured" + e.getClass().getSimpleName(), true);
        } catch (Exception e2) {
            nox.a(TAG, "exception occured" + e2.getClass().getSimpleName(), true);
        }
    }

    public static void setStatusBarColor(Activity activity) {
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
            nox.a(TAG, "exception occured:" + e.getClass().getSimpleName(), true);
        }
    }
}
