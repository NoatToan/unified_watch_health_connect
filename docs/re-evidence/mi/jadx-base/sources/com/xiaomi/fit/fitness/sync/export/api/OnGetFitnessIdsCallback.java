package com.xiaomi.fit.fitness.sync.export.api;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fit/fitness/sync/export/api/OnGetFitnessIdsCallback;", "", "onSuccess", "", "dataIds", "", "onError", "code", "", "fitness-sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OnGetFitnessIdsCallback {
    void onError(int code);

    void onSuccess(@Nullable byte[] dataIds);
}
