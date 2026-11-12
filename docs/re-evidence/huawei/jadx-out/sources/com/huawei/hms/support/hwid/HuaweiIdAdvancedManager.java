package com.huawei.hms.support.hwid;

import android.content.Context;
import com.huawei.hms.support.hwid.service.HuaweiIdAdvancedService;
import com.huawei.hms.support.hwid.service.b;

/* JADX INFO: loaded from: classes10.dex */
public class HuaweiIdAdvancedManager {
    public static HuaweiIdAdvancedService getService(Context context) {
        return new b(context);
    }
}
