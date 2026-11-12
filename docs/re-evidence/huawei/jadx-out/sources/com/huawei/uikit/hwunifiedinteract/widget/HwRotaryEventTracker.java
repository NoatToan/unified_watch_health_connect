package com.huawei.uikit.hwunifiedinteract.widget;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes44.dex */
public class HwRotaryEventTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f29802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MotionEvent f29803c;
    private MotionEvent e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f29801a = -1;
    private a d = new a();
    private float j = 0.0f;

    public interface OnRotaryListener {
        boolean onBeginScroll(MotionEvent motionEvent);

        boolean onEndScroll(MotionEvent motionEvent);

        boolean onMiddleScroll(MotionEvent motionEvent);
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private OnRotaryListener f29804b;

        private a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HwRotaryEventTracker.this.a(null, this.f29804b);
        }
    }

    public HwRotaryEventTracker(Context context) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(MotionEvent motionEvent, OnRotaryListener onRotaryListener) throws Throwable {
        Throwable th;
        MotionEvent motionEvent2;
        this.f29801a = -1L;
        this.f29802b.removeCallbacks(this.d);
        try {
            if (motionEvent != null) {
                boolean zOnEndScroll = onRotaryListener.onEndScroll(motionEvent);
                MotionEvent motionEvent3 = this.e;
                if (motionEvent3 != null) {
                    motionEvent3.recycle();
                    this.e = null;
                }
                MotionEvent motionEvent4 = this.f29803c;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                    this.f29803c = null;
                }
                return zOnEndScroll;
            }
            motionEvent2 = this.e;
            float f = 0.0f;
            try {
                if (motionEvent2 != null && this.f29803c != null) {
                    float axisValue = motionEvent2.getAxisValue(26);
                    float axisValue2 = this.f29803c.getAxisValue(26);
                    float eventTime = this.e.getEventTime();
                    float eventTime2 = this.f29803c.getEventTime();
                    float f2 = (axisValue * axisValue2 < 0.0f || Float.compare(eventTime, eventTime2) >= 0) ? 0.0f : (((axisValue2 - axisValue) / (eventTime2 - eventTime)) * 50.0f) + axisValue2;
                    if (axisValue2 * f2 >= 0.0f) {
                        f = f2;
                    }
                    MotionEvent motionEventB = b(f);
                    boolean zOnEndScroll2 = onRotaryListener.onEndScroll(motionEventB);
                    MotionEvent motionEvent5 = this.e;
                    if (motionEvent5 != null) {
                        motionEvent5.recycle();
                        this.e = null;
                    }
                    MotionEvent motionEvent6 = this.f29803c;
                    if (motionEvent6 != null) {
                        motionEvent6.recycle();
                        this.f29803c = null;
                    }
                    if (motionEventB != null) {
                        motionEventB.recycle();
                    }
                    return zOnEndScroll2;
                }
                if (motionEvent2 != null || this.f29803c == null) {
                    Log.e("HwRotaryEventTracker", "onEnd: event is null");
                    MotionEvent motionEvent7 = this.e;
                    if (motionEvent7 != null) {
                        motionEvent7.recycle();
                        this.e = null;
                    }
                    MotionEvent motionEvent8 = this.f29803c;
                    if (motionEvent8 == null) {
                        return false;
                    }
                    motionEvent8.recycle();
                    this.f29803c = null;
                    return false;
                }
                MotionEvent motionEventB2 = b(0.0f);
                boolean zOnEndScroll3 = onRotaryListener.onEndScroll(motionEventB2);
                MotionEvent motionEvent9 = this.e;
                if (motionEvent9 != null) {
                    motionEvent9.recycle();
                    this.e = null;
                }
                MotionEvent motionEvent10 = this.f29803c;
                if (motionEvent10 != null) {
                    motionEvent10.recycle();
                    this.f29803c = null;
                }
                if (motionEventB2 != null) {
                    motionEventB2.recycle();
                }
                return zOnEndScroll3;
            } catch (Throwable th2) {
                th = th2;
                MotionEvent motionEvent11 = this.e;
                if (motionEvent11 != null) {
                    motionEvent11.recycle();
                    this.e = null;
                }
                MotionEvent motionEvent12 = this.f29803c;
                if (motionEvent12 != null) {
                    motionEvent12.recycle();
                    this.f29803c = null;
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            motionEvent2 = null;
        }
    }

    private MotionEvent b(float f) {
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.x = 0.0f;
        pointerCoords.y = 0.0f;
        pointerCoords.setAxisValue(26, f);
        MotionEvent.PointerCoords[] pointerCoordsArr = {pointerCoords};
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = 0;
        long jUptimeMillis = SystemClock.uptimeMillis();
        return MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 8, 1, new MotionEvent.PointerProperties[]{pointerProperties}, pointerCoordsArr, 0, 0, 1.0f, 1.0f, 0, 0, 4194304, 0);
    }
}
