package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.hw;
import okhttp3.Request;

/* JADX INFO: loaded from: classes12.dex */
public class av {
    public boolean a() {
        try {
            new Request.Builder();
            return true;
        } catch (Throwable th) {
            hw.d("HttpUtils", "check okhttp error:%s", th.getClass().getSimpleName());
            return false;
        }
    }
}
