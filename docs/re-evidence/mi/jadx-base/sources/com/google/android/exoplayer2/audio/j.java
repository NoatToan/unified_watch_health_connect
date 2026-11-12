package com.google.android.exoplayer2.audio;

import defpackage.wlq;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends c {
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7857k;
    public int l;
    public byte[] m = wlq.f;
    public int n;
    public long o;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += (long) (iMin / this.f7851b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferK = k(length);
        int iR = wlq.r(length, 0, this.n);
        byteBufferK.put(this.m, 0, iR);
        int iR2 = wlq.r(length - iR, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iR2);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iR2;
        int i4 = this.n - iR;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iR, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        byteBufferK.flip();
    }

    @Override // com.google.android.exoplayer2.audio.c, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean b() {
        return super.b() && this.n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.c, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer d() {
        int i;
        if (super.b() && (i = this.n) > 0) {
            k(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.d();
    }

    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f7857k = true;
        return (this.i == 0 && this.j == 0) ? AudioProcessor.a.e : aVar;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void h() {
        if (this.f7857k) {
            this.f7857k = false;
            int i = this.j;
            int i2 = this.f7851b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void i() {
        if (this.f7857k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.f7851b.d);
            }
            this.n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void j() {
        this.m = wlq.f;
    }

    public long l() {
        return this.o;
    }

    public void m() {
        this.o = 0L;
    }

    public void n(int i, int i2) {
        this.i = i;
        this.j = i2;
    }
}
