package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\"\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily;", "default", "withDefaultFontFamily", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Typography;", "LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material_release"}, k = 2, mv = {1, 5, 1})
public final class TypographyKt {

    @NotNull
    private static final ProvidableCompositionLocal<Typography> LocalTypography = CompositionLocalKt.staticCompositionLocalOf(new Function0<Typography>() { // from class: androidx.compose.material.TypographyKt$LocalTypography$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Typography invoke() {
            return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
    });

    @NotNull
    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        return textStyle.getFontFamily() != null ? textStyle : textStyle.m2733copyHL5avdY((262111 & 1) != 0 ? textStyle.getColor() : 0L, (262111 & 2) != 0 ? textStyle.getFontSize() : 0L, (262111 & 4) != 0 ? textStyle.fontWeight : null, (262111 & 8) != 0 ? textStyle.getFontStyle() : null, (262111 & 16) != 0 ? textStyle.getFontSynthesis() : null, (262111 & 32) != 0 ? textStyle.fontFamily : fontFamily, (262111 & 64) != 0 ? textStyle.fontFeatureSettings : null, (262111 & 128) != 0 ? textStyle.getLetterSpacing() : 0L, (262111 & 256) != 0 ? textStyle.getBaselineShift() : null, (262111 & 512) != 0 ? textStyle.textGeometricTransform : null, (262111 & 1024) != 0 ? textStyle.localeList : null, (262111 & 2048) != 0 ? textStyle.getBackground() : 0L, (262111 & 4096) != 0 ? textStyle.textDecoration : null, (262111 & 8192) != 0 ? textStyle.shadow : null, (262111 & 16384) != 0 ? textStyle.getTextAlign() : null, (262111 & 32768) != 0 ? textStyle.getTextDirection() : null, (262111 & 65536) != 0 ? textStyle.getLineHeight() : 0L, (262111 & 131072) != 0 ? textStyle.textIndent : null);
    }
}
