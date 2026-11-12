package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.xiaomi.market.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001ah\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000\u001a(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign;", "align", "", "toLayoutAlign-AMY3VfE", "(Landroidx/compose/ui/text/style/TextAlign;)I", "toLayoutAlign", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "maxLines", "", "ellipsis", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "Landroidx/compose/ui/text/Paragraph;", "ActualParagraph", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "paragraphIntrinsics", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidParagraph_androidKt {
    @NotNull
    public static final Paragraph ActualParagraph(@NotNull String str, @NotNull TextStyle textStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z, float f, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, new TypefaceAdapter(null, resourceLoader, 1, null), density), i, z, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutAlign-AMY3VfE, reason: not valid java name */
    public static final int m2844toLayoutAlignAMY3VfE(TextAlign textAlign) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (textAlign == null ? false : TextAlign.m2887equalsimpl0(textAlign.getValue(), companion.m2894getLefte0LSkKk())) {
            return 3;
        }
        if (textAlign == null ? false : TextAlign.m2887equalsimpl0(textAlign.getValue(), companion.m2895getRighte0LSkKk())) {
            return 4;
        }
        if (textAlign == null ? false : TextAlign.m2887equalsimpl0(textAlign.getValue(), companion.m2891getCentere0LSkKk())) {
            return 2;
        }
        if (textAlign == null ? false : TextAlign.m2887equalsimpl0(textAlign.getValue(), companion.m2896getStarte0LSkKk())) {
            return 0;
        }
        return textAlign == null ? false : TextAlign.m2887equalsimpl0(textAlign.getValue(), companion.m2892getEnde0LSkKk()) ? 1 : 0;
    }

    @NotNull
    public static final Paragraph ActualParagraph(@NotNull ParagraphIntrinsics paragraphIntrinsics, int i, boolean z, float f) {
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i, z, f);
    }
}
