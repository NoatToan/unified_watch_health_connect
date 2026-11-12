package com.mibi.sdk.deduct.o;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.account.loader.FakeAccountLoader;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.component.recharge.RechargeType;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class d extends RxBasePaymentTask<a> {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<RechargeType> f10148a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HashMap<String, RechargeType> f10149b = new HashMap<>();
    }

    public d(Context context, Session session) {
        super(context, session, a.class);
    }

    public final void a(JSONObject jSONObject, a aVar) throws JSONException, ResultException {
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
                jSONObject3.getString("title");
                Recharge rechargeA = com.mibi.sdk.deduct.c.b().a(string);
                if (rechargeA != null) {
                    rechargeType.mRechargeMethods.add(rechargeA.getParser().parse(string, jSONObject3));
                    aVar.f10149b.put(string, rechargeType);
                }
            }
            rechargeType.mType = jSONObject2.getString("type");
            rechargeType.mIcon = jSONObject2.getString(Constants.KEY_RECHARGE_ICON_URL);
            rechargeType.mTitle = jSONObject2.getString("title");
            rechargeType.mTitleHint = jSONObject2.optString(Constants.KEY_RECHARGE_TITLE_HINT);
            rechargeType.mFavorite = jSONObject2.optBoolean(Constants.KEY_RECHARGE_IS_FAVORITE, false);
            rechargeType.mCurrencyUnit = jSONObject2.getString(Constants.KEY_RECHARGE_CURRENCY_UNIT);
            aVar.f10148a.add(rechargeType);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        try {
            a(jSONObject, aVar);
        } catch (JSONException e) {
            throw new ResultException(e);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        String string2 = sortedParameter.getString(Constants.KEY_RECHARGE_CHANNELS);
        Connection connectionCreateNoAccountConnection = this.mSession.getAccountLoader() instanceof FakeAccountLoader ? ConnectionFactory.createNoAccountConnection(this.mContext, CommonConstants.getUrl("p/na/deductCharges")) : ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/deductCharges"), this.mSession);
        SortedParameter parameter = connectionCreateNoAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add(Constants.KEY_RECHARGE_CHANNELS, string2);
        connectionCreateNoAccountConnection.setUseGet(true);
        return connectionCreateNoAccountConnection;
    }
}
