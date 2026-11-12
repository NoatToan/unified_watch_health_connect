package com.google.android.exoplayer2.audio;

import defpackage.m4n;
import defpackage.rk1;
import defpackage.wlq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7855b;
    public float c = 1.0f;
    public float d = 1.0f;
    public AudioProcessor.a e;
    public AudioProcessor.a f;
    public AudioProcessor.a g;
    public AudioProcessor.a h;
    public boolean i;
    public m4n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f7856k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public i() {
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f7823a;
        this.f7856k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.f7855b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            m4n m4nVar = (m4n) rk1.e(this.j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += (long) iRemaining;
            m4nVar.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean b() {
        m4n m4nVar;
        return this.p && ((m4nVar = this.j) == null || m4nVar.k() == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void c() {
        m4n m4nVar = this.j;
        if (m4nVar != null) {
            m4nVar.s();
        }
        this.p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer d() {
        int iK;
        m4n m4nVar = this.j;
        if (m4nVar != null && (iK = m4nVar.k()) > 0) {
            if (this.f7856k.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f7856k = byteBufferOrder;
                this.l = byteBufferOrder.asShortBuffer();
            } else {
                this.f7856k.clear();
                this.l.clear();
            }
            m4nVar.j(this.l);
            this.o += (long) iK;
            this.f7856k.limit(iK);
            this.m = this.f7856k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = AudioProcessor.f7823a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public AudioProcessor.a e(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i = this.f7855b;
        if (i == -1) {
            i = aVar.f7824a;
        }
        this.e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i, aVar.f7825b, 2);
        this.f = aVar2;
        this.i = true;
        return aVar2;
    }

    public long f(long j) {
        if (this.o < 1024) {
            return (long) (((double) this.c) * j);
        }
        long jL = this.n - ((long) ((m4n) rk1.e(this.j)).l());
        int i = this.h.f7824a;
        int i2 = this.g.f7824a;
        return i == i2 ? wlq.H0(j, jL, this.o) : wlq.H0(j, jL * ((long) i), this.o * ((long) i2));
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.e;
            this.g = aVar;
            AudioProcessor.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new m4n(aVar.f7824a, aVar.f7825b, this.c, this.d, aVar2.f7824a);
            } else {
                m4n m4nVar = this.j;
                if (m4nVar != null) {
                    m4nVar.i();
                }
            }
        }
        this.m = AudioProcessor.f7823a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    public void g(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }

    public void h(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f.f7824a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.f7824a != this.e.f7824a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f7823a;
        this.f7856k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.f7855b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
