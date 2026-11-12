package g1;

import android.media.MediaCodec;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f74800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f74802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.concurrent.futures.b.d f74803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.concurrent.futures.b.a<Void> f74804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f74805f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f74806g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f74807h = false;

    public z(MediaCodec mediaCodec, int i14) {
        mediaCodec.getClass();
        this.f74800a = mediaCodec;
        k7.h.d(i14);
        this.f74801b = i14;
        this.f74802c = mediaCodec.getInputBuffer(i14);
        AtomicReference atomicReference = new AtomicReference();
        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = v.h.class;
        try {
            atomicReference.set(aVar);
            aVar.f6079a = "Terminate InputBuffer";
        } catch (Exception e4) {
            dVar.a(e4);
        }
        this.f74803d = dVar;
        androidx.concurrent.futures.b.a<Void> aVar2 = (androidx.concurrent.futures.b.a) atomicReference.get();
        aVar2.getClass();
        this.f74804e = aVar2;
    }

    @Override // g1.y
    public final boolean a() {
        androidx.concurrent.futures.b.a<Void> aVar = this.f74804e;
        ByteBuffer byteBuffer = this.f74802c;
        if (this.f74805f.getAndSet(true)) {
            return false;
        }
        try {
            this.f74800a.queueInputBuffer(this.f74801b, byteBuffer.position(), byteBuffer.limit(), this.f74806g, this.f74807h ? 4 : 0);
            aVar.b(null);
            return true;
        } catch (IllegalStateException e4) {
            aVar.d(e4);
            return false;
        }
    }

    @Override // g1.y
    public void b(long j8) {
        if (this.f74805f.get()) {
            vb.h.z("The buffer is submitted or canceled.");
        } else {
            k7.h.a(j8 >= 0);
            this.f74806g = j8;
        }
    }

    @Override // g1.y
    public final void c() {
        if (this.f74805f.get()) {
            vb.h.z("The buffer is submitted or canceled.");
        } else {
            this.f74807h = true;
        }
    }

    @Override // g1.y
    public final boolean cancel() {
        androidx.concurrent.futures.b.a<Void> aVar = this.f74804e;
        if (this.f74805f.getAndSet(true)) {
            return false;
        }
        try {
            this.f74800a.queueInputBuffer(this.f74801b, 0, 0, 0L, 0);
            aVar.b(null);
        } catch (IllegalStateException e4) {
            aVar.d(e4);
        }
        return true;
    }

    @Override // g1.y
    public final ListenableFuture<Void> d() {
        return l0.j.f(this.f74803d);
    }

    @Override // g1.y
    public final ByteBuffer i() {
        if (!this.f74805f.get()) {
            return this.f74802c;
        }
        vb.h.z("The buffer is submitted or canceled.");
        return null;
    }
}
