package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioProcessor.a f8131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioProcessor.a f8132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AudioProcessor.a f8133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f8134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f8135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f8136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8137h;

    public b() {
        ByteBuffer byteBuffer = AudioProcessor.f8121a;
        this.f8135f = byteBuffer;
        this.f8136g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f8122e;
        this.f8133d = aVar;
        this.f8134e = aVar;
        this.f8131b = aVar;
        this.f8132c = aVar;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a a(AudioProcessor.a aVar) {
        this.f8133d = aVar;
        this.f8134e = b(aVar);
        return isActive() ? this.f8134e : AudioProcessor.a.f8122e;
    }

    public AudioProcessor.a b(AudioProcessor.a aVar) {
        return AudioProcessor.a.f8122e;
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public final ByteBuffer f(int i14) {
        if (this.f8135f.capacity() < i14) {
            this.f8135f = ByteBuffer.allocateDirect(i14).order(ByteOrder.nativeOrder());
        } else {
            this.f8135f.clear();
        }
        ByteBuffer byteBuffer = this.f8135f;
        this.f8136g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f8136g = AudioProcessor.f8121a;
        this.f8137h = false;
        this.f8131b = this.f8133d;
        this.f8132c = this.f8134e;
        c();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f8136g;
        this.f8136g = AudioProcessor.f8121a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.f8134e != AudioProcessor.a.f8122e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.f8137h && this.f8136g == AudioProcessor.f8121a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.f8137h = true;
        d();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f8135f = AudioProcessor.f8121a;
        AudioProcessor.a aVar = AudioProcessor.a.f8122e;
        this.f8133d = aVar;
        this.f8134e = aVar;
        this.f8131b = aVar;
        this.f8132c = aVar;
        e();
    }
}
