package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "", "awaitRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryAwaitRelease", "foundation_release"}, k = 1, mv = {1, 5, 1})
public interface PressGestureScope extends Density {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Stable
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m177roundToPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j) {
            return Density.DefaultImpls.m2953roundToPxR2X_6o(pressGestureScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m178roundToPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f) {
            return Density.DefaultImpls.m2954roundToPx0680j_4(pressGestureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m179toDpGaN1DYA(@NotNull PressGestureScope pressGestureScope, long j) {
            return Density.DefaultImpls.m2955toDpGaN1DYA(pressGestureScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m180toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, float f) {
            return Density.DefaultImpls.m2956toDpu2uoSUM(pressGestureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m182toPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j) {
            return Density.DefaultImpls.m2958toPxR2X_6o(pressGestureScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m183toPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f) {
            return Density.DefaultImpls.m2959toPx0680j_4(pressGestureScope, f);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull PressGestureScope pressGestureScope, @NotNull DpRect dpRect) {
            return Density.DefaultImpls.toRect(pressGestureScope, dpRect);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m184toSp0xMU5do(@NotNull PressGestureScope pressGestureScope, float f) {
            return Density.DefaultImpls.m2960toSp0xMU5do(pressGestureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m185toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, float f) {
            return Density.DefaultImpls.m2961toSpkPz2Gy4(pressGestureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m181toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, int i) {
            return Density.DefaultImpls.m2957toDpu2uoSUM((Density) pressGestureScope, i);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m186toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, int i) {
            return Density.DefaultImpls.m2962toSpkPz2Gy4((Density) pressGestureScope, i);
        }
    }

    @Nullable
    Object awaitRelease(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object tryAwaitRelease(@NotNull Continuation<? super Boolean> continuation);
}
