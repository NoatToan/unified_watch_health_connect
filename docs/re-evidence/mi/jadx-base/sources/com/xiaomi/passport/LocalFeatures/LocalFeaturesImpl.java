package com.xiaomi.passport.LocalFeatures;

import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.xiaomi.accounts.ILocalFeatureManagerResponse;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.account.data.MetaLoginData;
import com.xiaomi.accountsdk.account.exception.IllegalDeviceException;
import com.xiaomi.accountsdk.account.exception.InvalidCredentialException;
import com.xiaomi.accountsdk.account.exception.InvalidUserNameException;
import com.xiaomi.accountsdk.account.exception.NeedCaptchaException;
import com.xiaomi.accountsdk.account.exception.NeedNotificationException;
import com.xiaomi.accountsdk.account.exception.NeedVerificationException;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.InvalidResponseException;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.passport.utils.AccountHelper;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes11.dex */
public class LocalFeaturesImpl implements MiLocalFeaturesManager {
    private static final String TAG = "LocalFeaturesImpl";
    private static final ExecutorService THREAD_POOL_EXECUTOR = Executors.newFixedThreadPool(5);
    private static LocalFeaturesImpl sInstance = null;
    private Context mContext;
    private Handler mMainHandler;

    public abstract class AmsTask extends FutureTask<Bundle> implements LocalFeaturesManagerFuture<Bundle> {
        final Activity mActivity;
        final LocalFeaturesManagerCallback<Bundle> mCallback;
        final Handler mHandler;
        final LocalFeaturesManagerResponse mResponse;

        public class Response extends ILocalFeatureManagerResponse.Stub {
            private Response() {
            }

            @Override // com.xiaomi.accounts.ILocalFeatureManagerResponse
            public void onError(int i, String str) {
                if (i == 4) {
                    AmsTask.this.cancel(true);
                } else {
                    AmsTask amsTask = AmsTask.this;
                    amsTask.setException(LocalFeaturesImpl.this.convertErrorToException(i, str));
                }
            }

            @Override // com.xiaomi.accounts.ILocalFeatureManagerResponse
            public void onRequestContinued() throws RemoteException {
            }

            @Override // com.xiaomi.accounts.ILocalFeatureManagerResponse
            public void onResult(Bundle bundle) {
                Activity activity;
                Intent intent = (Intent) bundle.getParcelable("intent");
                if (intent != null && (activity = AmsTask.this.mActivity) != null) {
                    activity.startActivity(intent);
                } else if (!bundle.getBoolean(b.M)) {
                    AmsTask.this.set(bundle);
                } else {
                    try {
                        AmsTask.this.doWork();
                    } catch (RemoteException unused) {
                    }
                }
            }
        }

        public AmsTask(Activity activity, Handler handler, LocalFeaturesManagerCallback<Bundle> localFeaturesManagerCallback) {
            super(new Callable<Bundle>() { // from class: com.xiaomi.passport.LocalFeatures.LocalFeaturesImpl.AmsTask.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Bundle call() throws Exception {
                    throw new IllegalStateException("this should never be called");
                }
            });
            this.mHandler = handler;
            this.mCallback = localFeaturesManagerCallback;
            this.mActivity = activity;
            this.mResponse = new LocalFeaturesManagerResponse(new Response());
        }

