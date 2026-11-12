package w63;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw63/a0;", "Lw63/f;", "Lw63/f0;", "sink", "<init>", "(Lw63/f0;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f183322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f183323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f183324c;

    public a0(f0 f0Var) {
        f0Var.getClass();
        this.f183322a = f0Var;
        this.f183323b = new e();
    }

    @Override // w63.f
    public final long G3(g0 g0Var) {
        long j8 = 0;
        while (true) {
            long j14 = g0Var.read(this.f183323b, 8192L);
            if (j14 == -1) {
                return j8;
            }
            j8 += j14;
            Z0();
        }
    }

    @Override // w63.f
    public final f O3(h hVar) {
        hVar.getClass();
        if (this.f183324c) {
            vb.h.z("closed");
            return null;
        }
        this.f183323b.E(hVar);
        Z0();
        return this;
    }

    @Override // w63.f
    public final f T2(long j8) {
        if (this.f183324c) {
            vb.h.z("closed");
            return null;
        }
        this.f183323b.K(j8);
        Z0();
        return this;
    }

    @Override // w63.f
    public final f Z0() {
        if (this.f183324c) {
            vb.h.z("closed");
            return null;
        }
        e eVar = this.f183323b;
        long jC = eVar.c();
        if (jC > 0) {
            this.f183322a.write(eVar, jC);
        }
        return this;
    }

    @Override // w63.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        f0 f0Var = this.f183322a;
        if (this.f183324c) {
            return;
        }
        e eVar = this.f183323b;
        long j8 = eVar.f183349b;
        if (j8 > 0) {
            f0Var.write(eVar, j8);
        }
        th = null;
        try {
            f0Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f183324c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // w63.f
    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getF183323b() {
        return this.f183323b;
    }

    @Override // w63.f
    public final f d4(int i14, int i15, String str) {
        str.getClass();
        if (this.f183324c) {
            vb.h.z("closed");
            return null;
        }
        this.f183323b.Q(i14, i15, str);
        Z0();
        return this;
    }

    @Override // w63.f
    public final f e0(long j8) {
        if (this.f183324c) {
            vb.h.z("closed");
            return null;
        }
        this.f183323b.J(j8);
        Z0();
        return this;
    }

    @Override // w63.f, w63.f0, java.io.Flushable
    public final void flush() {
        if (this.f183324c) {
            vb.h.z("closed");
            return;
        }
        e eVar = this.f183323b;
        long j8 = eVar.f183349b;
        f0 f0Var = this.f183322a;
        if (j8 > 0) {
            f0Var.write(eVar, j8);
        }
        f0Var.flush();
    }

    @Override // w63.f
    public final f h1(String str) {
        str.getClass();
        if (this.f183324c) {
            vb.h.z("closed");
            return null;
        }
        this.f183323b.R(str);
        Z0();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f183324c;
    }

    @Override // w63.f
    public final f l3() {
        if (this.f183324c) {
            vb.h.z("closed");
            return null;
        }
        e eVar = this.f183323b;
        long j8 = eVar.f183349b;
        if (j8 > 0) {
            this.f183322a.write(eVar, j8);
        }
        return this;
    }

    @Override // w63.f
    public final f p4(int i14, int i15, byte[] bArr) {
        bArr.getClass();
        if (this.f183324c) {
            vb.h.z("closed");
            return null;
        }
        this.f183323b.write(bArr, i14, i15);
        Z0();
        return this;
    }

    @Override // w63.f
    public final OutputStream t4() {
        return new a();
    }

    @Override // w63.f0
    /* JADX INFO: renamed from: timeout */
    public final h0 getF183407b() {
        return this.f183322a.getF183407b();
    }

    public final String toString() {
        return "buffer(" + this.f183322a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // w63.f
    public final f write(byte[] bArr) {
        bArr.getClass();
        if (this.f183324c) {
            vb.h.z("closed");
            return null;
        }
        e eVar = this.f183323b;
        eVar.getClass();
        eVar.write(bArr, 0, bArr.length);
        Z0();
        return this;
    }

    @Override // w63.f
    public final f writeByte(int i14) {
        if (this.f183324c) {
            vb.h.z("closed");
            return null;
        }
        this.f183323b.H(i14);
        Z0();
        return this;
    }

    @Override // w63.f
    public final f writeInt(int i14) {
        if (this.f183324c) {
            vb.h.z("closed");
            return null;
        }
        this.f183323b.L(i14);
        Z0();
        return this;
    }

    @Override // w63.f
    public final f writeShort(int i14) {
        if (this.f183324c) {
            vb.h.z("closed");
            return null;
        }
        this.f183323b.O(i14);
        Z0();
        return this;
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"w63/a0$a", "Ljava/io/OutputStream;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws Throwable {
            a0.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            a0 a0Var = a0.this;
            if (a0Var.f183324c) {
                return;
            }
            a0Var.flush();
        }

        public final String toString() {
            return a0.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i14, int i15) throws IOException {
            bArr.getClass();
            a0 a0Var = a0.this;
            if (a0Var.f183324c) {
                vb.h.C("closed");
            } else {
                a0Var.f183323b.write(bArr, i14, i15);
                a0Var.Z0();
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i14) throws IOException {
            a0 a0Var = a0.this;
            if (!a0Var.f183324c) {
                a0Var.f183323b.H((byte) i14);
                a0Var.Z0();
            } else {
                vb.h.C("closed");
            }
        }
    }

    @Override // w63.f0
    public final void write(e eVar, long j8) {
        eVar.getClass();
        if (!this.f183324c) {
            this.f183323b.write(eVar, j8);
            Z0();
        } else {
            vb.h.z("closed");
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.f183324c) {
            int iWrite = this.f183323b.write(byteBuffer);
            Z0();
            return iWrite;
        }
        vb.h.z("closed");
        return 0;
    }
}
