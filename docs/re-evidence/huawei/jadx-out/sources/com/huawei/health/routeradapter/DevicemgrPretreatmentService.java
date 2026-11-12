package com.huawei.health.routeradapter;

import android.content.Context;
import android.net.Uri;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.R;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import defpackage.ecu;
import defpackage.iov;
import defpackage.qre;
import defpackage.rpq;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes2.dex */
public class DevicemgrPretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.e("DevicemgrPretreatmentService", "uri is null.");
            return false;
        }
        int iC = c(uriO);
        LogUtil.a("DevicemgrPretreatmentService", "deeplink deviceMgrType is ", Integer.valueOf(iC));
        if (iC != 2 && iC != 12) {
            LogUtil.j("DevicemgrPretreatmentService", "deeplink deviceMgrType is invalid");
        } else {
            c(iC);
        }
        return false;
    }

    private void c(int i) {
        final DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "DevicemgrPretreatmentService");
        if (deviceInfo == null) {
            iov.d(BaseApplication.b(), Constants.HOME_TAB_DEVICE, qre.f(R.string.IDS_error_bluetooth_disabled));
            return;
        }
        DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
        if (deviceFeatureSupportApi == null) {
            LogUtil.j("DevicemgrPretreatmentService", "startDevicePage failed for featureSupportApi is null");
            return;
        }
        if (i != 2) {
            if (i != 12) {
                LogUtil.e("DevicemgrPretreatmentService", "startDevicePage failed for pageType is invalid");
                return;
            } else {
                deviceFeatureSupportApi.isSupportHealthCalendarSync(deviceInfo, new FeatureSupportCallback() { // from class: gvf
                    @Override // com.huawei.devicefeature.FeatureSupportCallback
                    public final void success(boolean z) {
                        this.d.b(deviceInfo, z);
                    }
                });
                return;
            }
        }
        if (!deviceFeatureSupportApi.isSupportMusic(deviceInfo)) {
            iov.d(BaseApplication.b(), Constants.HOME_TAB_DEVICE, qre.f(com.huawei.ui.homewear21.R.string.IDS_device_no_function));
        } else {
            rpq.c(FeatureType.MUSIC_MENU).jumpToFeaturePage(deviceInfo, new SimpleChain.Emitter() { // from class: gvb
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public final void onSuccess(Object[] objArr) {
                    LogUtil.a("DevicemgrPretreatmentService", "jumpToMusicManuPage onSuccess");
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.routeradapter.DevicemgrPretreatmentService$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f8696a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8697c;

        AnonymousClass3(boolean z, DeviceInfo deviceInfo) {
            this.f8697c = z;
            this.f8696a = deviceInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8697c) {
                rpq.c(FeatureType.CALENDAR).jumpToFeaturePage(this.f8696a, new SimpleChain.Emitter() { // from class: gvc
                    @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                    public final void onSuccess(Object[] objArr) {
                        LogUtil.a("DevicemgrPretreatmentService", "jumpToCalendarPage onSuccess");
                    }
                });
            } else {
                iov.d(BaseApplication.b(), Constants.HOME_TAB_DEVICE, qre.f(com.huawei.ui.homewear21.R.string.IDS_device_no_function));
            }
        }
    }

    public /* synthetic */ void b(DeviceInfo deviceInfo, boolean z) {
        HandlerExecutor.c(new AnonymousClass3(z, deviceInfo));
    }

    private static int c(Uri uri) {
        try {
            int iJ = CommonUtils.j(uri.getQueryParameter("deviceMgrType"));
            LogUtil.a("DevicemgrPretreatmentService", "type:", Integer.valueOf(iJ));
            return iJ;
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            LogUtil.e("DevicemgrPretreatmentService", "get type IllegalArgumentException:", LogAnonymous.b(e));
            return -1;
        }
    }
}
