package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b6d<Z> extends lxq<ImageView, Z> implements lzp.a {
    public Animatable h;

    public b6d(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.e0p
    public void a(Z z, lzp<? super Z> lzpVar) {
        if (lzpVar == null || !lzpVar.a(z, this)) {
            p(z);
        } else {
            m(z);
        }
    }

    @Override // defpackage.lxq, defpackage.ke2, defpackage.e0p
    public void b(Drawable drawable) {
        super.b(drawable);
        Animatable animatable = this.h;
        if (animatable != null) {
            animatable.stop();
        }
        p(null);
        n(drawable);
    }

    @Override // defpackage.lxq, defpackage.ke2, defpackage.e0p
    public void e(Drawable drawable) {
        super.e(drawable);
        p(null);
        n(drawable);
    }

    @Override // defpackage.ke2, defpackage.e0p
    public void g(Drawable drawable) {
        super.g(drawable);
        p(null);
        n(drawable);
    }

    public final void m(Z z) {
        if (!(z instanceof Animatable)) {
            this.h = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.h = animatable;
        animatable.start();
    }

    public void n(Drawable drawable) {
        ((ImageView) this.f25534a).setImageDrawable(drawable);
    }

    public abstract void o(Z z);

    @Override // defpackage.ke2, defpackage.mfe
    public void onStart() {
        Animatable animatable = this.h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.ke2, defpackage.mfe
    public void onStop() {
        Animatable animatable = this.h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void p(Z z) {
        o(z);
        m(z);
    }
}
