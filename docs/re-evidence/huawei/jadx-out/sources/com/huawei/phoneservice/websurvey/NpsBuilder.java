package com.huawei.phoneservice.websurvey;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class NpsBuilder {
    private static final String TAG = "NpsBuilder";
    private final Map<String, String> map = new ConcurrentHashMap();

    public NpsBuilder set(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.map.put(str, str2);
        }
        return this;
    }

    public Map<String, String> build() {
        return this.map;
    }
}
