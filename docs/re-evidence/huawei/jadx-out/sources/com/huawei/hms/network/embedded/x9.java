package com.huawei.hms.network.embedded;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes34.dex */
public final class x9 implements Closeable {
    public static final Logger e = Logger.getLogger(u9.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final db f15605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f15606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15607c;
    public final t9.a d;

    public interface b {
        void a();

        void a(int i, int i2, int i3, boolean z);

        void a(int i, int i2, List<s9> list) throws IOException;

        void a(int i, long j);

        void a(int i, r9 r9Var);

        void a(int i, r9 r9Var, eb ebVar);

        void a(int i, String str, eb ebVar, String str2, int i2, long j);

        void a(boolean z, int i, int i2);

        void a(boolean z, int i, int i2, List<s9> list);

        void a(boolean z, int i, db dbVar, int i2) throws IOException;

        void a(boolean z, ca caVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15605a.close();
    }

    public boolean a(boolean z, b bVar) throws IOException {
        try {
            this.f15605a.i(9L);
            int iA = a(this.f15605a);
            if (iA < 0 || iA > 16384) {
                throw u9.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(iA));
            }
            byte b2 = (byte) (this.f15605a.readByte() & 255);
            if (z && b2 != 4) {
                throw u9.b("Expected a SETTINGS frame but was %s", Byte.valueOf(b2));
            }
            byte b3 = (byte) (this.f15605a.readByte() & 255);
            int i = this.f15605a.readInt() & Integer.MAX_VALUE;
            Logger logger = e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(u9.a(true, i, iA, b2, b3));
            }
            switch (b2) {
                case 0:
                    a(bVar, iA, b3, i);
                    return true;
                case 1:
                    c(bVar, iA, b3, i);
                    return true;
                case 2:
                    e(bVar, iA, b3, i);
                    return true;
                case 3:
                    g(bVar, iA, b3, i);
                    return true;
                case 4:
                    h(bVar, iA, b3, i);
                    return true;
                case 5:
                    f(bVar, iA, b3, i);
                    return true;
                case 6:
                    d(bVar, iA, b3, i);
                    return true;
                case 7:
                    b(bVar, iA, b3, i);
                    return true;
                case 8:
                    i(bVar, iA, b3, i);
                    return true;
                default:
                    this.f15605a.skip(iA);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public void a(b bVar) throws IOException {
        if (this.f15607c) {
            if (!a(true, bVar)) {
                throw u9.b("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        eb ebVarD = this.f15605a.d(u9.f15453a.j());
        Logger logger = e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(f8.a("<< CONNECTION %s", ebVarD.d()));
        }
        if (!u9.f15453a.equals(ebVarD)) {
            throw u9.b("Expected a connection header but was %s", ebVarD.n());
        }
    }

    private void i(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            throw u9.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long j = ((long) this.f15605a.readInt()) & 2147483647L;
        if (j == 0) {
            throw u9.b("windowSizeIncrement was 0", Long.valueOf(j));
        }
        bVar.a(i2, j);
    }

    private void h(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 != 0) {
            throw u9.b("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b2 & 1) != 0) {
            if (i != 0) {
                throw u9.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            bVar.a();
            return;
        }
        if (i % 6 != 0) {
            throw u9.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
        ca caVar = new ca();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int i4 = this.f15605a.readShort() & 65535;
            int i5 = this.f15605a.readInt();
            if (i4 == 2) {
                if (i5 != 0 && i5 != 1) {
                    throw u9.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            } else if (i4 == 3) {
                i4 = 4;
            } else if (i4 != 4) {
                if (i4 == 5 && (i5 < 16384 || i5 > 16777215)) {
                    throw u9.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i5));
                }
            } else {
                if (i5 < 0) {
                    throw u9.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                }
                i4 = 7;
            }
            caVar.a(i4, i5);
        }
        bVar.a(false, caVar);
    }

    private void g(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            throw u9.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw u9.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int i3 = this.f15605a.readInt();
        r9 r9VarA = r9.a(i3);
        if (r9VarA == null) {
            throw u9.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
        }
        bVar.a(i2, r9VarA);
    }

    private void f(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw u9.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short s = (b2 & 8) != 0 ? (short) (this.f15605a.readByte() & 255) : (short) 0;
        bVar.a(i2, this.f15605a.readInt() & Integer.MAX_VALUE, a(a(i - 4, b2, s), s, b2, i2));
    }

    private void e(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 5) {
            throw u9.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw u9.b("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        a(bVar, i2);
    }

    private void d(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 8) {
            throw u9.b("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw u9.b("TYPE_PING streamId != 0", new Object[0]);
        }
        bVar.a((b2 & 1) != 0, this.f15605a.readInt(), this.f15605a.readInt());
    }

    private void c(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw u9.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b2 & 1) != 0;
        short s = (b2 & 8) != 0 ? (short) (this.f15605a.readByte() & 255) : (short) 0;
        if ((b2 & 32) != 0) {
            a(bVar, i2);
            i -= 5;
        }
        bVar.a(z, i2, -1, a(a(i, b2, s), s, b2, i2));
    }

    private void b(b bVar, int i, byte b2, int i2) throws IOException {
        if (i < 8) {
            throw u9.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw u9.b("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int i3 = this.f15605a.readInt();
        int i4 = this.f15605a.readInt();
        int i5 = i - 8;
        r9 r9VarA = r9.a(i4);
        if (r9VarA == null) {
            throw u9.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
        }
        eb ebVarD = eb.f;
        if (i5 > 0) {
            ebVarD = this.f15605a.d(i5);
        }
        bVar.a(i3, r9VarA, ebVarD);
    }

    private void a(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw u9.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z = (b2 & 1) != 0;
        if ((b2 & 32) != 0) {
            throw u9.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short s = (b2 & 8) != 0 ? (short) (this.f15605a.readByte() & 255) : (short) 0;
        bVar.a(z, i2, this.f15605a, a(i, b2, s));
        this.f15605a.skip(s);
    }

    public static final class a implements zb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final db f15608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f15610c;
        public int d;
        public int e;
        public short f;

        @Override // com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
        public void close() throws IOException {
        }

        @Override // com.huawei.hms.network.embedded.zb, com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return this.f15608a.timeout();
        }

        @Override // com.huawei.hms.network.embedded.zb
        public long read(bb bbVar, long j) throws IOException {
            while (true) {
                int i = this.e;
                if (i != 0) {
                    long j2 = this.f15608a.read(bbVar, Math.min(j, i));
                    if (j2 == -1) {
                        return -1L;
                    }
                    this.e = (int) (((long) this.e) - j2);
                    return j2;
                }
                this.f15608a.skip(this.f);
                this.f = (short) 0;
                if ((this.f15610c & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        private void b() throws IOException {
            int i = this.d;
            int iA = x9.a(this.f15608a);
            this.e = iA;
            this.f15609b = iA;
            byte b2 = (byte) (this.f15608a.readByte() & 255);
            this.f15610c = (byte) (this.f15608a.readByte() & 255);
            if (x9.e.isLoggable(Level.FINE)) {
                x9.e.fine(u9.a(true, this.d, this.f15609b, b2, this.f15610c));
            }
            int i2 = this.f15608a.readInt() & Integer.MAX_VALUE;
            this.d = i2;
            if (b2 != 9) {
                throw u9.b("%s != TYPE_CONTINUATION", Byte.valueOf(b2));
            }
            if (i2 != i) {
                throw u9.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public a(db dbVar) {
            this.f15608a = dbVar;
        }
    }

    private void a(b bVar, int i) throws IOException {
        int i2 = this.f15605a.readInt();
        bVar.a(i, i2 & Integer.MAX_VALUE, (this.f15605a.readByte() & 255) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    private List<s9> a(int i, short s, byte b2, int i2) throws IOException {
        a aVar = this.f15606b;
        aVar.e = i;
        aVar.f15609b = i;
        aVar.f = s;
        aVar.f15610c = b2;
        aVar.d = i2;
        this.d.d();
        return this.d.a();
    }

    public static int a(db dbVar) throws IOException {
        return (dbVar.readByte() & 255) | ((dbVar.readByte() & 255) << 16) | ((dbVar.readByte() & 255) << 8);
    }

    public static int a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw u9.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    public x9(db dbVar, boolean z) {
        this.f15605a = dbVar;
        this.f15607c = z;
        a aVar = new a(dbVar);
        this.f15606b = aVar;
        this.d = new t9.a(4096, aVar);
    }
}
