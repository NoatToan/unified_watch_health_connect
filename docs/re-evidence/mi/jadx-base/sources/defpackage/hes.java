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
import com.mibi.sdk.task.AutoQuerier;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes.dex */
public class hes extends Model<Bundle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f19996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AutoQuerier f19997b;
    public String c;
    public long d;
    public boolean e;
    public AutoQuerier.AutoQuerierCallback f;

    public class a implements AutoQuerier.AutoQuerierCallback {
        public a() {
        }

        @Override // com.mibi.sdk.task.AutoQuerier.AutoQuerierCallback
        public void onComplete() {
        }

        @Override // com.mibi.sdk.task.AutoQuerier.AutoQuerierCallback
        public void onProgressUpdate(long j) {
            MibiLog.d("PartnerQueryModel", "current count down time:" + j);
            hes.this.a();
        }

        @Override // com.mibi.sdk.task.AutoQuerier.AutoQuerierCallback
        public void onStart() {
        }
    }

    public class b extends RxBaseErrorHandleTaskListener<a.a.a.a.e.b.a> {
        public /* synthetic */ b(hes hesVar, Context context, a aVar) {
            this(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(a.a.a.a.e.b.a aVar) {
            if (TextUtils.equals(aVar.mChargeStatus, CommonConstants.Mgc.TRADE_SUCCESS)) {
                hes.this.l(aVar);
                return;
            }
            if (TextUtils.equals(aVar.mChargeStatus, CommonConstants.Mgc.WAIT_BUYER_PAY)) {
                hes.this.n();
            } else if (TextUtils.equals(aVar.mChargeStatus, CommonConstants.Mgc.TRADE_CLOSED)) {
                hes.this.k();
            } else if (TextUtils.equals(aVar.mChargeStatus, CommonConstants.Mgc.TRADE_FAIL)) {
                hes.this.h(aVar);
            }
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d("PartnerQueryModel", "query failed code : " + i + " ; msg : " + str, th);
            hes.this.b(i, str, null);
        }

        public b(Context context) {
            super(context);
        }
    }

    public hes(Session session, boolean z) {
        super(session);
        this.f19996a = new int[]{0, 1, 1, 2, 3};
        this.f = new a();
        this.e = z;
    }

    public final void a() {
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, this.c);
        sortedParameter.add(Constants.KEY_RECHARGE_MIBI, Long.valueOf(this.d));
        a.a.a.a.e.b bVar = new a.a.a.a.e.b(getContext(), getSession(), this.c, this.e);
        bVar.setParams(sortedParameter);
        n4h.a(bVar).c(new b(this, getContext(), null));
    }

    public final void b(int i, String str, a.a.a.a.e.b.a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("payment_error", i);
        bundle.putString(Constants.KEY_ERROR_DES, str);
        if (aVar == null || !aVar.mRechargeSuccess) {
            bundle.putInt("resultCode", 1001);
        } else {
            bundle.putInt("resultCode", 1003);
        }
        getCallback().onFailed(i, str, new QueryPaymentException(bundle));
    }

    public final void c(a.a.a.a.e.b.a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("status", 1);
        bundle.putString(Constants.KEY_BANNER_PIC_URL, aVar.d);
        bundle.putSerializable(Constants.KEY_PAY_SUCCESS_BANNER_DATA, aVar.e);
        bundle.putInt("resultCode", 1004);
        getCallback().onSuccess(aVar.f454b);
    }

    public final void g() {
        Bundle bundle = new Bundle();
        bundle.putInt("status", 3);
        bundle.putString("result", "");
        bundle.putInt("resultCode", 1002);
        getCallback().onFailed(0, "time out", new QueryPaymentException(bundle));
    }

    public final void h(a.a.a.a.e.b.a aVar) {
        b(1, aVar.mErrorDesc, aVar);
    }

    public final void k() {
        g();
    }

    public final void l(a.a.a.a.e.b.a aVar) {
        if (!this.e) {
            c(aVar);
            return;
        }
        int i = aVar.f453a;
        if (i == 200) {
            c(aVar);
        } else {
            b(i, "trade failed", aVar);
        }
    }

    public final void n() {
        if (this.f19997b.hasNext()) {
            this.f19997b.query();
        } else {
            g();
        }
    }

    public final void o() {
        int[] queryInterval = QueryIntervalUtils.getQueryInterval((String) getSession().getMemoryStorage().getSerializable(MibiSdkConstants.MIBI_EXTRA_PARAMS));
        if (queryInterval == null || queryInterval.length <= 0) {
            MibiLog.d("PartnerQueryModel", "interval is null");
        } else {
            this.f19996a = queryInterval;
        }
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<Bundle> iResultCallback) {
        super.request(bundle, iResultCallback);
        this.c = bundle.getString(CommonConstants.KEY_PROCESS_ID);
        this.d = getSession().getMemoryStorage().getLong(this.c, Constants.KEY_ORDER_FEE);
        o();
        AutoQuerier autoQuerier = new AutoQuerier(this.f19996a, this.f);
        this.f19997b = autoQuerier;
        autoQuerier.query();
    }
}
