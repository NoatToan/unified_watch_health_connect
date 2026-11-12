package nj;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e<Z> extends i<ImageView, Z> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Animatable f126224d;

    public e(ImageView imageView) {
        super(imageView);
    }

    @Override // nj.i, nj.a, nj.h
    public final void a(Drawable drawable) {
        super.a(drawable);
        Animatable animatable = this.f126224d;
        if (animatable != null) {
            animatable.stop();
        }
        d(null);
        this.f126224d = null;
        ((ImageView) this.f126225b).setImageDrawable(drawable);
    }

    @Override // nj.a, nj.h
    public final void c(Drawable drawable) {
        d(null);
        this.f126224d = null;
        ((ImageView) this.f126225b).setImageDrawable(drawable);
    }

    public abstract void d(Z z14);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nj.h
    public final void f(Object obj) {
        d(obj);
        if (!(obj instanceof Animatable)) {
            this.f126224d = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f126224d = animatable;
        animatable.start();
    }

    @Override // nj.i, nj.a, nj.h
    public final void h(Drawable drawable) {
        d(null);
        this.f126224d = null;
        ((ImageView) this.f126225b).setImageDrawable(drawable);
    }

    @Override // nj.a, jj.m
    public final void onStart() {
        Animatable animatable = this.f126224d;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // nj.a, jj.m
    public final void onStop() {
        Animatable animatable = this.f126224d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Deprecated
    public e(ImageView imageView, boolean z14) {
        super(imageView, z14);
    }
}
