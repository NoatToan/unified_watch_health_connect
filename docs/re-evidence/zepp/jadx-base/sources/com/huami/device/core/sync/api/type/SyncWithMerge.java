package com.huami.device.core.sync.api.type;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/device/core/sync/api/type/SyncWithMerge;", "DATA", "Lcom/huami/device/core/sync/api/type/SyncJob;", "loadCloudData", "()Ljava/lang/Object;", "loadLocalData", "merge", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public interface SyncWithMerge<DATA> extends SyncJob {
    DATA loadCloudData();

    DATA loadLocalData();

    DATA merge();
}
