package miuix.slidingwidget.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.Switch;
import defpackage.d2j;
import defpackage.d2n;
import defpackage.f3j;
import defpackage.gii;
import defpackage.o5j;

/* JADX INFO: loaded from: classes3.dex */
public class SlidingSwitch extends Switch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d2n f26875a;

    public SlidingSwitch(Context context) {
        this(context, null);
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d2n d2nVar = this.f26875a;
        if (d2nVar != null) {
            d2nVar.P();
        }
    }

    @Override // android.view.View
    public float getAlpha() {
        d2n d2nVar = this.f26875a;
        return d2nVar != null ? d2nVar.o() : super.getAlpha();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        d2n d2nVar = this.f26875a;
        if (d2nVar != null) {
            d2nVar.w();
        }
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        d2n d2nVar = this.f26875a;
        if (d2nVar == null) {
            super.onDraw(canvas);
        } else {
            d2nVar.A(canvas);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        d2n d2nVar = this.f26875a;
        if (d2nVar != null) {
            d2nVar.C(motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setClassName(Switch.class.getName());
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityNodeInfo.setStateDescription(isChecked() ? getContext().getResources().getString(d2j.f14999b) : getContext().getResources().getString(d2j.f14998a));
        }
    }

    @Override // android.widget.Switch, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f26875a.q(), this.f26875a.p());
        this.f26875a.O();
    }

    @Override // android.view.View
    public boolean onSetAlpha(int i) {
        return true;
    }

    @Override // android.widget.Switch, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        d2n d2nVar = this.f26875a;
        if (d2nVar == null) {
            return true;
        }
        d2nVar.E(motionEvent);
        return true;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        super.performClick();
        d2n d2nVar = this.f26875a;
        if (d2nVar == null) {
            return true;
        }
        d2nVar.z();
        return true;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        d2n d2nVar = this.f26875a;
        if (d2nVar != null) {
            d2nVar.K(f);
        }
        invalidate();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
            boolean zIsChecked = isChecked();
            d2n d2nVar = this.f26875a;
            if (d2nVar != null) {
                d2nVar.L(zIsChecked);
            }
        }
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
        super.setLayerType(i, paint);
        d2n d2nVar = this.f26875a;
        if (d2nVar != null) {
            d2nVar.N(i);
        }
    }

    public void setOnPerformCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        d2n d2nVar = this.f26875a;
        if (d2nVar != null) {
            d2nVar.setOnPerformCheckedChangeListener(onCheckedChangeListener);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        invalidate();
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        d2n d2nVar;
        return super.verifyDrawable(drawable) || ((d2nVar = this.f26875a) != null && d2nVar.S(drawable));
    }

    public SlidingSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gii.f19034a);
    }

    public SlidingSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d2n d2nVar = new d2n(this);
        this.f26875a = d2nVar;
        d2nVar.t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o5j.W, i, f3j.f17365a);
        this.f26875a.v(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
