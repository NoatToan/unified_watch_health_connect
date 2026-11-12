package ij;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import dj.w;
import qj.l;
import ui.h;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f93798a;

    public b(Resources resources) {
        l.c(resources, "Argument must not be null");
        this.f93798a = resources;
    }

    @Override // ij.e
    public final u<BitmapDrawable> a(u<Bitmap> uVar, h hVar) {
        return w.c(this.f93798a, uVar);
    }

    @Deprecated
    public b(Resources resources, xi.d dVar) {
        this(resources);
    }

    public b(Context context) {
        this(context.getResources());
    }
}
