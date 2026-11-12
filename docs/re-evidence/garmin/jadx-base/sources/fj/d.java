package fj;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends c<Drawable> {
    private d(Drawable drawable) {
        super(drawable);
    }

    public static d c(Drawable drawable) {
        if (drawable != null) {
            return new d(drawable);
        }
        return null;
    }

    @Override // wi.u
    public final Class<Drawable> a() {
        return this.f71823a.getClass();
    }

    @Override // wi.u
    public final void b() {
    }

    @Override // wi.u
    public final int getSize() {
        T t7 = this.f71823a;
        return Math.max(1, t7.getIntrinsicHeight() * t7.getIntrinsicWidth() * 4);
    }
}
