package com.huawei.hms.findnetwork.request;

import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.DeviceOtaTargetVersion;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class StartOtaCheckApiCall extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkCallback f13197a;

    public static class OtaCheckTypeToken extends TypeToken<FindNetworkResult<DeviceOtaTargetVersion>> {
        private OtaCheckTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("StartOtaCheckApiCall", "StartOtaCheckApiCall handleBusiness");
        if (this.f13197a == null) {
            HmsFindSDKLog.i("StartOtaCheckApiCall", "StartOtaCheckApiCall callback is null");
            return;
        }
        FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new OtaCheckTypeToken().getType());
        if (findNetworkResult == null) {
            HmsFindSDKLog.i("StartOtaCheckApiCall", "StartOtaCheckApiCall result is null");
        } else {
            this.f13197a.onSuccess(findNetworkResult);
        }
    }

    public StartOtaCheckApiCall(SnRequestBean snRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.startCheckOta", snRequestBean);
        this.f13197a = findNetworkCallback;
    }
}
