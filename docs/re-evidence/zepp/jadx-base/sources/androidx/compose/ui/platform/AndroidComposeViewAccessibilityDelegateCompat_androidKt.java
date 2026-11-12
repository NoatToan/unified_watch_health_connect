package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsWrapper;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\f\u0010\n\u001a\u00020\u0002*\u00020\u0005H\u0002\u001a\f\u0010\u000b\u001a\u00020\u0002*\u00020\u0005H\u0002\u001a\u001a\u0010\u000f\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u001a\u0018\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011*\u00020\u0010H\u0000\u001a\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0000\"\u001a\u0010\u0019\u001a\u00020\u0002*\u00020\u00058B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001b\u001a\u00020\u0002*\u00020\u00058B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "selector", "findClosestParentNode", "Landroidx/compose/ui/semantics/SemanticsNode;", Constants.ENABLED, "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "oldNode", "propertiesDeleted", "hasPaneTitle", "excludeLineAndPageGranularities", "Landroidx/compose/ui/semantics/AccessibilityAction;", "", "other", "accessibilityEquals", "Landroidx/compose/ui/semantics/SemanticsOwner;", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getAllUncoveredSemanticsNodesToMap", "", "Landroidx/compose/ui/platform/ScrollObservationScope;", "id", "findById", "isPassword", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "isTextField", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean accessibilityEquals(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!Intrinsics.areEqual(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() != null || accessibilityAction2.getAction() == null) {
            return accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getDisabled()) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        SemanticsConfiguration semanticsConfigurationCollapsedSemanticsConfiguration;
        if (isTextField(semanticsNode) && !Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode layoutNodeFindClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode(), new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                SemanticsWrapper outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode);
                SemanticsConfiguration semanticsConfigurationCollapsedSemanticsConfiguration2 = outerSemantics == null ? null : outerSemantics.collapsedSemanticsConfiguration();
                boolean z = false;
                if ((semanticsConfigurationCollapsedSemanticsConfiguration2 != null && semanticsConfigurationCollapsedSemanticsConfiguration2.getIsMergingSemanticsOfDescendants()) && semanticsConfigurationCollapsedSemanticsConfiguration2.contains(SemanticsActions.INSTANCE.getSetText())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        if (layoutNodeFindClosestParentNode != null) {
            SemanticsWrapper outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNodeFindClosestParentNode);
            if (!((outerSemantics == null || (semanticsConfigurationCollapsedSemanticsConfiguration = outerSemantics.collapsedSemanticsConfiguration()) == null) ? false : Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsConfigurationCollapsedSemanticsConfiguration, SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE))) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static final ScrollObservationScope findById(@NotNull List<ScrollObservationScope> list, int i) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
            if (i3 > size) {
                return null;
            }
            i2 = i3;
        }
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

    @NotNull
    public static final Map<Integer, SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToMap(@NotNull SemanticsOwner semanticsOwner) {
        SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!unmergedRootSemanticsNode.getLayoutNode().getIsPlaced()) {
            return linkedHashMap;
        }
        Region region = new Region();
        region.set(RectHelper_androidKt.toAndroidRect(unmergedRootSemanticsNode.getBoundsInRoot()));
        getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, unmergedRootSemanticsNode, linkedHashMap, unmergedRootSemanticsNode);
        return linkedHashMap;
    }

    private static final void getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(Region region, SemanticsNode semanticsNode, Map<Integer, SemanticsNodeWithAdjustedBounds> map, SemanticsNode semanticsNode2) {
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (semanticsNode2.getLayoutNode().getIsPlaced() || semanticsNode2.getIsFake()) {
                Rect androidRect = RectHelper_androidKt.toAndroidRect(semanticsNode2.getBoundsInRoot());
                Region region2 = new Region();
                region2.set(androidRect);
                int id = semanticsNode2.getId() == semanticsNode.getId() ? -1 : semanticsNode2.getId();
                if (!region2.op(region, region2, Region.Op.INTERSECT)) {
                    if (semanticsNode2.getIsFake()) {
                        map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, RectHelper_androidKt.toAndroidRect(new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 10.0f, 10.0f))));
                        return;
                    } else {
                        if (id == -1) {
                            map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                int size = replacedChildren$ui_release.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, semanticsNode, map, replacedChildren$ui_release.get(size));
                        if (i < 0) {
                            break;
                        } else {
                            size = i;
                        }
                    }
                }
                region.op(androidRect, region, Region.Op.REVERSE_DIFFERENCE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPaneTitle(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isPassword(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPassword());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isTextField(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean propertiesDeleted(SemanticsNode semanticsNode, AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy semanticsNodeCopy) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it2 = semanticsNodeCopy.getUnmergedConfig().iterator();
        while (it2.hasNext()) {
            if (!semanticsNode.getConfig().contains(it2.next().getKey())) {
                return true;
            }
        }
        return false;
    }
}
