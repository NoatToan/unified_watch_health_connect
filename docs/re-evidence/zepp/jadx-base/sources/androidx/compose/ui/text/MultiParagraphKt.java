package androidx.compose.ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001e\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\b\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001e\u0010\n\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¨\u0006\u000b"}, d2 = {"", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "", "index", "findParagraphByIndex", "", "y", "findParagraphByY", "lineIndex", "findParagraphByLineIndex", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class MultiParagraphKt {
    public static final int findParagraphByIndex(@NotNull List<ParagraphInfo> list, final int i) {
        return CollectionsKt__CollectionsKt.binarySearch$default(list, 0, 0, new Function1<ParagraphInfo, Integer>() { // from class: androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull ParagraphInfo paragraphInfo) {
                int i2;
                if (paragraphInfo.getStartIndex() > i) {
                    i2 = 1;
                } else {
                    i2 = paragraphInfo.getEndIndex() <= i ? -1 : 0;
                }
                return Integer.valueOf(i2);
            }
        }, 3, (Object) null);
    }

    public static final int findParagraphByLineIndex(@NotNull List<ParagraphInfo> list, final int i) {
        return CollectionsKt__CollectionsKt.binarySearch$default(list, 0, 0, new Function1<ParagraphInfo, Integer>() { // from class: androidx.compose.ui.text.MultiParagraphKt.findParagraphByLineIndex.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull ParagraphInfo paragraphInfo) {
                int i2;
                if (paragraphInfo.getStartLineIndex() > i) {
                    i2 = 1;
                } else {
                    i2 = paragraphInfo.getEndLineIndex() <= i ? -1 : 0;
                }
                return Integer.valueOf(i2);
            }
        }, 3, (Object) null);
    }

    public static final int findParagraphByY(@NotNull List<ParagraphInfo> list, final float f) {
        return CollectionsKt__CollectionsKt.binarySearch$default(list, 0, 0, new Function1<ParagraphInfo, Integer>() { // from class: androidx.compose.ui.text.MultiParagraphKt.findParagraphByY.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull ParagraphInfo paragraphInfo) {
                int i;
                if (paragraphInfo.getTop() > f) {
                    i = 1;
                } else {
                    i = paragraphInfo.getBottom() <= f ? -1 : 0;
                }
                return Integer.valueOf(i);
            }
        }, 3, (Object) null);
    }
}
