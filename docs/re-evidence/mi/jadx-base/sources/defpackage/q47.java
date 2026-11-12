package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q47<T extends Drawable> implements kqk<T>, fad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f31075a;

    public q47(T t) {
        this.f31075a = (T) a6i.d(t);
    }

    @Override // defpackage.kqk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f31075a.getConstantState();
        return constantState == null ? this.f31075a : (T) constantState.newDrawable();
    }

    public void initialize() {
        T t = this.f31075a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof kza) {
            ((kza) t).e().prepareToDraw();
        }
    }
}
