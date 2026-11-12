package com.mibi.sdk.pay.task;

import android.content.Context;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;

/* JADX INFO: loaded from: classes5.dex */
public class RxUploadOrderGiftcardSettingTask extends RxBasePaymentTask<Result> {
    private static final String URL_PAY_CHECK_GIFTCARD = "p/checkGiftcard";

    public static class Result {
    }

    public RxUploadOrderGiftcardSettingTask(Context context, Session session) {
        super(context, session, Result.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        String string = sortedParameter.getString(CommonConstants.KEY_PROCESS_ID);
        boolean z = sortedParameter.getBoolean(Constants.KEY_USE_GIFTCARD);
        boolean z2 = sortedParameter.getBoolean(Constants.KEY_USE_PARTNER_GIFTCARD);
        long j = sortedParameter.getLong(Constants.KEY_USE_DISCOUNT_GIFT_CARD_ID, 0L);
        Connection connectionCreateAccountConnection = ConnectionFactory.createAccountConnection(CommonConstants.getUrl(URL_PAY_CHECK_GIFTCARD), this.mSession);
        SortedParameter parameter = connectionCreateAccountConnection.getParameter();
        parameter.add(CommonConstants.KEY_PROCESS_ID, string);
        parameter.add(Constants.KEY_USE_GIFTCARD, Boolean.valueOf(z));
        parameter.add(Constants.KEY_USE_PARTNER_GIFTCARD, Boolean.valueOf(z2));
        parameter.add(Constants.KEY_USE_DISCOUNT_GIFT_CARD_ID, Long.valueOf(j));
        return connectionCreateAccountConnection;
    }
}
