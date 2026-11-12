package g1;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class p implements l0.c<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f74725a;

    public p(q qVar) {
        this.f74725a = qVar;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        boolean z14 = th3 instanceof MediaCodec.CodecException;
        q qVar = this.f74725a;
        if (!z14) {
            qVar.f74726a.b(0, th3.getMessage(), th3);
            return;
        }
        r rVar = qVar.f74726a;
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th3;
        rVar.getClass();
        rVar.b(1, codecException.getMessage(), codecException);
    }

    @Override // l0.c
    public final /* bridge */ /* synthetic */ void onSuccess(Void r14) {
    }
}
