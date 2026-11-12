package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.view.c;
import com.facebook.react.views.view.ReactViewBackgroundDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class xfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ReactViewBackgroundDrawable f39073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f39074b;

    public xfj(View view) {
        this.f39074b = view;
    }

    public final ReactViewBackgroundDrawable a() {
        if (this.f39073a == null) {
            this.f39073a = new ReactViewBackgroundDrawable(this.f39074b.getContext());
            Drawable background = this.f39074b.getBackground();
            c.v0(this.f39074b, null);
            if (background == null) {
                c.v0(this.f39074b, this.f39073a);
            } else {
                c.v0(this.f39074b, new LayerDrawable(new Drawable[]{this.f39073a, background}));
            }
        }
        return this.f39073a;
    }

    public void b(int i) {
        if (i == 0 && this.f39073a == null) {
            return;
        }
        a().x(i);
    }

    public void c(int i, float f, float f2) {
        a().t(i, f, f2);
    }

    public void d(float f) {
        a().y(f);
    }

    public void e(float f, int i) {
        a().z(f, i);
    }

    public void f(String str) {
        a().v(str);
    }

    public void g(int i, float f) {
        a().w(i, f);
    }
}
