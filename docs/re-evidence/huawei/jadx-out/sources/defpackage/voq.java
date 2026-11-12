package defpackage;

import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonRequest;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.main.stories.healthzone.model.FeedsPostReq;
import com.huawei.ui.main.stories.healthzone.model.GetHealthZoneVerifyCodeUserReq;
import com.huawei.ui.main.stories.healthzone.model.GetSpecifiedAuthUserReq;

/* JADX INFO: loaded from: classes19.dex */
public final class voq {
    public static void a(GetSpecifiedAuthUserReq getSpecifiedAuthUserReq, ICloudOperationResult<voa> iCloudOperationResult) {
        if (getSpecifiedAuthUserReq != null) {
            lqo.b(BaseApplication.getContext()).a("/healthCare/user/getUserListByFollowUser", getSpecifiedAuthUserReq, iCloudOperationResult, voa.class);
        } else {
            lqo.b(BaseApplication.getContext()).a("/healthCare/user/getUserListByFollowUser", new CloudCommonRequest(), iCloudOperationResult, voa.class);
        }
    }

    public static void c(ICloudOperationResult<vob> iCloudOperationResult) {
        lqo.b(BaseApplication.getContext()).a("/healthCare/user/getUserListByAuthUser", new CloudCommonRequest(), iCloudOperationResult, vob.class);
    }

    public static void c(GetHealthZoneVerifyCodeUserReq getHealthZoneVerifyCodeUserReq, ICloudOperationResult<vog> iCloudOperationResult) {
        lqo.b(BaseApplication.getContext()).a("/healthCare/user/getVerifyResult", getHealthZoneVerifyCodeUserReq, iCloudOperationResult, vog.class);
    }

    public static void e(ICloudOperationResult<vor> iCloudOperationResult) {
        lqo.b(BaseApplication.getContext()).a("/healthCare/user/getPendingMessage", new CloudCommonRequest(), iCloudOperationResult, vor.class);
    }

    public static void d(ICloudOperationResult<vol> iCloudOperationResult) {
        lqo.b(BaseApplication.getContext()).a("/healthCare/user/getMemberList", new CloudCommonRequest(), iCloudOperationResult, vol.class);
    }

    public static void a(ICloudOperationResult<voi> iCloudOperationResult) {
        lqo.b(BaseApplication.getContext()).a("/healthCare/abnormalPost/latestPostId", new CloudCommonRequest(), iCloudOperationResult, voi.class);
    }

    public static void e(FeedsPostReq feedsPostReq, ICloudOperationResult<vnw> iCloudOperationResult) {
        lqo.b(BaseApplication.getContext()).a("/healthCare/data/getFeedsPosts", feedsPostReq, iCloudOperationResult, vnw.class);
    }
}
