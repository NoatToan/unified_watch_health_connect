package defpackage;

import android.graphics.Matrix;
import android.media.ImageReader;
import androidx.annotation.RequiresApi;
import androidx.camera.core.m;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class k7g extends ha1 {
    public volatile uzo c;
    public volatile Long d;
    public volatile Integer e;
    public volatile Matrix f;

    public k7g(ImageReader imageReader) {
        super(imageReader);
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    @Override // defpackage.ha1, defpackage.p5d
    public m e() {
        return l(super.e());
    }

    @Override // defpackage.ha1, defpackage.p5d
    public m g() {
        return l(super.e());
    }

    public final m l(m mVar) {
        q4d q4dVarH = mVar.H();
        return new m0m(mVar, u6d.e(this.c != null ? this.c : q4dVarH.a(), this.d != null ? this.d.longValue() : q4dVarH.getTimestamp(), this.e != null ? this.e.intValue() : q4dVarH.d(), this.f != null ? this.f : q4dVarH.c()));
    }

    public void m(uzo uzoVar) {
        this.c = uzoVar;
    }
}
