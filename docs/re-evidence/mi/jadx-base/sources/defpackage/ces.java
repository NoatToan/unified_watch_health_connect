package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.MibiSdkConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.pay.task.RxStartNoAccountPaymentTask;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import com.mibi.sdk.task.handler.ServerErrorCodeExceptionHandler;

/* JADX INFO: loaded from: classes5.dex */
public class ces extends Model<Bundle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5261a;

    public class a extends ServerErrorCodeExceptionHandler {
        public a(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.handler.ServerErrorCodeExceptionHandler
        public boolean handleServerErrorCodeError(int i, String str, Object obj) {
            int i2;
            if (i == 1986) {
                i2 = 7;
            } else {
                if (i != 1991) {
                    return false;
                }
                i2 = 13;
            }
            RxStartNoAccountPaymentTask.Result result = (RxStartNoAccountPaymentTask.Result) obj;
            if (result.mResult != null) {
                new Bundle().putString(MibiSdkConstants.PAYMENT_KEY_PAYMENT_RESULT, result.mResult);
            }
            ces.this.getCallback().onFailed(i2, str, null);
            return true;
        }
    }

    public class b extends RxBaseErrorHandleTaskListener<RxStartNoAccountPaymentTask.Result> {
        public /* synthetic */ b(ces cesVar, Context context, a aVar) {
            this(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(RxStartNoAccountPaymentTask.Result result) {
            if (result.mResult == null) {
                ces.this.c(result);
            } else {
                MibiLog.d("NoAccountCheckModel", "error,result is not null");
                ces.this.getCallback().onFailed(result.mResultErrorCode, result.mResultErrorDesc, null);
            }
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            ces.this.getCallback().onFailed(i, str, th);
        }

        public b(Context context) {
            super(context);
        }
    }

    public ces(Session session) {
        super(session);
    }

    public final void c(RxStartNoAccountPaymentTask.Result result) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.KEY_RECHARGE_TYPES, result.mRechargeTypes);
        bundle.putString(CommonConstants.KEY_PROCESS_ID, this.f5261a);
        bundle.putLong(Constants.KEY_ORDER_FEE, result.mOrderFee);
        bundle.putLong(Constants.KEY_RECHARGE_VALUE, result.mOrderFee);
        bundle.putString("orderDesc", result.mOrderDesc);
        getSession().getMemoryStorage().put(this.f5261a, Constants.KEY_ORDER_FEE, Long.valueOf(result.mOrderFee));
        getCallback().onSuccess(bundle);
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<Bundle> iResultCallback) {
        super.request(bundle, iResultCallback);
        SortedParameter sortedParameter = (SortedParameter) bundle.getSerializable(Constants.KEY_SORTED_PARAMETERS);
        if (sortedParameter == null || iResultCallback == null) {
            throw new IllegalStateException();
        }
        this.f5261a = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        RxStartNoAccountPaymentTask rxStartNoAccountPaymentTask = new RxStartNoAccountPaymentTask(getContext(), getSession());
        rxStartNoAccountPaymentTask.setParams(sortedParameter);
        b bVar = new b(this, getContext(), null);
        bVar.getDispatcher().register(new a(getContext()));
        n4h.a(rxStartNoAccountPaymentTask).c(bVar);
    }
}
