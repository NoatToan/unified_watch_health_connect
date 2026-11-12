package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes16.dex */
public class qli extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Typeface f46440b;

    public qli(Typeface typeface) {
        this.f46440b = typeface;
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        b(textPaint);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        b(textPaint);
    }

    private void b(Paint paint) {
        if (paint == null || this.f46440b == null) {
            return;
        }
        Typeface typeface = paint.getTypeface();
        int style = (typeface != null ? typeface.getStyle() : 0) & (~this.f46440b.getStyle());
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(this.f46440b);
    }
}
