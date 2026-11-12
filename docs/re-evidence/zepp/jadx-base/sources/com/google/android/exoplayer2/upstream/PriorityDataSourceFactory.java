package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.PriorityTaskManager;

/* JADX INFO: loaded from: classes3.dex */
public final class PriorityDataSourceFactory implements DataSource.Factory {
    private final DataSource.Factory a;
    private final PriorityTaskManager b;
    private final int c;

    public PriorityDataSourceFactory(DataSource.Factory upstreamFactory, PriorityTaskManager priorityTaskManager, int priority) {
        this.a = upstreamFactory;
        this.b = priorityTaskManager;
        this.c = priority;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public PriorityDataSource createDataSource() {
        return new PriorityDataSource(this.a.createDataSource(), this.b, this.c);
    }
}
