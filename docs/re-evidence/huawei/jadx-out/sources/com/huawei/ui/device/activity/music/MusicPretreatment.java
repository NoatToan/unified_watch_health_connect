package com.huawei.ui.device.activity.music;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import defpackage.ecu;
import defpackage.iov;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes3.dex */
public class MusicPretreatment implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        e(context, guidepost);
        return false;
    }

    private void e(Context context, Guidepost guidepost) {
        Uri uriO = guidepost.o();
        ReleaseLogUtil.c("R_MusicPretreatment", "jumpToActivity uri:", uriO);
        if (uriO == null) {
            return;
        }
        String string = uriO.toString();
        if (!TextUtils.isEmpty(string) && string.contains("musicManagement")) {
            DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "MusicPretreatment");
            DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(context).e(deviceInfo.getDeviceIdentify());
            if (deviceCapabilityE == null) {
                ReleaseLogUtil.d("R_MusicPretreatment", "deviceCapability is null");
            } else {
                if (deviceCapabilityE.isSupportMusicInfoList()) {
                    Intent intent = new Intent(context, (Class<?>) MusicMainActivity.class);
                    intent.putExtra("device_id", deviceInfo.getDeviceIdentify());
                    iov.d(context, intent);
                    return;
                }
                ReleaseLogUtil.d("R_MusicPretreatment", "is not supportMusicInfoList");
            }
        }
    }
}
