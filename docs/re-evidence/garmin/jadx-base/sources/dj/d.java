package dj;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements ui.j<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi.e f59814a = new xi.e();

    @Override // ui.j
    public final /* bridge */ /* synthetic */ boolean b(ImageDecoder.Source source, ui.h hVar) {
        return true;
    }

    @Override // ui.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final e a(ImageDecoder.Source source, int i14, int i15, ui.h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new cj.a(i14, i15, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new e(bitmapDecodeBitmap, this.f59814a);
    }
}
