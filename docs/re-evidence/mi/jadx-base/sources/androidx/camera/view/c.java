package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.camera.core.r;
import defpackage.lhe;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f1856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FrameLayout f1857b;
    public final b c;
    public boolean d = false;

    public interface a {
        void a();
    }

    public c(FrameLayout frameLayout, b bVar) {
        this.f1857b = frameLayout;
        this.c = bVar;
    }

    public Bitmap a() {
        Bitmap bitmapC = c();
        if (bitmapC == null) {
            return null;
        }
        return this.c.a(bitmapC, new Size(this.f1857b.getWidth(), this.f1857b.getHeight()), this.f1857b.getLayoutDirection());
    }

    public abstract View b();

    public abstract Bitmap c();

    public abstract void d();

    public abstract void e();

    public void f() {
        this.d = true;
        h();
    }

    public abstract void g(r rVar, a aVar);

    public void h() {
        View viewB = b();
        if (viewB == null || !this.d) {
            return;
        }
        this.c.q(new Size(this.f1857b.getWidth(), this.f1857b.getHeight()), this.f1857b.getLayoutDirection(), viewB);
    }

    public abstract lhe<Void> i();
}
