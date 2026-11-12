package com.amap.api.col.p0003sl;

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
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hms.framework.common.ExceptionCode;

/* JADX INFO: loaded from: classes4.dex */
public final class ep extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IAMapDelegate f2466c;
    private Paint d;
    private Paint e;
    private Rect f;
    private IPoint g;
    private float h;
    private final int[] i;

    public final void a() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.f2464a = null;
        this.g = null;
    }

    public ep(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.f2464a = "";
        this.f2465b = 0;
        this.h = 0.0f;
        this.i = new int[]{ExceptionCode.CRASH_EXCEPTION, GmsVersion.VERSION_LONGHORN, 2000000, 1000000, 500000, AwarenessConstants.REGISTER_SUCCESS_CODE, 100000, 50000, 30000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5};
        this.f2466c = iAMapDelegate;
        this.d = new Paint();
        this.f = new Rect();
        this.d.setAntiAlias(true);
        this.d.setColor(-16777216);
        this.d.setStrokeWidth(y.f3319b * 2.0f);
        this.d.setStyle(Paint.Style.STROKE);
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setColor(-16777216);
        this.e.setTextSize(y.f3319b * 20.0f);
        this.h = dv.a(context, 1.0f);
        this.g = new IPoint();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Point waterMarkerPositon;
        String str = this.f2464a;
        if (str == null || "".equals(str) || this.f2465b == 0 || (waterMarkerPositon = this.f2466c.getWaterMarkerPositon()) == null) {
            return;
        }
        Paint paint = this.e;
        String str2 = this.f2464a;
        paint.getTextBounds(str2, 0, str2.length(), this.f);
        int i = waterMarkerPositon.x;
        int iHeight = (waterMarkerPositon.y - this.f.height()) + 5;
        canvas.drawText(this.f2464a, ((this.f2465b - this.f.width()) / 2) + i, iHeight, this.e);
        float f = i;
        float fHeight = iHeight + (this.f.height() - 5);
        canvas.drawLine(f, fHeight - (this.h * 2.0f), f, fHeight + y.f3319b, this.d);
        canvas.drawLine(f, fHeight, this.f2465b + i, fHeight, this.d);
        float f2 = i + this.f2465b;
        canvas.drawLine(f2, fHeight - (this.h * 2.0f), f2, fHeight + y.f3319b, this.d);
    }

    private void a(String str) {
        this.f2464a = str;
    }

    private void a(int i) {
        this.f2465b = i;
    }

    public final void a(boolean z) {
        if (z) {
            setVisibility(0);
            b();
        } else {
            a("");
            a(0);
            setVisibility(8);
        }
    }

    public final void b() {
        IAMapDelegate iAMapDelegate = this.f2466c;
        if (iAMapDelegate == null) {
            return;
        }
        try {
            int engineIDWithType = iAMapDelegate.getGLMapEngine().getEngineIDWithType(1);
            float preciseLevel = this.f2466c.getPreciseLevel(engineIDWithType);
            this.f2466c.getGeoCenter(engineIDWithType, this.g);
            IPoint iPoint = this.g;
            if (iPoint == null) {
                return;
            }
            DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(iPoint.x, this.g.y, 20);
            float mapZoomScale = this.f2466c.getMapZoomScale();
            double dCos = (float) ((((Math.cos((dPointPixelsToLatLong.y * 3.141592653589793d) / 180.0d) * 2.0d) * 3.141592653589793d) * 6378137.0d) / (Math.pow(2.0d, preciseLevel) * 256.0d));
            int i = this.i[(int) preciseLevel];
            int i2 = (int) (((double) i) / (dCos * ((double) mapZoomScale)));
            String strA = eb.a(i);
            a(i2);
            a(strA);
            dPointPixelsToLatLong.recycle();
            invalidate();
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImpGLSurfaceView", "changeScaleState");
            th.printStackTrace();
        }
    }
}
