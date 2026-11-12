package com.huami.lib.rainbow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class ClearEditText extends AppCompatEditText implements View.OnFocusChangeListener, TextWatcher {
    private Drawable a;
    private boolean b;
    private boolean c;
    private ArrayList<TextWatcher> d;

    public ClearEditText(Context context) {
        this(context, null);
    }

    private void a() {
        this.a = getCompoundDrawables()[2];
        if (isInEditMode()) {
            return;
        }
        setClearIconVisible(false);
        setOnFocusChangeListener(this);
    }

    public static Animation shakeAnimation(int i) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new CycleInterpolator(i));
        translateAnimation.setDuration(1000L);
        return translateAnimation;
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        this.d.add(textWatcher);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ArrayList<TextWatcher> arrayList = this.d;
        if (arrayList != null) {
            Iterator<TextWatcher> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().afterTextChanged(editable);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList<TextWatcher> arrayList = this.d;
        if (arrayList != null) {
            Iterator<TextWatcher> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().beforeTextChanged(charSequence, i, i2, i3);
            }
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        this.b = z;
        if (z && this.c) {
            setClearIconVisible(getText().length() > 0);
        } else {
            setClearIconVisible(false);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.b) {
            setClearIconVisible(charSequence.length() > 0);
        }
        ArrayList<TextWatcher> arrayList = this.d;
        if (arrayList != null) {
            Iterator<TextWatcher> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().onTextChanged(charSequence, i, i2, i3);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && getCompoundDrawables()[2] != null) {
            if (motionEvent.getX() > ((float) (getWidth() - getTotalPaddingRight())) && motionEvent.getX() < ((float) (getWidth() - getPaddingRight()))) {
                setText((CharSequence) null);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        int iIndexOf;
        ArrayList<TextWatcher> arrayList = this.d;
        if (arrayList == null || (iIndexOf = arrayList.indexOf(textWatcher)) < 0) {
            return;
        }
        this.d.remove(iIndexOf);
    }

    public void setClearIconVisible(boolean z) {
        setCompoundDrawablesWithIntrinsicBounds(getCompoundDrawables()[0], getCompoundDrawables()[1], z ? this.a : null, getCompoundDrawables()[3]);
    }

    public void setShakeAnimation() {
        setAnimation(shakeAnimation(5));
    }

    public void setShowClearIcon(boolean z) {
        this.c = z;
    }

    public ClearEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.editTextStyle);
    }

    public ClearEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        a();
    }
}
