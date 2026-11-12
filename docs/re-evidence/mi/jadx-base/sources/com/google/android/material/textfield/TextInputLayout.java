package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.ayq;
import defpackage.b44;
import defpackage.b4j;
import defpackage.c5f;
import defpackage.c9p;
import defpackage.ff5;
import defpackage.h2j;
import defpackage.i8f;
import defpackage.ia8;
import defpackage.iqi;
import defpackage.jf1;
import defpackage.jz5;
import defpackage.k3j;
import defpackage.k47;
import defpackage.k8f;
import defpackage.kwi;
import defpackage.l8f;
import defpackage.m80;
import defpackage.n8f;
import defpackage.ni4;
import defpackage.of1;
import defpackage.oug;
import defpackage.pd5;
import defpackage.pii;
import defpackage.pmi;
import defpackage.r2m;
import defpackage.rbo;
import defpackage.s8p;
import defpackage.t7d;
import defpackage.ti2;
import defpackage.w1d;
import defpackage.wc1;
import defpackage.x47;
import defpackage.xfp;
import defpackage.xki;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public class TextInputLayout extends LinearLayout {
    public static final int I0 = k3j.q;
    public CharSequence A;
    public int A0;
    public final TextView B;
    public boolean B0;
    public boolean C;
    public final b44 C0;
    public CharSequence D;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public l8f F;
    public ValueAnimator F0;
    public l8f G;
    public boolean G0;
    public l8f H;
    public boolean H0;
    public r2m I;
    public boolean J;
    public final int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final Rect S;
    public final Rect T;
    public final RectF U;
    public Typeface V;
    public Drawable W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f8873a;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rbo f8874b;
    public final LinkedHashSet<f> b0;
    public final LinearLayout c;
    public int c0;
    public final FrameLayout d;
    public final SparseArray<ia8> d0;
    public EditText e;
    public final CheckableImageButton e0;
    public CharSequence f;
    public final LinkedHashSet<g> f0;
    public int g;
    public ColorStateList g0;
    public int h;
    public PorterDuff.Mode h0;
    public int i;
    public Drawable i0;
    public int j;
    public int j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t7d f8875k;
    public Drawable k0;
    public boolean l;
    public View.OnLongClickListener l0;
    public int m;
    public View.OnLongClickListener m0;
    public boolean n;
    public final CheckableImageButton n0;
    public TextView o;
    public ColorStateList o0;
    public int p;
    public PorterDuff.Mode p0;
    public int q;
    public ColorStateList q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f8876r;
    public ColorStateList r0;
    public boolean s;
    public int s0;
    public TextView t;
    public int t0;
    public ColorStateList u;
    public int u0;
    public int v;
    public ColorStateList v0;
    public Fade w;
    public int w0;
    public Fade x;
    public int x0;
    public ColorStateList y;
    public int y0;
    public ColorStateList z;
    public int z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f8877b;
        public boolean c;
        public CharSequence d;
        public CharSequence e;
        public CharSequence f;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f8877b) + " hint=" + ((Object) this.d) + " helperText=" + ((Object) this.e) + " placeholderText=" + ((Object) this.f) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f8877b, parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
            TextUtils.writeToParcel(this.d, parcel, i);
            TextUtils.writeToParcel(this.e, parcel, i);
            TextUtils.writeToParcel(this.f, parcel, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f8877b = (CharSequence) creator.createFromParcel(parcel);
            this.c = parcel.readInt() == 1;
            this.d = (CharSequence) creator.createFromParcel(parcel);
            this.e = (CharSequence) creator.createFromParcel(parcel);
            this.f = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u0(!textInputLayout.H0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.l) {
                textInputLayout2.k0(editable.length());
            }
            if (TextInputLayout.this.s) {
                TextInputLayout.this.y0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.e0.performClick();
            TextInputLayout.this.e0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.e.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.C0.u0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextInputLayout f8882a;

        public e(TextInputLayout textInputLayout) {
            this.f8882a = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            EditText editText = this.f8882a.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f8882a.getHint();
            CharSequence error = this.f8882a.getError();
            CharSequence placeholderText = this.f8882a.getPlaceholderText();
            int counterMaxLength = this.f8882a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f8882a.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean z = !zIsEmpty;
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.f8882a.L();
            boolean z5 = !TextUtils.isEmpty(error);
            if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
                z2 = false;
            }
            String string = z3 ? hint.toString() : "";
            this.f8882a.f8874b.t(m80Var);
            if (z) {
                m80Var.L0(text);
            } else if (!TextUtils.isEmpty(string)) {
                m80Var.L0(string);
                if (z4 && placeholderText != null) {
                    m80Var.L0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                m80Var.L0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                m80Var.t0(string);
                m80Var.H0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            m80Var.w0(counterMaxLength);
            if (z2) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                m80Var.p0(error);
            }
            View viewS = this.f8882a.f8875k.s();
            if (viewS != null) {
                m80Var.u0(viewS);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public static void R(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                R((ViewGroup) childAt, z);
            }
        }
    }

    public static void Y(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zP = androidx.core.view.c.P(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zP || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zP);
        checkableImageButton.setPressable(zP);
        checkableImageButton.setLongClickable(z);
        androidx.core.view.c.C0(checkableImageButton, z2 ? 1 : 2);
    }

    public static void Z(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        Y(checkableImageButton, onLongClickListener);
    }

    public static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Y(checkableImageButton, onLongClickListener);
    }

    private ia8 getEndIconDelegate() {
        ia8 ia8Var = this.d0.get(this.c0);
        return ia8Var != null ? ia8Var : this.d0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.n0.getVisibility() == 0) {
            return this.n0;
        }
        if (G() && I()) {
            return this.e0;
        }
        return null;
    }

    public static void l0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? h2j.c : h2j.f19616b, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void setEditText(EditText editText) {
        if (this.e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.c0 != 3) {
            boolean z = editText instanceof TextInputEditText;
        }
        this.e = editText;
        int i = this.g;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.i);
        }
        int i2 = this.h;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.j);
        }
        O();
        setTextInputAccessibilityDelegate(new e(this));
        this.C0.H0(this.e.getTypeface());
        this.C0.r0(this.e.getTextSize());
        this.C0.m0(this.e.getLetterSpacing());
        int gravity = this.e.getGravity();
        this.C0.g0((gravity & (-113)) | 48);
        this.C0.q0(gravity);
        this.e.addTextChangedListener(new a());
        if (this.q0 == null) {
            this.q0 = this.e.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.e.getHint();
                this.f = hint;
                setHint(hint);
                this.e.setHint((CharSequence) null);
            }
            this.E = true;
        }
        if (this.o != null) {
            k0(this.e.getText().length());
        }
        p0();
        this.f8875k.f();
        this.f8874b.bringToFront();
        this.c.bringToFront();
        this.d.bringToFront();
        this.n0.bringToFront();
        z();
        A0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.D)) {
            return;
        }
        this.D = charSequence;
        this.C0.F0(charSequence);
        if (this.B0) {
            return;
        }
        P();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.s == z) {
            return;
        }
        if (z) {
            g();
        } else {
            V();
            this.t = null;
        }
        this.s = z;
    }

    public final void A(int i) {
        Iterator<g> it = this.f0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i);
        }
    }

    public final void A0() {
        if (this.e == null) {
            return;
        }
        androidx.core.view.c.J0(this.B, getContext().getResources().getDimensionPixelSize(pmi.L), this.e.getPaddingTop(), (I() || J()) ? 0 : androidx.core.view.c.E(this.e), this.e.getPaddingBottom());
    }

    public final void B(Canvas canvas) {
        l8f l8fVar;
        if (this.H == null || (l8fVar = this.G) == null) {
            return;
        }
        l8fVar.draw(canvas);
        if (this.e.isFocused()) {
            Rect bounds = this.H.getBounds();
            Rect bounds2 = this.G.getBounds();
            float fD = this.C0.D();
            int iCenterX = bounds2.centerX();
            bounds.left = wc1.c(iCenterX, bounds2.left, fD);
            bounds.right = wc1.c(iCenterX, bounds2.right, fD);
            this.H.draw(canvas);
        }
    }

    public final void B0() {
        int visibility = this.B.getVisibility();
        int i = (this.A == null || L()) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().c(i == 0);
        }
        r0();
        this.B.setVisibility(i);
        o0();
    }

    public final void C(Canvas canvas) {
        if (this.C) {
            this.C0.l(canvas);
        }
    }

    public void C0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.L == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.e) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.Q = this.A0;
        } else if (this.f8875k.l()) {
            if (this.v0 != null) {
                z0(z2, z);
            } else {
                this.Q = this.f8875k.p();
            }
        } else if (!this.n || (textView = this.o) == null) {
            if (z2) {
                this.Q = this.u0;
            } else if (z) {
                this.Q = this.t0;
            } else {
                this.Q = this.s0;
            }
        } else if (this.v0 != null) {
            z0(z2, z);
        } else {
            this.Q = textView.getCurrentTextColor();
        }
        s0();
        T();
        U();
        S();
        if (getEndIconDelegate().d()) {
            g0(this.f8875k.l());
        }
        if (this.L == 2) {
            int i = this.N;
            if (z2 && isEnabled()) {
                this.N = this.P;
            } else {
                this.N = this.O;
            }
            if (this.N != i) {
                Q();
            }
        }
        if (this.L == 1) {
            if (!isEnabled()) {
                this.R = this.x0;
            } else if (z && !z2) {
                this.R = this.z0;
            } else if (z2) {
                this.R = this.y0;
            } else {
                this.R = this.w0;
            }
        }
        j();
    }

    public final void D(boolean z) {
        ValueAnimator valueAnimator = this.F0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.F0.cancel();
        }
        if (z && this.E0) {
            i(0.0f);
        } else {
            this.C0.u0(0.0f);
        }
        if (y() && ((ff5) this.F).q0()) {
            v();
        }
        this.B0 = true;
        H();
        this.f8874b.i(true);
        B0();
    }

    public final int E(int i, boolean z) {
        int compoundPaddingLeft = i + this.e.getCompoundPaddingLeft();
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final int F(int i, boolean z) {
        int compoundPaddingRight = i - this.e.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public final boolean G() {
        return this.c0 != 0;
    }

    public final void H() {
        TextView textView = this.t;
        if (textView == null || !this.s) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.c.b(this.f8873a, this.x);
        this.t.setVisibility(4);
    }

    public boolean I() {
        return this.d.getVisibility() == 0 && this.e0.getVisibility() == 0;
    }

    public final boolean J() {
        return this.n0.getVisibility() == 0;
    }

    public boolean K() {
        return this.f8875k.A();
    }

    public final boolean L() {
        return this.B0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean M() {
        return this.E;
    }

    public final boolean N() {
        return this.L == 1 && this.e.getMinLines() <= 1;
    }

    public final void O() {
        m();
        X();
        C0();
        h0();
        h();
        if (this.L != 0) {
            t0();
        }
    }

    public final void P() {
        if (y()) {
            RectF rectF = this.U;
            this.C0.o(rectF, this.e.getWidth(), this.e.getGravity());
            l(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.N);
            ((ff5) this.F).t0(rectF);
        }
    }

    public final void Q() {
        if (!y() || this.B0) {
            return;
        }
        v();
        P();
    }

    public void S() {
        w1d.c(this, this.e0, this.g0);
    }

    public void T() {
        w1d.c(this, this.n0, this.o0);
    }

    public void U() {
        this.f8874b.j();
    }

    public final void V() {
        TextView textView = this.t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void W(float f2, float f3, float f4, float f5) {
        boolean zJ = ayq.j(this);
        this.J = zJ;
        float f6 = zJ ? f3 : f2;
        if (!zJ) {
            f2 = f3;
        }
        float f7 = zJ ? f5 : f4;
        if (!zJ) {
            f4 = f5;
        }
        l8f l8fVar = this.F;
        if (l8fVar != null && l8fVar.J() == f6 && this.F.K() == f2 && this.F.s() == f7 && this.F.t() == f4) {
            return;
        }
        this.I = this.I.v().E(f6).I(f2).v(f7).z(f4).m();
        j();
    }

    public final void X() {
        if (e0()) {
            androidx.core.view.c.v0(this.e, this.F);
        }
    }

    public void addOnEditTextAttachedListener(f fVar) {
        this.b0.add(fVar);
        if (this.e != null) {
            fVar.a(this);
        }
    }

    public void addOnEndIconChangedListener(g gVar) {
        this.f0.add(gVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f8873a.addView(view, layoutParams2);
        this.f8873a.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    public void b0(TextView textView, int i) {
        try {
            s8p.o(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        s8p.o(textView, k3j.f23393b);
        textView.setTextColor(ni4.c(getContext(), xki.f39217b));
    }

    public final boolean c0() {
        return (this.n0.getVisibility() == 0 || ((G() && I()) || this.A != null)) && this.c.getMeasuredWidth() > 0;
    }

    public final boolean d0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f8874b.getMeasuredWidth() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f != null) {
            boolean z = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.e.setHint(hint);
                this.E = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f8873a.getChildCount());
        for (int i2 = 0; i2 < this.f8873a.getChildCount(); i2++) {
            View childAt = this.f8873a.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.H0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.H0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        C(canvas);
        B(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.G0) {
            return;
        }
        this.G0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b44 b44Var = this.C0;
        boolean zE0 = b44Var != null ? b44Var.E0(drawableState) : false;
        if (this.e != null) {
            u0(androidx.core.view.c.U(this) && isEnabled());
        }
        p0();
        C0();
        if (zE0) {
            invalidate();
        }
        this.G0 = false;
    }

    public final boolean e0() {
        EditText editText = this.e;
        return (editText == null || this.F == null || editText.getBackground() != null || this.L == 0) ? false : true;
    }

    public final void f0() {
        if (this.t == null || !this.s || TextUtils.isEmpty(this.f8876r)) {
            return;
        }
        this.t.setText(this.f8876r);
        androidx.transition.c.b(this.f8873a, this.w);
        this.t.setVisibility(0);
        this.t.bringToFront();
        announceForAccessibility(this.f8876r);
    }

    public final void g() {
        TextView textView = this.t;
        if (textView != null) {
            this.f8873a.addView(textView);
            this.t.setVisibility(0);
        }
    }

    public final void g0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            w1d.a(this, this.e0, this.g0, this.h0);
            return;
        }
        Drawable drawableMutate = k47.r(getEndIconDrawable()).mutate();
        k47.n(drawableMutate, this.f8875k.p());
        this.e0.setImageDrawable(drawableMutate);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + s() : super.getBaseline();
    }

    public l8f getBoxBackground() {
        int i = this.L;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.R;
    }

    public int getBoxBackgroundMode() {
        return this.L;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.M;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return ayq.j(this) ? this.I.j().a(this.U) : this.I.l().a(this.U);
    }

    public float getBoxCornerRadiusBottomStart() {
        return ayq.j(this) ? this.I.l().a(this.U) : this.I.j().a(this.U);
    }

    public float getBoxCornerRadiusTopEnd() {
        return ayq.j(this) ? this.I.r().a(this.U) : this.I.t().a(this.U);
    }

    public float getBoxCornerRadiusTopStart() {
        return ayq.j(this) ? this.I.t().a(this.U) : this.I.r().a(this.U);
    }

    public int getBoxStrokeColor() {
        return this.u0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.v0;
    }

    public int getBoxStrokeWidth() {
        return this.O;
    }

    public int getBoxStrokeWidthFocused() {
        return this.P;
    }

    public int getCounterMaxLength() {
        return this.m;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.l && this.n && (textView = this.o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.y;
    }

    public ColorStateList getCounterTextColor() {
        return this.y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.q0;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.e0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.e0.getDrawable();
    }

    public int getEndIconMode() {
        return this.c0;
    }

    public CheckableImageButton getEndIconView() {
        return this.e0;
    }

    public CharSequence getError() {
        if (this.f8875k.z()) {
            return this.f8875k.o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f8875k.n();
    }

    public int getErrorCurrentTextColors() {
        return this.f8875k.p();
    }

    public Drawable getErrorIconDrawable() {
        return this.n0.getDrawable();
    }

    @VisibleForTesting
    public final int getErrorTextCurrentColor() {
        return this.f8875k.p();
    }

    public CharSequence getHelperText() {
        if (this.f8875k.A()) {
            return this.f8875k.r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f8875k.t();
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.C0.r();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.C0.v();
    }

    public ColorStateList getHintTextColor() {
        return this.r0;
    }

    public int getMaxEms() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinEms() {
        return this.g;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.e0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.e0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.s) {
            return this.f8876r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.f8874b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f8874b.b();
    }

    public TextView getPrefixTextView() {
        return this.f8874b.c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f8874b.d();
    }

    public Drawable getStartIconDrawable() {
        return this.f8874b.e();
    }

    public CharSequence getSuffixText() {
        return this.A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.B;
    }

    public Typeface getTypeface() {
        return this.V;
    }

    public final void h() {
        if (this.e == null || this.L != 1) {
            return;
        }
        if (k8f.j(getContext())) {
            EditText editText = this.e;
            androidx.core.view.c.J0(editText, androidx.core.view.c.F(editText), getResources().getDimensionPixelSize(pmi.F), androidx.core.view.c.E(this.e), getResources().getDimensionPixelSize(pmi.E));
        } else if (k8f.i(getContext())) {
            EditText editText2 = this.e;
            androidx.core.view.c.J0(editText2, androidx.core.view.c.F(editText2), getResources().getDimensionPixelSize(pmi.D), androidx.core.view.c.E(this.e), getResources().getDimensionPixelSize(pmi.C));
        }
    }

    public final void h0() {
        if (this.L == 1) {
            if (k8f.j(getContext())) {
                this.M = getResources().getDimensionPixelSize(pmi.H);
            } else if (k8f.i(getContext())) {
                this.M = getResources().getDimensionPixelSize(pmi.G);
            }
        }
    }

    @VisibleForTesting
    public void i(float f2) {
        if (this.C0.D() == f2) {
            return;
        }
        if (this.F0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.F0 = valueAnimator;
            valueAnimator.setInterpolator(wc1.f37827b);
            this.F0.setDuration(167L);
            this.F0.addUpdateListener(new d());
        }
        this.F0.setFloatValues(this.C0.D(), f2);
        this.F0.start();
    }

    public final void i0(Rect rect) {
        l8f l8fVar = this.G;
        if (l8fVar != null) {
            int i = rect.bottom;
            l8fVar.setBounds(rect.left, i - this.O, rect.right, i);
        }
        l8f l8fVar2 = this.H;
        if (l8fVar2 != null) {
            int i2 = rect.bottom;
            l8fVar2.setBounds(rect.left, i2 - this.P, rect.right, i2);
        }
    }

    public final void j() {
        l8f l8fVar = this.F;
        if (l8fVar == null) {
            return;
        }
        r2m r2mVarE = l8fVar.E();
        r2m r2mVar = this.I;
        if (r2mVarE != r2mVar) {
            this.F.setShapeAppearanceModel(r2mVar);
            n0();
        }
        if (t()) {
            this.F.j0(this.N, this.Q);
        }
        int iN = n();
        this.R = iN;
        this.F.b0(ColorStateList.valueOf(iN));
        if (this.c0 == 3) {
            this.e.getBackground().invalidateSelf();
        }
        k();
        invalidate();
    }

    public final void j0() {
        if (this.o != null) {
            EditText editText = this.e;
            k0(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void k() {
        if (this.G == null || this.H == null) {
            return;
        }
        if (u()) {
            this.G.b0(this.e.isFocused() ? ColorStateList.valueOf(this.s0) : ColorStateList.valueOf(this.Q));
            this.H.b0(ColorStateList.valueOf(this.Q));
        }
        invalidate();
    }

    public void k0(int i) {
        boolean z = this.n;
        int i2 = this.m;
        if (i2 == -1) {
            this.o.setText(String.valueOf(i));
            this.o.setContentDescription(null);
            this.n = false;
        } else {
            this.n = i > i2;
            l0(getContext(), this.o, i, this.m, this.n);
            if (z != this.n) {
                m0();
            }
            this.o.setText(ti2.c().j(getContext().getString(h2j.d, Integer.valueOf(i), Integer.valueOf(this.m))));
        }
        if (this.e == null || z == this.n) {
            return;
        }
        u0(false);
        C0();
        p0();
    }

    public final void l(RectF rectF) {
        float f2 = rectF.left;
        int i = this.K;
        rectF.left = f2 - i;
        rectF.right += i;
    }

    public final void m() {
        int i = this.L;
        if (i == 0) {
            this.F = null;
            this.G = null;
            this.H = null;
            return;
        }
        if (i == 1) {
            this.F = new l8f(this.I);
            this.G = new l8f();
            this.H = new l8f();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.L + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.C || (this.F instanceof ff5)) {
                this.F = new l8f(this.I);
            } else {
                this.F = new ff5(this.I);
            }
            this.G = null;
            this.H = null;
        }
    }

    public final void m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.o;
        if (textView != null) {
            b0(textView, this.n ? this.p : this.q);
            if (!this.n && (colorStateList2 = this.y) != null) {
                this.o.setTextColor(colorStateList2);
            }
            if (!this.n || (colorStateList = this.z) == null) {
                return;
            }
            this.o.setTextColor(colorStateList);
        }
    }

    public final int n() {
        return this.L == 1 ? i8f.g(i8f.e(this, pii.s, 0), this.R) : this.R;
    }

    public final void n0() {
        if (this.c0 == 3 && this.L == 2) {
            ((com.google.android.material.textfield.b) this.d0.get(3)).O((AutoCompleteTextView) this.e);
        }
    }

    public final Rect o(Rect rect) {
        if (this.e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.T;
        boolean zJ = ayq.j(this);
        rect2.bottom = rect.bottom;
        int i = this.L;
        if (i == 1) {
            rect2.left = E(rect.left, zJ);
            rect2.top = rect.top + this.M;
            rect2.right = F(rect.right, zJ);
            return rect2;
        }
        if (i != 2) {
            rect2.left = E(rect.left, zJ);
            rect2.top = getPaddingTop();
            rect2.right = F(rect.right, zJ);
            return rect2;
        }
        rect2.left = rect.left + this.e.getPaddingLeft();
        rect2.top = rect.top - s();
        rect2.right = rect.right - this.e.getPaddingRight();
        return rect2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    public boolean o0() {
        boolean z;
        if (this.e == null) {
            return false;
        }
        boolean z2 = true;
        if (d0()) {
            int measuredWidth = this.f8874b.getMeasuredWidth() - this.e.getPaddingLeft();
            if (this.W == null || this.a0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.W = colorDrawable;
                this.a0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = s8p.a(this.e);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.W;
            if (drawable != drawable2) {
                s8p.j(this.e, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.W != null) {
            Drawable[] drawableArrA2 = s8p.a(this.e);
            s8p.j(this.e, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
            this.W = null;
            z = true;
        } else {
            z = false;
        }
        if (c0()) {
            int measuredWidth2 = this.B.getMeasuredWidth() - this.e.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + c5f.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] drawableArrA3 = s8p.a(this.e);
            Drawable drawable3 = this.i0;
            if (drawable3 == null || this.j0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.i0 = colorDrawable2;
                    this.j0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrA3[2];
                Drawable drawable5 = this.i0;
                if (drawable4 != drawable5) {
                    this.k0 = drawable4;
                    s8p.j(this.e, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.j0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                s8p.j(this.e, drawableArrA3[0], drawableArrA3[1], this.i0, drawableArrA3[3]);
            }
        } else {
            if (this.i0 == null) {
                return z;
            }
            Drawable[] drawableArrA4 = s8p.a(this.e);
            if (drawableArrA4[2] == this.i0) {
                s8p.j(this.e, drawableArrA4[0], drawableArrA4[1], this.k0, drawableArrA4[3]);
            } else {
                z2 = z;
            }
            this.i0 = null;
        }
        return z2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.C0.V(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.S;
            jz5.a(this, editText, rect);
            i0(rect);
            if (this.C) {
                this.C0.r0(this.e.getTextSize());
                int gravity = this.e.getGravity();
                this.C0.g0((gravity & (-113)) | 48);
                this.C0.q0(gravity);
                this.C0.c0(o(rect));
                this.C0.l0(r(rect));
                this.C0.Y();
                if (!y() || this.B0) {
                    return;
                }
                P();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean zQ0 = q0();
        boolean zO0 = o0();
        if (zQ0 || zO0) {
            this.e.post(new c());
        }
        w0();
        A0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.f8877b);
        if (savedState.c) {
            this.e0.post(new b());
        }
        setHint(savedState.d);
        setHelperText(savedState.e);
        setPlaceholderText(savedState.f);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = false;
        boolean z2 = i == 1;
        boolean z3 = this.J;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            float fA = this.I.r().a(this.U);
            float fA2 = this.I.t().a(this.U);
            float fA3 = this.I.j().a(this.U);
            float fA4 = this.I.l().a(this.U);
            float f2 = z ? fA : fA2;
            if (z) {
                fA = fA2;
            }
            float f3 = z ? fA3 : fA4;
            if (z) {
                fA3 = fA4;
            }
            W(f2, fA, f3, fA3);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f8875k.l()) {
            savedState.f8877b = getError();
        }
        savedState.c = G() && this.e0.isChecked();
        savedState.d = getHint();
        savedState.e = getHelperText();
        savedState.f = getPlaceholderText();
        return savedState;
    }

    public final int p(Rect rect, Rect rect2, float f2) {
        return N() ? (int) (rect2.top + f2) : rect.bottom - this.e.getCompoundPaddingBottom();
    }

    public void p0() {
        Drawable background;
        TextView textView;
        EditText editText = this.e;
        if (editText == null || this.L != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (x47.a(background)) {
            background = background.mutate();
        }
        if (this.f8875k.l()) {
            background.setColorFilter(jf1.e(this.f8875k.p(), PorterDuff.Mode.SRC_IN));
        } else if (this.n && (textView = this.o) != null) {
            background.setColorFilter(jf1.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            k47.c(background);
            this.e.refreshDrawableState();
        }
    }

    public final int q(Rect rect, float f2) {
        return N() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.e.getCompoundPaddingTop();
    }

    public final boolean q0() {
        int iMax;
        if (this.e == null || this.e.getMeasuredHeight() >= (iMax = Math.max(this.c.getMeasuredHeight(), this.f8874b.getMeasuredHeight()))) {
            return false;
        }
        this.e.setMinimumHeight(iMax);
        return true;
    }

    public final Rect r(Rect rect) {
        if (this.e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.T;
        float fB = this.C0.B();
        rect2.left = rect.left + this.e.getCompoundPaddingLeft();
        rect2.top = q(rect, fB);
        rect2.right = rect.right - this.e.getCompoundPaddingRight();
        rect2.bottom = p(rect, rect2, fB);
        return rect2;
    }

    public final void r0() {
        this.d.setVisibility((this.e0.getVisibility() != 0 || J()) ? 8 : 0);
        this.c.setVisibility(I() || J() || ((this.A == null || L()) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    public void removeOnEditTextAttachedListener(f fVar) {
        this.b0.remove(fVar);
    }

    public void removeOnEndIconChangedListener(g gVar) {
        this.f0.remove(gVar);
    }

    public final int s() {
        float fR;
        if (!this.C) {
            return 0;
        }
        int i = this.L;
        if (i == 0) {
            fR = this.C0.r();
        } else {
            if (i != 2) {
                return 0;
            }
            fR = this.C0.r() / 2.0f;
        }
        return (int) fR;
    }

    public final void s0() {
        this.n0.setVisibility(getErrorIconDrawable() != null && this.f8875k.z() && this.f8875k.l() ? 0 : 8);
        r0();
        A0();
        if (G()) {
            return;
        }
        o0();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.R != i) {
            this.R = i;
            this.w0 = i;
            this.y0 = i;
            this.z0 = i;
            j();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(ni4.c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.w0 = defaultColor;
        this.R = defaultColor;
        this.x0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.y0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.z0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        j();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.L) {
            return;
        }
        this.L = i;
        if (this.e != null) {
            O();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.M = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.u0 != i) {
            this.u0 = i;
            C0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.s0 = colorStateList.getDefaultColor();
            this.A0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.t0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.u0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.u0 != colorStateList.getDefaultColor()) {
            this.u0 = colorStateList.getDefaultColor();
        }
        C0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.v0 != colorStateList) {
            this.v0 = colorStateList;
            C0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.O = i;
        C0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.P = i;
        C0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.l != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.o = appCompatTextView;
                appCompatTextView.setId(iqi.a0);
                Typeface typeface = this.V;
                if (typeface != null) {
                    this.o.setTypeface(typeface);
                }
                this.o.setMaxLines(1);
                this.f8875k.e(this.o, 2);
                c5f.d((ViewGroup.MarginLayoutParams) this.o.getLayoutParams(), getResources().getDimensionPixelOffset(pmi.D0));
                m0();
                j0();
            } else {
                this.f8875k.B(this.o, 2);
                this.o = null;
            }
            this.l = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.m != i) {
            if (i > 0) {
                this.m = i;
            } else {
                this.m = -1;
            }
            if (this.l) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.p != i) {
            this.p = i;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.q != i) {
            this.q = i;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            m0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.q0 = colorStateList;
        this.r0 = colorStateList;
        if (this.e != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        R(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.e0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.e0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? of1.b(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.c0;
        if (i2 == i) {
            return;
        }
        this.c0 = i;
        A(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().b(this.L)) {
            getEndIconDelegate().a();
            w1d.a(this, this.e0, this.g0, this.h0);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.L + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        Z(this.e0, onClickListener, this.l0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.l0 = onLongClickListener;
        a0(this.e0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.g0 != colorStateList) {
            this.g0 = colorStateList;
            w1d.a(this, this.e0, colorStateList, this.h0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.h0 != mode) {
            this.h0 = mode;
            w1d.a(this, this.e0, this.g0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        if (I() != z) {
            this.e0.setVisibility(z ? 0 : 8);
            r0();
            A0();
            o0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f8875k.z()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f8875k.v();
        } else {
            this.f8875k.O(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f8875k.D(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f8875k.E(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? of1.b(getContext(), i) : null);
        T();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        Z(this.n0, onClickListener, this.m0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.m0 = onLongClickListener;
        a0(this.n0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.o0 != colorStateList) {
            this.o0 = colorStateList;
            w1d.a(this, this.n0, colorStateList, this.p0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.p0 != mode) {
            this.p0 = mode;
            w1d.a(this, this.n0, this.o0, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f8875k.F(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f8875k.G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.D0 != z) {
            this.D0 = z;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (K()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!K()) {
                setHelperTextEnabled(true);
            }
            this.f8875k.P(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f8875k.J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f8875k.I(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f8875k.H(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.E0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.C) {
            this.C = z;
            if (z) {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.E = true;
            } else {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.e != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.C0.d0(i);
        this.r0 = this.C0.p();
        if (this.e != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.r0 != colorStateList) {
            if (this.q0 == null) {
                this.C0.f0(colorStateList);
            }
            this.r0 = colorStateList;
            if (this.e != null) {
                u0(false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.h = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.j = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.g = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.i = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? of1.b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.c0 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.g0 = colorStateList;
        w1d.a(this, this.e0, colorStateList, this.h0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.h0 = mode;
        w1d.a(this, this.e0, this.g0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.t = appCompatTextView;
            appCompatTextView.setId(iqi.d0);
            androidx.core.view.c.C0(this.t, 2);
            Fade fadeX = x();
            this.w = fadeX;
            fadeX.h0(67L);
            this.x = x();
            setPlaceholderTextAppearance(this.v);
            setPlaceholderTextColor(this.u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.s) {
                setPlaceholderTextEnabled(true);
            }
            this.f8876r = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.v = i;
        TextView textView = this.t;
        if (textView != null) {
            s8p.o(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            TextView textView = this.t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f8874b.k(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.f8874b.l(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f8874b.m(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f8874b.n(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? of1.b(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8874b.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8874b.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f8874b.q(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f8874b.r(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.f8874b.s(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.B.setText(charSequence);
        B0();
    }

    public void setSuffixTextAppearance(int i) {
        s8p.o(this.B, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.e;
        if (editText != null) {
            androidx.core.view.c.r0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.V) {
            this.V = typeface;
            this.C0.H0(typeface);
            this.f8875k.L(typeface);
            TextView textView = this.o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final boolean t() {
        return this.L == 2 && u();
    }

    public final void t0() {
        if (this.L != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8873a.getLayoutParams();
            int iS = s();
            if (iS != layoutParams.topMargin) {
                layoutParams.topMargin = iS;
                this.f8873a.requestLayout();
            }
        }
    }

    public final boolean u() {
        return this.N > -1 && this.Q != 0;
    }

    public void u0(boolean z) {
        v0(z, false);
    }

    public final void v() {
        if (y()) {
            ((ff5) this.F).r0();
        }
    }

    public final void v0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = false;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.e;
        if (editText2 != null && editText2.hasFocus()) {
            z3 = true;
        }
        boolean zL = this.f8875k.l();
        ColorStateList colorStateList2 = this.q0;
        if (colorStateList2 != null) {
            this.C0.f0(colorStateList2);
            this.C0.p0(this.q0);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.q0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.A0) : this.A0;
            this.C0.f0(ColorStateList.valueOf(colorForState));
            this.C0.p0(ColorStateList.valueOf(colorForState));
        } else if (zL) {
            this.C0.f0(this.f8875k.q());
        } else if (this.n && (textView = this.o) != null) {
            this.C0.f0(textView.getTextColors());
        } else if (z3 && (colorStateList = this.r0) != null) {
            this.C0.f0(colorStateList);
        }
        if (z4 || !this.D0 || (isEnabled() && z3)) {
            if (z2 || this.B0) {
                w(z);
                return;
            }
            return;
        }
        if (z2 || !this.B0) {
            D(z);
        }
    }

    public final void w(boolean z) {
        ValueAnimator valueAnimator = this.F0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.F0.cancel();
        }
        if (z && this.E0) {
            i(1.0f);
        } else {
            this.C0.u0(1.0f);
        }
        this.B0 = false;
        if (y()) {
            P();
        }
        x0();
        this.f8874b.i(false);
        B0();
    }

    public final void w0() {
        EditText editText;
        if (this.t == null || (editText = this.e) == null) {
            return;
        }
        this.t.setGravity(editText.getGravity());
        this.t.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
    }

    public final Fade x() {
        Fade fade = new Fade();
        fade.b0(87L);
        fade.d0(wc1.f37826a);
        return fade;
    }

    public final void x0() {
        EditText editText = this.e;
        y0(editText == null ? 0 : editText.getText().length());
    }

    public final boolean y() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof ff5);
    }

    public final void y0(int i) {
        if (i != 0 || this.B0) {
            H();
        } else {
            f0();
        }
    }

    public final void z() {
        Iterator<f> it = this.b0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void z0(boolean z, boolean z2) {
        int defaultColor = this.v0.getDefaultColor();
        int colorForState = this.v0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.v0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.Q = colorForState2;
        } else if (z2) {
            this.Q = colorForState;
        } else {
            this.Q = defaultColor;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.f0);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.e0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.e0.setImageDrawable(drawable);
        if (drawable != null) {
            w1d.a(this, this.e0, this.g0, this.h0);
            S();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f8874b.o(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f8874b.p(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v43 */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        ?? r4;
        int i3 = I0;
        super(n8f.c(context, attributeSet, i, i3), attributeSet, i);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.f8875k = new t7d(this);
        this.S = new Rect();
        this.T = new Rect();
        this.U = new RectF();
        this.b0 = new LinkedHashSet<>();
        this.c0 = 0;
        SparseArray<ia8> sparseArray = new SparseArray<>();
        this.d0 = sparseArray;
        this.f0 = new LinkedHashSet<>();
        b44 b44Var = new b44(this);
        this.C0 = b44Var;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f8873a = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.d = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.c = linearLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.B = appCompatTextView;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        appCompatTextView.setVisibility(8);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(kwi.m, (ViewGroup) linearLayout, false);
        this.n0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(kwi.m, (ViewGroup) frameLayout2, false);
        this.e0 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = wc1.f37826a;
        b44Var.G0(timeInterpolator);
        b44Var.C0(timeInterpolator);
        b44Var.g0(8388659);
        xfp xfpVarI = c9p.i(context2, attributeSet, b4j.q9, i, i3, b4j.N9, b4j.L9, b4j.aa, b4j.fa, b4j.ja);
        rbo rboVar = new rbo(this, xfpVarI);
        this.f8874b = rboVar;
        this.C = xfpVarI.a(b4j.ia, true);
        setHint(xfpVarI.p(b4j.v9));
        this.E0 = xfpVarI.a(b4j.ha, true);
        this.D0 = xfpVarI.a(b4j.ca, true);
        if (xfpVarI.s(b4j.x9)) {
            i2 = -1;
            setMinEms(xfpVarI.k(b4j.x9, -1));
        } else {
            i2 = -1;
            if (xfpVarI.s(b4j.u9)) {
                setMinWidth(xfpVarI.f(b4j.u9, -1));
            }
        }
        if (xfpVarI.s(b4j.w9)) {
            setMaxEms(xfpVarI.k(b4j.w9, i2));
        } else if (xfpVarI.s(b4j.t9)) {
            setMaxWidth(xfpVarI.f(b4j.t9, i2));
        }
        this.I = r2m.e(context2, attributeSet, i, i3).m();
        this.K = context2.getResources().getDimensionPixelOffset(pmi.A0);
        this.M = xfpVarI.e(b4j.A9, 0);
        this.O = xfpVarI.f(b4j.H9, context2.getResources().getDimensionPixelSize(pmi.B0));
        this.P = xfpVarI.f(b4j.I9, context2.getResources().getDimensionPixelSize(pmi.C0));
        this.N = this.O;
        float fD = xfpVarI.d(b4j.E9, -1.0f);
        float fD2 = xfpVarI.d(b4j.D9, -1.0f);
        float fD3 = xfpVarI.d(b4j.B9, -1.0f);
        float fD4 = xfpVarI.d(b4j.C9, -1.0f);
        r2m.b bVarV = this.I.v();
        if (fD >= 0.0f) {
            bVarV.E(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.I(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.z(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.v(fD4);
        }
        this.I = bVarV.m();
        ColorStateList colorStateListA = k8f.a(context2, xfpVarI, b4j.y9);
        if (colorStateListA != null) {
            int defaultColor = colorStateListA.getDefaultColor();
            this.w0 = defaultColor;
            this.R = defaultColor;
            if (colorStateListA.isStateful()) {
                this.x0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.y0 = colorStateListA.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.z0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.y0 = this.w0;
                ColorStateList colorStateListA2 = of1.a(context2, xki.m);
                this.x0 = colorStateListA2.getColorForState(new int[]{-16842910}, -1);
                this.z0 = colorStateListA2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.R = 0;
            this.w0 = 0;
            this.x0 = 0;
            this.y0 = 0;
            this.z0 = 0;
        }
        if (xfpVarI.s(b4j.s9)) {
            ColorStateList colorStateListC = xfpVarI.c(b4j.s9);
            this.r0 = colorStateListC;
            this.q0 = colorStateListC;
        }
        ColorStateList colorStateListA3 = k8f.a(context2, xfpVarI, b4j.F9);
        this.u0 = xfpVarI.b(b4j.F9, 0);
        this.s0 = ni4.c(context2, xki.n);
        this.A0 = ni4.c(context2, xki.o);
        this.t0 = ni4.c(context2, xki.p);
        if (colorStateListA3 != null) {
            setBoxStrokeColorStateList(colorStateListA3);
        }
        if (xfpVarI.s(b4j.G9)) {
            setBoxStrokeErrorColor(k8f.a(context2, xfpVarI, b4j.G9));
        }
        if (xfpVarI.n(b4j.ja, -1) != -1) {
            r4 = 0;
            setHintTextAppearance(xfpVarI.n(b4j.ja, 0));
        } else {
            r4 = 0;
        }
        int iN = xfpVarI.n(b4j.aa, r4);
        CharSequence charSequenceP = xfpVarI.p(b4j.V9);
        boolean zA = xfpVarI.a(b4j.W9, r4);
        checkableImageButton.setId(iqi.Z);
        if (k8f.i(context2)) {
            c5f.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r4);
        }
        if (xfpVarI.s(b4j.Y9)) {
            this.o0 = k8f.a(context2, xfpVarI, b4j.Y9);
        }
        if (xfpVarI.s(b4j.Z9)) {
            this.p0 = ayq.k(xfpVarI.k(b4j.Z9, -1), null);
        }
        if (xfpVarI.s(b4j.X9)) {
            setErrorIconDrawable(xfpVarI.g(b4j.X9));
        }
        checkableImageButton.setContentDescription(getResources().getText(h2j.f));
        androidx.core.view.c.C0(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iN2 = xfpVarI.n(b4j.fa, 0);
        boolean zA2 = xfpVarI.a(b4j.ea, false);
        CharSequence charSequenceP2 = xfpVarI.p(b4j.da);
        int iN3 = xfpVarI.n(b4j.ra, 0);
        CharSequence charSequenceP3 = xfpVarI.p(b4j.qa);
        int iN4 = xfpVarI.n(b4j.Ca, 0);
        CharSequence charSequenceP4 = xfpVarI.p(b4j.Ba);
        boolean zA3 = xfpVarI.a(b4j.J9, false);
        setCounterMaxLength(xfpVarI.k(b4j.K9, -1));
        this.q = xfpVarI.n(b4j.N9, 0);
        this.p = xfpVarI.n(b4j.L9, 0);
        setBoxBackgroundMode(xfpVarI.k(b4j.z9, 0));
        if (k8f.i(context2)) {
            c5f.d((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int iN5 = xfpVarI.n(b4j.R9, 0);
        sparseArray.append(-1, new pd5(this, iN5));
        sparseArray.append(0, new oug(this));
        sparseArray.append(1, new com.google.android.material.textfield.c(this, iN5 == 0 ? xfpVarI.n(b4j.ma, 0) : iN5));
        sparseArray.append(2, new com.google.android.material.textfield.a(this, iN5));
        sparseArray.append(3, new com.google.android.material.textfield.b(this, iN5));
        if (!xfpVarI.s(b4j.na)) {
            if (xfpVarI.s(b4j.T9)) {
                this.g0 = k8f.a(context2, xfpVarI, b4j.T9);
            }
            if (xfpVarI.s(b4j.U9)) {
                this.h0 = ayq.k(xfpVarI.k(b4j.U9, -1), null);
            }
        }
        if (xfpVarI.s(b4j.S9)) {
            setEndIconMode(xfpVarI.k(b4j.S9, 0));
            if (xfpVarI.s(b4j.Q9)) {
                setEndIconContentDescription(xfpVarI.p(b4j.Q9));
            }
            setEndIconCheckable(xfpVarI.a(b4j.P9, true));
        } else if (xfpVarI.s(b4j.na)) {
            if (xfpVarI.s(b4j.oa)) {
                this.g0 = k8f.a(context2, xfpVarI, b4j.oa);
            }
            if (xfpVarI.s(b4j.pa)) {
                this.h0 = ayq.k(xfpVarI.k(b4j.pa, -1), null);
            }
            setEndIconMode(xfpVarI.a(b4j.na, false) ? 1 : 0);
            setEndIconContentDescription(xfpVarI.p(b4j.la));
        }
        appCompatTextView.setId(iqi.f0);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        androidx.core.view.c.t0(appCompatTextView, 1);
        setErrorContentDescription(charSequenceP);
        setCounterOverflowTextAppearance(this.p);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.q);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        setSuffixTextAppearance(iN4);
        if (xfpVarI.s(b4j.ba)) {
            setErrorTextColor(xfpVarI.c(b4j.ba));
        }
        if (xfpVarI.s(b4j.ga)) {
            setHelperTextColor(xfpVarI.c(b4j.ga));
        }
        if (xfpVarI.s(b4j.ka)) {
            setHintTextColor(xfpVarI.c(b4j.ka));
        }
        if (xfpVarI.s(b4j.O9)) {
            setCounterTextColor(xfpVarI.c(b4j.O9));
        }
        if (xfpVarI.s(b4j.M9)) {
            setCounterOverflowTextColor(xfpVarI.c(b4j.M9));
        }
        if (xfpVarI.s(b4j.sa)) {
            setPlaceholderTextColor(xfpVarI.c(b4j.sa));
        }
        if (xfpVarI.s(b4j.Da)) {
            setSuffixTextColor(xfpVarI.c(b4j.Da));
        }
        setEnabled(xfpVarI.a(b4j.r9, true));
        xfpVarI.w();
        androidx.core.view.c.C0(this, 2);
        androidx.core.view.c.E0(this, 1);
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(rboVar);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
        setSuffixText(charSequenceP4);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.n0.setImageDrawable(drawable);
        s0();
        w1d.a(this, this.n0, this.o0, this.p0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.e0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.e0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
