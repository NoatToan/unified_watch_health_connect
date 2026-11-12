package com.huawei.health.knit.data;

import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public interface KnitHealthDataChangeListener {
    void onDataDeleted();

    void onDataInserted(long j);

    void setSubscribeList(List<Integer> list);
}
