package com.huawei.hms.findnetwork.request;

import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.PairedDeviceInfo;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class SyncTagInfoApiCall extends BaseTaskApiCall {

    public static class SyncTagListTypeToken extends TypeToken<FindNetworkResult<List<PairedDeviceInfo>>> {
        private SyncTagListTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        int errorCode = responseErrorCode.getErrorCode();
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setRespCode(errorCode);
        FindNetworkResult findNetworkResult2 = (FindNetworkResult) JsonUtils.json2Object(str, new SyncTagListTypeToken().getType());
        if (findNetworkResult2 == null) {
            HmsFindSDKLog.i("SyncTagInfoApiCall", "body parse error");
            taskCompletionSource.setException(new ApiException(new Status(-1, "body parse error")));
            return;
        }
        findNetworkResult.setData((List) findNetworkResult2.getData());
        findNetworkResult.setDescription(findNetworkResult2.getDescription());
        findNetworkResult.setRespCode(findNetworkResult2.getRespCode());
        HmsFindSDKLog.i("SyncTagInfoApiCall", "success to call sync tag. fncResult=" + findNetworkResult2.getRespCode());
        if (findNetworkResult.getRespCode() == 0) {
            taskCompletionSource.setResult(findNetworkResult);
        } else {
            taskCompletionSource.setException(new ApiException(new Status(findNetworkResult.getRespCode(), findNetworkResult.getDescription())));
        }
    }

    public SyncTagInfoApiCall(SnRequestBean snRequestBean) {
        super("findnetwork.syncTagInfo", snRequestBean);
    }
}
