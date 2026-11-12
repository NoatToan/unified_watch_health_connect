package miuix.androidbasewidget.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatEditText;
import defpackage.e5j;
import defpackage.qki;
import defpackage.y2j;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public class EditText extends AppCompatEditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26249b;
    public boolean c;
    public TextWatcher d;
    public boolean e;
    public int f;
    public int g;

    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EditText.this.setMiuiStyleError(null);
            if (EditText.this.e) {
                EditText.this.e = false;
                EditText editText = EditText.this;
                editText.removeTextChangedListener(editText.d);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public EditText(Context context) {
        this(context, null);
    }

    public final boolean d() {
        int scrollY = getScrollY();
        int height = getLayout().getHeight() - ((getMeasuredHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom());
        this.f26248a = height;
        if (height == 0) {
            return false;
        }
        return scrollY > 0 || scrollY < height - 1;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f26249b = false;
        }
        if (this.f26249b) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int e() {
        return Color.argb(51, Color.red(this.f), Color.green(this.f), Color.blue(this.f));
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.c = d();
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean zOnPreDraw = super.onPreDraw();
        if (Build.VERSION.SDK_INT >= 29) {
            if (getHighlightColor() != e()) {
                setHighlightColor(e());
            }
            int i = this.g;
            if (i == -1 || i != this.f) {
                Drawable textSelectHandleLeft = getTextSelectHandleLeft();
                Drawable textSelectHandleRight = getTextSelectHandleRight();
                Drawable textSelectHandle = getTextSelectHandle();
                Drawable textCursorDrawable = getTextCursorDrawable();
                Drawable[] drawableArr = {textSelectHandleLeft, textSelectHandleRight, textSelectHandle, textCursorDrawable};
                for (int i2 = 0; i2 < 4; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null) {
                        drawable.setColorFilter(this.f, PorterDuff.Mode.SRC_IN);
                        this.g = this.f;
                    }
                }
                setTextSelectHandleLeft(textSelectHandleLeft);
                setTextSelectHandleRight(textSelectHandleRight);
                setTextSelectHandle(textSelectHandle);
                setTextCursorDrawable(textCursorDrawable);
            }
        }
        return zOnPreDraw;
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.c = d();
        if (i2 == this.f26248a || i2 == 0) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.f26249b = true;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        ViewParent parent = getParent();
        if (this.c) {
            if (!this.f26249b && parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return zOnTouchEvent;
    }

    public void setMiuiStyleError(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            getBackground().setLevel(0);
            return;
        }
        getBackground().setLevel(404);
        if (this.e) {
            return;
        }
        this.e = true;
        addTextChangedListener(this.d);
    }

    public EditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public EditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26249b = false;
        this.g = -1;
        this.d = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e5j.x, i, y2j.f39718b);
        this.f = typedArrayObtainStyledAttributes.getColor(e5j.y, getResources().getColor(qki.f31607b));
        typedArrayObtainStyledAttributes.recycle();
        Drawable background = getBackground();
        if (background == null || background.getOpacity() == -2) {
            return;
        }
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
    }
}
