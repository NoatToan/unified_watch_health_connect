package com.mibi.sdk.partner.task;

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
import com.mibi.sdk.task.RxBasePartnerTask;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class RxCheckPartnerPayOrderTask extends RxBasePartnerTask<Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10185a;

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

    public RxCheckPartnerPayOrderTask(Context context, Session session, String str) {
        super(context, session, Result.class);
        this.f10185a = str;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
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
            String string4 = jSONObject.getString(Constants.KEY_TRADE_ID);
            int iOptInt = jSONObject.optInt(Constants.KEY_PAY_MODE, 0);
            String strOptString = jSONObject.optString("merchantName");
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
        } catch (JSONException e) {
            throw new ResultException(e);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        Connection connectionCreatePartnerConnection = ConnectionFactory.createPartnerConnection(getSession(), getPartnerUserId(this.f10185a), CommonConstants.getUrl("p/partner/checkPayment"));
        connectionCreatePartnerConnection.getParameter().addAll(sortedParameter);
        addPartnerParams(connectionCreatePartnerConnection, this.f10185a);
        return connectionCreatePartnerConnection;
    }
}
