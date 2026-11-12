package com.huami.watch.dataflow.sync;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.huami.watch.dataflow.sync.bean.SyncResult;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseDataSync<SyncData> implements a<SyncData> {
    public DataType a;

    public BaseDataSync(DataType dataType) {
        this.a = dataType;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public Object prepareRequestData() {
        return new Object();
    }

    @NonNull
    public SyncResult saveToLocalAndToCloud(Context context, @NonNull SyncData syncdata) {
        SyncResult syncResult = new SyncResult();
        if (isSyncDataEmpty(syncdata)) {
            syncResult.success = true;
            syncResult.dataEmpty = true;
            return syncResult;
        }
        boolean zSaveToLocal = saveToLocal(context, syncdata);
        Log.d(tag(), "Save to Local, Success: " + zSaveToLocal, new Object[0]);
        boolean zPostToCloud = postToCloud(context, syncdata);
        Log.d(tag(), "Post to Cloud, Success: " + zPostToCloud, new Object[0]);
        if (!zPostToCloud) {
            return syncResult;
        }
        SyncResult syncResultProcessResult = processResult(context, syncdata);
        syncResultProcessResult.success = true;
        return syncResultProcessResult;
    }

    @NonNull
    public SyncResult sync(Context context, String str) {
        SyncResult syncResult = new SyncResult();
        if (TextUtils.isEmpty(str)) {
            syncResult.success = true;
            syncResult.dataEmpty = true;
            Log.i(tag(), "Sync WatchData Empty!!", new Object[0]);
        } else {
            SyncData syncData = parseSyncData(str);
            if (syncData != null) {
                Log.i(tag(), "=============== Save Start... ===============", new Object[0]);
                syncResult = saveToLocalAndToCloud(context, syncData);
                Log.i(tag(), "=============== Save End ===============", new Object[0]);
            } else {
                Log.w(tag(), "Parse WatchData Fail!!", new Object[0]);
            }
        }
        Log.d(tag(), "Sync Result: " + syncResult, new Object[0]);
        return syncResult;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public SyncData syncWatchData() {
        return null;
    }

    public abstract String tag();

    @NonNull
    public SyncResult sync(Context context) {
        Log.i(tag(), "=============== Sync WatchData Start... ===============", new Object[0]);
        SyncData syncdataSyncWatchData = syncWatchData();
        Log.d(tag(), "Sync WatchData: " + syncdataSyncWatchData, new Object[0]);
        Log.i(tag(), "=============== Sync WatchData End ===============", new Object[0]);
        SyncResult syncResult = new SyncResult();
        if (syncdataSyncWatchData != null) {
            Log.i(tag(), "=============== Save Start... ===============", new Object[0]);
            syncResult = saveToLocalAndToCloud(context, syncdataSyncWatchData);
            Log.i(tag(), "=============== Save End ===============", new Object[0]);
        } else {
            Log.w(tag(), "Sync WatchData Fail!!", new Object[0]);
        }
        Log.d(tag(), "Sync Result: " + syncResult, new Object[0]);
        return syncResult;
    }
}
