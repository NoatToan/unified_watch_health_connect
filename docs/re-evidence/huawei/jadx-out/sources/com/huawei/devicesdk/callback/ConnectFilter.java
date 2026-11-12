package com.huawei.devicesdk.callback;

import com.huawei.unitedevice.entity.UniteDevice;
import defpackage.cmg;

/* JADX INFO: loaded from: classes4.dex */
public interface ConnectFilter {
    int onFilter(UniteDevice uniteDevice, String str, cmg cmgVar);

    String preProcess(UniteDevice uniteDevice, String str);
}
