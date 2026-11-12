package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.partner.task.RxCheckPartnerPayOrderTask;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes.dex */
public class k2s extends Model {

    public class a extends RxBaseErrorHandleTaskListener<RxCheckPartnerPayOrderTask.Result> {
        public a(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(RxCheckPartnerPayOrderTask.Result result) {
            MibiLog.d("CheckPartnerOrderModel", "check order task success");
            k2s.this.getCallback().onSuccess(result);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d("CheckPartnerOrderModel", "check order failed code : " + i + " ; msg : " + str, th);
            k2s.this.getCallback().onFailed(i, str, th);
        }
    }

    public k2s(Session session) {
        super(session);
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback iResultCallback) {
        super.request(bundle, iResultCallback);
        String string = bundle.getString(CommonConstants.KEY_PROCESS_ID);
        String string2 = bundle.getString("order");
        RxCheckPartnerPayOrderTask rxCheckPartnerPayOrderTask = new RxCheckPartnerPayOrderTask(getContext(), getSession(), string);
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, string);
        sortedParameter.add("order", string2);
        rxCheckPartnerPayOrderTask.setParams(sortedParameter);
        n4h.a(rxCheckPartnerPayOrderTask).c(new a(getContext()));
    }
}
