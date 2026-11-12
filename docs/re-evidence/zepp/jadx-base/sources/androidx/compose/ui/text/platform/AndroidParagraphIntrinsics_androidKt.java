package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import com.xiaomi.market.sdk.Constants;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aP\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "", "resolveTextDirectionHeuristics-9GRLPo0", "(Landroidx/compose/ui/text/style/TextDirection;Landroidx/compose/ui/text/intl/LocaleList;)I", "resolveTextDirectionHeuristics", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "ActualParagraphIntrinsics", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidParagraphIntrinsics_androidKt {
    @NotNull
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(@NotNull String str, @NotNull TextStyle textStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull List<AnnotatedString.Range<Placeholder>> list2, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, new TypefaceAdapter(null, resourceLoader, 1, null), density);
    }

    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-9GRLPo0, reason: not valid java name */
    public static final int m2841resolveTextDirectionHeuristics9GRLPo0(@Nullable TextDirection textDirection, @Nullable LocaleList localeList) {
        int iM2904getContents_7Xco = textDirection == null ? TextDirection.INSTANCE.m2904getContents_7Xco() : textDirection.getValue();
        TextDirection.Companion companion = TextDirection.INSTANCE;
        if (!TextDirection.m2900equalsimpl0(iM2904getContents_7Xco, companion.m2905getContentOrLtrs_7Xco())) {
            if (!TextDirection.m2900equalsimpl0(iM2904getContents_7Xco, companion.m2906getContentOrRtls_7Xco())) {
                if (TextDirection.m2900equalsimpl0(iM2904getContents_7Xco, companion.m2907getLtrs_7Xco())) {
                    return 0;
                }
                if (TextDirection.m2900equalsimpl0(iM2904getContents_7Xco, companion.m2908getRtls_7Xco())) {
                    return 1;
                }
                if (!TextDirection.m2900equalsimpl0(iM2904getContents_7Xco, companion.m2904getContents_7Xco())) {
                    throw new IllegalStateException("Invalid TextDirection.".toString());
                }
                Locale javaLocale = localeList == null ? null : ((AndroidLocale) localeList.get(0).getPlatformLocale()).getJavaLocale();
                if (javaLocale == null) {
                    javaLocale = Locale.getDefault();
                }
                int layoutDirectionFromLocale = TextUtilsCompat.getLayoutDirectionFromLocale(javaLocale);
                if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                }
            }
            return 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-9GRLPo0$default, reason: not valid java name */
    public static /* synthetic */ int m2842resolveTextDirectionHeuristics9GRLPo0$default(TextDirection textDirection, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            textDirection = null;
        }
        if ((i & 2) != 0) {
            localeList = null;
        }
        return m2841resolveTextDirectionHeuristics9GRLPo0(textDirection, localeList);
    }
}
