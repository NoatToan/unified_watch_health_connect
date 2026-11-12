package dj;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements ui.j<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f59883a = new d();

    @Override // ui.j
    public final wi.u<Bitmap> a(InputStream inputStream, int i14, int i15, ui.h hVar) {
        return this.f59883a.a(ImageDecoder.createSource(qj.a.b(inputStream)), i14, i15, hVar);
    }

    @Override // ui.j
    public final /* bridge */ /* synthetic */ boolean b(InputStream inputStream, ui.h hVar) {
        return true;
    }
}
