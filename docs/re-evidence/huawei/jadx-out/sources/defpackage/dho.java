package defpackage;

import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dho extends JumpDeviceStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeviceInfo f31794b = getJumpDeviceInfo();

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        if (!isConnected()) {
            showNotConnectedToast();
            return false;
        }
        if (this.f31794b != null) {
            return true;
        }
        showUnsupportedToast();
        return false;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean checkSupportCapability(DeviceInfo deviceInfo) {
        return GolfDeviceProxy.getInstance().isSupportGolfClub();
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        if (this.mContext == null) {
            LogUtil.j("JumpGolfClubStrategy", "mContext is null");
            return;
        }
        ddv.b().initH5Pro();
        ddv ddvVarB = ddv.b();
        H5ProLaunchOption.Builder builderShowStatusBar = new H5ProLaunchOption.Builder().addPath("#/clubData").setImmerse().showStatusBar();
        builderShowStatusBar.addCustomizeJsModule(RemoteMessageConst.NOTIFICATION, ddv.b().getCommonJsModule(RemoteMessageConst.NOTIFICATION));
        builderShowStatusBar.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        builderShowStatusBar.addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement"));
        SeriesCourseH5Repository.registerService();
        ddvVarB.loadH5ProApp(this.mContext, "com.huawei.health.h5.golf", builderShowStatusBar);
        ReleaseLogUtil.d("JumpGolfClubStrategy", "gotoGolfClubInfoH5View success");
    }
}
