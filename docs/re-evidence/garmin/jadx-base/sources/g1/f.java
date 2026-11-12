package g1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f74704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaCodec.BufferInfo f74705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.concurrent.futures.b.a<Void> f74706c;

    public f(g gVar) {
        MediaCodec.BufferInfo bufferInfoM = gVar.M();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoM.size, bufferInfoM.presentationTimeUs, bufferInfoM.flags);
        this.f74705b = bufferInfo;
        ByteBuffer byteBufferI = gVar.i();
        MediaCodec.BufferInfo bufferInfoM2 = gVar.M();
        byteBufferI.position(bufferInfoM2.offset);
        byteBufferI.limit(bufferInfoM2.offset + bufferInfoM2.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoM2.size);
        byteBufferAllocate.order(byteBufferI.order());
        byteBufferAllocate.put(byteBufferI);
        byteBufferAllocate.flip();
        this.f74704a = byteBufferAllocate;
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
        androidx.concurrent.futures.b.a<Void> aVar2 = (androidx.concurrent.futures.b.a) atomicReference.get();
        aVar2.getClass();
        this.f74706c = aVar2;
    }

    @Override // g1.g
    public final MediaCodec.BufferInfo M() {
        return this.f74705b;
    }

    @Override // g1.g
    public final long a0() {
        return this.f74705b.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f74706c.b(null);
    }

    @Override // g1.g
    public final boolean h2() {
        return (this.f74705b.flags & 1) != 0;
    }

    @Override // g1.g
    public final ByteBuffer i() {
        return this.f74704a;
    }

    @Override // g1.g
    public final long size() {
        return this.f74705b.size;
    }
}
