package com.huawei.hms.network.embedded;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: loaded from: classes34.dex */
public final class xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f15612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cb f15613c;
    public final bb d;
    public boolean e;
    public final bb f;
    public final a g;
    public boolean h;
    public boolean i;
    public final byte[] j;
    public final bb.c k;

    public void b(eb ebVar) throws IOException {
        b(10, ebVar);
    }

    public void a(eb ebVar) throws IOException {
        b(9, ebVar);
    }

    public final class a implements yb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f15615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15616c;
        public boolean d;

        @Override // com.huawei.hms.network.embedded.yb
        public void write(bb bbVar, long j) throws IOException {
            if (this.d) {
                throw new IOException("closed");
            }
            xa.this.f.write(bbVar, j);
            boolean z = this.f15616c && this.f15615b != -1 && xa.this.f.B() > this.f15615b - PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            long jT = xa.this.f.t();
            if (jT <= 0 || z) {
                return;
            }
            xa.this.a(this.f15614a, jT, this.f15616c, false);
            this.f15616c = false;
        }

        @Override // com.huawei.hms.network.embedded.yb
        public ac timeout() {
            return xa.this.f15613c.timeout();
        }

        @Override // com.huawei.hms.network.embedded.yb, java.io.Flushable
        public void flush() throws IOException {
            if (this.d) {
                throw new IOException("closed");
            }
            xa xaVar = xa.this;
            xaVar.a(this.f15614a, xaVar.f.B(), this.f15616c, false);
            this.f15616c = false;
        }

        @Override // com.huawei.hms.network.embedded.yb, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            if (this.d) {
                throw new IOException("closed");
            }
            xa xaVar = xa.this;
            xaVar.a(this.f15614a, xaVar.f.B(), this.f15616c, true);
            this.d = true;
            xa.this.h = false;
        }

        public a() {
        }
    }

    public void a(int i, eb ebVar) throws IOException {
        eb ebVarR = eb.f;
        if (i != 0 || ebVar != null) {
            if (i != 0) {
                va.b(i);
            }
            bb bbVar = new bb();
            bbVar.writeShort(i);
            if (ebVar != null) {
                bbVar.a(ebVar);
            }
            ebVarR = bbVar.r();
        }
        try {
            b(8, ebVarR);
        } finally {
            this.e = true;
        }
    }

    public void a(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        if (this.i) {
            i |= 64;
        }
        this.d.writeByte(i);
        int i2 = this.f15611a ? 128 : 0;
        if (j <= 125) {
            this.d.writeByte(((int) j) | i2);
        } else if (j <= 65535) {
            this.d.writeByte(i2 | 126);
            this.d.writeShort((int) j);
        } else {
            this.d.writeByte(i2 | 127);
            this.d.writeLong(j);
        }
        if (this.f15611a) {
            this.f15612b.nextBytes(this.j);
            this.d.write(this.j);
            if (j > 0) {
                long jB = this.d.B();
                this.d.write(this.f, j);
                this.d.a(this.k);
                this.k.k(jB);
                va.a(this.k, this.j);
                this.k.close();
            }
        } else {
            this.d.write(this.f, j);
        }
        this.f15613c.c();
    }

    public yb a(int i, long j) {
        if (this.h) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.h = true;
        a aVar = this.g;
        aVar.f15614a = i;
        aVar.f15615b = j;
        aVar.f15616c = true;
        aVar.d = false;
        return aVar;
    }

    private void b(int i, eb ebVar) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        int iJ = ebVar.j();
        if (iJ > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.d.writeByte(i | 128);
        if (this.f15611a) {
            this.d.writeByte(iJ | 128);
            this.f15612b.nextBytes(this.j);
            this.d.write(this.j);
            if (iJ > 0) {
                long jB = this.d.B();
                this.d.a(ebVar);
                this.d.a(this.k);
                this.k.k(jB);
                va.a(this.k, this.j);
                this.k.close();
            }
        } else {
            this.d.writeByte(iJ);
            this.d.a(ebVar);
        }
        this.f15613c.flush();
    }

    public xa(boolean z, cb cbVar, Random random, boolean z2) {
        this(z, cbVar, random);
        this.i = z2;
    }

    public xa(boolean z, cb cbVar, Random random) {
        this.f = new bb();
        this.g = new a();
        this.i = false;
        if (cbVar == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.f15611a = z;
        this.f15613c = cbVar;
        this.d = cbVar.a();
        this.f15612b = random;
        this.j = z ? new byte[4] : null;
        this.k = z ? new bb.c() : null;
    }
}
