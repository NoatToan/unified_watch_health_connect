package com.huawei.uikit.hwedittext.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huawei.uikit.hwedittext.R;
import com.huawei.uikit.hwunifiedinteract.widget.HwKeyEventDetector;
import defpackage.xeh;
import defpackage.xfs;
import defpackage.xft;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes20.dex */
public class HwEditText extends EditText {
    protected static final int ALT_SHIFT_STATUS = 4;
    protected static final String CURSOR_STATE = "CursorState";
    protected static final int EDIT_STATUS = 2;
    protected static final int FOCUSED_STATUS = 1;
    protected static final String INSTANCE_STATE = "InstanceState";
    protected static final int KEYCODE_INPUTMETHOD_ACTION = 746;
    protected static final int TOUCH_STATUS = 3;
    protected static final int UNFOCUSED_STATUS = 0;
    protected static final String VIEW_STATE = "ViewState";
    private static final String i = "HwEditText";
    private static final int j = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwKeyEventDetector f29473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Drawable f29474c;
    private boolean d;
    private boolean e;
    private boolean f;
    private Drawable g;
    private TextWatcher h;

    class c implements TextWatcher {
        c() {
        }

        private void a(int i, int i2, int i3) {
            int i4 = i2 + i3;
            int i5 = i3 + i4;
            if (i5 <= i) {
                i = i5;
            }
            if (i > i4) {
                HwEditText.this.getText().replace(i4, i, "");
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence == null || !HwEditText.this.d) {
                return;
            }
            if (i >= charSequence.length() || charSequence.charAt(i) != '\n') {
                int length = charSequence.length();
                Object[] spans = HwEditText.this.getText().getSpans(i, i + i3, UnderlineSpan.class);
                if (i2 == 0) {
                    if (spans == null || spans.length == 0) {
                        a(length, i, i3);
                        return;
                    }
                    return;
                }
                if (spans == null || spans.length == 0) {
                    a(length, i, i3);
                } else {
                    Log.e(HwEditText.i, "Before not zero and builders exist");
                }
            }
        }
    }

    public HwEditText(Context context) {
        this(context, null);
    }

    public static HwEditText instantiate(Context context) {
        Object objC = xft.c(context, xft.b(context, HwEditText.class, xft.d(context, 3, 1)), HwEditText.class);
        if (objC instanceof HwEditText) {
            return (HwEditText) objC;
        }
        return null;
    }

    private void setValueFromPlume(Context context) {
        Method methodC = xeh.c("getBoolean", new Class[]{Context.class, View.class, String.class, Boolean.TYPE}, "huawei.android.widget.HwPlume");
        if (methodC == null) {
            setExtendedEditEnabled(true);
            return;
        }
        Object objC = xeh.c((Object) null, methodC, new Object[]{context, this, "insertEnabled", Boolean.TRUE});
        if (objC instanceof Boolean) {
            setExtendedEditEnabled(((Boolean) objC).booleanValue());
        } else {
            setExtendedEditEnabled(true);
        }
    }

    protected HwKeyEventDetector createKeyEventDetector() {
        return new HwKeyEventDetector(getContext());
    }

    public void drawFocusLayer(Canvas canvas) {
        Drawable focusedDrawable = getFocusedDrawable();
        if (focusedDrawable != null) {
            canvas.translate(getScrollX(), getScrollY());
            focusedDrawable.setBounds(0, 0, getWidth(), getHeight());
            focusedDrawable.draw(canvas);
            canvas.translate(-getScrollX(), -getScrollY());
        }
    }

    public Drawable getFocusedDrawable() {
        return this.g;
    }

    public HwKeyEventDetector.OnSearchEventListener getOnSearchEventListener() {
        HwKeyEventDetector hwKeyEventDetector = this.f29473b;
        if (hwKeyEventDetector != null) {
            return hwKeyEventDetector.a();
        }
        return null;
    }

    public void handleTabKeyEvent(KeyEvent keyEvent) {
        View viewFindNextFocus;
        View rootView = getRootView();
        if (rootView instanceof ViewGroup) {
            boolean z = (keyEvent.getMetaState() & 1) != 0;
            FocusFinder focusFinder = FocusFinder.getInstance();
            viewFindNextFocus = z ? focusFinder.findNextFocus((ViewGroup) rootView, this, 1) : focusFinder.findNextFocus((ViewGroup) rootView, this, 2);
        } else {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            viewFindNextFocus.requestFocus();
        }
    }

