package androidx.compose.ui.graphics.drawscope;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "drawContent", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
public interface ContentDrawScope extends DrawScope {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m1600getCenterF1C5BW0(@NotNull ContentDrawScope contentDrawScope) {
            return DrawScope.DefaultImpls.m1631getCenterF1C5BW0(contentDrawScope);
        }

        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m1601getSizeNHjbRc(@NotNull ContentDrawScope contentDrawScope) {
            return DrawScope.DefaultImpls.m1632getSizeNHjbRc(contentDrawScope);
        }

        @Stable
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m1602roundToPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j) {
            return DrawScope.DefaultImpls.m1634roundToPxR2X_6o(contentDrawScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m1603roundToPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return DrawScope.DefaultImpls.m1635roundToPx0680j_4(contentDrawScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m1604toDpGaN1DYA(@NotNull ContentDrawScope contentDrawScope, long j) {
            return DrawScope.DefaultImpls.m1636toDpGaN1DYA(contentDrawScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1605toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, float f) {
            return DrawScope.DefaultImpls.m1637toDpu2uoSUM(contentDrawScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m1607toPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j) {
            return DrawScope.DefaultImpls.m1639toPxR2X_6o(contentDrawScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m1608toPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return DrawScope.DefaultImpls.m1640toPx0680j_4(contentDrawScope, f);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull ContentDrawScope contentDrawScope, @NotNull DpRect dpRect) {
            return DrawScope.DefaultImpls.toRect(contentDrawScope, dpRect);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m1609toSp0xMU5do(@NotNull ContentDrawScope contentDrawScope, float f) {
            return DrawScope.DefaultImpls.m1641toSp0xMU5do(contentDrawScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1610toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return DrawScope.DefaultImpls.m1642toSpkPz2Gy4(contentDrawScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1606toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, int i) {
            return DrawScope.DefaultImpls.m1638toDpu2uoSUM((DrawScope) contentDrawScope, i);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1611toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, int i) {
            return DrawScope.DefaultImpls.m1643toSpkPz2Gy4((DrawScope) contentDrawScope, i);
        }
    }

    void drawContent();
}
