package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.MessengerShareContentUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010G\u001a\u00020A\u0012\b\b\u0002\u0010H\u001a\u00020\u0004\u0012\u0006\u0010J\u001a\u00020I\u0012\b\b\u0002\u0010K\u001a\u00020\u0002\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L\u0012\b\b\u0002\u0010N\u001a\u00020\u0002\u0012\b\b\u0002\u0010O\u001a\u00020\u0004\u0012\b\b\u0003\u0010P\u001a\u00020\u0004\u0012\b\b\u0002\u0010Q\u001a\u00020\u0010\u0012\b\b\u0002\u0010R\u001a\u00020\u0002\u0012\b\b\u0002\u0010S\u001a\u00020\u0002\u0012\b\b\u0002\u0010T\u001a\u00020\u0002\u0012\b\b\u0002\u0010U\u001a\u00020\u0002\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010V\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010V\u0012\b\b\u0002\u0010)\u001a\u00020(¢\u0006\u0004\bY\u0010ZJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J\u0016\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u001e\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 J\u000e\u0010$\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020%R\u0019\u0010)\u001a\u00020(8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010-\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R\u0019\u00108\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0013\u0010>\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010@\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0013\u0010D\u001a\u00020A8F@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010F\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\bE\u0010;¨\u0006["}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "lineIndex", "", "getLineLeft", "getLineRight", "line", "getLineTop", "getLineBottom", "getLineBaseline", "getLineHeight", "getLineWidth", "getLineStart", "getLineEnd", "getLineVisibleEnd", "", "isLineEllipsized", "getLineEllipsisOffset", "getLineEllipsisCount", "vertical", "getLineForVertical", MessengerShareContentUtility.IMAGE_RATIO_HORIZONTAL, "getOffsetForHorizontal", "offset", "getPrimaryHorizontal", "getSecondaryHorizontal", "getLineForOffset", "isRtlCharAt", "getParagraphDirection", "start", "end", "Landroid/graphics/Path;", "dest", "", "getSelectionPath", "isEllipsisApplied", "Landroid/graphics/Canvas;", "canvas", "paint", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "didExceedMaxLines", "Z", "getDidExceedMaxLines", "()Z", "Landroid/text/Layout;", "layout", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "lineCount", LogUtil.I, "getLineCount", "()I", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "", "getText", "()Ljava/lang/CharSequence;", "text", "getHeight", "height", "charSequence", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "Landroid/text/TextPaint;", "textPaint", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "includePadding", "maxLines", "breakStrategy", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class TextLayout {
    private final boolean didExceedMaxLines;

    @NotNull
    private final Layout layout;

    @NotNull
    private final LayoutIntrinsics layoutIntrinsics;
    private final int lineCount;

    public TextLayout(@NotNull CharSequence charSequence, float f, @NotNull TextPaint textPaint, int i, @Nullable TextUtils.TruncateAt truncateAt, int i2, float f2, @Px float f3, boolean z, int i3, int i4, int i5, int i6, @Nullable int[] iArr, @Nullable int[] iArr2, @NotNull LayoutIntrinsics layoutIntrinsics) {
        this.layoutIntrinsics = layoutIntrinsics;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic = TextLayoutKt.getTextDirectionHeuristic(i2);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i);
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
        double d = f;
        int iCeil = (int) Math.ceil(d);
        Layout layoutCreate = (boringMetrics == null || layoutIntrinsics.getMaxIntrinsicWidth() > f || z2) ? StaticLayoutFactory.INSTANCE.create(charSequence, (16384 & 2) != 0 ? 0 : 0, (16384 & 4) != 0 ? charSequence.length() : charSequence.length(), textPaint, iCeil, (16384 & 32) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() : textDirectionHeuristic, (16384 & 64) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() : alignment, (16384 & 128) != 0 ? Integer.MAX_VALUE : i3, (16384 & 256) != 0 ? null : truncateAt, (16384 & 512) != 0 ? iCeil : (int) Math.ceil(d), (16384 & 1024) != 0 ? 1.0f : f2, (16384 & 2048) != 0 ? 0.0f : f3, (16384 & 4096) != 0 ? 0 : i6, (16384 & 8192) != 0 ? true : z, (16384 & 16384) != 0, (32768 & 16384) != 0 ? 0 : i4, (65536 & 16384) != 0 ? 0 : i5, (131072 & 16384) != 0 ? null : iArr, (16384 & 262144) != 0 ? null : iArr2) : BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, iCeil, boringMetrics, alignment, z, truncateAt, iCeil);
        this.layout = layoutCreate;
        int iMin = Math.min(layoutCreate.getLineCount(), i3);
        this.lineCount = iMin;
        this.didExceedMaxLines = iMin >= i3 && (layoutCreate.getEllipsisCount(iMin + (-1)) > 0 || layoutCreate.getLineEnd(iMin + (-1)) != charSequence.length());
    }

    @VisibleForTesting
    public static /* synthetic */ void getLayout$annotations() {
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final int getHeight() {
        return this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight();
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    @NotNull
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineBaseline(int line) {
        return this.layout.getLineBaseline(line);
    }

    public final float getLineBottom(int line) {
        return this.layout.getLineBottom(line);
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEllipsisCount(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int getLineEllipsisOffset(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int getLineEnd(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex) == 0 ? this.layout.getLineEnd(lineIndex) : this.layout.getText().length();
    }

    public final int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int getLineForVertical(int vertical) {
        return this.layout.getLineForVertical(vertical);
    }

    public final float getLineHeight(int lineIndex) {
        return this.layout.getLineBottom(lineIndex) - this.layout.getLineTop(lineIndex);
    }

    public final float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex);
    }

    public final float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex);
    }

    public final int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float getLineTop(int line) {
        return this.layout.getLineTop(line);
    }

    public final int getLineVisibleEnd(int lineIndex) {
        if (this.layout.getEllipsisStart(lineIndex) == 0) {
            return this.layout.getLineVisibleEnd(lineIndex);
        }
        return this.layout.getEllipsisStart(lineIndex) + this.layout.getLineStart(lineIndex);
    }

    public final float getLineWidth(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, horizontal);
    }

    public final int getParagraphDirection(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final float getPrimaryHorizontal(int offset) {
        return this.layout.getPrimaryHorizontal(offset);
    }

    public final float getSecondaryHorizontal(int offset) {
        return this.layout.getSecondaryHorizontal(offset);
    }

    public final void getSelectionPath(int start, int end, @NotNull Path dest) {
        this.layout.getSelectionPath(start, end, dest);
    }

    @NotNull
    public final CharSequence getText() {
        return this.layout.getText();
    }

    public final boolean isEllipsisApplied(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex) > 0;
    }

    public final boolean isLineEllipsized(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex) != 0;
    }

    public final boolean isRtlCharAt(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void paint(@NotNull Canvas canvas) {
        this.layout.draw(canvas);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        float f4 = (i7 & 2) != 0 ? 0.0f : f;
        int i8 = (i7 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i7 & 16) != 0 ? null : truncateAt;
        int i9 = (i7 & 32) != 0 ? 2 : i2;
        this(charSequence, f4, textPaint, i8, truncateAt2, i9, (i7 & 64) != 0 ? 1.0f : f2, (i7 & 128) != 0 ? 0.0f : f3, (i7 & 256) != 0 ? true : z, (i7 & 512) != 0 ? Integer.MAX_VALUE : i3, (i7 & 1024) != 0 ? 0 : i4, (i7 & 2048) != 0 ? 0 : i5, (i7 & 4096) != 0 ? 0 : i6, (i7 & 8192) != 0 ? null : iArr, (i7 & 16384) != 0 ? null : iArr2, (i7 & 32768) != 0 ? new LayoutIntrinsics(charSequence, textPaint, i9) : layoutIntrinsics);
    }
}
