package com.xiaomi.fit.fitness.sync.export.api;

import com.amap.api.maps.model.MyLocationStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J$\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncCallback;", "", "onSyncSuccess", "", "did", "", "type", "", "onSyncError", MyLocationStyle.ERROR_INFO, "fitness-sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ExternalFitnessSyncCallback {
    void onSyncError(@Nullable String did, int type, @Nullable String errorInfo);

    void onSyncSuccess(@Nullable String did, int type);
}
