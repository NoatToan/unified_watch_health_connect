package com.google.android.exoplayer2.audio;

import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import defpackage.rk1;
import defpackage.wlq;
import java.nio.ByteBuffer;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends c {
    public final long i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final short f7853k;
    public int l;
    public boolean m;
    public byte[] n;
    public byte[] o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7854r;
    public boolean s;
    public long t;

    public h() {
        this(150000L, 20000L, HMReminderInfo.FLAG_SATURDAY);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !f()) {
            int i = this.p;
            if (i == 0) {
                s(byteBuffer);
            } else if (i == 1) {
                r(byteBuffer);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                t(byteBuffer);
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.c == 2) {
            return this.m ? aVar : AudioProcessor.a.e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void h() {
        if (this.m) {
            this.l = this.f7851b.d;
            int iL = l(this.i) * this.l;
            if (this.n.length != iL) {
                this.n = new byte[iL];
            }
            int iL2 = l(this.j) * this.l;
            this.f7854r = iL2;
            if (this.o.length != iL2) {
                this.o = new byte[iL2];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void i() {
        int i = this.q;
        if (i > 0) {
            q(this.n, i);
        }
        if (this.s) {
            return;
        }
        this.t += (long) (this.f7854r / this.l);
    }

    @Override // com.google.android.exoplayer2.audio.c, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.m;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void j() {
        this.m = false;
        this.f7854r = 0;
        byte[] bArr = wlq.f;
        this.n = bArr;
        this.o = bArr;
    }

    public final int l(long j) {
        return (int) ((j * ((long) this.f7851b.f7824a)) / FolmeCore.NANOS_TO_MS);
    }

    public final int m(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f7853k);
        int i = this.l;
        return ((iLimit / i) * i) + i;
    }

    public final int n(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f7853k) {
                int i = this.l;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    public long o() {
        return this.t;
    }

    public final void p(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        k(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.s = true;
        }
    }

    public final void q(byte[] bArr, int i) {
        k(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.s = true;
        }
    }

    public final void r(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iN = n(byteBuffer);
        int iPosition = iN - byteBuffer.position();
        byte[] bArr = this.n;
        int length = bArr.length;
        int i = this.q;
        int i2 = length - i;
        if (iN < iLimit && iPosition < i2) {
            q(bArr, i);
            this.q = 0;
            this.p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i2);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.n, this.q, iMin);
        int i3 = this.q + iMin;
        this.q = i3;
        byte[] bArr2 = this.n;
        if (i3 == bArr2.length) {
            if (this.s) {
                q(bArr2, this.f7854r);
                this.t += (long) ((this.q - (this.f7854r * 2)) / this.l);
            } else {
                this.t += (long) ((i3 - this.f7854r) / this.l);
            }
            v(byteBuffer, this.n, this.q);
            this.q = 0;
            this.p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    public final void s(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.n.length));
        int iM = m(byteBuffer);
        if (iM == byteBuffer.position()) {
            this.p = 1;
        } else {
            byteBuffer.limit(iM);
            p(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    public final void t(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iN = n(byteBuffer);
        byteBuffer.limit(iN);
        this.t += (long) (byteBuffer.remaining() / this.l);
        v(byteBuffer, this.o, this.f7854r);
        if (iN < iLimit) {
            q(this.o, this.f7854r);
            this.p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    public void u(boolean z) {
        this.m = z;
    }

    public final void v(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.f7854r);
        int i2 = this.f7854r - iMin;
        System.arraycopy(bArr, i - i2, this.o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.o, i2, iMin);
    }

    public h(long j, long j2, short s) {
        rk1.a(j2 <= j);
        this.i = j;
        this.j = j2;
        this.f7853k = s;
        byte[] bArr = wlq.f;
        this.n = bArr;
        this.o = bArr;
    }
}
