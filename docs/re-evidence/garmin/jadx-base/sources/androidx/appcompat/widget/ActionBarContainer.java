package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p0 f4848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f4849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f4850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f4851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f4852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f4853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4856j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f80421a);
        boolean z14 = false;
        this.f4851e = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f4852f = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f4856j = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f4854h = true;
            this.f4853g = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f4854h ? !(this.f4851e != null || this.f4852f != null) : this.f4853g == null) {
            z14 = true;
        }
        setWillNotDraw(z14);
    }

    public static int a(View view2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
        return view2.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4851e;
        if (drawable != null && drawable.isStateful()) {
            this.f4851e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4852f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4852f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4853g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4853g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f4848b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4851e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4852f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4853g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4849c = findViewById(R.id.action_bar);
        this.f4850d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4847a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        Drawable drawable;
        super.onLayout(z14, i14, i15, i16, i17);
        p0 p0Var = this.f4848b;
        boolean z15 = true;
        boolean z16 = false;
        boolean z17 = (p0Var == null || p0Var.getVisibility() == 8) ? false : true;
        if (p0Var != null && p0Var.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p0Var.getLayoutParams();
            int measuredHeight2 = measuredHeight - p0Var.getMeasuredHeight();
            int i18 = layoutParams.bottomMargin;
            p0Var.layout(i14, measuredHeight2 - i18, i16, measuredHeight - i18);
        }
        if (this.f4854h) {
            Drawable drawable2 = this.f4853g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z15 = z16;
            }
        } else {
            if (this.f4851e != null) {
                if (this.f4849c.getVisibility() == 0) {
                    this.f4851e.setBounds(this.f4849c.getLeft(), this.f4849c.getTop(), this.f4849c.getRight(), this.f4849c.getBottom());
                } else {
                    View view2 = this.f4850d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f4851e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f4851e.setBounds(this.f4850d.getLeft(), this.f4850d.getTop(), this.f4850d.getRight(), this.f4850d.getBottom());
                    }
                }
                z16 = true;
            }
            this.f4855i = z17;
            if (!z17 || (drawable = this.f4852f) == null) {
                z15 = z16;
            } else {
                drawable.setBounds(p0Var.getLeft(), p0Var.getTop(), p0Var.getRight(), p0Var.getBottom());
            }
        }
        if (z15) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i14, int i15) {
        int iA;
        int i16;
        if (this.f4849c == null && View.MeasureSpec.getMode(i15) == Integer.MIN_VALUE && (i16 = this.f4856j) >= 0) {
            i15 = View.MeasureSpec.makeMeasureSpec(Math.min(i16, View.MeasureSpec.getSize(i15)), Integer.MIN_VALUE);
        }
        super.onMeasure(i14, i15);
        if (this.f4849c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i15);
        p0 p0Var = this.f4848b;
        if (p0Var == null || p0Var.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view2 = this.f4849c;
        if (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) {
            View view3 = this.f4850d;
            iA = (view3 == null || view3.getVisibility() == 8 || view3.getMeasuredHeight() == 0) ? 0 : a(this.f4850d);
        } else {
            iA = a(this.f4849c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f4848b) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i15) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4851e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4851e);
        }
        this.f4851e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view2 = this.f4849c;
            if (view2 != null) {
                this.f4851e.setBounds(view2.getLeft(), this.f4849c.getTop(), this.f4849c.getRight(), this.f4849c.getBottom());
            }
        }
        boolean z14 = false;
        if (!this.f4854h ? !(this.f4851e != null || this.f4852f != null) : this.f4853g == null) {
            z14 = true;
        }
        setWillNotDraw(z14);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4853g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4853g);
        }
        this.f4853g = drawable;
        boolean z14 = this.f4854h;
        boolean z15 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z14 && (drawable2 = this.f4853g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z14 ? !(this.f4851e != null || this.f4852f != null) : this.f4853g == null) {
            z15 = true;
        }
        setWillNotDraw(z15);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4852f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4852f);
        }
        this.f4852f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4855i && (drawable2 = this.f4852f) != null) {
                drawable2.setBounds(this.f4848b.getLeft(), this.f4848b.getTop(), this.f4848b.getRight(), this.f4848b.getBottom());
            }
        }
        boolean z14 = false;
        if (!this.f4854h ? !(this.f4851e != null || this.f4852f != null) : this.f4853g == null) {
            z14 = true;
        }
        setWillNotDraw(z14);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(p0 p0Var) {
        p0 p0Var2 = this.f4848b;
        if (p0Var2 != null) {
            removeView(p0Var2);
        }
        this.f4848b = p0Var;
        if (p0Var != null) {
            addView(p0Var);
            ViewGroup.LayoutParams layoutParams = p0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            p0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z14) {
        this.f4847a = z14;
        setDescendantFocusability(z14 ? 393216 : GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
    }

    @Override // android.view.View
    public void setVisibility(int i14) {
        super.setVisibility(i14);
        boolean z14 = i14 == 0;
        Drawable drawable = this.f4851e;
        if (drawable != null) {
            drawable.setVisible(z14, false);
        }
        Drawable drawable2 = this.f4852f;
        if (drawable2 != null) {
            drawable2.setVisible(z14, false);
        }
        Drawable drawable3 = this.f4853g;
        if (drawable3 != null) {
            drawable3.setVisible(z14, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view2, ActionMode.Callback callback, int i14) {
        if (i14 != 0) {
            return super.startActionModeForChild(view2, callback, i14);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4851e;
        boolean z14 = this.f4854h;
        if (drawable == drawable2 && !z14) {
            return true;
        }
        if (drawable == this.f4852f && this.f4855i) {
            return true;
        }
        return (drawable == this.f4853g && z14) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view2, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
