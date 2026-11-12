package defpackage;

import android.app.Activity;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper;

/* JADX INFO: loaded from: classes17.dex */
public class rth extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithOtaTransfering() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        LogUtil.a("WechatDeviceStrategy", "enter Wechat bind");
        final Activity activity = BaseApplication.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: rtj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47633b.e(activity);
                }
            });
        } else {
            LogUtil.a("WechatDeviceStrategy", "activity is null");
        }
        return true;
    }

    /* synthetic */ void e(Activity activity) {
        new WechatDeviceProviderHelper(this.mDeviceInfo, HandlerExecutor.a()).c(activity);
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d("wechat_devices");
    }
}
