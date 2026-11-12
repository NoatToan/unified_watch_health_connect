package com.huawei.ui.thirdpartservice.interactors.callback;

import defpackage.xcp;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public interface SupportDeviceResultCallback {
    void obtainBindDeviceList(List<xcp> list);

    default void obtainSupportDeviceList(List<xcp> list) {
    }

    void onError(int i, String str);
}
