package com.huami.respiratoryrate.core.synctime.remote;

import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated(message = "使用UserProperty")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/respiratoryrate/core/synctime/remote/SyncTimeWebApiImpl;", "Lcom/huami/respiratoryrate/core/synctime/remote/ISyncTimeWebApi;", "", "loadSyncTime", "timeInMillis", "", "postSyncTime", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class SyncTimeWebApiImpl implements ISyncTimeWebApi {
    @Override // com.huami.respiratoryrate.core.synctime.remote.ISyncTimeWebApi
    public long loadSyncTime() {
        return 0L;
    }

    @Override // com.huami.respiratoryrate.core.synctime.remote.ISyncTimeWebApi
    public boolean postSyncTime(long timeInMillis) {
        return false;
    }
}
