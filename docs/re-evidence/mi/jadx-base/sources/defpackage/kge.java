package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class kge extends q57<LinearProgressIndicatorSpec> {
    public float c;
    public float d;
    public float e;

    public kge(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.c = 300.0f;
    }

    @Override // defpackage.q57
    public void a(Canvas canvas, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.c = clipBounds.width();
        float f2 = ((LinearProgressIndicatorSpec) this.f31128a).f17585a;
        canvas.translate(clipBounds.left + (clipBounds.width() / 2.0f), clipBounds.top + (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - ((LinearProgressIndicatorSpec) this.f31128a).f17585a) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f31128a).i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f31129b.j() && ((LinearProgressIndicatorSpec) this.f31128a).e == 1) || (this.f31129b.i() && ((LinearProgressIndicatorSpec) this.f31128a).f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f31129b.j() || this.f31129b.i()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f31128a).f17585a * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f31128a;
        this.d = ((LinearProgressIndicatorSpec) s).f17585a * f;
        this.e = ((LinearProgressIndicatorSpec) s).f17586b * f;
    }

    @Override // defpackage.q57
    public void b(Canvas canvas, Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.c;
        float f4 = this.e;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f5 = this.d;
        RectF rectF = new RectF(((-f3) / 2.0f) + (f * (f3 - (f4 * 2.0f))), (-f5) / 2.0f, ((-f3) / 2.0f) + (f2 * (f3 - (f4 * 2.0f))) + (f4 * 2.0f), f5 / 2.0f);
        float f6 = this.e;
        canvas.drawRoundRect(rectF, f6, f6, paint);
    }

    @Override // defpackage.q57
    public void c(Canvas canvas, Paint paint) {
        int iA = i8f.a(((LinearProgressIndicatorSpec) this.f31128a).d, this.f31129b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iA);
        float f = this.c;
        float f2 = this.d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // defpackage.q57
    public int d() {
        return ((LinearProgressIndicatorSpec) this.f31128a).f17585a;
    }

    @Override // defpackage.q57
    public int e() {
        return -1;
    }
}
