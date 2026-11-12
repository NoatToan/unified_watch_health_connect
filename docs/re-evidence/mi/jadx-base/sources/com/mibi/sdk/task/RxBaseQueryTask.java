package com.mibi.sdk.task;

import android.content.Context;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.account.loader.FakeAccountLoader;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.common.exception.ResultException;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.recharge.EntryData;
import com.mibi.sdk.task.RxBaseQueryTask.Result;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RxBaseQueryTask<TaskResult extends Result> extends RxBasePaymentTask<TaskResult> {
    private long mLocalRechargeFee;

    public static class Result implements Serializable {
        public long mBalance;
        public String mChargeStatus;
        public String mErrorDesc;
        public String mHint;
        public EntryData mHintEntryData;
        public long mRechargeFee;
        public boolean mRechargeSuccess = false;
    }

    public RxBaseQueryTask(Context context, Session session, Class<TaskResult> cls) {
        super(context, session, cls);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public void setParams(SortedParameter sortedParameter) {
        super.setParams(sortedParameter);
        this.mLocalRechargeFee = sortedParameter.getLong(Constants.KEY_RECHARGE_MIBI);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public void parseResultInCommon(JSONObject jSONObject, TaskResult taskresult) throws PaymentException {
        taskresult.mErrorDesc = jSONObject.optString("errDesc");
        taskresult.mBalance = jSONObject.optLong("balance", -1L);
    }

    @Override // com.mibi.sdk.task.RxBasePaymentTask
    public void parseResultInSuccess(JSONObject jSONObject, TaskResult taskresult) throws PaymentException {
        try {
            taskresult.mChargeStatus = jSONObject.getString(Constants.KEY_CHARGE_STATUS);
            taskresult.mRechargeFee = jSONObject.getLong(Constants.KEY_CHARGE_FEE);
            taskresult.mHint = jSONObject.optString(Constants.KEY_RESULT_ACTIVITY);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("entry");
            if (jSONObjectOptJSONObject != null) {
                EntryData entryData = new EntryData();
                taskresult.mHintEntryData = entryData;
                entryData.parseEntryData(jSONObjectOptJSONObject);
            }
            if (!TextUtils.equals(taskresult.mChargeStatus, CommonConstants.Mgc.TRADE_SUCCESS) && !TextUtils.equals(taskresult.mChargeStatus, CommonConstants.Mgc.WAIT_BUYER_PAY) && !TextUtils.equals(taskresult.mChargeStatus, CommonConstants.Mgc.TRADE_CLOSED) && !TextUtils.equals(taskresult.mChargeStatus, CommonConstants.Mgc.TRADE_FAIL)) {
                throw new ResultException("result has error");
            }
            if (!TextUtils.equals(taskresult.mChargeStatus, CommonConstants.Mgc.TRADE_SUCCESS)) {
                if (taskresult.mRechargeFee <= 0) {
                    taskresult.mRechargeFee = this.mLocalRechargeFee;
                }
            } else {
                if (!(this.mSession.getAccountLoader() instanceof FakeAccountLoader) && taskresult.mBalance < 0) {
                    throw new ResultException("result has error");
                }
                if (taskresult.mRechargeFee <= 0) {
                    throw new ResultException("result has error");
                }
                taskresult.mRechargeSuccess = true;
            }
        } catch (JSONException e) {
            throw new ResultException(e);
        }
    }
}
