package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.google.android.gms.common.util.GmsVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class fm extends View {
    private String a;
    private int b;
    private IAMapDelegate c;
    private Paint d;
    private Paint e;
    private Rect f;
    private IPoint g;
    private float h;
    private final int[] i;

    public fm(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.a = "";
        this.b = 0;
        this.h = 0.0f;
        this.i = new int[]{10000000, GmsVersion.VERSION_LONGHORN, 2000000, 1000000, 500000, 200000, 100000, 50000, 30000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5};
        this.c = iAMapDelegate;
        this.d = new Paint();
        this.f = new Rect();
        this.d.setAntiAlias(true);
        this.d.setColor(-16777216);
        this.d.setStrokeWidth(l.a * 2.0f);
        this.d.setStyle(Paint.Style.STROKE);
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setColor(-16777216);
        this.e.setTextSize(l.a * 20.0f);
        this.h = el.b(context);
        this.g = new IPoint();
    }

    public final void a() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.a = null;
        this.g = null;
    }

    public final void b() {
        IAMapDelegate iAMapDelegate = this.c;
        if (iAMapDelegate == null) {
            return;
        }
        try {
            float preciseLevel = iAMapDelegate.getPreciseLevel(1);
            this.c.getGeoCenter(1, this.g);
            IPoint iPoint = this.g;
            if (iPoint == null) {
                return;
            }
            DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(((Point) iPoint).x, ((Point) iPoint).y, 20);
            float mapZoomScale = this.c.getMapZoomScale();
            double dCos = (float) ((((Math.cos((dPointPixelsToLatLong.y * 3.141592653589793d) / 180.0d) * 2.0d) * 3.141592653589793d) * 6378137.0d) / (Math.pow(2.0d, preciseLevel) * 256.0d));
            int[] iArr = this.i;
            int i = (int) preciseLevel;
            int i2 = (int) (((double) iArr[i]) / (dCos * ((double) mapZoomScale)));
            String strA = er.a(iArr[i]);
            this.b = i2;
            this.a = strA;
            dPointPixelsToLatLong.recycle();
            invalidate();
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImpGLSurfaceView", "changeScaleState");
            th.printStackTrace();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Point waterMarkerPositon;
        String str = this.a;
        if (str == null || "".equals(str) || this.b == 0 || (waterMarkerPositon = this.c.getWaterMarkerPositon()) == null) {
            return;
        }
        Paint paint = this.e;
        String str2 = this.a;
        paint.getTextBounds(str2, 0, str2.length(), this.f);
        int i = waterMarkerPositon.x;
        int iHeight = (waterMarkerPositon.y - this.f.height()) + 5;
        canvas.drawText(this.a, ((this.b - this.f.width()) / 2) + i, iHeight, this.e);
        float f = i;
        float fHeight = iHeight + (this.f.height() - 5);
        canvas.drawLine(f, fHeight - (this.h * 2.0f), f, fHeight + l.a, this.d);
        canvas.drawLine(f, fHeight, this.b + i, fHeight, this.d);
        int i2 = this.b;
        canvas.drawLine(i + i2, fHeight - (this.h * 2.0f), i + i2, fHeight + l.a, this.d);
    }

    public final void a(boolean z) {
        if (z) {
            setVisibility(0);
            b();
        } else {
            this.a = "";
            this.b = 0;
            setVisibility(8);
        }
    }
}
