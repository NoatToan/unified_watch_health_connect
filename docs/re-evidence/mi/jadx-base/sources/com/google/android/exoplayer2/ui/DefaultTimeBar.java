package com.google.android.exoplayer2.ui;

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
import androidx.annotation.RequiresApi;
import defpackage.rk1;
import defpackage.wlq;
import defpackage.z3j;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultTimeBar extends View implements b {
    public int A;
    public long B;
    public int C;
    public Rect D;
    public ValueAnimator E;
    public float F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long[] N;
    public boolean[] O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f8335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f8336b;
    public final Rect c;
    public final Rect d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Drawable f8337k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8338r;
    public final int s;
    public final int t;
    public final StringBuilder u;
    public final Formatter v;
    public final Runnable w;
    public final CopyOnWriteArraySet<b.a> x;
    public final Point y;
    public final float z;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    public static int d(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.B;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.J;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.A);
    }

    private String getProgressText() {
        return wlq.c0(this.u, this.v, this.K);
    }

    private long getScrubberPosition() {
        if (this.f8336b.width() <= 0 || this.J == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.d.width()) * this.J) / ((long) this.f8336b.width());
    }

    public static int m(float f, int i) {
        return (int) (i / f);
    }

    public static boolean q(Drawable drawable, int i) {
        return wlq.f38110a >= 23 && drawable.setLayoutDirection(i);
    }

    @Override // com.google.android.exoplayer2.ui.b
    public void a(long[] jArr, boolean[] zArr, int i) {
        rk1.a(i == 0 || !(jArr == null || zArr == null));
        this.M = i;
        this.N = jArr;
        this.O = zArr;
        w();
    }

    @Override // com.google.android.exoplayer2.ui.b
    public void addListener(b.a aVar) {
        rk1.e(aVar);
        this.x.add(aVar);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x();
    }

    public final void e(Canvas canvas) {
        int i;
        if (this.J <= 0) {
            return;
        }
        Rect rect = this.d;
        int iR = wlq.r(rect.right, rect.left, this.f8336b.right);
        int iCenterY = this.d.centerY();
        Drawable drawable = this.f8337k;
        if (drawable == null) {
            if (this.H || isFocused()) {
                i = this.f8338r;
            } else {
                i = isEnabled() ? this.p : this.q;
            }
            canvas.drawCircle(iR, iCenterY, (int) ((i * this.F) / 2.0f), this.j);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
        int intrinsicHeight = ((int) (this.f8337k.getIntrinsicHeight() * this.F)) / 2;
        this.f8337k.setBounds(iR - intrinsicWidth, iCenterY - intrinsicHeight, iR + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f8337k.draw(canvas);
    }

    public final void f(Canvas canvas) {
        int iHeight = this.f8336b.height();
        int iCenterY = this.f8336b.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.J <= 0) {
            Rect rect = this.f8336b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i, this.g);
            return;
        }
        Rect rect2 = this.c;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int iMax = Math.max(Math.max(this.f8336b.left, i3), this.d.right);
        int i4 = this.f8336b.right;
        if (iMax < i4) {
            canvas.drawRect(iMax, iCenterY, i4, i, this.g);
        }
        int iMax2 = Math.max(i2, this.d.right);
        if (i3 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i3, i, this.f);
        }
        if (this.d.width() > 0) {
            Rect rect3 = this.d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i, this.e);
        }
        if (this.M == 0) {
            return;
        }
        long[] jArr = (long[]) rk1.e(this.N);
        boolean[] zArr = (boolean[]) rk1.e(this.O);
        int i5 = this.o / 2;
        for (int i6 = 0; i6 < this.M; i6++) {
            int iWidth = ((int) ((((long) this.f8336b.width()) * wlq.s(jArr[i6], 0L, this.J)) / this.J)) - i5;
            Rect rect4 = this.f8336b;
            int iMin = rect4.left + Math.min(rect4.width() - this.o, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.o, i, zArr[i6] ? this.i : this.h);
        }
    }

    public void g(long j) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.E.setFloatValues(this.F, 0.0f);
        this.E.setDuration(j);
        this.E.start();
    }

    @Override // com.google.android.exoplayer2.ui.b
    public long getPreferredUpdateDelay() {
        int iM = m(this.z, this.f8336b.width());
        if (iM != 0) {
            long j = this.J;
            if (j != 0 && j != -9223372036854775807L) {
                return j / ((long) iM);
            }
        }
        return Long.MAX_VALUE;
    }

    public void h(boolean z) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = z;
        this.F = 0.0f;
        invalidate(this.f8335a);
    }

    public final boolean i(float f, float f2) {
        return this.f8335a.contains((int) f, (int) f2);
    }

    public final /* synthetic */ void j() {
        v(false);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8337k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final /* synthetic */ void k(ValueAnimator valueAnimator) {
        this.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f8335a);
    }

    public final void l(float f) {
        Rect rect = this.d;
        Rect rect2 = this.f8336b;
        rect.right = wlq.r((int) f, rect2.left, rect2.right);
    }

    public final Point n(MotionEvent motionEvent) {
        this.y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.y;
    }

    public final boolean o(long j) {
        long j2 = this.J;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.H ? this.I : this.K;
        long jS = wlq.s(j3 + j, 0L, j2);
        if (jS == j3) {
            return false;
        }
        if (this.H) {
            y(jS);
        } else {
            u(jS);
        }
        w();
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        f(canvas);
        e(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.H || z) {
            return;
        }
        v(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        if (wlq.f38110a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (o(positionIncrement)) {
                            removeCallbacks(this.w);
                            postDelayed(this.w, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (o(positionIncrement)) {
                            removeCallbacks(this.w);
                            postDelayed(this.w, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.H) {
                            v(false);
                            return true;
                        }
                        break;
                }
            } else if (this.H) {
                v(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int iMax;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.G ? 0 : this.s;
        if (this.n == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - this.m;
            int paddingBottom2 = i6 - getPaddingBottom();
            int i8 = this.l;
            iMax = (paddingBottom2 - i8) - Math.max(i7 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - this.m) / 2;
            iMax = (i6 - this.l) / 2;
        }
        this.f8335a.set(paddingLeft, paddingBottom, paddingRight, this.m + paddingBottom);
        Rect rect = this.f8336b;
        Rect rect2 = this.f8335a;
        rect.set(rect2.left + i7, iMax, rect2.right - i7, this.l + iMax);
        if (wlq.f38110a >= 29) {
            r(i5, i6);
        }
        w();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.m;
        } else if (mode != 1073741824) {
            size = Math.min(this.m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        x();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f8337k;
        if (drawable == null || !q(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.J > 0) {
            Point pointN = n(motionEvent);
            int i = pointN.x;
            int i2 = pointN.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f = i;
                if (i(f, i2)) {
                    l(f);
                    u(getScrubberPosition());
                    w();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.H) {
                    v(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.H) {
                        v(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.H) {
                if (i2 < this.t) {
                    int i3 = this.C;
                    l(i3 + ((i - i3) / 3));
                } else {
                    this.C = i;
                    l(i);
                }
                y(getScrubberPosition());
                w();
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final boolean p(Drawable drawable) {
        return wlq.f38110a >= 23 && q(drawable, getLayoutDirection());
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i == 8192) {
            if (o(-getPositionIncrement())) {
                v(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (o(getPositionIncrement())) {
                v(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @RequiresApi(29)
    public final void r(int i, int i2) {
        Rect rect = this.D;
        if (rect != null && rect.width() == i && this.D.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    @Override // com.google.android.exoplayer2.ui.b
    public void removeListener(b.a aVar) {
        this.x.remove(aVar);
    }

    public void s() {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.F = 1.0f;
        invalidate(this.f8335a);
    }

    public void setAdMarkerColor(int i) {
        this.h.setColor(i);
        invalidate(this.f8335a);
    }

    public void setBufferedColor(int i) {
        this.f.setColor(i);
        invalidate(this.f8335a);
    }

    @Override // com.google.android.exoplayer2.ui.b
    public void setBufferedPosition(long j) {
        this.L = j;
        w();
    }

    @Override // com.google.android.exoplayer2.ui.b
    public void setDuration(long j) {
        this.J = j;
        if (this.H && j == -9223372036854775807L) {
            v(true);
        }
        w();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.b
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.H || z) {
            return;
        }
        v(true);
    }

    public void setKeyCountIncrement(int i) {
        rk1.a(i > 0);
        this.A = i;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        rk1.a(j > 0);
        this.A = -1;
        this.B = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.i.setColor(i);
        invalidate(this.f8335a);
    }

    public void setPlayedColor(int i) {
        this.e.setColor(i);
        invalidate(this.f8335a);
    }

    @Override // com.google.android.exoplayer2.ui.b
    public void setPosition(long j) {
        this.K = j;
        setContentDescription(getProgressText());
        w();
    }

    public void setScrubberColor(int i) {
        this.j.setColor(i);
        invalidate(this.f8335a);
    }

    public void setUnplayedColor(int i) {
        this.g.setColor(i);
        invalidate(this.f8335a);
    }

    public void t(long j) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.E.setFloatValues(this.F, 1.0f);
        this.E.setDuration(j);
        this.E.start();
    }

    public final void u(long j) {
        this.I = j;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<b.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().c(this, j);
        }
    }

    public final void v(boolean z) {
        removeCallbacks(this.w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<b.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.I, z);
        }
    }

    public final void w() {
        this.c.set(this.f8336b);
        this.d.set(this.f8336b);
        long j = this.H ? this.I : this.K;
        if (this.J > 0) {
            int iWidth = (int) ((((long) this.f8336b.width()) * this.L) / this.J);
            Rect rect = this.c;
            Rect rect2 = this.f8336b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f8336b.width()) * j) / this.J);
            Rect rect3 = this.d;
            Rect rect4 = this.f8336b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.c;
            int i = this.f8336b.left;
            rect5.right = i;
            this.d.right = i;
        }
        invalidate(this.f8335a);
    }

    public final void x() {
        Drawable drawable = this.f8337k;
        if (drawable != null && drawable.isStateful() && this.f8337k.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void y(long j) {
        if (this.I == j) {
            return;
        }
        this.I = j;
        Iterator<b.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().b(this, j);
        }
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f8335a = new Rect();
        this.f8336b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.g = paint3;
        Paint paint4 = new Paint();
        this.h = paint4;
        Paint paint5 = new Paint();
        this.i = paint5;
        Paint paint6 = new Paint();
        this.j = paint6;
        paint6.setAntiAlias(true);
        this.x = new CopyOnWriteArraySet<>();
        this.y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.z = f;
        this.t = d(f, -50);
        int iD = d(f, 4);
        int iD2 = d(f, 26);
        int iD3 = d(f, 4);
        int iD4 = d(f, 12);
        int iD5 = d(f, 0);
        int iD6 = d(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, z3j.d, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(z3j.o);
                this.f8337k = drawable;
                if (drawable != null) {
                    p(drawable);
                    iD2 = Math.max(drawable.getMinimumHeight(), iD2);
                }
                this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(z3j.h, iD);
                this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(z3j.q, iD2);
                this.n = typedArrayObtainStyledAttributes.getInt(z3j.g, 0);
                this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(z3j.f, iD3);
                this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(z3j.p, iD4);
                this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(z3j.m, iD5);
                this.f8338r = typedArrayObtainStyledAttributes.getDimensionPixelSize(z3j.n, iD6);
                int i3 = typedArrayObtainStyledAttributes.getInt(z3j.f40841k, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(z3j.l, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(z3j.i, -855638017);
                int i6 = typedArrayObtainStyledAttributes.getInt(z3j.f40842r, 872415231);
                int i7 = typedArrayObtainStyledAttributes.getInt(z3j.e, -1291845888);
                int i8 = typedArrayObtainStyledAttributes.getInt(z3j.j, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.l = iD;
            this.m = iD2;
            this.n = 0;
            this.o = iD3;
            this.p = iD4;
            this.q = iD5;
            this.f8338r = iD6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f8337k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.u = sb;
        this.v = new Formatter(sb, Locale.getDefault());
        this.w = new Runnable() { // from class: kx5
            @Override // java.lang.Runnable
            public final void run() {
                this.f24385a.j();
            }
        };
        Drawable drawable2 = this.f8337k;
        if (drawable2 != null) {
            this.s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.s = (Math.max(this.q, Math.max(this.p, this.f8338r)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lx5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f25513a.k(valueAnimator2);
            }
        });
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
