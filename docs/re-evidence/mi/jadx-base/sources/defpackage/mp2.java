package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class mp2<DataType> implements tqk<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tqk<DataType, Bitmap> f27059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f27060b;

    public mp2(Resources resources, tqk<DataType, Bitmap> tqkVar) {
        this.f27060b = (Resources) a6i.d(resources);
        this.f27059a = (tqk) a6i.d(tqkVar);
    }

    @Override // defpackage.tqk
    public boolean a(DataType datatype, cch cchVar) throws IOException {
        return this.f27059a.a(datatype, cchVar);
    }

    @Override // defpackage.tqk
    public kqk<BitmapDrawable> b(DataType datatype, int i, int i2, cch cchVar) throws IOException {
        return gee.c(this.f27060b, this.f27059a.b(datatype, i, i2, cchVar));
    }
}
