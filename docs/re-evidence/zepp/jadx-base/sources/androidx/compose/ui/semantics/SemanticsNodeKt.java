package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0080\bø\u0001\u0000\u001a\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t*\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002\u001a\"\u0010\f\u001a\u0004\u0018\u00010\u0006*\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0001H\u0002\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002\u001a\f\u0010\u0010\u001a\u00020\u000e*\u00020\rH\u0002\"\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u00068@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u00068@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\"\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u00020\r8B@\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper;", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "", "predicate", "nearestSemantics", "Landroidx/compose/ui/node/LayoutNode;", "", "list", "", "findOneLayerOfSemanticsWrappers", "selector", "findClosestParentNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "", "contentDescriptionFakeNodeId", "roleFakeNodeId", "getOuterSemantics", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/semantics/SemanticsWrapper;", "outerSemantics", "getOuterMergingSemantics", "outerMergingSemantics", "Landroidx/compose/ui/semantics/Role;", "getRole", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;", "role", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class SemanticsNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int contentDescriptionFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (function1.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    private static final List<SemanticsWrapper> findOneLayerOfSemanticsWrappers(LayoutNode layoutNode, List<SemanticsWrapper> list) {
        MutableVector<LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            int i = 0;
            LayoutNode[] content = zSortedChildren.getContent();
            do {
                LayoutNode layoutNode2 = content[i];
                SemanticsWrapper outerSemantics = getOuterSemantics(layoutNode2);
                if (outerSemantics != null) {
                    list.add(outerSemantics);
                } else {
                    findOneLayerOfSemanticsWrappers(layoutNode2, list);
                }
                i++;
            } while (i < size);
        }
        return list;
    }

    public static /* synthetic */ List findOneLayerOfSemanticsWrappers$default(LayoutNode layoutNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return findOneLayerOfSemanticsWrappers(layoutNode, list);
    }

    @Nullable
    public static final SemanticsWrapper getOuterMergingSemantics(@NotNull LayoutNode layoutNode) {
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = layoutNode.getOuterLayoutNodeWrapper$ui_release(); outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            if (outerLayoutNodeWrapper$ui_release instanceof SemanticsWrapper) {
                SemanticsWrapper semanticsWrapper = (SemanticsWrapper) outerLayoutNodeWrapper$ui_release;
                if (semanticsWrapper.getModifier().getSemanticsConfiguration().getIsMergingSemanticsOfDescendants()) {
                    return semanticsWrapper;
                }
            }
        }
        return null;
    }

    @Nullable
    public static final SemanticsWrapper getOuterSemantics(@NotNull LayoutNode layoutNode) {
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = layoutNode.getOuterLayoutNodeWrapper$ui_release(); outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            if (outerLayoutNodeWrapper$ui_release instanceof SemanticsWrapper) {
                return (SemanticsWrapper) outerLayoutNodeWrapper$ui_release;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Role getRole(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
    }

    @Nullable
    public static final SemanticsWrapper nearestSemantics(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull Function1<? super SemanticsWrapper, Boolean> function1) {
        while (layoutNodeWrapper != null) {
            if ((layoutNodeWrapper instanceof SemanticsWrapper) && function1.invoke(layoutNodeWrapper).booleanValue()) {
                return (SemanticsWrapper) layoutNodeWrapper;
            }
            layoutNodeWrapper = layoutNodeWrapper.getWrapped();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int roleFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + Utils.SECOND_IN_NANOS;
    }
}
