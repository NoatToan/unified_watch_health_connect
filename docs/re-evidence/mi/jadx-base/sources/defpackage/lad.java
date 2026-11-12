package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class lad extends q22 {
    public o93 c;
    public int f = 255;
    public Paint d = l();
    public Paint e = l();

    public lad(o93 o93Var) {
        this.c = o93Var;
    }

    private Paint l() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        return paint;
    }

    @Override // defpackage.q22, defpackage.y93
    public void a(Canvas canvas, RectF rectF) {
        canvas.drawCircle(rectF.centerX(), (int) (rectF.centerY() + ((this.d.descent() - this.d.ascent()) / 2.0f) + y93.f39947b), y93.f39946a, this.d);
    }

    @Override // defpackage.y93
    public void c(Canvas canvas, RectF rectF, LocalDate localDate) {
        h(canvas, rectF, this.c.O, localDate);
    }

    @Override // defpackage.y93
    public void d(Canvas canvas, RectF rectF, LocalDate localDate, boolean z) {
        i(canvas, rectF, localDate, z);
    }

    @Override // defpackage.y93
    public void e(Canvas canvas, RectF rectF, LocalDate localDate, boolean z) {
        h(canvas, rectF, this.f, localDate);
    }

    @Override // defpackage.y93
    public void f(Canvas canvas, RectF rectF, LocalDate localDate) {
        h(canvas, rectF, this.c.N, localDate);
    }

    @Override // defpackage.q22
    public void g(Canvas canvas, RectF rectF, int i, int i2, boolean z) {
        j(canvas, rectF, i, i2, z);
    }

    public final void h(Canvas canvas, RectF rectF, int i, LocalDate localDate) {
        this.d.setColor(this.c.f28879a);
        this.d.setAlpha(i);
        this.d.setTextSize(this.c.j);
        int i2 = this.c.V;
        if (i2 != -1) {
            o8p.j(this.d, i2);
        }
        canvas.drawText(localDate.getDayOfMonth() + "", rectF.centerX(), this.c.n ? rectF.centerY() : k(rectF), this.d);
    }

    public final void i(Canvas canvas, RectF rectF, LocalDate localDate, boolean z) {
        if (z) {
            this.d.setColor(this.c.d);
        } else {
            this.d.setColor(this.c.f28879a);
        }
        int i = this.c.V;
        if (i != -1) {
            o8p.j(this.d, i);
        }
        this.d.setTextSize(this.c.j);
        canvas.drawText(localDate.getDayOfMonth() + "", rectF.centerX(), this.c.n ? rectF.centerY() : k(rectF), this.d);
    }

    public void j(Canvas canvas, RectF rectF, int i, int i2, boolean z) {
        if (z) {
            this.e.setStyle(Paint.Style.FILL);
            this.e.setColor(this.c.u);
        } else {
            this.e.setStyle(Paint.Style.STROKE);
            this.e.setStrokeWidth(3.0f);
            this.e.setColor(this.c.t);
        }
        canvas.drawRoundRect(rectF, i, i2, this.e);
    }

    public final int k(RectF rectF) {
        Paint.FontMetrics fontMetrics = this.d.getFontMetrics();
        return (int) ((rectF.centerY() - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
    }
}
