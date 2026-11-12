package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(api = 28)
public final class zad implements tqk<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tp2 f41071a = new tp2();

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public kqk<Bitmap> b(InputStream inputStream, int i, int i2, cch cchVar) throws IOException {
        return this.f41071a.c(ImageDecoder.createSource(f73.b(inputStream)), i, i2, cchVar);
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, cch cchVar) throws IOException {
        return true;
    }
}
