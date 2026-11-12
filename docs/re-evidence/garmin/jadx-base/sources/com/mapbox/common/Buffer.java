package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;

/* JADX INFO: loaded from: classes2.dex */
public class Buffer {
    protected long peer;

    public static class BufferPeerCleaner implements Runnable {
        private long peer;

        public BufferPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            Buffer.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Buffer(DataRef dataRef) {
        initialize(dataRef);
    }

    public static native void cleanNativePeer(long j8);

    private native void initialize(DataRef dataRef);

    private native DataRef nativeGetData();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new BufferPeerCleaner(j8));
    }

    public DataRef getData() {
        return nativeGetData();
    }

    public Buffer(long j8) {
        setPeer(j8);
    }
}
