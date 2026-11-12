package defpackage;

import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;

/* JADX INFO: loaded from: classes7.dex */
public class dht extends JumpDeviceStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeviceInfo f31797b = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        if (!isConnected()) {
            showNotConnectedToast();
            return false;
        }
        if (this.f31797b != null) {
            return true;
        }
        showUnsupportedToast();
        return false;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean checkSupportCapability(DeviceInfo deviceInfo) {
        if (this.featureSupportApi == null || deviceInfo == null) {
            return false;
        }
        return this.featureSupportApi.isSupportMusic(deviceInfo);
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        rpq.c(FeatureType.MUSIC_MENU).jumpToFeaturePage(this.f31797b, new SimpleChain.Emitter() { // from class: dhy
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                LogUtil.a("JumpMusicMenuStrategy", "jumpToMusicMenuPage onSuccess");
            }
        });
    }
}
