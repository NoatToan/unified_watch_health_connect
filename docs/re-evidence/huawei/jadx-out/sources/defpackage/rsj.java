package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.init.OfflineMapInitManager;
import com.huawei.maps.offlinedata.health.init.OfflineMapInitOptions;
import com.huawei.maps.offlinedata.health.init.OnCreateResultListener;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy;
import com.huawei.ui.homewear21.R;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class rsj extends FeatureBaseStrategy {
    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public boolean canJumpWithConnect() {
        return true;
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy, com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy
    public boolean jumpToFeaturePage(DeviceInfo deviceInfo, final SimpleChain.Emitter emitter) {
        if (super.jumpToFeaturePage(deviceInfo, emitter)) {
            return true;
        }
        if (this.mDeviceInfo == null) {
            LogUtil.j("OfflineMapStrategy", "jumpPageToFace deviceInfo == null");
            return false;
        }
        if (mga.h()) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_offline_map_mcu_mode_tip);
            return true;
        }
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_connect_network);
            LogUtil.j("OfflineMapStrategy", "Network not Available");
            return true;
        }
        rdo.b().a(BaseApplication.getContext(), this.mDeviceInfo.getDeviceUdid());
        SimpleChain.b("OfflineMapStrategy").e(new SimpleChain.INext() { // from class: rsh
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter2, Object[] objArr) {
                Executors.newCachedThreadPool().execute(new Runnable() { // from class: rsk
                    @Override // java.lang.Runnable
                    public final void run() {
                        rsj.c(emitter2);
                    }
                });
            }
        }).d(new SimpleChain.Emitter() { // from class: rsg
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                this.f47628b.e(emitter, objArr);
            }
        }, new Object[0]);
        return true;
    }

    static /* synthetic */ void c(SimpleChain.Emitter emitter) {
        H5proUtil.initH5pro();
        emitter.onSuccess(new Object[0]);
    }

    /* synthetic */ void e(final SimpleChain.Emitter emitter, Object[] objArr) {
        OfflineMapInitOptions offlineMapInitOptions = new OfflineMapInitOptions();
        offlineMapInitOptions.setContext(com.huawei.haf.application.BaseApplication.f());
        offlineMapInitOptions.setDeviceName(this.mDeviceInfo.getDeviceName());
        offlineMapInitOptions.setUniqueDevice(this.mDeviceInfo.getDeviceUdid());
        offlineMapInitOptions.setH5proUrl(rdo.b().d());
        boolean zCreateOfflineDataMap = OfflineMapInitManager.getInstance().createOfflineDataMap(offlineMapInitOptions, new OnCreateResultListener() { // from class: rsi
            @Override // com.huawei.maps.offlinedata.health.init.OnCreateResultListener
            public final void onCreateResult(boolean z) {
                emitter.onSuccess(true);
            }
        });
        ReleaseLogUtil.d("OfflineMapStrategy", "jumpToOfflineMap enter ", Boolean.valueOf(zCreateOfflineDataMap));
        if (zCreateOfflineDataMap) {
            return;
        }
        xjt.ai("open map page error");
        emitter.onError("open map page error");
    }

    @Override // com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureBaseStrategy
    public void reportBiEvent() {
        rdt.d("map");
    }
}
