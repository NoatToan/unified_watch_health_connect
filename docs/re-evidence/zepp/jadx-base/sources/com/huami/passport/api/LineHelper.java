package com.huami.passport.api;

import android.app.Activity;
import android.content.Intent;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.api.LineHelper;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.auth.LineLoginApi;
import com.linecorp.linesdk.auth.LineLoginResult;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class LineHelper {
    private static final int LINE_REQUEST_CODE = 9004;
    private WeakReference<Activity> mActivityRef;
    private IAccount.Callback<LineLoginResult, String> mCallback;

    /* JADX INFO: renamed from: com.huami.passport.api.LineHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$linecorp$linesdk$LineApiResponseCode;

        static {
            int[] iArr = new int[LineApiResponseCode.values().length];
            $SwitchMap$com$linecorp$linesdk$LineApiResponseCode = iArr;
            try {
                iArr[LineApiResponseCode.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$linecorp$linesdk$LineApiResponseCode[LineApiResponseCode.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getAccessToken$0() {
        return "config is null or check is not passed";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getAccessToken$1(boolean z) {
        return "LineHelper start success -->webLogin:" + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onActivityResult$2() {
        return "LineHelper onActivityResult callback is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onActivityResult$3() {
        return "LINE Login Canceled by user!!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onActivityResult$4(LineLoginResult lineLoginResult) {
        return "LINE Login FAILED:" + lineLoginResult.getErrorData().toString();
    }

    public void getAccessToken(Activity activity, TpaConfig tpaConfig, IAccount.Callback<LineLoginResult, String> callback) {
        getAccessToken(activity, true, tpaConfig, callback);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mCallback == null) {
            HMLog.error(new Function0() { // from class: xm4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LineHelper.lambda$onActivityResult$2();
                }
            });
            return;
        }
        if (i == LINE_REQUEST_CODE) {
            final LineLoginResult loginResultFromIntent = LineLoginApi.getLoginResultFromIntent(intent);
            int i3 = AnonymousClass1.$SwitchMap$com$linecorp$linesdk$LineApiResponseCode[loginResultFromIntent.getResponseCode().ordinal()];
            if (i3 == 1) {
                this.mCallback.onSuccess(loginResultFromIntent);
            } else if (i3 != 2) {
                this.mCallback.onError(ErrorCode.TPA_DONE_ERROR_RESULT);
                HMLog.error(new Function0() { // from class: tm4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LineHelper.lambda$onActivityResult$4(loginResultFromIntent);
                    }
                });
            } else {
                this.mCallback.onError(ErrorCode.USER_CANCEL_ERROR);
                HMLog.error(new Function0() { // from class: wm4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LineHelper.lambda$onActivityResult$3();
                    }
                });
            }
        }
    }

    public void getAccessToken(Activity activity, boolean z, TpaConfig tpaConfig, IAccount.Callback<LineLoginResult, String> callback) {
        if (callback == null) {
            return;
        }
        this.mCallback = callback;
        if (z) {
            WeakReference<Activity> weakReference = new WeakReference<>(activity);
            this.mActivityRef = weakReference;
            activity = weakReference.get();
        }
        if (tpaConfig == null || !Utils.verifyParamByTpac("line", tpaConfig)) {
            HMLog.debug(new Function0() { // from class: vm4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LineHelper.lambda$getAccessToken$0();
                }
            });
            callback.onError(ErrorCode.TPA_CONFIG_ERROR);
            return;
        }
        final boolean z2 = true;
        try {
            activity.getPackageManager().getPackageInfo("jp.naver.line.android", 1);
            z2 = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z2) {
            activity.startActivityForResult(LineLoginApi.getLoginIntentWithoutLineAppAuth(activity.getApplicationContext(), tpaConfig.getAppId()), LINE_REQUEST_CODE);
        } else {
            activity.startActivityForResult(LineLoginApi.getLoginIntent(activity.getApplicationContext(), tpaConfig.getAppId()), LINE_REQUEST_CODE);
        }
        HMLog.info(new Function0() { // from class: um4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LineHelper.lambda$getAccessToken$1(z2);
            }
        });
    }
}
