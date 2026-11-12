package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class pad extends q22 {
    public o93 e;
    public Paint g;
    public int h;
    public int f = 255;
    public Paint c = p();
    public Paint d = p();
    public cdp i = cdp.a();

    public pad(o93 o93Var) {
        this.e = o93Var;
        q();
    }

    private void l(Canvas canvas, RectF rectF, int i, LocalDate localDate, boolean z) {
        if (z) {
            this.c.setColor(this.e.f28880b);
        } else {
            this.c.setColor(this.e.f28879a);
        }
        int i2 = this.e.V;
        if (i2 != -1) {
            o8p.j(this.c, i2);
        }
        this.c.setAlpha(i);
        this.c.setTextSize(this.e.j);
        cdp cdpVar = this.i;
        if (cdpVar.f5229a < 1.0f || cdpVar.f5230b < 1.0f || cdpVar.c < 1.0f) {
            canvas.drawText(localDate.getDayOfMonth() + "", rectF.centerX(), this.e.n ? rectF.centerY() : o(rectF) + DisplayUtil.dip2px(5.0f), this.c);
            return;
        }
        Drawable drawable = AppUtil.getApp().getDrawable(loi.s);
        float fDip2px = DisplayUtil.dip2px(18.0f);
        int iCenterY = ((int) (this.e.n ? rectF.centerY() : (o(rectF) + DisplayUtil.dip2px(5.0f)) - fDip2px)) + DisplayUtil.dip2px(4.0f);
        float f = fDip2px / 2.0f;
        drawable.setBounds((int) (rectF.centerX() - f), iCenterY, (int) (rectF.centerX() + f), (int) (iCenterY + fDip2px));
        drawable.draw(canvas);
    }

    private void n(Canvas canvas, RectF rectF, int i, LocalDate localDate, boolean z) {
        if (z) {
            this.c.setColor(this.e.d);
            k(canvas, rectF);
        } else {
            this.c.setColor(this.e.c);
        }
        int i2 = this.e.V;
        if (i2 != -1) {
            o8p.j(this.c, i2);
        }
        this.c.setAlpha(i);
        this.c.setTextSize(this.e.j);
        canvas.drawText(localDate.getDayOfMonth() + "", rectF.centerX(), this.e.n ? rectF.centerY() : o(rectF) + DisplayUtil.dip2px(5.0f), this.c);
    }

    private int o(RectF rectF) {
        Paint.FontMetrics fontMetrics = this.c.getFontMetrics();
        return (int) ((rectF.centerY() - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
    }

    @Override // defpackage.q22, defpackage.y93
    public void b(Canvas canvas, RectF rectF, cdp cdpVar) {
        super.b(canvas, rectF, cdpVar);
        StringBuilder sb = new StringBuilder();
        sb.append(" CircleModel:");
        sb.append(cdpVar);
        this.i = cdpVar;
        m(canvas, new PointF(rectF.left, rectF.top), rectF.width());
    }

    @Override // defpackage.y93
    public void c(Canvas canvas, RectF rectF, LocalDate localDate) {
        l(canvas, rectF, this.e.O, localDate, false);
    }

    @Override // defpackage.y93
    public void d(Canvas canvas, RectF rectF, LocalDate localDate, boolean z) {
        n(canvas, rectF, this.f, localDate, z);
    }

    @Override // defpackage.y93
    public void e(Canvas canvas, RectF rectF, LocalDate localDate, boolean z) {
        if (!z) {
            l(canvas, rectF, this.f, localDate, false);
        } else {
            l(canvas, rectF, this.f, localDate, true);
            k(canvas, rectF);
        }
    }

    @Override // defpackage.y93
    public void f(Canvas canvas, RectF rectF, LocalDate localDate) {
        l(canvas, rectF, this.e.N, localDate, false);
    }

    public final void h(Canvas canvas, PointF pointF, float f, float f2, float f3) {
        canvas.save();
        int color = this.g.getColor();
        Path path = new Path();
        float f4 = pointF.x;
        float f5 = pointF.y;
        RectF rectF = new RectF(f4 + f2, f5 + f2, (f4 + f) - f2, (f5 + f) - f2);
        path.arcTo(rectF, 180.0f, 180.0f, true);
        this.g.setColor(this.i.d);
        this.g.setAlpha(this.h);
        this.g.setStrokeWidth(f3);
        canvas.drawPath(path, this.g);
        Path path2 = new Path();
        path2.arcTo(rectF, 180.0f, this.i.f5229a * 180.0f, true);
        this.g.setStrokeWidth(f3);
        this.g.setAlpha(255);
        canvas.drawPath(path2, this.g);
        this.g.setColor(color);
        canvas.restore();
    }

    public final void i(Canvas canvas, PointF pointF, float f, float f2, float f3, float f4) {
        canvas.save();
        float f5 = pointF.x;
        float f6 = f5 + f2 + f3;
        float f7 = pointF.y;
        float f8 = f7 + f2 + f3;
        float f9 = f2 + f3;
        RectF rectF = new RectF(f6, f8, (f5 + f) - f9, (f7 + f) - f9);
        Path path = new Path();
        path.arcTo(rectF, 180.0f, 180.0f, true);
        this.g.setColor(this.i.e);
        this.g.setAlpha(this.h);
        this.g.setStrokeWidth(f4);
        canvas.drawPath(path, this.g);
        Path path2 = new Path();
        path2.arcTo(rectF, 180.0f, this.i.f5230b * 180.0f, true);
        this.g.setStrokeWidth(f4);
        this.g.setAlpha(255);
        canvas.drawPath(path2, this.g);
        canvas.restore();
    }

    public final void j(Canvas canvas, PointF pointF, float f, float f2, float f3, float f4) {
        canvas.save();
        float f5 = pointF.x;
        float f6 = f3 * 2.0f;
        float f7 = f5 + f2 + f6;
        float f8 = pointF.y;
        float f9 = f8 + f2 + f6;
        float f10 = f2 + f6;
        RectF rectF = new RectF(f7, f9, (f5 + f) - f10, (f8 + f) - f10);
        Path path = new Path();
        path.arcTo(rectF, 180.0f, 180.0f, true);
        this.g.setStrokeWidth(f4);
        this.g.setColor(this.i.f);
        this.g.setAlpha(this.h);
        canvas.drawPath(path, this.g);
        Path path2 = new Path();
        path2.arcTo(rectF, 180.0f, this.i.c * 180.0f, true);
        this.g.setStrokeWidth(f4);
        this.g.setAlpha(255);
        canvas.drawPath(path2, this.g);
        canvas.restore();
    }

    public final void k(Canvas canvas, RectF rectF) {
        int color = this.c.getColor();
        this.c.setColor(this.e.f28880b);
        canvas.drawCircle(rectF.centerX(), (int) (rectF.centerY() + ((this.c.descent() - this.c.ascent()) / 2.0f) + DisplayUtil.dip2px(6.0f) + y93.f39947b), y93.f39946a, this.c);
        this.c.setColor(color);
    }

    public final void m(Canvas canvas, PointF pointF, float f) {
        float f2 = f / 6.5f;
        float f3 = f2 / 2.0f;
        float f4 = f2 - (f2 / 7.5f);
        h(canvas, pointF, f, f3, f4);
        i(canvas, pointF, f, f3, f2, f4);
        j(canvas, pointF, f, f3, f2, f4);
    }

    public Paint p() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        return paint;
    }

    public final void q() {
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.g.setStrokeCap(Paint.Cap.BUTT);
        this.h = 51;
    }
}
