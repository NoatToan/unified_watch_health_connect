package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JG\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "ui_release"}, k = 1, mv = {1, 5, 1})
public interface MeasureScope extends IntrinsicMeasureScope {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static MeasureResult layout(@NotNull MeasureScope measureScope, int i, int i2, @NotNull Map<AlignmentLine, Integer> map, @NotNull Function1<? super Placeable.PlacementScope, Unit> function1) {
            return new MeasureResult(i, i2, map, measureScope, function1) { // from class: androidx.compose.ui.layout.MeasureScope.layout.1
                public final /* synthetic */ Map<AlignmentLine, Integer> $alignmentLines;
                public final /* synthetic */ int $height;
                public final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
                public final /* synthetic */ int $width;

                @NotNull
                private final Map<AlignmentLine, Integer> alignmentLines;
                private final int height;
                public final /* synthetic */ MeasureScope this$0;
                private final int width;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.$width = i;
                    this.$height = i2;
                    this.$alignmentLines = map;
                    this.this$0 = measureScope;
                    this.$placementBlock = function1;
                    this.width = i;
                    this.height = i2;
                    this.alignmentLines = map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                @NotNull
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                    int i3 = this.$width;
                    LayoutDirection layoutDirection = this.this$0.getLayoutDirection();
                    Function1<Placeable.PlacementScope, Unit> function2 = this.$placementBlock;
                    int parentWidth = companion.getParentWidth();
                    LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                    Placeable.PlacementScope.parentWidth = i3;
                    Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
                    function2.invoke(companion);
                    Placeable.PlacementScope.parentWidth = parentWidth;
                    Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
            }
            if ((i3 & 4) != 0) {
                map = r.emptyMap();
            }
            return measureScope.layout(i, i2, map, function1);
        }

        @Stable
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2487roundToPxR2X_6o(@NotNull MeasureScope measureScope, long j) {
            return IntrinsicMeasureScope.DefaultImpls.m2470roundToPxR2X_6o(measureScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2488roundToPx0680j_4(@NotNull MeasureScope measureScope, float f) {
            return IntrinsicMeasureScope.DefaultImpls.m2471roundToPx0680j_4(measureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2489toDpGaN1DYA(@NotNull MeasureScope measureScope, long j) {
            return IntrinsicMeasureScope.DefaultImpls.m2472toDpGaN1DYA(measureScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2490toDpu2uoSUM(@NotNull MeasureScope measureScope, float f) {
            return IntrinsicMeasureScope.DefaultImpls.m2473toDpu2uoSUM(measureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2492toPxR2X_6o(@NotNull MeasureScope measureScope, long j) {
            return IntrinsicMeasureScope.DefaultImpls.m2475toPxR2X_6o(measureScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2493toPx0680j_4(@NotNull MeasureScope measureScope, float f) {
            return IntrinsicMeasureScope.DefaultImpls.m2476toPx0680j_4(measureScope, f);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull MeasureScope measureScope, @NotNull DpRect dpRect) {
            return IntrinsicMeasureScope.DefaultImpls.toRect(measureScope, dpRect);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2494toSp0xMU5do(@NotNull MeasureScope measureScope, float f) {
            return IntrinsicMeasureScope.DefaultImpls.m2477toSp0xMU5do(measureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2495toSpkPz2Gy4(@NotNull MeasureScope measureScope, float f) {
            return IntrinsicMeasureScope.DefaultImpls.m2478toSpkPz2Gy4(measureScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2491toDpu2uoSUM(@NotNull MeasureScope measureScope, int i) {
            return IntrinsicMeasureScope.DefaultImpls.m2474toDpu2uoSUM((IntrinsicMeasureScope) measureScope, i);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2496toSpkPz2Gy4(@NotNull MeasureScope measureScope, int i) {
            return IntrinsicMeasureScope.DefaultImpls.m2479toSpkPz2Gy4((IntrinsicMeasureScope) measureScope, i);
        }
    }

    @NotNull
    MeasureResult layout(int width, int height, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock);
}
