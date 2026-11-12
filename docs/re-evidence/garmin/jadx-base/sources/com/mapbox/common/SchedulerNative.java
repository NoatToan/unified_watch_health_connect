package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class SchedulerNative implements Scheduler {
    protected long peer;

    public static class SchedulerPeerCleaner implements Runnable {
        private long peer;

        public SchedulerPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SchedulerNative.cleanNativePeer(this.peer);
        }
    }

    public SchedulerNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new SchedulerPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.Scheduler
    public native SchedulerType getType();

    @Override // com.mapbox.common.Scheduler
    public native void schedule(Task task, TaskOptions taskOptions);
}
