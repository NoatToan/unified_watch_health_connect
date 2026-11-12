package com.huawei.hwcrowdtestapi;

import defpackage.ltn;

/* JADX INFO: loaded from: classes10.dex */
public interface HealthFeedbackCallback {
    ltn collectLogs(int i, String str, String str2, boolean z);

    void onFailed(String str);
}
