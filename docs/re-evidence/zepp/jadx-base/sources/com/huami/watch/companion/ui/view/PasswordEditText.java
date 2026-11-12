package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class PasswordEditText extends EditText implements TextWatcher {
    private boolean a;
    private int b;
    private int c;

    public PasswordEditText(Context context) {
        this(context, null);
    }

    private void a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.PasswordEditText, i, 0);
            try {
                try {
                    this.b = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PasswordEditText_pwd_icon_show, this.b);
                    this.c = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PasswordEditText_pwd_icon_hide, this.c);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        setInputType(129);
        addTextChangedListener(this);
    }

    private void b(boolean z) {
        if (z) {
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.a ? ContextCompat.getDrawable(getContext(), this.b) : ContextCompat.getDrawable(getContext(), this.c), (Drawable) null);
        } else {
            setCompoundDrawablesRelative(null, null, null, null);
        }
    }

    private void c() {
        if (this.a) {
            setInputType(145);
        } else {
            setInputType(129);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() > 0) {
            b(true);
        } else {
            b(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && getCompoundDrawables()[2] != null) {
            if (motionEvent.getX() > ((float) (getWidth() - getTotalPaddingRight())) && motionEvent.getX() < ((float) (getWidth() - getPaddingRight()))) {
                this.a = !this.a;
                c();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public PasswordEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.editTextStyle);
    }

    public PasswordEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        this.b = R.drawable.pwd_show_on_icon;
        this.c = R.drawable.pwd_show_off_icon;
        a(attributeSet, i);
    }
}
