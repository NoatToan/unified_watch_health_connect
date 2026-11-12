package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "paint", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class TextPainter {

    @NotNull
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    public final void paint(@NotNull Canvas canvas, @NotNull TextLayoutResult textLayoutResult) {
        boolean z = textLayoutResult.getHasVisualOverflow() && TextOverflow.m2916equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m2920getClipgIe3tQ8());
        if (z) {
            Rect rectM1023Recttz77jQw = RectKt.m1023Recttz77jQw(Offset.INSTANCE.m999getZeroF1C5BW0(), SizeKt.Size(IntSize.m3085getWidthimpl(textLayoutResult.getSize()), IntSize.m3084getHeightimpl(textLayoutResult.getSize())));
            canvas.save();
            Canvas.DefaultImpls.m1191clipRectmtrdDE$default(canvas, rectM1023Recttz77jQw, 0, 2, null);
        }
        try {
            textLayoutResult.getMultiParagraph().m2650paintRPmYEkk(canvas, textLayoutResult.getLayoutInput().getStyle().getColor(), textLayoutResult.getLayoutInput().getStyle().getShadow(), textLayoutResult.getLayoutInput().getStyle().getTextDecoration());
        } finally {
            if (z) {
                canvas.restore();
            }
        }
    }
}
