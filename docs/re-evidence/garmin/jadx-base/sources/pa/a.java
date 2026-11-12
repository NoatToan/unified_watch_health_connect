package pa;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.video.b.e f136668b;

    public /* synthetic */ a(androidx.media3.exoplayer.mediacodec.c cVar, androidx.media3.exoplayer.video.b.e eVar, int i14) {
        this.f136667a = i14;
        this.f136668b = eVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j8, long j14) {
        switch (this.f136667a) {
            case 0:
                androidx.media3.exoplayer.video.b.e eVar = this.f136668b;
                Handler handler = eVar.f9800a;
                if (z.f70071a >= 30) {
                    eVar.a(j8);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j8 >> 32), (int) j8));
                }
                break;
            default:
                androidx.media3.exoplayer.video.b.e eVar2 = this.f136668b;
                Handler handler2 = eVar2.f9800a;
                if (z.f70071a >= 30) {
                    eVar2.a(j8);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j8 >> 32), (int) j8));
                }
                break;
        }
    }
}
