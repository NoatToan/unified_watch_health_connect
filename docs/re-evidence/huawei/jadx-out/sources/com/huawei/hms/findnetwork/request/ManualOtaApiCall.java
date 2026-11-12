package com.huawei.hms.findnetwork.request;

import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.DeviceOtaProgress;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.comm.util.MaskUtil;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class ManualOtaApiCall extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SnRequestBean f13193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FindNetworkCallback f13194b;

    public static class ManualOtaTypeToken extends TypeToken<FindNetworkResult<DeviceOtaProgress>> {
        private ManualOtaTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("ManualOtaApiCall", "ManualOtaApiCall handleBusiness");
        if (this.f13194b == null) {
            HmsFindSDKLog.i("ManualOtaApiCall", "ManualOtaApiCall callback is null");
            return;
        }
        FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new ManualOtaTypeToken().getType());
        if (findNetworkResult == null) {
            HmsFindSDKLog.i("ManualOtaApiCall", "ManualOtaApiCall result is null");
            FindNetworkResult findNetworkResult2 = new FindNetworkResult();
            findNetworkResult2.setRespCode(responseErrorCode.getErrorCode());
            findNetworkResult2.setDescription(responseErrorCode.getErrorReason());
            this.f13194b.onFail(findNetworkResult2);
            return;
        }
        String connectTagSn = this.f13193a.getConnectTagSn();
        String sn = ((DeviceOtaProgress) findNetworkResult.getData()).getSn();
        HmsFindSDKLog.i("ManualOtaApiCall", "ManualOtaApiCall requestSn = " + MaskUtil.maskSn(connectTagSn) + ", upgradeSn = " + MaskUtil.maskSn(sn) + ", code = " + findNetworkResult.getRespCode());
        if (findNetworkResult.getRespCode() == 907201155 && connectTagSn.equals(sn)) {
            HmsFindSDKLog.i("ManualOtaApiCall", "ManualOtaApiCall onUpdate");
            this.f13194b.onUpdate(findNetworkResult);
        } else if (findNetworkResult.getRespCode() == 0 && connectTagSn.equals(sn)) {
            HmsFindSDKLog.i("ManualOtaApiCall", "ManualOtaApiCall onSuccess");
            this.f13194b.onSuccess(findNetworkResult);
        } else {
            HmsFindSDKLog.i("ManualOtaApiCall", "ManualOtaApiCall onFail");
            this.f13194b.onFail(findNetworkResult);
        }
    }

    public ManualOtaApiCall(SnRequestBean snRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.manualOta", snRequestBean);
        this.f13193a = snRequestBean;
        this.f13194b = findNetworkCallback;
    }
}
