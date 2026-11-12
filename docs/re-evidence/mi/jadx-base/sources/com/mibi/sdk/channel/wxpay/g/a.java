package com.mibi.sdk.channel.wxpay.g;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.Utils;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePartnerTask;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a extends RxBasePartnerTask<C0313a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10129a;

    /* JADX INFO: renamed from: com.mibi.sdk.channel.wxpay.g.a$a, reason: collision with other inner class name */
    public static class C0313a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10131b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
    }

    public a(Context context, Session session, String str) {
        super(context, session, C0313a.class);
        this.f10129a = str;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, C0313a c0313a) throws PaymentException {
        super.parseResultInSuccess(jSONObject, c0313a);
        try {
            Connection connectionCreateNoAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, jSONObject.getString("url"), false);
            connectionCreateNoAccountConnection.setUseGet(true);
            b(connectionCreateNoAccountConnection.requestJSON(), c0313a);
        } catch (Exception e) {
            throw new ResultException(e);
        }
    }

    public final void b(JSONObject jSONObject, C0313a c0313a) throws ResultException {
        MibiLog.d("RxPartnerWXpayTask", "parseWeixinOrderResult");
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
            c0313a.f10130a = string;
            c0313a.f10131b = string4;
            c0313a.c = string5;
            c0313a.d = string3;
            c0313a.e = string2;
            c0313a.f = string7;
            c0313a.g = string6;
        } catch (ResultException e) {
            MibiLog.d("RxPartnerWXpayTask", "RxWXPayTask order content exception", e);
            throw e;
        } catch (JSONException e2) {
            MibiLog.d("RxPartnerWXpayTask", "RxWXPayTask order json exception", e2);
            throw new ResultException(e2);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        Connection connectionCreatePartnerConnection = ConnectionFactory.createPartnerConnection(getSession(), getPartnerUserId(this.f10129a), CommonConstants.getUrl("p/partner/recharge/wxpayApk"));
        connectionCreatePartnerConnection.getParameter().addAll(sortedParameter);
        addPartnerParams(connectionCreatePartnerConnection, this.f10129a);
        return connectionCreatePartnerConnection;
    }
}
