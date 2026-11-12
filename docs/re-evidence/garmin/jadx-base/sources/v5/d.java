package v5;

import android.graphics.Paint;
import android.text.Layout;
import t5.a0;
import t5.d0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175706a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f175706a = iArr;
        }
    }

    public static final float a(Layout layout, int i14, Paint paint) {
        float lineLeft = layout.getLineLeft(i14);
        ThreadLocal<a0> threadLocal = d0.f162422a;
        if (layout.getEllipsisCount(i14) <= 0 || layout.getParagraphDirection(i14) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i14) + layout.getLineStart(i14)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i14);
        if ((paragraphAlignment == null ? -1 : a.f175706a[paragraphAlignment.ordinal()]) == 1) {
            return q6.f.c(layout.getWidth(), fMeasureText, 2.0f, Math.abs(lineLeft));
        }
        return (layout.getWidth() - fMeasureText) + Math.abs(lineLeft);
    }

    public static final float b(Layout layout, int i14, Paint paint) {
        float width;
        float width2;
        ThreadLocal<a0> threadLocal = d0.f162422a;
        if (layout.getEllipsisCount(i14) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i14) != -1 || layout.getWidth() >= layout.getLineRight(i14)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i14) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i14) + layout.getLineStart(i14)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i14);
        if ((paragraphAlignment != null ? a.f175706a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i14);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i14);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }
}
