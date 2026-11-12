package l03;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import j03.r;

/* JADX INFO: loaded from: classes3.dex */
public class i implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f108038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f108040c = h.f108037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f108041d;

    public i(r rVar, String str) {
        this.f108038a = rVar;
        this.f108039b = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i14, int i15, int i16, int i17, int i18, CharSequence charSequence, int i19, int i24, boolean z14, Layout layout) {
        int i25;
        if (z14 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i19) {
            Paint paint2 = this.f108040c;
            paint2.set(paint);
            r rVar = this.f108038a;
            rVar.getClass();
            paint2.setColor(paint2.getColor());
            int i26 = rVar.f96191c;
            if (i26 != 0) {
                paint2.setStrokeWidth(i26);
            }
            String str = this.f108039b;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i27 = rVar.f96189a;
            if (iMeasureText > i27) {
                this.f108041d = iMeasureText;
                i27 = iMeasureText;
            } else {
                this.f108041d = 0;
            }
            if (i15 > 0) {
                i25 = ((i27 * i15) + i14) - iMeasureText;
            } else {
                i25 = (i27 - iMeasureText) + (i15 * i27) + i14;
            }
            canvas.drawText(str, i25, i17, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z14) {
        return Math.max(this.f108041d, this.f108038a.f96189a);
    }
}
