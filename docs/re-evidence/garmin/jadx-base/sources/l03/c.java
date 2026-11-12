package l03;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import j03.r;

/* JADX INFO: loaded from: classes3.dex */
public class c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f108024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f108025b = h.f108035a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f108026c = h.f108037c;

    public c(r rVar) {
        this.f108024a = rVar;
    }

    public final void a(TextPaint textPaint) {
        this.f108024a.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i14, int i15, int i16, int i17, int i18, CharSequence charSequence, int i19, int i24, boolean z14, Layout layout) {
        int width;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.f108026c;
        paint2.setStyle(style);
        this.f108024a.getClass();
        paint2.setColor(p03.a.a(paint.getColor(), 25));
        if (i15 > 0) {
            width = canvas.getWidth();
        } else {
            i14 -= canvas.getWidth();
            width = i14;
        }
        Rect rect = this.f108025b;
        rect.set(i14, i16, width, i18);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z14) {
        return this.f108024a.f96192d;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
