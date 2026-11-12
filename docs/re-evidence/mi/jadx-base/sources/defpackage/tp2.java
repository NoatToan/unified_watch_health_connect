package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(api = 28)
public final class tp2 implements tqk<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cq2 f34903a = new dq2();

    @Override // defpackage.tqk
    public /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, cch cchVar) throws IOException {
        return d(sp2.a(source), cchVar);
    }

    @Override // defpackage.tqk
    public /* bridge */ /* synthetic */ kqk<Bitmap> b(ImageDecoder.Source source, int i, int i2, cch cchVar) throws IOException {
        return c(sp2.a(source), i, i2, cchVar);
    }

    public kqk<Bitmap> c(ImageDecoder.Source source, int i, int i2, cch cchVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new kw5(i, i2, cchVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoded [");
            sb.append(bitmapDecodeBitmap.getWidth());
            sb.append("x");
            sb.append(bitmapDecodeBitmap.getHeight());
            sb.append("] for [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("]");
        }
        return new gq2(bitmapDecodeBitmap, this.f34903a);
    }

    public boolean d(ImageDecoder.Source source, cch cchVar) throws IOException {
        return true;
    }
}
