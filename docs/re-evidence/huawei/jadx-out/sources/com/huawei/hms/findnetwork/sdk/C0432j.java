package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0432j extends BaseTaskApiCall {
    public C0432j(SnRequestBean snRequestBean) {
        super("findnetwork.tag_updateLongConnectionParams", snRequestBean);
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        HmsFindSDKLog.i("DisconnectTagApiCall", "DisconnectTagApiCall handleBusiness");
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setData(str);
        HmsFindSDKLog.i("DisconnectTagApiCall", "result.getRespCode() == " + findNetworkResult.getRespCode());
        taskCompletionSource.setResult(null);
    }
}
