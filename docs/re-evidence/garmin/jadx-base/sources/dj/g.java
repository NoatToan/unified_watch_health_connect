package dj;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class g implements ui.j<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f59831a;

    public g(m mVar) {
        this.f59831a = mVar;
    }

    @Override // ui.j
    public final wi.u<Bitmap> a(ByteBuffer byteBuffer, int i14, int i15, ui.h hVar) {
        m mVar = this.f59831a;
        return mVar.a(new u.a(byteBuffer, mVar.f59858d, mVar.f59857c), i14, i15, hVar, m.f59852k);
    }

    @Override // ui.j
    public final boolean b(ByteBuffer byteBuffer, ui.h hVar) {
        this.f59831a.getClass();
        return true;
    }
}
