package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes6.dex */
public class ne5 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f27845a;

    public ne5(Typeface typeface) {
        this.f27845a = typeface;
    }

    public final void a(Paint paint) {
        Typeface typeface = paint.getTypeface();
        int style = typeface != null ? typeface.getStyle() : 0;
        Typeface typeface2 = this.f27845a;
        if (typeface2 == null) {
            paint.setTypeface(typeface);
            return;
        }
        int i = (~typeface2.getStyle()) & style;
        if ((i & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(this.f27845a);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
