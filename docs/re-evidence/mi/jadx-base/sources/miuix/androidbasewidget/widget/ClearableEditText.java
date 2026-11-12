package miuix.androidbasewidget.widget;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.c;
import defpackage.alb;
import defpackage.eyq;
import defpackage.m80;
import defpackage.mj8;
import defpackage.y1j;
import defpackage.yhi;
import java.lang.ref.WeakReference;
import java.util.List;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class ClearableEditText extends EditText {
    public static final int[] m = {R.attr.state_empty};
    public Drawable h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f26244k;
    public a l;

    public class a extends mj8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f26245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26246b;

        public a(View view) {
            super(view);
            this.f26245a = new Rect();
            this.f26246b = view;
        }

        public final void a(Rect rect) {
            this.f26246b.getLocalVisibleRect(this.f26245a);
            int intrinsicWidth = ClearableEditText.this.h == null ? 0 : ClearableEditText.this.h.getIntrinsicWidth();
            if (eyq.b(ClearableEditText.this)) {
                rect.right -= (ClearableEditText.this.getWidth() - intrinsicWidth) - (ClearableEditText.this.getPaddingLeft() * 2);
            } else {
                rect.left += (ClearableEditText.this.getWidth() - (ClearableEditText.this.getPaddingRight() * 2)) - intrinsicWidth;
            }
        }

        public final CharSequence b() {
            return ClearableEditText.this.getResources().getString(y1j.f39686a);
        }

        public final boolean c(float f, float f2) {
            int intrinsicWidth = ClearableEditText.this.h == null ? 0 : ClearableEditText.this.h.getIntrinsicWidth();
            if (eyq.b(ClearableEditText.this)) {
                return f < ((float) (intrinsicWidth + (ClearableEditText.this.getPaddingLeft() * 2)));
            }
            return f > ((float) ((ClearableEditText.this.getWidth() - (ClearableEditText.this.getPaddingRight() * 2)) - intrinsicWidth));
        }

        @Override // defpackage.mj8
        public int getVirtualViewAt(float f, float f2) {
            return (ClearableEditText.this.j && c(f, f2)) ? 0 : Integer.MIN_VALUE;
        }

        @Override // defpackage.mj8
        public void getVisibleVirtualViews(List list) {
            if (ClearableEditText.this.j) {
                list.add(0);
            }
        }

        @Override // defpackage.mj8
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i == Integer.MIN_VALUE || i2 != 16) {
                return false;
            }
            ClearableEditText.this.n();
            View view = this.f26246b;
            if (view == null || !ClearableEditText.this.l(view.getContext())) {
                return true;
            }
            this.f26246b.sendAccessibilityEvent(32768);
            return true;
        }

        @Override // defpackage.mj8
        public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setContentDescription(b());
        }

        @Override // defpackage.mj8
        public void onPopulateNodeForHost(m80 m80Var) {
            super.onPopulateNodeForHost(m80Var);
            if (ClearableEditText.this.j) {
                m80Var.i0(ClearableEditText.class.getName());
            }
        }

        @Override // defpackage.mj8
        public void onPopulateNodeForVirtualView(int i, m80 m80Var) {
            m80Var.N0(true);
            m80Var.m0(b());
            m80Var.a(16);
            m80Var.i0(Button.class.getName());
            a(this.f26245a);
            m80Var.d0(this.f26245a);
            m80Var.j0(true);
        }
    }

    public static class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<ClearableEditText> f26247a;

        public b(ClearableEditText clearableEditText) {
            this.f26247a = new WeakReference<>(clearableEditText);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ClearableEditText clearableEditText = this.f26247a.get();
            if (clearableEditText == null) {
                return;
            }
            if (clearableEditText.j != (editable.length() > 0)) {
                clearableEditText.j = !clearableEditText.j;
                clearableEditText.refreshDrawableState();
                if (clearableEditText.l != null) {
                    clearableEditText.l.invalidateRoot();
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public ClearableEditText(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        a aVar = this.l;
        if (aVar != null && this.j && aVar.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // miuix.androidbasewidget.widget.EditText, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return k(motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.h != null) {
            int[] drawableState = getDrawableState();
            Drawable drawable = this.h;
            if (drawable != null && drawable.isStateful() && this.h.setState(drawableState)) {
                invalidateDrawable(this.h);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final boolean k(MotionEvent motionEvent) {
        if (this.j) {
            Drawable drawable = this.h;
            int intrinsicWidth = drawable == null ? 0 : drawable.getIntrinsicWidth();
            if (eyq.b(this)) {
                if (motionEvent.getX() < intrinsicWidth + getPaddingLeft()) {
                    return m(motionEvent);
                }
            } else if (motionEvent.getX() > (getWidth() - getPaddingRight()) - intrinsicWidth) {
                return m(motionEvent);
            }
        }
        this.i = false;
        return false;
    }

    public boolean l(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final boolean m(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && this.i) {
                    this.i = false;
                }
            } else if (isEnabled() && this.i) {
                n();
                if (l(getContext())) {
                    sendAccessibilityEvent(32768);
                }
                this.i = false;
                return true;
            }
        } else if (isEnabled() && this.j) {
            this.i = true;
        }
        return this.i;
    }

    public final void n() {
        setText("");
        HapticCompat.e(this, alb.A, alb.g);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeTextChangedListener(this.f26244k);
        addTextChangedListener(this.f26244k);
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (!this.j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, m);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeTextChangedListener(this.f26244k);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.EditText.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        Editable text = getText();
        if (text != null) {
            if (this.j != (text.length() > 0)) {
                this.j = !this.j;
                refreshDrawableState();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            throw new IllegalStateException("ClearableEditText can only set drawables by setCompoundDrawablesRelative()");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.h = drawable3;
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.h;
    }

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, yhi.f40187b);
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26244k = new b(this);
        this.h = getCompoundDrawablesRelative()[2];
        int i2 = Build.VERSION.SDK_INT;
        a aVar = new a(this);
        this.l = aVar;
        c.r0(this, aVar);
        if (i2 >= 29) {
            setForceDarkAllowed(false);
        }
        Editable text = getText();
        if (text != null) {
            if (this.j != (text.length() > 0)) {
                this.j = !this.j;
                refreshDrawableState();
            }
        }
        addTextChangedListener(this.f26244k);
    }
}
