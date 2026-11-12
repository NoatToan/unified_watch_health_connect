package com.huawei.hms.findnetwork.sdk;

import android.text.TextUtils;
import androidx.arch.core.util.Function;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class L extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function f13208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function f13209b;

    public L(SnRequestBean snRequestBean, Function function, Function function2) {
        super("findnetwork.start_navigate", snRequestBean);
        this.f13208a = function;
        this.f13209b = function2;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        String str2;
        HmsFindSDKLog.i("StartNavigateApiCall", "StartNavigateApiCall handleBusiness");
        if (this.f13208a == null) {
            HmsFindSDKLog.e("StartNavigateApiCall", "startNavigateApiCall handler is null");
            return;
        }
        if (responseErrorCode == null) {
            str2 = "response is null ";
        } else {
            str2 = "response.getStatusCode: " + responseErrorCode.getStatusCode() + ", response.getErrorReason(): " + responseErrorCode.getErrorReason();
        }
        HmsFindSDKLog.i("StartNavigateApiCall", str2);
        if (responseErrorCode.getStatusCode() == 907201007) {
            HmsFindSDKLog.i("StartNavigateApiCall", "refresh: " + str);
            if (!TextUtils.isEmpty(str)) {
                this.f13209b.apply(str);
            }
        } else {
            this.f13208a.apply(responseErrorCode);
        }
        taskCompletionSource.setResult(null);
    }
}
