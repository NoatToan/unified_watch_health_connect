package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"", "", "startIndex", "findParagraphStart", "findParagraphEnd", "index", "Landroidx/compose/ui/text/TextRange;", "getParagraphBoundary", "(Ljava/lang/String;I)J", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class StringHelpersKt {
    public static final int findParagraphEnd(@NotNull String str, int i) {
        int i2 = i + 1;
        int length = str.length();
        if (i2 < length) {
            while (true) {
                int i3 = i2 + 1;
                if (str.charAt(i2) == '\n') {
                    return i2;
                }
                if (i3 < length) {
                    i2 = i3;
                }
            }
        }
        return str.length();
    }

    public static final int findParagraphStart(@NotNull String str, int i) {
        int i2 = i - 1;
        if (1 > i2) {
            return 0;
        }
        while (true) {
            int i3 = i2 - 1;
            if (str.charAt(i2 - 1) == '\n') {
                return i2;
            }
            if (1 > i3) {
                return 0;
            }
            i2 = i3;
        }
    }

    public static final long getParagraphBoundary(@NotNull String str, int i) {
        return TextRangeKt.TextRange(findParagraphStart(str, i), findParagraphEnd(str, i));
    }
}
