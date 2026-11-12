package com.xiaomi.fitness.baseui.dialog;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import defpackage.loi;

/* JADX INFO: loaded from: classes7.dex */
public class ClearEditText extends AppCompatEditText implements View.OnFocusChangeListener, TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f11646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f11647b;
    public boolean c;
    public int d;
    public a e;

    public interface a {
        void a(String str);
    }

    public ClearEditText(Context context) {
        this(context, null);
    }

    private void a() {
        this.f11646a = getCompoundDrawables()[2];
        this.f11647b = getCompoundDrawables()[0];
        this.d = getResources().getConfiguration().getLayoutDirection();
        if (this.f11646a == null) {
            this.f11646a = getResources().getDrawable(loi.h);
        }
        Drawable drawable = this.f11646a;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f11646a.getIntrinsicHeight());
        setClearIconVisible(false);
        setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        this.c = z;
        if (z) {
            setClearIconVisible(getText().length() > 0);
        } else {
            setClearIconVisible(false);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.c) {
            setClearIconVisible(charSequence.length() > 0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && ((getCompoundDrawables()[2] != null || getCompoundDrawables()[0] != null) && (this.d != 1 ? !(motionEvent.getX() <= getWidth() - getTotalPaddingRight() || motionEvent.getX() >= getWidth() - getPaddingRight()) : !(motionEvent.getX() >= getTotalPaddingLeft() || motionEvent.getX() <= getPaddingLeft())))) {
            setText("");
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClearIconVisible(boolean z) {
        Drawable drawable = z ? this.f11646a : null;
        if (this.d == 1) {
            setCompoundDrawables(drawable, getCompoundDrawables()[1], this.f11647b, getCompoundDrawables()[3]);
        } else {
            setCompoundDrawables(this.f11647b, getCompoundDrawables()[1], drawable, getCompoundDrawables()[3]);
        }
    }

    public void setTextChangedLister(a aVar) {
        this.e = aVar;
    }

    public ClearEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public ClearEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        this.e = null;
        a();
    }
}
