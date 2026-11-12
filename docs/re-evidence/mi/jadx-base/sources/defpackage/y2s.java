package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.chinaums.pppay.unify.UnifyPayPlugin;
import com.chinaums.pppay.unify.UnifyPayRequest;
import com.mibi.sdk.WXUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.LocalBroadcastManager;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.MemoryStorage;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.common.utils.UiUtil;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.mvp.lifecycle.ILifeCycleListener;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;

/* JADX INFO: loaded from: classes5.dex */
public class y2s extends Model<Void> implements ILifeCycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Activity f39728b;
    public d c;
    public b d;
    public BroadcastReceiver e;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra(CommonConstants.KEY_ERR_CODE, -1);
            String stringExtra = intent.getStringExtra("errDesc");
            MibiLog.d("WxpayModel", "onReceive errCode : " + intExtra + " ; errStr : " + stringExtra);
            if (intExtra == -2) {
                y2s.this.getCallback().onFailed(ErrorCodes.USER_CANCEL_WXPAY, stringExtra, null);
                return;
            }
            if (intExtra == -1) {
                y2s.this.getCallback().onFailed(ErrorCodes.WX_PAY_FAILED, stringExtra, null);
                return;
            }
            if (intExtra == 0) {
                y2s.this.getCallback().onSuccess(null);
                return;
            }
            y2s.this.getCallback().onFailed(ErrorCodes.WX_PAY_FAILED, intExtra + ", " + stringExtra, null);
        }
    }

    public interface b {
        void a(boolean z);
    }

    public class c extends RxBaseErrorHandleTaskListener<com.mibi.sdk.channel.wxpay.g.a.C0313a> {
        public /* synthetic */ c(y2s y2sVar, Context context, a aVar) {
            this(context);
        }

        public final com.mibi.sdk.channel.wxpay.g.b.a a(com.mibi.sdk.channel.wxpay.g.a.C0313a c0313a) {
            com.mibi.sdk.channel.wxpay.g.b.a aVar = new com.mibi.sdk.channel.wxpay.g.b.a();
            aVar.f10132a = c0313a.f10130a;
            aVar.f10133b = c0313a.f10131b;
            aVar.c = c0313a.c;
            aVar.d = c0313a.d;
            aVar.e = c0313a.e;
            aVar.f = c0313a.f;
            aVar.g = c0313a.g;
            return aVar;
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(com.mibi.sdk.channel.wxpay.g.a.C0313a c0313a) {
            MibiLog.d("WxpayModel", "start wxpay");
            new Thread(new e(y2s.this, a(c0313a), null)).start();
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d("WxpayModel", "request wxpay error:" + i + " ,errorDesc:" + str);
            y2s.this.getCallback().onFailed(i, str, th);
        }

        public c(Context context) {
            super(context);
        }
    }

    public enum d {
        INIT,
        STARTED,
        FINISHED,
        GO_INSTALL,
        INSTALLING
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mibi.sdk.channel.wxpay.g.b.a f39733a;

        public /* synthetic */ e(y2s y2sVar, com.mibi.sdk.channel.wxpay.g.b.a aVar, a aVar2) {
            this(aVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            MibiLog.d("WxpayModel", "start wx pay");
            Context applicationContext = y2s.this.getContext().getApplicationContext();
            PayReq payReq = new PayReq();
            com.mibi.sdk.channel.wxpay.g.b.a aVar = this.f39733a;
            payReq.appId = aVar.f10132a;
            payReq.partnerId = aVar.f10133b;
            payReq.prepayId = aVar.c;
            payReq.packageValue = aVar.d;
            payReq.nonceStr = aVar.e;
            payReq.timeStamp = aVar.f;
            payReq.sign = aVar.g;
            IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(applicationContext, null);
            iwxapiCreateWXAPI.registerApp(this.f39733a.f10132a);
            WXUtils.putString(applicationContext, "appid", this.f39733a.f10132a);
            boolean zSendReq = iwxapiCreateWXAPI.sendReq(payReq);
            if (zSendReq) {
                y2s.this.c = d.STARTED;
            } else {
                y2s.this.getCallback().onFailed(0, "wxpay error", null);
                y2s.this.c = d.FINISHED;
            }
            MibiLog.d("WxpayModel", "prePayId is null ? " + TextUtils.isEmpty(this.f39733a.c) + " ; appId is null ? " + TextUtils.isEmpty(this.f39733a.f10132a));
            StringBuilder sb = new StringBuilder();
            sb.append("WeiXin sendSuccess = ");
            sb.append(zSendReq);
            MibiLog.d("WxpayModel", sb.toString());
        }

        public e(com.mibi.sdk.channel.wxpay.g.b.a aVar) {
            this.f39733a = aVar;
        }
    }

    public class f implements com.mibi.sdk.channel.wxpay.d.c {
        public f() {
        }

        @Override // com.mibi.sdk.channel.wxpay.d.c
        public void a() {
            MibiLog.d("WxpayModel", "onCancel");
            y2s.this.c = d.FINISHED;
            y2s.this.getCallback().onFailed(0, "user canceled", null);
        }

        @Override // com.mibi.sdk.channel.wxpay.d.c
        public void b() {
            MibiLog.d("WxpayModel", "onConfirm");
            y2s.this.c = d.INSTALLING;
        }

        public /* synthetic */ f(y2s y2sVar, a aVar) {
            this();
        }
    }

    public class g extends RxBaseErrorHandleTaskListener<com.mibi.sdk.channel.wxpay.g.b.a> {
        public /* synthetic */ g(y2s y2sVar, Context context, a aVar) {
            this(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(com.mibi.sdk.channel.wxpay.g.b.a aVar) {
            MibiLog.d("WxpayModel", "start wxpay");
            y2s.this.j(aVar);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d("WxpayModel", "request wxpay error:" + i + " ,errorDesc:" + str);
            y2s.this.getCallback().onFailed(i, str, th);
        }

        public g(Context context) {
            super(context);
        }
    }

    public y2s(Session session) {
        super(session);
        this.c = d.INIT;
        this.e = new a();
    }

    private void c() {
        MibiLog.d("WxpayModel", "checkInstall");
        if (com.mibi.sdk.channel.wxpay.d.b(getContext())) {
            MibiLog.d("WxpayModel", "wx installed");
            this.c = d.INIT;
            this.d.a(false);
            g(this.f39727a);
            return;
        }
        MibiLog.d("WxpayModel", "wx is not installed");
        this.c = d.GO_INSTALL;
        this.d.a(true);
        com.mibi.sdk.channel.wxpay.d.a(this.f39728b, new f(this, null));
    }

    private void g(String str) {
        MibiLog.d("WxpayModel", "requestServer");
        MemoryStorage memoryStorage = getSession().getMemoryStorage();
        long j = memoryStorage.getLong(str, Constants.KEY_RECHARGE_VALUE);
        boolean z = memoryStorage.getBoolean(str, CommonConstants.KEY_IS_PARTNER_ACCOUNT);
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, str);
        sortedParameter.add(Constants.KEY_CHARGE_FEE, Long.valueOf(j));
        a aVar = null;
        if (!z) {
            com.mibi.sdk.channel.wxpay.g.b bVar = new com.mibi.sdk.channel.wxpay.g.b(getContext(), getSession());
            bVar.setParams(sortedParameter);
            n4h.a(bVar).c(new g(this, getContext(), aVar));
            return;
        }
        boolean z2 = memoryStorage.getBoolean(str, Constants.KEY_USE_GIFTCARD);
        boolean z3 = memoryStorage.getBoolean(str, Constants.KEY_USE_PARTNER_GIFTCARD);
        sortedParameter.add(Constants.KEY_USE_GIFTCARD, Boolean.valueOf(z2));
        sortedParameter.add(Constants.KEY_USE_PARTNER_GIFTCARD, Boolean.valueOf(z3));
        com.mibi.sdk.channel.wxpay.g.a aVar2 = new com.mibi.sdk.channel.wxpay.g.a(getContext(), getSession(), str);
        aVar2.setParams(sortedParameter);
        n4h.a(aVar2).c(new c(this, getContext(), aVar));
    }

    public void d(b bVar) {
        this.d = bVar;
    }

    public void f(Activity activity) {
        this.f39728b = activity;
    }

    public final boolean h(com.mibi.sdk.channel.wxpay.g.b.a aVar) {
        MibiLog.d("WxpayModel", "start wx mini program pay");
        if (TextUtils.isEmpty(aVar.i)) {
            MibiLog.d("WxpayModel", "payRequest is null");
            return false;
        }
        if (this.f39728b == null || this.f39728b.isFinishing()) {
            StringBuilder sb = new StringBuilder();
            sb.append("activity state invalid, is null ? ");
            sb.append(this.f39728b == null);
            MibiLog.d("WxpayModel", sb.toString());
            return false;
        }
        WXUtils.putString(this.f39728b, "appid", aVar.f10132a);
        UnifyPayRequest unifyPayRequest = new UnifyPayRequest();
        unifyPayRequest.payChannel = "01";
        unifyPayRequest.payData = aVar.i;
        UnifyPayPlugin.getInstance(this.f39728b).sendPayRequest(unifyPayRequest);
        this.c = d.STARTED;
        return true;
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void handleResult(int i, int i2, Bundle bundle) {
    }

    public final void j(com.mibi.sdk.channel.wxpay.g.b.a aVar) {
        a aVar2 = null;
        if (!aVar.h) {
            new Thread(new e(this, aVar, aVar2)).start();
            return;
        }
        boolean zH = h(aVar);
        MibiLog.d("WxpayModel", "start wx mini program pay success : " + zH);
        if (zH) {
            return;
        }
        getCallback().onFailed(ErrorCodes.UMS_WX_PAY_START_FAILED, "start ums wx pay failed", null);
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onCreate() {
        MibiLog.d("WxpayModel", "onCreate");
        LocalBroadcastManager.getInstance(getContext().getApplicationContext()).registerReceiver(this.e, new IntentFilter(Constants.ACTION_RECEIVE_WX_RESULT));
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onDestroy() {
        MibiLog.d("WxpayModel", LifecycleConstantKt.ON_DESTROY);
        this.f39728b = null;
        UnifyPayPlugin.getInstance(getContext()).clean();
        LocalBroadcastManager.getInstance(getContext().getApplicationContext()).unregisterReceiver(this.e);
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onPause() {
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onResume() {
        MibiLog.d("WxpayModel", LifecycleConstantKt.ON_RESUME);
        d dVar = this.c;
        if (dVar == d.INSTALLING) {
            c();
        } else if (dVar == d.STARTED) {
            MibiLog.d("WxpayModel", "has not receive result from wx");
            getCallback().onFailed(ErrorCodes.WX_PAY_FAILED, "has not receive result from wx", null);
            this.c = d.FINISHED;
        }
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<Void> iResultCallback) {
        super.request(bundle, iResultCallback);
        MibiLog.d("WxpayModel", "request wxpay");
        this.f39727a = bundle.getString(CommonConstants.KEY_PROCESS_ID);
        UiUtil.setTaskId(this.f39728b.getTaskId());
        if (TextUtils.isEmpty(this.f39727a)) {
            throw new IllegalStateException();
        }
        c();
    }
}
