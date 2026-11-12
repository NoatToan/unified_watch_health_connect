package com.xiaomi.hm.health.training.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.huami.lib.view.ViewUtils;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes22.dex */
public class StickHeaderLayout extends LinearLayout {
    private static final int w = 120;
    private static final long x = 300;
    private final String a;
    private RelativeLayout b;
    private TextView c;
    private TextView d;
    private TextView e;
    private LinearLayout f;
    private GestureDetector g;
    private VelocityTracker h;
    private Scroller i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private float p;
    private float q;
    private float r;
    private float s;
    private int t;
    private boolean u;
    public View v;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StickHeaderLayout stickHeaderLayout = StickHeaderLayout.this;
            stickHeaderLayout.l = stickHeaderLayout.b.getHeight();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ View b;

        public b(int i, View view) {
            this.a = i;
            this.b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = this.a + ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (iIntValue < StickHeaderLayout.this.m) {
                iIntValue = StickHeaderLayout.this.m;
            } else if (iIntValue > StickHeaderLayout.this.l) {
                iIntValue = StickHeaderLayout.this.l;
            }
            float f = (iIntValue - StickHeaderLayout.this.m) / (StickHeaderLayout.this.l - StickHeaderLayout.this.m);
            float f2 = (((StickHeaderLayout.this.p - StickHeaderLayout.this.q) * f) + StickHeaderLayout.this.q) / StickHeaderLayout.this.p;
            StickHeaderLayout.this.c.setScaleX(f2);
            StickHeaderLayout.this.c.setScaleY(f2);
            StickHeaderLayout.this.d.setAlpha(f);
            StickHeaderLayout.this.e.setAlpha(f);
            float f3 = ((StickHeaderLayout.this.r - StickHeaderLayout.this.s) * f) + StickHeaderLayout.this.s;
            Log.d("StickHeaderLayout", "playImageValueAnimator  --------paddingBottom:" + f3);
            StickHeaderLayout.this.f.setPadding(0, 0, 0, (int) f3);
            this.b.setLayoutParams(new LinearLayout.LayoutParams(-1, iIntValue));
            this.b.requestLayout();
            Log.d("StickHeaderLayout", "playImageValueAnimator  --------height:" + iIntValue);
        }
    }

    public class c extends GestureDetector.SimpleOnGestureListener {
        private c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Log.d("StickHeaderLayout", "GestureListener GestureDetector onScroll  --------distanceX:" + f + "     distanceY:" + f2 + "   isFirstScroll:" + StickHeaderLayout.this.o);
            if (StickHeaderLayout.this.o) {
                StickHeaderLayout.this.o = false;
            } else {
                int height = StickHeaderLayout.this.b.getHeight();
                if (height >= StickHeaderLayout.this.m && height <= StickHeaderLayout.this.l) {
                    if (f2 > 0.0f) {
                        Log.d("StickHeaderLayout", "GestureListener onScroll  --------height:" + height + "  rlTopInitHeight :" + StickHeaderLayout.this.l);
                        StickHeaderLayout stickHeaderLayout = StickHeaderLayout.this;
                        stickHeaderLayout.s(height, stickHeaderLayout.b, 0L, 0, (int) (-f2));
                    } else if (f2 < 0.0f) {
                        StickHeaderLayout stickHeaderLayout2 = StickHeaderLayout.this;
                        stickHeaderLayout2.s(height, stickHeaderLayout2.b, 0L, 0, (int) (-f2));
                    }
                }
            }
            return super.onScroll(motionEvent, motionEvent2, 0.0f, 0.0f);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            StickHeaderLayout.this.i.forceFinished(true);
            super.onShowPress(motionEvent);
        }
    }

    public StickHeaderLayout(Context context) {
        super(context);
        this.a = "StickHeaderLayout";
        this.h = null;
        this.m = 366;
        this.n = true;
        this.o = true;
        this.p = 20.0f;
        this.q = 14.0f;
        this.u = true;
    }

    private boolean q() {
        View view = this.v;
        boolean zCanScrollVertically = view != null ? view.canScrollVertically(-1) : false;
        Log.d("StickHeaderLayout", "canChildScrollDown:" + zCanScrollVertically);
        return zCanScrollVertically;
    }

    private void r() {
        this.b = (RelativeLayout) findViewById(R.id.rl_top);
        this.v = findViewById(R.id.nsv_bottom);
        this.f = (LinearLayout) findViewById(R.id.ll_bottom);
        this.c = (TextView) findViewById(R.id.tx_training_name);
        this.d = (TextView) findViewById(R.id.tx_subtitle_one);
        this.e = (TextView) findViewById(R.id.tx_subtitle_two);
        this.b.post(new a());
        GestureDetector gestureDetector = new GestureDetector(getContext(), new c());
        this.g = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.i = new Scroller(getContext());
        this.r = getResources().getDimensionPixelSize(R.dimen.padding_bottom_max);
        this.s = getResources().getDimensionPixelSize(R.dimen.padding_bottom_min);
        this.m = getResources().getDimensionPixelSize(R.dimen.image_header_min_height) + ViewUtils.getStatusBarHeight(getContext());
        this.t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ValueAnimator s(int i, View view, long j, int... iArr) {
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(j);
        duration.addUpdateListener(new b(i, view));
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.start();
        return duration;
    }

    private void t(float f, int i) {
        float fAbs = Math.abs(f);
        int i2 = this.l;
        if (fAbs > i2) {
            i2 = (int) f;
        } else if (!this.n ? i - this.m < 120 : i2 - i >= 120) {
            i2 = -i2;
        }
        s(i, this.b, 300L, 0, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.u) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int x2 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.j = x2;
            this.k = y;
        } else if (action == 1 || action == 2) {
            if (Math.abs(y - this.k) < this.t && Math.abs(x2 - this.j) < this.t) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if ((this.b == null || motionEvent.getY() <= this.b.getBottom()) && q()) {
                return false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        r();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.u) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int x2 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z2 = false;
        if (action == 0) {
            this.j = x2;
            this.k = y;
            RelativeLayout relativeLayout = this.b;
            if (relativeLayout != null) {
                this.n = relativeLayout.getHeight() == this.l;
            }
        } else if (action == 1 || action == 2 || action == 3) {
            int i = x2 - this.j;
            int i2 = y - this.k;
            if (Math.abs(i) >= Math.abs(i2) || this.b == null || q()) {
                z = false;
            } else {
                if (i2 > 0 && this.b.getHeight() < this.l) {
                    Log.d("StickHeaderLayout", "向下纵向拦截");
                } else if (i2 >= 0 || this.b.getHeight() <= this.m) {
                    z = false;
                } else {
                    Log.d("StickHeaderLayout", "向上纵向拦截");
                }
                z = true;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.k = 0;
                this.j = 0;
            }
            z2 = z;
        }
        Log.d("StickHeaderLayout", "intercepted:" + z2);
        return z2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.u) {
            return super.onTouchEvent(motionEvent);
        }
        Log.d("StickHeaderLayout", "onTouchEvent   X:" + motionEvent.getX() + " Y" + motionEvent.getY());
        int action = motionEvent.getAction();
        if (this.h == null) {
            this.h = VelocityTracker.obtain();
        }
        this.h.addMovement(motionEvent);
        this.g.onTouchEvent(motionEvent);
        if (action == 0) {
            this.k = (int) motionEvent.getY();
        } else if (action == 1) {
            this.h.computeCurrentVelocity(1000);
            float yVelocity = this.h.getYVelocity(0);
            Log.d("StickHeaderLayout", "GestureListener  GestureDetector getXVelocity:" + this.h.getXVelocity() + "     getYVelocity" + yVelocity);
            this.o = true;
            t(yVelocity, this.b.getHeight());
        }
        return true;
    }

    public void setScrollEnable(boolean z) {
        this.u = z;
    }

    public StickHeaderLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = "StickHeaderLayout";
        this.h = null;
        this.m = 366;
        this.n = true;
        this.o = true;
        this.p = 20.0f;
        this.q = 14.0f;
        this.u = true;
    }

    public StickHeaderLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = "StickHeaderLayout";
        this.h = null;
        this.m = 366;
        this.n = true;
        this.o = true;
        this.p = 20.0f;
        this.q = 14.0f;
        this.u = true;
    }
}
