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
import com.mibi.sdk.task.RxBasePartnerTask;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b extends RxBasePartnerTask<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10114a;

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10116b;
        public String c;
    }

    public b(Context context, Session session, String str) {
        super(context, session, a.class);
        this.f10114a = str;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInSuccess(jSONObject, aVar);
        try {
            String string = jSONObject.getString(Constants.KEY_CHARGE_ORDER_ID);
            String string2 = jSONObject.getString("url");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                throw new ResultException("result has error");
            }
            aVar.f10115a = string;
            aVar.f10116b = string2;
            try {
                Connection connectionCreateNoAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, string2, false);
                connectionCreateNoAccountConnection.setUseGet(true);
                String strRequestString = connectionCreateNoAccountConnection.requestString();
                if (TextUtils.isEmpty(strRequestString)) {
                    throw new ResultException("result has error");
                }
                aVar.c = strRequestString;
            } catch (Exception e) {
                throw new ResultException(e);
            }
        } catch (JSONException e2) {
            throw new ResultException(e2);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        Connection connectionCreatePartnerConnection = ConnectionFactory.createPartnerConnection(getSession(), getPartnerUserId(this.f10114a), CommonConstants.getUrl("p/partner/recharge/mipayApk"));
        connectionCreatePartnerConnection.getParameter().addAll(sortedParameter);
        addPartnerParams(connectionCreatePartnerConnection, this.f10114a);
        return connectionCreatePartnerConnection;
    }
}
