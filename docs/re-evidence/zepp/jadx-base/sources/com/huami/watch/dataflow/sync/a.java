package com.huami.watch.dataflow.sync;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.watch.dataflow.sync.bean.SyncResult;

/* JADX INFO: loaded from: classes16.dex */
interface a<SyncData> {
    boolean isSyncDataEmpty(@NonNull SyncData syncdata);

    @Nullable
    SyncData parseSyncData(@NonNull String str);

    boolean postToCloud(Context context, @NonNull SyncData syncdata);

    @Nullable
    Object prepareRequestData();

    @NonNull
    SyncResult processResult(Context context, @NonNull SyncData syncdata);

    boolean saveToLocal(Context context, @NonNull SyncData syncdata);

    @Nullable
    SyncData syncWatchData();
}
