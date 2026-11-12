package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.ModifiedFocusNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a1\u0010\u000b\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0011\u001a\f\u0010\u0018\u001a\u00020\u0007*\u00020\u0007H\u0002\u001a\f\u0010\u0019\u001a\u00020\u0007*\u00020\u0007H\u0002\"\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/ModifiedFocusNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "twoDimensionalFocusSearch-Mxy_nc0", "(Landroidx/compose/ui/node/ModifiedFocusNode;I)Landroidx/compose/ui/node/ModifiedFocusNode;", "twoDimensionalFocusSearch", "", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "findBestCandidate-4WY_MpI", "(Ljava/util/List;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/node/ModifiedFocusNode;", "findBestCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "", "isBetterCandidate-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "source", "rect1", "rect2", "beamBeats-I7lrPNg", "beamBeats", "topLeft", "bottomRight", "", "invalidFocusDirection", "Ljava/lang/String;", "noActiveChild", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class TwoDimensionalFocusSearchKt {

    @NotNull
    private static final String invalidFocusDirection = "This function should only be used for 2-D focus search";

    @NotNull
    private static final String noActiveChild = "ActiveParent must have a focusedChild";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Inactive.ordinal()] = 1;
            iArr[FocusStateImpl.Disabled.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.Active.ordinal()] = 4;
            iArr[FocusStateImpl.Captured.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m944beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i, rect)) {
            return false;
        }
        if (beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i, rect)) {
            FocusDirection.Companion companion = FocusDirection.INSTANCE;
            if (!FocusDirection.m927equalsimpl0(i, companion.m935getLeftdhqQ8s()) && !FocusDirection.m927equalsimpl0(i, companion.m939getRightdhqQ8s()) && m945beamBeats_I7lrPNg$majorAxisDistance2(rect2, i, rect) >= beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i, rect)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!(FocusDirection.m927equalsimpl0(i, companion.m935getLeftdhqQ8s()) ? true : FocusDirection.m927equalsimpl0(i, companion.m939getRightdhqQ8s()))) {
            if (!(FocusDirection.m927equalsimpl0(i, companion.m940getUpdhqQ8s()) ? true : FocusDirection.m927equalsimpl0(i, companion.m933getDowndhqQ8s()))) {
                throw new IllegalStateException(invalidFocusDirection.toString());
            }
            if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                return true;
            }
        } else if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
            return true;
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m927equalsimpl0(i, companion.m935getLeftdhqQ8s())) {
            if (rect2.getLeft() >= rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m927equalsimpl0(i, companion.m939getRightdhqQ8s())) {
            if (rect2.getRight() <= rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m927equalsimpl0(i, companion.m940getUpdhqQ8s())) {
            if (rect2.getTop() >= rect.getBottom()) {
                return true;
            }
        } else {
            if (!FocusDirection.m927equalsimpl0(i, companion.m933getDowndhqQ8s())) {
                throw new IllegalStateException(invalidFocusDirection.toString());
            }
            if (rect2.getBottom() <= rect.getTop()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: beamBeats_I7lrPNg$majorAxisDistance-2, reason: not valid java name */
    private static final float m945beamBeats_I7lrPNg$majorAxisDistance2(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m927equalsimpl0(i, companion.m935getLeftdhqQ8s())) {
            if (FocusDirection.m927equalsimpl0(i, companion.m939getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m927equalsimpl0(i, companion.m940getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m927equalsimpl0(i, companion.m933getDowndhqQ8s())) {
                    throw new IllegalStateException(invalidFocusDirection.toString());
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m927equalsimpl0(i, companion.m935getLeftdhqQ8s())) {
            if (FocusDirection.m927equalsimpl0(i, companion.m939getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m927equalsimpl0(i, companion.m940getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else {
                if (!FocusDirection.m927equalsimpl0(i, companion.m933getDowndhqQ8s())) {
                    throw new IllegalStateException(invalidFocusDirection.toString());
                }
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f = bottom - bottom2;
            return Math.max(1.0f, f);
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f = top - top2;
        return Math.max(1.0f, f);
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    /* JADX INFO: renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final ModifiedFocusNode m946findBestCandidate4WY_MpI(List<ModifiedFocusNode> list, Rect rect, int i) {
        Rect rectTranslate;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m927equalsimpl0(i, companion.m935getLeftdhqQ8s())) {
            rectTranslate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (FocusDirection.m927equalsimpl0(i, companion.m939getRightdhqQ8s())) {
            rectTranslate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (FocusDirection.m927equalsimpl0(i, companion.m940getUpdhqQ8s())) {
            rectTranslate = rect.translate(0.0f, rect.getHeight() + 1);
        } else {
            if (!FocusDirection.m927equalsimpl0(i, companion.m933getDowndhqQ8s())) {
                throw new IllegalStateException(invalidFocusDirection.toString());
            }
            rectTranslate = rect.translate(0.0f, -(rect.getHeight() + 1));
        }
        ModifiedFocusNode modifiedFocusNode = null;
        int i2 = 0;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = i2 + 1;
                ModifiedFocusNode modifiedFocusNode2 = list.get(i2);
                Rect rectFocusRect = modifiedFocusNode2.focusRect();
                if (m947isBetterCandidateI7lrPNg(rectFocusRect, rectTranslate, rect, i)) {
                    modifiedFocusNode = modifiedFocusNode2;
                    rectTranslate = rectFocusRect;
                }
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        return modifiedFocusNode;
    }

    /* JADX INFO: renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    private static final boolean m947isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (isBetterCandidate_I7lrPNg$isCandidate(rect, i, rect3)) {
            if (!isBetterCandidate_I7lrPNg$isCandidate(rect2, i, rect3) || m944beamBeatsI7lrPNg(rect3, rect, rect2, i)) {
                return true;
            }
            if (!m944beamBeatsI7lrPNg(rect3, rect2, rect, i) && isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m927equalsimpl0(i, companion.m935getLeftdhqQ8s())) {
            if ((rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m927equalsimpl0(i, companion.m939getRightdhqQ8s())) {
            if ((rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m927equalsimpl0(i, companion.m940getUpdhqQ8s())) {
            if ((rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop()) {
                return true;
            }
        } else {
            if (!FocusDirection.m927equalsimpl0(i, companion.m933getDowndhqQ8s())) {
                throw new IllegalStateException(invalidFocusDirection.toString());
            }
            if ((rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom()) {
                return true;
            }
        }
        return false;
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m927equalsimpl0(i, companion.m935getLeftdhqQ8s())) {
            if (FocusDirection.m927equalsimpl0(i, companion.m939getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m927equalsimpl0(i, companion.m940getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m927equalsimpl0(i, companion.m933getDowndhqQ8s())) {
                    throw new IllegalStateException(invalidFocusDirection.toString());
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i, Rect rect2) {
        float f;
        float left;
        float left2;
        float width;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m927equalsimpl0(i, companion.m935getLeftdhqQ8s()) ? true : FocusDirection.m927equalsimpl0(i, companion.m939getRightdhqQ8s())) {
            f = 2;
            left = rect2.getTop() + (rect2.getHeight() / f);
            left2 = rect.getTop();
            width = rect.getHeight();
        } else {
            if (!(FocusDirection.m927equalsimpl0(i, companion.m940getUpdhqQ8s()) ? true : FocusDirection.m927equalsimpl0(i, companion.m933getDowndhqQ8s()))) {
                throw new IllegalStateException(invalidFocusDirection.toString());
            }
            f = 2;
            left = rect2.getLeft() + (rect2.getWidth() / f);
            left2 = rect.getLeft();
            width = rect.getWidth();
        }
        return left - (left2 + (width / f));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i, Rect rect, Rect rect2) {
        long jAbs = (long) Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i, rect));
        long jAbs2 = (long) Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i, rect));
        return (((long) 13) * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    @Nullable
    /* JADX INFO: renamed from: twoDimensionalFocusSearch-Mxy_nc0, reason: not valid java name */
    public static final ModifiedFocusNode m948twoDimensionalFocusSearchMxy_nc0(@NotNull ModifiedFocusNode modifiedFocusNode, int i) {
        ModifiedFocusNode modifiedFocusNodeM948twoDimensionalFocusSearchMxy_nc0;
        Rect rectBottomRight;
        int i2 = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()];
        if (i2 == 1) {
            return modifiedFocusNode;
        }
        if (i2 == 2) {
            return null;
        }
        if (i2 == 3) {
            ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
            if (focusedChild == null) {
                throw new IllegalStateException(noActiveChild.toString());
            }
            if (focusedChild.getFocusState() == FocusStateImpl.ActiveParent && (modifiedFocusNodeM948twoDimensionalFocusSearchMxy_nc0 = m948twoDimensionalFocusSearchMxy_nc0(focusedChild, i)) != null) {
                return modifiedFocusNodeM948twoDimensionalFocusSearchMxy_nc0;
            }
            ModifiedFocusNode modifiedFocusNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(modifiedFocusNode);
            Rect rectFocusRect = modifiedFocusNodeFindActiveFocusNode != null ? modifiedFocusNodeFindActiveFocusNode.focusRect() : null;
            if (rectFocusRect != null) {
                return m946findBestCandidate4WY_MpI(modifiedFocusNode.focusableChildren(), rectFocusRect, i);
            }
            throw new IllegalStateException(noActiveChild.toString());
        }
        if (i2 != 4 && i2 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        List<ModifiedFocusNode> listFocusableChildren = modifiedFocusNode.focusableChildren();
        if (listFocusableChildren.size() <= 1) {
            return (ModifiedFocusNode) CollectionsKt.firstOrNull((List) listFocusableChildren);
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m927equalsimpl0(i, companion.m939getRightdhqQ8s()) ? true : FocusDirection.m927equalsimpl0(i, companion.m933getDowndhqQ8s())) {
            rectBottomRight = topLeft(modifiedFocusNode.focusRect());
        } else {
            if (!(FocusDirection.m927equalsimpl0(i, companion.m935getLeftdhqQ8s()) ? true : FocusDirection.m927equalsimpl0(i, companion.m940getUpdhqQ8s()))) {
                throw new IllegalStateException(invalidFocusDirection.toString());
            }
            rectBottomRight = bottomRight(modifiedFocusNode.focusRect());
        }
        return m946findBestCandidate4WY_MpI(listFocusableChildren, rectBottomRight, i);
    }
}
