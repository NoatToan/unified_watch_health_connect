package com.huawei.hms.findnetwork.request;

import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.TagStatus;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class CheckTagStatusApiCall extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkCallback f13192a;

    public static class CheckTagStatusTypeToken extends TypeToken<FindNetworkResult<TagStatus>> {
        private CheckTagStatusTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("CheckTagStatusApiCall", "handleBusiness checkTagStatus.");
        FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new CheckTagStatusTypeToken().getType());
        if (this.f13192a == null) {
            HmsFindSDKLog.i("CheckTagStatusApiCall", "callback == null");
            return;
        }
        if (findNetworkResult != null) {
            if (findNetworkResult.getRespCode() == 0) {
                this.f13192a.onSuccess(findNetworkResult);
                return;
            } else {
                this.f13192a.onFail(findNetworkResult);
                return;
            }
        }
        FindNetworkResult findNetworkResult2 = new FindNetworkResult();
        findNetworkResult2.setRespCode(responseErrorCode.getErrorCode());
        findNetworkResult2.setDescription(responseErrorCode.getErrorReason());
        this.f13192a.onFail(findNetworkResult2);
    }

    public CheckTagStatusApiCall(SnRequestBean snRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.query_tag_derived_status", snRequestBean);
        this.f13192a = findNetworkCallback;
    }
}
