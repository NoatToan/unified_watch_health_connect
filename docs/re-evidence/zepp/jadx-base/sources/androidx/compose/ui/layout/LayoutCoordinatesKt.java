package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.comparisons.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0000\u001a\f\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Offset;", "positionInRoot", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInWindow", "Landroidx/compose/ui/geometry/Rect;", "boundsInRoot", "boundsInWindow", "positionInParent", "boundsInParent", "findRoot", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class LayoutCoordinatesKt {
    @NotNull
    public static final Rect boundsInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates == null ? new Rect(0.0f, 0.0f, IntSize.m3085getWidthimpl(layoutCoordinates.mo2480getSizeYbymL2g()), IntSize.m3084getHeightimpl(layoutCoordinates.mo2480getSizeYbymL2g())) : LayoutCoordinates.DefaultImpls.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null);
    }

    @NotNull
    public static final Rect boundsInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.DefaultImpls.localBoundingBoxOf$default(findRoot(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesFindRoot = findRoot(layoutCoordinates);
        Rect rectBoundsInRoot = boundsInRoot(layoutCoordinates);
        long jMo2483localToWindowMKHz9U = layoutCoordinatesFindRoot.mo2483localToWindowMKHz9U(OffsetKt.Offset(rectBoundsInRoot.getLeft(), rectBoundsInRoot.getTop()));
        long jMo2483localToWindowMKHz9U2 = layoutCoordinatesFindRoot.mo2483localToWindowMKHz9U(OffsetKt.Offset(rectBoundsInRoot.getRight(), rectBoundsInRoot.getTop()));
        long jMo2483localToWindowMKHz9U3 = layoutCoordinatesFindRoot.mo2483localToWindowMKHz9U(OffsetKt.Offset(rectBoundsInRoot.getRight(), rectBoundsInRoot.getBottom()));
        long jMo2483localToWindowMKHz9U4 = layoutCoordinatesFindRoot.mo2483localToWindowMKHz9U(OffsetKt.Offset(rectBoundsInRoot.getLeft(), rectBoundsInRoot.getBottom()));
        return new Rect(a.minOf(Offset.m983getXimpl(jMo2483localToWindowMKHz9U), Offset.m983getXimpl(jMo2483localToWindowMKHz9U2), Offset.m983getXimpl(jMo2483localToWindowMKHz9U4), Offset.m983getXimpl(jMo2483localToWindowMKHz9U3)), a.minOf(Offset.m984getYimpl(jMo2483localToWindowMKHz9U), Offset.m984getYimpl(jMo2483localToWindowMKHz9U2), Offset.m984getYimpl(jMo2483localToWindowMKHz9U4), Offset.m984getYimpl(jMo2483localToWindowMKHz9U3)), a.maxOf(Offset.m983getXimpl(jMo2483localToWindowMKHz9U), Offset.m983getXimpl(jMo2483localToWindowMKHz9U2), Offset.m983getXimpl(jMo2483localToWindowMKHz9U4), Offset.m983getXimpl(jMo2483localToWindowMKHz9U3)), a.maxOf(Offset.m984getYimpl(jMo2483localToWindowMKHz9U), Offset.m984getYimpl(jMo2483localToWindowMKHz9U2), Offset.m984getYimpl(jMo2483localToWindowMKHz9U4), Offset.m984getYimpl(jMo2483localToWindowMKHz9U3)));
    }

    @NotNull
    public static final LayoutCoordinates findRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        LayoutNodeWrapper layoutNodeWrapper = layoutCoordinates2 instanceof LayoutNodeWrapper ? (LayoutNodeWrapper) layoutCoordinates2 : null;
        if (layoutNodeWrapper == null) {
            return layoutCoordinates2;
        }
        LayoutNodeWrapper wrappedBy$ui_release = layoutNodeWrapper.getWrappedBy();
        while (true) {
            LayoutNodeWrapper layoutNodeWrapper2 = wrappedBy$ui_release;
            LayoutNodeWrapper layoutNodeWrapper3 = layoutNodeWrapper;
            layoutNodeWrapper = layoutNodeWrapper2;
            if (layoutNodeWrapper == null) {
                return layoutNodeWrapper3;
            }
            wrappedBy$ui_release = layoutNodeWrapper.getWrappedBy();
        }
    }

    public static final long positionInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates == null ? Offset.INSTANCE.m999getZeroF1C5BW0() : parentLayoutCoordinates.mo2481localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m999getZeroF1C5BW0());
    }

    public static final long positionInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo2482localToRootMKHz9U(Offset.INSTANCE.m999getZeroF1C5BW0());
    }

    public static final long positionInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo2483localToWindowMKHz9U(Offset.INSTANCE.m999getZeroF1C5BW0());
    }
}
