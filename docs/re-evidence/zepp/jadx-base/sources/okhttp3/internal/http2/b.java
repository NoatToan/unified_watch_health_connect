package okhttp3.internal.http2;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UShort;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes23.dex */
final class b implements Closeable {
    public static final Logger e = Logger.getLogger(Http2.class.getName());
    private final BufferedSource a;
    private final a b;
    private final boolean c;
    public final okhttp3.internal.http2.a.C1189a d;

    public static final class a implements Source {
        private final BufferedSource a;
        public int b;
        public byte c;
        public int d;
        public int e;
        public short f;

        public a(BufferedSource bufferedSource) {
            this.a = bufferedSource;
        }

        private void a() throws IOException {
            int i = this.d;
            int iH = b.h(this.a);
            this.e = iH;
            this.b = iH;
            byte b = (byte) (this.a.readByte() & 255);
            this.c = (byte) (this.a.readByte() & 255);
            Logger logger = b.e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.b(true, this.d, this.b, b, this.c));
            }
            int i2 = this.a.readInt() & Integer.MAX_VALUE;
            this.d = i2;
            if (b != 9) {
                throw Http2.d("%s != TYPE_CONTINUATION", Byte.valueOf(b));
            }
            if (i2 != i) {
                throw Http2.d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            while (true) {
                int i = this.e;
                if (i != 0) {
                    long j2 = this.a.read(buffer, Math.min(j, i));
                    if (j2 == -1) {
                        return -1L;
                    }
                    this.e = (int) (((long) this.e) - j2);
                    return j2;
                }
                this.a.skip(this.f);
                this.f = (short) 0;
                if ((this.c & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.a.timeout();
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.http2.b$b, reason: collision with other inner class name */
    public interface InterfaceC1190b {
        void a(int i, ErrorCode errorCode);

        void ackSettings();

        void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j);

        void b(int i, ErrorCode errorCode, ByteString byteString);

        void c(boolean z, Settings settings);

        void d(boolean z, int i, int i2, List<Header> list);

        void data(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException;

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list) throws IOException;

        void windowUpdate(int i, long j);
    }

    public b(BufferedSource bufferedSource, boolean z) {
        this.a = bufferedSource;
        this.c = z;
        a aVar = new a(bufferedSource);
        this.b = aVar;
        this.d = new okhttp3.internal.http2.a.C1189a(4096, aVar);
    }

    public static int a(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw Http2.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    private void d(InterfaceC1190b interfaceC1190b, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw Http2.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        if ((b & 32) != 0) {
            throw Http2.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short s = (b & 8) != 0 ? (short) (this.a.readByte() & 255) : (short) 0;
        interfaceC1190b.data(z, i2, this.a, a(i, b, s));
        this.a.skip(s);
    }

    private void e(InterfaceC1190b interfaceC1190b, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw Http2.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw Http2.d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int i3 = this.a.readInt();
        int i4 = this.a.readInt();
        int i5 = i - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.fromHttp2(i4);
        if (errorCodeFromHttp2 == null) {
            throw Http2.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
        }
        ByteString byteString = ByteString.EMPTY;
        if (i5 > 0) {
            byteString = this.a.readByteString(i5);
        }
        interfaceC1190b.b(i3, errorCodeFromHttp2, byteString);
    }

    private List<Header> f(int i, short s, byte b, int i2) throws IOException {
        a aVar = this.b;
        aVar.e = i;
        aVar.b = i;
        aVar.f = s;
        aVar.c = b;
        aVar.d = i2;
        this.d.l();
        return this.d.e();
    }

    private void g(InterfaceC1190b interfaceC1190b, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw Http2.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        short s = (b & 8) != 0 ? (short) (this.a.readByte() & 255) : (short) 0;
        if ((b & 32) != 0) {
            j(interfaceC1190b, i2);
            i -= 5;
        }
        interfaceC1190b.d(z, i2, -1, f(a(i, b, s), s, b, i2));
    }

    public static int h(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    private void i(InterfaceC1190b interfaceC1190b, int i, byte b, int i2) throws IOException {
        if (i != 8) {
            throw Http2.d("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw Http2.d("TYPE_PING streamId != 0", new Object[0]);
        }
        interfaceC1190b.ping((b & 1) != 0, this.a.readInt(), this.a.readInt());
    }

    private void j(InterfaceC1190b interfaceC1190b, int i) throws IOException {
        int i2 = this.a.readInt();
        interfaceC1190b.priority(i, i2 & Integer.MAX_VALUE, (this.a.readByte() & 255) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    private void k(InterfaceC1190b interfaceC1190b, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw Http2.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw Http2.d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        j(interfaceC1190b, i2);
    }

    private void l(InterfaceC1190b interfaceC1190b, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw Http2.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short s = (b & 8) != 0 ? (short) (this.a.readByte() & 255) : (short) 0;
        interfaceC1190b.pushPromise(i2, this.a.readInt() & Integer.MAX_VALUE, f(a(i - 4, b, s), s, b, i2));
    }

    private void m(InterfaceC1190b interfaceC1190b, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw Http2.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw Http2.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int i3 = this.a.readInt();
        ErrorCode errorCodeFromHttp2 = ErrorCode.fromHttp2(i3);
        if (errorCodeFromHttp2 == null) {
            throw Http2.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
        }
        interfaceC1190b.a(i2, errorCodeFromHttp2);
    }

    private void n(InterfaceC1190b interfaceC1190b, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            throw Http2.d("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b & 1) != 0) {
            if (i != 0) {
                throw Http2.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            interfaceC1190b.ackSettings();
            return;
        }
        if (i % 6 != 0) {
            throw Http2.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
        Settings settings = new Settings();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int i4 = this.a.readShort() & UShort.MAX_VALUE;
            int i5 = this.a.readInt();
            if (i4 == 2) {
                if (i5 != 0 && i5 != 1) {
                    throw Http2.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            } else if (i4 == 3) {
                i4 = 4;
            } else if (i4 == 4) {
                i4 = 7;
                if (i5 < 0) {
                    throw Http2.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                }
            } else if (i4 == 5 && (i5 < 16384 || i5 > 16777215)) {
                throw Http2.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i5));
            }
            settings.k(i4, i5);
        }
        interfaceC1190b.c(false, settings);
    }

    private void o(InterfaceC1190b interfaceC1190b, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw Http2.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long j = ((long) this.a.readInt()) & ParserMinimalBase.MAX_INT_L;
        if (j == 0) {
            throw Http2.d("windowSizeIncrement was 0", Long.valueOf(j));
        }
        interfaceC1190b.windowUpdate(i2, j);
    }

    public boolean b(boolean z, InterfaceC1190b interfaceC1190b) throws IOException {
        try {
            this.a.require(9L);
            int iH = h(this.a);
            if (iH < 0 || iH > 16384) {
                throw Http2.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(iH));
            }
            byte b = (byte) (this.a.readByte() & 255);
            if (z && b != 4) {
                throw Http2.d("Expected a SETTINGS frame but was %s", Byte.valueOf(b));
            }
            byte b2 = (byte) (this.a.readByte() & 255);
            int i = this.a.readInt() & Integer.MAX_VALUE;
            Logger logger = e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.b(true, i, iH, b, b2));
            }
            switch (b) {
                case 0:
                    d(interfaceC1190b, iH, b2, i);
                    return true;
                case 1:
                    g(interfaceC1190b, iH, b2, i);
                    return true;
                case 2:
                    k(interfaceC1190b, iH, b2, i);
                    return true;
                case 3:
                    m(interfaceC1190b, iH, b2, i);
                    return true;
                case 4:
                    n(interfaceC1190b, iH, b2, i);
                    return true;
                case 5:
                    l(interfaceC1190b, iH, b2, i);
                    return true;
                case 6:
                    i(interfaceC1190b, iH, b2, i);
                    return true;
                case 7:
                    e(interfaceC1190b, iH, b2, i);
                    return true;
                case 8:
                    o(interfaceC1190b, iH, b2, i);
                    return true;
                default:
                    this.a.skip(iH);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public void c(InterfaceC1190b interfaceC1190b) throws IOException {
        if (this.c) {
            if (!b(true, interfaceC1190b)) {
                throw Http2.d("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        BufferedSource bufferedSource = this.a;
        ByteString byteString = Http2.a;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger = e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.format("<< CONNECTION %s", byteString2.hex()));
        }
        if (!byteString.equals(byteString2)) {
            throw Http2.d("Expected a connection header but was %s", byteString2.utf8());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }
}
