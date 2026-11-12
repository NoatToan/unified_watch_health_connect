package com.mibi.sdk.channel.mipay.g;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a extends RxBasePaymentTask<C0312a> {

    /* JADX INFO: renamed from: com.mibi.sdk.channel.mipay.g.a$a, reason: collision with other inner class name */
    public static class C0312a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10113b;
        public String c;
    }

    public a(Context context, Session session) {
        super(context, session, C0312a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, C0312a c0312a) throws PaymentException {
        super.parseResultInSuccess(jSONObject, c0312a);
        try {
            String string = jSONObject.getString(Constants.KEY_CHARGE_ORDER_ID);
            String string2 = jSONObject.getString("url");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                throw new ResultException("result has error");
            }
            c0312a.f10112a = string;
            c0312a.f10113b = string2;
            try {
                Connection connectionCreateNoAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, string2, false);
                connectionCreateNoAccountConnection.setUseGet(true);
                String strRequestString = connectionCreateNoAccountConnection.requestString();
                if (TextUtils.isEmpty(strRequestString)) {
                    throw new ResultException("result has error");
                }
                c0312a.c = strRequestString;
            } catch (Exception e) {
                throw new ResultException(e);
            }
        } catch (JSONException e2) {
            throw new ResultException(e2);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        long j = sortedParameter.getLong(Constants.KEY_CHARGE_FEE);
        Connection connectionCreateNoAccountConnection = this.mSession.isFakeAccountLoader() ? ConnectionFactory.createNoAccountConnection(getContext(), CommonConstants.getUrl("p/na/recharge/mipayApk")) : ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/recharge/mipayApk"), getSession());
        SortedParameter parameter = connectionCreateNoAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add(Constants.KEY_CHARGE_FEE, Long.valueOf(j));
        return connectionCreateNoAccountConnection;
    }
}