    public void hideSoftInput() {
        if (Build.VERSION.SDK_INT > 29) {
            return;
        }
        Object systemService = getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            }
        }
    }

    public boolean isAltKey(int i2) {
        return i2 == 57 || i2 == 58;
    }

    public boolean isConfirmKey(int i2) {
        return i2 == 23 || i2 == 62 || i2 == 66 || i2 == 160;
    }

    public boolean isDirectionalNavigationKey(int i2) {
        switch (i2) {
            case 19:
            case 20:
            case 21:
            case 22:
                return true;
            default:
                return false;
        }
    }

    public boolean isExtendedEditEnabled() {
        return this.e;
    }

    public boolean isSafeEditText() {
        return this.f;
    }

    public boolean isShiftKey(int i2) {
        return i2 == 59 || i2 == 60;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e) {
            addTextChangedListener(this.h);
        } else {
            removeTextChangedListener(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if (i2 == 124 && keyEvent.getAction() == 0) {
            this.d = !this.d;
        }
        return super.onKeyPreIme(i2, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        HwKeyEventDetector hwKeyEventDetector = this.f29473b;
        if (hwKeyEventDetector == null || !hwKeyEventDetector.e(keyEvent.getKeyCode(), keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i2) {
        if (this.f && (16908321 == i2 || 16908320 == i2)) {
            return false;
        }
        return super.onTextContextMenuItem(i2);
    }

    public void setExtendedEditEnabled(boolean z) {
        if (!isAttachedToWindow() || this.h == null) {
            return;
        }
        this.e = z;
        if (isAttachedToWindow()) {
            if (z) {
                addTextChangedListener(this.h);
            } else {
                removeTextChangedListener(this.h);
            }
        }
    }

    public void setFocusedDrawable(Drawable drawable) {
        this.g = drawable;
    }

    public void setOnSearchEventListener(HwKeyEventDetector.OnSearchEventListener onSearchEventListener) {
        if (this.f29473b == null) {
            this.f29473b = createKeyEventDetector();
        }
        HwKeyEventDetector hwKeyEventDetector = this.f29473b;
        if (hwKeyEventDetector != null) {
            hwKeyEventDetector.a(onSearchEventListener);
        }
    }

    public void setSafeEditText(boolean z) {
        this.f = z;
    }

    public void setTextCursorColor(int i2) {
        if (i2 != this.f29472a) {
            this.f29472a = i2;
            a();
        }
    }

    public HwEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwEditTextStyle);
    }

    private static Context a(Context context, int i2) {
        return xfs.c(context, i2, R.style.Theme_Emui_HwEditText);
    }

    public HwEditText(Context context, AttributeSet attributeSet, int i2) {
        super(a(context, i2), attributeSet, i2);
        this.f29473b = null;
        this.f29474c = ContextCompat.getDrawable(getContext(), R.drawable.hwedittext_cursor);
        this.d = false;
        this.e = false;
        this.f = false;
        this.h = new c();
        a(super.getContext(), attributeSet, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwEditText, i2, R.style.Widget_Emui_HwEditText);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.HwEditText_hwTextCursorColor, ContextCompat.getColor(context, R.color.hwedittext_color_control_highlight));
        this.g = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwEditText_hwFocusedDrawable);
        typedArrayObtainStyledAttributes.recycle();
        setTextCursorColor(color);
        setValueFromPlume(context);
    }

    private void a() {
        try {
            Object objC = xeh.c(this, "mEditor", (Class<?>) TextView.class);
            Class<?> cls = Class.forName("android.widget.Editor");
            if (Build.VERSION.SDK_INT >= 28) {
                xeh.b(objC, "updateCursorPosition", null, null, cls);
                try {
                    Object objInvoke = TextView.class.getDeclaredMethod("getTextCursorDrawable", new Class[0]).invoke(this, new Object[0]);
                    if (objInvoke instanceof Drawable) {
                        TextView.class.getDeclaredMethod("setTextCursorDrawable", Drawable.class).invoke(this, a((Drawable) objInvoke, this.f29472a));
                        return;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                    Object objC2 = xeh.c(objC, "mDrawableForCursor", cls);
                    if (objC2 instanceof Drawable) {
                        xeh.d("mDrawableForCursor", objC, a((Drawable) objC2, this.f29472a), cls);
                        return;
                    }
                    return;
                }
            }
            Object objC3 = xeh.c(objC, "mCursorDrawable", cls);
            if (objC3 instanceof Drawable[]) {
                Drawable[] drawableArr = (Drawable[]) objC3;
                for (int i2 = 0; i2 < drawableArr.length; i2++) {
                    drawableArr[i2] = a(drawableArr[i2], this.f29472a);
                }
                xeh.d("mCursorDrawable", objC, drawableArr, cls);
            }
        } catch (ClassNotFoundException unused2) {
            Log.e(i, "class not found");
        } catch (IllegalAccessException unused3) {
            Log.e(i, "illegal access");
        } catch (InvocationTargetException unused4) {
            Log.e(i, "invocation error");
        }
    }

    private Drawable a(Drawable drawable, int i2) {
        Drawable drawable2;
        if (drawable == null) {
            if (this.f29472a == 0 || (drawable2 = this.f29474c) == null) {
                return null;
            }
            drawable = drawable2.mutate();
        }
        Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        DrawableCompat.setTint(drawableMutate, i2);
        return drawableMutate;
    }
}
