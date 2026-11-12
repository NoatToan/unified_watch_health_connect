package nf;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import dg.u;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lnf/h;", "Lnf/j;", "Landroid/graphics/drawable/Drawable;", "data", "Lwf/m;", "options", "<init>", "(Landroid/graphics/drawable/Drawable;Lwf/m;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f125751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf.m f125752b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnf/h$a;", "Lnf/j$a;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements j.a<Drawable> {
        @Override // nf.j.a
        public final j a(Drawable drawable, wf.m mVar, hf.j jVar) {
            return new h(drawable, mVar);
        }
    }

    public h(Drawable drawable, wf.m mVar) {
        this.f125751a = drawable;
        this.f125752b = mVar;
    }

    @Override // nf.j
    public final Object a(t13.d<? super i> dVar) {
        Bitmap.Config[] configArr = u.f59504a;
        Drawable bitmapDrawable = this.f125751a;
        boolean z14 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof androidx.vectordrawable.graphics.drawable.f);
        if (z14) {
            dg.e eVar = dg.e.f59476a;
            wf.m mVar = this.f125752b;
            Bitmap.Config configB = wf.h.b(mVar);
            xf.g gVar = mVar.f184997b;
            xf.f fVar = mVar.f184998c;
            boolean z15 = mVar.f184999d == xf.c.INEXACT;
            eVar.getClass();
            bitmapDrawable = new BitmapDrawable(mVar.f184996a.getResources(), dg.e.a(bitmapDrawable, configB, gVar, fVar, z15));
        }
        return new l(hf.m.b(bitmapDrawable), z14, lf.e.MEMORY);
    }
}
