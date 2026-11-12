package com.huawei.hms.findnetwork.request;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes10.dex */
public class UnPairApiCall extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindNetworkCallback f13198a;

    public static class UnPairResultTypeToken extends TypeToken<FindNetworkResult<Boolean>> {
        private UnPairResultTypeToken() {
        }
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        ApiException apiException;
        HmsFindSDKLog.i("UnPairApiCall", "handleBusiness");
        if (TextUtils.isEmpty(str)) {
            HmsFindSDKLog.i("UnPairApiCall", "body null");
            apiException = new ApiException(new Status(-1, "body null"));
        } else {
            FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str, new UnPairResultTypeToken().getType());
            if (findNetworkResult != null) {
                if (findNetworkResult.getRespCode() == 0) {
                    this.f13198a.onSuccess(findNetworkResult);
                } else {
                    this.f13198a.onFail(findNetworkResult);
                }
                taskCompletionSource.setResult(findNetworkResult);
                return;
            }
            HmsFindSDKLog.i("UnPairApiCall", "body parse error");
            apiException = new ApiException(new Status(-1, "body parse error"));
        }
        taskCompletionSource.setException(apiException);
    }

    public UnPairApiCall(SnRequestBean snRequestBean, FindNetworkCallback findNetworkCallback) {
        super("findnetwork.tag_unpair", snRequestBean);
        this.f13198a = findNetworkCallback;
    }
}
