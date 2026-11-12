package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u008b\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u008b\u0001\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u001f\u0010\u0016\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u001b\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0000\"\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u001a\u0010#\u001a\u00020\u0000*\u00020\r8F@\u0006ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "Landroidx/compose/material/Colors;", "lightColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "darkColors-2qZNXz8", "darkColors", b.H, "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "other", "", "updateColorsFrom", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "primarySurface", "material_release"}, k = 2, mv = {1, 5, 1})
public final class ColorsKt {

    @NotNull
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new Function0<Colors>() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Colors invoke() {
            return ColorsKt.m659lightColors2qZNXz8((3912 & 1) != 0 ? ColorKt.Color(4284612846L) : 0L, (3912 & 2) != 0 ? ColorKt.Color(4281794739L) : 0L, (3912 & 4) != 0 ? ColorKt.Color(4278442694L) : 0L, (3912 & 8) != 0 ? ColorKt.Color(4278290310L) : 0L, (3912 & 16) != 0 ? Color.INSTANCE.m1249getWhite0d7_KjU() : 0L, (3912 & 32) != 0 ? Color.INSTANCE.m1249getWhite0d7_KjU() : 0L, (3912 & 64) != 0 ? ColorKt.Color(4289724448L) : 0L, (3912 & 128) != 0 ? Color.INSTANCE.m1249getWhite0d7_KjU() : 0L, (3912 & 256) != 0 ? Color.INSTANCE.m1238getBlack0d7_KjU() : 0L, (3912 & 512) != 0 ? Color.INSTANCE.m1238getBlack0d7_KjU() : 0L, (3912 & 1024) != 0 ? Color.INSTANCE.m1238getBlack0d7_KjU() : 0L, (3912 & 2048) != 0 ? Color.INSTANCE.m1249getWhite0d7_KjU() : 0L);
        }
    });

    /* JADX INFO: renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m655contentColorFor4WTKRHQ(@NotNull Colors colors, long j) {
        if (!Color.m1213equalsimpl0(j, colors.m638getPrimary0d7_KjU()) && !Color.m1213equalsimpl0(j, colors.m639getPrimaryVariant0d7_KjU())) {
            if (!Color.m1213equalsimpl0(j, colors.m640getSecondary0d7_KjU()) && !Color.m1213equalsimpl0(j, colors.m641getSecondaryVariant0d7_KjU())) {
                if (Color.m1213equalsimpl0(j, colors.m631getBackground0d7_KjU())) {
                    return colors.m633getOnBackground0d7_KjU();
                }
                if (Color.m1213equalsimpl0(j, colors.m642getSurface0d7_KjU())) {
                    return colors.m637getOnSurface0d7_KjU();
                }
                return Color.m1213equalsimpl0(j, colors.m632getError0d7_KjU()) ? colors.m634getOnError0d7_KjU() : Color.INSTANCE.m1248getUnspecified0d7_KjU();
            }
            return colors.m636getOnSecondary0d7_KjU();
        }
        return colors.m635getOnPrimary0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m656contentColorForek8zF_U(long j, @Nullable Composer composer, int i) {
        long jM655contentColorFor4WTKRHQ = m655contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 0), j);
        return jM655contentColorFor4WTKRHQ != Color.INSTANCE.m1248getUnspecified0d7_KjU() ? jM655contentColorFor4WTKRHQ : ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl();
    }

    @NotNull
    /* JADX INFO: renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final Colors m657darkColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, null);
    }

    /* JADX INFO: renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m658darkColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long jColor = (i & 1) != 0 ? ColorKt.Color(4290479868L) : j;
        long jColor2 = (i & 2) != 0 ? ColorKt.Color(4281794739L) : j2;
        long jColor3 = (i & 4) != 0 ? ColorKt.Color(4278442694L) : j3;
        return m657darkColors2qZNXz8(jColor, jColor2, jColor3, (i & 8) != 0 ? jColor3 : j4, (i & 16) != 0 ? ColorKt.Color(4279374354L) : j5, (i & 32) != 0 ? ColorKt.Color(4279374354L) : j6, (i & 64) != 0 ? ColorKt.Color(4291782265L) : j7, (i & 128) != 0 ? Color.INSTANCE.m1238getBlack0d7_KjU() : j8, (i & 256) != 0 ? Color.INSTANCE.m1238getBlack0d7_KjU() : j9, (i & 512) != 0 ? Color.INSTANCE.m1249getWhite0d7_KjU() : j10, (i & 1024) != 0 ? Color.INSTANCE.m1249getWhite0d7_KjU() : j11, (i & 2048) != 0 ? Color.INSTANCE.m1238getBlack0d7_KjU() : j12);
    }

    @NotNull
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    public static final long getPrimarySurface(@NotNull Colors colors) {
        return colors.isLight() ? colors.m638getPrimary0d7_KjU() : colors.m642getSurface0d7_KjU();
    }

    @NotNull
    /* JADX INFO: renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final Colors m659lightColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    public static final void updateColorsFrom(@NotNull Colors colors, @NotNull Colors colors2) {
        colors.m650setPrimary8_81llA$material_release(colors2.m638getPrimary0d7_KjU());
        colors.m651setPrimaryVariant8_81llA$material_release(colors2.m639getPrimaryVariant0d7_KjU());
        colors.m652setSecondary8_81llA$material_release(colors2.m640getSecondary0d7_KjU());
        colors.m653setSecondaryVariant8_81llA$material_release(colors2.m641getSecondaryVariant0d7_KjU());
        colors.m643setBackground8_81llA$material_release(colors2.m631getBackground0d7_KjU());
        colors.m654setSurface8_81llA$material_release(colors2.m642getSurface0d7_KjU());
        colors.m644setError8_81llA$material_release(colors2.m632getError0d7_KjU());
        colors.m647setOnPrimary8_81llA$material_release(colors2.m635getOnPrimary0d7_KjU());
        colors.m648setOnSecondary8_81llA$material_release(colors2.m636getOnSecondary0d7_KjU());
        colors.m645setOnBackground8_81llA$material_release(colors2.m633getOnBackground0d7_KjU());
        colors.m649setOnSurface8_81llA$material_release(colors2.m637getOnSurface0d7_KjU());
        colors.m646setOnError8_81llA$material_release(colors2.m634getOnError0d7_KjU());
        colors.setLight$material_release(colors2.isLight());
    }
}
