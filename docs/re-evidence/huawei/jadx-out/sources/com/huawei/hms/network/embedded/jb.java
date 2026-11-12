package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes34.dex */
public final class jb implements yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb f14958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Deflater f14959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fb f14960c;
    public boolean d;
    public final CRC32 e = new CRC32();

    @Override // com.huawei.hms.network.embedded.yb
    public void write(bb bbVar, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return;
        }
        a(bbVar, j);
        this.f14960c.write(bbVar, j);
    }

    @Override // com.huawei.hms.network.embedded.yb
    public ac timeout() {
        return this.f14958a.timeout();
    }

    @Override // com.huawei.hms.network.embedded.yb, java.io.Flushable
    public void flush() throws IOException {
        this.f14960c.flush();
    }

    public final Deflater e() {
        return this.f14959b;
    }

    @Override // com.huawei.hms.network.embedded.yb, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws Throwable {
        if (this.d) {
            return;
        }
        this.f14960c.e();
        f();
        th = null;
        try {
            this.f14959b.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f14958a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.d = true;
        if (th != null) {
            cc.a(th);
        }
    }

    private void g() {
        bb bbVarA = this.f14958a.a();
        bbVarA.writeShort(8075);
        bbVarA.writeByte(8);
        bbVarA.writeByte(0);
        bbVarA.writeInt(0);
        bbVarA.writeByte(0);
        bbVarA.writeByte(0);
    }

    private void f() throws IOException {
        this.f14958a.a((int) this.e.getValue());
        this.f14958a.a((int) this.f14959b.getBytesRead());
    }

    private void a(bb bbVar, long j) {
        vb vbVar = bbVar.f14652a;
        while (j > 0) {
            int iMin = (int) Math.min(j, vbVar.f15548c - vbVar.f15547b);
            this.e.update(vbVar.f15546a, vbVar.f15547b, iMin);
            j -= (long) iMin;
            vbVar = vbVar.f;
        }
    }

    public jb(yb ybVar) {
        if (ybVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        Deflater deflater = new Deflater(-1, true);
        this.f14959b = deflater;
        cb cbVarA = ob.a(ybVar);
        this.f14958a = cbVarA;
        this.f14960c = new fb(cbVarA, deflater);
        g();
    }
}
