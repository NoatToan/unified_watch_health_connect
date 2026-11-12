package com.huawei.hms.opendevice;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.DeleteTokenResp;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* JADX INFO: loaded from: classes34.dex */
public class f extends TaskApiCall<PushClient, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeleteTokenReq f15808a;

    public f(String str, DeleteTokenReq deleteTokenReq, String str2) {
        super(str, JsonUtil.createJsonString(deleteTokenReq), str2);
        this.f15808a = deleteTokenReq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Void> taskCompletionSource) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.e(HmsInstanceId.TAG, "DeleteTokenTask failed, ErrorCode: " + responseErrorCode.getErrorCode());
            taskCompletionSource.setException(ErrorEnum.fromCode(responseErrorCode.getErrorCode()).toApiException());
            return;
        }
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(((DeleteTokenResp) JsonUtil.jsonToEntity(str, new DeleteTokenResp())).getRetCode());
        if (errorEnumFromCode != ErrorEnum.SUCCESS) {
            taskCompletionSource.setException(errorEnumFromCode.toApiException());
        } else {
            taskCompletionSource.setResult(null);
            h.a(pushClient.getContext(), getUri(), responseErrorCode);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.f15808a.isMultiSender() ? 50004300 : 30000000;
    }
}
