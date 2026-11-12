package androidx.compose.material;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0010\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\"\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019\"\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "rememberTextSelectionColors", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "Landroidx/compose/ui/graphics/Color;", "selectionColor", "textColor", b.H, "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "calculateSelectionBackgroundColor", "", "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8", "(JJJ)F", "binarySearchForAccessibleSelectionColorAlpha", "selectionColorAlpha", "calculateContrastRatio-nb2GgbA", "(JFJJ)F", "calculateContrastRatio", DownloadService.KEY_FOREGROUND, "background", "calculateContrastRatio--OWjLjI", "(JJ)F", "DefaultSelectionBackgroundAlpha", "F", "MinimumSelectionBackgroundAlpha", "DesiredContrastRatio", "material_release"}, k = 2, mv = {1, 5, 1})
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    /* JADX INFO: renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m723binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j, long j2, long j3) {
        float f = 0.4f;
        float f2 = 0.4f;
        float f3 = 0.2f;
        for (int i = 0; i < 7; i++) {
            float fM725calculateContrastRationb2GgbA = (m725calculateContrastRationb2GgbA(j, f, j2, j3) / 4.5f) - 1.0f;
            if (0.0f <= fM725calculateContrastRationb2GgbA && fM725calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (fM725calculateContrastRationb2GgbA < 0.0f) {
                f2 = f;
            } else {
                f3 = f;
            }
            f = (f2 + f3) / 2.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m724calculateContrastRatioOWjLjI(long j, long j2) {
        float fM1265luminance8_81llA = ColorKt.m1265luminance8_81llA(j) + 0.05f;
        float fM1265luminance8_81llA2 = ColorKt.m1265luminance8_81llA(j2) + 0.05f;
        return Math.max(fM1265luminance8_81llA, fM1265luminance8_81llA2) / Math.min(fM1265luminance8_81llA, fM1265luminance8_81llA2);
    }

    /* JADX INFO: renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m725calculateContrastRationb2GgbA(long j, float f, long j2, long j3) {
        long jM1258compositeOverOWjLjI = ColorKt.m1258compositeOverOWjLjI(Color.m1211copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, null), j3);
        return m724calculateContrastRatioOWjLjI(ColorKt.m1258compositeOverOWjLjI(j2, jM1258compositeOverOWjLjI), jM1258compositeOverOWjLjI);
    }

    /* JADX INFO: renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m726calculateSelectionBackgroundColorysEtTa8(long j, long j2, long j3) {
        float fM723binarySearchForAccessibleSelectionColorAlphaysEtTa8;
        float fM725calculateContrastRationb2GgbA = m725calculateContrastRationb2GgbA(j, 0.4f, j2, j3);
        float fM725calculateContrastRationb2GgbA2 = m725calculateContrastRationb2GgbA(j, 0.2f, j2, j3);
        if (fM725calculateContrastRationb2GgbA >= 4.5f) {
            fM723binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.4f;
        } else {
            fM723binarySearchForAccessibleSelectionColorAlphaysEtTa8 = fM725calculateContrastRationb2GgbA2 < 4.5f ? 0.2f : m723binarySearchForAccessibleSelectionColorAlphaysEtTa8(j, j2, j3);
        }
        return Color.m1211copywmQWz5c$default(j, fM723binarySearchForAccessibleSelectionColorAlphaysEtTa8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    @NotNull
    public static final SelectionColors rememberTextSelectionColors(@NotNull Colors colors, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(35572393);
        long jM638getPrimary0d7_KjU = colors.m638getPrimary0d7_KjU();
        long jM631getBackground0d7_KjU = colors.m631getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        long jM655contentColorFor4WTKRHQ = ColorsKt.m655contentColorFor4WTKRHQ(colors, jM631getBackground0d7_KjU);
        if (!(jM655contentColorFor4WTKRHQ != Color.INSTANCE.m1248getUnspecified0d7_KjU())) {
            jM655contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl();
        }
        composer.endReplaceableGroup();
        long jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(jM655contentColorFor4WTKRHQ, ContentAlpha.INSTANCE.getMedium(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        Color colorM1202boximpl = Color.m1202boximpl(jM638getPrimary0d7_KjU);
        Color colorM1202boximpl2 = Color.m1202boximpl(jM631getBackground0d7_KjU);
        Color colorM1202boximpl3 = Color.m1202boximpl(jM1211copywmQWz5c$default);
        composer.startReplaceableGroup(-3686095);
        boolean zChanged = composer.changed(colorM1202boximpl) | composer.changed(colorM1202boximpl2) | composer.changed(colorM1202boximpl3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SelectionColors(colors.m638getPrimary0d7_KjU(), m726calculateSelectionBackgroundColorysEtTa8(jM638getPrimary0d7_KjU, jM1211copywmQWz5c$default, jM631getBackground0d7_KjU), null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SelectionColors selectionColors = (SelectionColors) objRememberedValue;
        composer.endReplaceableGroup();
        return selectionColors;
    }
}
