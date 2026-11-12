package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class tql {
    public static void e(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("DEVMGR_ScreenshotSettingUtil", "jumpScreenshotSettingH5 is enter");
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        ddv ddvVarB = ddv.b();
        builder.addPath("#/screenshotSetting?deviceId=" + deviceInfo.getDeviceIdentify());
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        builder.addCustomizeJsModule("BasePairManager", BasePairManagerJsApi.class);
        builder.addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device"));
        builder.setForceDarkMode(1);
        builder.setImmerse().showStatusBar();
        ddvVarB.initH5Pro();
        H5ProClient.getServiceManager().registerService(DeviceGeneralSettingManagerService.class);
        H5ProClient.startH5MiniProgram(BaseApplication.getContext(), "com.huawei.health.h5.dm-ccbk", builder.build());
    }

    public static void a(final IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("900500040");
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: tql.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("DEVMGR_ScreenshotSettingUtil", "getSwitchStatus errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (i != 0) {
                    iBaseResponseCallback.a(0, "0");
                    return;
                }
                if (!njy.b(obj, HiSampleConfig.class)) {
                    iBaseResponseCallback.a(0, "0");
                    ReleaseLogUtil.e("DEVMGR_ScreenshotSettingUtil", "getSwitchStatus isListTypeMatch false");
                    return;
                }
                List list = (List) obj;
                if (njy.e(list)) {
                    iBaseResponseCallback.a(0, "0");
                    ReleaseLogUtil.e("DEVMGR_ScreenshotSettingUtil", "getSwitchStatus list isEmpty");
                    return;
                }
                HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                if (hiSampleConfig == null) {
                    iBaseResponseCallback.a(0, "0");
                    ReleaseLogUtil.e("DEVMGR_ScreenshotSettingUtil", "getSwitchStatus hiSampleConfig is null");
                } else {
                    String configData = hiSampleConfig.getConfigData();
                    ReleaseLogUtil.d("DEVMGR_ScreenshotSettingUtil", "getSwitchStatus configData is ", configData);
                    iBaseResponseCallback.a(0, ffv.a(configData, "watchScreenshotWithBodySwitch"));
                }
            }
        });
    }
}
