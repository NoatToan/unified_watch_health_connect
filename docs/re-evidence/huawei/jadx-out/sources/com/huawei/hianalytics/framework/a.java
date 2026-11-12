package com.huawei.hianalytics.framework;

import android.text.TextUtils;
import com.huawei.hianalytics.framework.config.ICollectorConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static String a(String str, String str2) {
        String collectUrl = ((ICollectorConfig) b.e.f11499b.get(str)).getCollectUrl(str2);
        if (TextUtils.isEmpty(collectUrl)) {
            return "";
        }
        return "maint".equals(str2) ? "{url}/common/hmshimaintqrt".replace("{url}", collectUrl) : "{url}/common/hmshioperqrt".replace("{url}", collectUrl);
    }
}
