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
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b extends RxBasePaymentTask<a> {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10145b;
        public String c;
    }

    public b(Context context, Session session) {
        super(context, session, a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInSuccess(jSONObject, aVar);
        aVar.f10144a = jSONObject.optString("deductChannel");
        aVar.f10145b = jSONObject.optString("orderDesc");
        aVar.c = jSONObject.optString(Constants.KEY_EXTRA_INFO);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        Connection connectionCreateAccountConnection;
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        String string2 = sortedParameter.getString("deductSignAndPayOrder");
        if (this.mSession.isFakeAccountLoader()) {
            connectionCreateAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, CommonConstants.getUrl("p/na/deductSignAndPay/checkParam"));
        } else {
            connectionCreateAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/deductSignAndPay/checkParam"), this.mSession);
        }
        SortedParameter parameter = connectionCreateAccountConnection.getParameter();
        parameter.add("deductSignAndPayOrder", string2);
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        return connectionCreateAccountConnection;
    }
}
