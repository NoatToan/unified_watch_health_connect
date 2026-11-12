package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.MibiSdkConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.common.utils.QueryIntervalUtils;
import com.mibi.sdk.component.BaseMvpPresenter;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.deduct.o.l;
import com.mibi.sdk.task.AutoQuerier;
import com.mibi.sdk.task.DefaultAutoQueryCallback;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes5.dex */
public class ajs extends BaseMvpPresenter<dxs> implements qus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public izs f1109b;
    public String c;
    public String d;
    public AutoQuerier e;
    public l f;
    public b g;
    public Activity h;
    public AutoQuerier.AutoQuerierCallback i;

    public class a extends DefaultAutoQueryCallback {
        public a() {
        }

        @Override // com.mibi.sdk.task.DefaultAutoQueryCallback, com.mibi.sdk.task.AutoQuerier.AutoQuerierCallback
        public void onComplete() {
            ajs.this.b();
        }
    }

    public class b extends RxBaseErrorHandleTaskListener<l.a> {
        public b(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(l.a aVar) {
            MibiLog.d("SignDeductPresenter", "query task success status : " + aVar.f10165a);
            String str = aVar.f10165a;
            str.hashCode();
            if (str.equals("SUCCESS")) {
                Bundle bundle = new Bundle();
                if (TextUtils.equals(ajs.this.c, com.mibi.sdk.deduct.c.a.MIPAY.a())) {
                    bundle.putString(Constants.KEY_DEDUCT_NAME, ajs.this.getContext().getResources().getString(com.mibi.sdk.deduct.a.f10136k));
                } else if (TextUtils.equals(ajs.this.c, com.mibi.sdk.deduct.c.a.ALIPAY.a())) {
                    bundle.putString(Constants.KEY_DEDUCT_NAME, ajs.this.getContext().getResources().getString(com.mibi.sdk.deduct.a.h));
                } else if (TextUtils.equals(ajs.this.c, com.mibi.sdk.deduct.c.a.UNIONPAY.a())) {
                    bundle.putString(Constants.KEY_DEDUCT_NAME, ajs.this.getContext().getResources().getString(com.mibi.sdk.deduct.a.l));
                }
                bundle.putBoolean(Constants.KEY_IS_DEDUCT, true);
                bundle.putString(Constants.KEY_MARKET_DEDUCT_ID, aVar.f10166b);
                bundle.putString("orderId", aVar.c);
                ((dxs) ajs.this.getView()).c(ErrorCodes.SIGN_DEDUCT_SUCCESS, "sign deduct success ", bundle);
                return;
            }
            if (str.equals(CommonConstants.Mgc.STATUS_FAIL)) {
                if (ajs.this.e == null) {
                    ajs ajsVar = ajs.this;
                    ajsVar.e = new AutoQuerier(ajsVar.f1108a, ajs.this.i);
                }
                if (ajs.this.e.hasNext()) {
                    ajs.this.e.query();
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean(Constants.KEY_IS_DEDUCT, true);
                bundle2.putString(Constants.KEY_MARKET_DEDUCT_ID, aVar.f10166b);
                bundle2.putString("orderId", aVar.c);
                bundle2.putString(Constants.KEY_CHARGE_STATUS, aVar.d);
                bundle2.putInt(Constants.KEY_PAY_STATUS, aVar.e);
                bundle2.putInt(Constants.KEY_DEDUCT_SIGN_STATUS, aVar.f);
                ((dxs) ajs.this.getView()).c(ErrorCodes.SIGN_DEDUCT_FAILED, ajs.this.getContext().getResources().getString(com.mibi.sdk.deduct.a.f10134a), bundle2);
            }
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d("SignDeductPresenter", "query failed, code : " + i + " ; desc : " + str, th);
            ((dxs) ajs.this.getView()).c(i, str, null);
        }
    }

    public class c implements izs.a {
        public c() {
        }

        @Override // izs.a
        public void a(Bundle bundle) {
            MibiLog.d("SignDeductPresenter", "requestQueryResult");
            ajs.this.b();
        }

        @Override // izs.a
        public void f(xrs<Activity> xrsVar) {
            ((dxs) ajs.this.getView()).f(xrsVar);
        }

        public /* synthetic */ c(ajs ajsVar, a aVar) {
            this();
        }

        @Override // izs.a
        public void a(int i, String str) {
            MibiLog.d("SignDeductPresenter", "handleDeductError errorCode : " + i + "  ; errDesc : " + str);
            ((dxs) ajs.this.getView()).c(i, str, null);
        }
    }

    public ajs() {
        super(dxs.class);
        this.f1108a = new int[]{0, 1, 2, 2};
        this.i = new a();
    }

    private void i() {
        int[] queryInterval = QueryIntervalUtils.getQueryInterval((String) getSession().getMemoryStorage().getSerializable(MibiSdkConstants.MIBI_EXTRA_PARAMS));
        if (queryInterval == null || queryInterval.length <= 0) {
            MibiLog.d("SignDeductPresenter", "interval is null");
        } else {
            this.f1108a = queryInterval;
        }
    }

    public void a() {
        izs izsVar;
        MibiLog.d("SignDeductPresenter", "checkNeedQuery");
        if (getSession().getMemoryStorage().getBoolean(this.d, "signDeductStart", false) && (izsVar = this.f1109b) != null && (izsVar instanceof a9s)) {
            ((a9s) izsVar).l();
        }
    }

    @Override // defpackage.qus
    public void b() {
        MibiLog.d("SignDeductPresenter", "start query result");
        ((dxs) getView()).b(true);
        if (this.f == null) {
            this.f = new l(getContext(), getSession());
            SortedParameter sortedParameter = new SortedParameter();
            sortedParameter.add(CommonConstants.KEY_PROCESS_ID, this.d);
            sortedParameter.add(Constants.KEY_SIGN_DEDUCT_CHANNEL, this.c);
            this.f.setParams(sortedParameter);
            this.g = new b(getContext());
        }
        n4h.a(this.f).c(this.g);
    }

    public ajs d(Activity activity) {
        this.h = activity;
        return this;
    }

    public final izs g() {
        izs y2tVar;
        MibiLog.d("SignDeductPresenter", "createModel");
        a aVar = null;
        if (com.mibi.sdk.deduct.c.a.ALIPAY.a().equals(this.c)) {
            y2tVar = new a9s(getSession(), this.d).e(this.h);
            this.h = null;
        } else if (com.mibi.sdk.deduct.c.a.WXPAY.a().equals(this.c)) {
            y2tVar = new x6t(getSession(), this.d);
        } else {
            if (!com.mibi.sdk.deduct.c.a.UNIONPAY.a().equals(this.c)) {
                throw new IllegalStateException("mChannelName:" + this.c);
            }
            y2tVar = new y2t(getSession(), this.d);
        }
        addLifeCycleListener(y2tVar);
        y2tVar.b(new c(this, aVar));
        return y2tVar;
    }

    @Override // com.mibi.sdk.mvp.Presenter, com.mibi.sdk.mvp.IPresenter
    public void handleResult(int i, int i2, Bundle bundle) {
        super.handleResult(i, i2, bundle);
        MibiLog.d("SignDeductPresenter", "handleResult requestCode : " + i + " ; resultCode : " + i2);
    }

    @Override // com.mibi.sdk.component.BaseMvpPresenter, com.mibi.sdk.mvp.Presenter
    public void onInit(Bundle bundle) {
        super.onInit(bundle);
        if (bundle == null) {
            this.d = getArguments().getString(CommonConstants.KEY_PROCESS_ID);
            this.c = getArguments().getString(Constants.KEY_SIGN_DEDUCT_CHANNEL);
        } else {
            this.d = bundle.getString(CommonConstants.KEY_PROCESS_ID);
            this.c = bundle.getString(Constants.KEY_SIGN_DEDUCT_CHANNEL);
        }
        this.f1109b = g();
        i();
        if (bundle == null) {
            this.f1109b.d();
        }
    }

    @Override // com.mibi.sdk.mvp.Presenter
    public void onSave(Bundle bundle) {
        super.onSave(bundle);
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.d);
        bundle.putString(Constants.KEY_SIGN_DEDUCT_CHANNEL, this.c);
    }
}
