package org.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class AbstractWrappedByteChannel implements WrappedByteChannel {
    private final ByteChannel a;

    @Deprecated
    public AbstractWrappedByteChannel(ByteChannel byteChannel) {
        this.a = byteChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // org.java_websocket.WrappedByteChannel
    public boolean isBlocking() {
        ByteChannel byteChannel = this.a;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).isBlocking();
        }
        return false;
    }

    @Override // org.java_websocket.WrappedByteChannel
    public boolean isNeedRead() {
        ByteChannel byteChannel = this.a;
        return (byteChannel instanceof WrappedByteChannel) && ((WrappedByteChannel) byteChannel).isNeedRead();
    }

    @Override // org.java_websocket.WrappedByteChannel
    public boolean isNeedWrite() {
        ByteChannel byteChannel = this.a;
        return (byteChannel instanceof WrappedByteChannel) && ((WrappedByteChannel) byteChannel).isNeedWrite();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.a.read(byteBuffer);
    }

    @Override // org.java_websocket.WrappedByteChannel
    public int readMore(ByteBuffer byteBuffer) throws IOException {
        ByteChannel byteChannel = this.a;
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).readMore(byteBuffer);
        }
        return 0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.a.write(byteBuffer);
    }

    @Override // org.java_websocket.WrappedByteChannel
    public void writeMore() throws IOException {
        ByteChannel byteChannel = this.a;
        if (byteChannel instanceof WrappedByteChannel) {
            ((WrappedByteChannel) byteChannel).writeMore();
        }
    }

    @Deprecated
    public AbstractWrappedByteChannel(WrappedByteChannel wrappedByteChannel) {
        this.a = wrappedByteChannel;
    }
}
