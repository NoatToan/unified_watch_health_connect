package defpackage;

import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.api.FeedbackApi;
import com.huawei.health.device.callback.FeedbackCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.annotation.ApiDefine;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = FeedbackApi.class)
public class sij implements FeedbackApi {
    @Override // com.huawei.health.device.api.FeedbackApi
    public void deviceBetaFeedback(String str, final FeedbackCallback feedbackCallback) {
        ReleaseLogUtil.c("Dfx_FeedbackImpl", "deviceBetaFeedback");
        final DeviceInfo deviceInfoC = mgg.c(str, "FeedbackImpl");
        if (deviceInfoC == null) {
            ReleaseLogUtil.d("Dfx_FeedbackImpl", "deviceInfo == null");
            feedbackCallback.onFail("device info is null");
        } else {
            HandlerExecutor.b(new Runnable() { // from class: sij.4
                @Override // java.lang.Runnable
                public void run() {
                    ReleaseLogUtil.c("Dfx_FeedbackImpl", "feedBackLogUtil handlerDeviceGotoFeedBack");
                    CommonUtil.c();
                    tez.e().b(deviceInfoC);
                    tez.e().c();
                    feedbackCallback.onSuccess();
                }
            });
        }
    }
}
