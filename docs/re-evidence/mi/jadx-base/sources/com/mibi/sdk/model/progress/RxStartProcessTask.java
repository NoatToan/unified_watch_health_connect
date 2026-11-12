package com.mibi.sdk.model.progress;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.account.loader.FakeAccountLoader;
import com.mibi.sdk.common.exception.NoPrivacyRightException;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.model.R;
import com.mibi.sdk.network.Connection;
import com.mibi.sdk.network.ConnectionFactory;
import com.mibi.sdk.task.RxBasePaymentTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class RxStartProcessTask extends RxBasePaymentTask<Result> {
    private static final String URL_START_NO_ACCOUNT_PROCESS = "/p/na/getProcessId";
    private static final String URL_START_PROCESS = "p/getProcessIdV2";

    public static class Result {
        public String mProcessId;
    }

    public RxStartProcessTask(Context context, Session session) {
        super(context, session, Result.class);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public Connection getConnection(SortedParameter sortedParameter) {
        if (!(this.mSession.getAccountLoader() instanceof FakeAccountLoader)) {
            return ConnectionFactory.createAccountConnection(CommonConstants.getUrl(URL_START_PROCESS), this.mSession);
        }
        return ConnectionFactory.createNoAccountConnection(this.mContext, CommonConstants.getUrl(URL_START_NO_ACCOUNT_PROCESS));
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public void parseResultInSuccess(JSONObject jSONObject, Result result) throws PaymentException {
        boolean zOptBoolean = jSONObject.optBoolean(CommonConstants.KEY_USER_REVOKE, false);
        boolean zOptBoolean2 = jSONObject.optBoolean(CommonConstants.KEY_NEED_PRIVACY_AUTHORIZE, false);
        if (zOptBoolean || zOptBoolean2) {
            throw new NoPrivacyRightException(this.mContext.getResources().getString(R.string.mibi_error_privacy_summary));
        }
        try {
            String string = jSONObject.getString(CommonConstants.KEY_PROCESS_ID);
            if (TextUtils.isEmpty(string)) {
                throw new ResultException("processId is empty!");
            }
            result.mProcessId = string;
        } catch (JSONException e) {
            throw new ResultException(e);
        }
    }
}
