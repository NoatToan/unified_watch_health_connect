package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J@\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0002\b\nH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R3\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR3\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u001f8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u0016\u0010$\u001a\u00020\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0014R\u0016\u0010&\u001a\u00020\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u001f\u0010(\u001a\u00020\u00048D@\u0004X\u0084\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b'\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "", "recalculateWidthAndHeight", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "", "<set-?>", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, LogUtil.I, "getWidth", "()I", "height", "getHeight", "Landroidx/compose/ui/unit/IntSize;", "value", "measuredSize", "J", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "getApparentToRealOffset-nOcc-ac", "apparentToRealOffset", "<init>", "()V", "PlacementScope", "ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private int width;

    @StabilityInferred(parameters = 0)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J)\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005J$\u0010\u000e\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005J)\u0010\u000e\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\tJD\u0010\u0016\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0016\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012J?\u0010\u0017\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012JD\u0010\u0017\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0015JJ\u0010\u001a\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u001b\b\b\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0080\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0015JJ\u0010\u001c\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u001b\b\b\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0080\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001f\u001a\u00020\u000b8$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "", "placeRelative-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "placeRelative", "", "x", "y", "place", "place-70tqf50", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeRelativeWithLayer", "placeWithLayer", "placeWithLayer-aW-9-wM", "placeAutoMirrored-aW-9-wM$ui_release", "placeAutoMirrored", "placeApparentToRealOffset-aW-9-wM$ui_release", "placeApparentToRealOffset", "getParentWidth", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class PlacementScope {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static LayoutDirection parentLayoutDirection = LayoutDirection.Ltr;
        private static int parentWidth;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0019\b\u0004\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "executeWithRtlMirroringValues", "<set-?>", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", LogUtil.I, "getParentWidth", "()I", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion extends PlacementScope {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void executeWithRtlMirroringValues(int parentWidth, @NotNull LayoutDirection parentLayoutDirection, @NotNull Function1<? super PlacementScope, Unit> block) {
                Companion companion = PlacementScope.INSTANCE;
                int parentWidth2 = companion.getParentWidth();
                LayoutDirection parentLayoutDirection2 = companion.getParentLayoutDirection();
                PlacementScope.parentWidth = parentWidth;
                PlacementScope.parentLayoutDirection = parentLayoutDirection;
                block.invoke(this);
                PlacementScope.parentWidth = parentWidth2;
                PlacementScope.parentLayoutDirection = parentLayoutDirection2;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            @NotNull
            public LayoutDirection getParentLayoutDirection() {
                return PlacementScope.parentLayoutDirection;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public int getParentWidth() {
                return PlacementScope.parentWidth;
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.place(placeable, i, i2, f);
        }

        /* JADX INFO: renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m2506place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m2510place70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelative(placeable, i, i2, f);
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m2507placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m2513placeRelative70tqf50(placeable, j, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            float f2 = (i3 & 4) != 0 ? 0.0f : f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, f2, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m2508placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            float f2 = (i & 2) != 0 ? 0.0f : f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m2514placeRelativeWithLayeraW9wM(placeable, j, f2, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            float f2 = (i3 & 4) != 0 ? 0.0f : f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i, i2, f2, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m2509placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            float f2 = (i & 2) != 0 ? 0.0f : f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m2515placeWithLayeraW9wM(placeable, j, f2, function1);
        }

        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(@NotNull Placeable placeable, int i, int i2, float f) {
            long jIntOffset = IntOffsetKt.IntOffset(i, i2);
            long jM2501getApparentToRealOffsetnOccac = placeable.m2501getApparentToRealOffsetnOccac();
            placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(jIntOffset) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac), IntOffset.m3044getYimpl(jIntOffset) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac)), f, null);
        }

        /* JADX INFO: renamed from: place-70tqf50, reason: not valid java name */
        public final void m2510place70tqf50(@NotNull Placeable placeable, long j, float f) {
            long jM2501getApparentToRealOffsetnOccac = placeable.m2501getApparentToRealOffsetnOccac();
            placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(j) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac), IntOffset.m3044getYimpl(j) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac)), f, null);
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m2511placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable placeable, long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            long jM2501getApparentToRealOffsetnOccac = placeable.m2501getApparentToRealOffsetnOccac();
            placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(j) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac), IntOffset.m3044getYimpl(j) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac)), f, function1);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m2512placeAutoMirroredaW9wM$ui_release(@NotNull Placeable placeable, long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM2501getApparentToRealOffsetnOccac = placeable.m2501getApparentToRealOffsetnOccac();
                placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(j) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac), IntOffset.m3044getYimpl(j) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac)), f, function1);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3085getWidthimpl(placeable.getMeasuredSize())) - IntOffset.m3043getXimpl(j), IntOffset.m3044getYimpl(j));
                long jM2501getApparentToRealOffsetnOccac2 = placeable.m2501getApparentToRealOffsetnOccac();
                placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(jIntOffset) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac2), IntOffset.m3044getYimpl(jIntOffset) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac2)), f, function1);
            }
        }

        public final void placeRelative(@NotNull Placeable placeable, int i, int i2, float f) {
            long jIntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM2501getApparentToRealOffsetnOccac = placeable.m2501getApparentToRealOffsetnOccac();
                placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(jIntOffset) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac), IntOffset.m3044getYimpl(jIntOffset) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac)), f, null);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3085getWidthimpl(placeable.getMeasuredSize())) - IntOffset.m3043getXimpl(jIntOffset), IntOffset.m3044getYimpl(jIntOffset));
                long jM2501getApparentToRealOffsetnOccac2 = placeable.m2501getApparentToRealOffsetnOccac();
                placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(jIntOffset2) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac2), IntOffset.m3044getYimpl(jIntOffset2) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac2)), f, null);
            }
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m2513placeRelative70tqf50(@NotNull Placeable placeable, long j, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM2501getApparentToRealOffsetnOccac = placeable.m2501getApparentToRealOffsetnOccac();
                placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(j) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac), IntOffset.m3044getYimpl(j) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac)), f, null);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3085getWidthimpl(placeable.getMeasuredSize())) - IntOffset.m3043getXimpl(j), IntOffset.m3044getYimpl(j));
                long jM2501getApparentToRealOffsetnOccac2 = placeable.m2501getApparentToRealOffsetnOccac();
                placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(jIntOffset) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac2), IntOffset.m3044getYimpl(jIntOffset) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac2)), f, null);
            }
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            long jIntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM2501getApparentToRealOffsetnOccac = placeable.m2501getApparentToRealOffsetnOccac();
                placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(jIntOffset) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac), IntOffset.m3044getYimpl(jIntOffset) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac)), f, function1);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3085getWidthimpl(placeable.getMeasuredSize())) - IntOffset.m3043getXimpl(jIntOffset), IntOffset.m3044getYimpl(jIntOffset));
                long jM2501getApparentToRealOffsetnOccac2 = placeable.m2501getApparentToRealOffsetnOccac();
                placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(jIntOffset2) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac2), IntOffset.m3044getYimpl(jIntOffset2) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac2)), f, function1);
            }
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m2514placeRelativeWithLayeraW9wM(@NotNull Placeable placeable, long j, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM2501getApparentToRealOffsetnOccac = placeable.m2501getApparentToRealOffsetnOccac();
                placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(j) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac), IntOffset.m3044getYimpl(j) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac)), f, function1);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3085getWidthimpl(placeable.getMeasuredSize())) - IntOffset.m3043getXimpl(j), IntOffset.m3044getYimpl(j));
                long jM2501getApparentToRealOffsetnOccac2 = placeable.m2501getApparentToRealOffsetnOccac();
                placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(jIntOffset) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac2), IntOffset.m3044getYimpl(jIntOffset) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac2)), f, function1);
            }
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            long jIntOffset = IntOffsetKt.IntOffset(i, i2);
            long jM2501getApparentToRealOffsetnOccac = placeable.m2501getApparentToRealOffsetnOccac();
            placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(jIntOffset) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac), IntOffset.m3044getYimpl(jIntOffset) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac)), f, function1);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m2515placeWithLayeraW9wM(@NotNull Placeable placeable, long j, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            long jM2501getApparentToRealOffsetnOccac = placeable.m2501getApparentToRealOffsetnOccac();
            placeable.mo2469placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3043getXimpl(j) + IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac), IntOffset.m3044getYimpl(j) + IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac)), f, function1);
        }
    }

    private final void recalculateWidthAndHeight() {
        this.width = e.coerceIn(IntSize.m3085getWidthimpl(getMeasuredSize()), Constraints.m2937getMinWidthimpl(getMeasurementConstraints()), Constraints.m2935getMaxWidthimpl(getMeasurementConstraints()));
        this.height = e.coerceIn(IntSize.m3084getHeightimpl(getMeasuredSize()), Constraints.m2936getMinHeightimpl(getMeasurementConstraints()), Constraints.m2934getMaxHeightimpl(getMeasurementConstraints()));
    }

    /* JADX INFO: renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m2501getApparentToRealOffsetnOccac() {
        return IntOffsetKt.IntOffset((this.width - IntSize.m3085getWidthimpl(getMeasuredSize())) / 2, (this.height - IntSize.m3084getHeightimpl(getMeasuredSize())) / 2);
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m3084getHeightimpl(getMeasuredSize());
    }

    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m3085getWidthimpl(getMeasuredSize());
    }

    /* JADX INFO: renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public abstract void mo2469placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock);

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m2504setMeasuredSizeozmzZPI(long j) {
        if (IntSize.m3083equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        recalculateWidthAndHeight();
    }

    /* JADX INFO: renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m2505setMeasurementConstraintsBRTryo0(long j) {
        if (Constraints.m2928equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        recalculateWidthAndHeight();
    }
}
