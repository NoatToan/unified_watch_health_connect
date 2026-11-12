package com.mibi.sdk.deduct.o;

import android.content.Context;
import com.mibi.sdk.DeductConstants;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class j extends RxBasePaymentTask<a> {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10161b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f10162k;
        public String l;
        public int m;
        public String n;
    }

    public j(Context context, Session session) {
        super(context, session, a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInSuccess(jSONObject, aVar);
        try {
            aVar.f10160a = jSONObject.getString("url");
            aVar.f10161b = jSONObject.getString("appid");
            aVar.m = jSONObject.getInt(DeductConstants.KEY_WX_BUSINESS_TYPE);
            aVar.c = jSONObject.getString(DeductConstants.KEY_WX_CONTRACT_CODE);
            aVar.d = jSONObject.getString(DeductConstants.KEY_WX_CONTRACT_DISPLAY_ACCOUNT);
            aVar.e = jSONObject.getString(DeductConstants.KEY_WX_MCH_ID);
            aVar.f = jSONObject.getString(DeductConstants.KEY_WX_NOTIFY_URL);
            aVar.g = jSONObject.getString(DeductConstants.KEY_WX_PLAN_ID);
            aVar.h = jSONObject.getString(DeductConstants.KEY_WX_REQUEST_SERIAL);
            aVar.j = jSONObject.getString("timestamp");
            aVar.f10162k = jSONObject.getString("version");
            aVar.l = jSONObject.getString("sign");
            aVar.i = jSONObject.getString(DeductConstants.KEY_WX_RETURN_APP);
            aVar.n = jSONObject.optString(DeductConstants.KEY_WX_OUTER_ID);
        } catch (JSONException unused) {
            throw new ResultException("wxpay deduct result error");
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        Connection connectionCreateNoAccountConnection = getSession().isFakeAccountLoader() ? ConnectionFactory.createNoAccountConnection(getContext(), CommonConstants.getUrl("p/na/deductSign/wxpay")) : ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/deductSign/wxpay"), this.mSession);
        SortedParameter parameter = connectionCreateNoAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add("deductChannel", com.mibi.sdk.deduct.c.a.WXPAY.a());
        return connectionCreateNoAccountConnection;
    }
}
