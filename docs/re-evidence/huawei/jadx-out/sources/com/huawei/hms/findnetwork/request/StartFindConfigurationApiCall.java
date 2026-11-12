package com.huawei.hms.findnetwork.request;

import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.callback.PairingCallback;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.PairingResultBean;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkConfigResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;

/* JADX INFO: loaded from: classes33.dex */
public class StartFindConfigurationApiCall extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PairingCallback f13196a;

    public static class PairResultTypeToken extends TypeToken<FindNetworkConfigResult<PairingResultBean>> {
        private PairResultTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        FindNetworkConfigResult<PairingResultBean> findNetworkConfigResult = (FindNetworkConfigResult) JsonUtils.json2Object(str, new PairResultTypeToken().getType());
        if (findNetworkConfigResult != null) {
            if (findNetworkConfigResult.getRespCode() == 0) {
                this.f13196a.onPairingSuccess(findNetworkConfigResult);
            } else {
                this.f13196a.onPairingFail(findNetworkConfigResult);
            }
            taskCompletionSource.setResult(findNetworkConfigResult);
        }
    }

    public StartFindConfigurationApiCall(BaseRequestBean baseRequestBean, PairingCallback pairingCallback) {
        super("findnetwork.start_findnetwork_config", baseRequestBean);
        this.f13196a = pairingCallback;
    }
}
