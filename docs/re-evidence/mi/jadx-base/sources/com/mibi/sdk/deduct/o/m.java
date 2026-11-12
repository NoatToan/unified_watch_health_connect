package com.mibi.sdk.deduct.o;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class m extends RxBasePaymentTask<a> {

    public static class a implements Serializable {
    }

    public m(Context context, Session session) {
        super(context, session, a.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        String string2 = sortedParameter.getString("responseData");
        Connection connectionCreateAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl("p/deductSign/updateMipay"), this.mSession);
        SortedParameter parameter = connectionCreateAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add("responseData", string2);
        return connectionCreateAccountConnection;
    }
}
