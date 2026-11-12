package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(api = 28)
public final class a73 implements tqk<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tp2 f700a = new tp2();

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public kqk<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, cch cchVar) throws IOException {
        return this.f700a.c(ImageDecoder.createSource(byteBuffer), i, i2, cchVar);
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, cch cchVar) throws IOException {
        return true;
    }
}
