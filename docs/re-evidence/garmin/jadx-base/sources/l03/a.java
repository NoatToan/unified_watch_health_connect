package l03;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import j03.r;

/* JADX INFO: loaded from: classes3.dex */
public class a implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f108016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f108017b = h.f108035a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f108018c = h.f108037c;

    public a(r rVar) {
        this.f108016a = rVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i14, int i15, int i16, int i17, int i18, CharSequence charSequence, int i19, int i24, boolean z14, Layout layout) {
        r rVar = this.f108016a;
        int i25 = rVar.f96190b;
        if (i25 == 0) {
            i25 = (int) ((rVar.f96189a * 0.25f) + 0.5f);
        }
        Paint paint2 = this.f108018c;
        paint2.set(paint);
        int iA = p03.a.a(paint2.getColor(), 25);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iA);
        int i26 = i15 * i25;
        int i27 = i14 + i26;
        int i28 = i26 + i27;
        int iMin = Math.min(i27, i28);
        int iMax = Math.max(i27, i28);
        Rect rect = this.f108017b;
        rect.set(iMin, i16, iMax, i18);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z14) {
        return this.f108016a.f96189a;
    }
}
