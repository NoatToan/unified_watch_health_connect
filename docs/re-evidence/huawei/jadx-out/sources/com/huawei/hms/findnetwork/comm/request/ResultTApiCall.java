package com.huawei.hms.findnetwork.comm.request;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.findnetwork.comm.exception.FindNetworkException;
import com.huawei.hms.findnetwork.comm.log.HmsFindCommonLog;

/* JADX INFO: loaded from: classes33.dex */
public class ResultTApiCall<ResultT> extends TaskApiCall<HmsClient, ResultT> {
    private static final String TAG = "ResultTApiCall";

    public ResultT handleBusiness(String str) throws FindNetworkException {
        return null;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<ResultT> taskCompletionSource) {
        if (handleBusiness(hmsClient, responseErrorCode, str, taskCompletionSource)) {
            HmsFindCommonLog.i(TAG, "handleBusiness over");
            return;
        }
        if (responseErrorCode.getErrorCode() != 0) {
            HmsFindCommonLog.e(TAG, getUri() + " -" + responseErrorCode.getErrorCode() + " reason:" + responseErrorCode.getErrorReason());
            taskCompletionSource.setException(new FindNetworkException(responseErrorCode.getErrorReason(), responseErrorCode.getErrorCode()));
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                taskCompletionSource.setResult(handleBusiness(str));
                return;
            } catch (FindNetworkException e) {
                taskCompletionSource.setException(e);
                return;
            }
        }
        HmsFindCommonLog.w(TAG, getUri() + " - no body");
        taskCompletionSource.setException(new FindNetworkException("none body", responseErrorCode.getErrorCode()));
    }

    public boolean handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<ResultT> taskCompletionSource) {
        HmsFindCommonLog.i(TAG, getUri() + "#" + responseErrorCode.getTransactionId() + " status:" + responseErrorCode.getStatusCode() + " Response:" + responseErrorCode.getErrorCode() + " - " + responseErrorCode.getErrorReason());
        return false;
    }

    public ResultTApiCall(String str, String str2, String str3) {
        super(str, str2, str3);
    }
}
