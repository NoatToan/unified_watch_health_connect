package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.mibi.sdk.WXUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.LocalBroadcastManager;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.common.utils.UiUtil;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.MarketUtils;
import com.mibi.sdk.deduct.o.k;
import com.mibi.sdk.mvp.lifecycle.ILifeCycleListener;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public class x6t extends izs implements ILifeCycleListener {
    public IWXAPI c;
    public ExecutorService d;
    public BroadcastReceiver e;

    public class a implements xrs<Activity> {

        /* JADX INFO: renamed from: x6t$a$a, reason: collision with other inner class name */
        public class C1145a implements MarketUtils.InstallPromptListener {
            public C1145a() {
            }

            @Override // com.mibi.sdk.component.MarketUtils.InstallPromptListener
            public void onCancel() {
                MibiLog.d("WxpaySignDeductModel", "Wxpay install is canceled");
                x6t.this.a().a(ErrorCodes.SIGN_DEDUCT_CANCEL, "Wxpay install is canceled");
            }

            @Override // com.mibi.sdk.component.MarketUtils.InstallPromptListener
            public void onConfirm() {
                MibiLog.d("WxpaySignDeductModel", "go market for wxpay install");
                x6t.this.a().a(ErrorCodes.DEDUCT_INSTALL, "go market for wxpay install");
            }
        }

        public a() {
        }

        @Override // defpackage.xrs
        public void a(Activity activity) {
            MarketUtils.showInstallPrompt(activity, activity.getString(com.mibi.sdk.deduct.a.i, activity.getResources().getString(com.mibi.sdk.deduct.a.n)), "com.tencent.mm", new C1145a());
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra(CommonConstants.KEY_ERR_CODE, -1);
            MibiLog.d("WxpaySignDeductModel", "onReceive errCode : " + intExtra + " ; errStr : " + intent.getStringExtra("errDesc"));
            x6t.this.f(intExtra);
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public IWXAPI f38772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k.a f38773b;
        public WeakReference<x6t> c;

        public c(x6t x6tVar, k.a aVar) {
            this.c = new WeakReference<>(x6tVar);
            this.f38773b = aVar;
        }

        public static /* synthetic */ void b(x6t x6tVar) {
            x6tVar.a().a(ErrorCodes.SIGN_DEDUCT_FAILED, "start wx failed");
        }

        public final void c(final x6t x6tVar, k.a aVar) {
            PayReq payReq = new PayReq();
            String str = aVar.f10164b;
            payReq.appId = str;
            payReq.partnerId = aVar.c;
            payReq.prepayId = aVar.d;
            payReq.packageValue = aVar.e;
            payReq.nonceStr = aVar.f;
            payReq.timeStamp = aVar.g;
            payReq.sign = aVar.h;
            this.f38772a.registerApp(str);
            boolean zSendReq = this.f38772a.sendReq(payReq);
            x6tVar.getSession().getMemoryStorage().put(x6tVar.c(), "signDeductStart", Boolean.TRUE);
            MibiLog.d("WxpaySignDeductModel", "WeiXin sendSuccess = " + zSendReq);
            if (!zSendReq) {
                UiUtil.runOnUiThread(new Runnable() { // from class: y6t
                    @Override // java.lang.Runnable
                    public final void run() {
                        x6t.c.b(x6tVar);
                    }
                });
            } else {
                WXUtils.putString(x6tVar.getContext(), "prepayid", aVar.d);
                WXUtils.putString(x6tVar.getContext(), "appid", aVar.f10164b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            x6t x6tVar = this.c.get();
            if (x6tVar == null) {
                return;
            }
            this.f38772a = WXAPIFactory.createWXAPI(x6tVar.getContext().getApplicationContext(), null);
            c(x6tVar, this.f38773b);
        }
    }

    public class d extends RxBaseErrorHandleTaskListener<k.a> {
        public /* synthetic */ d(x6t x6tVar, Context context, a aVar) {
            this(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(k.a aVar) {
            x6t.this.g(aVar);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            x6t.this.a().a(i, str);
        }

        public d(Context context) {
            super(context);
        }
    }

    public x6t(Session session, String str) {
        super(session, str);
        this.e = new b();
        this.c = WXAPIFactory.createWXAPI(getContext().getApplicationContext(), null);
    }

    private void m() {
        MibiLog.d("WxpaySignDeductModel", "prompt wx apk install");
        a().f(new a());
    }

    private void o() {
        MibiLog.d("WxpaySignDeductModel", "request wx sign deduct");
        if (getSession().getMemoryStorage().getBoolean(c(), "signDeductStart", false)) {
            n();
        } else {
            p();
        }
    }

    private void p() {
        MibiLog.d("WxpaySignDeductModel", "request wx sign deduct url");
        k kVar = new k(getContext(), getSession());
        d dVar = new d(this, getContext(), null);
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, c());
        kVar.setParams(sortedParameter);
        n4h.a(kVar).c(dVar);
    }

    @Override // defpackage.izs
    public void d() {
        if (this.c.isWXAppInstalled()) {
            o();
        } else {
            m();
        }
    }

    public final void f(int i) {
        if (i == -2) {
            a().a(ErrorCodes.SIGN_DEDUCT_CANCEL, getContext().getResources().getString(com.mibi.sdk.deduct.a.m));
            return;
        }
        if (i != -1) {
            if (i == 0) {
                n();
                return;
            }
            a().a(ErrorCodes.SIGN_DEDUCT_FAILED, "WXPay failed errorCode : " + i);
            return;
        }
        a().a(ErrorCodes.SIGN_DEDUCT_FAILED, getContext().getResources().getString(com.mibi.sdk.deduct.a.j, getContext().getResources().getString(com.mibi.sdk.deduct.a.n)) + " ; code : " + i);
    }

    public final void g(k.a aVar) {
        MibiLog.d("WxpaySignDeductModel", "start wx sign deduct");
        if (!this.c.isWXAppInstalled()) {
            m();
            return;
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.d = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new c(this, aVar));
    }

    public void n() {
        MibiLog.d("WxpaySignDeductModel", "query result");
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstants.KEY_PROCESS_ID, c());
        bundle.putString(Constants.KEY_SIGN_DEDUCT_CHANNEL, com.mibi.sdk.deduct.c.a.WXPAY.a());
        a().a(bundle);
        getSession().getMemoryStorage().remove(c(), "signDeductStart");
    }

    @Override // defpackage.izs, com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onCreate() {
        MibiLog.d("WxpaySignDeductModel", "onCreate, register receiver");
        LocalBroadcastManager.getInstance(getContext().getApplicationContext()).registerReceiver(this.e, new IntentFilter(Constants.ACTION_RECEIVE_WX_RESULT));
    }

    @Override // defpackage.izs, com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onDestroy() {
        MibiLog.d("WxpaySignDeductModel", "onDestroy, unregister receiver");
        LocalBroadcastManager.getInstance(getContext().getApplicationContext()).unregisterReceiver(this.e);
    }
}
