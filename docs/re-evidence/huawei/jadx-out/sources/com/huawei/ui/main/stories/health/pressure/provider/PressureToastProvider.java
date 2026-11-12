package com.huawei.ui.main.stories.health.pressure.provider;

import android.content.Context;
import android.content.Intent;
import android.widget.RelativeLayout;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.listener.ILayoutCreatedCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.R;
import defpackage.iov;
import defpackage.lvb;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.qjy;
import defpackage.wux;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class PressureToastProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f28028b;
    private Context d;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void e(Context context, SectionBean sectionBean) {
        LogUtil.a("PressureToastProvider", "loadData");
        this.d = context;
        sectionBean.c(new Object());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("PressureToastProvider", "parseParams");
        map.put("FULL_SCREEN_CALLBACK", new ILayoutCreatedCallback() { // from class: com.huawei.ui.main.stories.health.pressure.provider.PressureToastProvider.5
            @Override // com.huawei.health.knit.section.listener.ILayoutCreatedCallback
            public void onLayoutUpdate(RelativeLayout relativeLayout) {
                LogUtil.a("PressureToastProvider", "onLayoutUpdate, view: ", relativeLayout);
                PressureToastProvider.this.f28028b = relativeLayout;
                PressureToastProvider.this.c();
            }
        });
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        LogUtil.a("PressureToastProvider", "resume");
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("PressureToastProvider", "configToast pressure");
        if (this.f28028b == null) {
            LogUtil.a("PressureToastProvider", "mBtnTipsLayout is null");
            return;
        }
        if (CommonUtil.ab(this.d)) {
            DeviceInfo deviceInfoC = mgg.c("PressureToastProvider");
            boolean isLogined = LoginInit.getInstance(this.d).getIsLogined();
            LogUtil.a("PressureToastProvider", "onResume ", "isLogin = ", Boolean.valueOf(isLogined));
            if (!isLogined || deviceInfoC == null) {
                return;
            }
            LogUtil.a("PressureToastProvider", "currentDeviceInfo", deviceInfoC.toString());
            if (deviceInfoC.getDeviceConnectState() == 2) {
                e(deviceInfoC);
            }
        }
    }

    private void e(DeviceInfo deviceInfo) {
        boolean zC = c(deviceInfo);
        LogUtil.a("PressureToastProvider", "isSupportPressAutoMonitor = ", Boolean.valueOf(zC));
        if (zC) {
            mhs.a().getSwitchSetting("press_auto_monitor_switch_status", new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.health.pressure.provider.PressureToastProvider.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("PressureToastProvider", "processIfDeviceSupportPressureAutoMonitor errorCode = ", Integer.valueOf(i));
                    if (i == -1) {
                        PressureToastProvider.this.b();
                        return;
                    }
                    if (i == 0 && (obj instanceof String)) {
                        if ("false".equals((String) obj)) {
                            PressureToastProvider.this.b();
                            return;
                        }
                        return;
                    }
                    LogUtil.a("PressureToastProvider", "processIfDeviceSupportPressureAutoMonitor errorCode is other.");
                }
            });
        }
    }

    private boolean c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceInfo.getDeviceIdentify(), "PressureToastProvider");
        if (mapD == null || mapD.isEmpty()) {
            LogUtil.j("PressureToastProvider", "inquireDeviceMsdpCapability, deviceCapabilityHashMaps is empty");
            return false;
        }
        DeviceCapability deviceCapability = mapD.get(deviceInfo.getDeviceIdentify());
        return deviceCapability != null && deviceCapability.isSupportPressAutoMonitor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        qjy.d(this.d, new IBaseResponseCallback() { // from class: uyn
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f50742b.d(i, obj);
            }
        }, this.f28028b, this.d.getResources().getString(R.string.IDS_hw_open_auto_pressure_detector_content, wux.e()), new String[]{"pressure_auto_detector_agree_no_again_tip", "pressure_auto_detector_dialog_time", "pressure_auto_detector_count", "pressure_auto_detetor_is_show"});
    }

    public /* synthetic */ void d(int i, Object obj) {
        LogUtil.a("PressureToastProvider", "errorCode = ", Integer.valueOf(i));
        if (i == 0) {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setPackage(BaseApplication.getAppPackage());
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity");
            intent.putExtra("pressure_is_have_datas", false);
            intent.putExtra("from_card", true);
            iov.d(this.d, intent);
        }
    }
}
