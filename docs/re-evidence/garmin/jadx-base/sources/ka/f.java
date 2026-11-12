package ka;

import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.audio.b.a f103680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Exception f103681c;

    public /* synthetic */ f(androidx.media3.exoplayer.audio.b.a aVar, Exception exc, int i14) {
        this.f103679a = i14;
        this.f103680b = aVar;
        this.f103681c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f103679a;
        Exception exc = this.f103681c;
        androidx.media3.exoplayer.audio.b.a aVar = this.f103680b;
        switch (i14) {
            case 0:
                androidx.media3.exoplayer.audio.b bVar = aVar.f8767b;
                int i15 = z.f70071a;
                bVar.onAudioCodecError(exc);
                break;
            default:
                androidx.media3.exoplayer.audio.b bVar2 = aVar.f8767b;
                int i16 = z.f70071a;
                bVar2.onAudioSinkError(exc);
                break;
        }
    }
}
