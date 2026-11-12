package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes16.dex */
public class qoy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MotionEvent f46589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f46590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f46591c;
    private float d;
    private boolean e;
    private int g;
    private boolean h;
    private final GestureDetector.OnGestureListener j;

    class c extends Handler {
        c() {
        }

        c(Handler handler) {
            super(handler.getLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 2) {
                return;
            }
            qoy.this.a();
        }
    }

    public qoy(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public qoy(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (handler != null) {
            this.f46591c = new c(handler);
        } else {
            this.f46591c = new c();
        }
        this.j = onGestureListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.g = scaledTouchSlop * scaledTouchSlop;
    }

    public void e(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        b(motionEvent, motionEvent.getAction(), motionEvent.getX(), motionEvent.getY());
    }

    private void b(MotionEvent motionEvent, int i, float f, float f2) {
        int i2 = i & 255;
        if (i2 == 0) {
            this.d = f;
            this.f46590b = f2;
            MotionEvent motionEvent2 = this.f46589a;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f46589a = MotionEvent.obtain(motionEvent);
            this.e = true;
            this.h = false;
            this.f46591c.removeMessages(2);
            this.f46591c.sendEmptyMessageAtTime(2, this.f46589a.getDownTime() + 50);
            return;
        }
        if (i2 == 1) {
            if (this.e) {
                this.j.onSingleTapUp(motionEvent);
            }
            this.f46591c.removeMessages(2);
            this.e = false;
            this.h = false;
            return;
        }
        if (i2 != 2) {
            if (i2 == 3 || i2 == 5) {
                this.f46591c.removeMessages(2);
                this.e = false;
                this.h = false;
                return;
            }
            return;
        }
        if (!this.h && this.e) {
            int i3 = (int) (f - this.d);
            int i4 = (int) (f2 - this.f46590b);
            if ((i3 * i3) + (i4 * i4) > this.g) {
                this.e = false;
                this.f46591c.removeMessages(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.h = true;
        this.j.onLongPress(this.f46589a);
    }
}
