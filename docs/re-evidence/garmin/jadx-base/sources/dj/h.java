package dj;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements ui.j<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f59833a = new d();

    @Override // ui.j
    public final wi.u<Bitmap> a(ByteBuffer byteBuffer, int i14, int i15, ui.h hVar) {
        return this.f59833a.a(ImageDecoder.createSource(byteBuffer), i14, i15, hVar);
    }

    @Override // ui.j
    public final /* bridge */ /* synthetic */ boolean b(ByteBuffer byteBuffer, ui.h hVar) {
        return true;
    }
}
