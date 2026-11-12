package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\n\u001a\u00020\u0007*\u00020\u0002H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u000b*\u00020\u0002H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u000bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\n\u001a\u00020\u0007*\u00020\u000bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u0002*\u00020\u000bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001c\u0010\u0014\u001a\u00020\u0002*\u00020\u0007H\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u000e\u001a\u00020\u000b*\u00020\u0007H\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0014\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0005J\u001c\u0010\u000e\u001a\u00020\u000b*\u00020\u0003H\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\rJ\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0017R\u001c\u0010 \u001a\u00020\u00038&@'X§\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010#\u001a\u00020\u00038&@'X§\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/unit/Density;", "", "Landroidx/compose/ui/unit/Dp;", "", "toPx-0680j_4", "(F)F", "toPx", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "toSp-0xMU5do", "(F)J", "toSp", "toPx--R2X_6o", "(J)F", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "toDp", "toDp-u2uoSUM", "(I)F", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "getDensity", "()F", "getDensity$annotations", "()V", Constants.JSON_DENSITY, "getFontScale", "getFontScale$annotations", "fontScale", "ui-unit_release"}, k = 1, mv = {1, 5, 1})
public interface Density {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Stable
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2953roundToPxR2X_6o(@NotNull Density density, long j) {
            return c.roundToInt(density.mo192toPxR2X_6o(j));
        }

        @Stable
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2954roundToPx0680j_4(@NotNull Density density, float f) {
            float fMo193toPx0680j_4 = density.mo193toPx0680j_4(f);
            if (Float.isInfinite(fMo193toPx0680j_4)) {
                return Integer.MAX_VALUE;
            }
            return c.roundToInt(fMo193toPx0680j_4);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2955toDpGaN1DYA(@NotNull Density density, long j) {
            if (TextUnitType.m3134equalsimpl0(TextUnit.m3105getTypeUIouoOA(j), TextUnitType.INSTANCE.m3139getSpUIouoOA())) {
                return Dp.m2965constructorimpl(TextUnit.m3106getValueimpl(j) * density.getFontScale());
            }
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2957toDpu2uoSUM(@NotNull Density density, int i) {
            return Dp.m2965constructorimpl(i / density.getDensity());
        }

        @Stable
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2958toPxR2X_6o(@NotNull Density density, long j) {
            if (TextUnitType.m3134equalsimpl0(TextUnit.m3105getTypeUIouoOA(j), TextUnitType.INSTANCE.m3139getSpUIouoOA())) {
                return TextUnit.m3106getValueimpl(j) * density.getFontScale() * density.getDensity();
            }
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }

        @Stable
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2959toPx0680j_4(@NotNull Density density, float f) {
            return f * density.getDensity();
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull Density density, @NotNull DpRect dpRect) {
            return new Rect(density.mo193toPx0680j_4(dpRect.m3031getLeftD9Ej5fM()), density.mo193toPx0680j_4(dpRect.m3033getTopD9Ej5fM()), density.mo193toPx0680j_4(dpRect.m3032getRightD9Ej5fM()), density.mo193toPx0680j_4(dpRect.m3030getBottomD9Ej5fM()));
        }

        @Stable
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2960toSp0xMU5do(@NotNull Density density, float f) {
            return TextUnitKt.getSp(f / density.getFontScale());
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2962toSpkPz2Gy4(@NotNull Density density, int i) {
            return TextUnitKt.getSp(i / (density.getFontScale() * density.getDensity()));
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2961toSpkPz2Gy4(@NotNull Density density, float f) {
            return TextUnitKt.getSp(f / (density.getFontScale() * density.getDensity()));
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2956toDpu2uoSUM(@NotNull Density density, float f) {
            return Dp.m2965constructorimpl(f / density.getDensity());
        }
    }

    float getDensity();

    float getFontScale();

    @Stable
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    int mo187roundToPxR2X_6o(long j);

    @Stable
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    int mo188roundToPx0680j_4(float f);

    @Stable
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    float mo189toDpGaN1DYA(long j);

    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    float mo190toDpu2uoSUM(float f);

    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    float mo191toDpu2uoSUM(int i);

    @Stable
    /* JADX INFO: renamed from: toPx--R2X_6o */
    float mo192toPxR2X_6o(long j);

    @Stable
    /* JADX INFO: renamed from: toPx-0680j_4 */
    float mo193toPx0680j_4(float f);

    @Stable
    @NotNull
    Rect toRect(@NotNull DpRect dpRect);

    @Stable
    /* JADX INFO: renamed from: toSp-0xMU5do */
    long mo194toSp0xMU5do(float f);

    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    long mo195toSpkPz2Gy4(float f);

    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    long mo196toSpkPz2Gy4(int i);
}
