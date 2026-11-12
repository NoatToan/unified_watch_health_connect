package com.huawei.watchface;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.HwLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class v1 extends w {
    public Canvas A;
    public int B;
    public int C;
    public List w;
    public Bitmap x;
    public Canvas y;
    public Bitmap z;

    public v1(Bitmap bitmap) {
        super(bitmap);
        this.w = new ArrayList();
        float f = this.d / 3.0f;
        this.d = f;
        int iCeil = (int) Math.ceil(f);
        this.g = iCeil;
        this.B = (int) (this.d * 2.0f);
        this.C = (int) Math.ceil(((double) iCeil) * w.t);
        float f2 = this.g;
        this.h = new RectF(0.0f, 0.0f, f2, f2);
        int i = this.C;
        int i2 = this.g;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.x = Bitmap.createBitmap(i, i2, config);
        int i3 = this.B;
        this.z = Bitmap.createBitmap(i3, i3, config);
        this.y = new Canvas(this.x);
        this.A = new Canvas(this.z);
        c();
    }

    @Override // com.huawei.watchface.w
    public void a(Point point) {
        if (point == null) {
            HwLog.e("HoneycombKaleidoscopeView", "trajectoryPoint is null.");
            return;
        }
        super.a(point);
        if (ArrayUtils.isEmpty(this.w)) {
            c();
        }
        Bitmap bitmapA = a(this.f30634c, this.y, this.x, this.A, this.z);
        this.f.reset();
        this.f.setAntiAlias(true);
        this.f30633b.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f30633b.setBitmap(this.f30632a);
        float f = this.B / 2.0f;
        for (Point point2 : this.w) {
            this.f30633b.drawBitmap(bitmapA, point2.x - f, point2.y - f, this.f);
        }
    }

    public final void c() {
        float f = this.d;
        double d = f;
        int i = (int) (d + (w.s * d));
        int i2 = ((int) (((double) (f * 2.0f)) * w.t)) - 2;
        int i3 = i2 / 2;
        int i4 = 0;
        int i5 = 0;
        while (i4 - this.d < 233.0f) {
            for (int i6 = i5 % 2 != 0 ? i3 : 0; i6 - i3 < 233; i6 += i2) {
                if (i6 <= 233 || i4 <= i3) {
                    int i7 = i6 + 233;
                    int i8 = i4 + 233;
                    this.w.add(new Point(i7, i8));
                    if (i6 != 0) {
                        this.w.add(new Point(233 - i6, i8));
                    }
                    if (i4 != 0) {
                        this.w.add(new Point(i7, 233 - i4));
                    }
                    if (i6 != 0 && i4 != 0) {
                        this.w.add(new Point(233 - i6, 233 - i4));
                    }
                }
            }
            i4 += i - 2;
            i5++;
        }
    }
}
