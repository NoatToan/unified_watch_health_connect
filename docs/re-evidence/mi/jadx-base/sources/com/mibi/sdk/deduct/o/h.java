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
public class h extends RxBasePaymentTask<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10154a = "h";

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10156b;
    }

    public h(Context context, Session session) {
        super(context, session, a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseResultInSuccess(JSONObject jSONObject, a aVar) throws PaymentException {
        super.parseResultInSuccess(jSONObject, aVar);
        String str = f10154a;
        MibiLog.d(str, "get union-pay deduct order success");
        int iOptInt = jSONObject.optInt(CommonConstants.KEY_ERR_CODE);
        if (iOptInt != 200) {
            String str2 = "get union-pay deduct order failed " + iOptInt;
            MibiLog.d(str, str2);
            throw new ResultException(str2);
        }
        aVar.f10156b = jSONObject.optString("mode", "00");
        String strOptString = jSONObject.optString(DeductConstants.KEY_PAY_INFO);
        aVar.f10155a = strOptString;
        if (TextUtils.isEmpty(strOptString)) {
            MibiLog.d(str, "tn is null");
            throw new ResultException("tn is null");
        }
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        Connection connectionCreateNoAccountConnection = getSession().isFakeAccountLoader() ? ConnectionFactory.createNoAccountConnection(getContext(), CommonConstants.getUrl("p/na/deductSign/unionpay")) : ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/deductSign/unionpay"), this.mSession);
        SortedParameter parameter = connectionCreateNoAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add("deductChannel", com.mibi.sdk.deduct.c.a.UNIONPAY.a());
        return connectionCreateNoAccountConnection;
    }
}
