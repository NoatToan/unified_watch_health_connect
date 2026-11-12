package com.mibi.sdk.partner.task;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.component.recharge.RechargeManager;
import com.mibi.sdk.component.recharge.RechargeType;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePartnerTask;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class RxGetPartnerRechargeTypeTask extends RxBasePartnerTask<Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10186a;

    public static class Result implements Serializable {
        public String mDirectPayDiscount;
        public RechargeType mLastChargeType;
        public boolean mShowAll;
        public ArrayList<RechargeType> mRechargeTypes = new ArrayList<>();
        public HashMap<String, RechargeType> mRechargeMethodTypeMap = new HashMap<>();
    }

    public RxGetPartnerRechargeTypeTask(Context context, Session session, String str) {
        super(context, session, Result.class);
        this.f10186a = str;
    }

    public final void a(JSONObject jSONObject, Result result) throws JSONException, ResultException {
        result.mShowAll = jSONObject.optBoolean(Constants.KEY_RECHARGE_SHOW_ALL, false);
        result.mDirectPayDiscount = jSONObject.optString(Constants.KEY_PAY_DIRECT_PAY_DISCOUNT);
        String strOptString = jSONObject.optString(Constants.KEY_PAY_LAST_CPT, "");
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
                    result.mRechargeMethodTypeMap.put(string, rechargeType);
                }
            }
            if (TextUtils.equals(strOptString, rechargeType.mType)) {
                result.mLastChargeType = rechargeType;
            }
            rechargeType.mType = jSONObject2.getString("type");
            rechargeType.mIcon = jSONObject2.getString(Constants.KEY_RECHARGE_ICON_URL);
            rechargeType.mTitle = jSONObject2.getString("title");
            rechargeType.mTitleHint = jSONObject2.getString(Constants.KEY_RECHARGE_TITLE_HINT);
            rechargeType.mFavorite = jSONObject2.optBoolean(Constants.KEY_RECHARGE_IS_FAVORITE, false);
            rechargeType.mCurrencyUnit = jSONObject2.getString(Constants.KEY_RECHARGE_CURRENCY_UNIT);
            result.mRechargeTypes.add(rechargeType);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, Result result) throws PaymentException {
        try {
            a(jSONObject, result);
        } catch (Exception e) {
            throw new ResultException(e);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        Connection connectionCreatePartnerConnection = ConnectionFactory.createPartnerConnection(getSession(), getPartnerUserId(this.f10186a), CommonConstants.getUrl("p/partner/chargesV1"));
        connectionCreatePartnerConnection.getParameter().addAll(sortedParameter);
        addPartnerParams(connectionCreatePartnerConnection, this.f10186a);
        connectionCreatePartnerConnection.setUseGet(true);
        return connectionCreatePartnerConnection;
    }
}
