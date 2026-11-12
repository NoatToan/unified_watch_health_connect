package l03;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import j03.r;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class f extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f108028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f108029b = h.f108035a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f108030c = h.f108037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f108031d;

    public f(r rVar, int i14) {
        this.f108028a = rVar;
        this.f108031d = i14;
    }

    public final void a(TextPaint textPaint) {
        this.f108028a.getClass();
        textPaint.setFakeBoldText(true);
        float[] fArr = r.f96188g;
        int length = fArr.length;
        int i14 = this.f108031d;
        if (length >= i14) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i14 - 1]);
        } else {
            Locale locale = Locale.US;
            vb.h.z(o2.c.e(i14, "Supplied heading level: ", " is invalid, where configured heading sizes are: `", Arrays.toString(fArr), "`"));
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i14, int i15, int i16, int i17, int i18, CharSequence charSequence, int i19, int i24, boolean z14, Layout layout) {
        int width;
        int i25 = this.f108031d;
        if ((i25 == 1 || i25 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i24) {
            Paint paint2 = this.f108030c;
            paint2.set(paint);
            r rVar = this.f108028a;
            rVar.getClass();
            paint2.setColor(p03.a.a(paint2.getColor(), 75));
            paint2.setStyle(Paint.Style.FILL);
            int i26 = rVar.f96193e;
            if (i26 >= 0) {
                paint2.setStrokeWidth(i26);
            }
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i27 = (int) ((i18 - strokeWidth) + 0.5f);
                if (i15 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i14;
                    i14 -= canvas.getWidth();
                }
                Rect rect = this.f108029b;
                rect.set(i14, i27, width, i18);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z14) {
        return 0;
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
