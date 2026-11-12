package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.ranges.e;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\r\u001a)\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"", "Landroidx/compose/ui/text/TextRange;", "range", "", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "substring", "", "start", "end", "TextRange", "(II)J", "index", "(I)J", "minimumValue", "maximumValue", "constrain-8ffj60Q", "(JII)J", "constrain", "", "packWithCheck", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class TextRangeKt {
    public static final long TextRange(int i, int i2) {
        return TextRange.m2713constructorimpl(packWithCheck(i, i2));
    }

    /* JADX INFO: renamed from: constrain-8ffj60Q, reason: not valid java name */
    public static final long m2730constrain8ffj60Q(long j, int i, int i2) {
        int iCoerceIn = e.coerceIn(TextRange.m2724getStartimpl(j), i, i2);
        int iCoerceIn2 = e.coerceIn(TextRange.m2719getEndimpl(j), i, i2);
        return (iCoerceIn == TextRange.m2724getStartimpl(j) && iCoerceIn2 == TextRange.m2719getEndimpl(j)) ? j : TextRange(iCoerceIn, iCoerceIn2);
    }

    private static final long packWithCheck(int i, int i2) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i + JsonLexerKt.END_LIST).toString());
        }
        if (i2 >= 0) {
            return (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        throw new IllegalArgumentException(("end cannot negative. [end: " + i2 + JsonLexerKt.END_LIST).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m2731substringFDrldGo(@NotNull CharSequence charSequence, long j) {
        return charSequence.subSequence(TextRange.m2722getMinimpl(j), TextRange.m2721getMaximpl(j)).toString();
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }
}
