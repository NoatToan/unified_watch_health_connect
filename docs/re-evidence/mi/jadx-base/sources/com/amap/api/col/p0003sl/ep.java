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
import com.miui.tsmclient.model.ErrorCode;
import com.tencent.wcdb.database.SQLiteDatabase;
import defpackage.m2t;
import defpackage.ugt;
import defpackage.zls;
import defpackage.zns;

/* JADX INFO: loaded from: classes4.dex */
public final class ep extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6047b;
    public IAMapDelegate c;
    public Paint d;
    public Paint e;
    public Rect f;
    public IPoint g;
    public float h;
    public final int[] i;

    public ep(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.f6046a = "";
        this.f6047b = 0;
        this.h = 0.0f;
        this.i = new int[]{10000000, GmsVersion.VERSION_LONGHORN, 2000000, 1000000, 500000, 200000, 100000, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 30000, ErrorCode.ERROR_CODE_INVALID_PARAM, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5};
        this.c = iAMapDelegate;
        this.d = new Paint();
        this.f = new Rect();
        this.d.setAntiAlias(true);
        this.d.setColor(-16777216);
        this.d.setStrokeWidth(ugt.f35750b * 2.0f);
        this.d.setStyle(Paint.Style.STROKE);
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setColor(-16777216);
        this.e.setTextSize(ugt.f35750b * 20.0f);
        this.h = zls.a(context, 1.0f);
        this.g = new IPoint();
    }

    public final void a() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.f6046a = null;
        this.g = null;
    }

    public final void b(int i) {
        this.f6047b = i;
    }

    public final void c(String str) {
        this.f6046a = str;
    }

    public final void d(boolean z) {
        if (z) {
            setVisibility(0);
            e();
        } else {
            c("");
            b(0);
            setVisibility(8);
        }
    }

    public final void e() {
        IAMapDelegate iAMapDelegate = this.c;
        if (iAMapDelegate == null) {
            return;
        }
        try {
            int engineIDWithType = iAMapDelegate.getGLMapEngine().getEngineIDWithType(1);
            float preciseLevel = this.c.getPreciseLevel(engineIDWithType);
            this.c.getGeoCenter(engineIDWithType, this.g);
            IPoint iPoint = this.g;
            if (iPoint == null) {
                return;
            }
            DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(((Point) iPoint).x, ((Point) iPoint).y, 20);
            float mapZoomScale = this.c.getMapZoomScale();
            double dCos = (float) ((((Math.cos((dPointPixelsToLatLong.y * 3.141592653589793d) / 180.0d) * 2.0d) * 3.141592653589793d) * 6378137.0d) / (Math.pow(2.0d, preciseLevel) * 256.0d));
            int i = this.i[(int) preciseLevel];
            int i2 = (int) (((double) i) / (dCos * ((double) mapZoomScale)));
            String strU = zns.u(i);
            b(i2);
            c(strU);
            dPointPixelsToLatLong.recycle();
            invalidate();
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImpGLSurfaceView", "changeScaleState");
            th.printStackTrace();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Point waterMarkerPositon;
        String str = this.f6046a;
        if (str == null || "".equals(str) || this.f6047b == 0 || (waterMarkerPositon = this.c.getWaterMarkerPositon()) == null) {
            return;
        }
        Paint paint = this.e;
        String str2 = this.f6046a;
        paint.getTextBounds(str2, 0, str2.length(), this.f);
        int i = waterMarkerPositon.x;
        int iHeight = (waterMarkerPositon.y - this.f.height()) + 5;
        canvas.drawText(this.f6046a, ((this.f6047b - this.f.width()) / 2) + i, iHeight, this.e);
        float f = i;
        float fHeight = iHeight + (this.f.height() - 5);
        canvas.drawLine(f, fHeight - (this.h * 2.0f), f, fHeight + ugt.f35750b, this.d);
        canvas.drawLine(f, fHeight, this.f6047b + i, fHeight, this.d);
        int i2 = this.f6047b;
        canvas.drawLine(i + i2, fHeight - (this.h * 2.0f), i + i2, fHeight + ugt.f35750b, this.d);
    }
}
