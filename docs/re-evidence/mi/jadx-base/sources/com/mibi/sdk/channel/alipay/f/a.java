package com.mibi.sdk.channel.alipay.f;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
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
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a extends RxBasePaymentTask<C0311a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10101a = "a";

    /* JADX INFO: renamed from: com.mibi.sdk.channel.alipay.f.a$a, reason: collision with other inner class name */
    public static class C0311a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f10103b;
    }

    public a(Context context, Session session) {
        super(context, session, C0311a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, C0311a c0311a) throws PaymentException {
        String string;
        super.parseResultInSuccess(jSONObject, c0311a);
        MibiLog.d(f10101a, "step 1 success");
        c0311a.f10103b = TextUtils.equals(jSONObject.optString(Constants.KEY_PAY_WAY), Constants.PAY_WAY_UMS);
        try {
            Connection connectionCreateNoAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, jSONObject.getString("url"), false);
            connectionCreateNoAccountConnection.setUseGet(true);
            if (c0311a.f10103b) {
                try {
                    string = connectionCreateNoAccountConnection.requestJSON().getJSONObject(Constants.KEY_APP_PAY_REQUEST).toString();
                } catch (Exception e) {
                    String message = e.getMessage();
                    MibiLog.d(f10101a, "ali mini program pay params invalid : " + message, e);
                    throw new ResultException(message);
                }
            } else {
                string = connectionCreateNoAccountConnection.requestString();
            }
            if (TextUtils.isEmpty(string)) {
                throw new ResultException("result has error");
            }
            c0311a.f10102a = string;
        } catch (Exception e2) {
            throw new ResultException(e2);
        }
    }

    public final boolean b(String str) {
        OrderBean orderBean = (OrderBean) getSession().getMemoryStorage().get(str, Constants.KEY_ORDER_BEAN);
        return orderBean != null && orderBean.mIsUmsPayDisabled;
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        long j = sortedParameter.getLong(Constants.KEY_CHARGE_FEE);
        Connection connectionCreateNoAccountConnection = this.mSession.isFakeAccountLoader() ? ConnectionFactory.createNoAccountConnection(getContext(), CommonConstants.getUrl("p/na/recharge/alipayApk")) : ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/recharge/alipayApk"), getSession());
        SortedParameter parameter = connectionCreateNoAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add(Constants.KEY_CHARGE_FEE, Long.valueOf(j));
        if (!b(string)) {
            parameter.add(Constants.KEY_SUPPORT_PAY_WAY, Constants.PAY_WAY_UMS);
        }
        return connectionCreateNoAccountConnection;
    }
}
