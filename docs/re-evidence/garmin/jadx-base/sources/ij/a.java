package ij;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import ui.h;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public class a implements e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f93796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93797b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // ij.e
    public final u<byte[]> a(u<Bitmap> uVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uVar.get().compress(this.f93796a, this.f93797b, byteArrayOutputStream);
        uVar.b();
        return new ej.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i14) {
        this.f93796a = compressFormat;
        this.f93797b = i14;
    }
}
