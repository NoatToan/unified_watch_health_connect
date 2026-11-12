package com.xmlywind.wire.okio;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ForwardingSink implements Sink {
    private final Sink delegate;

    public ForwardingSink(Sink sink) {
        if (sink == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = sink;
    }

    @Override // com.xmlywind.wire.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final Sink delegate() {
        return this.delegate;
    }

    @Override // com.xmlywind.wire.okio.Sink, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // com.xmlywind.wire.okio.Sink
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.delegate.toString() + ")";
    }

    @Override // com.xmlywind.wire.okio.Sink
    public void write(Buffer buffer, long j) {
        this.delegate.write(buffer, j);
    }
}
