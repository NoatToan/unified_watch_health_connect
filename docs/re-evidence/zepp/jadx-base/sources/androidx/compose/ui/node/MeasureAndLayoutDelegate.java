package androidx.compose.ui.node;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b3\u00104J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0006J\u0010\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0002R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 8F@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R!\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010/\u001a\u00020\u0006*\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u00102\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/unit/Constraints;", "rootConstraints", "", "doRemeasure-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)Z", "doRemeasure", "constraints", "", "updateRootConstraints-BRTryo0", "(J)V", "updateRootConstraints", "requestRemeasure", "requestRelayout", "measureAndLayout", "forceDispatch", "dispatchOnPositionedCallbacks", "node", "onNodeDetached", RootDescription.ROOT_ELEMENT, "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/DepthSortedSet;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSet;", "duringMeasureLayout", "Z", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "onPositionedDispatcher", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "", "<set-?>", "measureIteration", "J", "getMeasureIteration", "()J", "", "postponedMeasureRequests", "Ljava/util/List;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "consistencyChecker", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "getCanAffectParent", "(Landroidx/compose/ui/node/LayoutNode;)Z", "canAffectParent", "getHasPendingMeasureOrLayout", "()Z", "hasPendingMeasureOrLayout", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class MeasureAndLayoutDelegate {

    @Nullable
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringMeasureLayout;
    private long measureIteration;

    @NotNull
    private final OnPositionedDispatcher onPositionedDispatcher;

    @NotNull
    private final List<LayoutNode> postponedMeasureRequests;

    @NotNull
    private final DepthSortedSet relayoutNodes;

    @NotNull
    private final LayoutNode root;

    @Nullable
    private Constraints rootConstraints;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.NeedsRemeasure.ordinal()] = 2;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
            iArr[LayoutNode.LayoutState.NeedsRelayout.ordinal()] = 4;
            iArr[LayoutNode.LayoutState.Ready.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(@NotNull LayoutNode layoutNode) {
        this.root = layoutNode;
        Owner.Companion companion = Owner.INSTANCE;
        DepthSortedSet depthSortedSet = new DepthSortedSet(companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSet;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.measureIteration = 1L;
        ArrayList arrayList = new ArrayList();
        this.postponedMeasureRequests = arrayList;
        this.consistencyChecker = companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(layoutNode, depthSortedSet, arrayList) : null;
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: doRemeasure-0kLqBqw, reason: not valid java name */
    public final boolean m2577doRemeasure0kLqBqw(LayoutNode layoutNode, long rootConstraints) {
        boolean zM2560remeasure_Sx5XlM$ui_release = layoutNode == this.root ? layoutNode.m2560remeasure_Sx5XlM$ui_release(Constraints.m2923boximpl(rootConstraints)) : LayoutNode.m2557remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zM2560remeasure_Sx5XlM$ui_release) {
            if (parent$ui_release == null) {
                return true;
            }
            if (layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure(parent$ui_release);
            } else {
                if (!(layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InLayoutBlock)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                requestRelayout(parent$ui_release);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getCanAffectParent(LayoutNode layoutNode) {
        return layoutNode.getLayoutState() == LayoutNode.LayoutState.NeedsRemeasure && (layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getAlignmentLines().getRequired$ui_release());
    }

    public final void dispatchOnPositionedCallbacks(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return !this.relayoutNodes.isEmpty();
    }

    public final long getMeasureIteration() {
        if (this.duringMeasureLayout) {
            return this.measureIteration;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public final boolean measureAndLayout() {
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.getIsPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Constraints constraints = this.rootConstraints;
        if (constraints == null) {
            return false;
        }
        long value = constraints.getValue();
        if (!(!this.relayoutNodes.isEmpty())) {
            return false;
        }
        this.duringMeasureLayout = true;
        try {
            DepthSortedSet depthSortedSet = this.relayoutNodes;
            boolean z = false;
            while (!depthSortedSet.isEmpty()) {
                LayoutNode layoutNodePop = depthSortedSet.pop();
                if (layoutNodePop.getIsPlaced() || getCanAffectParent(layoutNodePop) || layoutNodePop.getAlignmentLines().getRequired$ui_release()) {
                    if (layoutNodePop.getLayoutState() == LayoutNode.LayoutState.NeedsRemeasure && m2577doRemeasure0kLqBqw(layoutNodePop, value)) {
                        z = true;
                    }
                    if (layoutNodePop.getLayoutState() == LayoutNode.LayoutState.NeedsRelayout && layoutNodePop.getIsPlaced()) {
                        if (layoutNodePop == this.root) {
                            layoutNodePop.place$ui_release(0, 0);
                        } else {
                            layoutNodePop.replace$ui_release();
                        }
                        this.onPositionedDispatcher.onNodePositioned(layoutNodePop);
                        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                        if (layoutTreeConsistencyChecker != null) {
                            layoutTreeConsistencyChecker.assertConsistent();
                        }
                    }
                    this.measureIteration = getMeasureIteration() + 1;
                    if (!this.postponedMeasureRequests.isEmpty()) {
                        List list = this.postponedMeasureRequests;
                        int size = list.size() - 1;
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                LayoutNode layoutNode = (LayoutNode) list.get(i);
                                if (layoutNode.isAttached()) {
                                    requestRemeasure(layoutNode);
                                }
                                if (i2 > size) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        this.postponedMeasureRequests.clear();
                    }
                }
            }
            this.duringMeasureLayout = false;
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
            if (layoutTreeConsistencyChecker2 != null) {
                layoutTreeConsistencyChecker2.assertConsistent();
            }
            return z;
        } catch (Throwable th) {
            this.duringMeasureLayout = false;
            throw th;
        }
    }

    public final void onNodeDetached(@NotNull LayoutNode node) {
        this.relayoutNodes.remove(node);
    }

    public final boolean requestRelayout(@NotNull LayoutNode layoutNode) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker == null) {
                return false;
            }
            layoutTreeConsistencyChecker.assertConsistent();
            return false;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.NeedsRelayout;
        layoutNode.setLayoutState$ui_release(layoutState);
        if (layoutNode.getIsPlaced()) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            LayoutNode.LayoutState layoutState2 = parent$ui_release == null ? null : parent$ui_release.getLayoutState();
            if (layoutState2 != LayoutNode.LayoutState.NeedsRemeasure && layoutState2 != layoutState) {
                this.relayoutNodes.add(layoutNode);
            }
        }
        return !this.duringMeasureLayout;
    }

    public final boolean requestRemeasure(@NotNull LayoutNode layoutNode) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                this.postponedMeasureRequests.add(layoutNode);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } else {
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.duringMeasureLayout && layoutNode.getWasMeasuredDuringThisIteration$ui_release()) {
                    this.postponedMeasureRequests.add(layoutNode);
                } else {
                    LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.NeedsRemeasure;
                    layoutNode.setLayoutState$ui_release(layoutState);
                    if (layoutNode.getIsPlaced() || getCanAffectParent(layoutNode)) {
                        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                        if ((parent$ui_release == null ? null : parent$ui_release.getLayoutState()) != layoutState) {
                            this.relayoutNodes.add(layoutNode);
                        }
                    }
                }
                if (!this.duringMeasureLayout) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m2578updateRootConstraintsBRTryo0(long constraints) {
        Constraints constraints2 = this.rootConstraints;
        if (constraints2 == null ? false : Constraints.m2928equalsimpl0(constraints2.getValue(), constraints)) {
            return;
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.rootConstraints = Constraints.m2923boximpl(constraints);
        this.root.setLayoutState$ui_release(LayoutNode.LayoutState.NeedsRemeasure);
        this.relayoutNodes.add(this.root);
    }
}
