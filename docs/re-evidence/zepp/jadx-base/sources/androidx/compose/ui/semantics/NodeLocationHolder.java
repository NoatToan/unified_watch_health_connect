package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0014\u0015B\u0019\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002R\u001c\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u00058\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder;", "", "other", "", "compareTo", "Landroidx/compose/ui/node/LayoutNode;", "subtreeRoot", "Landroidx/compose/ui/node/LayoutNode;", "getSubtreeRoot$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "node", "getNode$ui_release", "Landroidx/compose/ui/geometry/Rect;", "location", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)V", "Companion", "ComparisonStrategy", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class NodeLocationHolder implements Comparable<NodeLocationHolder> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static ComparisonStrategy comparisonStrategy = ComparisonStrategy.Stripe;

    @NotNull
    private final LayoutDirection layoutDirection;

    @Nullable
    private final Rect location;

    @NotNull
    private final LayoutNode node;

    @NotNull
    private final LayoutNode subtreeRoot;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$Companion;", "", "Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "comparisonStrategy", "Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "getComparisonStrategy$ui_release", "()Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "setComparisonStrategy$ui_release", "(Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;)V", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComparisonStrategy getComparisonStrategy$ui_release() {
            return NodeLocationHolder.comparisonStrategy;
        }

        public final void setComparisonStrategy$ui_release(@NotNull ComparisonStrategy comparisonStrategy) {
            NodeLocationHolder.comparisonStrategy = comparisonStrategy;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "Stripe", "Location", "ui_release"}, k = 1, mv = {1, 5, 1})
    public enum ComparisonStrategy {
        Stripe,
        Location
    }

    public NodeLocationHolder(@NotNull LayoutNode layoutNode, @NotNull LayoutNode layoutNode2) {
        this.subtreeRoot = layoutNode;
        this.node = layoutNode2;
        this.layoutDirection = layoutNode.getLayoutDirection();
        LayoutNodeWrapper innerLayoutNodeWrapper = layoutNode.getInnerLayoutNodeWrapper();
        LayoutNodeWrapper layoutNodeWrapperFindWrapperToGetBounds = SemanticsSortKt.findWrapperToGetBounds(layoutNode2);
        Rect rectLocalBoundingBoxOf$default = null;
        if (innerLayoutNodeWrapper.isAttached() && layoutNodeWrapperFindWrapperToGetBounds.isAttached()) {
            rectLocalBoundingBoxOf$default = LayoutCoordinates.DefaultImpls.localBoundingBoxOf$default(innerLayoutNodeWrapper, layoutNodeWrapperFindWrapperToGetBounds, false, 2, null);
        }
        this.location = rectLocalBoundingBoxOf$default;
    }

    @NotNull
    /* JADX INFO: renamed from: getNode$ui_release, reason: from getter */
    public final LayoutNode getNode() {
        return this.node;
    }

    @NotNull
    /* JADX INFO: renamed from: getSubtreeRoot$ui_release, reason: from getter */
    public final LayoutNode getSubtreeRoot() {
        return this.subtreeRoot;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull NodeLocationHolder other) {
        Rect rect = this.location;
        if (rect == null) {
            return 1;
        }
        if (other.location == null) {
            return -1;
        }
        if (comparisonStrategy == ComparisonStrategy.Stripe) {
            if (rect.getBottom() - other.location.getTop() <= 0.0f) {
                return -1;
            }
            if (this.location.getTop() - other.location.getBottom() >= 0.0f) {
                return 1;
            }
        }
        if (this.layoutDirection == LayoutDirection.Ltr) {
            float left = this.location.getLeft() - other.location.getLeft();
            if (!(left == 0.0f)) {
                return left < 0.0f ? -1 : 1;
            }
        } else {
            float right = this.location.getRight() - other.location.getRight();
            if (!(right == 0.0f)) {
                return right < 0.0f ? 1 : -1;
            }
        }
        float top = this.location.getTop() - other.location.getTop();
        if (!(top == 0.0f)) {
            return top < 0.0f ? -1 : 1;
        }
        float height = this.location.getHeight() - other.location.getHeight();
        if (!(height == 0.0f)) {
            return height < 0.0f ? 1 : -1;
        }
        float width = this.location.getWidth() - other.location.getWidth();
        if (!(width == 0.0f)) {
            return width < 0.0f ? 1 : -1;
        }
        final Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(SemanticsSortKt.findWrapperToGetBounds(this.node));
        final Rect rectBoundsInRoot2 = LayoutCoordinatesKt.boundsInRoot(SemanticsSortKt.findWrapperToGetBounds(other.node));
        LayoutNode layoutNodeFindNodeByPredicateTraversal = SemanticsSortKt.findNodeByPredicateTraversal(this.node, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.NodeLocationHolder$compareTo$child1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                LayoutNodeWrapper layoutNodeWrapperFindWrapperToGetBounds = SemanticsSortKt.findWrapperToGetBounds(layoutNode);
                return Boolean.valueOf(layoutNodeWrapperFindWrapperToGetBounds.isAttached() && !Intrinsics.areEqual(rectBoundsInRoot, LayoutCoordinatesKt.boundsInRoot(layoutNodeWrapperFindWrapperToGetBounds)));
            }
        });
        LayoutNode layoutNodeFindNodeByPredicateTraversal2 = SemanticsSortKt.findNodeByPredicateTraversal(other.node, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.NodeLocationHolder$compareTo$child2$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                LayoutNodeWrapper layoutNodeWrapperFindWrapperToGetBounds = SemanticsSortKt.findWrapperToGetBounds(layoutNode);
                return Boolean.valueOf(layoutNodeWrapperFindWrapperToGetBounds.isAttached() && !Intrinsics.areEqual(rectBoundsInRoot2, LayoutCoordinatesKt.boundsInRoot(layoutNodeWrapperFindWrapperToGetBounds)));
            }
        });
        if (layoutNodeFindNodeByPredicateTraversal == null || layoutNodeFindNodeByPredicateTraversal2 == null) {
            return layoutNodeFindNodeByPredicateTraversal != null ? 1 : -1;
        }
        return new NodeLocationHolder(this.subtreeRoot, layoutNodeFindNodeByPredicateTraversal).compareTo(new NodeLocationHolder(other.subtreeRoot, layoutNodeFindNodeByPredicateTraversal2));
    }
}
