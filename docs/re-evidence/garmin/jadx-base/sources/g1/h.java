package g1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f74707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec.BufferInfo f74708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteBuffer f74710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.concurrent.futures.b.d f74711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.concurrent.futures.b.a<Void> f74712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f74713g = new AtomicBoolean(false);

    public h(MediaCodec mediaCodec, int i14, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.f74707a = mediaCodec;
        this.f74709c = i14;
        this.f74710d = mediaCodec.getOutputBuffer(i14);
        bufferInfo.getClass();
        this.f74708b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = v.h.class;
        try {
            atomicReference.set(aVar);
            aVar.f6079a = "Data closed";
        } catch (Exception e4) {
            dVar.a(e4);
        }
        this.f74711e = dVar;
        androidx.concurrent.futures.b.a<Void> aVar2 = (androidx.concurrent.futures.b.a) atomicReference.get();
        aVar2.getClass();
        this.f74712f = aVar2;
    }

    @Override // g1.g
    public final MediaCodec.BufferInfo M() {
        return this.f74708b;
    }

    @Override // g1.g
    public final long a0() {
        return this.f74708b.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        androidx.concurrent.futures.b.a<Void> aVar = this.f74712f;
        if (this.f74713g.getAndSet(true)) {
            return;
        }
        try {
            this.f74707a.releaseOutputBuffer(this.f74709c, false);
            aVar.b(null);
        } catch (IllegalStateException e4) {
            aVar.d(e4);
        }
    }

    @Override // g1.g
    public final boolean h2() {
        return (this.f74708b.flags & 1) != 0;
    }

    @Override // g1.g
    public final ByteBuffer i() {
        if (this.f74713g.get()) {
            vb.h.z("encoded data is closed.");
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = this.f74708b;
        int i14 = bufferInfo.offset;
        ByteBuffer byteBuffer = this.f74710d;
        byteBuffer.position(i14);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }

    @Override // g1.g
    public final long size() {
        return this.f74708b.size;
    }
}
