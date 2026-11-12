package com.huawei.health.baseapi.hiaiengine;

/* JADX INFO: loaded from: classes6.dex */
public interface HiAiKitInitTtsListener {
    void onInit();

    void onTtsComplete(String str);

    void onTtsError(int i, String str);

    void onTtsStart(String str);
}
