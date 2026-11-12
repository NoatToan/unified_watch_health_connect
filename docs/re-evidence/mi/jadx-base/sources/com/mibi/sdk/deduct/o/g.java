package com.mibi.sdk.deduct.o;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class g extends RxBasePaymentTask<a> {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10153b;
        public String c;
        public String d;
    }

    public g(Context context, Session session) {
        super(context, session, a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInSuccess(jSONObject, aVar);
        aVar.f10152a = jSONObject.optString(Constants.KEY_REQUEST_DATA);
        try {
            aVar.f10153b = jSONObject.getString(Constants.KEY_ORDER_GOODS_NAME);
            aVar.c = jSONObject.getString("merchantName");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        aVar.d = jSONObject.optString(Constants.KEY_CANCEL_MERCHANT_NAME, "");
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        Connection connectionCreateAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/deductSign/mipay"), this.mSession);
        SortedParameter parameter = connectionCreateAccountConnection.getParameter();
        parameter.add("deductChannel", com.mibi.sdk.deduct.c.a.MIPAY.a());
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        return connectionCreateAccountConnection;
    }
}
