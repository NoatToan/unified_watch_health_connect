package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictsSuspension
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001f\u0010\n\u001a\u00020\u00078&@&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/input/pointer/PointerEvent;", "awaitPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "ui_release"}, k = 1, mv = {1, 5, 1})
public interface AwaitPointerEventScope extends Density {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
            }
            if ((i & 1) != 0) {
                pointerEventPass = PointerEventPass.Main;
            }
            return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
        }

        @Stable
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2357roundToPxR2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j) {
            return Density.DefaultImpls.m2953roundToPxR2X_6o(awaitPointerEventScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2358roundToPx0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f) {
            return Density.DefaultImpls.m2954roundToPx0680j_4(awaitPointerEventScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2359toDpGaN1DYA(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j) {
            return Density.DefaultImpls.m2955toDpGaN1DYA(awaitPointerEventScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2360toDpu2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f) {
            return Density.DefaultImpls.m2956toDpu2uoSUM(awaitPointerEventScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2362toPxR2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope, long j) {
            return Density.DefaultImpls.m2958toPxR2X_6o(awaitPointerEventScope, j);
        }

        @Stable
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2363toPx0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f) {
            return Density.DefaultImpls.m2959toPx0680j_4(awaitPointerEventScope, f);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull AwaitPointerEventScope awaitPointerEventScope, @NotNull DpRect dpRect) {
            return Density.DefaultImpls.toRect(awaitPointerEventScope, dpRect);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2364toSp0xMU5do(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f) {
            return Density.DefaultImpls.m2960toSp0xMU5do(awaitPointerEventScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2365toSpkPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope, float f) {
            return Density.DefaultImpls.m2961toSpkPz2Gy4(awaitPointerEventScope, f);
        }

        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2361toDpu2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope, int i) {
            return Density.DefaultImpls.m2957toDpu2uoSUM((Density) awaitPointerEventScope, i);
        }

        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2366toSpkPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope, int i) {
            return Density.DefaultImpls.m2962toSpkPz2Gy4((Density) awaitPointerEventScope, i);
        }
    }

    @Nullable
    Object awaitPointerEvent(@NotNull PointerEventPass pointerEventPass, @NotNull Continuation<? super PointerEvent> continuation);

    @NotNull
    PointerEvent getCurrentEvent();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo2356getSizeYbymL2g();

    @NotNull
    ViewConfiguration getViewConfiguration();
}
