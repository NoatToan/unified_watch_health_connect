package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final class m9q implements tqk<Bitmap, Bitmap> {

    public static final class a implements kqk<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f25926a;

        public a(Bitmap bitmap) {
            this.f25926a = bitmap;
        }

        @Override // defpackage.kqk
        public Class<Bitmap> a() {
            return Bitmap.class;
        }

        @Override // defpackage.kqk
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f25926a;
        }

        @Override // defpackage.kqk
        public int getSize() {
            return ulq.i(this.f25926a);
        }

        @Override // defpackage.kqk
        public void recycle() {
        }
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public kqk<Bitmap> b(Bitmap bitmap, int i, int i2, cch cchVar) {
        return new a(bitmap);
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Bitmap bitmap, cch cchVar) {
        return true;
    }
}
