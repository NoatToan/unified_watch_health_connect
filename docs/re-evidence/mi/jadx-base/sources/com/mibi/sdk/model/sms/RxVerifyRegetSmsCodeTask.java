package com.mibi.sdk.model.sms;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;

/* JADX INFO: loaded from: classes5.dex */
public class RxVerifyRegetSmsCodeTask extends RxBasePaymentTask<Result> {
    private static final String URL_THD_GET_SMS_CODE = "p/sendSmsCode";

    public static class Result {
    }

    public RxVerifyRegetSmsCodeTask(Context context, Session session) {
        super(context, session, Result.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        Connection connectionCreateAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl(URL_THD_GET_SMS_CODE), this.mSession);
        connectionCreateAccountConnection.getParameter().add(CommonConstants.KEY_PROCESS_ID, string);
        return connectionCreateAccountConnection;
    }
}
