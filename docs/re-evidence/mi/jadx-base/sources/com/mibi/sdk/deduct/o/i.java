package com.mibi.sdk.deduct.o;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.DeductConstants;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
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
public class i extends RxBasePaymentTask<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10157a = "i";

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10159b;
    }

    public i(Context context, Session session) {
        super(context, session, a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInSuccess(jSONObject, aVar);
        String str = f10157a;
        MibiLog.d(str, "step 1 success");
        try {
            Connection connectionCreateNoAccountConnection = ConnectionFactory.createNoAccountConnection(this.mContext, jSONObject.optString("url"), false);
            connectionCreateNoAccountConnection.setUseGet(true);
            JSONObject jSONObjectRequestJSON = connectionCreateNoAccountConnection.requestJSON();
            MibiLog.d(str, "step 2, get union-pay sign deduct order success");
            int iOptInt = jSONObjectRequestJSON.optInt(CommonConstants.KEY_ERR_CODE);
            if (iOptInt != 200) {
                String str2 = "get union-pay sign deduct order failed " + iOptInt;
                MibiLog.d(str, str2);
                throw new ResultException(str2);
            }
            aVar.f10159b = jSONObjectRequestJSON.optString("mode", "00");
            String strOptString = jSONObjectRequestJSON.optString(DeductConstants.KEY_PAY_INFO);
            aVar.f10158a = strOptString;
            if (TextUtils.isEmpty(strOptString)) {
                MibiLog.d(str, "tn is null");
                throw new ResultException("tn is null");
            }
        } catch (Exception e) {
            MibiLog.d(f10157a, "parse union-pay sign deduct url failed : " + e.getMessage(), e);
            throw new ResultException(e);
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        Connection connectionCreateNoAccountConnection = getSession().isFakeAccountLoader() ? ConnectionFactory.createNoAccountConnection(getContext(), CommonConstants.getUrl("p/na/deductSignAndPay/unionpay")) : ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/deductSignAndPay/unionpay"), this.mSession);
        SortedParameter parameter = connectionCreateNoAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add("deductChannel", com.mibi.sdk.deduct.c.a.UNIONPAY.a());
        return connectionCreateNoAccountConnection;
    }
}
