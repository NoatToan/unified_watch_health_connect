package g1;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class w implements l0.c<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f74797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r.d f74798b;

    public w(r.d dVar, h hVar) {
        this.f74798b = dVar;
        this.f74797a = hVar;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        r.d dVar = this.f74798b;
        r.this.f74741o.remove(this.f74797a);
        boolean z14 = th3 instanceof MediaCodec.CodecException;
        r rVar = r.this;
        if (!z14) {
            rVar.b(0, th3.getMessage(), th3);
            return;
        }
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th3;
        rVar.getClass();
        rVar.b(1, codecException.getMessage(), codecException);
    }

    @Override // l0.c
    public final void onSuccess(Void r14) {
        r.this.f74741o.remove(this.f74797a);
    }
}
