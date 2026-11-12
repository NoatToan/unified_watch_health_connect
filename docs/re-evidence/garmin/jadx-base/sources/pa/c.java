package pa;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.t0;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class c extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f136684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f136685c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f136690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f136691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f136692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f136693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f136694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f136695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IllegalStateException f136696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MediaCodecRenderer.b f136697o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f136683a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1.c f136686d = new p1.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1.c f136687e = new p1.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<MediaCodec.BufferInfo> f136688f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f136689g = new ArrayDeque<>();

    public c(HandlerThread handlerThread) {
        this.f136684b = handlerThread;
    }

    public final void a() {
        ArrayDeque<MediaFormat> arrayDeque = this.f136689g;
        if (!arrayDeque.isEmpty()) {
            this.f136691i = arrayDeque.getLast();
        }
        p1.c cVar = this.f136686d;
        cVar.f134681c = cVar.f134680b;
        p1.c cVar2 = this.f136687e;
        cVar2.f134681c = cVar2.f134680b;
        this.f136688f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f136683a) {
            this.f136693k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f136683a) {
            this.f136692j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i14) {
        t0.a aVar;
        synchronized (this.f136683a) {
            this.f136686d.a(i14);
            MediaCodecRenderer.b bVar = this.f136697o;
            if (bVar != null && (aVar = MediaCodecRenderer.this.T) != null) {
                aVar.onWakeup();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i14, MediaCodec.BufferInfo bufferInfo) {
        t0.a aVar;
        synchronized (this.f136683a) {
            try {
                MediaFormat mediaFormat = this.f136691i;
                if (mediaFormat != null) {
                    this.f136687e.a(-2);
                    this.f136689g.add(mediaFormat);
                    this.f136691i = null;
                }
                this.f136687e.a(i14);
                this.f136688f.add(bufferInfo);
                MediaCodecRenderer.b bVar = this.f136697o;
                if (bVar != null && (aVar = MediaCodecRenderer.this.T) != null) {
                    aVar.onWakeup();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f136683a) {
            this.f136687e.a(-2);
            this.f136689g.add(mediaFormat);
            this.f136691i = null;
        }
    }
}
