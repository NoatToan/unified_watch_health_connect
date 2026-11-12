package com.mibi.sdk.pay.task;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class RxDoPayTask extends RxBasePaymentTask<Result> {
    private static final String URL_THD_DO_PAY = "p/doPay";

    public static class Result {
        public Bundle mResult;
    }

    public RxDoPayTask(Context context, Session session) {
        super(context, session, Result.class);
    }

    private Bundle getStandardResult(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            if (jSONObject.has(Constants.KEY_PAY_RESULT_RET)) {
                bundle.putString(Constants.KEY_PAY_RESULT_RET, jSONObject.optString(Constants.KEY_PAY_RESULT_RET));
            }
            if (jSONObject.has(Constants.KEY_PAY_RESULT_SENDERSIGN)) {
                bundle.putString(Constants.KEY_PAY_RESULT_SENDERSIGN, jSONObject.optString(Constants.KEY_PAY_RESULT_SENDERSIGN));
            }
        }
        return bundle;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        boolean z = sortedParameter.getBoolean(Constants.KEY_USE_GIFTCARD);
        boolean z2 = sortedParameter.getBoolean(Constants.KEY_USE_PARTNER_GIFTCARD);
        long j = sortedParameter.getLong(Constants.KEY_USE_DISCOUNT_GIFT_CARD_ID, 0L);
        Connection connectionCreateAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl(URL_THD_DO_PAY), this.mSession);
        SortedParameter parameter = connectionCreateAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add(Constants.KEY_USE_GIFTCARD, Boolean.valueOf(z));
        parameter.add(Constants.KEY_USE_PARTNER_GIFTCARD, Boolean.valueOf(z2));
        parameter.add(Constants.KEY_USE_DISCOUNT_GIFT_CARD_ID, Long.valueOf(j));
        return connectionCreateAccountConnection;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public void parseResultInCommon(JSONObject jSONObject, Result result) throws PaymentException {
        super.parseResultInCommon(jSONObject, result);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
        if (jSONObjectOptJSONObject != null) {
            result.mResult = getStandardResult(jSONObjectOptJSONObject);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public boolean parseResultInError(JSONObject jSONObject, Result result) throws PaymentException {
        super.parseResultInError(jSONObject, result);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
        if (jSONObjectOptJSONObject == null) {
            return false;
        }
        result.mResult = getStandardResult(jSONObjectOptJSONObject);
        return false;
    }
}
