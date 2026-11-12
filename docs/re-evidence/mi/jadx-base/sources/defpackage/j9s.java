package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.recharge.RechargeManager;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.partner.task.RxGetPartnerRechargeTypeTask;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;

/* JADX INFO: loaded from: classes.dex */
public class j9s extends Model {

    public class a extends RxBaseErrorHandleTaskListener<RxGetPartnerRechargeTypeTask.Result> {
        public a(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(RxGetPartnerRechargeTypeTask.Result result) {
            MibiLog.d("CheckPartnerOrderModel", "check order task success");
            j9s.this.getCallback().onSuccess(result);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d("CheckPartnerOrderModel", "check order failed code : " + i + " ; msg : " + str, th);
            j9s.this.getCallback().onFailed(i, str, th);
        }
    }

    public j9s(Session session) {
        super(session);
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback iResultCallback) {
        super.request(bundle, iResultCallback);
        String string = bundle.getString(CommonConstants.KEY_PROCESS_ID);
        long j = bundle.getLong(Constants.KEY_CHARGE_FEE);
        RxGetPartnerRechargeTypeTask rxGetPartnerRechargeTypeTask = new RxGetPartnerRechargeTypeTask(getContext(), getSession(), string);
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, string);
        if (j > 0) {
            sortedParameter.add(Constants.KEY_CHARGE_FEE, Long.valueOf(j));
        }
        sortedParameter.add(Constants.KEY_RECHARGE_CHANNELS, RechargeManager.get().getChannels(getContext()));
        rxGetPartnerRechargeTypeTask.setParams(sortedParameter);
        n4h.a(rxGetPartnerRechargeTypeTask).c(new a(getContext()));
    }
}
