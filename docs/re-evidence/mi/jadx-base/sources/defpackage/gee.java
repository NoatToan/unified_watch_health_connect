package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes4.dex */
public final class gee implements kqk<BitmapDrawable>, fad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f18888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kqk<Bitmap> f18889b;

    public gee(Resources resources, kqk<Bitmap> kqkVar) {
        this.f18888a = (Resources) a6i.d(resources);
        this.f18889b = (kqk) a6i.d(kqkVar);
    }

    public static kqk<BitmapDrawable> c(Resources resources, kqk<Bitmap> kqkVar) {
        if (kqkVar == null) {
            return null;
        }
        return new gee(resources, kqkVar);
    }

    @Override // defpackage.kqk
    public Class<BitmapDrawable> a() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.kqk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f18888a, this.f18889b.get());
    }

    @Override // defpackage.kqk
    public int getSize() {
        return this.f18889b.getSize();
    }

    @Override // defpackage.fad
    public void initialize() {
        kqk<Bitmap> kqkVar = this.f18889b;
        if (kqkVar instanceof fad) {
            ((fad) kqkVar).initialize();
        }
    }

    @Override // defpackage.kqk
    public void recycle() {
        this.f18889b.recycle();
    }
}
