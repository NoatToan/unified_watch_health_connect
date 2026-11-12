package com.huawei.sim.esimhandler;

import defpackage.ocr;
import defpackage.pxp;

/* JADX INFO: loaded from: classes15.dex */
public interface EsimHandler {
    ocr getHwMultiDeviceManager();

    void handle(pxp pxpVar);

    void setHwMultiDeviceManager(ocr ocrVar);
}
