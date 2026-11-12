package com.huawei.hms.findnetwork.sdk;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.NearLinkNaviStatus;
import com.huawei.hms.findnetwork.comm.request.bean.NearLinkNavigationResult;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class M extends BaseTaskApiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f13210a;

    public interface a {
        void a();

        void a(int i, String str);

        void a(NearLinkNavigationResult nearLinkNavigationResult);

        void b();
    }

    public M(SnRequestBean snRequestBean, a aVar) {
        super("findnetwork.startNearLinkNavigation", snRequestBean);
        this.f13210a = aVar;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.BaseTaskApiCall
    public void handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
        if (responseErrorCode == null) {
            HmsFindSDKLog.w("StartNearLinkNavigationApiCall", "handleBusiness ignore, param invalid.");
            return;
        }
        int statusCode = responseErrorCode.getStatusCode();
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0) {
            this.f13210a.a(errorCode, responseErrorCode.getErrorReason());
            return;
        }
        if (statusCode == NearLinkNaviStatus.REQUEST_AR_POSE.getType()) {
            this.f13210a.a();
        } else if (statusCode != NearLinkNaviStatus.ON_RANGE_RESULT.getType()) {
            this.f13210a.b();
        } else {
            HmsFindSDKLog.i("StartNearLinkNavigationApiCall", "handleBusiness onRangingResult.");
            this.f13210a.a((NearLinkNavigationResult) JsonUtils.json2Object(str, NearLinkNavigationResult.class));
        }
    }
}
