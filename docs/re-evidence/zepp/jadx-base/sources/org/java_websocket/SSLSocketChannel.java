package org.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import org.java_websocket.util.ByteBufferUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes23.dex */
public class SSLSocketChannel implements WrappedByteChannel, ByteChannel {
    private static final Logger h = LoggerFactory.getLogger((Class<?>) SSLSocketChannel.class);
    private final SocketChannel a;
    private final SSLEngine b;
    private ByteBuffer c;
    private ByteBuffer d;
    private ByteBuffer e;
    private ByteBuffer f;
    private ExecutorService g;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[SSLEngineResult.HandshakeStatus.values().length];
            b = iArr;
            try {
                iArr[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[SSLEngineResult.Status.values().length];
            a = iArr2;
            try {
                iArr2[SSLEngineResult.Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public SSLSocketChannel(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || this.g == executorService) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.a = socketChannel;
        this.b = sSLEngine;
        this.g = executorService;
        this.d = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        this.f = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        sSLEngine.beginHandshake();
        if (b()) {
            if (selectionKey != null) {
                selectionKey.interestOps(selectionKey.interestOps() | 4);
            }
        } else {
            try {
                socketChannel.close();
            } catch (IOException e) {
                h.error("Exception during the closing of the channel", (Throwable) e);
            }
        }
    }

    private void a() throws IOException {
        this.b.closeOutbound();
        try {
            b();
        } catch (IOException unused) {
        }
        this.a.close();
    }

    private boolean b() throws IOException {
        SSLEngineResult.HandshakeStatus handshakeStatus;
        int applicationBufferSize = this.b.getSession().getApplicationBufferSize();
        this.c = ByteBuffer.allocate(applicationBufferSize);
        this.e = ByteBuffer.allocate(applicationBufferSize);
        this.d.clear();
        this.f.clear();
        SSLEngineResult.HandshakeStatus handshakeStatus2 = this.b.getHandshakeStatus();
        boolean z = false;
        while (!z) {
            int i = a.b[handshakeStatus2.ordinal()];
            if (i == 1) {
                z = !this.f.hasRemaining();
                if (z) {
                    return true;
                }
                this.a.write(this.f);
            } else if (i != 2) {
                if (i == 3) {
                    this.d.clear();
                    try {
                        SSLEngineResult sSLEngineResultWrap = this.b.wrap(this.c, this.d);
                        handshakeStatus = sSLEngineResultWrap.getHandshakeStatus();
                        int i2 = a.a[sSLEngineResultWrap.getStatus().ordinal()];
                        if (i2 == 1) {
                            this.d.flip();
                            while (this.d.hasRemaining()) {
                                this.a.write(this.d);
                            }
                        } else {
                            if (i2 == 2) {
                                throw new SSLException("Buffer underflow occured after a wrap. I don't think we should ever get here.");
                            }
                            if (i2 == 3) {
                                this.d = e(this.d);
                            } else {
                                if (i2 != 4) {
                                    throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultWrap.getStatus());
                                }
                                try {
                                    this.d.flip();
                                    while (this.d.hasRemaining()) {
                                        this.a.write(this.d);
                                    }
                                    this.f.clear();
                                } catch (Exception unused) {
                                    handshakeStatus2 = this.b.getHandshakeStatus();
                                }
                            }
                        }
                        handshakeStatus2 = handshakeStatus;
                    } catch (SSLException unused2) {
                        this.b.closeOutbound();
                        handshakeStatus2 = this.b.getHandshakeStatus();
                    }
                } else if (i == 4) {
                    while (true) {
                        Runnable delegatedTask = this.b.getDelegatedTask();
                        if (delegatedTask == null) {
                            break;
                        }
                        this.g.execute(delegatedTask);
                    }
                    handshakeStatus2 = this.b.getHandshakeStatus();
                } else if (i != 5) {
                    throw new IllegalStateException("Invalid SSL status: " + handshakeStatus2);
                }
            } else if (this.a.read(this.f) >= 0) {
                this.f.flip();
                try {
                    SSLEngineResult sSLEngineResultUnwrap = this.b.unwrap(this.f, this.e);
                    this.f.compact();
                    handshakeStatus = sSLEngineResultUnwrap.getHandshakeStatus();
                    int i3 = a.a[sSLEngineResultUnwrap.getStatus().ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            this.f = f(this.f);
                        } else if (i3 == 3) {
                            this.e = c(this.e);
                        } else {
                            if (i3 != 4) {
                                throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultUnwrap.getStatus());
                            }
                            if (this.b.isOutboundDone()) {
                                return false;
                            }
                            this.b.closeOutbound();
                            handshakeStatus2 = this.b.getHandshakeStatus();
                        }
                    }
                    handshakeStatus2 = handshakeStatus;
                } catch (SSLException unused3) {
                    this.b.closeOutbound();
                    handshakeStatus2 = this.b.getHandshakeStatus();
                }
            } else {
                if (this.b.isInboundDone() && this.b.isOutboundDone()) {
                    return false;
                }
                try {
                    this.b.closeInbound();
                } catch (SSLException unused4) {
                }
                this.b.closeOutbound();
                handshakeStatus2 = this.b.getHandshakeStatus();
            }
        }
        return true;
    }

