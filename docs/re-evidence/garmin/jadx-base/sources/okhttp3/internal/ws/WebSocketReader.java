package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import p005kotlin.Metadata;
import w63.e;
import w63.g;
import w63.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00011B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "", "isClient", "Lw63/g;", "source", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLw63/g;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "", "readHeader", "()V", "readControlFrame", "readMessageFrame", "readUntilNonControlFrame", "readMessage", "processNextFrame", "close", "Z", "Lw63/g;", "getSource", "()Lw63/g;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "closed", "", "opcode", "I", "", "frameLength", "J", "isFinalFrame", "isControlFrame", "readingCompressedMessage", "Lw63/e;", "controlFrameBuffer", "Lw63/e;", "messageFrameBuffer", "Lokhttp3/internal/ws/MessageInflater;", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", "", "maskKey", "[B", "Lw63/e$a;", "maskCursor", "Lw63/e$a;", "FrameCallback", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final e controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final e.a maskCursor;
    private final byte[] maskKey;
    private final e messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final g source;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "", "text", "", "onReadMessage", "(Ljava/lang/String;)V", "Lw63/h;", "bytes", "(Lw63/h;)V", "payload", "onReadPing", "onReadPong", "", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface FrameCallback {
        void onReadClose(int code, String reason);

        void onReadMessage(String text);

        void onReadMessage(h bytes);

        void onReadPing(h payload);

        void onReadPong(h payload);
    }

    public WebSocketReader(boolean z14, g gVar, FrameCallback frameCallback, boolean z15, boolean z16) {
        gVar.getClass();
        frameCallback.getClass();
        this.isClient = z14;
        this.source = gVar;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z15;
        this.noContextTakeover = z16;
        this.controlFrameBuffer = new e();
        this.messageFrameBuffer = new e();
        this.maskKey = z14 ? null : new byte[4];
        this.maskCursor = z14 ? null : new e.a();
    }

    private final void readControlFrame() throws ProtocolException, EOFException {
        short s8;
        String strX;
        long j8 = this.frameLength;
        if (j8 > 0) {
            this.source.e2(this.controlFrameBuffer, j8);
            if (!this.isClient) {
                e eVar = this.controlFrameBuffer;
                e.a aVar = this.maskCursor;
                aVar.getClass();
                eVar.p(aVar);
                this.maskCursor.c(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                e.a aVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                bArr.getClass();
                webSocketProtocol.toggleMask(aVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                e eVar2 = this.controlFrameBuffer;
                long j14 = eVar2.f183349b;
                if (j14 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j14 != 0) {
                    s8 = eVar2.readShort();
                    strX = this.controlFrameBuffer.x();
                    String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s8);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                } else {
                    s8 = 1005;
                    strX = "";
                }
                this.frameCallback.onReadClose(s8, strX);
                this.closed = true;
                return;
            case 9:
                FrameCallback frameCallback = this.frameCallback;
                e eVar3 = this.controlFrameBuffer;
                frameCallback.onReadPing(eVar3.h0(eVar3.f183349b));
                return;
            case 10:
                FrameCallback frameCallback2 = this.frameCallback;
                e eVar4 = this.controlFrameBuffer;
                frameCallback2.onReadPong(eVar4.h0(eVar4.f183349b));
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.opcode));
        }
    }

    private final void readHeader() throws IOException {
        boolean z14;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.closed) {
            vb.h.C("closed");
            return;
        }
        long timeoutNanos = this.source.getTimeout().getTimeoutNanos();
        this.source.getTimeout().clearTimeout();
        try {
            int iAnd = Util.and(this.source.readByte(), 255);
            this.source.getTimeout().timeout(timeoutNanos, timeUnit);
            int i14 = iAnd & 15;
            this.opcode = i14;
            boolean z15 = (iAnd & 128) != 0;
            this.isFinalFrame = z15;
            boolean z16 = (iAnd & 8) != 0;
            this.isControlFrame = z16;
            if (z16 && !z15) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z17 = (iAnd & 64) != 0;
            if (i14 == 1 || i14 == 2) {
                if (!z17) {
                    z14 = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z14 = true;
                }
                this.readingCompressedMessage = z14;
            } else if (z17) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iAnd & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = Util.and(this.source.readByte(), 255);
            boolean z18 = (iAnd2 & 128) != 0;
            if (z18 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j8 = iAnd2 & 127;
            this.frameLength = j8;
            if (j8 == 126) {
                this.frameLength = Util.and(this.source.readShort(), 65535);
            } else if (j8 == 127) {
                long j14 = this.source.readLong();
                this.frameLength = j14;
                if (j14 < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z18) {
                g gVar = this.source;
                byte[] bArr = this.maskKey;
                bArr.getClass();
                gVar.readFully(bArr);
            }
        } catch (Throwable th3) {
            this.source.getTimeout().timeout(timeoutNanos, timeUnit);
            throw th3;
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j8 = this.frameLength;
            if (j8 > 0) {
                this.source.e2(this.messageFrameBuffer, j8);
                if (!this.isClient) {
                    e eVar = this.messageFrameBuffer;
                    e.a aVar = this.maskCursor;
                    aVar.getClass();
                    eVar.p(aVar);
                    this.maskCursor.c(this.messageFrameBuffer.f183349b - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    e.a aVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    bArr.getClass();
                    webSocketProtocol.toggleMask(aVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.opcode));
            }
        }
        vb.h.C("closed");
    }

    private final void readMessageFrame() throws IOException {
        int i14 = this.opcode;
        if (i14 != 1 && i14 != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(i14));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        FrameCallback frameCallback = this.frameCallback;
        if (i14 == 1) {
            frameCallback.onReadMessage(this.messageFrameBuffer.x());
        } else {
            e eVar = this.messageFrameBuffer;
            frameCallback.onReadMessage(eVar.h0(eVar.f183349b));
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final g getSource() {
        return this.source;
    }

    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
