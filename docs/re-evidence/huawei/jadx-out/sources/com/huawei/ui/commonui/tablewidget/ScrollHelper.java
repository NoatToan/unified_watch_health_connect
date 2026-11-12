package com.huawei.ui.commonui.tablewidget;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import androidx.core.view.GestureDetectorCompat;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class ScrollHelper implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GestureDetectorCompat f23914a;
    private ScrollHelperListener d;

    public interface ScrollHelperListener {
        boolean onActionUp(MotionEvent motionEvent);

        boolean onDown(MotionEvent motionEvent);

        boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        void onLongPress(MotionEvent motionEvent);

        boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    public ScrollHelper(Context context) {
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(context, this);
        this.f23914a = gestureDetectorCompat;
        gestureDetectorCompat.setIsLongpressEnabled(true);
    }

    public void b(ScrollHelperListener scrollHelperListener) {
        this.d = scrollHelperListener;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        ScrollHelperListener scrollHelperListener = this.d;
        return scrollHelperListener == null || scrollHelperListener.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ScrollHelperListener scrollHelperListener = this.d;
        return scrollHelperListener != null && scrollHelperListener.onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ScrollHelperListener scrollHelperListener = this.d;
        return scrollHelperListener != null && scrollHelperListener.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        ScrollHelperListener scrollHelperListener = this.d;
        if (scrollHelperListener != null) {
            scrollHelperListener.onLongPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ScrollHelperListener scrollHelperListener = this.d;
        return scrollHelperListener == null || scrollHelperListener.onFling(motionEvent, motionEvent2, f, f2);
    }

    public boolean a(MotionEvent motionEvent) {
        ScrollHelperListener scrollHelperListener;
        if (motionEvent.getAction() == 1 && (scrollHelperListener = this.d) != null) {
            scrollHelperListener.onActionUp(motionEvent);
        }
        return this.f23914a.onTouchEvent(motionEvent);
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f23915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Scroller f23917c;
        private int e;

        c(View view) {
            this.f23915a = view;
            this.f23917c = new Scroller(view.getContext());
        }

        void d(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f23917c.fling(i, i2, i3, i4, 0, i5, 0, i6);
            this.f23916b = i;
            this.e = i2;
            this.f23915a.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f23917c.isFinished()) {
                return;
            }
            try {
                boolean zComputeScrollOffset = this.f23917c.computeScrollOffset();
                int currX = this.f23917c.getCurrX();
                int currY = this.f23917c.getCurrY();
                int i = this.f23916b - currX;
                int i2 = this.e - currY;
                if (i != 0 || i2 != 0) {
                    this.f23915a.scrollBy(i, i2);
                    this.f23916b = currX;
                    this.e = currY;
                }
                if (zComputeScrollOffset) {
                    this.f23915a.post(this);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                ReleaseLogUtil.b("R_ScrollHelper", "Scroller ArrayIndexOutOfBoundsException:", ExceptionUtils.c(e));
                this.f23917c.abortAnimation();
            }
        }

        boolean c() {
            return this.f23917c.isFinished();
        }

        void e() {
            if (this.f23917c.isFinished()) {
                return;
            }
            this.f23917c.forceFinished(true);
        }
    }
}
