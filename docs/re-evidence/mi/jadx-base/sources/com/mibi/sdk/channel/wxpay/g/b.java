package com.mibi.sdk.channel.wxpay.g;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.Utils;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.OrderBean;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b extends RxBasePaymentTask<a> {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10133b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public boolean h;
        public String i;
    }

    public b(Context context, Session session) {
        super(context, session, a.class);
    }

    private boolean c(String str) {
        OrderBean orderBean = (OrderBean) getSession().getMemoryStorage().get(str, Constants.KEY_ORDER_BEAN);
        return orderBean != null && orderBean.mIsUmsPayDisabled;
    }

    public final void a(a aVar, JSONObject jSONObject) throws ResultException {
        MibiLog.d("RxWXPayTask", "parse mini pro pay params");
        try {
            aVar.i = jSONObject.getJSONObject(Constants.KEY_APP_PAY_REQUEST).toString();
            aVar.f10132a = jSONObject.getString("mibiAppId");
        } catch (JSONException e) {
            String message = e.getMessage();
            MibiLog.d("RxWXPayTask", "wx mini program pay params invalid " + message);
            throw new ResultException(message);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInSuccess(jSONObject, aVar);
        MibiLog.d("RxWXPayTask", "step 1 success");
        aVar.h = TextUtils.equals(jSONObject.optString(Constants.KEY_PAY_WAY), Constants.PAY_WAY_UMS);
        try {
            Connection connectionCreateNoAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, jSONObject.getString("url"), false);
            connectionCreateNoAccountConnection.setUseGet(true);
            JSONObject jSONObjectRequestJSON = connectionCreateNoAccountConnection.requestJSON();
            if (aVar.h) {
                a(aVar, jSONObjectRequestJSON);
            } else {
                d(jSONObjectRequestJSON, aVar);
            }
        } catch (Exception e) {
            throw new ResultException(e);
        }
    }

    public final void d(JSONObject jSONObject, a aVar) throws ResultException {
        MibiLog.d("RxWXPayTask", "parseWeixinOrderResult");
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
            aVar.f10132a = string;
            aVar.f10133b = string4;
            aVar.c = string5;
            aVar.d = string3;
            aVar.e = string2;
            aVar.f = string7;
            aVar.g = string6;
        } catch (ResultException e) {
            MibiLog.d("RxWXPayTask", "RxWXPayTask order content exception", e);
            throw e;
        } catch (JSONException e2) {
            MibiLog.d("RxWXPayTask", "RxWXPayTask order json exception", e2);
            throw new ResultException(e2);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        long j = sortedParameter.getLong(Constants.KEY_CHARGE_FEE);
        Connection connectionCreateNoAccountConnection = this.mSession.isFakeAccountLoader() ? ConnectionFactory.createNoAccountConnection(getContext(), CommonConstants.getUrl("p/na/recharge/wxpayApk")) : ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/recharge/wxpayApk"), getSession());
        SortedParameter parameter = connectionCreateNoAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add(Constants.KEY_CHARGE_FEE, Long.valueOf(j));
        if (!c(string)) {
            parameter.add(Constants.KEY_SUPPORT_PAY_WAY, Constants.PAY_WAY_UMS);
        }
        return connectionCreateNoAccountConnection;
    }
}
