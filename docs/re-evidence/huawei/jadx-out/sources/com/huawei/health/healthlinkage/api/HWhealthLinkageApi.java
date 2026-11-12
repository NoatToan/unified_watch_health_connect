package com.huawei.health.healthlinkage.api;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface HWhealthLinkageApi {
    List<DeviceInfo> getLinkedDevice(int i);

    boolean isMediatorExist();

    boolean isMediatorInit();
}
