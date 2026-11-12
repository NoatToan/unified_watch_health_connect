package com.mibi.sdk.model.domain;

import android.content.Context;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ServiceTokenExpiredException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.model.Constants;
import com.mibi.sdk.network.DomainManager;
import com.mibi.sdk.task.RxTask;

/* JADX INFO: loaded from: classes5.dex */
public class RxUpdateDomainTask extends RxTask<Result> {
    private static final String TAG = "RxUpdateDomainTask";
    private Context mContext;
    private SortedParameter mParams;
    private Session mSession;

    public static class Result {
    }

    public RxUpdateDomainTask(Context context, Session session) {
        super(Result.class);
        this.mContext = context;
        this.mSession = session;
    }

    private void updateDomain(SortedParameter sortedParameter) throws PaymentException {
        DomainManager.updateDomainByOrder(this.mSession, sortedParameter.getString(Constants.KEY_PAY_ORDER), sortedParameter.getString(Constants.KEY_PAY_ORDER_QR_URL));
    }

    public void setParams(SortedParameter sortedParameter) {
        if (sortedParameter == null) {
            sortedParameter = new SortedParameter();
        }
        this.mParams = sortedParameter;
    }

    @Override // com.mibi.sdk.task.RxTask
    public void doLoad(Result result) throws PaymentException {
        this.mSession.load(this.mContext);
        try {
            updateDomain(this.mParams);
        } catch (ServiceTokenExpiredException unused) {
            MibiLog.d(TAG, "updateDomain service token expired, re-login");
            this.mSession.reload(this.mContext);
            updateDomain(this.mParams);
        }
    }
}
