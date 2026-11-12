package com.huami.widget.wheelview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes17.dex */
public class WheelScroller {
    public static final int MIN_DELTA_FOR_SCROLLING = 1;
    private static final int l = 400;
    private ScrollingListener a;
    private Context b;
    private GestureDetector c;
    private Scroller d;
    private int e;
    private float f;
    private boolean g;
    private GestureDetector.SimpleOnGestureListener h = new a();
    private final int i = 0;
    private final int j = 1;
    private Handler k = new b();

    public interface ScrollingListener {
        void onFinished();

        void onJustify();

        void onScroll(int i);

        void onStarted();
    }

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            WheelScroller.this.e = 0;
            WheelScroller.this.d.fling(0, WheelScroller.this.e, 0, (int) (-f2), 0, 0, -2147483647, Integer.MAX_VALUE);
            WheelScroller.this.k(0);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }
    }

    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WheelScroller.this.d.computeScrollOffset();
            int currY = WheelScroller.this.d.getCurrY();
            int i = WheelScroller.this.e - currY;
            WheelScroller.this.e = currY;
            if (i != 0) {
                WheelScroller.this.a.onScroll(i);
            }
            if (Math.abs(currY - WheelScroller.this.d.getFinalY()) < 1) {
                WheelScroller.this.d.getFinalY();
                WheelScroller.this.d.forceFinished(true);
            }
            if (!WheelScroller.this.d.isFinished()) {
                WheelScroller.this.k.sendEmptyMessage(message.what);
            } else if (message.what == 0) {
                WheelScroller.this.j();
            } else {
                WheelScroller.this.i();
            }
        }
    }

    public WheelScroller(Context context, ScrollingListener scrollingListener) {
        GestureDetector gestureDetector = new GestureDetector(context, this.h);
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.d = new Scroller(context);
        this.a = scrollingListener;
        this.b = context;
    }

    private void h() {
        this.k.removeMessages(0);
        this.k.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.a.onJustify();
        k(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i) {
        h();
        this.k.sendEmptyMessage(i);
    }

    private void l() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.a.onStarted();
    }

    public void i() {
        if (this.g) {
            this.a.onFinished();
            this.g = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int y;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f = motionEvent.getY();
            this.d.forceFinished(true);
            h();
        } else if (action == 2 && (y = (int) (motionEvent.getY() - this.f)) != 0) {
            l();
            this.a.onScroll(y);
            this.f = motionEvent.getY();
        }
        if (!this.c.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
            j();
        }
        return true;
    }

    public void scroll(int i, int i2) {
        this.d.forceFinished(true);
        this.e = 0;
        this.d.startScroll(0, 0, 0, i, i2 != 0 ? i2 : 400);
        k(0);
        l();
    }

    public void setInterpolator(Interpolator interpolator) {
        this.d.forceFinished(true);
        this.d = new Scroller(this.b, interpolator);
    }

    public void stopScrolling() {
        this.d.forceFinished(true);
    }
}
