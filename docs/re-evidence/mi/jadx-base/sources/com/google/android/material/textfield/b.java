package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import defpackage.fpi;
import defpackage.h2j;
import defpackage.i8f;
import defpackage.ia8;
import defpackage.l8f;
import defpackage.m80;
import defpackage.pii;
import defpackage.pmi;
import defpackage.r2m;
import defpackage.u8p;
import defpackage.v70;
import defpackage.wc1;

/* JADX INFO: loaded from: classes5.dex */
public class b extends ia8 {
    public static final boolean t = true;
    public final TextWatcher e;
    public final View.OnFocusChangeListener f;
    public final TextInputLayout.e g;
    public final TextInputLayout.f h;

    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.g i;
    public final View.OnAttachStateChangeListener j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v70.a f8894k;
    public boolean l;
    public boolean m;
    public long n;
    public StateListDrawable o;
    public l8f p;
    public AccessibilityManager q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f8895r;
    public ValueAnimator s;

    public class a extends u8p {

        /* JADX INFO: renamed from: com.google.android.material.textfield.b$a$a, reason: collision with other inner class name */
        public class RunnableC0222a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f8897a;

            public RunnableC0222a(AutoCompleteTextView autoCompleteTextView) {
                this.f8897a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f8897a.isPopupShowing();
                b.this.J(zIsPopupShowing);
                b.this.l = zIsPopupShowing;
            }
        }

        public a() {
        }

        @Override // defpackage.u8p, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewC = b.C(b.this.f20937a.getEditText());
            if (b.this.q.isTouchExplorationEnabled() && b.H(autoCompleteTextViewC) && !b.this.c.hasFocus()) {
                autoCompleteTextViewC.dismissDropDown();
            }
            autoCompleteTextViewC.post(new RunnableC0222a(autoCompleteTextViewC));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.b$b, reason: collision with other inner class name */
    public class C0223b implements AutoCompleteTextView.OnDismissListener {
        public C0223b() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            b.this.N();
            b.this.J(false);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b bVar = b.this;
            bVar.c.setChecked(bVar.m);
            b.this.s.start();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class e implements View.OnFocusChangeListener {
        public e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            b.this.f20937a.setEndIconActivated(z);
            if (z) {
                return;
            }
            b.this.J(false);
            b.this.l = false;
        }
    }

    public class f extends TextInputLayout.e {
        public f(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            if (!b.H(b.this.f20937a.getEditText())) {
                m80Var.i0(Spinner.class.getName());
            }
            if (m80Var.S()) {
                m80Var.t0(null);
            }
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewC = b.C(b.this.f20937a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && b.this.q.isEnabled() && !b.H(b.this.f20937a.getEditText())) {
                b.this.M(autoCompleteTextViewC);
                b.this.N();
            }
        }
    }

    public class g implements TextInputLayout.f {
        public g() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewC = b.C(textInputLayout.getEditText());
            b.this.K(autoCompleteTextViewC);
            b.this.y(autoCompleteTextViewC);
            b.this.L(autoCompleteTextViewC);
            autoCompleteTextViewC.setThreshold(0);
            autoCompleteTextViewC.removeTextChangedListener(b.this.e);
            autoCompleteTextViewC.addTextChangedListener(b.this.e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!b.H(autoCompleteTextViewC) && b.this.q.isTouchExplorationEnabled()) {
                androidx.core.view.c.C0(b.this.c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(b.this.g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    public class h implements TextInputLayout.g {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f8906a;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f8906a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8906a.removeTextChangedListener(b.this.e);
            }
        }

        public h() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (b.t) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
            if (i == 3) {
                textInputLayout.removeOnAttachStateChangeListener(b.this.j);
                b.this.I();
            }
        }
    }

    public class i implements View.OnAttachStateChangeListener {
        public i() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b.this.B();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            b.this.I();
        }
    }

    public class j implements v70.a {
        public j() {
        }

