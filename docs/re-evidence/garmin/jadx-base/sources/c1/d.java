package c1;

import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f22438b;

    public /* synthetic */ d(f fVar, int i14) {
        this.f22437a = i14;
        this.f22438b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22437a) {
            case 0:
                f fVar = this.f22438b;
                fVar.f5980k.set(false);
                fVar.f5976g.stop();
                synchronized (fVar.f5974e) {
                    fVar.f5975f = null;
                    fVar.f5972c.clear();
                    break;
                }
                return;
            case 1:
                f fVar2 = this.f22438b;
                try {
                    fVar2.f5976g.start();
                    if (fVar2.f5980k.getAndSet(true)) {
                        return;
                    }
                    fVar2.c();
                    return;
                } catch (AudioStream.AudioStreamException e4) {
                    o2.c.p(e4);
                    return;
                }
            case 2:
                f fVar3 = this.f22438b;
                fVar3.f5980k.set(false);
                fVar3.f5976g.release();
                synchronized (fVar3.f5974e) {
                    fVar3.f5975f = null;
                    fVar3.f5972c.clear();
                    break;
                }
                return;
            default:
                this.f22438b.c();
                return;
        }
    }
}
