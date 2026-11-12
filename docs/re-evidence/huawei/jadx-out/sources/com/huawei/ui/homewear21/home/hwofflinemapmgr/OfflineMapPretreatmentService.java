package com.huawei.ui.homewear21.home.hwofflinemapmgr;

import android.content.Context;
import android.net.Uri;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.init.OfflineMapInitManager;
import com.huawei.maps.offlinedata.health.init.OfflineMapInitOptions;
import com.huawei.maps.offlinedata.health.init.OnCreateResultListener;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.ui.homewear21.R;
import defpackage.ecu;
import defpackage.lsy;
import defpackage.mga;
import defpackage.qpx;
import defpackage.rdo;
import defpackage.xjt;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineMapPretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        LogUtil.a("Track_OfflineMapPretreatmentService", "enter offlineMap pretreatment");
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_OfflineMapPretreatmentService");
        if (!((DeviceFeatureSupportApi) Services.b("Module_Device_Feature", DeviceFeatureSupportApi.class)).isSupportOfflineMap(deviceInfo)) {
            LogUtil.a("Track_OfflineMapPretreatmentService", "not support offline map");
            return false;
        }
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.e("Track_OfflineMapPretreatmentService", "uri is null.");
            return false;
        }
        LogUtil.a("Track_OfflineMapPretreatmentService", "uri:", uriO.getQuery(), " getPageType ", Integer.valueOf(b(uriO)));
        int iB = b(uriO);
        if (iB == 1) {
            c();
        } else if (iB == 2) {
            if (deviceInfo != null) {
                rdo.b().a(BaseApplication.getContext(), deviceInfo.getDeviceUdid());
            }
            a();
        } else {
            xjt.ai("PretreatmentService:unknown deeplink");
        }
        return false;
    }

    private void a() {
        final DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_OfflineMapPretreatmentService");
        boolean z = deviceInfo != null;
        ReleaseLogUtil.d("Track_OfflineMapPretreatmentService", "startMapPage enter isConnected ", Boolean.valueOf(z));
        if (z) {
            if (mga.h()) {
                qpx.e(com.huawei.haf.application.BaseApplication.b(), R.string.IDS_offline_map_mcu_mode_tip);
                return;
            } else {
                lsy.a(new Runnable() { // from class: tpa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49478b.c(deviceInfo);
                    }
                });
                return;
            }
        }
        xjt.ai("startMapPage error because of Connect status");
    }

    public /* synthetic */ void c(DeviceInfo deviceInfo) {
        OnCreateResultListener onCreateResultListener = new OnCreateResultListener() { // from class: com.huawei.ui.homewear21.home.hwofflinemapmgr.OfflineMapPretreatmentService.3
            @Override // com.huawei.maps.offlinedata.health.init.OnCreateResultListener
            public void onCreateResult(boolean z) {
                LogUtil.a("Track_OfflineMapPretreatmentService", "jumpToOfflineMap onCreateResultListener result: ", Boolean.valueOf(z));
            }
        };
        OfflineMapInitOptions offlineMapInitOptions = new OfflineMapInitOptions();
        offlineMapInitOptions.setContext(com.huawei.haf.application.BaseApplication.f());
        offlineMapInitOptions.setDeviceName(deviceInfo.getDeviceName());
        offlineMapInitOptions.setUniqueDevice(deviceInfo.getDeviceUdid());
        H5proUtil.initH5pro();
        offlineMapInitOptions.setH5proUrl(rdo.b().d());
        boolean zCreateOfflineDataMap = OfflineMapInitManager.getInstance().createOfflineDataMap(offlineMapInitOptions, onCreateResultListener);
        if (!zCreateOfflineDataMap) {
            xjt.ai("open map page error");
        }
        ReleaseLogUtil.d("Track_OfflineMapPretreatmentService", "startMapPage enter ", Boolean.valueOf(zCreateOfflineDataMap));
    }

    public static int b(Uri uri) {
        try {
            int iJ = CommonUtils.j(uri.getQueryParameter(CommonUtil.PAGE_TYPE));
            LogUtil.a("Track_OfflineMapPretreatmentService", "type:", Integer.valueOf(iJ));
            return iJ;
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            LogUtil.e("Track_OfflineMapPretreatmentService", "get type IllegalArgumentException:", CommonUtil.PAGE_TYPE, LogAnonymous.b(e));
            return -1;
        }
    }

    private void c() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homewear21.home.hwofflinemapmgr.OfflineMapPretreatmentService.4
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("Track_OfflineMapPretreatmentService", "get OfflineMapPretreatmentService instance in new thread");
                DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_OfflineMapPretreatmentService");
                boolean z = deviceInfo != null;
                int i = 2;
                while (!z && i > 0) {
                    try {
                        Thread.sleep(2000L);
                        deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_OfflineMapPretreatmentService");
                        z = deviceInfo != null;
                        i--;
                    } catch (InterruptedException unused) {
                        LogUtil.e("Track_OfflineMapPretreatmentService", "thread sleep error");
                    }
                }
                if (!z) {
                    LogUtil.j("register fail", new Object[0]);
                    xjt.ai("ping error error because of Connect status");
                } else {
                    rdo.b().a(BaseApplication.getContext(), deviceInfo.getDeviceUdid());
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException unused2) {
                        LogUtil.e("Track_OfflineMapPretreatmentService", "thread sleep error");
                    }
                    rdo.b().a();
                }
            }
        });
    }
}
