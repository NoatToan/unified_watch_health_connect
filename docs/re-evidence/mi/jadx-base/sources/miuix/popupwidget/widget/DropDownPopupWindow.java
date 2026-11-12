package miuix.popupwidget.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.core.view.WindowInsetsCompat;
import defpackage.c3j;
import defpackage.gz6;
import defpackage.hmi;
import defpackage.q56;
import defpackage.vki;
import defpackage.zlr;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class DropDownPopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f26775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PopupWindow f26776b;
    public View c;
    public f d;
    public View e;
    public ValueAnimator h;
    public boolean i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26777k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int u;
    public int v;
    public int f = 300;
    public int g = 300;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26778r = 0;
    public ValueAnimator.AnimatorUpdateListener s = new a();
    public Animator.AnimatorListener t = new b();

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Float) DropDownPopupWindow.this.h.getAnimatedValue()).floatValue();
            DropDownPopupWindow.c(DropDownPopupWindow.this);
            DropDownPopupWindow.f(DropDownPopupWindow.this);
        }
    }

    public class b implements Animator.AnimatorListener {
        public b() {
        }

        public final void a() {
            if (DropDownPopupWindow.this.i) {
                DropDownPopupWindow.this.u();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (DropDownPopupWindow.this.i) {
                DropDownPopupWindow.i(DropDownPopupWindow.this);
            }
        }
    }

    public class c implements View.OnApplyWindowInsetsListener {
        public c() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DropDownPopupWindow dropDownPopupWindow = DropDownPopupWindow.this;
            DropDownPopupWindow.this.l(dropDownPopupWindow.q(dropDownPopupWindow.d), windowInsets);
            return windowInsets;
        }
    }

    public class d implements View.OnAttachStateChangeListener {
        public d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (Build.VERSION.SDK_INT >= 28) {
                DropDownPopupWindow.this.l(DropDownPopupWindow.this.q(view), null);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface e extends h {
    }

    public class f extends FrameLayout {
        public f(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            setClipChildren(false);
            setClipToPadding(false);
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            DropDownPopupWindow.this.n(configuration);
        }

        @Override // android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i != 4 || keyEvent.getAction() != 1) {
                return false;
            }
            DropDownPopupWindow.this.o();
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!super.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
                DropDownPopupWindow.this.o();
            }
            return true;
        }
    }

    public interface g extends h {
    }

    public interface h {
    }

    public DropDownPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this.f26775a = context;
        this.f26776b = new PopupWindow(context, attributeSet, 0, i);
        f fVar = new f(context, attributeSet, i);
        this.d = fVar;
        fVar.addOnAttachStateChangeListener(new d());
        this.f26776b.setAnimationStyle(q56.a() ? c3j.f4893a : 0);
        s();
    }

    public static /* synthetic */ e c(DropDownPopupWindow dropDownPopupWindow) {
        dropDownPopupWindow.getClass();
        return null;
    }

    public static /* synthetic */ g f(DropDownPopupWindow dropDownPopupWindow) {
        dropDownPopupWindow.getClass();
        return null;
    }

    public static /* synthetic */ h i(DropDownPopupWindow dropDownPopupWindow) {
        dropDownPopupWindow.getClass();
        return null;
    }

    public final void l(Rect rect, WindowInsets windowInsets) {
        if (this.e == null || this.c == null) {
            return;
        }
        w(rect);
        v(windowInsets);
        int width = this.f26776b.getWidth();
        int i = this.f26777k;
        if (width > i) {
            width = i;
        }
        int i2 = this.u;
        int i3 = this.l;
        if (i2 > i3) {
            this.f26776b.setHeight(i3);
        } else {
            this.f26776b.setHeight(-2);
        }
        this.f26776b.setWidth(width);
        int height = this.f26776b.getHeight();
        View view = this.e;
        if (view != null && view.isAttachedToWindow()) {
            int[] iArrM = m(width, rect);
            this.f26776b.update(iArrM[0], iArrM[1], width, height);
        } else if (this.d.isAttachedToWindow()) {
            this.f26776b.update(0, 0, width, height);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[PHI: r5
      0x0046: PHI (r5v3 int) = (r5v2 int), (r5v5 int) binds: [B:40:0x0076, B:25:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    public final int[] m(int i, Rect rect) {
        int i2;
        boolean z;
        int width;
        int i3;
        int i4;
        int[] iArr = new int[2];
        this.e.getLocationInWindow(iArr);
        int i5 = this.f26777k;
        if (i > i5) {
            i = i5;
        }
        int i6 = iArr[1];
        if (i == i5) {
            i3 = rect.left;
            if (i3 <= 0) {
                i3 = this.n;
            }
        } else if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            width = this.m;
            int i7 = iArr[0];
            int i8 = width - (i7 + i);
            i2 = this.n;
            boolean z2 = i8 < i2;
            z = i7 < i2;
            if (!z && z2) {
                i += i2;
                i3 = width - i;
            } else if (z2 || !z) {
                i3 = i7;
            } else {
                i3 = i2;
            }
        } else {
            boolean z3 = (iArr[0] + this.e.getWidth()) - i < this.n;
            int width2 = this.m - (iArr[0] + this.e.getWidth());
            i2 = this.n;
            z = width2 < i2;
            if (!z3 && z) {
                width = this.m;
                i += i2;
            } else if (z || !z3) {
                width = iArr[0] + this.e.getWidth();
            } else {
                i3 = i2;
            }
            i3 = width - i;
        }
        int i9 = this.v;
        int i10 = this.u;
        int i11 = (i9 - i6) - i10;
        int i12 = this.o;
        if (i11 < i12 && (i6 = i6 - (i12 - ((i9 - i6) - i10))) < (i4 = this.p)) {
            i6 = i4;
        }
        return new int[]{i3, i6};
    }

    public final void n(Configuration configuration) {
        Activity activityP = p(this.d);
        View decorView = activityP != null ? activityP.getWindow().getDecorView() : null;
        if (decorView != null) {
            decorView.setOnApplyWindowInsetsListener(new c());
        }
        this.d.post(new Runnable() { // from class: c67
            @Override // java.lang.Runnable
            public final void run() {
                this.f4978a.t();
            }
        });
    }

    public void o() {
        this.i = true;
        u();
    }

    public final Activity p(View view) {
        Context context = ((ViewGroup) view.getRootView()).getChildAt(0).getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public final Rect q(View view) {
        Rect rect = new Rect();
        WindowInsetsCompat windowInsetsCompatH = androidx.core.view.c.H(view);
        if (windowInsetsCompatH != null) {
            gz6 gz6VarE = windowInsetsCompatH.e();
            if (gz6VarE == null) {
                Activity activityP = p(view);
                if (activityP != null) {
                    int i = Build.VERSION.SDK_INT;
                    DisplayCutout cutout = i >= 29 ? activityP.getWindowManager().getDefaultDisplay().getCutout() : null;
                    if (cutout != null && i >= 28) {
                        rect.left = cutout.getSafeInsetLeft();
                        rect.right = cutout.getSafeInsetRight();
                    }
                }
                return rect;
            }
            rect.left = gz6VarE.b();
            rect.right = gz6VarE.c();
        }
        return rect;
    }

    public final void r() {
        this.q = (int) (this.f26775a.getResources().getDisplayMetrics().density * 32.0f);
        this.f26778r = this.f26775a.getResources().getColor(vki.f36981a);
        this.n = this.f26775a.getResources().getDimensionPixelSize(hmi.h);
        this.j = this.f26775a.getResources().getDimensionPixelSize(hmi.i);
        this.m = zlr.i(this.f26775a).x;
        this.v = zlr.i(this.f26775a).y;
    }

    public final void s() {
        r();
        this.f26776b.setWidth(-2);
        this.f26776b.setHeight(-2);
        this.f26776b.setSoftInputMode(3);
        this.f26776b.setOutsideTouchable(false);
        this.f26776b.setFocusable(true);
        this.f26776b.setOutsideTouchable(true);
        this.d.setFocusableInTouchMode(true);
        this.f26776b.setContentView(this.d);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f26776b.setOnDismissListener(onDismissListener);
    }

    public final /* synthetic */ void t() {
        r();
        l(q(this.d), null);
    }

    public final void u() {
        PopupWindow popupWindow = this.f26776b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.i = false;
    }

    public final void v(WindowInsets windowInsets) {
        View view = this.e;
        if (view == null || this.v == 0) {
            return;
        }
        int height = view.getRootView().getHeight();
        int i = Build.VERSION.SDK_INT;
        if (windowInsets == null) {
            windowInsets = this.e.getRootWindowInsets();
        }
        if (windowInsets != null) {
            if (i >= 30) {
                Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
                this.p = insets.top;
                this.o = insets.bottom;
            } else {
                this.p = windowInsets.getSystemWindowInsetTop();
                this.o = windowInsets.getSystemWindowInsetBottom();
            }
        }
        this.l = (height - this.p) - this.o;
    }

    public final void w(Rect rect) {
        int i = rect.left;
        if (i > 0) {
            this.f26777k = (this.m - i) - this.n;
            return;
        }
        int i2 = rect.right;
        if (i2 > 0) {
            this.f26777k = (this.m - i2) - this.n;
        } else {
            this.f26777k = this.m - (this.n * 2);
        }
    }
}
