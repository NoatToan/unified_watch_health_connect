package com.huawei.watchface;

import android.graphics.Point;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class o2 {
    public static final Object e = new Object();
    public static volatile o2 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Point f30528a = new Point();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Point f30529b = new Point();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30530c = 0.0f;
    public int d = 233;

    public static o2 b() {
        if (f == null) {
            synchronized (e) {
                if (f == null) {
                    f = new o2();
                }
            }
        }
        return f;
    }

    public Point a() {
        return this.f30528a;
    }

    public float c() {
        return 90.0f - ((float) Math.toDegrees(this.f30530c));
    }

    public final void d() {
        if (Float.compare(Math.abs(this.f30530c), 6.2831855f) < 0) {
            double dSin = (float) (((double) this.d) * Math.sin(this.f30530c * 2.0f));
            this.f30528a.x = this.f30529b.x + ((int) (Math.cos(this.f30530c) * dSin));
            this.f30528a.y = this.f30529b.y + ((int) (dSin * Math.sin(this.f30530c)));
        }
    }

    public final void a(int i) {
        int i2 = i / 2;
        Point point = this.f30529b;
        point.x = i2;
        point.y = i2;
        this.d = i2;
        this.f30530c = 0.0f;
    }

    public void b(int i) {
        a(i);
        d();
        HwLog.i("KaleidoscopeRectUtil", "initWatchFaceIdPoint srcBitmapSize: " + i);
    }
}
