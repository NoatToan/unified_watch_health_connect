package com.huami.passport.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.huami.passport.Configs;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.api.GoogleHelper;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class GoogleHelper {
    private static final int RC_GET_AUTH_CODE = 9003;
    private WeakReference<FragmentActivity> mActivityRef;
    private IAccount.Callback<GoogleSignInAccount, String> mCallback;
    private GoogleApiClient.OnConnectionFailedListener mConnectionFailedListener;
    private GoogleApiClient mGoogleApiClient;
    private GoogleSignInOptions mGso;

    /* JADX INFO: renamed from: com.huami.passport.api.GoogleHelper$1, reason: invalid class name */
    public class AnonymousClass1 implements GoogleApiClient.OnConnectionFailedListener {
        public final /* synthetic */ IAccount.Callback val$callback;

        public AnonymousClass1(IAccount.Callback callback) {
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onConnectionFailed$0(boolean z) {
            return "onConnectionFailed " + z;
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
            final boolean zIsSuccess = connectionResult.isSuccess();
            HMLog.debug(new Function0() { // from class: com.huami.passport.api.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoogleHelper.AnonymousClass1.lambda$onConnectionFailed$0(zIsSuccess);
                }
            });
            if (zIsSuccess) {
                this.val$callback.onSuccess(Configs.Params.OK);
            } else {
                this.val$callback.onError(ErrorCode.TPA_DONE_ERROR_RESULT);
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.api.GoogleHelper$2, reason: invalid class name */
    public class AnonymousClass2 implements GoogleApiClient.ConnectionCallbacks {
        public final /* synthetic */ IAccount.Callback val$callback;

        public AnonymousClass2(IAccount.Callback callback) {
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onConnected$0() {
            return "GoogleApiClient onConnected...";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onConnectionSuspended$1() {
            return "GoogleApiClient connect...";
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnected(Bundle bundle) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.api.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoogleHelper.AnonymousClass2.lambda$onConnected$0();
                }
            });
            this.val$callback.onSuccess(Configs.Params.OK);
            GoogleHelper.this.mGoogleApiClient.unregisterConnectionCallbacks(this);
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.api.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoogleHelper.AnonymousClass2.lambda$onConnectionSuspended$1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.api.GoogleHelper$3, reason: invalid class name */
    public class AnonymousClass3 implements IAccount.Callback<String, String> {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ FragmentActivity val$fa;

        public AnonymousClass3(FragmentActivity fragmentActivity, IAccount.Callback callback) {
            this.val$fa = fragmentActivity;
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onError$1(String str) {
            return "getGoogleApiClient onError " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$0() {
            return "getGoogleApiClient onSuccess [inner handle error]";
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onError(final String str) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.api.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoogleHelper.AnonymousClass3.lambda$onError$1(str);
                }
            });
            this.val$callback.onError(str);
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onSuccess(String str) {
            if (this.val$fa == null || GoogleHelper.this.mGoogleApiClient == null) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.api.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleHelper.AnonymousClass3.lambda$onSuccess$0();
                    }
                });
                this.val$callback.onError(ErrorCode.INNER_HANDLE_ERROR);
                return;
            }
            try {
                this.val$fa.startActivityForResult(Auth.GoogleSignInApi.getSignInIntent(GoogleHelper.this.mGoogleApiClient), GoogleHelper.RC_GET_AUTH_CODE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.api.GoogleHelper$4, reason: invalid class name */
    public class AnonymousClass4 implements IAccount.Callback<String, String> {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ boolean val$cleanToken;
        public final /* synthetic */ FragmentActivity val$fa;

        public AnonymousClass4(FragmentActivity fragmentActivity, IAccount.Callback callback, boolean z) {
            this.val$fa = fragmentActivity;
            this.val$callback = callback;
            this.val$cleanToken = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$0() {
            return "getGoogleApiClient onSuccess [inner handle error]";
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onError(String str) {
            this.val$callback.onError(str);
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onSuccess(String str) {
            if (this.val$fa == null || GoogleHelper.this.mGoogleApiClient == null) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.api.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleHelper.AnonymousClass4.lambda$onSuccess$0();
                    }
                });
                this.val$callback.onError(ErrorCode.INNER_HANDLE_ERROR);
                return;
            }
            ResultCallback<Status> resultCallback = new ResultCallback<Status>() { // from class: com.huami.passport.api.GoogleHelper.4.1
                @Override // com.google.android.gms.common.api.ResultCallback
                public void onResult(Status status) {
                    if (status.isSuccess()) {
                        AnonymousClass4.this.val$callback.onSuccess(Configs.Params.OK);
                    } else if (status.isCanceled()) {
                        AnonymousClass4.this.val$callback.onError(ErrorCode.USER_CANCEL_ERROR);
                    } else {
                        AnonymousClass4.this.val$callback.onError(ErrorCode.TPA_DONE_NO_RESULT);
                    }
                }
            };
            if (this.val$cleanToken) {
                Auth.GoogleSignInApi.revokeAccess(GoogleHelper.this.mGoogleApiClient).setResultCallback(resultCallback);
            } else {
                Auth.GoogleSignInApi.signOut(GoogleHelper.this.mGoogleApiClient).setResultCallback(resultCallback);
            }
        }
    }

    private void getGoogleApiClient(FragmentActivity fragmentActivity, IAccount.Callback<String, String> callback) {
        if (callback == null) {
            return;
        }
        if (fragmentActivity == null) {
            callback.onError(ErrorCode.PARAMS_IS_NULL_ERROR);
        }
        try {
            Map<String, TpaConfig> tpaConfigs = Utils.getTpaConfigs(fragmentActivity);
            if (tpaConfigs == null) {
                HMLog.debug(new Function0() { // from class: sh2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleHelper.lambda$getGoogleApiClient$0();
                    }
                });
                callback.onError(ErrorCode.TPA_CONFIG_ERROR);
            }
            TpaConfig tpaConfig = tpaConfigs.get("google");
            if (tpaConfig == null || !Utils.verifyParamByTpac("google", tpaConfig)) {
                HMLog.debug(new Function0() { // from class: jh2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleHelper.lambda$getGoogleApiClient$1();
                    }
                });
                callback.onError(ErrorCode.TPA_CONFIG_ERROR);
                return;
            }
            FragmentActivity fragmentActivity2 = (FragmentActivity) new WeakReference(fragmentActivity).get();
            if (fragmentActivity2 == null) {
                HMLog.debug(new Function0() { // from class: ih2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleHelper.lambda$getGoogleApiClient$2();
                    }
                });
                callback.onError(ErrorCode.INNER_HANDLE_ERROR);
                return;
            }
            final String appId = tpaConfig.getAppId();
            List<String> scope = tpaConfig.getScope();
            if (TextUtils.isEmpty(appId) || scope == null) {
                HMLog.debug(new Function0() { // from class: hh2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleHelper.lambda$getGoogleApiClient$3();
                    }
                });
                callback.onError(ErrorCode.TPA_CONFIG_ERROR);
                return;
            }
            if (!appId.trim().endsWith(".apps.googleusercontent.com")) {
                final String str = "Invalid server client ID in strings.xml, must end with .apps.googleusercontent.com";
                HMLog.debug(new Function0() { // from class: mh2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleHelper.lambda$getGoogleApiClient$4(str);
                    }
                });
                callback.onError(ErrorCode.TPA_CONFIG_ERROR);
                return;
            }
            HMLog.debug(new Function0() { // from class: oh2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoogleHelper.lambda$getGoogleApiClient$5(appId);
                }
            });
            for (final String str2 : scope) {
                HMLog.debug(new Function0() { // from class: nh2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleHelper.lambda$getGoogleApiClient$6(str2);
                    }
                });
            }
            if (this.mGso == null) {
                GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN);
                Iterator<String> it2 = scope.iterator();
                while (it2.hasNext()) {
                    builder.requestScopes(new Scope(it2.next()), new Scope[0]);
                }
                this.mGso = builder.requestEmail().requestIdToken(appId).requestServerAuthCode(appId).build();
            }
            if (this.mGoogleApiClient == null) {
                HMLog.debug(new Function0() { // from class: gh2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleHelper.lambda$getGoogleApiClient$7();
                    }
                });
                this.mGoogleApiClient = new GoogleApiClient.Builder(fragmentActivity2).addApi(Auth.GOOGLE_SIGN_IN_API, this.mGso).enableAutoManage(fragmentActivity2, new AnonymousClass1(callback)).build();
            }
            if (this.mGoogleApiClient.isConnected()) {
                HMLog.debug(new Function0() { // from class: th2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleHelper.lambda$getGoogleApiClient$8();
                    }
                });
                callback.onSuccess(Configs.Params.OK);
                return;
            }
            this.mGoogleApiClient.registerConnectionCallbacks(new AnonymousClass2(callback));
            if (this.mGoogleApiClient.isConnecting() || this.mGoogleApiClient.isConnected()) {
                return;
            }
            HMLog.debug(new Function0() { // from class: qh2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoogleHelper.lambda$getGoogleApiClient$9();
                }
            });
            this.mGoogleApiClient.connect();
        } catch (IOException e) {
            e.printStackTrace();
            callback.onError(ErrorCode.TPA_CONFIG_ERROR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getGoogleApiClient$0() {
        return "configs is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getGoogleApiClient$1() {
        return "tpac is null or check is not passed";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getGoogleApiClient$2() {
        return "FragmentActivity object is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getGoogleApiClient$3() {
        return "serverClientId or scopes is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getGoogleApiClient$4(String str) {
        return "Message:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getGoogleApiClient$5(String str) {
        return "serverClientId:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getGoogleApiClient$6(String str) {
        return "scope:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getGoogleApiClient$7() {
        return "GoogleApiClient object is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getGoogleApiClient$8() {
        return "GoogleApiClient isConnected";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getGoogleApiClient$9() {
        return "GoogleApiClient disconnected";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onActivityResult$10() {
        return "GoogleHelper onActivityResult callback is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onActivityResult$11() {
        return "google sign in result -->error{result is null}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onActivityResult$12(GoogleSignInResult googleSignInResult) {
        return "onActivityResult:GET_AUTH_CODE:success:" + googleSignInResult.isSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onActivityResult$13(String str, String str2, String str3) {
        return "Auth code " + str + "\ntokenId:" + str2 + "\nUID:" + str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onActivityResult$14(int i) {
        return "onActivityResult Google code：" + i;
    }

    private void signOut(FragmentActivity fragmentActivity, boolean z, IAccount.Callback<String, String> callback) {
        if (callback == null) {
            return;
        }
        WeakReference<FragmentActivity> weakReference = new WeakReference<>(fragmentActivity);
        this.mActivityRef = weakReference;
        getGoogleApiClient(fragmentActivity, new AnonymousClass4(weakReference.get(), callback, z));
    }

    public void getAuthCode(FragmentActivity fragmentActivity, IAccount.Callback<GoogleSignInAccount, String> callback) {
        if (callback == null) {
            return;
        }
        this.mCallback = callback;
        WeakReference<FragmentActivity> weakReference = new WeakReference<>(fragmentActivity);
        this.mActivityRef = weakReference;
        getGoogleApiClient(fragmentActivity, new AnonymousClass3(weakReference.get(), callback));
    }

    public boolean isGmsInstalled(Context context) {
        return Utils.checkBrowser(context, "com.google.android.gms");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mCallback == null) {
            HMLog.debug(new Function0() { // from class: kh2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoogleHelper.lambda$onActivityResult$10();
                }
            });
            return;
        }
        if (i == RC_GET_AUTH_CODE) {
            final GoogleSignInResult signInResultFromIntent = Auth.GoogleSignInApi.getSignInResultFromIntent(intent);
            if (signInResultFromIntent == null) {
                this.mCallback.onError(ErrorCode.TPA_DONE_ERROR_RESULT);
                HMLog.error(new Function0() { // from class: rh2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleHelper.lambda$onActivityResult$11();
                    }
                });
                return;
            }
            HMLog.debug(new Function0() { // from class: lh2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoogleHelper.lambda$onActivityResult$12(signInResultFromIntent);
                }
            });
            GoogleSignInAccount signInAccount = signInResultFromIntent.getSignInAccount();
            Status status = signInResultFromIntent.getStatus();
            if (signInResultFromIntent.isSuccess() && signInAccount != null) {
                final String serverAuthCode = signInAccount.getServerAuthCode();
                final String idToken = signInAccount.getIdToken();
                final String id = signInAccount.getId();
                HMLog.debug(new Function0() { // from class: ph2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoogleHelper.lambda$onActivityResult$13(serverAuthCode, idToken, id);
                    }
                });
                this.mCallback.onSuccess(signInAccount);
                return;
            }
            if (status == null) {
                this.mCallback.onError(ErrorCode.TPA_DONE_ERROR_RESULT);
                return;
            }
            final int statusCode = status.getStatusCode();
            HMLog.debug(new Function0() { // from class: fh2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoogleHelper.lambda$onActivityResult$14(statusCode);
                }
            });
            if (statusCode == 12501) {
                this.mCallback.onError(ErrorCode.USER_CANCEL_ERROR);
            } else {
                this.mCallback.onError(ErrorCode.TPA_DONE_ERROR_RESULT);
            }
        }
    }

    public void revokeAccess(FragmentActivity fragmentActivity, IAccount.Callback<String, String> callback) {
        signOut(fragmentActivity, true, callback);
    }

    public void signOut(FragmentActivity fragmentActivity, IAccount.Callback<String, String> callback) {
        signOut(fragmentActivity, false, callback);
    }
}
