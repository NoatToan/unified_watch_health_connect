package com.huawei.hwdevice.phoneprocess.mgr.linkage.eventproducer;

import defpackage.eee;

/* JADX INFO: loaded from: classes11.dex */
public interface SampleEventProducer {
    eee createSampleEvent(int i, String str);

    default eee sampleEventBulid(long j, byte[] bArr) {
        eee eeeVar = new eee();
        eeeVar.a(j);
        eeeVar.a(0);
        eeeVar.setSrcPkgName("hw.sport.linkage.app");
        eeeVar.setWearPkgName("hw.sport.linkage.device");
        eeeVar.e(bArr);
        return eeeVar;
    }
}
