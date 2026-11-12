package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.chinaums.pppay.unify.UnifyPayListener;
import com.chinaums.pppay.unify.UnifyPayPlugin;
import com.chinaums.pppay.unify.UnifyPayRequest;
import com.mibi.sdk.channel.alipay.PayResult;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.LocalBroadcastManager;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.MemoryStorage;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.common.utils.UiUtil;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.MarketUtils;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.mvp.lifecycle.ILifeCycleListener;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class b2s extends Model<Void> implements ILifeCycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f3723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Activity f3724b;
    public BroadcastReceiver c;

    public class a implements MarketUtils.InstallPromptListener {
        public a() {
        }

        @Override // com.mibi.sdk.component.MarketUtils.InstallPromptListener
        public void onCancel() {
            MibiLog.d("AlipayModel", "cancel install ali app");
            b2s.this.getCallback().onFailed(ErrorCodes.UMS_ALI_PAY_NOT_INSTALLED, "cancel install ali app", null);
        }

        @Override // com.mibi.sdk.component.MarketUtils.InstallPromptListener
        public void onConfirm() {
            MibiLog.d("AlipayModel", "go to install ali app");
            b2s.this.getCallback().onFailed(ErrorCodes.UMS_ALI_PAY_NOT_INSTALLED, "go to install ali app", null);
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra(CommonConstants.KEY_ERR_CODE);
            String stringExtra2 = intent.getStringExtra("errDesc");
            MibiLog.d("AlipayModel", "onReceive errCode : " + stringExtra + " ; errStr : " + stringExtra2);
            if (TextUtils.equals(UnifyPayListener.ERR_OK, stringExtra)) {
                MibiLog.d("AlipayModel", "ali mini program pay success");
                b2s.this.getCallback().onSuccess(null);
                return;
            }
            if (TextUtils.equals(UnifyPayListener.ERR_USER_CANCEL, stringExtra)) {
                MibiLog.d("AlipayModel", "ali mini program pay cancel");
                b2s.this.getCallback().onFailed(ErrorCodes.USER_CANCEL_ALIPAY, stringExtra2, null);
                return;
            }
            MibiLog.d("AlipayModel", "ali mini program pay failed");
            b2s.this.getCallback().onFailed(ErrorCodes.UMS_ALI_PAY_FAILED, stringExtra + ", " + stringExtra2, null);
        }
    }

    public static class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<b2s> f3727a;

        public /* synthetic */ c(b2s b2sVar, a aVar) {
            this(b2sVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            b2s b2sVar = this.f3727a.get();
            if (b2sVar == null) {
                MibiLog.d("AlipayModel", "model is null");
                return;
            }
            int i = message.what;
            if (i == 100) {
                b2sVar.e(new PayResult((Map) message.obj));
                return;
            }
            if (i == 101) {
                MibiLog.d("AlipayModel", "alipay exception:101");
                b2sVar.getCallback().onFailed(0, "alipay exception", null);
            } else {
                throw new IllegalStateException("should not happen:" + message.what);
            }
        }

        public c(b2s b2sVar) {
            this.f3727a = new WeakReference<>(b2sVar);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3728a;

        public /* synthetic */ d(b2s b2sVar, String str, a aVar) {
            this(str);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!b2s.this.h()) {
                MibiLog.d("AlipayModel", "activity is null,maybe activity has been destroyed");
                return;
            }
            MibiLog.i("AlipayModel", "start alipay sdk");
            Map<String, String> mapPayV2 = new PayTask(b2s.this.f3724b).payV2(this.f3728a, true);
            MibiLog.i("AlipayModel", "finish alipay sdk");
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.obj = mapPayV2;
            b2s.this.f3723a.sendMessage(messageObtain);
        }

        public d(String str) {
            this.f3728a = str;
        }
    }

    public class e extends RxBaseErrorHandleTaskListener<com.mibi.sdk.channel.alipay.f.a.C0311a> {
        public /* synthetic */ e(b2s b2sVar, Context context, a aVar) {
            this(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(com.mibi.sdk.channel.alipay.f.a.C0311a c0311a) {
            MibiLog.d("AlipayModel", "start alipay");
            b2s.this.g(c0311a.f10102a, c0311a.f10103b);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d("AlipayModel", "request alipay error:" + i + " ,errorDesc:" + str);
            b2s.this.getCallback().onFailed(i, str, th);
        }

        public e(Context context) {
            super(context);
        }
    }

    public class f extends RxBaseErrorHandleTaskListener<com.mibi.sdk.channel.alipay.f.b.a> {
        public /* synthetic */ f(b2s b2sVar, Context context, a aVar) {
            this(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(com.mibi.sdk.channel.alipay.f.b.a aVar) {
            MibiLog.d("AlipayModel", "start alipay");
            new Thread(new d(b2s.this, aVar.f10105a, null)).start();
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d("AlipayModel", "request alipay error:" + i + " ,errorDesc:" + str);
            b2s.this.getCallback().onFailed(i, str, th);
        }

        public f(Context context) {
            super(context);
        }
    }

    public b2s(Session session) {
        super(session);
        this.f3723a = new c(this, null);
        this.c = new b();
    }

    public void d(Activity activity) {
        this.f3724b = activity;
    }

    public final void e(PayResult payResult) {
        MibiLog.d("AlipayModel", "handlePayResult");
        try {
            String resultStatus = payResult.getResultStatus();
            if (TextUtils.equals(resultStatus, "9000")) {
                MibiLog.d("AlipayModel", "resultStatus success");
                getCallback().onSuccess(null);
            } else if (TextUtils.equals(resultStatus, "6001")) {
                String str = "alipay user cancel:" + resultStatus;
                MibiLog.d("AlipayModel", str);
                getCallback().onFailed(ErrorCodes.USER_CANCEL_ALIPAY, str, null);
            } else {
                String str2 = "alipay error:" + resultStatus;
                MibiLog.d("AlipayModel", str2);
                getCallback().onFailed(0, str2, null);
            }
        } catch (Exception e2) {
            MibiLog.d("AlipayModel", "alipay exception", e2);
            getCallback().onFailed(0, "alipay exception", null);
        }
    }

    public final void f(String str) {
        MemoryStorage memoryStorage = getSession().getMemoryStorage();
        long j = memoryStorage.getLong(str, Constants.KEY_RECHARGE_VALUE);
        boolean z = memoryStorage.getBoolean(str, CommonConstants.KEY_IS_PARTNER_ACCOUNT);
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, str);
        sortedParameter.add(Constants.KEY_CHARGE_FEE, Long.valueOf(j));
        a aVar = null;
        if (!z) {
            com.mibi.sdk.channel.alipay.f.a aVar2 = new com.mibi.sdk.channel.alipay.f.a(getContext(), getSession());
            aVar2.setParams(sortedParameter);
            n4h.a(aVar2).c(new e(this, getContext(), aVar));
            return;
        }
        boolean z2 = memoryStorage.getBoolean(str, Constants.KEY_USE_GIFTCARD);
        boolean z3 = memoryStorage.getBoolean(str, Constants.KEY_USE_PARTNER_GIFTCARD);
        sortedParameter.add(Constants.KEY_USE_GIFTCARD, Boolean.valueOf(z2));
        sortedParameter.add(Constants.KEY_USE_PARTNER_GIFTCARD, Boolean.valueOf(z3));
        com.mibi.sdk.channel.alipay.f.b bVar = new com.mibi.sdk.channel.alipay.f.b(getContext(), getSession(), str);
        bVar.setParams(sortedParameter);
        n4h.a(bVar).c(new f(this, getContext(), aVar));
    }

    public final void g(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            MibiLog.e("AlipayModel", "result is null");
        } else if (z) {
            j(str);
        } else {
            MibiLog.d("AlipayModel", "start alipay thread");
            new Thread(new d(this, str, null)).start();
        }
    }

    public final boolean h() {
        return (this.f3724b == null || this.f3724b.isDestroyed() || this.f3724b.isFinishing()) ? false : true;
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void handleResult(int i, int i2, Bundle bundle) {
    }

    public final void j(String str) {
        MibiLog.d("AlipayModel", "start ali mini program pay");
        if (this.f3724b == null || this.f3724b.isFinishing()) {
            StringBuilder sb = new StringBuilder();
            sb.append("activity state invalid, is null ? ");
            sb.append(this.f3724b == null);
            MibiLog.d("AlipayModel", sb.toString());
            getCallback().onFailed(ErrorCodes.UMS_ALI_PAY_START_FAILED, "start ums ali pay failed", null);
            return;
        }
        if (!MarketUtils.isAppInstalled(this.f3724b, CommonConstants.ALIPAY_PACKAGE_NAME)) {
            MibiLog.d("AlipayModel", "alipay app not installed");
            MarketUtils.showInstallPrompt(this.f3724b, this.f3724b.getResources().getString(com.mibi.sdk.channel.alipay.a.f10096a), CommonConstants.ALIPAY_PACKAGE_NAME, new a());
            return;
        }
        UnifyPayRequest unifyPayRequest = new UnifyPayRequest();
        unifyPayRequest.payChannel = "04";
        unifyPayRequest.payData = str;
        UnifyPayPlugin.getInstance(this.f3724b).sendPayRequest(unifyPayRequest);
        MibiLog.d("AlipayModel", "start ali mini program pay success");
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onCreate() {
        MibiLog.d("AlipayModel", "onCreate");
        LocalBroadcastManager.getInstance(getContext().getApplicationContext()).registerReceiver(this.c, new IntentFilter("com.mibi.sdk.action.RECEIVE_ALIPAY_RESULT"));
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onDestroy() {
        MibiLog.d("AlipayModel", LifecycleConstantKt.ON_DESTROY);
        this.f3724b = null;
        UnifyPayPlugin.getInstance(getContext()).clean();
        LocalBroadcastManager.getInstance(getContext().getApplicationContext()).unregisterReceiver(this.c);
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onPause() {
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onResume() {
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<Void> iResultCallback) {
        super.request(bundle, iResultCallback);
        UiUtil.setTaskId(this.f3724b.getTaskId());
        String string = bundle.getString(CommonConstants.KEY_PROCESS_ID);
        if (TextUtils.isEmpty(string)) {
            throw new IllegalStateException();
        }
        f(string);
    }
}
