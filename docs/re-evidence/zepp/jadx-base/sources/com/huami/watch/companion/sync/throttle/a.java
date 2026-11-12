package com.huami.watch.companion.sync.throttle;

import com.huami.watch.companion.sync.throttle.bean.SyncTag;

/* JADX INFO: loaded from: classes16.dex */
interface a {
    long getLastSyncTime(String str);

    boolean isThrough(SyncTag syncTag);

    void updateSyncTag(SyncTag syncTag);

    void updateSyncTime(long j);
}
