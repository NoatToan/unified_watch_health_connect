package com.xmlywind.wire.okio;

import java.io.Closeable;

/* JADX INFO: loaded from: classes22.dex */
public interface Source extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(Buffer buffer, long j);

    Timeout timeout();
}
