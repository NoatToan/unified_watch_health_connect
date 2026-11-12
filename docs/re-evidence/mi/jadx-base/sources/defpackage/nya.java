package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class nya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f28562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28563b;
    public boolean c;
    public boolean d;
    public long e;
    public float f;
    public float g;

    public interface a {
        boolean a();
    }

    public nya(Context context) {
        this.f28563b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static nya c(Context context) {
        return new nya(context);
    }

    public void a() {
        this.f28562a = null;
        e();
    }

    public boolean b() {
        return this.c;
    }

    public boolean d(MotionEvent motionEvent) {
        a aVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.c = true;
            this.d = true;
            this.e = motionEvent.getEventTime();
            this.f = motionEvent.getX();
            this.g = motionEvent.getY();
        } else if (action == 1) {
            this.c = false;
            if (Math.abs(motionEvent.getX() - this.f) > this.f28563b || Math.abs(motionEvent.getY() - this.g) > this.f28563b) {
                this.d = false;
            }
            if (this.d && motionEvent.getEventTime() - this.e <= ViewConfiguration.getLongPressTimeout() && (aVar = this.f28562a) != null) {
                aVar.a();
            }
            this.d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.c = false;
                this.d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f) > this.f28563b || Math.abs(motionEvent.getY() - this.g) > this.f28563b) {
            this.d = false;
        }
        return true;
    }

    public void e() {
        this.c = false;
        this.d = false;
    }

    public void f(a aVar) {
        this.f28562a = aVar;
    }
}
