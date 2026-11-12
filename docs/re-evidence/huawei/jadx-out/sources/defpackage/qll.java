package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes43.dex */
public class qll extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f46446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46447c;
    private int d;
    int e;
    private int f;
    private int g;
    private Paint h;
    private int i;
    private float j;
    private int o;

    private qll(d dVar) {
        this.d = dVar.e;
        this.j = dVar.j;
        this.g = dVar.f46448a;
        this.f46445a = dVar.f46450c;
        this.i = dVar.d;
        this.o = dVar.f;
        this.f = dVar.h;
        this.f46447c = dVar.f46449b;
        c();
        e();
    }

    private void e() {
        Paint paint = new Paint();
        this.f46446b = paint;
        paint.setColor(this.d);
        this.f46446b.setAntiAlias(true);
        this.f46446b.setStrokeWidth(this.j);
        this.f46446b.setStyle(Paint.Style.STROKE);
    }

    private void c() {
        TextPaint textPaint = new TextPaint();
        this.h = textPaint;
        textPaint.setColor(this.f);
        this.h.setTextSize(this.o);
        this.h.setAntiAlias(true);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return a(charSequence, i, i2);
    }

    private int b(CharSequence charSequence, int i, int i2) {
        if (charSequence.length() <= 0) {
            return 0;
        }
        Rect rect = new Rect();
        this.h.getTextBounds(charSequence.toString(), i, i2, rect);
        int iWidth = rect.width() + (this.f46445a * 2);
        this.e = iWidth;
        return iWidth;
    }

    public int a(CharSequence charSequence, int i, int i2) {
        return b(charSequence, i, i2) + this.f46447c;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = (i4 + fontMetrics.descent) - ((fontMetrics.descent - fontMetrics.ascent) / 2.0f);
        Paint.FontMetrics fontMetrics2 = this.h.getFontMetrics();
        float f3 = fontMetrics2.descent - fontMetrics2.ascent;
        float f4 = f3 / 2.0f;
        int i6 = this.i;
        float f5 = (f2 - f4) - i6;
        float f6 = (this.j / 2.0f) + f;
        RectF rectF = new RectF(f6, f5, this.e + f6, f3 + f5 + (i6 * 2));
        float f7 = this.g;
        canvas.drawRoundRect(rectF, f7, f7, this.f46446b);
        canvas.drawText(charSequence.subSequence(i, i2).toString(), f + this.f46445a, f2 + (f4 - fontMetrics2.descent), this.h);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f46448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f46449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f46450c;
        private int d;
        private int e;
        private int f;
        private int h;
        private float j;

        public d c(int i) {
            this.e = i;
            return this;
        }

        public d j(int i) {
            this.h = i;
            return this;
        }

        public d i(int i) {
            this.f = i;
            return this;
        }

        public d a(float f) {
            this.j = f;
            return this;
        }

        public d e(int i) {
            this.f46448a = i;
            return this;
        }

        public d a(int i) {
            this.d = i;
            return this;
        }

        public d d(int i) {
            this.f46450c = i;
            return this;
        }

        public d b(int i) {
            this.f46449b = i;
            return this;
        }

        public qll c() {
            return new qll(this);
        }
    }
}
