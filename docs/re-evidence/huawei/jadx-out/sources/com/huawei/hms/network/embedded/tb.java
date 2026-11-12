package com.huawei.hms.network.embedded;

import android.support.v4.media.session.PlaybackStateCompat;
import com.huawei.operation.utils.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes34.dex */
public final class tb implements cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bb f15413a = new bb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb f15414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15415c;

    @Override // com.huawei.hms.network.embedded.cb
    public cb writeShort(int i) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.writeShort(i);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb writeLong(long j) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.writeLong(j);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb writeInt(int i) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.writeInt(i);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb writeByte(int i) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.writeByte(i);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.yb
    public void write(bb bbVar, long j) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.write(bbVar, j);
        d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.write(bArr, i, i2);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb write(byte[] bArr) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.write(bArr);
        return d();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f15413a.write(byteBuffer);
        d();
        return iWrite;
    }

    public String toString() {
        return "buffer(" + this.f15414b + Constants.RIGHT_BRACKET_ONLY;
    }

    @Override // com.huawei.hms.network.embedded.yb
    public ac timeout() {
        return this.f15414b.timeout();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f15415c;
    }

    @Override // com.huawei.hms.network.embedded.cb, com.huawei.hms.network.embedded.yb, java.io.Flushable
    public void flush() throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        bb bbVar = this.f15413a;
        long j = bbVar.f14653b;
        if (j > 0) {
            this.f15414b.write(bbVar, j);
        }
        this.f15414b.flush();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb d() throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        long jT = this.f15413a.t();
        if (jT > 0) {
            this.f15414b.write(this.f15413a, jT);
        }
        return this;
    }

    @Override // com.huawei.hms.network.embedded.yb, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws Throwable {
        if (this.f15415c) {
            return;
        }
        if (this.f15413a.f14653b > 0) {
            yb ybVar = this.f15414b;
            bb bbVar = this.f15413a;
            ybVar.write(bbVar, bbVar.f14653b);
        }
        th = null;
        try {
            this.f15414b.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f15415c = true;
        if (th != null) {
            cc.a(th);
        }
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb c(long j) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.c(j);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb c(int i) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.c(i);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb c() throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        long jB = this.f15413a.B();
        if (jB > 0) {
            this.f15414b.write(this.f15413a, jB);
        }
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public OutputStream b() {
        return new a();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb b(long j) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.b(j);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb b(int i) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.b(i);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb a(String str, Charset charset) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.a(str, charset);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb a(String str, int i, int i2, Charset charset) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.a(str, i, i2, charset);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb a(String str, int i, int i2) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.a(str, i, i2);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb a(String str) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.a(str);
        return d();
    }

    public class a extends OutputStream {
        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            tb tbVar = tb.this;
            if (tbVar.f15415c) {
                throw new IOException("closed");
            }
            tbVar.f15413a.write(bArr, i, i2);
            tb.this.d();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            tb tbVar = tb.this;
            if (tbVar.f15415c) {
                throw new IOException("closed");
            }
            tbVar.f15413a.writeByte((int) ((byte) i));
            tb.this.d();
        }

        public String toString() {
            return tb.this + ".outputStream()";
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            tb tbVar = tb.this;
            if (tbVar.f15415c) {
                return;
            }
            tbVar.flush();
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            tb.this.close();
        }

        public a() {
        }
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb a(zb zbVar, long j) throws IOException {
        while (j > 0) {
            long j2 = zbVar.read(this.f15413a, j);
            if (j2 == -1) {
                throw new EOFException();
            }
            j -= j2;
            d();
        }
        return this;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb a(eb ebVar) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.a(ebVar);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb a(long j) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.a(j);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public cb a(int i) throws IOException {
        if (this.f15415c) {
            throw new IllegalStateException("closed");
        }
        this.f15413a.a(i);
        return d();
    }

    @Override // com.huawei.hms.network.embedded.cb
    public bb a() {
        return this.f15413a;
    }

    @Override // com.huawei.hms.network.embedded.cb
    public long a(zb zbVar) throws IOException {
        if (zbVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long j2 = zbVar.read(this.f15413a, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            d();
        }
    }

    public tb(yb ybVar) {
        if (ybVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f15414b = ybVar;
    }
}
