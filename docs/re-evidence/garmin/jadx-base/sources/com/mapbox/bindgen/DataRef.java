package com.mapbox.bindgen;

import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class DataRef {
    private ByteBuffer buffer;
    private long peer;

    public static class DataRefPeerCleaner implements Runnable {
        private long peer;

        public DataRefPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            DataRef.cleanNativePeer(this.peer);
        }
    }

    public DataRef(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            this.buffer = byteBuffer;
        } else {
            h.s("Buffer must be an instance of class java.nio.DirectByteBuffer(created by ByteBuffer#allocateDirect() or JNI#NewDirectByteBuffer()).");
            throw null;
        }
    }

    public static DataRef allocateNative(int i14) {
        if (i14 >= 0) {
            return allocateNativeMemory(i14);
        }
        h.s("Buffer size must be a non-negative integer");
        return null;
    }

    public static native DataRef allocateNativeMemory(int i14);

    public static native void cleanNativePeer(long j8);

    private void setPeer(long j8) {
        this.peer = j8;
        CleanerService.register(this.buffer, new DataRefPeerCleaner(j8));
    }

    public ByteBuffer getBuffer() {
        return this.buffer.duplicate();
    }

    private DataRef(long j8, ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        setPeer(j8);
    }
}
