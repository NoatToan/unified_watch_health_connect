package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.DpRect;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "", "slotId", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 5, 1})
public interface SubcomposeMeasureScope extends MeasureScope {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static MeasureResult layout(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, int i, int i2, @NotNull Map<AlignmentLine, Integer> map, @NotNull Function1<? super Placeable.PlacementScope, Unit> function1) {
            return MeasureScope.DefaultImpls.layout(subcomposeMeasureScope, i, i2, map, function1);
        }

        @Stable
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2542roundToPxR2X_6o(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
            return MeasureScope.DefaultImpls.m2487roundToPxR2X_6o(subcomposeMeasureScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2543roundToPx0680j_4(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, float f) {
            return MeasureScope.DefaultImpls.m2488roundToPx0680j_4(subcomposeMeasureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2544toDpGaN1DYA(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
            return MeasureScope.DefaultImpls.m2489toDpGaN1DYA(subcomposeMeasureScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2545toDpu2uoSUM(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, float f) {
            return MeasureScope.DefaultImpls.m2490toDpu2uoSUM(subcomposeMeasureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2547toPxR2X_6o(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j) {
            return MeasureScope.DefaultImpls.m2492toPxR2X_6o(subcomposeMeasureScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2548toPx0680j_4(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, float f) {
            return MeasureScope.DefaultImpls.m2493toPx0680j_4(subcomposeMeasureScope, f);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, @NotNull DpRect dpRect) {
            return MeasureScope.DefaultImpls.toRect(subcomposeMeasureScope, dpRect);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2549toSp0xMU5do(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, float f) {
            return MeasureScope.DefaultImpls.m2494toSp0xMU5do(subcomposeMeasureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2550toSpkPz2Gy4(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, float f) {
            return MeasureScope.DefaultImpls.m2495toSpkPz2Gy4(subcomposeMeasureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2546toDpu2uoSUM(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, int i) {
            return MeasureScope.DefaultImpls.m2491toDpu2uoSUM((MeasureScope) subcomposeMeasureScope, i);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2551toSpkPz2Gy4(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, int i) {
            return MeasureScope.DefaultImpls.m2496toSpkPz2Gy4((MeasureScope) subcomposeMeasureScope, i);
        }
    }

    @NotNull
    List<Measurable> subcompose(@Nullable Object slotId, @NotNull Function2<? super Composer, ? super Integer, Unit> content);
}
