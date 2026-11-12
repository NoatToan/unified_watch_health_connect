package com.mibi.sdk.model.auth;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class RxCheckAuthTask extends RxBasePaymentTask<Result> {
    private static final String URL_THD_CHECK_AUTH = "p/checkAuth";

    public static class Result implements Serializable {
        public long mBalance;
        public String mBindPhoneUrl;
        public int mErrorCode;
        public String mErrorDesc;
        public long mGiftcardValue;
        public long mPartnerGiftcardValue;
        public String mPhoneNum;
        public boolean mUseGiftcard;
        public boolean mUsePartnerGiftcard;
    }

    public RxCheckAuthTask(Context context, Session session) {
        super(context, session, Result.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        String string2 = sortedParameter.getString("fullAuth");
        String string3 = sortedParameter.getString("smsCode");
        Connection connectionCreateAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl(URL_THD_CHECK_AUTH), this.mSession);
        SortedParameter parameter = connectionCreateAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        if (!TextUtils.isEmpty(string2)) {
            parameter.add("fullAuth", string2);
        }
        if (!TextUtils.isEmpty(string3)) {
            parameter.add("smsCode", string3);
        }
        return connectionCreateAccountConnection;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public void parseResultInCommon(JSONObject jSONObject, Result result) throws PaymentException {
        super.parseResultInCommon(jSONObject, result);
        long jOptLong = jSONObject.optLong("balance", -1L);
        long jOptLong2 = jSONObject.optLong("giftcardValue", -1L);
        boolean zOptBoolean = jSONObject.optBoolean(Constants.KEY_USE_GIFTCARD, true);
        long jOptLong3 = jSONObject.optLong(Constants.KEY_PARTNER_GIFTCARD_VALUE, -1L);
        boolean zOptBoolean2 = jSONObject.optBoolean(Constants.KEY_USE_PARTNER_GIFTCARD, true);
        result.mBalance = jOptLong;
        result.mGiftcardValue = jOptLong2;
        result.mUseGiftcard = zOptBoolean;
        result.mPartnerGiftcardValue = jOptLong3;
        result.mUsePartnerGiftcard = zOptBoolean2;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public boolean parseResultInError(JSONObject jSONObject, Result result) throws PaymentException {
        int i = result.mErrorCode;
        if (i == 7002) {
            result.mBindPhoneUrl = jSONObject.optString("bindPhoneUrl");
            return false;
        }
        if (i != 7001) {
            return false;
        }
        try {
            result.mPhoneNum = jSONObject.getString(Constants.KEY_PHONE_WITH_MASK);
            return false;
        } catch (JSONException e) {
            throw new ResultException(e);
        }
    }
}
