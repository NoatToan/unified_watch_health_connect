package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class InteractionHandlerNative implements InteractionHandler {
    protected long peer;

    public static class InteractionHandlerPeerCleaner implements Runnable {
        private long peer;

        public InteractionHandlerPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            InteractionHandlerNative.cleanNativePeer(this.peer);
        }
    }

    public InteractionHandlerNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new InteractionHandlerPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.InteractionHandler
    public native boolean handleBegin(QueriedFeature queriedFeature, InteractionContext interactionContext);

    @Override // com.mapbox.maps.InteractionHandler
    public native void handleChange(InteractionContext interactionContext);

    @Override // com.mapbox.maps.InteractionHandler
    public native void handleEnd(InteractionContext interactionContext);
}
