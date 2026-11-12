package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class nqq extends i72 {
    public mqq e;
    public Surface f;

    public nqq(mqq mqqVar) {
        super(mqqVar.f);
        this.e = mqqVar;
    }

    @Override // defpackage.i72
    public MediaFormat c() {
        return this.e.a();
    }

    @Override // defpackage.i72
    public void f(MediaCodec mediaCodec) {
        this.f = mediaCodec.createInputSurface();
    }

    @Override // defpackage.i72
    public void h() {
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
            this.f = null;
        }
        super.h();
    }

    public Surface l() {
        Surface surface = this.f;
        Objects.requireNonNull(surface, "doesn't prepare()");
        return surface;
    }
}
