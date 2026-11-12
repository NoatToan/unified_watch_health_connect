package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.MemoryStorage;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.OrderBean;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.mvp.lifecycle.ILifeCycleListener;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import com.mibi.sdk.task.handler.ServerErrorCodeExceptionHandler;
import com.mipay.sdk.MipayFactory;

/* JADX INFO: loaded from: classes5.dex */
public class r9s extends Model<Bundle> implements ILifeCycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f32339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f32340b;
    public ServerErrorCodeExceptionHandler c;

    public class a extends ServerErrorCodeExceptionHandler {
        public a(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.handler.ServerErrorCodeExceptionHandler
        public boolean handleProcessExpiredError() {
            r9s.this.getCallback().onFailed(8000, "process error", null);
            return true;
        }
    }

    public class b extends RxBaseErrorHandleTaskListener<com.mibi.sdk.channel.mipay.g.a.C0312a> {
        public b(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(com.mibi.sdk.channel.mipay.g.a.C0312a c0312a) {
            MibiLog.d("MipayPayModel", "start mipay");
            r9s.this.f(c0312a.c);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d("MipayPayModel", "request mipay error:" + i + " ,errorDesc:" + str);
            r9s.this.getCallback().onFailed(i, str, th);
        }
    }

    public class c extends RxBaseErrorHandleTaskListener<com.mibi.sdk.channel.mipay.g.b.a> {
        public c(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(com.mibi.sdk.channel.mipay.g.b.a aVar) {
            MibiLog.d("MipayPayModel", "start mipay");
            r9s.this.f(aVar.c);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d("MipayPayModel", "request mipay error:" + i + " ,errorDesc:" + str);
            r9s.this.getCallback().onFailed(i, str, th);
        }
    }

    public r9s(Session session) {
        super(session);
        this.c = new a(getContext());
    }

    private void d(String str) {
        MemoryStorage memoryStorage = getSession().getMemoryStorage();
        long j = memoryStorage.getLong(str, Constants.KEY_RECHARGE_VALUE);
        boolean z = memoryStorage.getBoolean(str, CommonConstants.KEY_IS_PARTNER_ACCOUNT);
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, str);
        sortedParameter.add(Constants.KEY_DENOMINATION_MIBI, Long.valueOf(j));
        sortedParameter.add(Constants.KEY_CHARGE_FEE, Long.valueOf(j));
        if (!z) {
            com.mibi.sdk.channel.mipay.g.a aVar = new com.mibi.sdk.channel.mipay.g.a(getContext(), getSession());
            aVar.setParams(sortedParameter);
            b bVar = new b(getContext());
            bVar.getDispatcher().register(this.c);
            n4h.a(aVar).c(bVar);
            return;
        }
        boolean z2 = memoryStorage.getBoolean(str, Constants.KEY_USE_GIFTCARD);
        boolean z3 = memoryStorage.getBoolean(str, Constants.KEY_USE_PARTNER_GIFTCARD);
        sortedParameter.add(Constants.KEY_USE_GIFTCARD, Boolean.valueOf(z2));
        sortedParameter.add(Constants.KEY_USE_PARTNER_GIFTCARD, Boolean.valueOf(z3));
        com.mibi.sdk.channel.mipay.g.b bVar2 = new com.mibi.sdk.channel.mipay.g.b(getContext(), getSession(), str);
        bVar2.setParams(sortedParameter);
        c cVar = new c(getContext());
        cVar.getDispatcher().register(this.c);
        n4h.a(bVar2).c(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        boolean z = false;
        if (this.f32339a == null) {
            getCallback().onFailed(0, "activity is null", null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("skipSuccess", true);
        OrderBean orderBean = (OrderBean) getSession().getMemoryStorage().get(this.f32340b, Constants.KEY_ORDER_BEAN);
        if (orderBean != null && orderBean.mUseMipayH5) {
            z = true;
        }
        MibiLog.d("MipayPayModel", "use mipay h5 : " + z);
        MipayFactory.get(getContext(), a2s.a(getContext()), z).pay(this.f32339a, str, bundle);
    }

    public void b(Activity activity) {
        this.f32339a = activity;
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void handleResult(int i, int i2, Bundle bundle) {
        MibiLog.d("MipayPayModel", "requestCode:" + i + ",resultCode:" + i2);
        if (i == 424) {
            if (bundle != null) {
                int i3 = bundle.getInt("code", 2);
                if (i3 == 0) {
                    MibiLog.d("MipayPayModel", "onSuccess");
                    getCallback().onSuccess(bundle);
                } else if (i3 == 2) {
                    MibiLog.d("MipayPayModel", "onCancel");
                    getCallback().onFailed(ErrorCodes.USER_CANCEL_MIPAY, getContext().getResources().getString(com.mibi.sdk.channel.mipay.a.c), null);
                } else {
                    MibiLog.d("MipayPayModel", "onError");
                    getCallback().onFailed(11, getContext().getResources().getString(com.mibi.sdk.channel.mipay.a.f10107a), null);
                }
            } else {
                MibiLog.d("MipayPayModel", "onError");
                getCallback().onFailed(11, getContext().getResources().getString(com.mibi.sdk.channel.mipay.a.f10107a), null);
            }
            MipayFactory.release();
        }
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onCreate() {
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onDestroy() {
        this.f32339a = null;
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onPause() {
    }

    @Override // com.mibi.sdk.mvp.lifecycle.ILifeCycleListener
    public void onResume() {
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<Bundle> iResultCallback) {
        super.request(bundle, iResultCallback);
        String string = bundle.getString(CommonConstants.KEY_PROCESS_ID);
        if (TextUtils.isEmpty(string)) {
            throw new IllegalStateException();
        }
        this.f32340b = string;
        if (bundle.getBoolean(CommonConstants.KEY_IS_RESTORED)) {
            return;
        }
        d(string);
    }
}
