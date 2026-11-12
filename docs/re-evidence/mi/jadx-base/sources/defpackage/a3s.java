package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.pay.task.RxAccountGetRechargeTypeTask;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes5.dex */
public class a3s extends Model<RxAccountGetRechargeTypeTask.Result> {

    public class b extends RxBaseErrorHandleTaskListener<RxAccountGetRechargeTypeTask.Result> {
        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(RxAccountGetRechargeTypeTask.Result result) {
            super.handleSuccess(result);
            a3s.this.getCallback().onSuccess(result);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            super.handleError(i, str, th);
            a3s.this.getCallback().onFailed(i, str, th);
        }

        public b(Context context) {
            super(context);
        }
    }

    public a3s(Session session) {
        super(session);
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<RxAccountGetRechargeTypeTask.Result> iResultCallback) {
        super.request(bundle, iResultCallback);
        SortedParameter sortedParameter = (SortedParameter) bundle.getSerializable(Constants.KEY_SORTED_PARAMETERS);
        RxAccountGetRechargeTypeTask rxAccountGetRechargeTypeTask = new RxAccountGetRechargeTypeTask(getContext(), getSession());
        rxAccountGetRechargeTypeTask.setParams(sortedParameter);
        n4h.a(rxAccountGetRechargeTypeTask).c(new b(getContext()));
    }
}
