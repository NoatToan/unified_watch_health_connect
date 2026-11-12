package com.xiaomi.hm.health.relation.chart.base;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class ChartScroller {
    public static final int MIN_DELTA_FOR_SCROLLING = 1;
    private static final String o = "Chart.Scroller";
    private static final int p = 400;
    private ScrollingListener a;
    private Context b;
    private GestureDetector c;
    private Scroller d;
    private int e;
    private float f;
    private int g;
    private float h;
    private boolean i;
    private boolean j;
    private Handler k;
    private GestureDetector.SimpleOnGestureListener l = new a();
    private final int m = 0;
    private final int n = 1;

    public interface ScrollingListener {
        void onFinish();

        void onJustify();

        boolean onScrollX(int i);

        boolean onScrollY(int i);

        void onStart();
    }

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            ChartScroller.this.e = 0;
            ChartScroller.this.g = 0;
            ChartScroller.this.d.fling(ChartScroller.this.e, ChartScroller.this.g, (int) (-f), (int) (-f2), -5400, 5400, -5400, 5400);
            ChartScroller.this.n(0);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }
    }

    public static class b extends Handler {
        private WeakReference<ChartScroller> a;

        public b(ChartScroller chartScroller) {
            this.a = new WeakReference<>(chartScroller);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ChartScroller chartScroller = this.a.get();
            if (chartScroller == null) {
                return;
            }
            chartScroller.d.computeScrollOffset();
            int currX = chartScroller.d.getCurrX();
            int i = chartScroller.e - currX;
            chartScroller.e = currX;
            if (i != 0) {
                chartScroller.a.onScrollX(i);
            }
            int currY = chartScroller.d.getCurrY();
            int i2 = chartScroller.g - currY;
            chartScroller.g = currY;
            if (i2 != 0) {
                chartScroller.a.onScrollY(i2);
            }
            if (chartScroller.j && Math.abs(currX - chartScroller.d.getFinalX()) < 1) {
                chartScroller.d.getFinalX();
                chartScroller.d.forceFinished(true);
            }
            if (!chartScroller.j && Math.abs(currY - chartScroller.d.getFinalY()) < 1) {
                chartScroller.d.getFinalY();
                chartScroller.d.forceFinished(true);
            }
            if (!chartScroller.d.isFinished()) {
                chartScroller.k.sendEmptyMessage(message.what);
            } else if (message.what == 0) {
                chartScroller.m();
            } else {
                chartScroller.l();
            }
        }
    }

    public ChartScroller(Context context, ScrollingListener scrollingListener) {
        this.b = context;
        this.a = scrollingListener;
        GestureDetector gestureDetector = new GestureDetector(context, this.l);
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.d = new Scroller(context);
        this.k = new b(this);
    }

    private void k() {
        this.k.removeMessages(0);
        this.k.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.a.onJustify();
        n(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i) {
        k();
        this.k.sendEmptyMessage(i);
    }

    private void o() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.a.onStart();
    }

    public void forceFinishScrolling() {
        if (this.d.isFinished()) {
            return;
        }
        this.d.forceFinished(true);
    }

    public void l() {
        if (this.i) {
            this.a.onFinish();
            this.i = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnScrollY;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                int x = (int) (motionEvent.getX() - this.f);
                int y = (int) (motionEvent.getY() - this.h);
                if (x != 0) {
                    o();
                    zOnScrollY = this.a.onScrollX(x);
                    this.f = motionEvent.getX();
                } else {
                    zOnScrollY = true;
                }
                if (y != 0) {
                    o();
                    zOnScrollY = this.a.onScrollY(y);
                    this.h = motionEvent.getY();
                }
            }
            if (!this.c.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
                m();
            }
            return zOnScrollY;
        }
        this.f = motionEvent.getX();
        this.h = motionEvent.getY();
        this.d.forceFinished(true);
        k();
        zOnScrollY = true;
        if (!this.c.onTouchEvent(motionEvent)) {
            m();
        }
        return zOnScrollY;
    }

    public void scrollX(int i, int i2) {
        this.j = true;
        this.d.forceFinished(true);
        this.e = 0;
        this.d.startScroll(0, 0, i, 0, i2 != 0 ? i2 : 400);
        n(0);
        o();
    }

    public void scrollY(int i, int i2) {
        this.j = false;
        this.d.forceFinished(true);
        this.g = 0;
        this.d.startScroll(0, 0, 0, i, i2 != 0 ? i2 : 400);
        n(0);
        o();
    }

    public void setInterpolator(Interpolator interpolator) {
        this.d.forceFinished(true);
        this.d = new Scroller(this.b, interpolator);
    }

    public void scrollX(int i) {
        scrollX(i, 0);
    }
}
