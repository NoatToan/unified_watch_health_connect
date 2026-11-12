package com.huami.respiratoryrate.core.synctime.remote;

import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated(message = "使用UserProperty")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/respiratoryrate/core/synctime/remote/ISyncTimeWebApi;", "", "", "loadSyncTime", "timeInMillis", "", "postSyncTime", "core_release"}, k = 1, mv = {1, 5, 1})
public interface ISyncTimeWebApi {
    long loadSyncTime();

    boolean postSyncTime(long timeInMillis);
}
