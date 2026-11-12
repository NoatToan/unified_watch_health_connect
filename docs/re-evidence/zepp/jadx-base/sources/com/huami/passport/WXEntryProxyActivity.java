package com.huami.passport;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huami.passport.WXEntryProxyActivity;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.v2.impl.AccountApiV2;
import com.huami.tools.log.HMLog;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class WXEntryProxyActivity extends Activity {
    public static final int AUTH_TYPE = 1;
    public static final int BIND_TYPE = 2;
    private static boolean allowFastLogin;
    private static int callType;
    private static String countryCode;
    private static String countryState;
    private static boolean isLogin;
    private static IAccount.Callback<LoginToken, ErrorCode> mCallback;
    private static TpaConfig mTpaConfig;

    public static void clear() {
        mCallback = null;
        mTpaConfig = null;
    }

    private void debugInfo(final SendAuth.Resp resp) {
        HMLog.debug(new Function0() { // from class: lc8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WXEntryProxyActivity.lambda$debugInfo$12(resp);
            }
        });
    }

    private void finishForErrorCallback(final IAccount.Callback<LoginToken, ErrorCode> callback, final String str) {
        HMLog.debug(new Function0() { // from class: jc8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WXEntryProxyActivity.lambda$finishForErrorCallback$10(callback);
            }
        });
        HMLog.debug(new Function0() { // from class: mc8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WXEntryProxyActivity.lambda$finishForErrorCallback$11(str);
            }
        });
        finish();
        AccountApi.onErrorCallback(mCallback, str);
    }

    public static IAccount.Callback<LoginToken, ErrorCode> getCallback() {
        return mCallback;
    }

    private void handleIntent(final Intent intent) {
        HMLog.debug(new Function0() { // from class: ec8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return String.valueOf(intent);
            }
        });
        final SendAuth.Resp resp = new SendAuth.Resp(intent.getExtras());
        if (resp.getType() != 1) {
            return;
        }
        HMLog.debug(new Function0() { // from class: kc8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WXEntryProxyActivity.lambda$handleIntent$3(resp);
            }
        });
        debugInfo(resp);
        int i = resp.errCode;
        if (i != 0) {
            if (i == -4) {
                HMLog.error(new Function0() { // from class: oc8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WXEntryProxyActivity.lambda$handleIntent$7();
                    }
                });
                finishForErrorCallback(mCallback, ErrorCode.TPA_DENIED_ERROR);
                return;
            } else if (i == -2) {
                HMLog.error(new Function0() { // from class: qc8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WXEntryProxyActivity.lambda$handleIntent$8();
                    }
                });
                finishForErrorCallback(mCallback, ErrorCode.USER_CANCEL_ERROR);
                return;
            } else {
                HMLog.error(new Function0() { // from class: gc8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WXEntryProxyActivity.lambda$handleIntent$9();
                    }
                });
                finishForErrorCallback(mCallback, ErrorCode.TPA_DONE_NO_RESULT);
                return;
            }
        }
        if (TextUtils.isEmpty(resp.code)) {
            HMLog.error(new Function0() { // from class: ic8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WXEntryProxyActivity.lambda$handleIntent$6();
                }
            });
            finishForErrorCallback(mCallback, ErrorCode.TPA_OPT_SUCCESS_NO_CODE);
            return;
        }
        finish();
        if (mCallback == null) {
            HMLog.error(new Function0() { // from class: fc8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WXEntryProxyActivity.lambda$handleIntent$4();
                }
            });
            return;
        }
        if (mTpaConfig == null) {
            HMLog.error(new Function0() { // from class: hc8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WXEntryProxyActivity.lambda$handleIntent$5();
                }
            });
            AccountApi.onErrorCallback(mCallback, ErrorCode.INNER_HANDLE_ERROR);
            return;
        }
        int i2 = callType;
        if (i2 == 1) {
            AccountApiV2.loginV2(getApplicationContext(), "wechat", Configs.Params.REQUEST_TOKEN, mTpaConfig.getThirdName(), resp.code, countryCode, countryState, allowFastLogin, isLogin, mCallback);
        } else if (i2 == 2) {
            LoginToken loginToken = new LoginToken();
            loginToken.setResult(resp.code);
            AccountApi.onSuccessCallback(mCallback, loginToken);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$debugInfo$12(SendAuth.Resp resp) {
        return "OK ErrCode:" + resp.errCode + "\nerrStr:" + resp.errStr + "\ntransaction:" + resp.transaction + "\nopenId:" + resp.openId + "\ncode:" + resp.code + "\nstate:" + resp.state + "\nurl:" + resp.url + "\nlang:" + resp.lang + "\ncountry:" + resp.country;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$finishForErrorCallback$10(IAccount.Callback callback) {
        StringBuilder sb = new StringBuilder();
        sb.append("finishForErrorCallback callback ");
        Object obj = callback;
        if (callback == null) {
            obj = "is null";
        }
        sb.append(obj);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$finishForErrorCallback$11(String str) {
        return "##Callback Error " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$handleIntent$3(SendAuth.Resp resp) {
        return "###############" + resp.errCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$handleIntent$4() {
        return "wechat callback is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$handleIntent$5() {
        return "wechat callback error [TpaConfig is null]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$handleIntent$6() {
        return "wechat callback error [code is empty]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$handleIntent$7() {
        return "wechat callback error [code is empty]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$handleIntent$8() {
        return "wechat callback error [user cancel]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$handleIntent$9() {
        return "wechat callback error [TPA_DONE_NO_RESULT]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onCreate$0() {
        return "onCreate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onDestroy$13() {
        return "destroy";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onNewIntent$1() {
        return "onNewIntent";
    }

    public static void setCallback(IAccount.Callback<LoginToken, ErrorCode> callback) {
        mCallback = callback;
    }

    public static void setRequestInfo(int i, String str, String str2, TpaConfig tpaConfig, boolean z, boolean z2) {
        countryCode = str;
        countryState = str2;
        setTpaConfig(tpaConfig, i);
        allowFastLogin = z;
        isLogin = z2;
    }

    public static void setTpaConfig(TpaConfig tpaConfig, int i) {
        callType = i;
        mTpaConfig = tpaConfig;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HMLog.debug(new Function0() { // from class: nc8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WXEntryProxyActivity.lambda$onCreate$0();
            }
        });
        handleIntent(getIntent());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HMLog.debug(new Function0() { // from class: pc8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WXEntryProxyActivity.lambda$onDestroy$13();
            }
        });
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        HMLog.debug(new Function0() { // from class: rc8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WXEntryProxyActivity.lambda$onNewIntent$1();
            }
        });
        handleIntent(intent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
