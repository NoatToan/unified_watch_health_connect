package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResp;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.threads.AsyncExec;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* JADX INFO: loaded from: classes34.dex */
public class g extends TaskApiCall<PushClient, TokenResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f15809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TokenReq f15810b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15812b;

        a(String str, String str2) {
            this.f15811a = str;
            this.f15812b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.a(g.this.f15809a).b(this.f15811a).equals(this.f15812b)) {
                return;
            }
            HMSLog.i(HmsInstanceId.TAG, "receive a new token, refresh the local token");
            i.a(g.this.f15809a).b(this.f15811a, this.f15812b);
        }
    }

    public g(String str, TokenReq tokenReq, Context context, String str2) {
        super(str, JsonUtil.createJsonString(tokenReq), str2);
        this.f15809a = context;
        this.f15810b = tokenReq;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.f15810b.isMultiSender() ? 50004300 : 30000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<TokenResult> taskCompletionSource) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.e(HmsInstanceId.TAG, "TokenTask failed, ErrorCode:" + responseErrorCode.getErrorCode());
            taskCompletionSource.setException(ErrorEnum.fromCode(responseErrorCode.getErrorCode()).toApiException());
        } else {
            TokenResp tokenResp = (TokenResp) JsonUtil.jsonToEntity(str, new TokenResp());
            ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(tokenResp.getRetCode());
            if (errorEnumFromCode != ErrorEnum.SUCCESS) {
                taskCompletionSource.setException(errorEnumFromCode.toApiException());
                HMSLog.e(HmsInstanceId.TAG, "TokenTask failed, StatusCode:" + errorEnumFromCode.getExternalCode());
            } else {
                TokenResult tokenResult = new TokenResult();
                tokenResult.setToken(tokenResp.getToken());
                tokenResult.setBelongId(tokenResp.getBelongId());
                tokenResult.setRetCode(ErrorEnum.fromCode(tokenResp.getRetCode()).getExternalCode());
                taskCompletionSource.setResult(tokenResult);
                String token = tokenResp.getToken();
                if (TextUtils.isEmpty(token)) {
                    HMSLog.i(HmsInstanceId.TAG, "GetTokenTask receive an empty token, please check onNewToken callback method.");
                    h.a(pushClient.getContext(), getUri(), responseErrorCode);
                    return;
                }
                a(token, this.f15810b.getSubjectId());
            }
        }
        h.a(pushClient.getContext(), getUri(), responseErrorCode);
    }

    private void a(String str, String str2) {
        AsyncExec.submitSeqIO(new a(str2, str));
    }
}
