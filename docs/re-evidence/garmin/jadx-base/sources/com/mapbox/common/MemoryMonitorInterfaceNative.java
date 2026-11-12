package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class MemoryMonitorInterfaceNative implements MemoryMonitorInterface {
    protected long peer;

    public static class MemoryMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        public MemoryMonitorInterfacePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public MemoryMonitorInterfaceNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new MemoryMonitorInterfacePeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void getMemoryMonitorStatus(MemoryMonitorObserverConfig memoryMonitorObserverConfig, MemoryMonitorStatusCallback memoryMonitorStatusCallback);

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void notifySystemMemoryWarningReceived();

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void registerObserver(MemoryMonitorObserver memoryMonitorObserver);

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void registerObserverWithConfig(MemoryMonitorObserverConfig memoryMonitorObserverConfig, MemoryMonitorObserver memoryMonitorObserver);

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void unregisterObserver(MemoryMonitorObserver memoryMonitorObserver);
}
