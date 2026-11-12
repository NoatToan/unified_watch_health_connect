package ka;

import androidx.media3.exoplayer.audio.AudioSink;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.audio.b.a f103677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AudioSink.a f103678c;

    public /* synthetic */ e(androidx.media3.exoplayer.audio.b.a aVar, AudioSink.a aVar2, int i14) {
        this.f103676a = i14;
        this.f103677b = aVar;
        this.f103678c = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f103676a;
        AudioSink.a aVar = this.f103678c;
        androidx.media3.exoplayer.audio.b.a aVar2 = this.f103677b;
        switch (i14) {
            case 0:
                androidx.media3.exoplayer.audio.b bVar = aVar2.f8767b;
                int i15 = z.f70071a;
                bVar.P(aVar);
                break;
            default:
                androidx.media3.exoplayer.audio.b bVar2 = aVar2.f8767b;
                int i16 = z.f70071a;
                bVar2.S(aVar);
                break;
        }
    }
}
