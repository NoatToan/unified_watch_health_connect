package com.mi.health.map.data.sportmodel.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.i5f;
import defpackage.x44;

/* JADX INFO: loaded from: classes5.dex */
public class CircleMarker extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10027b;
    public int c;
    public Paint d;
    public Paint e;
    public int f;
    public i5f g;

    public CircleMarker(Context context, i5f i5fVar) {
        super(context);
        this.f10026a = 8;
        this.f = 8;
        this.g = i5fVar;
        b();
        a();
    }

    public final void a() {
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(x44.a(this.g.h));
        this.e.setStyle(Paint.Style.FILL);
        this.e.setAntiAlias(true);
    }

    public final void b() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(x44.a(this.g.j));
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(this.f);
        this.d.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float fDip2px = this.g.f20801a + DisplayUtil.dip2px(1.0f);
        float f = this.c / 2;
        float f2 = this.f10027b / 2;
        canvas.drawCircle(f, f2, fDip2px, this.d);
        canvas.drawCircle(f, f2, this.g.f20801a, this.e);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i5f i5fVar = this.g;
        this.f10027b = i5fVar.f;
        this.c = i5fVar.g;
    }
}
