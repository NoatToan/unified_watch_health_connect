package fj;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import qj.l;
import wi.q;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T extends Drawable> implements u<T>, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f71823a;

    public c(T t7) {
        l.c(t7, "Argument must not be null");
        this.f71823a = t7;
    }

    @Override // wi.u
    public final Object get() {
        T t7 = this.f71823a;
        Drawable.ConstantState constantState = t7.getConstantState();
        return constantState == null ? t7 : constantState.newDrawable();
    }

    @Override // wi.q
    public void initialize() {
        T t7 = this.f71823a;
        if (t7 instanceof BitmapDrawable) {
            ((BitmapDrawable) t7).getBitmap().prepareToDraw();
        } else if (t7 instanceof hj.c) {
            ((hj.c) t7).f83923a.f83933a.f83946l.prepareToDraw();
        }
    }
}
