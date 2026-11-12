package com.mi.health.map.data;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.i5f;
import defpackage.o8p;
import defpackage.odb;
import defpackage.vii;
import defpackage.x44;
import defpackage.ymq;

/* JADX INFO: loaded from: classes5.dex */
public class LocationMarker extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Path f10021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f10022b;
    public Paint c;
    public ymq d;
    public ymq e;
    public odb f;
    public odb g;
    public Context h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i5f f10023k;

    public LocationMarker(Context context, i5f i5fVar) {
        super(context);
        this.j = 0.55191505f;
        this.h = context;
        this.f10023k = i5fVar;
        i();
    }

    public final void a(float f) {
        this.i = this.j * f;
        this.f.a(f);
        float f2 = -f;
        this.g.a(f2);
        odb odbVar = this.g;
        odb odbVar2 = this.f;
        odbVar2.f29033a = 0.0f;
        odbVar.f29033a = 0.0f;
        PointF pointF = odbVar.c;
        float f3 = this.i;
        pointF.x = -f3;
        odbVar.d.x = f3;
        odbVar2.c.x = (-f3) * 0.36f;
        odbVar2.d.x = f3 * 0.36f;
        this.d.a(f);
        this.e.a(f2);
        ymq ymqVar = this.d;
        ymq ymqVar2 = this.e;
        ymqVar2.f40339b = 0.0f;
        ymqVar.f40339b = 0.0f;
        PointF pointF2 = ymqVar.c;
        PointF pointF3 = ymqVar2.c;
        float f4 = this.i;
        float f5 = -f4;
        pointF3.y = f5;
        pointF2.y = f5;
        PointF pointF4 = ymqVar.d;
        ymqVar2.d.y = f4;
        pointF4.y = f4;
    }

    public final void b(Canvas canvas, int i, Path path) {
        int color = this.f10022b.getColor();
        this.f10022b.setColor(i);
        canvas.drawPath(path, this.f10022b);
        this.f10022b.setColor(color);
    }

    public final void c(Canvas canvas, int i, Path path) {
        int color = this.f10022b.getColor();
        Paint.Style style = this.f10022b.getStyle();
        float strokeWidth = this.f10022b.getStrokeWidth();
        this.f10022b.setStyle(Paint.Style.STROKE);
        this.f10022b.setStrokeWidth(1.5f);
        this.f10022b.setColor(i);
        canvas.drawPath(path, this.f10022b);
        this.f10022b.setStyle(style);
        this.f10022b.setStrokeWidth(strokeWidth);
        this.f10022b.setColor(color);
    }

    public final void d(Canvas canvas) {
        if (this.f10023k.f20803k) {
            RectF rectF = new RectF();
            int i = this.f10023k.f20801a;
            odb odbVar = this.f;
            float f = odbVar.f29033a;
            float f2 = i / 2.0f;
            float f3 = odbVar.f29034b;
            float f4 = (i / 4) / 2.0f;
            rectF.set(f - f2, f3 - f4, f + f2, f3 + f4);
            int color = this.f10022b.getColor();
            this.f10022b.setColor(x44.a(vii.f36928b));
            canvas.drawOval(rectF, this.f10022b);
            this.f10022b.setColor(color);
        }
    }

    public final void e(Canvas canvas) {
        if (this.f10023k.f20803k) {
            Path path = new Path();
            odb odbVar = this.g;
            float f = odbVar.f29033a;
            float f2 = odbVar.f29034b;
            i5f i5fVar = this.f10023k;
            path.addCircle(f, f2 + i5fVar.f20801a, i5fVar.f20802b + 1.0f, Path.Direction.CCW);
            c(canvas, x44.a(this.f10023k.i), path);
        }
    }

    public final void f(Canvas canvas, String str) {
        RectF rectF = new RectF();
        float fMeasureText = this.c.measureText(str);
        float f = this.g.f29033a;
        float f2 = fMeasureText / 2.0f;
        rectF.set(f - f2, this.d.f40339b + DisplayUtil.dip2px(2.0f), f + f2, this.d.f40339b + o8p.i(this.c));
        Paint.FontMetrics fontMetrics = this.c.getFontMetrics();
        canvas.drawText(str, rectF.left, (int) (rectF.centerY() + ((fontMetrics.top + fontMetrics.bottom) / 2.0f)), this.c);
    }

    public final void g(Canvas canvas, int i) {
        canvas.save();
        float f = i;
        Path pathH = h(f);
        Path pathH2 = h(1.0f + f);
        Path path = new Path();
        odb odbVar = this.g;
        path.addCircle(odbVar.f29033a, odbVar.f29034b + f, this.f10023k.f20802b, Path.Direction.CCW);
        pathH.op(path, Path.Op.DIFFERENCE);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        d(canvas);
        b(canvas, x44.a(this.f10023k.h), pathH);
        b(canvas, x44.a(this.f10023k.j), path);
        e(canvas);
        c(canvas, x44.a(this.f10023k.i), pathH2);
        f(canvas, this.f10023k.e);
        canvas.restore();
    }

    public final Path h(float f) {
        a(f);
        Path path = new Path();
        odb odbVar = this.f;
        float f2 = f * 0.2f * 1.05f;
        odbVar.a(odbVar.f29034b + f2);
        odb odbVar2 = this.f;
        float f3 = odbVar2.f29034b + f2;
        odbVar2.f29034b = f3;
        path.moveTo(odbVar2.f29033a, f3);
        PointF pointF = this.f.d;
        float f4 = pointF.x;
        float f5 = pointF.y;
        ymq ymqVar = this.d;
        PointF pointF2 = ymqVar.d;
        path.cubicTo(f4, f5, pointF2.x, pointF2.y, ymqVar.f40338a, ymqVar.f40339b);
        PointF pointF3 = this.d.c;
        float f6 = pointF3.x;
        float f7 = pointF3.y;
        odb odbVar3 = this.g;
        PointF pointF4 = odbVar3.d;
        path.cubicTo(f6, f7, pointF4.x, pointF4.y, odbVar3.f29033a, odbVar3.f29034b);
        PointF pointF5 = this.g.c;
        float f8 = pointF5.x;
        float f9 = pointF5.y;
        ymq ymqVar2 = this.e;
        PointF pointF6 = ymqVar2.c;
        path.cubicTo(f8, f9, pointF6.x, pointF6.y, ymqVar2.f40338a, ymqVar2.f40339b);
        PointF pointF7 = this.e.d;
        float f10 = pointF7.x;
        float f11 = pointF7.y;
        odb odbVar4 = this.f;
        PointF pointF8 = odbVar4.c;
        path.cubicTo(f10, f11, pointF8.x, pointF8.y, odbVar4.f29033a, odbVar4.f29034b);
        path.close();
        return path;
    }

    public final void i() {
        Paint paint = new Paint();
        this.f10022b = paint;
        paint.setColor(-1);
        this.f10022b.setStyle(Paint.Style.FILL);
        this.f10022b.setStrokeWidth(1.0f);
        this.f10022b.setAntiAlias(true);
        this.f10021a = new Path();
        this.d = new ymq();
        this.e = new ymq();
        this.f = new odb();
        this.g = new odb();
        this.i = this.f10023k.f20801a * this.j;
        j();
    }

    public final void j() {
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(-1);
        this.c.setStyle(Paint.Style.FILL);
        this.c.setStrokeWidth(1.0f);
        this.c.setAntiAlias(true);
        this.c.setTypeface(Typeface.DEFAULT_BOLD);
        this.c.setTextSize(DisplayUtil.sp2px(this.h, this.f10023k.c));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f10021a.reset();
        canvas.translate(getWidth() / 2, getHeight() / 2);
        g(canvas, this.f10023k.f20801a);
    }
}
