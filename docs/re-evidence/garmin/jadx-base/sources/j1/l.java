package j1;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import b0.g1;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f96288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f96289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f96290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f96291d = false;

    public interface a {
    }

    public l(FrameLayout frameLayout, j jVar) {
        this.f96289b = frameLayout;
        this.f96290c = jVar;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(g1 g1Var, a73.f fVar);

    public final void f() {
        View viewA = a();
        if (viewA == null || !this.f96291d) {
            return;
        }
        FrameLayout frameLayout = this.f96289b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        j jVar = this.f96290c;
        jVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            return;
        }
        if (jVar.f()) {
            if (viewA instanceof TextureView) {
                ((TextureView) viewA).setTransform(jVar.d());
            } else {
                Display display = viewA.getDisplay();
                if (!jVar.f96253g || display == null || display.getRotation() != jVar.f96251e) {
                }
                boolean z14 = jVar.f96253g;
                if (!z14) {
                    if ((!z14 ? jVar.f96249c : -j0.c.b(jVar.f96251e)) != 0) {
                    }
                }
            }
            RectF rectFE = jVar.e(size, layoutDirection);
            viewA.setPivotX(0.0f);
            viewA.setPivotY(0.0f);
            viewA.setScaleX(rectFE.width() / jVar.f96247a.getWidth());
            viewA.setScaleY(rectFE.height() / jVar.f96247a.getHeight());
            viewA.setTranslationX(rectFE.left - viewA.getLeft());
            viewA.setTranslationY(rectFE.top - viewA.getTop());
        }
    }

    public abstract ListenableFuture<Void> g();
}
