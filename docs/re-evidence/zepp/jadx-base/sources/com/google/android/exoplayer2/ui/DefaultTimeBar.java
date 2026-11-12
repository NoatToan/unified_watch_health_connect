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
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTimeBar extends View implements TimeBar {
    public static final int BAR_GRAVITY_BOTTOM = 1;
    public static final int BAR_GRAVITY_CENTER = 0;
    public static final int DEFAULT_AD_MARKER_COLOR = -1291845888;
    public static final int DEFAULT_AD_MARKER_WIDTH_DP = 4;
    public static final int DEFAULT_BAR_HEIGHT_DP = 4;
    public static final int DEFAULT_BUFFERED_COLOR = -855638017;
    public static final int DEFAULT_PLAYED_AD_MARKER_COLOR = 872414976;
    public static final int DEFAULT_PLAYED_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_DISABLED_SIZE_DP = 0;
    public static final int DEFAULT_SCRUBBER_DRAGGED_SIZE_DP = 16;
    public static final int DEFAULT_SCRUBBER_ENABLED_SIZE_DP = 12;
    public static final int DEFAULT_TOUCH_TARGET_HEIGHT_DP = 26;
    public static final int DEFAULT_UNPLAYED_COLOR = 872415231;
    private static final int P = -50;
    private static final int Q = 3;
    private static final long R = 1000;
    private static final int S = 20;
    private static final float T = 1.0f;
    private static final float U = 0.0f;
    private static final String V = "android.widget.SeekBar";
    private int A;
    private long B;
    private int C;
    private Rect D;
    private ValueAnimator E;
    private float F;
    private boolean G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;

    @Nullable
    private long[] N;

    @Nullable
    private boolean[] O;
    private final Rect a;
    private final Rect b;
    private final Rect c;
    private final Rect d;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;

    @Nullable
    private final Drawable k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final StringBuilder u;
    private final Formatter v;
    private final Runnable w;
    private final CopyOnWriteArraySet<TimeBar.OnScrubListener> x;
    private final Point y;
    private final float z;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    private static int c(float density, int dps) {
        return (int) ((dps * density) + 0.5f);
    }

    private void d(Canvas canvas) {
        int i;
        if (this.J <= 0) {
            return;
        }
        Rect rect = this.d;
        int iConstrainValue = Util.constrainValue(rect.right, rect.left, this.b.right);
        int iCenterY = this.d.centerY();
        Drawable drawable = this.k;
        if (drawable == null) {
            if (this.H || isFocused()) {
                i = this.r;
            } else {
                i = isEnabled() ? this.p : this.q;
            }
            canvas.drawCircle(iConstrainValue, iCenterY, (int) ((i * this.F) / 2.0f), this.j);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
        int intrinsicHeight = ((int) (this.k.getIntrinsicHeight() * this.F)) / 2;
        this.k.setBounds(iConstrainValue - intrinsicWidth, iCenterY - intrinsicHeight, iConstrainValue + intrinsicWidth, iCenterY + intrinsicHeight);
        this.k.draw(canvas);
    }

    private void e(Canvas canvas) {
        int iHeight = this.b.height();
        int iCenterY = this.b.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.J <= 0) {
            Rect rect = this.b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i, this.g);
            return;
        }
        Rect rect2 = this.c;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int iMax = Math.max(Math.max(this.b.left, i3), this.d.right);
        int i4 = this.b.right;
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
        long[] jArr = (long[]) Assertions.checkNotNull(this.N);
        boolean[] zArr = (boolean[]) Assertions.checkNotNull(this.O);
        int i5 = this.o / 2;
        for (int i6 = 0; i6 < this.M; i6++) {
            int iWidth = ((int) ((((long) this.b.width()) * Util.constrainValue(jArr[i6], 0L, this.J)) / this.J)) - i5;
            Rect rect4 = this.b;
            int iMin = rect4.left + Math.min(rect4.width() - this.o, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.o, i, zArr[i6] ? this.i : this.h);
        }
    }

    private boolean f(float x, float y) {
        return this.a.contains((int) x, (int) y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        q(false);
    }

    private long getPositionIncrement() {
        long j = this.B;
        if (j != C.TIME_UNSET) {
            return j;
        }
        long j2 = this.J;
        if (j2 == C.TIME_UNSET) {
            return 0L;
        }
        return j2 / ((long) this.A);
    }

    private String getProgressText() {
        return Util.getStringForTime(this.u, this.v, this.K);
    }

    private long getScrubberPosition() {
        if (this.b.width() <= 0 || this.J == C.TIME_UNSET) {
            return 0L;
        }
        return (((long) this.d.width()) * this.J) / ((long) this.b.width());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(ValueAnimator valueAnimator) {
        this.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.a);
    }

    private void i(float xPosition) {
        Rect rect = this.d;
        Rect rect2 = this.b;
        rect.right = Util.constrainValue((int) xPosition, rect2.left, rect2.right);
    }

    private static int j(float density, int px) {
        return (int) (px / density);
    }

    private Point k(MotionEvent motionEvent) {
        this.y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.y;
    }

    private boolean l(long positionChange) {
        long j = this.J;
        if (j <= 0) {
            return false;
        }
        long j2 = this.H ? this.I : this.K;
        long jConstrainValue = Util.constrainValue(j2 + positionChange, 0L, j);
        if (jConstrainValue == j2) {
            return false;
        }
        if (this.H) {
            t(jConstrainValue);
        } else {
            p(jConstrainValue);
        }
        r();
        return true;
    }

    private boolean m(Drawable drawable) {
        return Util.SDK_INT >= 23 && n(drawable, getLayoutDirection());
    }

    private static boolean n(Drawable drawable, int layoutDirection) {
        return Util.SDK_INT >= 23 && drawable.setLayoutDirection(layoutDirection);
    }

    @RequiresApi(29)
    private void o(int width, int height) {
        Rect rect = this.D;
        if (rect != null && rect.width() == width && this.D.height() == height) {
            return;
        }
        Rect rect2 = new Rect(0, 0, width, height);
        this.D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void p(long scrubPosition) {
        this.I = scrubPosition;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<TimeBar.OnScrubListener> it2 = this.x.iterator();
        while (it2.hasNext()) {
            it2.next().onScrubStart(this, scrubPosition);
        }
    }

    private void q(boolean canceled) {
        removeCallbacks(this.w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<TimeBar.OnScrubListener> it2 = this.x.iterator();
        while (it2.hasNext()) {
            it2.next().onScrubStop(this, this.I, canceled);
        }
    }

    private void r() {
        this.c.set(this.b);
        this.d.set(this.b);
        long j = this.H ? this.I : this.K;
        if (this.J > 0) {
            int iWidth = (int) ((((long) this.b.width()) * this.L) / this.J);
            Rect rect = this.c;
            Rect rect2 = this.b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.b.width()) * j) / this.J);
            Rect rect3 = this.d;
            Rect rect4 = this.b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.c;
            int i = this.b.left;
            rect5.right = i;
            this.d.right = i;
        }
        invalidate(this.a);
    }

    private void s() {
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && this.k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void t(long scrubPosition) {
        if (this.I == scrubPosition) {
            return;
        }
        this.I = scrubPosition;
        Iterator<TimeBar.OnScrubListener> it2 = this.x.iterator();
        while (it2.hasNext()) {
            it2.next().onScrubMove(this, scrubPosition);
        }
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void addListener(TimeBar.OnScrubListener listener) {
        Assertions.checkNotNull(listener);
        this.x.add(listener);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        s();
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public long getPreferredUpdateDelay() {
        int iJ = j(this.z, this.b.width());
        if (iJ != 0) {
            long j = this.J;
            if (j != 0 && j != C.TIME_UNSET) {
                return j / ((long) iJ);
            }
        }
        return Long.MAX_VALUE;
    }

    public void hideScrubber(boolean disableScrubberPadding) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = disableScrubberPadding;
        this.F = 0.0f;
        invalidate(this.a);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        e(canvas);
        d(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (!this.H || gainFocus) {
            return;
        }
        q(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        if (event.getEventType() == 4) {
            event.getText().add(getProgressText());
        }
        event.setClassName(V);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(V);
        info.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        if (Util.SDK_INT >= 21) {
            info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            info.addAction(4096);
            info.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (keyCode != 66) {
                switch (keyCode) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (l(positionIncrement)) {
                            removeCallbacks(this.w);
                            postDelayed(this.w, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (l(positionIncrement)) {
                            removeCallbacks(this.w);
                            postDelayed(this.w, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.H) {
                            q(false);
                            return true;
                        }
                        break;
                }
            } else if (this.H) {
                q(false);
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int paddingBottom;
        int iMax;
        int i = right - left;
        int i2 = bottom - top;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i - getPaddingRight();
        int i3 = this.G ? 0 : this.s;
        if (this.n == 1) {
            paddingBottom = (i2 - getPaddingBottom()) - this.m;
            int paddingBottom2 = i2 - getPaddingBottom();
            int i4 = this.l;
            iMax = (paddingBottom2 - i4) - Math.max(i3 - (i4 / 2), 0);
        } else {
            paddingBottom = (i2 - this.m) / 2;
            iMax = (i2 - this.l) / 2;
        }
        this.a.set(paddingLeft, paddingBottom, paddingRight, this.m + paddingBottom);
        Rect rect = this.b;
        Rect rect2 = this.a;
        rect.set(rect2.left + i3, iMax, rect2.right - i3, this.l + iMax);
        if (Util.SDK_INT >= 29) {
            o(i, i2);
        }
        r();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == 0) {
            size = this.m;
        } else if (mode != 1073741824) {
            size = Math.min(this.m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), size);
        s();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        Drawable drawable = this.k;
        if (drawable == null || !n(drawable, layoutDirection)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (isEnabled() && this.J > 0) {
            Point pointK = k(event);
            int i = pointK.x;
            int i2 = pointK.y;
            int action = event.getAction();
            if (action == 0) {
                float f = i;
                if (f(f, i2)) {
                    i(f);
                    p(getScrubberPosition());
                    r();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.H) {
                    q(event.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.H) {
                        q(event.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.H) {
                if (i2 < this.t) {
                    int i3 = this.C;
                    i(i3 + ((i - i3) / 3));
                } else {
                    this.C = i;
                    i(i);
                }
                t(getScrubberPosition());
                r();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int action, @Nullable Bundle args) {
        if (super.performAccessibilityAction(action, args)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (action == 8192) {
            if (l(-getPositionIncrement())) {
                q(false);
            }
        } else {
            if (action != 4096) {
                return false;
            }
            if (l(getPositionIncrement())) {
                q(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void removeListener(TimeBar.OnScrubListener listener) {
        this.x.remove(listener);
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setAdGroupTimesMs(@Nullable long[] adGroupTimesMs, @Nullable boolean[] playedAdGroups, int adGroupCount) {
        Assertions.checkArgument(adGroupCount == 0 || !(adGroupTimesMs == null || playedAdGroups == null));
        this.M = adGroupCount;
        this.N = adGroupTimesMs;
        this.O = playedAdGroups;
        r();
    }

    public void setAdMarkerColor(@ColorInt int adMarkerColor) {
        this.h.setColor(adMarkerColor);
        invalidate(this.a);
    }

    public void setBufferedColor(@ColorInt int bufferedColor) {
        this.f.setColor(bufferedColor);
        invalidate(this.a);
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setBufferedPosition(long bufferedPosition) {
        this.L = bufferedPosition;
        r();
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setDuration(long duration) {
        this.J = duration;
        if (this.H && duration == C.TIME_UNSET) {
            q(true);
        }
        r();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.TimeBar
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (!this.H || enabled) {
            return;
        }
        q(true);
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setKeyCountIncrement(int count) {
        Assertions.checkArgument(count > 0);
        this.A = count;
        this.B = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setKeyTimeIncrement(long time) {
        Assertions.checkArgument(time > 0);
        this.A = -1;
        this.B = time;
    }

    public void setPlayedAdMarkerColor(@ColorInt int playedAdMarkerColor) {
        this.i.setColor(playedAdMarkerColor);
        invalidate(this.a);
    }

    public void setPlayedColor(@ColorInt int playedColor) {
        this.e.setColor(playedColor);
        invalidate(this.a);
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setPosition(long position) {
        this.K = position;
        setContentDescription(getProgressText());
        r();
    }

    public void setScrubberColor(@ColorInt int scrubberColor) {
        this.j.setColor(scrubberColor);
        invalidate(this.a);
    }

    public void setUnplayedColor(@ColorInt int unplayedColor) {
        this.g.setColor(unplayedColor);
        invalidate(this.a);
    }

    public void showScrubber() {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.F = 1.0f;
        invalidate(this.a);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, attrs);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr, @Nullable AttributeSet timebarAttrs) {
        this(context, attrs, defStyleAttr, timebarAttrs, 0);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr, @Nullable AttributeSet timebarAttrs, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.a = new Rect();
        this.b = new Rect();
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
        this.t = c(f, P);
        int iC = c(f, 4);
        int iC2 = c(f, 26);
        int iC3 = c(f, 4);
        int iC4 = c(f, 12);
        int iC5 = c(f, 0);
        int iC6 = c(f, 16);
        if (timebarAttrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(timebarAttrs, R.styleable.DefaultTimeBar, defStyleAttr, defStyleRes);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.DefaultTimeBar_scrubber_drawable);
                this.k = drawable;
                if (drawable != null) {
                    m(drawable);
                    iC2 = Math.max(drawable.getMinimumHeight(), iC2);
                }
                this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_bar_height, iC);
                this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_touch_target_height, iC2);
                this.n = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_bar_gravity, 0);
                this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_ad_marker_width, iC3);
                this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_enabled_size, iC4);
                this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_disabled_size, iC5);
                this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_dragged_size, iC6);
                int i = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_played_color, -1);
                int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_scrubber_color, -1);
                int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_buffered_color, DEFAULT_BUFFERED_COLOR);
                int i4 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_unplayed_color, DEFAULT_UNPLAYED_COLOR);
                int i5 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_ad_marker_color, DEFAULT_AD_MARKER_COLOR);
                int i6 = typedArrayObtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_played_ad_marker_color, DEFAULT_PLAYED_AD_MARKER_COLOR);
                paint.setColor(i);
                paint6.setColor(i2);
                paint2.setColor(i3);
                paint3.setColor(i4);
                paint4.setColor(i5);
                paint5.setColor(i6);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.l = iC;
            this.m = iC2;
            this.n = 0;
            this.o = iC3;
            this.p = iC4;
            this.q = iC5;
            this.r = iC6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(DEFAULT_BUFFERED_COLOR);
            paint3.setColor(DEFAULT_UNPLAYED_COLOR);
            paint4.setColor(DEFAULT_AD_MARKER_COLOR);
            paint5.setColor(DEFAULT_PLAYED_AD_MARKER_COLOR);
            this.k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.u = sb;
        this.v = new Formatter(sb, Locale.getDefault());
        this.w = new Runnable() { // from class: c61
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g();
            }
        };
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            this.s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.s = (Math.max(this.q, Math.max(this.p, this.r)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: b61
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.a.h(valueAnimator2);
            }
        });
        this.J = C.TIME_UNSET;
        this.B = C.TIME_UNSET;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public void hideScrubber(long hideAnimationDurationMs) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.E.setFloatValues(this.F, 0.0f);
        this.E.setDuration(hideAnimationDurationMs);
        this.E.start();
    }

    public void showScrubber(long showAnimationDurationMs) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.E.setFloatValues(this.F, 1.0f);
        this.E.setDuration(showAnimationDurationMs);
        this.E.start();
    }
}
