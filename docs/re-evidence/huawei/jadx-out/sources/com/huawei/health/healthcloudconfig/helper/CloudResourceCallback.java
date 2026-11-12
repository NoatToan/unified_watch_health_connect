package com.huawei.health.healthcloudconfig.helper;

import defpackage.fel;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public interface CloudResourceCallback {
    void onFailure(String str, String str2);

    default void onProgress(long j, long j2, boolean z, String str) {
    }

    void onSuccess(String str, List<fel> list);
}
