package com.google.android.exoplayer2.audio;

import androidx.media3.exoplayer.video.f;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import fa.z;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f52965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f52966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f52967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f52968e;

    public /* synthetic */ b(Object obj, String str, long j8, long j14, int i14) {
        this.f52964a = i14;
        this.f52968e = obj;
        this.f52965b = str;
        this.f52966c = j8;
        this.f52967d = j14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f52964a;
        Object obj = this.f52968e;
        switch (i14) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj).lambda$decoderInitialized$1(this.f52965b, this.f52966c, this.f52967d);
                break;
            case 1:
                ((VideoRendererEventListener.EventDispatcher) obj).lambda$decoderInitialized$1(this.f52965b, this.f52966c, this.f52967d);
                break;
            case 2:
                androidx.media3.exoplayer.audio.b bVar = ((androidx.media3.exoplayer.audio.b.a) obj).f8767b;
                int i15 = z.f70071a;
                bVar.onAudioDecoderInitialized(this.f52965b, this.f52966c, this.f52967d);
                break;
            default:
                f fVar = ((f.a) obj).f9870b;
                int i16 = z.f70071a;
                fVar.onVideoDecoderInitialized(this.f52965b, this.f52966c, this.f52967d);
                break;
        }
    }
}
