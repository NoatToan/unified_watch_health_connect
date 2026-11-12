package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.Jç\u0001\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJç\u0001\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u001aR\"\u0010#\u001a\u00020\"8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010'\u001a\u00020\"8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0016\u0010*\u001a\u00020)8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010$R\u0016\u0010+\u001a\u00020)8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010$R\u0016\u0010,\u001a\u00020)8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", b.H, "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "Landroidx/compose/material/TextFieldColors;", "textFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-dx8h9Zs", "outlinedTextFieldColors", "Landroidx/compose/ui/unit/Dp;", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "", "IconOpacity", "BackgroundOpacity", "UnfocusedIndicatorLineOpacity", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;

    @NotNull
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m2965constructorimpl(56);
    private static final float MinWidth = Dp.m2965constructorimpl(280);

    private TextFieldDefaults() {
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m848getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m849getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m850outlinedTextFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @Nullable Composer composer, int i, int i2, int i3, int i4) {
        long jM1211copywmQWz5c$default;
        long jM1211copywmQWz5c$default2;
        long jM1211copywmQWz5c$default3;
        long jM1211copywmQWz5c$default4;
        long jM1211copywmQWz5c$default5;
        long jM1211copywmQWz5c$default6;
        composer.startReplaceableGroup(-429565418);
        long jM1211copywmQWz5c$default7 = (i4 & 1) != 0 ? Color.m1211copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        if ((i4 & 2) != 0) {
            jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1211copywmQWz5c$default = j2;
        }
        long jM1247getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.INSTANCE.m1247getTransparent0d7_KjU() : j3;
        long jM638getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m638getPrimary0d7_KjU() : j4;
        long jM632getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m632getError0d7_KjU() : j5;
        long jM1211copywmQWz5c$default8 = (i4 & 32) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m638getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM1211copywmQWz5c$default9 = (i4 & 64) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i4 & 128) != 0) {
            jM1211copywmQWz5c$default2 = Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1211copywmQWz5c$default2 = j8;
        }
        long jM632getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m632getError0d7_KjU() : j9;
        long jM1211copywmQWz5c$default10 = (i4 & 512) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            jM1211copywmQWz5c$default3 = Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default10, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1211copywmQWz5c$default3 = j11;
        }
        long j22 = (i4 & 2048) != 0 ? jM1211copywmQWz5c$default10 : j12;
        long jM1211copywmQWz5c$default11 = (i4 & 4096) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if ((i4 & 8192) != 0) {
            jM1211copywmQWz5c$default4 = Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1211copywmQWz5c$default4 = j14;
        }
        long jM632getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m632getError0d7_KjU() : j15;
        long jM1211copywmQWz5c$default12 = (32768 & i4) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m638getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM1211copywmQWz5c$default13 = (65536 & i4) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((131072 & i4) != 0) {
            jM1211copywmQWz5c$default5 = Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1211copywmQWz5c$default5 = j18;
        }
        long jM632getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m632getError0d7_KjU() : j19;
        long jM1211copywmQWz5c$default14 = (524288 & i4) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        if ((i4 & 1048576) != 0) {
            jM1211copywmQWz5c$default6 = Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1211copywmQWz5c$default6 = j21;
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM1211copywmQWz5c$default7, jM1211copywmQWz5c$default, jM638getPrimary0d7_KjU, jM632getError0d7_KjU, jM1211copywmQWz5c$default8, jM1211copywmQWz5c$default9, jM632getError0d7_KjU2, jM1211copywmQWz5c$default2, jM1211copywmQWz5c$default10, jM1211copywmQWz5c$default3, j22, jM1211copywmQWz5c$default11, jM1211copywmQWz5c$default4, jM632getError0d7_KjU3, jM1247getTransparent0d7_KjU, jM1211copywmQWz5c$default12, jM1211copywmQWz5c$default13, jM1211copywmQWz5c$default5, jM632getError0d7_KjU4, jM1211copywmQWz5c$default14, jM1211copywmQWz5c$default6, null);
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m851textFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @Nullable Composer composer, int i, int i2, int i3, int i4) {
        long jM1211copywmQWz5c$default;
        long jM1211copywmQWz5c$default2;
        long jM1211copywmQWz5c$default3;
        long jM1211copywmQWz5c$default4;
        long jM1211copywmQWz5c$default5;
        long jM1211copywmQWz5c$default6;
        composer.startReplaceableGroup(137433512);
        long jM1211copywmQWz5c$default7 = (i4 & 1) != 0 ? Color.m1211copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1222unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        if ((i4 & 2) != 0) {
            jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1211copywmQWz5c$default = j2;
        }
        long jM1211copywmQWz5c$default8 = (i4 & 4) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM638getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m638getPrimary0d7_KjU() : j4;
        long jM632getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m632getError0d7_KjU() : j5;
        long jM1211copywmQWz5c$default9 = (i4 & 32) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m638getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM1211copywmQWz5c$default10 = (i4 & 64) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i4 & 128) != 0) {
            jM1211copywmQWz5c$default2 = Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default10, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1211copywmQWz5c$default2 = j8;
        }
        long jM632getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m632getError0d7_KjU() : j9;
        long jM1211copywmQWz5c$default11 = (i4 & 512) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            jM1211copywmQWz5c$default3 = Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1211copywmQWz5c$default3 = j11;
        }
        long j22 = (i4 & 2048) != 0 ? jM1211copywmQWz5c$default11 : j12;
        long jM1211copywmQWz5c$default12 = (i4 & 4096) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if ((i4 & 8192) != 0) {
            jM1211copywmQWz5c$default4 = Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1211copywmQWz5c$default4 = j14;
        }
        long jM632getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m632getError0d7_KjU() : j15;
        long jM1211copywmQWz5c$default13 = (32768 & i4) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m638getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM1211copywmQWz5c$default14 = (65536 & i4) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((131072 & i4) != 0) {
            jM1211copywmQWz5c$default5 = Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1211copywmQWz5c$default5 = j18;
        }
        long jM632getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m632getError0d7_KjU() : j19;
        long jM1211copywmQWz5c$default15 = (524288 & i4) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        if ((i4 & 1048576) != 0) {
            jM1211copywmQWz5c$default6 = Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default15, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM1211copywmQWz5c$default6 = j21;
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM1211copywmQWz5c$default7, jM1211copywmQWz5c$default, jM638getPrimary0d7_KjU, jM632getError0d7_KjU, jM1211copywmQWz5c$default9, jM1211copywmQWz5c$default10, jM632getError0d7_KjU2, jM1211copywmQWz5c$default2, jM1211copywmQWz5c$default11, jM1211copywmQWz5c$default3, j22, jM1211copywmQWz5c$default12, jM1211copywmQWz5c$default4, jM632getError0d7_KjU3, jM1211copywmQWz5c$default8, jM1211copywmQWz5c$default13, jM1211copywmQWz5c$default14, jM1211copywmQWz5c$default5, jM632getError0d7_KjU4, jM1211copywmQWz5c$default15, jM1211copywmQWz5c$default6, null);
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }
}
