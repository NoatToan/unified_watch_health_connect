package com.mibi.sdk.deduct.o;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c extends RxBasePaymentTask<a> {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10147b;
    }

    public c(Context context, Session session) {
        super(context, session, a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInSuccess(jSONObject, aVar);
        try {
            aVar.f10146a = jSONObject.getInt("status");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        aVar.f10147b = jSONObject.optString("result");
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        Connection connectionCreateNoAccountConnection = getSession().isFakeAccountLoader() ? ConnectionFactory.createNoAccountConnection(getContext(), CommonConstants.getUrl("p/na/deductSign/result")) : ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/deductSign/result"), this.mSession);
        connectionCreateNoAccountConnection.getParameter().add(CommonConstants.KEY_PROCESS_ID, string);
        return connectionCreateNoAccountConnection;
    }
}
