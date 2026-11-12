package com.mibi.sdk.pay.task;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.Utils;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.DiscountGiftCard;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class RxStartAccountPaymentTask extends RxBasePaymentTask<Result> {
    private static final String URL_THD_CHECK_PAYMENT = "p/checkPayment";

    public static class Result implements Serializable {
        public static final int COMMON_PAY = 0;
        public static final int DEDUCT_PAY = 1;
        public long mBalance;
        public ArrayList<DiscountGiftCard> mDiscountGiftCards;
        public long mGiftcardValue;
        public String mMerchantName;
        public int mOrderConsumedDiscountGiftcardId;
        public long mOrderPrice;
        public String mOrderTitle;
        public String mPartnerGiftcardName;
        public long mPartnerGiftcardValue;
        public int mPayMode;
        public String mResult;
        public int mResultErrorCode;
        public String mResultErrorDesc;
        public String mServerMarketType;
        public String mTradeId;
        public boolean mUseGiftcard;
        public boolean mUsePartnerGiftcard;

        public long getTotalBalance() {
            long j = this.mBalance;
            if (this.mUseGiftcard) {
                j += this.mGiftcardValue;
            }
            return this.mUsePartnerGiftcard ? j + this.mPartnerGiftcardValue : j;
        }
    }

    public RxStartAccountPaymentTask(Context context, Session session) {
        super(context, session, Result.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        String string2 = sortedParameter.getString("order");
        Connection connectionCreateAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl(URL_THD_CHECK_PAYMENT), this.mSession);
        SortedParameter parameter = connectionCreateAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add("order", string2);
        return connectionCreateAccountConnection;
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
            long j = jSONObject.getLong("balance");
            long j2 = jSONObject.getLong("giftcardValue");
            long j3 = jSONObject.getLong(Constants.KEY_PARTNER_GIFTCARD_VALUE);
            boolean zOptBoolean = jSONObject.optBoolean(Constants.KEY_USE_GIFTCARD, true);
            boolean zOptBoolean2 = jSONObject.optBoolean(Constants.KEY_USE_PARTNER_GIFTCARD, true);
            String string = jSONObject.getString(Constants.KEY_PARTNER_GIFTCARD_NAME);
            String string2 = jSONObject.getString("title");
            long j4 = jSONObject.getLong(Constants.KEY_PRICE);
            String string3 = jSONObject.getString("marketType");
            String str = "giftcardValue";
            String string4 = jSONObject.getString(Constants.KEY_TRADE_ID);
            int iOptInt = jSONObject.optInt(Constants.KEY_PAY_MODE, 0);
            String strOptString = jSONObject.optString("merchantName");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Constants.KEY_DISCOUNT_GIFT_CARDS);
            int iOptInt2 = jSONObject.optInt(Constants.KEY_ORDER_CONSUMED_DISCOUNT_GIFT_CARD_ID, 0);
            if (!Utils.checkStrings(string2, string3, string4)) {
                throw new ResultException("result has error");
            }
            result.mBalance = j;
            result.mGiftcardValue = j2;
            result.mPartnerGiftcardValue = j3;
            result.mUseGiftcard = zOptBoolean;
            result.mUsePartnerGiftcard = zOptBoolean2;
            result.mPartnerGiftcardName = string;
            result.mOrderTitle = string2;
            result.mOrderPrice = j4;
            result.mServerMarketType = string3;
            result.mTradeId = string4;
            result.mPayMode = iOptInt;
            result.mMerchantName = strOptString;
            result.mOrderConsumedDiscountGiftcardId = iOptInt2;
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            result.mDiscountGiftCards = new ArrayList<>();
            int i = 0;
            while (i < length) {
                DiscountGiftCard discountGiftCard = new DiscountGiftCard();
                JSONArray jSONArray = jSONArrayOptJSONArray;
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    discountGiftCard.mGiftCardId = jSONObject2.getLong(Constants.KEY_DISCOUNT_GIFT_CARD_ID);
                    String str2 = str;
                    discountGiftCard.mGiftCardValue = jSONObject2.getLong(str2);
                    discountGiftCard.mOrderFeeRequiredValue = jSONObject2.getLong(Constants.KEY_DISCOUNT_GIFT_CARD_REQUIRED_VALUE);
                    result.mDiscountGiftCards.add(discountGiftCard);
                    i++;
                    jSONArrayOptJSONArray = jSONArray;
                    str = str2;
                } catch (JSONException e) {
                    throw new ResultException(e);
                }
            }
        } catch (JSONException e2) {
            throw new ResultException(e2);
        }
    }
}