        private Bundle internalGetResult(Long l, TimeUnit timeUnit) throws InvalidUserNameException, AccessDeniedException, IllegalDeviceException, InvalidCredentialException, OperationCanceledException, IOException, InvalidResponseException, AuthenticatorException, AuthenticationFailureException {
            if (!isDone()) {
                LocalFeaturesImpl.this.ensureNotOnMainThread();
            }
            try {
                try {
                    try {
                        if (l == null) {
                            Bundle bundle = get();
                            cancel(true);
                            return bundle;
                        }
                        Bundle bundle2 = get(l.longValue(), timeUnit);
                        cancel(true);
                        return bundle2;
                    } catch (Throwable th) {
                        cancel(true);
                        throw th;
                    }
                } catch (InterruptedException | TimeoutException unused) {
                    cancel(true);
                    throw new OperationCanceledException();
                }
            } catch (CancellationException unused2) {
                throw new OperationCanceledException();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                if (cause instanceof UnsupportedOperationException) {
                    throw new AuthenticatorException(cause);
                }
                if (cause instanceof AuthenticatorException) {
                    throw ((AuthenticatorException) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                if (cause instanceof InvalidCredentialException) {
                    throw new InvalidCredentialException(((InvalidCredentialException) cause).hasPwd);
                }
                if (cause instanceof InvalidUserNameException) {
                    throw new InvalidUserNameException();
                }
                if (cause instanceof InvalidResponseException) {
                    throw new InvalidResponseException(e.getMessage());
                }
                if (cause instanceof IllegalDeviceException) {
                    throw new IllegalDeviceException(e.getMessage());
                }
                if (cause instanceof SSLException) {
                    throw new SSLException(e.getMessage());
                }
                if (cause instanceof AccessDeniedException) {
                    throw new AccessDeniedException(403, e.getMessage());
                }
                if (cause instanceof AuthenticationFailureException) {
                    throw new AuthenticationFailureException(e.getMessage());
                }
                throw new IllegalStateException(cause);
            }
        }

        public abstract void doWork() throws RemoteException;

        @Override // java.util.concurrent.FutureTask
        public void done() {
            LocalFeaturesManagerCallback<Bundle> localFeaturesManagerCallback = this.mCallback;
            if (localFeaturesManagerCallback != null) {
                LocalFeaturesImpl.this.postToHandler(this.mHandler, localFeaturesManagerCallback, this);
            }
        }

        public final LocalFeaturesManagerFuture<Bundle> start() {
            try {
                doWork();
            } catch (RemoteException e) {
                setException(e);
            }
            return this;
        }

        @Override // java.util.concurrent.FutureTask
        public void set(Bundle bundle) {
            if (bundle == null) {
                AccountLogger.log(LocalFeaturesImpl.TAG, "the bundle must not be null", new Exception());
            }
            super.set(bundle);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xiaomi.passport.LocalFeatures.LocalFeaturesManagerFuture
        public Bundle getResult() throws InvalidUserNameException, AccessDeniedException, IllegalDeviceException, InvalidCredentialException, OperationCanceledException, IOException, InvalidResponseException, AuthenticatorException, AuthenticationFailureException {
            return internalGetResult(null, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xiaomi.passport.LocalFeatures.LocalFeaturesManagerFuture
        public Bundle getResult(long j, TimeUnit timeUnit) throws InvalidUserNameException, AccessDeniedException, IllegalDeviceException, InvalidCredentialException, OperationCanceledException, IOException, InvalidResponseException, AuthenticatorException, AuthenticationFailureException {
            return internalGetResult(Long.valueOf(j), timeUnit);
        }
    }

    public LocalFeaturesImpl(Context context) {
        this.mContext = context;
        this.mMainHandler = new Handler(this.mContext.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Exception convertErrorToException(int i, String str) {
        if (i == 5) {
            return new IOException(str);
        }
        if (i == 7) {
            return new AccessDeniedException(403, str);
        }
        if (i == 4) {
            return new InvalidCredentialException(70016, str, true);
        }
        if (i == 10) {
            return new SSLException(str);
        }
        if (i == 6) {
            return new InvalidResponseException(str);
        }
        if (i == 8) {
            return new InvalidUserNameException();
        }
        if (i == 9) {
            return new IllegalDeviceException(str);
        }
        if (i == 6) {
            return new UnsupportedOperationException(str);
        }
        if (i != 5 && i == 7) {
            return new IllegalArgumentException(str);
        }
        return new AuthenticatorException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ensureNotOnMainThread() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null || looperMyLooper != this.mContext.getMainLooper()) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("calling this from your main thread can lead to deadlock");
        AccountLogger.log(TAG, "calling this from your main thread can lead to deadlock and/or ANRs", illegalStateException);
        if (this.mContext.getApplicationInfo().targetSdkVersion >= 8) {
            throw illegalStateException;
        }
    }

    public static synchronized LocalFeaturesImpl get(Context context) {
        try {
            if (sInstance == null) {
                sInstance = new LocalFeaturesImpl(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return sInstance;
    }

    private Intent getResultIntent(LocalFeaturesManagerResponse localFeaturesManagerResponse, Exception exc, Bundle bundle) {
        if (exc instanceof NeedCaptchaException) {
            bundle.putString("captcha_url", ((NeedCaptchaException) exc).getCaptchaUrl());
            return XiaomiAccountManager.get(this.mContext).getConfirmCredentialActivityIntent(bundle, localFeaturesManagerResponse);
        }
        if (exc instanceof NeedNotificationException) {
            return XiaomiAccountManager.get(this.mContext).getAccountNotificationActivityIntent(null, ((NeedNotificationException) exc).getNotificationUrl(), bundle, localFeaturesManagerResponse);
        }
        if (!(exc instanceof NeedVerificationException)) {
            return XiaomiAccountManager.get(this.mContext).getConfirmCredentialActivityIntent(bundle, localFeaturesManagerResponse);
        }
        NeedVerificationException needVerificationException = (NeedVerificationException) exc;
        MetaLoginData metaLoginData = needVerificationException.getMetaLoginData();
        bundle.putString("extra_step1_token", needVerificationException.getStep1Token());
        bundle.putString("extra_sign", metaLoginData.sign);
        bundle.putString("extra_qs", metaLoginData.qs);
        bundle.putString("extra_callback", metaLoginData.callback);
        return XiaomiAccountManager.get(this.mContext).getConfirmCredentialActivityIntent(bundle, localFeaturesManagerResponse);
    }

    private void onBackIntent(LocalFeaturesManagerResponse localFeaturesManagerResponse, String str, String str2, String str3, Exception exc) {
        Bundle bundle = new Bundle();
        bundle.putString("userId", str);
        bundle.putString("service_id", str3);
        bundle.putString("password", str2);
        bundle.putBoolean("need_retry_on_authenticator_response_result", true);
        Intent resultIntent = getResultIntent(localFeaturesManagerResponse, exc, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", resultIntent);
        localFeaturesManagerResponse.onResult(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postToHandler(Handler handler, final LocalFeaturesManagerCallback<Bundle> localFeaturesManagerCallback, final LocalFeaturesManagerFuture<Bundle> localFeaturesManagerFuture) {
        if (handler == null) {
            handler = this.mMainHandler;
        }
        handler.post(new Runnable() { // from class: com.xiaomi.passport.LocalFeatures.LocalFeaturesImpl.3
            @Override // java.lang.Runnable
            public void run() {
                localFeaturesManagerCallback.run(localFeaturesManagerFuture);
            }
        });
    }

    @Override // com.xiaomi.passport.LocalFeatures.MiLocalFeaturesManager
    public LocalFeaturesManagerFuture<Bundle> getStsUrl(final String str, final String str2, final String str3, Bundle bundle, Activity activity, LocalFeaturesManagerCallback<Bundle> localFeaturesManagerCallback, Handler handler) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("userId or password options is null");
        }
        return new AmsTask(activity, handler, localFeaturesManagerCallback) { // from class: com.xiaomi.passport.LocalFeatures.LocalFeaturesImpl.1
            @Override // com.xiaomi.passport.LocalFeatures.LocalFeaturesImpl.AmsTask
            public void doWork() throws RemoteException {
                LocalFeaturesImpl.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.xiaomi.passport.LocalFeatures.LocalFeaturesImpl.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        LocalFeaturesImpl.this.getStsUrl(anonymousClass1.mResponse, str, str2, str3);
                    }
                });
            }
        }.start();
    }

    @Override // com.xiaomi.passport.LocalFeatures.MiLocalFeaturesManager
    public LocalFeaturesManagerFuture<Bundle> handleLoginQRCodeScanResult(final String str, Activity activity, final Bundle bundle, LocalFeaturesManagerCallback<Bundle> localFeaturesManagerCallback, Handler handler) {
        return new AmsTask(activity, handler, localFeaturesManagerCallback) { // from class: com.xiaomi.passport.LocalFeatures.LocalFeaturesImpl.2
            @Override // com.xiaomi.passport.LocalFeatures.LocalFeaturesImpl.AmsTask
            public void doWork() throws RemoteException {
                LocalFeaturesImpl.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.xiaomi.passport.LocalFeatures.LocalFeaturesImpl.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!AccountHelper.isMiAccountLoginQRCodeScanResult(str)) {
                            AnonymousClass2.this.mResponse.onError(7, "invalid scan code login url");
                            return;
                        }
                        Intent qRCodeAuthActivityIntent = XiaomiAccountManager.get(LocalFeaturesImpl.this.mContext).getQRCodeAuthActivityIntent(str);
                        qRCodeAuthActivityIntent.putExtra("accountAuthenticatorResponse", AnonymousClass2.this.mResponse);
                        Bundle bundle2 = bundle;
                        if (bundle2 != null) {
                            qRCodeAuthActivityIntent.putExtras(bundle2);
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("intent", qRCodeAuthActivityIntent);
                        AnonymousClass2.this.mResponse.onResult(bundle3);
                    }
                });
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getStsUrl(LocalFeaturesManagerResponse localFeaturesManagerResponse, String str, String str2, String str3) {
        if (localFeaturesManagerResponse != null) {
            try {
                AccountInfo stsUrlByPassword = AccountHelper.getStsUrlByPassword(str, str2, str3, null, null);
                Bundle bundle = new Bundle();
                bundle.putString("sts_url", stsUrlByPassword != null ? stsUrlByPassword.getAutoLoginUrl() : null);
                localFeaturesManagerResponse.onResult(bundle);
                return;
            } catch (IllegalDeviceException e) {
                AccountLogger.log(TAG, e);
                localFeaturesManagerResponse.onError(9, e.getMessage());
                return;
            } catch (InvalidCredentialException e2) {
                AccountLogger.log(TAG, e2);
                if (e2.getHasPwd()) {
                    localFeaturesManagerResponse.onError(4, e2.getMessage());
                    return;
                } else {
                    onBackIntent(localFeaturesManagerResponse, str, str2, str3, e2);
                    return;
                }
            } catch (InvalidUserNameException e3) {
                AccountLogger.log(TAG, e3);
                localFeaturesManagerResponse.onError(8, e3.getMessage());
                return;
            } catch (NeedCaptchaException e4) {
                AccountLogger.log(TAG, e4);
                onBackIntent(localFeaturesManagerResponse, str, str2, str3, e4);
                return;
            } catch (NeedNotificationException e5) {
                AccountLogger.log(TAG, e5);
                onBackIntent(localFeaturesManagerResponse, str, str2, str3, e5);
                return;
            } catch (NeedVerificationException e6) {
                AccountLogger.log(TAG, e6);
                onBackIntent(localFeaturesManagerResponse, str, str2, str3, e6);
                return;
            } catch (AccessDeniedException e7) {
                AccountLogger.log(TAG, e7);
                localFeaturesManagerResponse.onError(7, e7.getMessage());
                return;
            } catch (AuthenticationFailureException e8) {
                AccountLogger.log(TAG, e8);
                localFeaturesManagerResponse.onError(6, e8.getMessage());
                return;
            } catch (InvalidResponseException e9) {
                AccountLogger.log(TAG, e9);
                localFeaturesManagerResponse.onError(6, e9.getMessage());
                return;
            } catch (IOException e10) {
                AccountLogger.log(TAG, e10);
                localFeaturesManagerResponse.onError(5, e10.getMessage());
                return;
            }
        }
        throw new IllegalArgumentException("response is null");
    }
}
