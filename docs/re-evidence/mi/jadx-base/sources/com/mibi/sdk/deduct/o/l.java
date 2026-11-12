package com.mibi.sdk.deduct.o;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.account.loader.FakeAccountLoader;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class l extends RxBasePaymentTask<a> {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10166b;
        public String c;
        public String d;
        public int e;
        public int f;
    }

    public l(Context context, Session session) {
        super(context, session, a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInCommon(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInCommon(jSONObject, aVar);
        aVar.f10165a = jSONObject.optString("status");
        aVar.f10166b = jSONObject.optString(Constants.KEY_MARKET_DEDUCT_ID);
        aVar.c = jSONObject.optString("orderId");
        aVar.d = jSONObject.optString(Constants.KEY_CHARGE_STATUS);
        aVar.e = jSONObject.optInt(Constants.KEY_PAY_STATUS);
        aVar.f = jSONObject.optInt(Constants.KEY_DEDUCT_SIGN_STATUS);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        Connection connectionCreateAccountConnection;
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        if (this.mSession.getAccountLoader() instanceof FakeAccountLoader) {
            connectionCreateAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, CommonConstants.getUrl("p/na/deductSignAndPay/result"));
        } else {
            connectionCreateAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/deductSignAndPay/result"), this.mSession);
        }
        connectionCreateAccountConnection.getParameter().add(CommonConstants.KEY_PROCESS_ID, string);
        return connectionCreateAccountConnection;
    }
}
