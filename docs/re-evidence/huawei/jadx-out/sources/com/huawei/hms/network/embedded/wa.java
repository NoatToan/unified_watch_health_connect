package com.huawei.hms.network.embedded;

import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes34.dex */
public final class wa {
    public static final int t = 65535;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final db f15577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15578c;
    public boolean d;
    public int e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public bb k;
    public nb l;
    public bb m;
    public bb n;
    public Inflater o;
    public final bb p;
    public final bb q;
    public final byte[] r;
    public final bb.c s;

    public interface a {
        void a(eb ebVar);

        void a(String str) throws IOException;

        void b(int i, String str);

        void c(eb ebVar);

        void d(eb ebVar) throws IOException;
    }

    public void a() throws IOException {
        d();
        if (this.h) {
            c();
        } else {
            f();
        }
    }

    private void g() throws IOException {
        while (!this.d) {
            d();
            if (!this.h) {
                return;
            } else {
                c();
            }
        }
    }

    private void f() throws IOException {
        int i = this.e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        e();
        if (!this.i || this.q.B() <= 0) {
            if (i == 1) {
                this.f15578c.a(this.q.o());
                return;
            } else {
                this.f15578c.d(this.q.r());
                return;
            }
        }
        try {
            a(i, this.q);
        } catch (Exception e) {
            ma.f().a(5, e.getMessage(), e);
            throw new IOException(e);
        }
    }

    private void e() throws IOException {
        while (!this.d) {
            long j = this.f;
            if (j > 0) {
                this.f15577b.a(this.q, j);
                if (!this.f15576a) {
                    this.q.a(this.s);
                    this.s.k(this.q.B() - this.f);
                    va.a(this.s, this.r);
                    this.s.close();
                }
            }
            if (this.g) {
                return;
            }
            g();
            if (this.e != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.e));
            }
        }
        throw new IOException("closed");
    }

    private void d() throws IOException {
        if (this.d) {
            throw new IOException("closed");
        }
        long jE = this.f15577b.timeout().e();
        this.f15577b.timeout().b();
        try {
            byte b2 = this.f15577b.readByte();
            this.f15577b.timeout().timeout(jE, TimeUnit.NANOSECONDS);
            this.e = b2 & 15;
            boolean z = (b2 & 128) != 0;
            this.g = z;
            boolean z2 = (b2 & 8) != 0;
            this.h = z2;
            if (z2 && !z) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z3 = (b2 & 64) != 0;
            boolean z4 = (b2 & 32) != 0;
            boolean z5 = (b2 & 16) != 0;
            if (!this.i && (z3 || z4 || z5)) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            byte b3 = this.f15577b.readByte();
            boolean z6 = (b3 & 128) != 0;
            boolean z7 = this.f15576a;
            if (z6 == z7) {
                throw new ProtocolException(z7 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = b3 & Ascii.DEL;
            this.f = j;
            if (j == 126) {
                this.f = ((long) this.f15577b.readShort()) & 65535;
            } else if (j == 127) {
                long j2 = this.f15577b.readLong();
                this.f = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.h && this.f > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z6) {
                this.f15577b.readFully(this.r);
            }
        } catch (Throwable th) {
            this.f15577b.timeout().timeout(jE, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private void c() throws IOException {
        short s;
        String strO;
        long j = this.f;
        if (j > 0) {
            this.f15577b.a(this.p, j);
            if (!this.f15576a) {
                this.p.a(this.s);
                this.s.k(0L);
                va.a(this.s, this.r);
                this.s.close();
            }
        }
        switch (this.e) {
            case 8:
                long jB = this.p.B();
                if (jB == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (jB != 0) {
                    s = this.p.readShort();
                    strO = this.p.o();
                    String strA = va.a(s);
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    s = 1005;
                    strO = "";
                }
                this.f15578c.b(s, strO);
                this.d = true;
                return;
            case 9:
                this.f15578c.c(this.p.r());
                return;
            case 10:
                this.f15578c.a(this.p.r());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.e));
        }
    }

    private void b() {
        if (this.i) {
            this.k = new bb();
            this.m = new bb();
            this.n = new bb();
            Inflater inflater = new Inflater(true);
            this.o = inflater;
            this.l = new nb((db) this.m, inflater);
        }
    }

    private void a(int i, bb bbVar) throws IOException {
        if (this.j) {
            this.o.reset();
        }
        this.m.write(bbVar, bbVar.B());
        if (!this.j) {
            this.m.writeInt(65535);
        }
        this.m.flush();
        while (this.l.read(this.k, Long.MAX_VALUE) != -1) {
            try {
                bb bbVar2 = this.k;
                bbVar.write(bbVar2, bbVar2.B());
                if (this.l.b()) {
                    break;
                }
            } catch (EOFException e) {
                ma.f().a(4, e.getMessage(), e);
            }
        }
        if (i == 1) {
            this.f15578c.a(bbVar.o());
        } else {
            this.f15578c.d(bbVar.r());
        }
    }

    public wa(boolean z, db dbVar, a aVar) {
        this.i = false;
        this.p = new bb();
        this.q = new bb();
        if (dbVar == null) {
            throw new NullPointerException("source == null");
        }
        if (aVar == null) {
            throw new NullPointerException("frameCallback == null");
        }
        this.f15576a = z;
        this.f15577b = dbVar;
        this.f15578c = aVar;
        this.r = z ? null : new byte[4];
        this.s = z ? null : new bb.c();
    }

    public wa(boolean z, db dbVar, ua uaVar, boolean z2, boolean z3) {
        this(z, dbVar, uaVar);
        this.i = z2;
        this.j = z3;
        b();
    }
}
