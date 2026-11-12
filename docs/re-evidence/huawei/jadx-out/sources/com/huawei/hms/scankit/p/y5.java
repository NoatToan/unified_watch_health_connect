package com.huawei.hms.scankit.p;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f16438a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16439b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16440c;
    private int d;
    private int e;
    private float f;
    private Rect g;
    private b6 h;

    public y5(b6 b6Var, Rect rect, int i, float f, int[] iArr) {
        this.f16440c = 0;
        this.d = 0;
        this.h = b6Var;
        this.g = rect;
        this.e = i;
        if (iArr != null && iArr.length >= 2) {
            this.f16440c = iArr[0];
            this.d = iArr[1];
        }
        this.f = f;
        c();
    }

    private void c() {
        Rect rect;
        a();
        this.f16439b = 0L;
        this.f16438a = System.currentTimeMillis();
        b6 b6Var = this.h;
        if (b6Var == null || (rect = this.g) == null) {
            return;
        }
        b6Var.a(rect, this.e);
    }

    private void a() {
        b6 b6Var = this.h;
        if (b6Var != null) {
            b6Var.a();
        }
    }

    private int b() {
        float fA = n6.a(1.0f);
        int iRed = Color.red(this.f16440c);
        int iBlue = Color.blue(this.f16440c);
        int iGreen = Color.green(this.f16440c);
        return Color.rgb((int) (iRed + ((Color.red(this.d) - iRed) * fA) + 0.5f), (int) (iGreen + ((Color.green(this.d) - iGreen) * fA) + 0.5f), (int) (iBlue + ((Color.blue(this.d) - iBlue) * fA) + 0.5f));
    }

    public void a(Canvas canvas, Rect rect) {
        if (this.h == null || canvas == null || rect == null) {
            return;
        }
        long jCurrentTimeMillis = this.f16439b + (System.currentTimeMillis() - this.f16438a);
        this.f16439b = jCurrentTimeMillis;
        this.h.b(jCurrentTimeMillis);
        List listC = this.h.c();
        if (listC == null || listC.isEmpty()) {
            return;
        }
        a(canvas, rect, listC);
        this.f16438a = System.currentTimeMillis();
    }

    private void a(Canvas canvas, Rect rect, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w5 w5Var = (w5) it.next();
            Paint paint = new Paint();
            if (w5Var.b() == 0) {
                w5Var.b(b());
            }
            paint.setColor(w5Var.b());
            int iA = (int) (w5Var.a() * Math.abs((rect.height() == 0 || rect.width() == 0 || ((w5Var.d() > ((float) Math.max(rect.top, rect.bottom)) ? 1 : (w5Var.d() == ((float) Math.max(rect.top, rect.bottom)) ? 0 : -1)) > 0 || (w5Var.d() > ((float) Math.min(rect.top, rect.bottom)) ? 1 : (w5Var.d() == ((float) Math.min(rect.top, rect.bottom)) ? 0 : -1)) < 0)) ? 0.0f : (rect.bottom - w5Var.d()) / rect.height()));
            if (iA > 0) {
                paint.setAlpha(iA);
                canvas.drawCircle(w5Var.c(), w5Var.d(), w5Var.f() * this.f, paint);
            }
        }
    }
}
