package com.mibi.sdk.pay.task;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.account.loader.FakeAccountLoader;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.recharge.EntryData;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBaseQueryTask;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class RxQueryAndPayTask extends RxBaseQueryTask<Result> {
    private static final String URL_NO_ACCOUNT_PAY_RESULT = "/p/na/recharge/result";
    private static final String URL_RECHARGE_RESULT = "p/recharge/result";

    public static class Result extends RxBaseQueryTask.Result implements Serializable {
        public EntryData mEntryData;
        public String mImageUrl;
        public long mPayFee;
        public int mPayStatus;
        public Bundle mResult;
    }

    public RxQueryAndPayTask(Context context, Session session) {
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
        if (!(this.mSession.getAccountLoader() instanceof FakeAccountLoader)) {
            Connection connectionCreateAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl(URL_RECHARGE_RESULT), this.mSession);
            connectionCreateAccountConnection.getParameter().add(CommonConstants.KEY_PROCESS_ID, string);
            return connectionCreateAccountConnection;
        }
        Connection connectionCreateNoAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, CommonConstants.getUrl(URL_NO_ACCOUNT_PAY_RESULT));
        connectionCreateNoAccountConnection.getParameter().add(CommonConstants.KEY_PROCESS_ID, string);
        return connectionCreateNoAccountConnection;
    }

    @Override // com.mibi.sdk.task.RxBaseQueryTask, com.mibi.sdk.task.RxBasePaymentTask
    public void parseResultInSuccess(JSONObject jSONObject, Result result) throws PaymentException {
        super.parseResultInSuccess(jSONObject, result);
        if (result.mRechargeSuccess) {
            try {
                int i = jSONObject.getInt(Constants.KEY_PAY_STATUS);
                result.mPayStatus = i;
                if (i == 200) {
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                        long j = jSONObject.getLong("payFee");
                        Bundle standardResult = getStandardResult(jSONObject2);
                        result.mResult = standardResult;
                        result.mPayFee = j;
                        if (TextUtils.isEmpty(standardResult.getString(Constants.KEY_PAY_RESULT_RET))) {
                            throw new ResultException("result has error");
                        }
                        if (result.mPayFee >= 0) {
                            result.mImageUrl = jSONObject.optString(Constants.KEY_BANNER_PIC_URL);
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("entry");
                            if (jSONObjectOptJSONObject != null) {
                                EntryData entryData = new EntryData();
                                entryData.parseEntryData(jSONObjectOptJSONObject);
                                result.mEntryData = entryData;
                                return;
                            }
                            return;
                        }
                        throw new ResultException("result has error");
                    } catch (JSONException e) {
                        throw new ResultException(e);
                    }
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("result");
                long jOptLong = jSONObject.optLong("payFee", -1L);
                if (jSONObjectOptJSONObject2 != null) {
                    result.mResult = getStandardResult(jSONObjectOptJSONObject2);
                }
                if (jOptLong >= 0) {
                    result.mPayFee = jOptLong;
                }
            } catch (JSONException e2) {
                throw new ResultException(e2);
            }
        }
    }
}
