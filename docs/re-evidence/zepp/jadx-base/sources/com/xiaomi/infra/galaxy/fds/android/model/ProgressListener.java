package com.xiaomi.infra.galaxy.fds.android.model;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ProgressListener {
    public abstract void onProgress(long j, long j2);

    public long progressInterval() {
        return 500L;
    }
}
