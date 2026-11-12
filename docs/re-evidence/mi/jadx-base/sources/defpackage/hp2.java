package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class hp2 implements grk<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f20305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20306b;

    public hp2() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // defpackage.grk
    public kqk<byte[]> a(kqk<Bitmap> kqkVar, cch cchVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        kqkVar.get().compress(this.f20305a, this.f20306b, byteArrayOutputStream);
        kqkVar.recycle();
        return new d83(byteArrayOutputStream.toByteArray());
    }

    public hp2(Bitmap.CompressFormat compressFormat, int i) {
        this.f20305a = compressFormat;
        this.f20306b = i;
    }
}
