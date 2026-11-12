package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import defpackage.fpi;
import defpackage.h2j;
import defpackage.ia8;
import defpackage.wc1;

/* JADX INFO: loaded from: classes5.dex */
public class a extends ia8 {
    public final TextWatcher e;
    public final View.OnFocusChangeListener f;
    public final TextInputLayout.f g;
    public final TextInputLayout.g h;
    public AnimatorSet i;
    public ValueAnimator j;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0220a implements TextWatcher {
        public C0220a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f20937a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            a aVar = a.this;
            aVar.i(aVar.m());
        }
    }

    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.this.m());
            editText.setOnFocusChangeListener(a.this.f);
            a aVar = a.this;
            aVar.c.setOnFocusChangeListener(aVar.f);
            editText.removeTextChangedListener(a.this.e);
            editText.addTextChangedListener(a.this.e);
        }
    }

    public class d implements TextInputLayout.g {

        /* JADX INFO: renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        public class RunnableC0221a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EditText f8887a;

            public RunnableC0221a(EditText editText) {
                this.f8887a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8887a.removeTextChangedListener(a.this.e);
                a.this.i(true);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new RunnableC0221a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f) {
                editText.setOnFocusChangeListener(null);
            }
            if (a.this.c.getOnFocusChangeListener() == a.this.f) {
                a.this.c.setOnFocusChangeListener(null);
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f20937a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f20937a.S();
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f20937a.setEndIconVisible(true);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f20937a.setEndIconVisible(false);
        }
    }

    public class h implements ValueAnimator.AnimatorUpdateListener {
        public h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.c.setScaleX(fFloatValue);
            a.this.c.setScaleY(fFloatValue);
        }
    }

    public a(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
        this.e = new C0220a();
        this.f = new b();
        this.g = new c();
        this.h = new d();
    }

    @Override // defpackage.ia8
    public void a() {
        TextInputLayout textInputLayout = this.f20937a;
        int i2 = this.d;
        if (i2 == 0) {
            i2 = fpi.f;
        }
        textInputLayout.setEndIconDrawable(i2);
        TextInputLayout textInputLayout2 = this.f20937a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(h2j.e));
        this.f20937a.setEndIconCheckable(false);
        this.f20937a.setEndIconOnClickListener(new e());
        this.f20937a.addOnEditTextAttachedListener(this.g);
        this.f20937a.addOnEndIconChangedListener(this.h);
        l();
    }

    @Override // defpackage.ia8
    public void c(boolean z) {
        if (this.f20937a.getSuffixText() == null) {
            return;
        }
        i(z);
    }

    public final void i(boolean z) {
        boolean z2 = this.f20937a.I() == z;
        if (z && !this.i.isRunning()) {
            this.j.cancel();
            this.i.start();
            if (z2) {
                this.i.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.i.cancel();
        this.j.start();
        if (z2) {
            this.j.end();
        }
    }

    public final ValueAnimator j(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(wc1.f37826a);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new h());
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(wc1.d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new i());
        return valueAnimatorOfFloat;
    }

    public final void l() {
        ValueAnimator valueAnimatorK = k();
        ValueAnimator valueAnimatorJ = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.i = animatorSet;
        animatorSet.playTogether(valueAnimatorK, valueAnimatorJ);
        this.i.addListener(new f());
        ValueAnimator valueAnimatorJ2 = j(1.0f, 0.0f);
        this.j = valueAnimatorJ2;
        valueAnimatorJ2.addListener(new g());
    }

    public final boolean m() {
        EditText editText = this.f20937a.getEditText();
        return editText != null && (editText.hasFocus() || this.c.hasFocus()) && editText.getText().length() > 0;
    }
}