    private ByteBuffer c(ByteBuffer byteBuffer) {
        return d(byteBuffer, this.b.getSession().getApplicationBufferSize());
    }

    private ByteBuffer d(ByteBuffer byteBuffer, int i) {
        return i > byteBuffer.capacity() ? ByteBuffer.allocate(i) : ByteBuffer.allocate(byteBuffer.capacity() * 2);
    }

    private ByteBuffer e(ByteBuffer byteBuffer) {
        return d(byteBuffer, this.b.getSession().getPacketBufferSize());
    }

    private ByteBuffer f(ByteBuffer byteBuffer) {
        if (this.b.getSession().getPacketBufferSize() < byteBuffer.limit()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferE = e(byteBuffer);
        byteBuffer.flip();
        byteBufferE.put(byteBuffer);
        return byteBufferE;
    }

    private void g() throws IOException {
        try {
            this.b.closeInbound();
        } catch (Exception unused) {
            h.error("This engine was forced to close inbound, without having received the proper SSL/TLS close notification message from the peer, due to end of stream.");
        }
        a();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a();
    }

    @Override // org.java_websocket.WrappedByteChannel
    public boolean isBlocking() {
        return this.a.isBlocking();
    }

    @Override // org.java_websocket.WrappedByteChannel
    public boolean isNeedRead() {
        return this.f.hasRemaining() || this.e.hasRemaining();
    }

    @Override // org.java_websocket.WrappedByteChannel
    public boolean isNeedWrite() {
        return false;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.e.hasRemaining()) {
            this.e.flip();
            return ByteBufferUtils.transferByteBuffer(this.e, byteBuffer);
        }
        this.f.compact();
        int i = this.a.read(this.f);
        if (i > 0 || this.f.hasRemaining()) {
            this.f.flip();
            if (this.f.hasRemaining()) {
                this.e.compact();
                try {
                    SSLEngineResult sSLEngineResultUnwrap = this.b.unwrap(this.f, this.e);
                    int i2 = a.a[sSLEngineResultUnwrap.getStatus().ordinal()];
                    if (i2 == 1) {
                        this.e.flip();
                        return ByteBufferUtils.transferByteBuffer(this.e, byteBuffer);
                    }
                    if (i2 == 2) {
                        this.e.flip();
                        return ByteBufferUtils.transferByteBuffer(this.e, byteBuffer);
                    }
                    if (i2 == 3) {
                        this.e = c(this.e);
                        return read(byteBuffer);
                    }
                    if (i2 == 4) {
                        a();
                        byteBuffer.clear();
                        return -1;
                    }
                    throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultUnwrap.getStatus());
                } catch (SSLException e) {
                    h.error("SSLExcpetion during unwrap", (Throwable) e);
                    throw e;
                }
            }
        } else if (i < 0) {
            g();
        }
        ByteBufferUtils.transferByteBuffer(this.e, byteBuffer);
        return i;
    }

    @Override // org.java_websocket.WrappedByteChannel
    public int readMore(ByteBuffer byteBuffer) throws IOException {
        return read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public synchronized int write(ByteBuffer byteBuffer) throws IOException {
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            this.d.clear();
            SSLEngineResult sSLEngineResultWrap = this.b.wrap(byteBuffer, this.d);
            int i = a.a[sSLEngineResultWrap.getStatus().ordinal()];
            if (i == 1) {
                this.d.flip();
                while (this.d.hasRemaining()) {
                    iWrite += this.a.write(this.d);
                }
            } else {
                if (i == 2) {
                    throw new SSLException("Buffer underflow occured after a wrap. I don't think we should ever get here.");
                }
                if (i != 3) {
                    if (i == 4) {
                        a();
                        return 0;
                    }
                    throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultWrap.getStatus());
                }
                this.d = e(this.d);
            }
        }
        return iWrite;
    }

    @Override // org.java_websocket.WrappedByteChannel
    public void writeMore() throws IOException {
    }
}
