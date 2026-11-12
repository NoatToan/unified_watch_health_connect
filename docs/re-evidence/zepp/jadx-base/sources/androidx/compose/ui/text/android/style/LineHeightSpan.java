package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightSpan;", "Landroid/text/style/LineHeightSpan;", "", "text", "", "start", "end", "spanstartVertical", "lineHeight", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "", "chooseHeight", LogUtil.I, "getLineHeight", "()I", "<init>", "(I)V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class LineHeightSpan implements android.text.style.LineHeightSpan {
    private final int lineHeight;

    public LineHeightSpan(int i) {
        this.lineHeight = i;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence text, int start, int end, int spanstartVertical, int lineHeight, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        int i = fontMetricsInt.descent;
        int i2 = i - fontMetricsInt.ascent;
        if (i2 <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(((double) i) * ((double) ((this.lineHeight * 1.0f) / i2)));
        fontMetricsInt.descent = iCeil;
        fontMetricsInt.ascent = iCeil - this.lineHeight;
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }
}
