package com.huami.watch.companion.sync.throttle;

import com.huami.watch.companion.sync.throttle.bean.SyncTag;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;

/* JADX INFO: loaded from: classes16.dex */
public class SyncIntervalThrottle implements a {
    private long a;
    private long b;

    public SyncIntervalThrottle(long j) {
        this.a = j;
    }

    @Override // com.huami.watch.companion.sync.throttle.a
    public long getLastSyncTime(String str) {
        return this.b;
    }

    @Override // com.huami.watch.companion.sync.throttle.a
    public boolean isThrough(SyncTag syncTag) {
        long lastSyncTime = getLastSyncTime(syncTag.getName());
        long jAbs = Math.abs(syncTag.getTime() - lastSyncTime);
        Log.d(tag(), "LastSyncTime : " + TimeUtil.formatDateTime(lastSyncTime) + ", " + TimeUtil.formatDuration(jAbs) + " > " + TimeUtil.formatDuration(this.a) + "?", new Object[0]);
        return jAbs > this.a;
    }

    public String tag() {
        return SyncThrottler.TAG;
    }

    @Override // com.huami.watch.companion.sync.throttle.a
    public void updateSyncTag(SyncTag syncTag) {
    }

    @Override // com.huami.watch.companion.sync.throttle.a
    public void updateSyncTime(long j) {
        this.b = j;
    }
}
