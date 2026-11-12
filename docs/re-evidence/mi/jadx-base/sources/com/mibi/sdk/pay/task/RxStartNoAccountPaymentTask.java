package com.mibi.sdk.pay.task;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.component.recharge.RechargeManager;
import com.mibi.sdk.component.recharge.RechargeType;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class RxStartNoAccountPaymentTask extends RxBasePaymentTask<Result> {
    private static final String TAG = "RxNoAccountPaymentTask";
    private static final String URL_CREAT_NO_ACCOUNT_TRADE = "/p/na/createNaTrade";
    private String mOrder;

    public static class Result implements Serializable {
        public String mOrderDesc;
        public long mOrderFee;
        public ArrayList<RechargeType> mRechargeTypes = new ArrayList<>();
        public String mResult;
        public int mResultErrorCode;
        public String mResultErrorDesc;
        public String mTradeId;
    }

    public RxStartNoAccountPaymentTask(Context context, Session session) {
        super(context, session, Result.class);
    }

    private void parseOrder(String str, Result result) throws ResultException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("orderDesc");
            long j = jSONObject.getLong(Constants.KEY_ORDER_FEE);
            String string2 = jSONObject.getString("orderId");
            result.mOrderDesc = string;
            result.mOrderFee = j;
            result.mTradeId = string2;
        } catch (JSONException e) {
            MibiLog.d(TAG, "noAccount order content error!");
            throw new ResultException(e);
        }
    }

    private void parseRechargeItemsData(JSONObject jSONObject, Result result) throws JSONException, ResultException {
        JSONArray jSONArray = jSONObject.getJSONArray(Constants.KEY_RECHARGE_TOTAL);
        if (jSONArray.length() <= 0) {
            throw new ResultException("recharge methods should not be empty");
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            RechargeType rechargeType = new RechargeType();
            JSONArray jSONArray2 = jSONObject2.getJSONArray("data");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                String string = jSONObject3.getString("channel");
                Recharge recharge = RechargeManager.get().getRecharge(string);
                if (recharge != null) {
                    rechargeType.mRechargeMethods.add(recharge.getParser().parse(string, jSONObject3));
                }
            }
            rechargeType.mType = jSONObject2.getString("type");
            rechargeType.mIcon = jSONObject2.getString(Constants.KEY_RECHARGE_ICON_URL);
            rechargeType.mTitle = jSONObject2.getString("title");
            rechargeType.mTitleHint = jSONObject2.optString(Constants.KEY_RECHARGE_TITLE_HINT);
            rechargeType.mFavorite = jSONObject2.optBoolean(Constants.KEY_RECHARGE_IS_FAVORITE, false);
            rechargeType.mCurrencyUnit = jSONObject2.getString(Constants.KEY_RECHARGE_CURRENCY_UNIT);
            result.mRechargeTypes.add(rechargeType);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        String string2 = sortedParameter.getString(Constants.KEY_RECHARGE_CHANNELS);
        this.mOrder = sortedParameter.getString("order");
        Connection connectionCreateNoAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, CommonConstants.getUrl(URL_CREAT_NO_ACCOUNT_TRADE));
        SortedParameter parameter = connectionCreateNoAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add(Constants.KEY_RECHARGE_CHANNELS, string2);
        parameter.add("order", this.mOrder);
        connectionCreateNoAccountConnection.setUseGet(false);
        return connectionCreateNoAccountConnection;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public boolean parseResultInError(JSONObject jSONObject, Result result) throws PaymentException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
        if (jSONObjectOptJSONObject == null) {
            return false;
        }
        result.mResult = jSONObjectOptJSONObject.toString();
        try {
            result.mResultErrorCode = jSONObject.getInt(CommonConstants.KEY_ERR_CODE);
            result.mResultErrorDesc = jSONObject.optString("errDesc");
            return true;
        } catch (JSONException e) {
            throw new ResultException("error code not exists", e);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public void parseResultInSuccess(JSONObject jSONObject, Result result) throws PaymentException {
        try {
            parseRechargeItemsData(jSONObject, result);
            parseOrder(this.mOrder, result);
        } catch (JSONException e) {
            throw new ResultException(e);
        }
    }
}
