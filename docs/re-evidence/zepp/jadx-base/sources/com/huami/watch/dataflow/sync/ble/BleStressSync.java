package com.huami.watch.dataflow.sync.ble;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.dataflow.sync.BaseDataSync;
import com.huami.watch.dataflow.sync.DataFlowSyncModule;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.huami.watch.dataflow.sync.bean.SyncResult;
import com.huami.watch.util.Log;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001a\u0010\r\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0014¨\u0006\u0012"}, d2 = {"Lcom/huami/watch/dataflow/sync/ble/BleStressSync;", "Lcom/huami/watch/dataflow/sync/BaseDataSync;", "Ljava/lang/Void;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/watch/dataflow/sync/bean/SyncResult;", "sync", "", "data", "parseSyncData", "", "isSyncDataEmpty", "saveToLocal", "postToCloud", "processResult", "tag", "<init>", "()V", "companionlib_release"}, k = 1, mv = {1, 4, 0})
public final class BleStressSync extends BaseDataSync<Void> {
    public BleStressSync() {
        super(DataType.STRESS);
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync
    @NotNull
    public SyncResult sync(@Nullable Context context) {
        SyncResult syncResult = new SyncResult();
        Log.i(tag(), "=============== Sync WatchData Start... ===============", new Object[0]);
        syncResult.success = DataFlowSyncModule.syncData(DataType.STRESS.getValue());
        Log.d(tag(), "Sync WatchData, Success: " + syncResult.success, new Object[0]);
        Log.i(tag(), "=============== Sync WatchData End ===============", new Object[0]);
        return syncResult;
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync
    @NotNull
    public String tag() {
        return "DataFlow-BLE-Stress";
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean isSyncDataEmpty(@NotNull Void data) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.watch.dataflow.sync.a
    @Nullable
    public Void parseSyncData(@NotNull String data) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean postToCloud(@Nullable Context context, @NotNull Void data) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.watch.dataflow.sync.a
    @NotNull
    public SyncResult processResult(@Nullable Context context, @NotNull Void data) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean saveToLocal(@Nullable Context context, @NotNull Void data) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
