package com.huawei.hms.ads.analysis;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicLoaderAnalysis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f12753a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static DynamicLoaderAnalysis f12754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, IDynamicLoaderAnalysis> f12755c;

    public void registerDynamicLoaderAnalysis(String str, IDynamicLoaderAnalysis iDynamicLoaderAnalysis) {
        if (TextUtils.isEmpty(str) || iDynamicLoaderAnalysis == null) {
            return;
        }
        if (this.f12755c == null) {
            this.f12755c = new HashMap<>();
        }
        if (this.f12755c.containsKey(str)) {
            return;
        }
        this.f12755c.put(str, iDynamicLoaderAnalysis);
    }

    public void onLoaderSuccess(String str, long j) {
        HashMap<String, IDynamicLoaderAnalysis> map = this.f12755c;
        if (map == null) {
            return;
        }
        for (Map.Entry<String, IDynamicLoaderAnalysis> entry : map.entrySet()) {
            IDynamicLoaderAnalysis value = entry.getValue();
            if (value != null) {
                value.onLoaderSuccess(entry.getKey(), str, j);
            }
        }
    }

    public void onLoaderException(String str, int i, String str2) {
        HashMap<String, IDynamicLoaderAnalysis> map = this.f12755c;
        if (map == null) {
            return;
        }
        for (Map.Entry<String, IDynamicLoaderAnalysis> entry : map.entrySet()) {
            IDynamicLoaderAnalysis value = entry.getValue();
            if (value != null) {
                value.onLoaderException(entry.getKey(), str, i, str2);
            }
        }
    }

    public static DynamicLoaderAnalysis getInstance() {
        DynamicLoaderAnalysis dynamicLoaderAnalysis;
        synchronized (f12753a) {
            if (f12754b == null) {
                f12754b = new DynamicLoaderAnalysis();
            }
            dynamicLoaderAnalysis = f12754b;
        }
        return dynamicLoaderAnalysis;
    }

    private DynamicLoaderAnalysis() {
    }
}
