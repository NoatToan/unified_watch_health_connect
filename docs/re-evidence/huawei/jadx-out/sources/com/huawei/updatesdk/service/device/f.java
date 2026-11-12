package com.huawei.updatesdk.service.device;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class f extends c {
    @Override // com.huawei.updatesdk.service.device.c
    public List<String> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("CE1EF7188F820973C191227D95D54311ED3A65EC83E37009E898A1C058BBC775");
        return arrayList;
    }

    @Override // com.huawei.updatesdk.service.device.c
    String c() {
        return com.huawei.updatesdk.sdk.foundation.utils.device.c.a("ro.product.manufacturer", "");
    }

    @Override // com.huawei.updatesdk.service.device.c
    public String b() {
        return "com.huawei.appmarketwear";
    }

    @Override // com.huawei.updatesdk.service.device.c
    String a() {
        return com.huawei.updatesdk.sdk.foundation.utils.device.e.a() ? Build.PRODUCT : "";
    }
}
