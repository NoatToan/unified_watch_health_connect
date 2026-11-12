package androidx.media3.ui;

import am.j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import fa.z;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import k32.n;
import kc.h;

/* JADX INFO: loaded from: classes.dex */
public class b extends View implements e {
    public static final /* synthetic */ int O0 = 0;
    public final Point A;
    public final float B;
    public int C;
    public long D;
    public int E;
    public Rect F;
    public long H0;
    public final ValueAnimator I;
    public long I0;
    public long J0;
    public long K0;
    public int L0;
    public long[] M0;
    public boolean[] N0;
    public float P;
    public boolean T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f10011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f10012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f10013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f10014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f10015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f10016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f10017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f10018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f10019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f10020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Drawable f10021k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f10022k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10029r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10030t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10031v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final StringBuilder f10032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Formatter f10033x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n f10034y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CopyOnWriteArraySet<e.a> f10035z;

    public b(Context context, AttributeSet attributeSet, int i14, AttributeSet attributeSet2, int i15) {
        super(context, attributeSet, i14);
        this.f10011a = new Rect();
        this.f10012b = new Rect();
        this.f10013c = new Rect();
        this.f10014d = new Rect();
        Paint paint = new Paint();
        this.f10015e = paint;
        Paint paint2 = new Paint();
        this.f10016f = paint2;
        Paint paint3 = new Paint();
        this.f10017g = paint3;
        Paint paint4 = new Paint();
        this.f10018h = paint4;
        Paint paint5 = new Paint();
        this.f10019i = paint5;
        Paint paint6 = new Paint();
        this.f10020j = paint6;
        paint6.setAntiAlias(true);
        this.f10035z = new CopyOnWriteArraySet<>();
        this.A = new Point();
        float f14 = context.getResources().getDisplayMetrics().density;
        this.B = f14;
        this.f10031v = b(f14, -50);
        int iB = b(f14, 4);
        int iB2 = b(f14, 26);
        int iB3 = b(f14, 4);
        int iB4 = b(f14, 12);
        int iB5 = b(f14, 0);
        int iB6 = b(f14, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, h.f103893b, i14, i15);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f10021k = drawable;
                if (drawable != null) {
                    int i16 = z.f70071a;
                    if (i16 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i16 < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    iB2 = Math.max(drawable.getMinimumHeight(), iB2);
                }
                this.f10023l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iB);
                this.f10024m = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iB2);
                this.f10025n = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f10026o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iB3);
                this.f10027p = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iB4);
                this.f10028q = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iB5);
                this.f10029r = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iB6);
                int i17 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i18 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i19 = typedArrayObtainStyledAttributes.getInt(4, DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
                int i24 = typedArrayObtainStyledAttributes.getInt(13, DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
                int i25 = typedArrayObtainStyledAttributes.getInt(0, DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
                int i26 = typedArrayObtainStyledAttributes.getInt(5, DefaultTimeBar.DEFAULT_PLAYED_AD_MARKER_COLOR);
                paint.setColor(i17);
                paint6.setColor(i18);
                paint2.setColor(i19);
                paint3.setColor(i24);
                paint4.setColor(i25);
                paint5.setColor(i26);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        } else {
            this.f10023l = iB;
            this.f10024m = iB2;
            this.f10025n = 0;
            this.f10026o = iB3;
            this.f10027p = iB4;
            this.f10028q = iB5;
            this.f10029r = iB6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
            paint3.setColor(DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
            paint4.setColor(DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
            paint5.setColor(DefaultTimeBar.DEFAULT_PLAYED_AD_MARKER_COLOR);
            this.f10021k = null;
        }
        StringBuilder sb3 = new StringBuilder();
        this.f10032w = sb3;
        this.f10033x = new Formatter(sb3, Locale.getDefault());
        this.f10034y = new n(this, 2);
        Drawable drawable2 = this.f10021k;
        if (drawable2 != null) {
            this.f10030t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f10030t = (Math.max(this.f10028q, Math.max(this.f10027p, this.f10029r)) + 1) / 2;
        }
        this.P = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.I = valueAnimator;
        valueAnimator.addUpdateListener(new com.google.android.material.motion.a(this, 5));
        this.I0 = C.TIME_UNSET;
        this.D = C.TIME_UNSET;
        this.C = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int b(float f14, int i14) {
        return (int) ((i14 * f14) + 0.5f);
    }

    private long getPositionIncrement() {
        long j8 = this.D;
        if (j8 != C.TIME_UNSET) {
            return j8;
        }
        long j14 = this.I0;
        if (j14 == C.TIME_UNSET) {
            return 0L;
        }
        return j14 / ((long) this.C);
    }

    private String getProgressText() {
        return z.A(this.f10032w, this.f10033x, this.J0);
    }

    private long getScrubberPosition() {
        Rect rect = this.f10012b;
        if (rect.width() <= 0 || this.I0 == C.TIME_UNSET) {
            return 0L;
        }
        return (((long) this.f10014d.width()) * this.I0) / ((long) rect.width());
    }

    @Override // androidx.media3.ui.e
    public final void a(c.ViewOnClickListenerC0133c viewOnClickListenerC0133c) {
        this.f10035z.add(viewOnClickListenerC0133c);
    }

    public final boolean c(long j8) {
        long j14 = this.I0;
        if (j14 <= 0) {
            return false;
        }
        long j15 = this.f10022k0 ? this.H0 : this.J0;
        long j16 = z.j(j15 + j8, 0L, j14);
        if (j16 == j15) {
            return false;
        }
        if (this.f10022k0) {
            g(j16);
        } else {
            d(j16);
        }
        f();
        return true;
    }

    public final void d(long j8) {
        this.H0 = j8;
        this.f10022k0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<e.a> it = this.f10035z.iterator();
        while (it.hasNext()) {
            it.next().c(j8);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10021k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e(boolean z14) {
        removeCallbacks(this.f10034y);
        this.f10022k0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<e.a> it = this.f10035z.iterator();
        while (it.hasNext()) {
            it.next().b(this.H0, z14);
        }
    }

    public final void f() {
        Rect rect = this.f10013c;
        Rect rect2 = this.f10012b;
        rect.set(rect2);
        Rect rect3 = this.f10014d;
        rect3.set(rect2);
        long j8 = this.f10022k0 ? this.H0 : this.J0;
        if (this.I0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.K0) / this.I0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j8) / this.I0)), rect2.right);
        } else {
            int i14 = rect2.left;
            rect.right = i14;
            rect3.right = i14;
        }
        invalidate(this.f10011a);
    }

    public final void g(long j8) {
        if (this.H0 == j8) {
            return;
        }
        this.H0 = j8;
        Iterator<e.a> it = this.f10035z.iterator();
        while (it.hasNext()) {
            it.next().a(j8);
        }
    }

    @Override // androidx.media3.ui.e
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f10012b.width() / this.B);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j8 = this.I0;
        if (j8 == 0 || j8 == C.TIME_UNSET) {
            return Long.MAX_VALUE;
        }
        return j8 / ((long) iWidth);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10021k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i14;
        canvas.save();
        Rect rect = this.f10012b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i15 = iCenterY + iHeight;
        long j8 = this.I0;
        Paint paint = this.f10017g;
        Rect rect2 = this.f10014d;
        if (j8 <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i15, paint);
        } else {
            Rect rect3 = this.f10013c;
            int i16 = rect3.left;
            int i17 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i17), rect2.right);
            int i18 = rect.right;
            if (iMax < i18) {
                canvas.drawRect(iMax, iCenterY, i18, i15, paint);
            }
            int iMax2 = Math.max(i16, rect2.right);
            if (i17 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i17, i15, this.f10016f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i15, this.f10015e);
            }
            if (this.L0 != 0) {
                long[] jArr = this.M0;
                jArr.getClass();
                boolean[] zArr = this.N0;
                zArr.getClass();
                int i19 = this.f10026o;
                int i24 = i19 / 2;
                int i25 = 0;
                int i26 = 0;
                while (i26 < this.L0) {
                    int iMin = Math.min(rect.width() - i19, Math.max(i25, ((int) ((((long) rect.width()) * z.j(jArr[i26], 0L, this.I0)) / this.I0)) - i24)) + rect.left;
                    int i27 = i26;
                    canvas.drawRect(iMin, iCenterY, iMin + i19, i15, zArr[i26] ? this.f10019i : this.f10018h);
                    i26 = i27 + 1;
                    i25 = i25;
                }
            }
            canvas2 = canvas;
        }
        if (this.I0 > 0) {
            int i28 = z.i(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f10021k;
            if (drawable == null) {
                if (this.f10022k0 || isFocused()) {
                    i14 = this.f10029r;
                } else {
                    i14 = isEnabled() ? this.f10027p : this.f10028q;
                }
                canvas2.drawCircle(i28, iCenterY2, (int) ((i14 * this.P) / 2.0f), this.f10020j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.P)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.P)) / 2;
                drawable.setBounds(i28 - intrinsicWidth, iCenterY2 - intrinsicHeight, i28 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z14, int i14, Rect rect) {
        super.onFocusChanged(z14, i14, rect);
        if (!this.f10022k0 || z14) {
            return;
        }
        e(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.I0 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i14, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i14 != 66) {
                switch (i14) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (c(positionIncrement)) {
                            n nVar = this.f10034y;
                            removeCallbacks(nVar);
                            postDelayed(nVar, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (c(positionIncrement)) {
                            n nVar2 = this.f10034y;
                            removeCallbacks(nVar2);
                            postDelayed(nVar2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f10022k0) {
                            e(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f10022k0) {
                e(false);
                return true;
            }
        }
        return super.onKeyDown(i14, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i18 - getPaddingRight();
        int i24 = this.T ? 0 : this.f10030t;
        int i25 = this.f10025n;
        int i26 = this.f10023l;
        int i27 = this.f10024m;
        if (i25 == 1) {
            paddingBottom = (i19 - getPaddingBottom()) - i27;
            paddingBottom2 = ((i19 - getPaddingBottom()) - i26) - Math.max(i24 - (i26 / 2), 0);
        } else {
            paddingBottom = (i19 - i27) / 2;
            paddingBottom2 = (i19 - i26) / 2;
        }
        Rect rect2 = this.f10011a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i27 + paddingBottom);
        this.f10012b.set(rect2.left + i24, paddingBottom2, rect2.right - i24, i26 + paddingBottom2);
        if (z.f70071a >= 29 && ((rect = this.F) == null || rect.width() != i18 || this.F.height() != i19)) {
            Rect rect3 = new Rect(0, 0, i18, i19);
            this.F = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        f();
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        int mode = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i15);
        int i16 = this.f10024m;
        if (mode == 0) {
            size = i16;
        } else if (mode != 1073741824) {
            size = Math.min(i16, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i14), size);
        Drawable drawable = this.f10021k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i14) {
        Drawable drawable = this.f10021k;
        if (drawable == null || z.f70071a < 23 || !drawable.setLayoutDirection(i14)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.I0 > 0) {
            int x14 = (int) motionEvent.getX();
            int y14 = (int) motionEvent.getY();
            Point point = this.A;
            point.set(x14, y14);
            int i14 = point.x;
            int i15 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f10012b;
            Rect rect2 = this.f10014d;
            if (action == 0) {
                int i16 = i14;
                if (this.f10011a.contains(i16, i15)) {
                    rect2.right = z.i(i16, rect.left, rect.right);
                    d(getScrubberPosition());
                    f();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f10022k0) {
                    e(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f10022k0) {
                        e(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f10022k0) {
                if (i15 < this.f10031v) {
                    int i17 = this.E;
                    rect2.right = z.i(j.a(i14, i17, 3, i17), rect.left, rect.right);
                } else {
                    this.E = i14;
                    rect2.right = z.i(i14, rect.left, rect.right);
                }
                g(getScrubberPosition());
                f();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i14, Bundle bundle) {
        if (super.performAccessibilityAction(i14, bundle)) {
            return true;
        }
        if (this.I0 <= 0) {
            return false;
        }
        if (i14 == 8192) {
            if (c(-getPositionIncrement())) {
                e(false);
            }
        } else {
            if (i14 != 4096) {
                return false;
            }
            if (c(getPositionIncrement())) {
                e(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // androidx.media3.ui.e
    public final void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i14) {
        fa.a.a(i14 == 0 || !(jArr == null || zArr == null));
        this.L0 = i14;
        this.M0 = jArr;
        this.N0 = zArr;
        f();
    }

    public void setAdMarkerColor(int i14) {
        this.f10018h.setColor(i14);
        invalidate(this.f10011a);
    }

    public void setBufferedColor(int i14) {
        this.f10016f.setColor(i14);
        invalidate(this.f10011a);
    }

    @Override // androidx.media3.ui.e
    public void setBufferedPosition(long j8) {
        if (this.K0 == j8) {
            return;
        }
        this.K0 = j8;
        f();
    }

    @Override // androidx.media3.ui.e
    public void setDuration(long j8) {
        if (this.I0 == j8) {
            return;
        }
        this.I0 = j8;
        if (this.f10022k0 && j8 == C.TIME_UNSET) {
            e(true);
        }
        f();
    }

    @Override // android.view.View, androidx.media3.ui.e
    public void setEnabled(boolean z14) {
        super.setEnabled(z14);
        if (!this.f10022k0 || z14) {
            return;
        }
        e(true);
    }

    public void setKeyCountIncrement(int i14) {
        fa.a.a(i14 > 0);
        this.C = i14;
        this.D = C.TIME_UNSET;
    }

    public void setKeyTimeIncrement(long j8) {
        fa.a.a(j8 > 0);
        this.C = -1;
        this.D = j8;
    }

    public void setPlayedAdMarkerColor(int i14) {
        this.f10019i.setColor(i14);
        invalidate(this.f10011a);
    }

    public void setPlayedColor(int i14) {
        this.f10015e.setColor(i14);
        invalidate(this.f10011a);
    }

    @Override // androidx.media3.ui.e
    public void setPosition(long j8) {
        if (this.J0 == j8) {
            return;
        }
        this.J0 = j8;
        setContentDescription(getProgressText());
        f();
    }

    public void setScrubberColor(int i14) {
        this.f10020j.setColor(i14);
        invalidate(this.f10011a);
    }

    public void setUnplayedColor(int i14) {
        this.f10017g.setColor(i14);
        invalidate(this.f10011a);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i14, AttributeSet attributeSet2) {
        this(context, attributeSet, i14, attributeSet2, 0);
    }

    public b(Context context) {
        this(context, null);
    }
}
