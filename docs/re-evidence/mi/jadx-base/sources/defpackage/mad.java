package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class mad extends q22 {
    public o93 c;
    public int f = 255;
    public Paint d = l();
    public Paint e = l();

    public mad(o93 o93Var) {
        this.c = o93Var;
    }

    private int k(RectF rectF) {
        Paint.FontMetrics fontMetrics = this.d.getFontMetrics();
        return (int) ((rectF.centerY() - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
    }

    @Override // defpackage.q22, defpackage.y93
    public void a(Canvas canvas, RectF rectF) {
        canvas.drawCircle(rectF.centerX(), (int) (rectF.centerY() + ((this.d.descent() - this.d.ascent()) / 2.0f) + y93.f39947b), y93.f39946a, this.d);
    }

    @Override // defpackage.y93
    public void c(Canvas canvas, RectF rectF, LocalDate localDate) {
        h(canvas, rectF, this.c.O, localDate, false);
    }

    @Override // defpackage.y93
    public void d(Canvas canvas, RectF rectF, LocalDate localDate, boolean z) {
        this.d.setColor(this.c.v);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.c.m, this.d);
        j(canvas, rectF, this.f, localDate, z);
    }

    @Override // defpackage.y93
    public void e(Canvas canvas, RectF rectF, LocalDate localDate, boolean z) {
        if (!z) {
            h(canvas, rectF, this.f, localDate, false);
        } else {
            i(canvas, rectF, true);
            h(canvas, rectF, this.f, localDate, true);
        }
    }

    @Override // defpackage.y93
    public void f(Canvas canvas, RectF rectF, LocalDate localDate) {
        h(canvas, rectF, this.c.N, localDate, false);
    }

    public final void h(Canvas canvas, RectF rectF, int i, LocalDate localDate, boolean z) {
        if (z) {
            this.d.setColor(this.c.f28880b);
        } else {
            this.d.setColor(this.c.f28879a);
        }
        int i2 = this.c.V;
        if (i2 != -1) {
            o8p.j(this.d, i2);
        }
        this.d.setAlpha(i);
        this.d.setTextSize(this.c.j);
        canvas.drawText(localDate.getDayOfMonth() + "", rectF.centerX(), this.c.n ? rectF.centerY() : k(rectF), this.d);
    }

    public final void i(Canvas canvas, RectF rectF, boolean z) {
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setStrokeWidth(this.c.w);
        if (z) {
            this.e.setColor(this.c.i);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.c.m, this.e);
            return;
        }
        float strokeWidth = this.e.getStrokeWidth();
        Paint.Style style = this.e.getStyle();
        int color = this.e.getColor();
        this.e.setStyle(Paint.Style.FILL);
        this.e.setColor(this.c.u);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.c.m, this.e);
        this.e.setStyle(style);
        this.e.setColor(color);
        this.e.setStrokeWidth(strokeWidth);
    }

    public final void j(Canvas canvas, RectF rectF, int i, LocalDate localDate, boolean z) {
        if (z) {
            this.d.setColor(this.c.d);
        } else {
            this.d.setColor(this.c.c);
        }
        int i2 = this.c.V;
        if (i2 != -1) {
            o8p.j(this.d, i2);
        }
        this.d.setAlpha(i);
        this.d.setTextSize(this.c.j);
        canvas.drawText(localDate.getDayOfMonth() + "", rectF.centerX(), this.c.n ? rectF.centerY() : k(rectF), this.d);
    }

    public Paint l() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        return paint;
    }
}
