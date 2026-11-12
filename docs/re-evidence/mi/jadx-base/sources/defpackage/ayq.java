package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Dimension;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ayq {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f3583a;

        public a(View view) {
            this.f3583a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f3583a.getContext().getSystemService("input_method")).showSoftInput(this.f3583a, 1);
        }
    }

    public class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f3584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f3585b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ e d;

        public b(boolean z, boolean z2, boolean z3, e eVar) {
            this.f3584a = z;
            this.f3585b = z2;
            this.c = z3;
            this.d = eVar;
        }

        @Override // ayq.e
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, f fVar) {
            if (this.f3584a) {
                fVar.d += windowInsetsCompat.j();
            }
            boolean zJ = ayq.j(view);
            if (this.f3585b) {
                if (zJ) {
                    fVar.c += windowInsetsCompat.k();
                } else {
                    fVar.f3588a += windowInsetsCompat.k();
                }
            }
            if (this.c) {
                if (zJ) {
                    fVar.f3588a += windowInsetsCompat.l();
                } else {
                    fVar.c += windowInsetsCompat.l();
                }
            }
            fVar.a(view);
            e eVar = this.d;
            return eVar != null ? eVar.a(view, windowInsetsCompat, fVar) : windowInsetsCompat;
        }
    }

    public class c implements o7h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f3586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f3587b;

        public c(e eVar, f fVar) {
            this.f3586a = eVar;
            this.f3587b = fVar;
        }

        @Override // defpackage.o7h
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f3586a.a(view, windowInsetsCompat, new f(this.f3587b));
        }
    }

    public class d implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            androidx.core.view.c.n0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface e {
        WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, f fVar);
    }

    public static void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void b(View view, e eVar) {
        androidx.core.view.c.H0(view, new c(eVar, new f(androidx.core.view.c.F(view), view.getPaddingTop(), androidx.core.view.c.E(view), view.getPaddingBottom())));
        n(view);
    }

    public static void c(View view, AttributeSet attributeSet, int i, int i2, e eVar) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, b4j.x3, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(b4j.y3, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(b4j.z3, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(b4j.A3, false);
        typedArrayObtainStyledAttributes.recycle();
        b(view, new b(z, z2, z3, eVar));
    }

    public static float d(Context context, @Dimension(unit = 0) int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static Integer e(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static ViewGroup f(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static cwq g(View view) {
        return h(f(view));
    }

    public static cwq h(View view) {
        if (view == null) {
            return null;
        }
        return new awq(view);
    }

    public static float i(View view) {
        float fV = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fV += androidx.core.view.c.v((View) parent);
        }
        return fV;
    }

    public static boolean j(View view) {
        return androidx.core.view.c.A(view) == 1;
    }

    public static PorterDuff.Mode k(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void l(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            m(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void m(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void n(View view) {
        if (androidx.core.view.c.T(view)) {
            androidx.core.view.c.n0(view);
        } else {
            view.addOnAttachStateChangeListener(new d());
        }
    }

    public static void o(View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3589b;
        public int c;
        public int d;

        public f(int i, int i2, int i3, int i4) {
            this.f3588a = i;
            this.f3589b = i2;
            this.c = i3;
            this.d = i4;
        }

        public void a(View view) {
            androidx.core.view.c.J0(view, this.f3588a, this.f3589b, this.c, this.d);
        }

        public f(f fVar) {
            this.f3588a = fVar.f3588a;
            this.f3589b = fVar.f3589b;
            this.c = fVar.c;
            this.d = fVar.d;
        }
    }
}
