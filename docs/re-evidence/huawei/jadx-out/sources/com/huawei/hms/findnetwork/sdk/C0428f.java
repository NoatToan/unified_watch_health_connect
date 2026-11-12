package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.DecryptLocationCipherBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0428f extends BaseTaskApiCall {
    public C0428f(DecryptLocationCipherBean decryptLocationCipherBean) {
        super("findnetwork.decrypt_location_chiper", decryptLocationCipherBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setData(str);
        findNetworkResult.setDescription(responseErrorCode.getErrorReason());
        findNetworkResult.setRespCode(responseErrorCode.getErrorCode());
        taskCompletionSource.setResult(findNetworkResult);
    }
}
