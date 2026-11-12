package com.huawei.uikit.hwbottomsheet.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.huawei.uikit.hwbottomsheet.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class HwDragImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwBottomSheet f29284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29285c;
    private String d;
    private String e;
    private Drawable f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private float k;
    private Interpolator l;
    private float m;
    private boolean n;
    private Drawable o;
    private float p;
    private float q;
    private float s;
    private float t;

    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            HwDragImageView.this.d();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HwDragImageView.this.k = 0.0f;
            HwDragImageView.this.m = 0.0f;
            HwDragImageView.this.d();
            HwDragImageView.this.invalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null && (valueAnimator.getAnimatedValue() instanceof Float)) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                HwDragImageView.d(HwDragImageView.this, fFloatValue);
                HwDragImageView.e(HwDragImageView.this, fFloatValue);
                HwDragImageView.this.invalidate();
            }
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f29288b;

        static {
            int[] iArr = new int[HwBottomSheet.SheetState.values().length];
            f29288b = iArr;
            try {
                iArr[HwBottomSheet.SheetState.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29288b[HwBottomSheet.SheetState.ANCHORED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29288b[HwBottomSheet.SheetState.EXPANDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HwDragImageView(Context context) {
        super(context);
        this.f29285c = "";
        this.d = "";
        this.f29283a = "";
        this.e = "";
        this.n = false;
        a(context);
    }

    static /* synthetic */ float d(HwDragImageView hwDragImageView, float f) {
        float f2 = hwDragImageView.k * f;
        hwDragImageView.k = f2;
        return f2;
    }

    static /* synthetic */ float e(HwDragImageView hwDragImageView, float f) {
        float f2 = hwDragImageView.m * f;
        hwDragImageView.m = f2;
        return f2;
    }

    void b() {
        this.n = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        HwBottomSheet hwBottomSheet = this.f29284b;
        if (hwBottomSheet == null || hwBottomSheet.g()) {
            super.draw(canvas);
        } else {
            canvas.translate(this.k, this.m);
            super.draw(canvas);
        }
    }

    void e() {
        HwBottomSheet hwBottomSheet = this.f29284b;
        if (hwBottomSheet == null || hwBottomSheet.g()) {
            return;
        }
        if (Float.compare(this.k, 0.0f) == 0 && Float.compare(this.m, 0.0f) == 0) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(this.l);
        valueAnimatorOfFloat.addListener(new a());
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "";
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            this.s = motionEvent.getRawX();
            this.p = motionEvent.getRawY();
            return zOnHoverEvent;
        }
        if (action != 10) {
            return zOnHoverEvent;
        }
        this.s = -1.0f;
        this.p = -1.0f;
        return zOnHoverEvent;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null || this.f29284b == null) {
            return;
        }
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        String str = this.f29285c;
        if (str == null) {
            return;
        }
        int i = e.f29288b[this.f29284b.getSheetState().ordinal()];
        if (i == 1) {
            str = String.format(Locale.ENGLISH, this.f29285c, this.d);
        } else if (i == 2) {
            str = String.format(Locale.ENGLISH, this.f29285c, this.f29283a);
        } else if (i == 3) {
            str = String.format(Locale.ENGLISH, this.f29285c, this.e);
        }
        if (str == null) {
            return;
        }
        setContentDescription(str);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        HwBottomSheet hwBottomSheet;
        if (motionEvent == null) {
            return false;
        }
        HwBottomSheet hwBottomSheet2 = this.f29284b;
        if (hwBottomSheet2 == null || hwBottomSheet2.g()) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                f();
            } else if (actionMasked == 3 && (hwBottomSheet = this.f29284b) != null && hwBottomSheet.getViewDragHelper() != null && this.f29284b.getViewDragHelper().g() != 1) {
                f();
            }
        } else if (!this.f29284b.f()) {
            c();
        }
        return super.onTouchEvent(motionEvent);
    }

    private void a(Context context) {
        e(context);
        b(context);
        this.t = context.getResources().getDisplayMetrics().density * 12.0f;
        this.q = context.getResources().getDisplayMetrics().density * 5.0f;
    }

    void b(HwBottomSheet hwBottomSheet) {
        this.f29284b = hwBottomSheet;
    }

    void d() {
        if (Float.compare(this.s, 0.0f) <= 0 || Float.compare(this.p, 0.0f) <= 0 || !isHovered()) {
            return;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        if (Float.compare(this.s, iArr[0]) < 0 || Float.compare(this.s, iArr[0] + getWidth()) > 0) {
            setHovered(false);
        } else if (Float.compare(this.p, iArr[1]) < 0 || Float.compare(this.p, iArr[1] + getHeight()) > 0) {
            setHovered(false);
        }
    }

    private void e(Context context) {
        this.f29285c = context.getString(R.string.indicate_button);
        this.f29283a = context.getString(R.string.indicate_anchored);
        this.d = context.getString(R.string.indicate_collapsed);
        this.e = context.getString(R.string.indicate_expanded);
    }

    private void b(Context context) {
        this.f = context.getDrawable(R.drawable.hwbottomsheet_indicate_middle_scale_big);
        this.g = context.getDrawable(R.drawable.hwbottomsheet_indicate_middle_scale_normal);
        this.j = context.getDrawable(R.drawable.hwbottomsheet_indicate_down_scale_big);
        this.h = context.getDrawable(R.drawable.hwbottomsheet_indicate_down_scale_normal);
        this.i = context.getDrawable(R.drawable.hwbottomsheet_indicate_up_scale_big);
        this.o = context.getDrawable(R.drawable.hwbottomsheet_indicate_up_scale_normal);
        this.l = AnimationUtils.loadInterpolator(context, R.interpolator.cubic_bezier_interpolator_type_33_33);
    }

    private void f() {
        if (this.n) {
            a(d(false), false);
            e();
            this.n = false;
        }
    }

    private Drawable d(boolean z) {
        HwBottomSheet hwBottomSheet = this.f29284b;
        if (hwBottomSheet == null || hwBottomSheet.g()) {
            return null;
        }
        int i = e.f29288b[this.f29284b.getSheetState().ordinal()];
        if (i == 1) {
            return z ? this.i : this.o;
        }
        if (i == 2) {
            return z ? this.f : this.g;
        }
        if (i != 3) {
            return null;
        }
        return z ? this.j : this.h;
    }

    private void c() {
        a(d(true), true);
        this.k = 0.0f;
        this.m = 0.0f;
    }

    Drawable d(HwBottomSheet.SheetState sheetState) {
        HwBottomSheet hwBottomSheet;
        if (sheetState == null || (hwBottomSheet = this.f29284b) == null || hwBottomSheet.g()) {
            return null;
        }
        int i = e.f29288b[sheetState.ordinal()];
        if (i == 1) {
            return this.o;
        }
        if (i == 2) {
            return this.g;
        }
        if (i != 3) {
            return null;
        }
        return this.h;
    }

    void a(Drawable drawable, boolean z) {
        HwBottomSheet hwBottomSheet = this.f29284b;
        if (hwBottomSheet == null || hwBottomSheet.g() || drawable == null || !(drawable instanceof AnimatedVectorDrawable)) {
            return;
        }
        setImageDrawable(drawable);
        ((AnimatedVectorDrawable) drawable).start();
        if (z) {
            this.n = true;
        }
    }

    public HwDragImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29285c = "";
        this.d = "";
        this.f29283a = "";
        this.e = "";
        this.n = false;
        a(context);
    }

    boolean a() {
        return this.n;
    }

    void d(float f, float f2) {
        float f3;
        float f4;
        HwBottomSheet hwBottomSheet = this.f29284b;
        if (hwBottomSheet == null || hwBottomSheet.g() || !this.n) {
            return;
        }
        float f5 = this.k + (f * 0.1f);
        this.k = f5;
        this.m += f2 * 0.04f;
        if (Math.abs(f5) > this.t) {
            f3 = Float.compare(this.k, 0.0f) >= 0 ? this.t : -this.t;
        } else {
            f3 = this.k;
        }
        this.k = f3;
        if (Math.abs(this.m) > this.q) {
            f4 = Float.compare(this.m, 0.0f) >= 0 ? this.q : -this.q;
        } else {
            f4 = this.m;
        }
        this.m = f4;
        invalidate();
    }

    public HwDragImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29285c = "";
        this.d = "";
        this.f29283a = "";
        this.e = "";
        this.n = false;
        a(context);
    }
}
