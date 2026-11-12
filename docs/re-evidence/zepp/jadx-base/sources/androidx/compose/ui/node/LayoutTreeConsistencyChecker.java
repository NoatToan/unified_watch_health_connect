package androidx.compose.ui.node;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "isTreeConsistent", "consistentLayoutState", "", "nodeToString", "logTree", "", "assertConsistent", RootDescription.ROOT_ELEMENT, "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/DepthSortedSet;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSet;", "", "postponedMeasureRequests", "Ljava/util/List;", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSet;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class LayoutTreeConsistencyChecker {

    @NotNull
    private final List<LayoutNode> postponedMeasureRequests;

    @NotNull
    private final DepthSortedSet relayoutNodes;

    @NotNull
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(@NotNull LayoutNode layoutNode, @NotNull DepthSortedSet depthSortedSet, @NotNull List<LayoutNode> list) {
        this.root = layoutNode;
        this.relayoutNodes = depthSortedSet;
        this.postponedMeasureRequests = list;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    private final boolean consistentLayoutState(LayoutNode layoutNode) {
        LayoutNode.LayoutState layoutState;
        LayoutNode.LayoutState layoutState2;
        LayoutNode.LayoutState layoutState3;
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (layoutNode.getIsPlaced()) {
            layoutState = layoutNode.getLayoutState();
            layoutState2 = LayoutNode.LayoutState.NeedsRemeasure;
            if (layoutState != layoutState2 && this.postponedMeasureRequests.contains(layoutNode)) {
                return true;
            }
            if (parent$ui_release == null) {
                layoutState3 = null;
            } else {
                layoutState3 = parent$ui_release.getLayoutState();
            }
            if (layoutNode.getLayoutState() == layoutState2) {
                return !this.relayoutNodes.contains(layoutNode) || layoutState3 == layoutState2 || layoutState3 == LayoutNode.LayoutState.Measuring;
            }
            LayoutNode.LayoutState layoutState4 = layoutNode.getLayoutState();
            LayoutNode.LayoutState layoutState5 = LayoutNode.LayoutState.NeedsRelayout;
            return layoutState4 == layoutState5 || this.relayoutNodes.contains(layoutNode) || layoutState3 == layoutState2 || layoutState3 == layoutState5 || layoutState3 == LayoutNode.LayoutState.Measuring || layoutState3 == LayoutNode.LayoutState.LayingOut;
        }
        if (layoutNode.getPlaceOrder() != Integer.MAX_VALUE) {
            if (parent$ui_release != null && parent$ui_release.getIsPlaced()) {
                layoutState = layoutNode.getLayoutState();
                layoutState2 = LayoutNode.LayoutState.NeedsRemeasure;
                if (layoutState != layoutState2) {
                }
                if (parent$ui_release == null) {
                    layoutState3 = null;
                } else {
                    layoutState3 = parent$ui_release.getLayoutState();
                }
                if (layoutNode.getLayoutState() == layoutState2) {
                    if (this.relayoutNodes.contains(layoutNode)) {
                    }
                }
                LayoutNode.LayoutState layoutState6 = layoutNode.getLayoutState();
                LayoutNode.LayoutState layoutState7 = LayoutNode.LayoutState.NeedsRelayout;
                if (layoutState6 == layoutState7) {
                }
            }
        }
        return true;
    }

    private final boolean isTreeConsistent(LayoutNode node) {
        if (!consistentLayoutState(node)) {
            return false;
        }
        List<LayoutNode> children$ui_release = node.getChildren$ui_release();
        int size = children$ui_release.size() - 1;
        if (size < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!isTreeConsistent(children$ui_release.get(i))) {
                return false;
            }
            if (i2 > size) {
                return true;
            }
            i = i2;
        }
    }

    private final String logTree() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        sb.append('\n');
        logTree$printSubTree(this, sb, this.root, 0);
        return sb.toString();
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i) {
        String strNodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        int i2 = 0;
        if (strNodeToString.length() > 0) {
            if (i > 0) {
                int i3 = 0;
                do {
                    i3++;
                    sb.append("..");
                } while (i3 < i);
            }
            sb.append(strNodeToString);
            sb.append('\n');
            i++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i4 = i2 + 1;
            logTree$printSubTree(layoutTreeConsistencyChecker, sb, children$ui_release.get(i2), i);
            if (i4 > size) {
                return;
            } else {
                i2 = i4;
            }
        }
    }

    private final String nodeToString(LayoutNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(node);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(JsonLexerKt.BEGIN_LIST);
        sb2.append(node.getLayoutState());
        sb2.append(JsonLexerKt.END_LIST);
        sb.append(sb2.toString());
        if (!node.getIsPlaced()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + node.getMeasuredByParent() + JsonLexerKt.END_LIST);
        if (!consistentLayoutState(node)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    public final void assertConsistent() {
        if (!isTreeConsistent(this.root)) {
            System.out.println((Object) logTree());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}
