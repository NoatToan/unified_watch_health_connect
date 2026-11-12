package okhttp3.internal.http2;

import am.j;
import com.garmin.android.gncs.NotificationConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import p005kotlin.Metadata;
import vb.h;
import w63.e;
import w63.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 L2\u00020\u0001:\u0001LB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0010J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!J/\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0011¢\u0006\u0004\b+\u0010\u0014J%\u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b¢\u0006\u0004\b/\u00100J%\u00104\u001a\u00020\f2\u0006\u00101\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00106\u001a\u00020\n¢\u0006\u0004\b7\u0010\u000eJ-\u0010:\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010\u0010J+\u0010>\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010B\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010AR\u0017\u0010H\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Lw63/f;", "sink", "", "client", "<init>", "(Lw63/f;Z)V", "", "streamId", "", "byteCount", "", "writeContinuationFrames", "(IJ)V", "connectionPreface", "()V", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "(Lokhttp3/internal/http2/Settings;)V", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "maxDataLength", "()I", "outFinished", "Lw63/e;", "source", "data", "(ZILw63/e;I)V", "flags", "buffer", "dataFrame", "(IILw63/e;I)V", "settings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;[B)V", "windowSizeIncrement", "windowUpdate", "length", NotificationConstants.KEY_DATA_MIME_TYPE, "frameHeader", "(IIII)V", "close", "headerBlock", "headers", "(ZILjava/util/List;)V", "Lw63/f;", "Z", "hpackBuffer", "Lw63/e;", "maxFrameSize", "I", "closed", "Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final e hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final f sink;

    public Http2Writer(f fVar, boolean z14) {
        fVar.getClass();
        this.sink = fVar;
        this.client = z14;
        e eVar = new e();
        this.hpackBuffer = eVar;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, eVar, 3, null);
    }

    private final void writeContinuationFrames(int streamId, long byteCount) {
        while (byteCount > 0) {
            long jMin = Math.min(this.maxFrameSize, byteCount);
            byteCount -= jMin;
            frameHeader(streamId, (int) jMin, 9, byteCount == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void applyAndAckSettings(Settings peerSettings) {
        try {
            peerSettings.getClass();
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
            if (peerSettings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.e(), new Object[0]));
                }
                this.sink.O3(Http2.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void data(boolean outFinished, int streamId, e source, int byteCount) {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(streamId, outFinished ? 1 : 0, source, byteCount);
    }

    public final void dataFrame(int streamId, int flags, e buffer, int byteCount) {
        frameHeader(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            f fVar = this.sink;
            buffer.getClass();
            fVar.write(buffer, byteCount);
        }
    }

    public final synchronized void flush() {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int streamId, int length, int type, int flags) {
        int i14;
        int i15;
        int i16;
        int i17;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            i14 = streamId;
            i15 = length;
            i16 = type;
            i17 = flags;
            logger2.fine(Http2.INSTANCE.frameLog(false, i14, i15, i16, i17));
        } else {
            i14 = streamId;
            i15 = length;
            i16 = type;
            i17 = flags;
        }
        if (i15 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i15).toString());
        }
        if ((Integer.MIN_VALUE & i14) != 0) {
            h.x(j.h(i14, "reserved bit set: "));
            return;
        }
        Util.writeMedium(this.sink, i15);
        this.sink.writeByte(i16 & 255);
        this.sink.writeByte(i17 & 255);
        this.sink.writeInt(Integer.MAX_VALUE & i14);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int lastGoodStreamId, ErrorCode errorCode, byte[] debugData) {
        errorCode.getClass();
        debugData.getClass();
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        frameHeader(0, debugData.length + 8, 7, 0);
        this.sink.writeInt(lastGoodStreamId);
        this.sink.writeInt(errorCode.getHttpCode());
        if (debugData.length != 0) {
            this.sink.write(debugData);
        }
        this.sink.flush();
    }

    public final synchronized void headers(boolean outFinished, int streamId, List<Header> headerBlock) {
        headerBlock.getClass();
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(headerBlock);
        long j8 = this.hpackBuffer.f183349b;
        long jMin = Math.min(this.maxFrameSize, j8);
        int i14 = j8 == jMin ? 4 : 0;
        if (outFinished) {
            i14 |= 1;
        }
        frameHeader(streamId, (int) jMin, 1, i14);
        this.sink.write(this.hpackBuffer, jMin);
        if (j8 > jMin) {
            writeContinuationFrames(streamId, j8 - jMin);
        }
    }

    /* JADX INFO: renamed from: maxDataLength, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean ack, int payload1, int payload2) {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, ack ? 1 : 0);
        this.sink.writeInt(payload1);
        this.sink.writeInt(payload2);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders) {
        requestHeaders.getClass();
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(requestHeaders);
        long j8 = this.hpackBuffer.f183349b;
        int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, j8);
        long j14 = iMin;
        frameHeader(streamId, iMin + 4, 5, j8 == j14 ? 4 : 0);
        this.sink.writeInt(promisedStreamId & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j14);
        if (j8 > j14) {
            writeContinuationFrames(streamId, j8 - j14);
        }
    }

    public final synchronized void rstStream(int streamId, ErrorCode errorCode) {
        errorCode.getClass();
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        frameHeader(streamId, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(Settings settings) {
        int i14;
        try {
            settings.getClass();
            if (this.closed) {
                throw new IOException("closed");
            }
            int i15 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i15 < 10) {
                if (settings.isSet(i15)) {
                    if (i15 != 4) {
                        i14 = i15 != 7 ? i15 : 4;
                    } else {
                        i14 = 3;
                    }
                    this.sink.writeShort(i14);
                    this.sink.writeInt(settings.get(i15));
                }
                i15++;
            }
            this.sink.flush();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void windowUpdate(int streamId, long windowSizeIncrement) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
        }
        frameHeader(streamId, 4, 8, 0);
        this.sink.writeInt((int) windowSizeIncrement);
        this.sink.flush();
    }
}
