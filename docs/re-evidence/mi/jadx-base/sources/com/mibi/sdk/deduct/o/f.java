package com.mibi.sdk.deduct.o;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.account.loader.FakeAccountLoader;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class f extends RxBasePaymentTask<a> {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10151a;
    }

    public f(Context context, Session session) {
        super(context, session, a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInSuccess(jSONObject, aVar);
        try {
            String strOptString = jSONObject.optString("url");
            aVar.f10151a = strOptString;
            Connection connectionCreateNoAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, strOptString, false);
            connectionCreateNoAccountConnection.setUseGet(true);
            JSONObject jSONObjectRequestJSON = connectionCreateNoAccountConnection.requestJSON();
            int iOptInt = jSONObjectRequestJSON.optInt(CommonConstants.KEY_ERR_CODE);
            if (iOptInt == 200) {
                aVar.f10151a = jSONObjectRequestJSON.optString("url");
                return;
            }
            String str = "get alipay url error , errorCode : " + iOptInt;
            MibiLog.e("RxDoAlipaySignDeduct", str);
            throw new ResultException(str);
        } catch (Exception e) {
            MibiLog.e("RxDoAlipaySignDeduct", "parse alipay url error ");
            throw new ResultException(e);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        Connection connectionCreateAccountConnection;
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        if (this.mSession.getAccountLoader() instanceof FakeAccountLoader) {
            connectionCreateAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, CommonConstants.getUrl("p/na/deductSignAndPay/alipay"));
        } else {
            connectionCreateAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/deductSignAndPay/alipay"), this.mSession);
        }
        SortedParameter parameter = connectionCreateAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add("deductChannel", com.mibi.sdk.deduct.c.a.ALIPAY.a());
        return connectionCreateAccountConnection;
    }
}
