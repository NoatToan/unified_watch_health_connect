package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.gms.common.ConnectionResult;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class q extends RecyclerView.o implements RecyclerView.t {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f10589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f10590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f10593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f10594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f10599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10602p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f10605s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f10612z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10603q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10604r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10606t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10607u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10608v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10609w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f10610x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f10611y = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q qVar = q.this;
            ValueAnimator valueAnimator = qVar.f10612z;
            int i14 = qVar.A;
            if (i14 == 1) {
                valueAnimator.cancel();
            } else if (i14 != 2) {
                return;
            }
            qVar.A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    public class b extends RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i14, int i15) {
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            q qVar = q.this;
            int i16 = qVar.f10587a;
            int iComputeVerticalScrollRange = qVar.f10605s.computeVerticalScrollRange();
            int i17 = qVar.f10604r;
            qVar.f10606t = iComputeVerticalScrollRange - i17 > 0 && i17 >= i16;
            int iComputeHorizontalScrollRange = qVar.f10605s.computeHorizontalScrollRange();
            int i18 = qVar.f10603q;
            boolean z14 = iComputeHorizontalScrollRange - i18 > 0 && i18 >= i16;
            qVar.f10607u = z14;
            boolean z15 = qVar.f10606t;
            if (!z15 && !z14) {
                if (qVar.f10608v != 0) {
                    qVar.h(0);
                    return;
                }
                return;
            }
            if (z15) {
                float f14 = i17;
                qVar.f10598l = (int) ((((f14 / 2.0f) + iComputeVerticalScrollOffset) * f14) / iComputeVerticalScrollRange);
                qVar.f10597k = Math.min(i17, (i17 * i17) / iComputeVerticalScrollRange);
            }
            if (qVar.f10607u) {
                float f15 = iComputeHorizontalScrollOffset;
                float f16 = i18;
                qVar.f10601o = (int) ((((f16 / 2.0f) + f15) * f16) / iComputeHorizontalScrollRange);
                qVar.f10600n = Math.min(i18, (i18 * i18) / iComputeHorizontalScrollRange);
            }
            int i19 = qVar.f10608v;
            if (i19 == 0 || i19 == 1) {
                qVar.h(1);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10615a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f10615a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f10615a) {
                this.f10615a = false;
                return;
            }
            q qVar = q.this;
            if (((Float) qVar.f10612z.getAnimatedValue()).floatValue() == 0.0f) {
                qVar.A = 0;
                qVar.h(0);
            } else {
                qVar.A = 2;
                qVar.f10605s.invalidate();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            q qVar = q.this;
            qVar.f10589c.setAlpha(iFloatValue);
            qVar.f10590d.setAlpha(iFloatValue);
            qVar.f10605s.invalidate();
        }
    }

    public q(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i14, int i15, int i16) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10612z = valueAnimatorOfFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f10589c = stateListDrawable;
        this.f10590d = drawable;
        this.f10593g = stateListDrawable2;
        this.f10594h = drawable2;
        this.f10591e = Math.max(i14, stateListDrawable.getIntrinsicWidth());
        this.f10592f = Math.max(i14, drawable.getIntrinsicWidth());
        this.f10595i = Math.max(i14, stateListDrawable2.getIntrinsicWidth());
        this.f10596j = Math.max(i14, drawable2.getIntrinsicWidth());
        this.f10587a = i15;
        this.f10588b = i16;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f10605s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f10605s.removeOnItemTouchListener(this);
            this.f10605s.removeOnScrollListener(bVar);
            this.f10605s.removeCallbacks(aVar);
        }
        this.f10605s = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(this);
            this.f10605s.addOnItemTouchListener(this);
            this.f10605s.addOnScrollListener(bVar);
        }
    }

    public static int g(float f14, float f15, int[] iArr, int i14, int i15, int i16) {
        int i17 = iArr[1] - iArr[0];
        if (i17 != 0) {
            int i18 = i14 - i16;
            int i19 = (int) (((f15 - f14) / i17) * i18);
            int i24 = i15 + i19;
            if (i24 < i18 && i24 >= 0) {
                return i19;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void b(boolean z14) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final boolean c(MotionEvent motionEvent) {
        int i14 = this.f10608v;
        if (i14 != 1) {
            return i14 == 2;
        }
        boolean zF = f(motionEvent.getX(), motionEvent.getY());
        boolean zE = e(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zF && !zE) {
            return false;
        }
        if (zE) {
            this.f10609w = 1;
            this.f10602p = (int) motionEvent.getX();
        } else if (zF) {
            this.f10609w = 2;
            this.f10599m = (int) motionEvent.getY();
        }
        h(2);
        return true;
    }

    public final boolean e(float f14, float f15) {
        if (f15 < this.f10604r - this.f10595i) {
            return false;
        }
        int i14 = this.f10601o;
        int i15 = this.f10600n;
        return f14 >= ((float) (i14 - (i15 / 2))) && f14 <= ((float) ((i15 / 2) + i14));
    }

    public final boolean f(float f14, float f15) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        int layoutDirection = this.f10605s.getLayoutDirection();
        int i14 = this.f10591e;
        if (layoutDirection == 1) {
            if (f14 > i14) {
                return false;
            }
        } else if (f14 < this.f10603q - i14) {
            return false;
        }
        int i15 = this.f10598l;
        int i16 = this.f10597k / 2;
        return f15 >= ((float) (i15 - i16)) && f15 <= ((float) (i16 + i15));
    }

    public final void h(int i14) {
        a aVar = this.B;
        StateListDrawable stateListDrawable = this.f10589c;
        if (i14 == 2 && this.f10608v != 2) {
            stateListDrawable.setState(C);
            this.f10605s.removeCallbacks(aVar);
        }
        if (i14 == 0) {
            this.f10605s.invalidate();
        } else {
            i();
        }
        if (this.f10608v == 2 && i14 != 2) {
            stateListDrawable.setState(D);
            this.f10605s.removeCallbacks(aVar);
            this.f10605s.postDelayed(aVar, 1200);
        } else if (i14 == 1) {
            this.f10605s.removeCallbacks(aVar);
            this.f10605s.postDelayed(aVar, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f10608v = i14;
    }

    public final void i() {
        int i14 = this.A;
        ValueAnimator valueAnimator = this.f10612z;
        if (i14 != 0) {
            if (i14 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int i14 = this.f10603q;
        RecyclerView recyclerView2 = this.f10605s;
        if (i14 != recyclerView2.getWidth() || this.f10604r != recyclerView2.getHeight()) {
            this.f10603q = recyclerView2.getWidth();
            this.f10604r = recyclerView2.getHeight();
            h(0);
            return;
        }
        if (this.A != 0) {
            if (this.f10606t) {
                int i15 = this.f10603q;
                int i16 = this.f10591e;
                int i17 = i15 - i16;
                int i18 = this.f10598l;
                int i19 = this.f10597k;
                int i24 = i18 - (i19 / 2);
                StateListDrawable stateListDrawable = this.f10589c;
                stateListDrawable.setBounds(0, 0, i16, i19);
                int i25 = this.f10592f;
                int i26 = this.f10604r;
                Drawable drawable = this.f10590d;
                drawable.setBounds(0, 0, i25, i26);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i16, i24);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i16, -i24);
                } else {
                    canvas.translate(i17, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i24);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i17, -i24);
                }
            }
            if (this.f10607u) {
                int i27 = this.f10604r;
                int i28 = this.f10595i;
                int i29 = i27 - i28;
                int i30 = this.f10601o;
                int i34 = this.f10600n;
                int i35 = i30 - (i34 / 2);
                StateListDrawable stateListDrawable2 = this.f10593g;
                stateListDrawable2.setBounds(0, 0, i34, i28);
                int i36 = this.f10603q;
                int i37 = this.f10596j;
                Drawable drawable2 = this.f10594h;
                drawable2.setBounds(0, 0, i36, i37);
                canvas.translate(0.0f, i29);
                drawable2.draw(canvas);
                canvas.translate(i35, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i35, -i29);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (this.f10608v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            boolean zE = e(motionEvent.getX(), motionEvent.getY());
            if (zF || zE) {
                if (zE) {
                    this.f10609w = 1;
                    this.f10602p = (int) motionEvent.getX();
                } else if (zF) {
                    this.f10609w = 2;
                    this.f10599m = (int) motionEvent.getY();
                }
                h(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f10608v == 2) {
            this.f10599m = 0.0f;
            this.f10602p = 0.0f;
            h(1);
            this.f10609w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f10608v == 2) {
            i();
            int i14 = this.f10609w;
            int i15 = this.f10588b;
            if (i14 == 1) {
                float x14 = motionEvent.getX();
                int[] iArr = this.f10611y;
                iArr[0] = i15;
                int i16 = this.f10603q - i15;
                iArr[1] = i16;
                float fMax = Math.max(i15, Math.min(i16, x14));
                if (Math.abs(this.f10601o - fMax) >= 2.0f) {
                    int iG = g(this.f10602p, fMax, iArr, this.f10605s.computeHorizontalScrollRange(), this.f10605s.computeHorizontalScrollOffset(), this.f10603q);
                    if (iG != 0) {
                        this.f10605s.scrollBy(iG, 0);
                    }
                    this.f10602p = fMax;
                }
            }
            if (this.f10609w == 2) {
                float y14 = motionEvent.getY();
                int[] iArr2 = this.f10610x;
                iArr2[0] = i15;
                int i17 = this.f10604r - i15;
                iArr2[1] = i17;
                float fMax2 = Math.max(i15, Math.min(i17, y14));
                if (Math.abs(this.f10598l - fMax2) < 2.0f) {
                    return;
                }
                int iG2 = g(this.f10599m, fMax2, iArr2, this.f10605s.computeVerticalScrollRange(), this.f10605s.computeVerticalScrollOffset(), this.f10604r);
                if (iG2 != 0) {
                    this.f10605s.scrollBy(0, iG2);
                }
                this.f10599m = fMax2;
            }
        }
    }
}
