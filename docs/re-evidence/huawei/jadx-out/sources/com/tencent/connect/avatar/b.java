package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.autonavi.amap.mapcore.tools.GlMapUtil;

/* JADX INFO: loaded from: classes46.dex */
public class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f30914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f30915b;

    public b(Context context) {
        super(context);
        b();
    }

    private void b() {
        this.f30915b = new Paint();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rectA = a();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f30915b.setStyle(Paint.Style.FILL);
        this.f30915b.setColor(Color.argb(100, 0, 0, 0));
        float f = measuredWidth;
        canvas.drawRect(0.0f, 0.0f, f, rectA.top, this.f30915b);
        canvas.drawRect(0.0f, rectA.bottom, f, measuredHeight, this.f30915b);
        canvas.drawRect(0.0f, rectA.top, rectA.left, rectA.bottom, this.f30915b);
        canvas.drawRect(rectA.right, rectA.top, f, rectA.bottom, this.f30915b);
        canvas.drawColor(Color.argb(100, 0, 0, 0));
        this.f30915b.setStyle(Paint.Style.STROKE);
        this.f30915b.setColor(-1);
        canvas.drawRect(rectA.left, rectA.top, rectA.right - 1, rectA.bottom, this.f30915b);
    }

    public Rect a() {
        if (this.f30914a == null) {
            this.f30914a = new Rect();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int iMin = Math.min(Math.min(measuredHeight - 140, measuredWidth), GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH);
            int i = (measuredWidth - iMin) / 2;
            int i2 = (measuredHeight - iMin) / 2;
            this.f30914a.set(i, i2, i + iMin, iMin + i2);
        }
        return this.f30914a;
    }
}
