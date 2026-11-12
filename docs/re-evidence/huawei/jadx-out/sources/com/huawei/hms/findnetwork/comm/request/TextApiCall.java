package com.huawei.hms.findnetwork.comm.request;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.findnetwork.comm.exception.FindNetworkException;
import com.huawei.hms.findnetwork.comm.log.HmsFindCommonLog;

/* JADX INFO: loaded from: classes33.dex */
public class TextApiCall extends TaskApiCall<HmsClient, String> {
    private static final String TAG = "UniversalTaskApiCall";

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<String> taskCompletionSource) {
        FindNetworkException findNetworkException;
        if (responseErrorCode.getErrorCode() != 0) {
            HmsFindCommonLog.e(TAG, getUri() + " -" + responseErrorCode.getErrorCode() + " reason:" + responseErrorCode.getErrorReason());
            findNetworkException = new FindNetworkException(responseErrorCode.getErrorReason(), responseErrorCode.getErrorCode());
        } else {
            if (!TextUtils.isEmpty(str)) {
                taskCompletionSource.setResult(str);
                return;
            }
            HmsFindCommonLog.w(TAG, getUri() + " - no body");
            findNetworkException = new FindNetworkException("none body", responseErrorCode.getErrorCode());
        }
        taskCompletionSource.setException(findNetworkException);
    }

    public TextApiCall(String str, String str2, String str3) {
        super(str, str2, str3);
    }
}
