package miuix.androidbasewidget.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.core.view.c;
import defpackage.dyq;
import defpackage.e5j;
import defpackage.m80;
import defpackage.mj8;
import defpackage.y2j;
import defpackage.yhi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class StateEditText extends EditText {
    public static final Class<?>[] q = {Context.class, AttributeSet.class};
    public WidgetManager h;
    public String i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26260k;
    public Drawable[] l;
    public boolean m;
    public int n;
    public StaticLayout o;
    public mj8 p;

    public static abstract class WidgetManager {
        public WidgetManager(Context context, AttributeSet attributeSet) {
        }

        public abstract Drawable[] getWidgetDrawables();

        public void onAttached(StateEditText stateEditText) {
        }

        public void onDetached() {
        }

        public abstract void onPopulateNodeForVirtualView(int i, m80 m80Var);

        public abstract void onWidgetClick(int i);
    }

    public class a extends mj8 {
        public a(View view) {
            super(view);
        }

        @Override // defpackage.mj8
        public int getVirtualViewAt(float f, float f2) {
            if (StateEditText.this.l == null) {
                return Integer.MIN_VALUE;
            }
            for (int i = 0; i < StateEditText.this.l.length; i++) {
                int scrollX = StateEditText.this.getScrollX();
                Rect bounds = StateEditText.this.l[i].getBounds();
                if (new Rect(bounds.left - scrollX, bounds.top, bounds.right - scrollX, bounds.bottom).contains((int) f, (int) f2) && StateEditText.this.l[i].isVisible()) {
                    return i;
                }
            }
            return Integer.MIN_VALUE;
        }

        @Override // defpackage.mj8
        public void getVisibleVirtualViews(List<Integer> list) {
            if (StateEditText.this.l == null || StateEditText.this.o()) {
                return;
            }
            for (int i = 0; i < StateEditText.this.l.length; i++) {
                if (StateEditText.this.l[i].isVisible()) {
                    list.add(Integer.valueOf(i));
                }
            }
        }

        @Override // defpackage.mj8
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (StateEditText.this.l != null && i2 == 16) {
                for (int i3 = 0; i3 < StateEditText.this.l.length; i3++) {
                    if (i == i3) {
                        invalidateVirtualView(i);
                        float fCenterX = StateEditText.this.l[i3].getBounds().centerX() - StateEditText.this.getScrollX();
                        float fCenterY = StateEditText.this.l[i3].getBounds().centerY();
                        StateEditText.this.l(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, fCenterX, fCenterY, 0));
                        StateEditText.this.l(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, fCenterX, fCenterY, 0));
                        if (StateEditText.this.l[i3].isVisible()) {
                            sendEventForVirtualView(i3, 128);
                            return true;
                        }
                        sendEventForVirtualView(i3, 65536);
                        StateEditText.this.sendAccessibilityEvent(32768);
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // defpackage.mj8
        public void onPopulateNodeForVirtualView(int i, m80 m80Var) {
            if (StateEditText.this.l == null) {
                return;
            }
            for (int i2 = 0; i2 < StateEditText.this.l.length; i2++) {
                if (i == i2) {
                    m80Var.N0(true);
                    m80Var.b0(true);
                    m80Var.q0(true);
                    m80Var.j0(true);
                    Rect bounds = StateEditText.this.l[i2].getBounds();
                    m80Var.L0("");
                    m80Var.d0(bounds);
                    m80Var.i0(Button.class.getName());
                    m80Var.a(16);
                    StateEditText.this.h.onPopulateNodeForVirtualView(i2, m80Var);
                }
            }
        }
    }

    public StateEditText(Context context) {
        this(context, null);
    }

    private int getLabelLength() {
        int i = this.f26260k;
        return i + (i == 0 ? 0 : this.n);
    }

    private int getWidgetLength() {
        Drawable[] drawableArr = this.l;
        if (drawableArr == null) {
            return 0;
        }
        int intrinsicWidth = 0;
        for (Drawable drawable : drawableArr) {
            intrinsicWidth = intrinsicWidth + drawable.getIntrinsicWidth() + this.n;
        }
        return intrinsicWidth;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.p.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // miuix.androidbasewidget.widget.EditText, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return l(motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft() + (dyq.e(this) ? getWidgetLength() : getLabelLength());
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        return super.getCompoundPaddingRight() + (dyq.e(this) ? getLabelLength() : getWidgetLength());
    }

    public final void j() {
        String str = this.i;
        this.o = StaticLayout.Builder.obtain(str, 0, str.length(), getPaint(), this.f26260k).build();
    }

    public final WidgetManager k(Context context, String str, AttributeSet attributeSet) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(WidgetManager.class).getConstructor(q);
            constructor.setAccessible(true);
            return (WidgetManager) constructor.newInstance(context, attributeSet);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Can't find WidgetManager: " + str, e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Can't access non-public constructor " + str, e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException("Could not instantiate the WidgetManager: " + str, e3);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException("Error creating WidgetManager " + str, e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("Could not instantiate the WidgetManager: " + str, e5);
        }
    }

    public final boolean l(MotionEvent motionEvent) {
        if (this.h != null) {
            return q(motionEvent);
        }
        return false;
    }

    public final void m(Canvas canvas) {
        if (this.l == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollX = getScrollX();
        int paddingEnd = getPaddingEnd();
        Drawable drawable = getCompoundDrawablesRelative()[2];
        int i = 0;
        int intrinsicWidth = drawable == null ? 0 : drawable.getIntrinsicWidth() + this.n;
        int i2 = height / 2;
        int i3 = 0;
        while (true) {
            Drawable[] drawableArr = this.l;
            if (i >= drawableArr.length) {
                return;
            }
            int intrinsicWidth2 = drawableArr[i].getIntrinsicWidth();
            int intrinsicHeight = this.l[i].getIntrinsicHeight();
            if (dyq.e(this)) {
                int i4 = scrollX + paddingEnd + intrinsicWidth;
                int i5 = intrinsicHeight / 2;
                this.l[i].setBounds(i4 + i3, i2 - i5, i4 + intrinsicWidth2 + i3, i5 + i2);
            } else {
                int i6 = ((scrollX + width) - paddingEnd) - intrinsicWidth;
                int i7 = intrinsicHeight / 2;
                this.l[i].setBounds((i6 - intrinsicWidth2) - i3, i2 - i7, i6 - i3, i7 + i2);
            }
            i3 = this.n + intrinsicWidth2;
            this.l[i].draw(canvas);
            i++;
        }
    }

    public final void n(Canvas canvas) {
        if (TextUtils.isEmpty(this.i) || this.o == null) {
            return;
        }
        int color = getPaint().getColor();
        getPaint().setColor(getCurrentTextColor());
        int paddingStart = getPaddingStart();
        int intrinsicWidth = 0;
        Drawable drawable = getCompoundDrawablesRelative()[0];
        if (drawable != null) {
            intrinsicWidth = this.n + drawable.getIntrinsicWidth();
        }
        float fMax = Math.max(0.0f, (getMeasuredHeight() - this.o.getHeight()) / 2.0f);
        canvas.save();
        if (dyq.e(this)) {
            canvas.translate((((getScrollX() + getWidth()) - intrinsicWidth) - this.f26260k) - paddingStart, fMax);
        } else {
            canvas.translate(paddingStart + getScrollX() + intrinsicWidth, fMax);
        }
        this.o.draw(canvas);
        canvas.restore();
        getPaint().setColor(color);
    }

    public final boolean o() {
        if (Build.VERSION.SDK_INT >= 30) {
            return TextUtils.isEmpty(getContentDescription()) && TextUtils.isEmpty(getStateDescription()) && TextUtils.isEmpty(getHint()) && TextUtils.isEmpty(getText());
        }
        return TextUtils.isEmpty(getContentDescription()) && TextUtils.isEmpty(getHint()) && TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m(canvas);
        n(canvas);
    }

    @Override // miuix.androidbasewidget.widget.EditText, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(this.i) || this.o == null) {
            return;
        }
        if (this.j == 0 && this.f26260k > getMeasuredWidth() / 2) {
            this.f26260k = getMeasuredWidth() / 2;
            j();
        }
        int height = this.o.getHeight() + getPaddingTop() + getPaddingBottom();
        if (height > getMeasuredHeight()) {
            setMeasuredDimension(getMeasuredWidth(), height);
        }
    }

    public final void p(Context context, AttributeSet attributeSet, int i) {
        String string;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e5j.D0, i, y2j.e);
            string = typedArrayObtainStyledAttributes.getString(e5j.G0);
            this.i = typedArrayObtainStyledAttributes.getString(e5j.E0);
            this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(e5j.F0, 0);
            this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(e5j.H0, 0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            string = null;
        }
        setWidgetManager(k(context, string, attributeSet));
        this.l = null;
        WidgetManager widgetManager = this.h;
        if (widgetManager != null) {
            this.l = widgetManager.getWidgetDrawables();
        }
        setLabel(this.i);
        if (!TextUtils.isEmpty(this.i)) {
            setTextAlignment(6);
        }
        c.r0(this, this.p);
    }

    public final boolean q(MotionEvent motionEvent) {
        if (this.l != null) {
            int scrollX = getScrollX();
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.l;
                if (i >= drawableArr.length) {
                    break;
                }
                Rect bounds = drawableArr[i].getBounds();
                if (motionEvent.getX() < bounds.right - scrollX && motionEvent.getX() > bounds.left - scrollX) {
                    return r(motionEvent, i);
                }
                i++;
            }
        }
        this.m = false;
        return false;
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        WidgetManager widgetManager;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.m = true;
        } else if (action != 1) {
            if (action == 3 && this.m) {
                this.m = false;
            }
        } else if (this.m && (widgetManager = this.h) != null) {
            widgetManager.onWidgetClick(i);
            this.m = false;
            return true;
        }
        return this.m;
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        Typeface typeface = getTypeface();
        super.setInputType(i);
        setTypeface(typeface);
    }

    public void setLabel(String str) {
        this.i = str;
        if (Build.VERSION.SDK_INT >= 30) {
            setStateDescription(str);
        } else {
            setContentDescription(this.i + ((Object) getText()));
        }
        if (this.j > 0) {
            this.f26260k = TextUtils.isEmpty(this.i) ? 0 : Math.min((int) getPaint().measureText(this.i), this.j);
        } else {
            this.f26260k = TextUtils.isEmpty(this.i) ? 0 : (int) getPaint().measureText(this.i);
        }
        if (!TextUtils.isEmpty(this.i)) {
            j();
        }
        invalidate();
    }

    public void setWidgetManager(WidgetManager widgetManager) {
        WidgetManager widgetManager2 = this.h;
        if (widgetManager2 != null) {
            widgetManager2.onDetached();
            this.l = null;
        }
        this.h = widgetManager;
        if (widgetManager != null) {
            this.l = widgetManager.getWidgetDrawables();
            this.h.onAttached(this);
        }
    }

    public StateEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, yhi.c);
    }

    public StateEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = null;
        this.p = new a(this);
        p(context, attributeSet, i);
    }
}
