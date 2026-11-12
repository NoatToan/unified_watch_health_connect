package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class sw3 extends q57<CircularProgressIndicatorSpec> {
    public int c;
    public float d;
    public float e;
    public float f;

    public sw3(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.c = 1;
    }

    @Override // defpackage.q57
    public void a(Canvas canvas, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        S s = this.f31128a;
        float f2 = (((CircularProgressIndicatorSpec) s).g / 2.0f) + ((CircularProgressIndicatorSpec) s).h;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        S s2 = this.f31128a;
        this.c = ((CircularProgressIndicatorSpec) s2).i == 0 ? 1 : -1;
        this.d = ((CircularProgressIndicatorSpec) s2).f17585a * f;
        this.e = ((CircularProgressIndicatorSpec) s2).f17586b * f;
        this.f = (((CircularProgressIndicatorSpec) s2).g - ((CircularProgressIndicatorSpec) s2).f17585a) / 2.0f;
        if ((this.f31129b.j() && ((CircularProgressIndicatorSpec) this.f31128a).e == 2) || (this.f31129b.i() && ((CircularProgressIndicatorSpec) this.f31128a).f == 1)) {
            this.f += ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f31128a).f17585a) / 2.0f;
        } else if ((this.f31129b.j() && ((CircularProgressIndicatorSpec) this.f31128a).e == 1) || (this.f31129b.i() && ((CircularProgressIndicatorSpec) this.f31128a).f == 2)) {
            this.f -= ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f31128a).f17585a) / 2.0f;
        }
    }

    @Override // defpackage.q57
    public void b(Canvas canvas, Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.d);
        int i2 = this.c;
        float f3 = f * 360.0f * i2;
        float f4 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * i2;
        float f5 = this.f;
        canvas.drawArc(new RectF(-f5, -f5, f5, f5), f3, f4, false, paint);
        if (this.e <= 0.0f || Math.abs(f4) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        h(canvas, paint, this.d, this.e, f3);
        h(canvas, paint, this.d, this.e, f3 + f4);
    }

    @Override // defpackage.q57
    public void c(Canvas canvas, Paint paint) {
        int iA = i8f.a(((CircularProgressIndicatorSpec) this.f31128a).d, this.f31129b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iA);
        paint.setStrokeWidth(this.d);
        float f = this.f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // defpackage.q57
    public int d() {
        return i();
    }

    @Override // defpackage.q57
    public int e() {
        return i();
    }

    public final void h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    public final int i() {
        S s = this.f31128a;
        return ((CircularProgressIndicatorSpec) s).g + (((CircularProgressIndicatorSpec) s).h * 2);
    }
}