        @Override // v70.a
        public void onTouchExplorationStateChanged(boolean z) {
            AutoCompleteTextView autoCompleteTextView;
            TextInputLayout textInputLayout = b.this.f20937a;
            if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null || b.H(autoCompleteTextView)) {
                return;
            }
            androidx.core.view.c.C0(b.this.c, z ? 2 : 1);
        }
    }

    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.M((AutoCompleteTextView) b.this.f20937a.getEditText());
        }
    }

    public class l implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AutoCompleteTextView f8911a;

        public l(AutoCompleteTextView autoCompleteTextView) {
            this.f8911a = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (b.this.G()) {
                    b.this.l = false;
                }
                b.this.M(this.f8911a);
                b.this.N();
            }
            return false;
        }
    }

    public b(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
        this.e = new a();
        this.f = new e();
        this.g = new f(this.f20937a);
        this.h = new g();
        this.i = new h();
        this.j = new i();
        this.f8894k = new j();
        this.l = false;
        this.m = false;
        this.n = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.s = D(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorD = D(50, 1.0f, 0.0f);
        this.f8895r = valueAnimatorD;
        valueAnimatorD.addListener(new c());
    }

    public static boolean H(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public final void A(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, l8f l8fVar) {
        LayerDrawable layerDrawable;
        int iD = i8f.d(autoCompleteTextView, pii.s);
        l8f l8fVar2 = new l8f(l8fVar.E());
        int iH = i8f.h(i2, iD, 0.1f);
        l8fVar2.b0(new ColorStateList(iArr, new int[]{iH, 0}));
        if (t) {
            l8fVar2.setTint(iD);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iH, iD});
            l8f l8fVar3 = new l8f(l8fVar.E());
            l8fVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, l8fVar2, l8fVar3), l8fVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{l8fVar2, l8fVar});
        }
        androidx.core.view.c.v0(autoCompleteTextView, layerDrawable);
    }

    public final void B() {
        TextInputLayout textInputLayout;
        if (this.q == null || (textInputLayout = this.f20937a) == null || !androidx.core.view.c.T(textInputLayout)) {
            return;
        }
        v70.a(this.q, this.f8894k);
    }

    public final ValueAnimator D(int i2, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(wc1.f37826a);
        valueAnimatorOfFloat.setDuration(i2);
        valueAnimatorOfFloat.addUpdateListener(new d());
        return valueAnimatorOfFloat;
    }

    public final l8f E(float f2, float f3, float f4, int i2) {
        r2m r2mVarM = r2m.a().E(f2).I(f2).v(f3).z(f3).m();
        l8f l8fVarM = l8f.m(this.f20938b, f4);
        l8fVarM.setShapeAppearanceModel(r2mVarM);
        l8fVarM.d0(0, i2, 0, i2);
        return l8fVarM;
    }

    public final boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.n;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public final void I() {
        AccessibilityManager accessibilityManager = this.q;
        if (accessibilityManager != null) {
            v70.b(accessibilityManager, this.f8894k);
        }
    }

    public final void J(boolean z) {
        if (this.m != z) {
            this.m = z;
            this.s.cancel();
            this.f8895r.start();
        }
    }

    public final void K(AutoCompleteTextView autoCompleteTextView) {
        if (t) {
            int boxBackgroundMode = this.f20937a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.p);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.o);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void L(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new l(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f);
        if (t) {
            autoCompleteTextView.setOnDismissListener(new C0223b());
        }
    }

    public final void M(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (G()) {
            this.l = false;
        }
        if (this.l) {
            this.l = false;
            return;
        }
        if (t) {
            J(!this.m);
        } else {
            this.m = !this.m;
            this.c.toggle();
        }
        if (!this.m) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    public final void N() {
        this.l = true;
        this.n = System.currentTimeMillis();
    }

    public void O(AutoCompleteTextView autoCompleteTextView) {
        if (!H(autoCompleteTextView) && this.f20937a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            y(autoCompleteTextView);
        }
    }

    @Override // defpackage.ia8
    public void a() {
        float dimensionPixelOffset = this.f20938b.getResources().getDimensionPixelOffset(pmi.s0);
        float dimensionPixelOffset2 = this.f20938b.getResources().getDimensionPixelOffset(pmi.h0);
        int dimensionPixelOffset3 = this.f20938b.getResources().getDimensionPixelOffset(pmi.i0);
        l8f l8fVarE = E(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        l8f l8fVarE2 = E(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.p = l8fVarE;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.o = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, l8fVarE);
        this.o.addState(new int[0], l8fVarE2);
        int i2 = this.d;
        if (i2 == 0) {
            i2 = t ? fpi.d : fpi.e;
        }
        this.f20937a.setEndIconDrawable(i2);
        TextInputLayout textInputLayout = this.f20937a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(h2j.g));
        this.f20937a.setEndIconOnClickListener(new k());
        this.f20937a.addOnEditTextAttachedListener(this.h);
        this.f20937a.addOnEndIconChangedListener(this.i);
        F();
        this.q = (AccessibilityManager) this.f20938b.getSystemService("accessibility");
        this.f20937a.addOnAttachStateChangeListener(this.j);
        B();
    }

    @Override // defpackage.ia8
    public boolean b(int i2) {
        return i2 != 0;
    }

    @Override // defpackage.ia8
    public boolean d() {
        return true;
    }

    public final void y(AutoCompleteTextView autoCompleteTextView) {
        if (H(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f20937a.getBoxBackgroundMode();
        l8f boxBackground = this.f20937a.getBoxBackground();
        int iD = i8f.d(autoCompleteTextView, pii.n);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            A(autoCompleteTextView, iD, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            z(autoCompleteTextView, iD, iArr, boxBackground);
        }
    }

    public final void z(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, l8f l8fVar) {
        int boxBackgroundColor = this.f20937a.getBoxBackgroundColor();
        int[] iArr2 = {i8f.h(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (t) {
            androidx.core.view.c.v0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), l8fVar, l8fVar));
            return;
        }
        l8f l8fVar2 = new l8f(l8fVar.E());
        l8fVar2.b0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{l8fVar, l8fVar2});
        int iF = androidx.core.view.c.F(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int iE = androidx.core.view.c.E(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        androidx.core.view.c.v0(autoCompleteTextView, layerDrawable);
        androidx.core.view.c.J0(autoCompleteTextView, iF, paddingTop, iE, paddingBottom);
    }
}
