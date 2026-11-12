package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "ui_release"}, k = 1, mv = {1, 5, 1})
public interface IntrinsicMeasureScope extends Density {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Stable
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2470roundToPxR2X_6o(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, long j) {
            return Density.DefaultImpls.m2953roundToPxR2X_6o(intrinsicMeasureScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2471roundToPx0680j_4(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, float f) {
            return Density.DefaultImpls.m2954roundToPx0680j_4(intrinsicMeasureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2472toDpGaN1DYA(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, long j) {
            return Density.DefaultImpls.m2955toDpGaN1DYA(intrinsicMeasureScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2473toDpu2uoSUM(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, float f) {
            return Density.DefaultImpls.m2956toDpu2uoSUM(intrinsicMeasureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2475toPxR2X_6o(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, long j) {
            return Density.DefaultImpls.m2958toPxR2X_6o(intrinsicMeasureScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2476toPx0680j_4(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, float f) {
            return Density.DefaultImpls.m2959toPx0680j_4(intrinsicMeasureScope, f);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull DpRect dpRect) {
            return Density.DefaultImpls.toRect(intrinsicMeasureScope, dpRect);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2477toSp0xMU5do(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, float f) {
            return Density.DefaultImpls.m2960toSp0xMU5do(intrinsicMeasureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2478toSpkPz2Gy4(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, float f) {
            return Density.DefaultImpls.m2961toSpkPz2Gy4(intrinsicMeasureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2474toDpu2uoSUM(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, int i) {
            return Density.DefaultImpls.m2957toDpu2uoSUM((Density) intrinsicMeasureScope, i);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2479toSpkPz2Gy4(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, int i) {
            return Density.DefaultImpls.m2962toSpkPz2Gy4((Density) intrinsicMeasureScope, i);
        }
    }

    @NotNull
    LayoutDirection getLayoutDirection();
}
