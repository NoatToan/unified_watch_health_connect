package l03;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import j03.r;

/* JADX INFO: loaded from: classes3.dex */
public class b implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f108019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f108020b = h.f108037c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f108021c = h.f108036b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f108022d = h.f108035a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f108023e;

    public b(r rVar, int i14) {
        this.f108019a = rVar;
        this.f108023e = i14;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i14, int i15, int i16, int i17, int i18, CharSequence charSequence, int i19, int i24, boolean z14, Layout layout) {
        RectF rectF = this.f108021c;
        Rect rect = this.f108022d;
        if (z14 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i19) {
            Paint paint2 = this.f108020b;
            paint2.set(paint);
            r rVar = this.f108019a;
            rVar.getClass();
            int i25 = rVar.f96189a;
            paint2.setColor(paint2.getColor());
            int i26 = rVar.f96191c;
            if (i26 != 0) {
                paint2.setStrokeWidth(i26);
            }
            int iSave = canvas.save();
            try {
                int iMin = Math.min(i25, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i27 = (i25 - iMin) / 2;
                if (i15 <= 0) {
                    i14 -= i25;
                }
                int i28 = i14 + i27;
                int i29 = i28 + iMin;
                int iDescent = (i17 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iMin / 2);
                int i30 = iMin + iDescent;
                int i34 = this.f108023e;
                if (i34 == 0 || i34 == 1) {
                    rectF.set(i28, iDescent, i29, i30);
                    paint2.setStyle(i34 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(i28, iDescent, i29, i30);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z14) {
        return this.f108019a.f96189a;
    }
}
