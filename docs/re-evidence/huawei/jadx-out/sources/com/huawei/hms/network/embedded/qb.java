package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class qb implements zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final db f15250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bb f15251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vb f15252c;
    public int d;
    public boolean e;
    public long f;

    @Override // com.huawei.hms.network.embedded.zb, com.huawei.hms.network.embedded.yb
    public ac timeout() {
        return this.f15250a.timeout();
    }

    @Override // com.huawei.hms.network.embedded.zb
    public long read(bb bbVar, long j) throws IOException {
        vb vbVar;
        vb vbVar2;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        vb vbVar3 = this.f15252c;
        if (vbVar3 != null && (vbVar3 != (vbVar2 = this.f15251b.f14652a) || this.d != vbVar2.f15547b)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f15250a.h(this.f + 1)) {
            return -1L;
        }
        if (this.f15252c == null && (vbVar = this.f15251b.f14652a) != null) {
            this.f15252c = vbVar;
            this.d = vbVar.f15547b;
        }
        long jMin = Math.min(j, this.f15251b.f14653b - this.f);
        this.f15251b.a(bbVar, this.f, jMin);
        this.f += jMin;
        return jMin;
    }

    @Override // com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
    public void close() throws IOException {
        this.e = true;
    }

    public qb(db dbVar) {
        this.f15250a = dbVar;
        bb bbVarA = dbVar.a();
        this.f15251b = bbVarA;
        vb vbVar = bbVarA.f14652a;
        this.f15252c = vbVar;
        this.d = vbVar != null ? vbVar.f15547b : -1;
    }
}
