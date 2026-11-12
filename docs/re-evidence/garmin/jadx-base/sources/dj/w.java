package dj;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements wi.u<BitmapDrawable>, wi.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f59884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi.u<Bitmap> f59885b;

    private w(Resources resources, wi.u<Bitmap> uVar) {
        qj.l.c(resources, "Argument must not be null");
        this.f59884a = resources;
        qj.l.c(uVar, "Argument must not be null");
        this.f59885b = uVar;
    }

    public static w c(Resources resources, wi.u uVar) {
        if (uVar == null) {
            return null;
        }
        return new w(resources, uVar);
    }

    @Override // wi.u
    public final Class<BitmapDrawable> a() {
        return BitmapDrawable.class;
    }

    @Override // wi.u
    public final void b() {
        this.f59885b.b();
    }

    @Override // wi.u
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f59884a, this.f59885b.get());
    }

    @Override // wi.u
    public final int getSize() {
        return this.f59885b.getSize();
    }

    @Override // wi.q
    public final void initialize() {
        wi.u<Bitmap> uVar = this.f59885b;
        if (uVar instanceof wi.q) {
            ((wi.q) uVar).initialize();
        }
    }
}
