package androidx.camera.video.internal.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.h;

/* JADX INFO: loaded from: classes.dex */
public class g implements AudioStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5986a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5987b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f5990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b.C0078b f5992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f5993h;

    public g(c1.a aVar) {
        this.f5988c = aVar.c();
        this.f5989d = aVar.d();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void a(b.C0078b c0078b, h hVar) {
        k7.h.f(!this.f5986a.get(), "AudioStream can not be started when setCallback.");
        b();
        this.f5992g = c0078b;
        this.f5993h = hVar;
    }

    public final void b() {
        k7.h.f(!this.f5987b.get(), "AudioStream has been released.");
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final e read(ByteBuffer byteBuffer) {
        b();
        k7.h.f(this.f5986a.get(), "AudioStream has not been started.");
        long jRemaining = byteBuffer.remaining();
        int i14 = this.f5988c;
        long jB = c1.c.b(i14, jRemaining);
        long j8 = i14;
        k7.h.b(j8 > 0, "bytesPerFrame must be greater than 0.");
        int i15 = (int) (j8 * jB);
        if (i15 <= 0) {
            return new e(0, this.f5991f);
        }
        long jA = this.f5991f + c1.c.a(this.f5989d, jB);
        long jNanoTime = jA - System.nanoTime();
        if (jNanoTime > 0) {
            try {
                Thread.sleep(jNanoTime / 1000000);
            } catch (InterruptedException unused) {
            }
        }
        k7.h.f(i15 <= byteBuffer.remaining(), null);
        byte[] bArr = this.f5990e;
        if (bArr == null || bArr.length < i15) {
            this.f5990e = new byte[i15];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f5990e, 0, i15).limit(iPosition + i15).position(iPosition);
        e eVar = new e(i15, this.f5991f);
        this.f5991f = jA;
        return eVar;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void release() {
        this.f5987b.getAndSet(true);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void start() {
        b();
        if (this.f5986a.getAndSet(true)) {
            return;
        }
        this.f5991f = System.nanoTime();
        b.C0078b c0078b = this.f5992g;
        h hVar = this.f5993h;
        if (c0078b == null || hVar == null) {
            return;
        }
        hVar.execute(new a0.c(c0078b, 27));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void stop() {
        b();
        this.f5986a.set(false);
    }
}
