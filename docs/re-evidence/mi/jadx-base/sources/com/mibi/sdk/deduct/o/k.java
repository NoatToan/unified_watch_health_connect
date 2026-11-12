package com.mibi.sdk.deduct.o;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.Utils;
import com.mibi.sdk.common.account.loader.FakeAccountLoader;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class k extends RxBasePaymentTask<a> {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10164b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
    }

    public k(Context context, Session session) {
        super(context, session, a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInSuccess(jSONObject, aVar);
        try {
            String string = jSONObject.getString("url");
            aVar.f10163a = string;
            Connection connectionCreateNoAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, string, false);
            connectionCreateNoAccountConnection.setUseGet(true);
            b(connectionCreateNoAccountConnection.requestJSON(), aVar);
        } catch (JSONException unused) {
            throw new ResultException("wxpay sign deduct result error");
        } catch (Exception e) {
            throw new ResultException(e);
        }
    }

    public final void b(JSONObject jSONObject, a aVar) throws ResultException {
        try {
            String string = jSONObject.getString("appid");
            String string2 = jSONObject.getString("noncestr");
            String string3 = jSONObject.getString("package");
            String string4 = jSONObject.getString("partnerid");
            String string5 = jSONObject.getString("prepayid");
            String string6 = jSONObject.getString("sign");
            String string7 = jSONObject.getString("timestamp");
            if (!Utils.checkStrings(string, string2, string3, string4, string5, string6, string7)) {
                throw new ResultException("RxWXPayTask result has error");
            }
            aVar.f10164b = string;
            aVar.c = string4;
            aVar.d = string5;
            aVar.e = string3;
            aVar.f = string2;
            aVar.g = string7;
            aVar.h = string6;
        } catch (ResultException e) {
            MibiLog.d("RxDoWxpaySignDeduct", "RxDoWxpaySignDeductTask order content exception", e);
            throw e;
        } catch (JSONException e2) {
            MibiLog.d("RxDoWxpaySignDeduct", "RxDoWxpaySignDeductTask order json exception", e2);
            throw new ResultException(e2);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        Connection connectionCreateAccountConnection;
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        if (this.mSession.getAccountLoader() instanceof FakeAccountLoader) {
            connectionCreateAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, CommonConstants.getUrl("p/na/deductSignAndPay/wxpay"));
        } else {
            connectionCreateAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/deductSignAndPay/wxpay"), this.mSession);
        }
        SortedParameter parameter = connectionCreateAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add("deductChannel", com.mibi.sdk.deduct.c.a.WXPAY.a());
        return connectionCreateAccountConnection;
    }
}
