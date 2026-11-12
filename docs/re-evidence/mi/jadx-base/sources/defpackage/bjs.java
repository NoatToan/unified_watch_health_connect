package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.MibiSdkConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.QueryPaymentException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.common.utils.QueryIntervalUtils;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.pay.task.RxQueryAndPayTask;
import com.mibi.sdk.task.AutoQuerier;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes5.dex */
public class bjs extends Model<Bundle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f4294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AutoQuerier f4295b;
    public String c;
    public long d;
    public AutoQuerier.AutoQuerierCallback e;

    public class a implements AutoQuerier.AutoQuerierCallback {
        public a() {
        }

        @Override // com.mibi.sdk.task.AutoQuerier.AutoQuerierCallback
        public void onComplete() {
        }

        @Override // com.mibi.sdk.task.AutoQuerier.AutoQuerierCallback
        public void onProgressUpdate(long j) {
            MibiLog.d("QueryModel", "current count down time:" + j);
            bjs.this.a();
        }

        @Override // com.mibi.sdk.task.AutoQuerier.AutoQuerierCallback
        public void onStart() {
        }
    }

    public class b extends RxBaseErrorHandleTaskListener<RxQueryAndPayTask.Result> {
        public /* synthetic */ b(bjs bjsVar, Context context, a aVar) {
            this(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(RxQueryAndPayTask.Result result) {
            if (TextUtils.equals(result.mChargeStatus, CommonConstants.Mgc.TRADE_SUCCESS)) {
                bjs.this.l(result);
                return;
            }
            if (TextUtils.equals(result.mChargeStatus, CommonConstants.Mgc.WAIT_BUYER_PAY)) {
                bjs.this.n();
            } else if (TextUtils.equals(result.mChargeStatus, CommonConstants.Mgc.TRADE_CLOSED)) {
                bjs.this.k();
            } else if (TextUtils.equals(result.mChargeStatus, CommonConstants.Mgc.TRADE_FAIL)) {
                bjs.this.h(result);
            }
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            bjs.this.b(i, str, null);
        }

        public b(Context context) {
            super(context);
        }
    }

    public bjs(Session session) {
        super(session);
        this.f4294a = new int[]{0, 1, 1, 2, 3, 5, 7, 10};
        this.e = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, this.c);
        sortedParameter.add(Constants.KEY_RECHARGE_MIBI, Long.valueOf(this.d));
        RxQueryAndPayTask rxQueryAndPayTask = new RxQueryAndPayTask(getContext(), getSession());
        rxQueryAndPayTask.setParams(sortedParameter);
        n4h.a(rxQueryAndPayTask).c(new b(this, getContext(), null));
    }

    private void g() {
        Bundle bundle = new Bundle();
        bundle.putInt("status", 3);
        bundle.putString("result", "");
        bundle.putInt("resultCode", 1002);
        getCallback().onFailed(0, "time out", new QueryPaymentException(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.f4295b.hasNext()) {
            this.f4295b.query();
        } else {
            g();
        }
    }

    private void o() {
        int[] queryInterval = QueryIntervalUtils.getQueryInterval((String) getSession().getMemoryStorage().getSerializable(MibiSdkConstants.MIBI_EXTRA_PARAMS));
        if (queryInterval == null || queryInterval.length <= 0) {
            MibiLog.d("QueryModel", "interval is null");
        } else {
            this.f4294a = queryInterval;
        }
    }

    public final void b(int i, String str, RxQueryAndPayTask.Result result) {
        Bundle bundle = new Bundle();
        bundle.putInt("payment_error", i);
        bundle.putString(Constants.KEY_ERROR_DES, str);
        if (result == null || !result.mRechargeSuccess) {
            bundle.putInt("resultCode", 1001);
        } else {
            bundle.putInt("resultCode", 1003);
        }
        getCallback().onFailed(i, str, new QueryPaymentException(bundle));
    }

    public final void c(RxQueryAndPayTask.Result result) {
        Bundle bundle = new Bundle();
        bundle.putInt("status", 1);
        bundle.putString(Constants.KEY_BANNER_PIC_URL, result.mImageUrl);
        bundle.putSerializable(Constants.KEY_PAY_SUCCESS_BANNER_DATA, result.mEntryData);
        bundle.putInt("resultCode", 1004);
        getCallback().onSuccess(result.mResult);
    }

    public final void h(RxQueryAndPayTask.Result result) {
        b(1, result.mErrorDesc, result);
    }

    public final void l(RxQueryAndPayTask.Result result) {
        int i = result.mPayStatus;
        if (i == 200) {
            c(result);
        } else {
            b(i, "trade failed", result);
        }
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<Bundle> iResultCallback) {
        super.request(bundle, iResultCallback);
        this.c = bundle.getString(CommonConstants.KEY_PROCESS_ID);
        this.d = getSession().getMemoryStorage().getLong(this.c, Constants.KEY_ORDER_FEE);
        o();
        AutoQuerier autoQuerier = new AutoQuerier(this.f4294a, this.e);
        this.f4295b = autoQuerier;
        autoQuerier.query();
    }
}
