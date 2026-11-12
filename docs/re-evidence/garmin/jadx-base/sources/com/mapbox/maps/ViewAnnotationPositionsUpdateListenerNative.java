package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ViewAnnotationPositionsUpdateListenerNative implements ViewAnnotationPositionsUpdateListener {
    protected long peer;

    public static class ViewAnnotationPositionsUpdateListenerPeerCleaner implements Runnable {
        private long peer;

        public ViewAnnotationPositionsUpdateListenerPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewAnnotationPositionsUpdateListenerNative.cleanNativePeer(this.peer);
        }
    }

    public ViewAnnotationPositionsUpdateListenerNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new ViewAnnotationPositionsUpdateListenerPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.ViewAnnotationPositionsUpdateListener
    public native void onViewAnnotationPositionsUpdate(List<ViewAnnotationPositionDescriptor> list);
}
