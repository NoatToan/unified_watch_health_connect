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
public class a extends RxBasePaymentTask<C0314a> {

    /* JADX INFO: renamed from: com.mibi.sdk.deduct.o.a$a, reason: collision with other inner class name */
    public static class C0314a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10143b;
        public String c;
    }

    public a(Context context, Session session) {
        super(context, session, C0314a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, C0314a c0314a) throws PaymentException {
        super.parseResultInSuccess(jSONObject, c0314a);
        c0314a.f10142a = jSONObject.optString("deductChannel");
        c0314a.f10143b = jSONObject.optString("orderDesc");
        c0314a.c = jSONObject.optString(Constants.KEY_EXTRA_INFO);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        String string2 = sortedParameter.getString(Constants.KEY_DEDUCT_ORDER);
        Connection connectionCreateNoAccountConnection = getSession().isFakeAccountLoader() ? ConnectionFactory.createNoAccountConnection(getContext(), CommonConstants.getUrl("p/na/deductSign/checkParam")) : ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/deductSign/checkParam"), this.mSession);
        SortedParameter parameter = connectionCreateNoAccountConnection.getParameter();
        parameter.add(Constants.KEY_DEDUCT_ORDER, string2);
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        return connectionCreateNoAccountConnection;
    }
}
