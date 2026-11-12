package dj;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes7.dex */
public class a<DataType> implements ui.j<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui.j<DataType, Bitmap> f59800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f59801b;

    public a(Resources resources, ui.j<DataType, Bitmap> jVar) {
        qj.l.c(resources, "Argument must not be null");
        this.f59801b = resources;
        qj.l.c(jVar, "Argument must not be null");
        this.f59800a = jVar;
    }

    @Override // ui.j
    public final wi.u<BitmapDrawable> a(DataType datatype, int i14, int i15, ui.h hVar) {
        return w.c(this.f59801b, this.f59800a.a(datatype, i14, i15, hVar));
    }

    @Override // ui.j
    public final boolean b(DataType datatype, ui.h hVar) {
        return this.f59800a.b(datatype, hVar);
    }

    @Deprecated
    public a(Resources resources, xi.d dVar, ui.j<DataType, Bitmap> jVar) {
        this(resources, jVar);
    }

    public a(Context context, ui.j<DataType, Bitmap> jVar) {
        this(context.getResources(), jVar);
    }
}
