package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\"\u0010\t\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "list", "", "findOneLayerOfSemanticsWrappersSortedByBounds", "Lkotlin/Function1;", "", "predicate", "findNodeByPredicateTraversal", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "findWrapperToGetBounds", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class SemanticsSortKt {
    @Nullable
    public static final LayoutNode findNodeByPredicateTraversal(@NotNull LayoutNode layoutNode, @NotNull Function1<? super LayoutNode, Boolean> function1) {
        if (function1.invoke(layoutNode).booleanValue()) {
            return layoutNode;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int i = 0;
        int size = children$ui_release.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i2 = i + 1;
            LayoutNode layoutNodeFindNodeByPredicateTraversal = findNodeByPredicateTraversal(children$ui_release.get(i), function1);
            if (layoutNodeFindNodeByPredicateTraversal != null) {
                return layoutNodeFindNodeByPredicateTraversal;
            }
            if (i2 > size) {
                return null;
            }
            i = i2;
        }
    }

    @NotNull
    public static final List<SemanticsWrapper> findOneLayerOfSemanticsWrappersSortedByBounds(@NotNull LayoutNode layoutNode, @NotNull List<SemanticsWrapper> list) {
        if (!layoutNode.isAttached()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size() - 1;
        int i = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                LayoutNode layoutNode2 = children$ui_release.get(i2);
                if (layoutNode2.isAttached()) {
                    arrayList.add(new NodeLocationHolder(layoutNode, layoutNode2));
                }
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        List<NodeLocationHolder> listFindOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy = findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy(arrayList);
        ArrayList arrayList2 = new ArrayList(listFindOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy.size());
        int size2 = listFindOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                arrayList2.add(listFindOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy.get(i4).getNode());
                if (i5 > size2) {
                    break;
                }
                i4 = i5;
            }
        }
        int size3 = arrayList2.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i6 = i + 1;
                LayoutNode layoutNode3 = (LayoutNode) arrayList2.get(i);
                SemanticsWrapper outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode3);
                if (outerSemantics != null) {
                    list.add(outerSemantics);
                } else {
                    findOneLayerOfSemanticsWrappersSortedByBounds(layoutNode3, list);
                }
                if (i6 > size3) {
                    break;
                }
                i = i6;
            }
        }
        return list;
    }

    public static /* synthetic */ List findOneLayerOfSemanticsWrappersSortedByBounds$default(LayoutNode layoutNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return findOneLayerOfSemanticsWrappersSortedByBounds(layoutNode, list);
    }

    private static final List<NodeLocationHolder> findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy(List<NodeLocationHolder> list) {
        try {
            NodeLocationHolder.INSTANCE.setComparisonStrategy$ui_release(NodeLocationHolder.ComparisonStrategy.Stripe);
            List<NodeLocationHolder> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
            g.sort(mutableList);
            return mutableList;
        } catch (IllegalArgumentException unused) {
            NodeLocationHolder.INSTANCE.setComparisonStrategy$ui_release(NodeLocationHolder.ComparisonStrategy.Location);
            List<NodeLocationHolder> mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
            g.sort(mutableList2);
            return mutableList2;
        }
    }

    @NotNull
    public static final LayoutNodeWrapper findWrapperToGetBounds(@NotNull LayoutNode layoutNode) {
        SemanticsWrapper outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(layoutNode);
        if (outerMergingSemantics != null) {
            return outerMergingSemantics;
        }
        SemanticsWrapper outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode);
        return outerSemantics == null ? layoutNode.getInnerLayoutNodeWrapper() : outerSemantics;
    }
}
