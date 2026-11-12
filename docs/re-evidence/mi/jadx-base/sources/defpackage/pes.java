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
import com.mibi.sdk.task.AutoQuerier;
import com.mibi.sdk.task.DefaultAutoQueryCallback;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes5.dex */
public class pes extends BaseMvpPresenter<lns> implements yis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f30333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mns f30334b;
    public String c;
    public String d;
    public AutoQuerier e;
    public com.mibi.sdk.deduct.o.c f;
    public c g;
    public AutoQuerier.AutoQuerierCallback h;

    public class a extends DefaultAutoQueryCallback {
        public a() {
        }

        @Override // com.mibi.sdk.task.DefaultAutoQueryCallback, com.mibi.sdk.task.AutoQuerier.AutoQuerierCallback
        public void onComplete() {
            pes.this.b();
        }
    }

    public class b implements mns.a {
        public b() {
        }

        @Override // mns.a
        public void a(Bundle bundle) {
            MibiLog.d("DoDeductPresenter", "requestQueryResult");
            ((lns) pes.this.getView()).b(true);
            pes.this.b();
        }

        @Override // mns.a
        public void d(nes<Activity> nesVar) {
            ((lns) pes.this.getView()).d(nesVar);
        }

        public /* synthetic */ b(pes pesVar, a aVar) {
            this();
        }

        @Override // mns.a
        public void a(int i, String str) {
            MibiLog.d("DoDeductPresenter", "handleDeductError errorCode : " + i + "  ; errDesc : " + str);
            ((lns) pes.this.getView()).c(i, str, null);
        }
    }

    public class c extends RxBaseErrorHandleTaskListener<com.mibi.sdk.deduct.o.c.a> {
        public c(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(com.mibi.sdk.deduct.o.c.a aVar) {
            int i = aVar.f10146a;
            if (i == 0) {
                ((lns) pes.this.getView()).c(ErrorCodes.NO_DEDUCT_RECORD, pes.this.getContext().getResources().getString(com.mibi.sdk.deduct.a.f10134a), null);
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                if (pes.this.e == null) {
                    pes pesVar = pes.this;
                    pesVar.e = new AutoQuerier(pesVar.f30333a, pes.this.h);
                }
                if (pes.this.e.hasNext()) {
                    pes.this.e.query();
                    return;
                } else {
                    ((lns) pes.this.getView()).c(ErrorCodes.DEDUCT_FAILED, pes.this.getContext().getResources().getString(com.mibi.sdk.deduct.a.f10134a), null);
                    return;
                }
            }
            Bundle bundle = new Bundle();
            if (TextUtils.equals(pes.this.c, com.mibi.sdk.deduct.c.a.MIPAY.a())) {
                bundle.putString(Constants.KEY_DEDUCT_NAME, pes.this.getContext().getResources().getString(com.mibi.sdk.deduct.a.f10136k));
            } else if (TextUtils.equals(pes.this.c, com.mibi.sdk.deduct.c.a.ALIPAY.a())) {
                bundle.putString(Constants.KEY_DEDUCT_NAME, pes.this.getContext().getResources().getString(com.mibi.sdk.deduct.a.h));
            } else if (TextUtils.equals(pes.this.c, com.mibi.sdk.deduct.c.a.WXPAY.a())) {
                bundle.putString(Constants.KEY_DEDUCT_NAME, pes.this.getContext().getResources().getString(com.mibi.sdk.deduct.a.n));
            } else if (TextUtils.equals(pes.this.c, com.mibi.sdk.deduct.c.a.UNIONPAY.a())) {
                bundle.putString(Constants.KEY_DEDUCT_NAME, pes.this.getContext().getResources().getString(com.mibi.sdk.deduct.a.l));
            }
            bundle.putBoolean(Constants.KEY_IS_DEDUCT, true);
            ((lns) pes.this.getView()).c(ErrorCodes.DEDUCT_SUCCESS, "deduct success", bundle);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            ((lns) pes.this.getView()).c(i, str, null);
        }
    }

    public pes() {
        super(lns.class);
        this.f30333a = new int[]{0, 1, 2, 2};
        this.h = new a();
    }

    private void h() {
        int[] queryInterval = QueryIntervalUtils.getQueryInterval((String) getSession().getMemoryStorage().getSerializable(MibiSdkConstants.MIBI_EXTRA_PARAMS));
        if (queryInterval == null || queryInterval.length <= 0) {
            MibiLog.d("DoDeductPresenter", "interval is null");
        } else {
            this.f30333a = queryInterval;
        }
    }

    @Override // defpackage.yis
    public void a() {
        mns mnsVar;
        if (!getSession().getMemoryStorage().getBoolean(this.d, "deductStart", false) || (mnsVar = this.f30334b) == null) {
            return;
        }
        mnsVar.d();
    }

    public final mns f() {
        mns w0tVar;
        if (com.mibi.sdk.deduct.c.a.MIPAY.a().equals(this.c)) {
            w0tVar = new srs(getSession(), this.d);
        } else if (com.mibi.sdk.deduct.c.a.ALIPAY.a().equals(this.c)) {
            w0tVar = new z1s(getSession(), this.d);
        } else if (com.mibi.sdk.deduct.c.a.WXPAY.a().equals(this.c)) {
            w0tVar = new w4t(getSession(), this.d);
        } else {
            if (!com.mibi.sdk.deduct.c.a.UNIONPAY.a().equals(this.c)) {
                throw new IllegalStateException("mChannelName:" + this.c);
            }
            w0tVar = new w0t(getSession(), this.d);
        }
        addLifeCycleListener(w0tVar);
        w0tVar.b(new b(this, null));
        return w0tVar;
    }

    @Override // com.mibi.sdk.mvp.Presenter, com.mibi.sdk.mvp.IPresenter
    public void handleResult(int i, int i2, Bundle bundle) {
        super.handleResult(i, i2, bundle);
        MibiLog.d("DoDeductPresenter", "handleResult requestCode : " + i + " ; resultCode : " + i2);
    }

    @Override // com.mibi.sdk.component.BaseMvpPresenter, com.mibi.sdk.mvp.Presenter
    public void onInit(Bundle bundle) {
        super.onInit(bundle);
        if (bundle == null) {
            this.d = getArguments().getString(CommonConstants.KEY_PROCESS_ID);
        } else {
            this.d = bundle.getString(CommonConstants.KEY_PROCESS_ID);
        }
        this.c = getArguments().getString("deductChannel");
        this.f30334b = f();
        h();
        if (bundle == null) {
            this.f30334b.e();
        }
    }

    @Override // com.mibi.sdk.mvp.Presenter
    public void onSave(Bundle bundle) {
        super.onSave(bundle);
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.d);
        bundle.putString("deductChannel", this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f == null) {
            this.f = new com.mibi.sdk.deduct.o.c(getContext(), getSession());
            SortedParameter sortedParameter = new SortedParameter();
            sortedParameter.add(CommonConstants.KEY_PROCESS_ID, this.d);
            sortedParameter.add("deductChannel", this.c);
            this.f.setParams(sortedParameter);
            this.g = new c(getContext());
        }
        n4h.a(this.f).c(this.g);
    }
}
