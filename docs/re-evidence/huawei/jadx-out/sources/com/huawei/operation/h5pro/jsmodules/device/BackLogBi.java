package com.huawei.operation.h5pro.jsmodules.device;

import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.operation.constants.PendingSettingTag;
import defpackage.lmf;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes41.dex */
public enum BackLogBi {
    NOTIFICATION_BAR(PendingSettingTag.NOTIFICATION_BAR, 101, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    MESSAGE_NOTIFICATION(PendingSettingTag.MESSAGE_NOTIFICATION, 102, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    ERAR_PHONE_MATCHING(PendingSettingTag.ERAR_PHONE_MATCHING, 103, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    ACCOUNT_SYNC(PendingSettingTag.ACCOUNT_SYNC, 104, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    NERAR_DEVICE_PERMISSION(PendingSettingTag.NERAR_DEVICE_PERMISSION, 105, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    LOCATION_PERMISSION(PendingSettingTag.LOCATION_PERMISSION, 106, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    SECRET_MESSAGE_PERMISSION(PendingSettingTag.SECRET_MESSAGE_PERMISSION, 107, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    ENABLE_NOTIFICATION(PendingSettingTag.ENABLE_NOTIFICATION, 108, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    CONNECT_PROTECT(PendingSettingTag.CONNECT_PROTECT, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    WECHAT_BINDING(PendingSettingTag.WECHAT_BINDING, 110, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    BEIDOU_MESSAGE(PendingSettingTag.BEIDOU_MESSAGE, 111, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    AUTO_UPGRADE_ON_WLAN(PendingSettingTag.AUTO_UPGRADE_ON_WLAN, 112, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    VERSION_UPGRADE(PendingSettingTag.VERSION_UPGRADE, CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    SOS_HELP_SET(PendingSettingTag.SOS_HELP_SET, 114, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    }),
    FALL_DETECTION(PendingSettingTag.FALL_DETECTION, 115, new IBackLogReport() { // from class: com.huawei.operation.h5pro.jsmodules.device.BackLogBi$$ExternalSyntheticLambda0
        @Override // com.huawei.operation.h5pro.jsmodules.device.IBackLogReport
        public final void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
            BackLogBi.reportToDoBiEvent(str, i, i2, i3, deviceInfo);
        }
    });

    private static final String TAG = "BackLogBi";
    private static final String TAG_RELEASE = "DEVMGR_BackLogBi";
    private IBackLogReport backLogReport;
    private int biValue;
    private String tag;

    private void reportBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
        this.backLogReport.reportBiEvent(str, i, i2, i3, deviceInfo);
    }

    public static void setEvent(String str, int i, int i2, DeviceInfo deviceInfo) {
        for (BackLogBi backLogBi : values()) {
            if (backLogBi.tag.equalsIgnoreCase(str)) {
                backLogBi.reportBiEvent(str, backLogBi.biValue, i, i2, deviceInfo);
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "Lack of big data points tag：", str);
            }
        }
    }

    BackLogBi(String str, int i, IBackLogReport iBackLogReport) {
        this.tag = str;
        this.biValue = i;
        this.backLogReport = iBackLogReport;
    }

    public static void reportToDoBiEvent(String str, int i, int i2, int i3, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "reportToDoBiEvent deviceInfo is null");
            return;
        }
        LogUtil.a(TAG, "reportToDoBiEvent tag:", str, ",actionType:", Integer.valueOf(i2), ",eventType:", Integer.valueOf(i3));
        HashMap map = new HashMap(16);
        map.put("tipType", 2);
        map.put("Content", Integer.valueOf(i));
        map.put("Action", Integer.valueOf(i2));
        map.put("device_name", deviceInfo.getDeviceName());
        map.put(DeviceCategoryFragment.DEVICE_TYPE, String.valueOf(deviceInfo.getProductType()));
        map.put("HiLinkDeviceId", deviceInfo.getHiLinkDeviceId());
        map.put("Page", "To-Do Page");
        map.put("Event", Integer.valueOf(i3));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.DEVICE_POP_TIP_EVENT_VALUE.value(), map, 0);
    }
}
