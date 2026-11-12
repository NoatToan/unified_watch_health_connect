package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b4\u00105J3\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0014R\u001f\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0019\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\"R\"\u0010%\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\"R\"\u0010'\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\"R\u0016\u0010*\u001a\u00020)8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0019R\"\u0010+\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\"R\u001f\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u0019\u0010.\u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001fR\u0013\u00103\u001a\u0002008G@\u0006¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "disabledElevation", "Landroidx/compose/material/ButtonElevation;", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "elevation", "Landroidx/compose/ui/graphics/Color;", b.H, "contentColor", "disabledBackgroundColor", "disabledContentColor", "Landroidx/compose/material/ButtonColors;", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "buttonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "outlinedButtonColors", "textButtonColors-RGew2ao", "textButtonColors", "ButtonHorizontalPadding", "F", "ButtonVerticalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "MinWidth", "getMinWidth-D9Ej5fM", "()F", "MinHeight", "getMinHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "IconSpacing", "getIconSpacing-D9Ej5fM", "", "OutlinedBorderOpacity", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonHorizontalPadding", "TextButtonContentPadding", "getTextButtonContentPadding", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedBorder", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;

    @NotNull
    private static final PaddingValues ContentPadding;

    @NotNull
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize;

    @NotNull
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    static {
        float fM2965constructorimpl = Dp.m2965constructorimpl(16);
        ButtonHorizontalPadding = fM2965constructorimpl;
        float f = 8;
        float fM2965constructorimpl2 = Dp.m2965constructorimpl(f);
        ButtonVerticalPadding = fM2965constructorimpl2;
        PaddingValues paddingValuesM277PaddingValuesa9UjIt4 = PaddingKt.m277PaddingValuesa9UjIt4(fM2965constructorimpl, fM2965constructorimpl2, fM2965constructorimpl, fM2965constructorimpl2);
        ContentPadding = paddingValuesM277PaddingValuesa9UjIt4;
        MinWidth = Dp.m2965constructorimpl(64);
        MinHeight = Dp.m2965constructorimpl(36);
        IconSize = Dp.m2965constructorimpl(18);
        IconSpacing = Dp.m2965constructorimpl(f);
        OutlinedBorderSize = Dp.m2965constructorimpl(1);
        float fM2965constructorimpl3 = Dp.m2965constructorimpl(f);
        TextButtonHorizontalPadding = fM2965constructorimpl3;
        TextButtonContentPadding = PaddingKt.m277PaddingValuesa9UjIt4(fM2965constructorimpl3, paddingValuesM277PaddingValuesa9UjIt4.getTop(), fM2965constructorimpl3, paddingValuesM277PaddingValuesa9UjIt4.getBottom());
    }

    private ButtonDefaults() {
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m601buttonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        long jM1258compositeOverOWjLjI;
        composer.startReplaceableGroup(2063544006);
        long jM638getPrimary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m638getPrimary0d7_KjU() : j;
        long jM656contentColorForek8zF_U = (i2 & 2) != 0 ? ColorsKt.m656contentColorForek8zF_U(jM638getPrimary0d7_KjU, composer, i & 14) : j2;
        if ((i2 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM1258compositeOverOWjLjI = ColorKt.m1258compositeOverOWjLjI(Color.m1211copywmQWz5c$default(materialTheme.getColors(composer, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 0).m642getSurface0d7_KjU());
        } else {
            jM1258compositeOverOWjLjI = j3;
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM638getPrimary0d7_KjU, jM656contentColorForek8zF_U, jM1258compositeOverOWjLjI, (i2 & 8) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j4, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevation-yajeYGU, reason: not valid java name */
    public final ButtonElevation m602elevationyajeYGU(float f, float f2, float f3, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(399129690);
        if ((i2 & 1) != 0) {
            f = Dp.m2965constructorimpl(2);
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.m2965constructorimpl(8);
        }
        if ((i2 & 4) != 0) {
            f3 = Dp.m2965constructorimpl(0);
        }
        Dp dpM2963boximpl = Dp.m2963boximpl(f);
        Dp dpM2963boximpl2 = Dp.m2963boximpl(f2);
        Dp dpM2963boximpl3 = Dp.m2963boximpl(f3);
        composer.startReplaceableGroup(-3686095);
        boolean zChanged = composer.changed(dpM2963boximpl) | composer.changed(dpM2963boximpl2) | composer.changed(dpM2963boximpl3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new DefaultButtonElevation(f, f2, f3, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultButtonElevation defaultButtonElevation = (DefaultButtonElevation) objRememberedValue;
        composer.endReplaceableGroup();
        return defaultButtonElevation;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m603getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* JADX INFO: renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m604getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m605getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m606getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @JvmName(name = "getOutlinedBorder")
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1546587144);
        BorderStroke borderStrokeM125BorderStrokecXLIe8U = BorderStrokeKt.m125BorderStrokecXLIe8U(m607getOutlinedBorderSizeD9Ej5fM(), Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        composer.endReplaceableGroup();
        return borderStrokeM125BorderStrokecXLIe8U;
    }

    /* JADX INFO: renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m607getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m608outlinedButtonColorsRGew2ao(long j, long j2, long j3, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(706917817);
        long jM642getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m642getSurface0d7_KjU() : j;
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM642getSurface0d7_KjU, (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m638getPrimary0d7_KjU() : j2, jM642getSurface0d7_KjU, (i2 & 4) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j3, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m609textButtonColorsRGew2ao(long j, long j2, long j3, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1409303640);
        long jM1247getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m1247getTransparent0d7_KjU() : j;
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM1247getTransparent0d7_KjU, (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m638getPrimary0d7_KjU() : j2, jM1247getTransparent0d7_KjU, (i2 & 4) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j3, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }
}
