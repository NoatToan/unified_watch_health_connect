package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class TaskNative implements Task {
    private long peer;

    public static class TaskPeerCleaner implements Runnable {
        private long peer;

        public TaskPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TaskNative.cleanNativePeer(this.peer);
        }
    }

    private TaskNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new TaskPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.Task
    public native void run();
}
