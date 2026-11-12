package com.huawei.hms.network.embedded;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes34.dex */
public final class nb implements zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final db f15134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f15135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15136c;
    public boolean d;

    @Override // com.huawei.hms.network.embedded.zb, com.huawei.hms.network.embedded.yb
    public ac timeout() {
        return this.f15134a.timeout();
    }

    @Override // com.huawei.hms.network.embedded.zb
    public long read(bb bbVar, long j) throws IOException {
        boolean zB;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            zB = b();
            try {
                vb vbVarE = bbVar.e(1);
                int iInflate = this.f15135b.inflate(vbVarE.f15546a, vbVarE.f15548c, (int) Math.min(j, 8192 - vbVarE.f15548c));
                if (iInflate > 0) {
                    vbVarE.f15548c += iInflate;
                    long j2 = iInflate;
                    bbVar.f14653b += j2;
                    return j2;
                }
                if (!this.f15135b.finished() && !this.f15135b.needsDictionary()) {
                }
                c();
                if (vbVarE.f15547b != vbVarE.f15548c) {
                    return -1L;
                }
                bbVar.f14652a = vbVarE.b();
                wb.a(vbVarE);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!zB);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
    public void close() throws IOException {
        if (this.d) {
            return;
        }
        this.f15135b.end();
        this.d = true;
        this.f15134a.close();
    }

    public final boolean b() throws IOException {
        if (!this.f15135b.needsInput()) {
            return false;
        }
        c();
        if (this.f15135b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f15134a.i()) {
            return true;
        }
        vb vbVar = this.f15134a.a().f14652a;
        int i = vbVar.f15548c;
        int i2 = vbVar.f15547b;
        this.f15136c = i - i2;
        this.f15135b.setInput(vbVar.f15546a, i2, this.f15136c);
        return false;
    }

    private void c() throws IOException {
        int i = this.f15136c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f15135b.getRemaining();
        this.f15136c -= remaining;
        this.f15134a.skip(remaining);
    }

    public nb(zb zbVar, Inflater inflater) {
        this(ob.a(zbVar), inflater);
    }

    public nb(db dbVar, Inflater inflater) {
        if (dbVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f15134a = dbVar;
        this.f15135b = inflater;
    }
}
