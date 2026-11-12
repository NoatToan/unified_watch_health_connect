package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import miuix.animation.utils.SpringInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public class r2a extends ValueAnimator implements View.OnLayoutChangeListener, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public static final boolean h = !pu6.E();
    public static final SpringInterpolator i = new SpringInterpolator(0.95f, 0.4f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Object> f32106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f32107b;
    public float c;
    public float d;
    public float e;
    public int f;
    public int g;

    public r2a(Fragment fragment, boolean z, boolean z2) {
        Context context = fragment.getContext();
        boolean z3 = false;
        if (context != null && context.getResources().getConfiguration().getLayoutDirection() == 1) {
            z3 = true;
        }
        if (z) {
            if (!z2) {
                if (z3) {
                    c(0.0f, 0.25f);
                } else {
                    c(0.0f, -0.25f);
                }
                if (h) {
                    this.g = Math.round(76.5f);
                }
            } else if (z3) {
                c(-1.0f, 0.0f);
            } else {
                c(1.0f, 0.0f);
            }
        } else if (z2) {
            if (z3) {
                c(0.25f, 0.0f);
            } else {
                c(-0.25f, 0.0f);
            }
            if (h) {
                this.f = Math.round(76.5f);
            }
        } else if (z3) {
            c(0.0f, -1.0f);
        } else {
            c(0.0f, 1.0f);
        }
        addListener(this);
        addUpdateListener(this);
        setFloatValues(0.0f, 1.0f);
        SpringInterpolator springInterpolator = i;
        setInterpolator(springInterpolator);
        setDuration(springInterpolator.getDuration());
    }

    @RequiresApi(api = 23)
    public final void a(View view) {
        view.setForeground(null);
    }

    public Object b() {
        WeakReference<Object> weakReference = this.f32106a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void c(float f, float f2) {
        this.f32107b = f;
        this.c = f2;
    }

    @RequiresApi(api = 23)
    public final void d(View view, int i2) {
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > 255) {
            i2 = 255;
        }
        Drawable foreground = view.getForeground();
        if (foreground == null) {
            foreground = new ColorDrawable(-16777216);
            view.setForeground(foreground);
        }
        foreground.setAlpha(i2);
    }

    public final void e() {
        Object objB = b();
        float width = objB instanceof View ? ((View) objB).getWidth() : 0;
        this.d = this.f32107b * width;
        this.e = this.c * width;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (b() instanceof View) {
            View view = (View) b();
            view.removeOnLayoutChangeListener(this);
            view.setTranslationX(0.0f);
            if (this.f != this.g) {
                a(view);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (b() instanceof View) {
            View view = (View) b();
            e();
            view.addOnLayoutChangeListener(this);
            view.setTranslationX(this.d);
            int i2 = this.f;
            if (i2 != this.g) {
                d(view, i2);
            }
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (b() instanceof View) {
            View view = (View) b();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = this.d;
            float f2 = this.e;
            if (f != f2) {
                f += (f2 - f) * fFloatValue;
            }
            view.setTranslationX(f);
            int i2 = this.f;
            int i3 = this.g;
            if (i2 != i3) {
                d(view, Math.round(i2 + ((i3 - i2) * fFloatValue)));
            }
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        e();
        if (isRunning()) {
            onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void setTarget(Object obj) {
        Object objB = b();
        if (objB != obj) {
            if (isStarted()) {
                cancel();
            }
            if (objB instanceof View) {
                ((View) objB).removeOnLayoutChangeListener(this);
            }
            this.f32106a = obj == null ? null : new WeakReference<>(obj);
        }
    }
}
