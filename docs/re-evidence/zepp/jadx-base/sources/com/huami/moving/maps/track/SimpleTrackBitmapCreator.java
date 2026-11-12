package com.huami.moving.maps.track;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SimpleTrackBitmapCreator {
    private static final float g = 20.0f;
    private static final int h = 60;
    private Paint a;
    private List<Path> b = null;
    private final int c = 1080;
    private final int d = 900;
    private int e;
    private int f;

    public SimpleTrackBitmapCreator(int[] iArr) {
        this.a = null;
        this.e = 0;
        this.f = 0;
        this.a = b();
        this.e = iArr[0] > 0 ? iArr[0] : 1080;
        this.f = iArr[1] > 0 ? iArr[1] : 900;
    }

    private int a(int i, int i2, int i3, int i4) {
        if (i <= i3 && i2 <= i4) {
            return 1;
        }
        int iRound = Math.round(i / i3);
        int iRound2 = Math.round(i2 / i4);
        return iRound2 < iRound ? iRound : iRound2;
    }

    private Paint b() {
        Paint paint = new Paint();
        paint.setColor(e());
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(20.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        return paint;
    }

    private Bitmap c(List<Path> list, int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.e, this.f, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (this.b != null) {
            Iterator<Path> it2 = list.iterator();
            while (it2.hasNext()) {
                canvas.drawPath(it2.next(), this.a);
            }
        }
        int i3 = 300;
        int iG = 240;
        int iA = a(this.e, this.f, 300, 240);
        if (iA != 0) {
            int iG2 = g();
            int iG3 = this.e / iA;
            if (iG3 < iG2) {
                iG3 = g();
            }
            int i4 = this.f / iA;
            if (i4 < iG2) {
                int i5 = iG3;
                iG = g();
                i3 = i5;
            } else {
                i3 = iG3;
                iG = i4;
            }
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i3, iG, true);
        if (i3 != this.e && iG != this.f) {
            bitmapCreateBitmap.recycle();
        }
        return bitmapCreateScaledBitmap;
    }

    public static int d() {
        return 60;
    }

    private int e() {
        return -1;
    }

    public static int f() {
        return 20;
    }

    private static int g() {
        return d() + f();
    }

    public static int getCachedWidth() {
        return d() + f();
    }

    public void clear() {
        List<Path> list = this.b;
        if (list == null) {
            return;
        }
        Iterator<Path> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
    }

    public Bitmap createBitmap(List<Path> list) {
        if (list != null) {
            this.b = list;
            return c(list, 0, 0);
        }
        HMLog.i("IllegalArgumentException", "SimpleTrackBitmapCreator createBitmap", new Object[0]);
        throw new IllegalArgumentException();
    }

    public void reset() {
        clear();
    }
}
