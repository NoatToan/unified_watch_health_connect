package com.facebook.common.memory;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public interface PooledByteBuffer extends Closeable {

    public static class ClosedException extends RuntimeException {
        public ClosedException() {
            super("Invalid bytebuf. Already closed");
        }
    }

    int i(int i, byte[] bArr, int i2, int i3);

    boolean isClosed();

    byte k(int i);

    int size();
}
