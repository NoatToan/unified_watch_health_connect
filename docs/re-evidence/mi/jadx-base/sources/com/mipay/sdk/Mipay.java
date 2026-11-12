package com.mipay.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.Toast;
import com.mipay.sdk.exception.MipayException;
import com.miui.tsmclient.util.Constants;
import java.security.InvalidParameterException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Mipay {
    public static final int CAPABILITY = 1;
    public static final int ERROR_CODE_ACCOUNT_ERROR = 4;
    public static final int ERROR_CODE_CALL_TOO_FAST = 3;
    public static final int ERROR_CODE_CANCELED = 2;
    public static final int ERROR_CODE_DUPLICATE_PURCHASE = 9;
    public static final int ERROR_CODE_EXCEPTION = 1;
    public static final int ERROR_CODE_IDENTITY_NEED_REVIEW = 11;
    public static final int ERROR_CODE_INVALID_CALLER = 8;
    public static final int ERROR_CODE_INVALID_DATA = 7;
    public static final int ERROR_CODE_INVALID_DEVICE = 10;
    public static final int ERROR_CODE_NETWORK_ERROR = 5;
    public static final int ERROR_CODE_OK = 0;
    public static final int ERROR_CODE_SERVER_ERROR = 6;
    public static final String KEY_CODE = "code";
    public static final String KEY_EXTRA = "extra";
    public static final String KEY_FULL_RESULT = "fullResult";
    public static final String KEY_INTENT = "intent";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_ORDER = "order";
    public static final String KEY_RESULT = "result";
    public static final String KEY_UI_MODE = "uimode";
    public static final int REQUEST_CREDIT_INSTALLMENT = 1224;
    public static final int REQUEST_MIPAY = 424;
    private static final String TAG = "MipaySdk";
    public static final String XIAOMI_ACCOUNT_TYPE = "com.xiaomi";
    private final Context mContext;
    private final Handler mMainHandler;
    private boolean mUseWallet;
    private boolean mUseWalletTv;

    public interface MipayCallback<V> {
        void run(MipayFuture<V> mipayFuture);
    }

    public class MipayCallbackImpl implements MipayCallback<Bundle> {
        private Handler mCallback;
        private int mWhat;

        public MipayCallbackImpl(int i, Handler handler) {
            this.mWhat = i;
            this.mCallback = handler;
        }

        @Override // com.mipay.sdk.Mipay.MipayCallback
        public void run(MipayFuture<Bundle> mipayFuture) {
            if (this.mCallback == null) {
                return;
            }
            try {
                try {
                    Bundle result = mipayFuture.getResult();
                    if (result != null) {
                        this.mCallback.sendMessage(Mipay.this.makeMessage(this.mWhat, 0, null, result.getString("result")));
                    } else {
                        this.mCallback.sendMessage(Mipay.this.makeMessage(this.mWhat, 1, "error"));
                    }
                } catch (MipayException e) {
                    this.mCallback.sendMessage(Mipay.this.makeMessage(this.mWhat, e.getError(), e.getMessage()));
                }
            } finally {
                this.mCallback = null;
            }
        }
    }

    public interface MipayFuture<V> {
        boolean cancel(boolean z);

        V getResult() throws MipayException;

        V getResult(long j, TimeUnit timeUnit) throws MipayException;

        boolean isCancelled();

        boolean isDone();
    }

    public abstract class PmsTask extends FutureTask<Bundle> implements MipayFuture<Bundle>, ServiceConnection {
        private final int HOST_MONITOR_HEART_INTERNAL;
        private Activity mActivity;
        private MipayCallback<Bundle> mCallback;
        private Runnable mHostActivityMonitor;
        private boolean mIsBound;
        private IMipayResponse mResponse;
        private IMipayService mService;

        public class MipayResponseImpl extends IMipayResponse.Stub {
            public MipayResponseImpl() {
            }

            @Override // com.mipay.sdk.IMipayResponse
            public void onError(int i, String str, Bundle bundle) throws RemoteException {
                if (i == 2) {
                    PmsTask.this.cancel(true);
                    PmsTask.this.unBind();
                } else {
                    PmsTask pmsTask = PmsTask.this;
                    pmsTask.setException(pmsTask.convertErrorCodeToException(i, str, bundle));
                }
            }

            @Override // com.mipay.sdk.IMipayResponse
            public void onResult(Bundle bundle) throws RemoteException {
                Intent intent = (Intent) bundle.getParcelable("intent");
                if (intent == null) {
                    PmsTask.this.set(bundle);
                } else if (PmsTask.this.mActivity != null) {
                    PmsTask.this.mActivity.startActivity(intent);
                } else {
                    PmsTask.this.setException(new MipayException(7, "activity cannot be null"));
                }
            }
        }

        public PmsTask(Activity activity, MipayCallback<Bundle> mipayCallback) {
            super(new Callable<Bundle>() { // from class: com.mipay.sdk.Mipay.PmsTask.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Bundle call() throws Exception {
                    throw new IllegalStateException("this should never be called");
                }
            });
            this.mIsBound = false;
            this.HOST_MONITOR_HEART_INTERNAL = 5000;
            this.mHostActivityMonitor = new Runnable() { // from class: com.mipay.sdk.Mipay.PmsTask.1
                @Override // java.lang.Runnable
                public void run() {
                    Activity activity2 = PmsTask.this.mActivity;
                    if (PmsTask.this.isDone() || activity2 == null) {
                        return;
                    }
                    if (activity2.isFinishing()) {
                        PmsTask.this.setException(new MipayException(2, "Operation has been cancelled because host activity has finished."));
                    } else {
                        Mipay.this.mMainHandler.postDelayed(this, 5000L);
                    }
                }
            };
            this.mActivity = activity;
            this.mCallback = mipayCallback;
            this.mResponse = new MipayResponseImpl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Exception convertErrorCodeToException(int i, String str, Bundle bundle) {
            if (TextUtils.isEmpty(str)) {
                str = "Unknown failure";
            }
            return new MipayException(i, str, bundle);
        }

        private void ensureNotOnMainThread() {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper == Mipay.this.mContext.getMainLooper()) {
                throw new IllegalStateException("calling this from your main thread can lead to deadlock");
            }
        }

        private Bundle internalGetResult(Long l, TimeUnit timeUnit) throws MipayException {
            if (!isDone()) {
                ensureNotOnMainThread();
            }
            try {
                try {
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
                            } catch (ExecutionException e) {
                                Throwable cause = e.getCause();
                                if (cause instanceof MipayException) {
                                    throw ((MipayException) cause);
                                }
                                throw new MipayException(1, cause);
                            }
                        } catch (Throwable th) {
                            throw new MipayException(1, th);
                        }
                    } catch (InterruptedException e2) {
                        throw new MipayException(1, e2);
                    }
                } catch (CancellationException unused) {
                    throw new MipayException(2, "user cancelled");
                } catch (TimeoutException unused2) {
                    throw new MipayException(2, "time out");
                }
            } catch (Throwable th2) {
                cancel(true);
                throw th2;
            }
        }

        public void bind() {
            if (bindToMipayService()) {
                this.mIsBound = true;
            } else {
                setException(new MipayException(1, "bind to service failed"));
            }
        }

        public boolean bindToMipayService() {
            Intent intent = new Intent("com.xiaomi.action.MIPAY");
            intent.setPackage("com.mipay.wallet");
            return Mipay.this.mContext.bindService(intent, this, 1);
        }

        public abstract void doWork() throws RemoteException;

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (this.mCallback != null) {
                Mipay.this.mMainHandler.post(new Runnable() { // from class: com.mipay.sdk.Mipay.PmsTask.3
                    @Override // java.lang.Runnable
                    public void run() {
                        PmsTask.this.mCallback.run(PmsTask.this);
                        PmsTask.this.mCallback = null;
                    }
                });
            }
            Mipay.this.mMainHandler.removeCallbacks(this.mHostActivityMonitor);
            this.mActivity = null;
        }

        public IMipayResponse getResponse() {
            return this.mResponse;
        }

        public IMipayService getService() {
            return this.mService;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            StringBuilder sb = new StringBuilder();
            sb.append("service connected, component:");
            sb.append(componentName);
            this.mService = IMipayService.Stub.asInterface(iBinder);
            try {
                doWork();
                Mipay.this.mMainHandler.postDelayed(this.mHostActivityMonitor, 5000L);
            } catch (RemoteException e) {
                setException(e);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (!isDone()) {
                setException(new MipayException(1, "active service exits unexpectedly"));
            }
            this.mService = null;
        }

        @Override // java.util.concurrent.FutureTask
        public void setException(Throwable th) {
            super.setException(th);
            unBind();
        }

        public final MipayFuture<Bundle> start() {
            bind();
            return this;
        }

        public void unBind() {
            if (this.mIsBound) {
                Mipay.this.mContext.unbindService(this);
                this.mIsBound = false;
            }
        }

        @Override // java.util.concurrent.FutureTask
        public void set(Bundle bundle) {
            super.set(bundle);
            unBind();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.mipay.sdk.Mipay.MipayFuture
        public Bundle getResult(long j, TimeUnit timeUnit) throws MipayException {
            return internalGetResult(Long.valueOf(j), timeUnit);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.mipay.sdk.Mipay.MipayFuture
        public Bundle getResult() throws MipayException {
            return internalGetResult(null, null);
        }
    }

    private Mipay(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mMainHandler = new Handler(applicationContext.getMainLooper());
        this.mUseWallet = SdkUtils.isMipayWalletInstalled(context);
        this.mUseWalletTv = SdkUtils.isMipayWalletTVInstalled(context);
        StringBuilder sb = new StringBuilder();
        sb.append("create Mipay instance, hasWallet: ");
        sb.append(this.mUseWallet);
        sb.append(", isTV: ");
        sb.append(this.mUseWalletTv);
        sb.append(", capability: ");
        sb.append(1);
        printVersionInfo();
    }

    public static Mipay get(Context context) {
        return new Mipay(context);
    }

    private MipayFuture<Bundle> internalPay(Activity activity, final String str, final Bundle bundle, MipayCallback<Bundle> mipayCallback) {
        return new PmsTask(activity, mipayCallback) { // from class: com.mipay.sdk.Mipay.1
            @Override // com.mipay.sdk.Mipay.PmsTask
            public void doWork() throws RemoteException {
                IMipayService service = getService();
                Bundle bundle2 = new Bundle();
                Bundle bundle3 = bundle;
                if (bundle3 != null) {
                    bundle2.putAll(bundle3);
                }
                service.pay(getResponse(), null, str, bundle2);
            }
        }.start();
    }

    private void internalShowWallet(Activity activity) {
        if (this.mUseWallet) {
            Intent intent = new Intent(Constants.MIPAY_WALLET_HOME_PAGE_ACTION);
            intent.setPackage("com.mipay.wallet");
            activity.startActivity(intent);
        }
    }

    public static boolean isMipayInstalled(Context context) {
        return SdkUtils.isMipayWalletInstalled(context) || SdkUtils.isMipayWalletTVInstalled(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message makeMessage(int i, int i2, String str) {
        return makeMessage(i, i2, str, null);
    }

    private void printVersionInfo() {
    }

    public void installmentPay(Activity activity, String str, Bundle bundle) {
        Intent financialInstallmentIntent;
        if (activity == null) {
            throw new InvalidParameterException("activity cannot be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new InvalidParameterException("installment order cannot be empty");
        }
        if (SdkUtils.isNativeInstallmentAvailable(this.mContext)) {
            financialInstallmentIntent = SdkUtils.getInstallmentIntent();
        } else {
            financialInstallmentIntent = SdkUtils.isFinancialInstallmentAvailable(this.mContext) ? SdkUtils.getFinancialInstallmentIntent() : null;
        }
        if (financialInstallmentIntent == null) {
            Toast.makeText(activity, "no support", 0).show();
            return;
        }
        financialInstallmentIntent.putExtra("order", str);
        financialInstallmentIntent.putExtra("extra", bundle);
        activity.startActivityForResult(financialInstallmentIntent, REQUEST_CREDIT_INSTALLMENT);
        StringBuilder sb = new StringBuilder();
        sb.append("start installment using activity, extra is empty: ");
        sb.append(bundle == null || bundle.isEmpty());
    }

    public boolean isSupportCounter() {
        return SdkUtils.isNativeCounterAvailable(this.mContext) || SdkUtils.isTVCounterAvailable(this.mContext) || SdkUtils.isFinancialCounterAvailable(this.mContext);
    }

    public boolean isSupportInstallment() {
        return SdkUtils.isNativeInstallmentAvailable(this.mContext) || SdkUtils.isFinancialInstallmentAvailable(this.mContext);
    }

    public void pay(Activity activity, String str, Bundle bundle) {
        Intent financialCounterIntent;
        if (activity == null) {
            throw new InvalidParameterException("activity cannot be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new InvalidParameterException("order cannot be empty");
        }
        if (this.mUseWalletTv && SdkUtils.isTVCounterAvailable(this.mContext)) {
            financialCounterIntent = SdkUtils.getTVCounterIntent();
        } else if (SdkUtils.isNativeCounterAvailable(this.mContext)) {
            financialCounterIntent = SdkUtils.getCounterIntent();
        } else {
            financialCounterIntent = SdkUtils.isFinancialCounterAvailable(this.mContext) ? SdkUtils.getFinancialCounterIntent() : null;
        }
        if (financialCounterIntent == null) {
            Toast.makeText(activity, "no support", 0).show();
            return;
        }
        financialCounterIntent.putExtra("order", str);
        financialCounterIntent.putExtra("extra", bundle);
        activity.startActivityForResult(financialCounterIntent, 424);
        StringBuilder sb = new StringBuilder();
        sb.append("start pay using activity, extra is empty: ");
        sb.append(bundle == null || bundle.isEmpty());
    }

    public void showMipayCenter(Activity activity) {
        internalShowWallet(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message makeMessage(int i, int i2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("message", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("result", str2);
            }
        } catch (JSONException unused) {
        }
        Message message = new Message();
        message.what = i;
        message.obj = jSONObject.toString();
        return message;
    }

    public void installmentPay(Fragment fragment, String str, Bundle bundle) {
        Intent financialInstallmentIntent;
        if (fragment != null) {
            if (!TextUtils.isEmpty(str)) {
                if (SdkUtils.isNativeInstallmentAvailable(this.mContext)) {
                    financialInstallmentIntent = SdkUtils.getInstallmentIntent();
                } else {
                    financialInstallmentIntent = SdkUtils.isFinancialInstallmentAvailable(this.mContext) ? SdkUtils.getFinancialInstallmentIntent() : null;
                }
                if (financialInstallmentIntent == null) {
                    Toast.makeText(this.mContext, "no support", 0).show();
                    return;
                }
                financialInstallmentIntent.putExtra("order", str);
                financialInstallmentIntent.putExtra("extra", bundle);
                fragment.startActivityForResult(financialInstallmentIntent, REQUEST_CREDIT_INSTALLMENT);
                StringBuilder sb = new StringBuilder();
                sb.append("start installment using fragment, extra is empty: ");
                sb.append(bundle == null || bundle.isEmpty());
                return;
            }
            throw new InvalidParameterException("installment order cannot be empty");
        }
        throw new InvalidParameterException("fragment cannot be null");
    }

    public void pay(Fragment fragment, String str, Bundle bundle) {
        Intent financialCounterIntent;
        if (fragment != null) {
            if (!TextUtils.isEmpty(str)) {
                if (this.mUseWalletTv && SdkUtils.isTVCounterAvailable(this.mContext)) {
                    financialCounterIntent = SdkUtils.getTVCounterIntent();
                } else if (SdkUtils.isNativeCounterAvailable(this.mContext)) {
                    financialCounterIntent = SdkUtils.getCounterIntent();
                } else {
                    financialCounterIntent = SdkUtils.isFinancialCounterAvailable(this.mContext) ? SdkUtils.getFinancialCounterIntent() : null;
                }
                if (financialCounterIntent == null) {
                    Toast.makeText(this.mContext, "no support", 0).show();
                    return;
                }
                financialCounterIntent.putExtra("order", str);
                financialCounterIntent.putExtra("extra", bundle);
                fragment.startActivityForResult(financialCounterIntent, 424);
                StringBuilder sb = new StringBuilder();
                sb.append("start pay using fragment, extra is empty: ");
                sb.append(bundle == null || bundle.isEmpty());
                return;
            }
            throw new InvalidParameterException("order cannot be empty");
        }
        throw new InvalidParameterException("fragment cannot be null");
    }

    @Deprecated
    public void pay(Activity activity, String str, Bundle bundle, int i, Handler handler) {
        if (activity != null) {
            if (!TextUtils.isEmpty(str)) {
                internalPay(activity, str, bundle, new MipayCallbackImpl(i, handler));
                return;
            }
            throw new InvalidParameterException("order cannot be empty");
        }
        throw new InvalidParameterException("activity cannot be null");
    }
}
