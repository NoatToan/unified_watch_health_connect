package com.xiaomi.hm.health.bt.profile.gdsp.base;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCodeAdapter;", "", "", "code", "adapter2DeviceErrorCode", "errorCode", "adapter2AppErrorCode", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface GDSPErrorCodeAdapter {
    int adapter2AppErrorCode(int errorCode);

    int adapter2DeviceErrorCode(int code);
}
