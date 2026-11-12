package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.i8f;
import defpackage.if1;
import defpackage.iqi;
import defpackage.k3j;
import defpackage.kwi;
import defpackage.l8f;
import defpackage.m80;
import defpackage.o7h;
import defpackage.pii;

/* JADX INFO: loaded from: classes5.dex */
public class a extends if1 {
    public BottomSheetBehavior<FrameLayout> c;
    public FrameLayout d;
    public CoordinatorLayout e;
    public FrameLayout f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BottomSheetBehavior.f f8587k;
    public boolean l;
    public BottomSheetBehavior.f m;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    public class C0212a implements o7h {
        public C0212a() {
        }

        @Override // defpackage.o7h
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            if (a.this.f8587k != null) {
                a.this.c.L(a.this.f8587k);
            }
            if (windowInsetsCompat != null) {
                a aVar = a.this;
                aVar.f8587k = new f(aVar.f, windowInsetsCompat, null);
                a.this.c.s(a.this.f8587k);
            }
            return windowInsetsCompat;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.h && aVar.isShowing() && a.this.o()) {
                a.this.cancel();
            }
        }
    }

    public class c extends androidx.core.view.a {
        public c() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            if (!a.this.h) {
                m80Var.n0(false);
            } else {
                m80Var.a(EventRecurrence.TH);
                m80Var.n0(true);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                a aVar = a.this;
                if (aVar.h) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public class e extends BottomSheetBehavior.f {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onStateChanged(View view, int i) {
            if (i == 5) {
                a.this.cancel();
            }
        }
    }

    public static class f extends BottomSheetBehavior.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8594b;
        public final WindowInsetsCompat c;

        public /* synthetic */ f(View view, WindowInsetsCompat windowInsetsCompat, C0212a c0212a) {
            this(view, windowInsetsCompat);
        }

        public final void a(View view) {
            if (view.getTop() < this.c.m()) {
                a.n(view, this.f8593a);
                view.setPadding(view.getPaddingLeft(), this.c.m() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                a.n(view, this.f8594b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onLayout(View view) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onSlide(View view, float f) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onStateChanged(View view, int i) {
            a(view);
        }

        public f(View view, WindowInsetsCompat windowInsetsCompat) {
            this.c = windowInsetsCompat;
            boolean z = (view.getSystemUiVisibility() & 8192) != 0;
            this.f8594b = z;
            l8f l8fVarE = BottomSheetBehavior.B(view).E();
            ColorStateList colorStateListX = l8fVarE != null ? l8fVarE.x() : androidx.core.view.c.r(view);
            if (colorStateListX != null) {
                this.f8593a = i8f.f(colorStateListX.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f8593a = i8f.f(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f8593a = z;
            }
        }
    }

    public a(Context context, int i) {
        super(context, c(context, i));
        this.h = true;
        this.i = true;
        this.m = new e();
        e(1);
        this.l = getContext().getTheme().obtainStyledAttributes(new int[]{pii.x}).getBoolean(0, false);
    }

    public static int c(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(pii.f, typedValue, true) ? typedValue.resourceId : k3j.f;
    }

    public static void n(View view, boolean z) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorK = k();
        if (!this.g || bottomSheetBehaviorK.getState() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorK.setState(5);
        }
    }

    public final FrameLayout j() {
        if (this.d == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), kwi.f24372b, null);
            this.d = frameLayout;
            this.e = (CoordinatorLayout) frameLayout.findViewById(iqi.d);
            FrameLayout frameLayout2 = (FrameLayout) this.d.findViewById(iqi.e);
            this.f = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout2);
            this.c = bottomSheetBehaviorB;
            bottomSheetBehaviorB.s(this.m);
            this.c.setHideable(this.h);
        }
        return this.d;
    }

    public BottomSheetBehavior<FrameLayout> k() {
        if (this.c == null) {
            j();
        }
        return this.c;
    }

    public boolean l() {
        return this.g;
    }

    public void m() {
        this.c.L(this.m);
    }

    public boolean o() {
        if (!this.j) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.i = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.j = true;
        }
        return this.i;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.l && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.d;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.e;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // defpackage.if1, androidx.p004activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.p004activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.c;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.c.setState(4);
    }

    public final View p(int i, View view, ViewGroup.LayoutParams layoutParams) {
        j();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.d.findViewById(iqi.d);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.l) {
            androidx.core.view.c.H0(this.f, new C0212a());
        }
        this.f.removeAllViews();
        if (layoutParams == null) {
            this.f.addView(view);
        } else {
            this.f.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(iqi.g0).setOnClickListener(new b());
        androidx.core.view.c.r0(this.f, new c());
        this.f.setOnTouchListener(new d());
        return this.d;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.h != z) {
            this.h = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.h) {
            this.h = true;
        }
        this.i = z;
        this.j = true;
    }

    @Override // defpackage.if1, androidx.p004activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(p(i, null, null));
    }

    @Override // defpackage.if1, androidx.p004activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(p(0, view, null));
    }

    @Override // defpackage.if1, androidx.p004activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(p(0, view, layoutParams));
    }
}
