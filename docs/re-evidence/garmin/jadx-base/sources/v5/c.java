package v5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p005kotlin.Metadata;
import t5.a0;
import t5.d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv5/c;", "Landroid/text/style/LeadingMarginSpan;", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i14, int i15, int i16, int i17, int i18, CharSequence charSequence, int i19, int i24, boolean z14, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i19)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal<a0> threadLocal = d0.f162422a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fB = d.b(layout, lineForOffset, paint) + d.a(layout, lineForOffset, paint);
            if (fB == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(fB, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z14) {
        return 0;
    }
}
