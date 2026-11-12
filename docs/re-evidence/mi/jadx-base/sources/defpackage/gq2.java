package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class gq2 implements kqk<Bitmap>, fad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f19225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq2 f19226b;

    public gq2(Bitmap bitmap, cq2 cq2Var) {
        this.f19225a = (Bitmap) a6i.e(bitmap, "Bitmap must not be null");
        this.f19226b = (cq2) a6i.e(cq2Var, "BitmapPool must not be null");
    }

    public static gq2 c(Bitmap bitmap, cq2 cq2Var) {
        if (bitmap == null) {
            return null;
        }
        return new gq2(bitmap, cq2Var);
    }

    @Override // defpackage.kqk
    public Class<Bitmap> a() {
        return Bitmap.class;
    }

    @Override // defpackage.kqk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f19225a;
    }

    @Override // defpackage.kqk
    public int getSize() {
        return ulq.i(this.f19225a);
    }

    @Override // defpackage.fad
    public void initialize() {
        this.f19225a.prepareToDraw();
    }

    @Override // defpackage.kqk
    public void recycle() {
        this.f19226b.a(this.f19225a);
    }
}
