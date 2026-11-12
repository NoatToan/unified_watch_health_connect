package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import b71.i;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.h;

/* JADX INFO: loaded from: classes.dex */
public class f implements AudioStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5970a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5971b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5972c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f5973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f5975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AudioStream f5976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f5980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5981l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ByteBuffer f5984c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f5985d;

        public a(ByteBuffer byteBuffer, AudioStream.b bVar, int i14, int i15) {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit() - byteBuffer.position();
            if (iLimit != bVar.a()) {
                StringBuilder sbI = i.i(iLimit, "Byte buffer size is not match with packet info: ", " != ");
                sbI.append(bVar.a());
                throw new IllegalStateException(sbI.toString());
            }
            this.f5982a = i14;
            this.f5983b = i15;
            this.f5984c = byteBuffer;
            this.f5985d = bVar.b();
        }

        public final e a(ByteBuffer byteBuffer) {
            int iRemaining;
            long j8 = this.f5985d;
            ByteBuffer byteBuffer2 = this.f5984c;
            int iPosition = byteBuffer2.position();
            int iPosition2 = byteBuffer.position();
            if (byteBuffer2.remaining() > byteBuffer.remaining()) {
                iRemaining = byteBuffer.remaining();
                this.f5985d += c1.c.a(this.f5983b, c1.c.b(this.f5982a, iRemaining));
                ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
                byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
            } else {
                iRemaining = byteBuffer2.remaining();
                byteBuffer.put(byteBuffer2).limit(iPosition2 + iRemaining).position(iPosition2);
            }
            byteBuffer2.position(iPosition + iRemaining);
            return new e(iRemaining, j8);
        }
    }

    public f(AudioStream audioStream, c1.a aVar) {
        k0.a aVar2;
        if (k0.a.f101923b != null) {
            aVar2 = k0.a.f101923b;
        } else {
            synchronized (k0.a.class) {
                try {
                    if (k0.a.f101923b == null) {
                        k0.a.f101923b = new k0.a();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            aVar2 = k0.a.f101923b;
        }
        this.f5973d = new h(aVar2);
        this.f5974e = new Object();
        this.f5975f = null;
        this.f5980k = new AtomicBoolean(false);
        this.f5976g = audioStream;
        int iC = aVar.c();
        this.f5977h = iC;
        int iD = aVar.d();
        this.f5978i = iD;
        k7.h.b(((long) iC) > 0, "mBytesPerFrame must be greater than 0.");
        k7.h.b(((long) iD) > 0, "mSampleRate must be greater than 0.");
        this.f5979j = 500;
        this.f5981l = iC * 1024;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void a(b.C0078b c0078b, h hVar) {
        k7.h.f(!this.f5970a.get(), "AudioStream can not be started when setCallback.");
        b();
        this.f5973d.execute(new a8.d(this, 11, c0078b, hVar));
    }

    public final void b() {
        k7.h.f(!this.f5971b.get(), "AudioStream has been released.");
    }

    public final void c() {
        if (this.f5980k.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f5981l);
            a aVar = new a(byteBufferAllocateDirect, this.f5976g.read(byteBufferAllocateDirect), this.f5977h, this.f5978i);
            int i14 = this.f5979j;
            synchronized (this.f5974e) {
                try {
                    this.f5972c.offer(aVar);
                    while (this.f5972c.size() > i14) {
                        this.f5972c.poll();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.f5980k.get()) {
                this.f5973d.execute(new c1.d(this, 3));
            }
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @SuppressLint({"BanThreadSleep"})
    public final e read(ByteBuffer byteBuffer) {
        boolean z14;
        b();
        k7.h.f(this.f5970a.get(), "AudioStream has not been started.");
        this.f5973d.execute(new androidx.media3.exoplayer.d(this, byteBuffer.remaining(), 2));
        e eVar = new e(0, 0L);
        do {
            synchronized (this.f5974e) {
                try {
                    a aVar = this.f5975f;
                    this.f5975f = null;
                    if (aVar == null) {
                        aVar = (a) this.f5972c.poll();
                    }
                    if (aVar != null) {
                        eVar = aVar.a(byteBuffer);
                        if (aVar.f5984c.remaining() > 0) {
                            this.f5975f = aVar;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            z14 = eVar.f5968a <= 0 && this.f5970a.get() && !this.f5971b.get();
            if (z14) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                    return eVar;
                }
            }
        } while (z14);
        return eVar;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void release() {
        if (this.f5971b.getAndSet(true)) {
            return;
        }
        this.f5973d.execute(new c1.d(this, 2));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void start() {
        b();
        AtomicBoolean atomicBoolean = this.f5970a;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new c1.d(this, 1), null);
        this.f5973d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e4) {
            atomicBoolean.set(false);
            throw new AudioStream.AudioStreamException(e4);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void stop() {
        b();
        if (this.f5970a.getAndSet(false)) {
            this.f5973d.execute(new c1.d(this, 0));
        }
    }
}
