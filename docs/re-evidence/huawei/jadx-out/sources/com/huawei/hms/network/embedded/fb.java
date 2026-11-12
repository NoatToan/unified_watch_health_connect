package com.huawei.hms.network.embedded;

import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes34.dex */
public final class fb implements yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb f14780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Deflater f14781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14782c;

    @Override // com.huawei.hms.network.embedded.yb
    public void write(bb bbVar, long j) throws IOException {
        cc.a(bbVar.f14653b, 0L, j);
        while (j > 0) {
            vb vbVar = bbVar.f14652a;
            int iMin = (int) Math.min(j, vbVar.f15548c - vbVar.f15547b);
            this.f14781b.setInput(vbVar.f15546a, vbVar.f15547b, iMin);
            a(false);
            long j2 = iMin;
            bbVar.f14653b -= j2;
            vbVar.f15547b += iMin;
            if (vbVar.f15547b == vbVar.f15548c) {
                bbVar.f14652a = vbVar.b();
                wb.a(vbVar);
            }
            j -= j2;
        }
    }

    public String toString() {
        return "DeflaterSink(" + this.f14780a + Constants.RIGHT_BRACKET_ONLY;
    }

    @Override // com.huawei.hms.network.embedded.yb
    public ac timeout() {
        return this.f14780a.timeout();
    }

    @Override // com.huawei.hms.network.embedded.yb, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f14780a.flush();
    }

    public void e() throws IOException {
        this.f14781b.finish();
        a(false);
    }

    @Override // com.huawei.hms.network.embedded.yb, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws Throwable {
        if (this.f14782c) {
            return;
        }
        e();
        th = null;
        try {
            this.f14781b.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f14780a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f14782c = true;
        if (th != null) {
            cc.a(th);
        }
    }

    private void a(boolean z) throws IOException {
        vb vbVarE;
        bb bbVarA = this.f14780a.a();
        while (true) {
            vbVarE = bbVarA.e(1);
            Deflater deflater = this.f14781b;
            byte[] bArr = vbVarE.f15546a;
            int i = vbVarE.f15548c;
            int i2 = 8192 - i;
            int iDeflate = z ? deflater.deflate(bArr, i, i2, 2) : deflater.deflate(bArr, i, i2);
            if (iDeflate > 0) {
                vbVarE.f15548c += iDeflate;
                bbVarA.f14653b += (long) iDeflate;
                this.f14780a.d();
            } else if (this.f14781b.needsInput()) {
                break;
            }
        }
        if (vbVarE.f15547b == vbVarE.f15548c) {
            bbVarA.f14652a = vbVarE.b();
            wb.a(vbVarE);
        }
    }

    public fb(yb ybVar, Deflater deflater) {
        this(ob.a(ybVar), deflater);
    }

    public fb(cb cbVar, Deflater deflater) {
        if (cbVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f14780a = cbVar;
        this.f14781b = deflater;
    }
}
