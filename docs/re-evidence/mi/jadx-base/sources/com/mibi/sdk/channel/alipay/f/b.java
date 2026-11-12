package com.mibi.sdk.channel.alipay.f;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePartnerTask;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b extends RxBasePartnerTask<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10104a;

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10105a;
    }

    public b(Context context, Session session, String str) {
        super(context, session, a.class);
        this.f10104a = str;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInSuccess(jSONObject, aVar);
        try {
            Connection connectionCreateNoAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, jSONObject.getString("url"), false);
            connectionCreateNoAccountConnection.setUseGet(true);
            String strRequestString = connectionCreateNoAccountConnection.requestString();
            if (TextUtils.isEmpty(strRequestString)) {
                throw new ResultException("result has error");
            }
            aVar.f10105a = strRequestString;
        } catch (Exception e) {
            throw new ResultException(e);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        Connection connectionCreatePartnerConnection = ConnectionFactory.createPartnerConnection(getSession(), getPartnerUserId(this.f10104a), CommonConstants.getUrl("p/partner/recharge/alipayApk"));
        connectionCreatePartnerConnection.getParameter().addAll(sortedParameter);
        addPartnerParams(connectionCreatePartnerConnection, this.f10104a);
        return connectionCreatePartnerConnection;
    }
}
