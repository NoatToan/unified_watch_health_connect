package l03;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import j03.r;

/* JADX INFO: loaded from: classes3.dex */
public class l implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f108042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f108043b = h.f108035a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f108044c = h.f108037c;

    public l(r rVar) {
        this.f108042a = rVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i14, int i15, int i16, int i17, int i18, CharSequence charSequence, int i19, int i24, boolean z14, Layout layout) {
        int width;
        int iA = am.j.a(i18, i16, 2, i16);
        Paint paint2 = this.f108044c;
        paint2.set(paint);
        r rVar = this.f108042a;
        rVar.getClass();
        paint2.setColor(p03.a.a(paint2.getColor(), 25));
        paint2.setStyle(Paint.Style.FILL);
        int i25 = rVar.f96194f;
        if (i25 >= 0) {
            paint2.setStrokeWidth(i25);
        }
        int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i15 > 0) {
            width = canvas.getWidth();
        } else {
            width = i14;
            i14 -= canvas.getWidth();
        }
        int i26 = iA - strokeWidth;
        int i27 = iA + strokeWidth;
        Rect rect = this.f108043b;
        rect.set(i14, i26, width, i27);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z14) {
        return 0;
    }
}
