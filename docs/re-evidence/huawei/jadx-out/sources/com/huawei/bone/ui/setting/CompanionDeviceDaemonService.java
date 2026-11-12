package com.huawei.bone.ui.setting;

import android.companion.AssociationInfo;
import android.companion.CompanionDeviceService;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class CompanionDeviceDaemonService extends CompanionDeviceService {
    public void onDeviceAppeared(AssociationInfo associationInfo) {
        ReleaseLogUtil.c("CompanionDeviceDaemonService", "Device onDeviceAppeared.");
        try {
            super.onDeviceAppeared(associationInfo);
        } catch (AbstractMethodError e) {
            LogUtil.e("CompanionDeviceDaemonService", "Device appeared:", e.getMessage());
        }
    }

    public void onDeviceDisappeared(AssociationInfo associationInfo) {
        ReleaseLogUtil.c("CompanionDeviceDaemonService", "Device onDeviceDisappeared.");
        try {
            super.onDeviceDisappeared(associationInfo);
        } catch (AbstractMethodError e) {
            LogUtil.e("CompanionDeviceDaemonService", "Device disappeared:", e.getMessage());
        }
    }

    public void onDeviceAppeared(String str) {
        ReleaseLogUtil.c("CompanionDeviceDaemonService", "Device appeared.");
        try {
            super.onDeviceAppeared(str);
        } catch (AbstractMethodError e) {
            LogUtil.e("CompanionDeviceDaemonService", "Device appeared:", e.getMessage());
        }
    }

    public void onDeviceDisappeared(String str) {
        ReleaseLogUtil.c("CompanionDeviceDaemonService", "Device disappeared.");
        try {
            super.onDeviceDisappeared(str);
        } catch (AbstractMethodError e) {
            LogUtil.e("CompanionDeviceDaemonService", "Device disappeared:", e.getMessage());
        }
    }
}
