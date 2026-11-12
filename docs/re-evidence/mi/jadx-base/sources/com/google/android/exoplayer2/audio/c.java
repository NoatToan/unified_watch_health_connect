package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioProcessor.a f7851b;
    public AudioProcessor.a c;
    public AudioProcessor.a d;
    public AudioProcessor.a e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public c() {
        ByteBuffer byteBuffer = AudioProcessor.f7823a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.f7851b = aVar;
        this.c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean b() {
        return this.h && this.g == AudioProcessor.f7823a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void c() {
        this.h = true;
        i();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = AudioProcessor.f7823a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a e(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.d = aVar;
        this.e = g(aVar);
        return isActive() ? this.e : AudioProcessor.a.e;
    }

    public final boolean f() {
        return this.g.hasRemaining();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.g = AudioProcessor.f7823a;
        this.h = false;
        this.f7851b = this.d;
        this.c = this.e;
        h();
    }

    public abstract AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException;

    public void h() {
    }

    public void i() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.e != AudioProcessor.a.e;
    }

    public void j() {
    }

    public final ByteBuffer k(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f = AudioProcessor.f7823a;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.f7851b = aVar;
        this.c = aVar;
        j();
    }
}
