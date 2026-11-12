package defpackage;

import android.app.Activity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class rtd extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return false;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (this.mDeviceInfo == null) {
            LogUtil.j("WalletStrategy", "jumpPageToFace deviceInfo == null");
            return false;
        }
        SharedPreferenceManager.c("privacy_center", "bank_account", String.valueOf(System.currentTimeMillis()));
        if (WalletAppManager.getInstance().isOverseaService()) {
            WalletAppManager.getInstance().startNfcWalletH5();
            return false;
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e("WalletStrategy", "startActivity fail for activity is null");
        } else {
            tqp.b(activityJ);
            tqp.d(activityJ, this.mDeviceInfo.getDeviceIdentify());
        }
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HOME_1010018.value(), new HashMap(16), 0);
    }
}
