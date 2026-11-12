package com.xiaomi.hm.health.bt.scan;

import defpackage.f5t;
import defpackage.gdt;

/* JADX INFO: loaded from: classes11.dex */
public interface IBleScanCallback {
    void onScanError(f5t f5tVar);

    void onScanStart(f5t f5tVar);

    void onScanStop(f5t f5tVar);

    void onScanedDevice(gdt gdtVar, f5t f5tVar);
}
