package com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.commonTask.base;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import defpackage.eea;
import defpackage.eee;

/* JADX INFO: loaded from: classes11.dex */
public interface TaskInterface {
    void handleEvent(DeviceInfo deviceInfo, eee eeeVar);

    void handlePoint(DeviceInfo deviceInfo, eea eeaVar);
}
