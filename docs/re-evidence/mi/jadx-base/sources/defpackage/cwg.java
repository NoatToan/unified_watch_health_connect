package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class cwg extends q47<Drawable> {
    public cwg(Drawable drawable) {
        super(drawable);
    }

    public static kqk<Drawable> c(Drawable drawable) {
        if (drawable != null) {
            return new cwg(drawable);
        }
        return null;
    }

    @Override // defpackage.kqk
    public Class<Drawable> a() {
        return this.f31075a.getClass();
    }

    @Override // defpackage.kqk
    public int getSize() {
        return Math.max(1, this.f31075a.getIntrinsicWidth() * this.f31075a.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.kqk
    public void recycle() {
    }
}
