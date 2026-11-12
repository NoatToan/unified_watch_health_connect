package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.huawei.hwfabengine.FloatingActionButtonAnimationListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes38.dex */
public class nix extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f43069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43071c;
    private boolean d;
    private boolean e;
    private niy f;
    private FloatingActionButtonAnimationListener g;
    private HashMap<String, Drawable> h;
    private Drawable.Callback i;
    private boolean j;
    private final FloatingActionButtonAnimationListener l;
    private ValueAnimator.AnimatorUpdateListener m;
    private final FloatingActionButtonAnimationListener n;

    private boolean h() {
        return false;
    }

    public void a(FloatingActionButtonAnimationListener floatingActionButtonAnimationListener) {
        this.g = floatingActionButtonAnimationListener;
    }

    public void b() {
        if (!h() && this.e) {
            if (this.f == null) {
                Log.e("FloatingActionButtonDrawable", "The paramaters are null, start down animation failed!");
                return;
            }
            this.d = false;
            this.e = false;
            this.j = false;
            Log.i("FloatingActionButtonDrawable", "It starts down animation!");
            a(this.h.get(this.f.d()));
            a(this.l, null);
            d();
        }
    }

    public FloatingActionButtonAnimationListener c() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f43069a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void e() {
        if (h()) {
            return;
        }
        this.j = true;
        if (this.d) {
            j();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f43070b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f43071c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i < 0) {
            this.f43069a.setAlpha(0);
        } else if (i > 255) {
            this.f43069a.setAlpha(255);
        } else {
            this.f43069a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    private void j() {
        if (this.f == null || this.g == null) {
            Log.e("FloatingActionButtonDrawable", "The parameters are null, start up animation failed!");
            return;
        }
        Log.i("FloatingActionButtonDrawable", "It starts up animation!");
        this.e = false;
        this.d = false;
        a(this.h.get(this.f.j()));
        a(this.g, this.n);
        a();
    }

    private void a() {
        niy niyVar = this.f;
        if (niyVar != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(niyVar.e(), this.f.b());
            valueAnimatorOfFloat.setDuration(this.f.c());
            valueAnimatorOfFloat.setInterpolator(this.f.a());
            valueAnimatorOfFloat.addUpdateListener(this.m);
            valueAnimatorOfFloat.start();
        }
    }

    private void a(Drawable drawable) {
        this.f43069a = drawable;
        if (drawable == null) {
            Log.i("FloatingActionButtonDrawable", "The drawable is null!");
            return;
        }
        if (this.f43070b == 0 || this.f43071c == 0) {
            this.f43070b = drawable.getIntrinsicHeight();
            this.f43071c = this.f43069a.getIntrinsicWidth();
        }
        this.f43069a.setBounds(0, 0, this.f43071c, this.f43070b);
        this.f43069a.setCallback(this.i);
    }

    private void a(FloatingActionButtonAnimationListener floatingActionButtonAnimationListener, FloatingActionButtonAnimationListener floatingActionButtonAnimationListener2) {
        niw.c(this.f43069a, floatingActionButtonAnimationListener, floatingActionButtonAnimationListener2);
    }

    private void d() {
        niy niyVar = this.f;
        if (niyVar != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(niyVar.b(), this.f.e());
            valueAnimatorOfFloat.setDuration(this.f.c());
            valueAnimatorOfFloat.setInterpolator(this.f.a());
            valueAnimatorOfFloat.addUpdateListener(this.m);
            valueAnimatorOfFloat.start();
        }
    }
}
