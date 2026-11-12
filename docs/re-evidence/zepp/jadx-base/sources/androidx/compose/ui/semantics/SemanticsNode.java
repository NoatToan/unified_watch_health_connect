package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.passport.Configs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0004\ba\u0010bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002J8\u0010\u001a\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0002\b\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u00020!8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010&\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)\"\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00100\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u00104\u001a\u00020\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u00109\u001a\u0002088\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00068B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010)R\u0013\u0010A\u001a\u00020>8F@\u0006¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0015\u0010E\u001a\u0004\u0018\u00010B8F@\u0006¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001c\u0010I\u001a\u00020F8F@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010M\u001a\u00020J8F@\u0006¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001c\u0010P\u001a\u00020N8F@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bO\u0010HR\u0013\u0010R\u001a\u00020J8F@\u0006¢\u0006\u0006\u001a\u0004\bQ\u0010LR\u001c\u0010T\u001a\u00020N8F@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bS\u0010HR\u0013\u0010V\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\bU\u00103R\u0019\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00000\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010WR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00000\t8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010WR\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00000\t8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010WR\u0013\u0010]\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b]\u0010)R\u0015\u0010`\u001a\u0004\u0018\u00010\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006c"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "mergedConfig", "", "mergeConfig", "", "sortByBounds", "includeReplacedSemantics", "", "getChildren", "", "list", "findOneLayerOfMergingSemanticsNodes", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "findWrapperToGetBounds", "unmergedChildren", "emitFakeNodes", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/ExtensionFunctionType;", Configs.Params.PROPERTIES, "fakeSemanticsNode-ypyhhiA", "(Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/semantics/SemanticsNode;", "fakeSemanticsNode", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getAlignmentLinePosition", "unmergedChildren$ui_release", "(Z)Ljava/util/List;", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "outerSemanticsNodeWrapper", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "getOuterSemanticsNodeWrapper$ui_release", "()Landroidx/compose/ui/semantics/SemanticsWrapper;", "mergingEnabled", "Z", "getMergingEnabled", "()Z", "isFake", "isFake$ui_release", "setFake$ui_release", "(Z)V", "fakeNodeParent", "Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "id", LogUtil.I, "getId", "()I", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "isMergingSemanticsOfDescendants", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "layoutInfo", "Landroidx/compose/ui/node/RootForTest;", "getRoot", "()Landroidx/compose/ui/node/RootForTest;", RootDescription.ROOT_ELEMENT, "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/geometry/Rect;", "getBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "boundsInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "positionInRoot", "getBoundsInWindow", "boundsInWindow", "getPositionInWindow-F1C5BW0", "positionInWindow", "getConfig", "config", "()Ljava/util/List;", "children", "getReplacedChildren$ui_release", "replacedChildren", "getReplacedChildrenSortedByBounds$ui_release", "replacedChildrenSortedByBounds", "isRoot", "getParent", "()Landroidx/compose/ui/semantics/SemanticsNode;", "parent", "<init>", "(Landroidx/compose/ui/semantics/SemanticsWrapper;Z)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class SemanticsNode {
    public static final int $stable = 8;

    @Nullable
    private SemanticsNode fakeNodeParent;
    private final int id;
    private boolean isFake;

    @NotNull
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;

    @NotNull
    private final SemanticsWrapper outerSemanticsNodeWrapper;

    @NotNull
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNode(@NotNull SemanticsWrapper semanticsWrapper, boolean z) {
        this.outerSemanticsNodeWrapper = semanticsWrapper;
        this.mergingEnabled = z;
        this.unmergedConfig = semanticsWrapper.collapsedSemanticsConfiguration();
        this.id = semanticsWrapper.getModifier().getId();
        this.layoutNode = semanticsWrapper.getLayoutNode();
    }

    private final void emitFakeNodes(List<SemanticsNode> unmergedChildren) {
        final Role role = SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && (!unmergedChildren.isEmpty())) {
            unmergedChildren.add(m2637fakeSemanticsNodeypyhhiA(role, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m2644setRolekuIjeqM(semanticsPropertyReceiver, role.getValue());
                }
            }));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && (!unmergedChildren.isEmpty()) && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            final String str = list == null ? null : (String) CollectionsKt.firstOrNull(list);
            if (str != null) {
                unmergedChildren.add(0, m2637fakeSemanticsNodeypyhhiA(null, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final SemanticsNode m2637fakeSemanticsNodeypyhhiA(Role role, Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsWrapper(new LayoutNode(true).getInnerLayoutNodeWrapper(), new SemanticsModifierCore(role != null ? SemanticsNodeKt.roleFakeNodeId(this) : SemanticsNodeKt.contentDescriptionFakeNodeId(this), false, false, properties)), false);
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> list, boolean sortByBounds) {
        List<SemanticsNode> listUnmergedChildren$ui_release = unmergedChildren$ui_release(sortByBounds);
        int size = listUnmergedChildren$ui_release.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                SemanticsNode semanticsNode = listUnmergedChildren$ui_release.get(i);
                if (semanticsNode.isMergingSemanticsOfDescendants()) {
                    list.add(semanticsNode);
                } else if (!semanticsNode.getUnmergedConfig().getIsClearingSemantics()) {
                    findOneLayerOfMergingSemanticsNodes$default(semanticsNode, list, false, 2, null);
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list, z);
    }

    private final LayoutNodeWrapper findWrapperToGetBounds() {
        if (!this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            return this.outerSemanticsNodeWrapper;
        }
        SemanticsWrapper outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
        return outerMergingSemantics == null ? this.outerSemanticsNodeWrapper : outerMergingSemantics;
    }

    private final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    private final void mergeConfig(SemanticsConfiguration mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        int i = 0;
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
        int size = listUnmergedChildren$ui_release$default.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            SemanticsNode semanticsNode = (SemanticsNode) listUnmergedChildren$ui_release$default.get(i);
            if (!semanticsNode.getIsFake() && !semanticsNode.isMergingSemanticsOfDescendants()) {
                mergedConfig.mergeChild$ui_release(semanticsNode.getUnmergedConfig());
                semanticsNode.mergeConfig(mergedConfig);
            }
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode semanticsNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z);
    }

    public final int getAlignmentLinePosition(@NotNull AlignmentLine alignmentLine) {
        return findWrapperToGetBounds().get(alignmentLine);
    }

    @NotNull
    public final Rect getBoundsInRoot() {
        return !this.layoutNode.isAttached() ? Rect.INSTANCE.getZero() : LayoutCoordinatesKt.boundsInRoot(findWrapperToGetBounds());
    }

    @NotNull
    public final Rect getBoundsInWindow() {
        return !this.layoutNode.isAttached() ? Rect.INSTANCE.getZero() : LayoutCoordinatesKt.boundsInWindow(findWrapperToGetBounds());
    }

    @NotNull
    public final List<SemanticsNode> getChildren() {
        return getChildren(false, !this.mergingEnabled);
    }

    @NotNull
    public final SemanticsConfiguration getConfig() {
        if (!isMergingSemanticsOfDescendants()) {
            return this.unmergedConfig;
        }
        SemanticsConfiguration semanticsConfigurationCopy = this.unmergedConfig.copy();
        mergeConfig(semanticsConfigurationCopy);
        return semanticsConfigurationCopy;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutNode$ui_release, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: getOuterSemanticsNodeWrapper$ui_release, reason: from getter */
    public final SemanticsWrapper getOuterSemanticsNodeWrapper() {
        return this.outerSemanticsNodeWrapper;
    }

    @Nullable
    public final SemanticsNode getParent() {
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNodeFindClosestParentNode = this.mergingEnabled ? SemanticsNodeKt.findClosestParentNode(this.layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                SemanticsConfiguration semanticsConfigurationCollapsedSemanticsConfiguration;
                SemanticsWrapper outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode);
                return Boolean.valueOf((outerSemantics == null || (semanticsConfigurationCollapsedSemanticsConfiguration = outerSemantics.collapsedSemanticsConfiguration()) == null || !semanticsConfigurationCollapsedSemanticsConfiguration.getIsMergingSemanticsOfDescendants()) ? false : true);
            }
        }) : null;
        if (layoutNodeFindClosestParentNode == null) {
            layoutNodeFindClosestParentNode = SemanticsNodeKt.findClosestParentNode(this.layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$2
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                    return Boolean.valueOf(SemanticsNodeKt.getOuterSemantics(layoutNode) != null);
                }
            });
        }
        SemanticsWrapper outerSemantics = layoutNodeFindClosestParentNode == null ? null : SemanticsNodeKt.getOuterSemantics(layoutNodeFindClosestParentNode);
        if (outerSemantics == null) {
            return null;
        }
        return new SemanticsNode(outerSemantics, this.mergingEnabled);
    }

    /* JADX INFO: renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m2638getPositionInRootF1C5BW0() {
        return !this.layoutNode.isAttached() ? Offset.INSTANCE.m999getZeroF1C5BW0() : LayoutCoordinatesKt.positionInRoot(findWrapperToGetBounds());
    }

    /* JADX INFO: renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m2639getPositionInWindowF1C5BW0() {
        return !this.layoutNode.isAttached() ? Offset.INSTANCE.m999getZeroF1C5BW0() : LayoutCoordinatesKt.positionInWindow(findWrapperToGetBounds());
    }

    @NotNull
    public final List<SemanticsNode> getReplacedChildren$ui_release() {
        return getChildren(false, false);
    }

    @NotNull
    public final List<SemanticsNode> getReplacedChildrenSortedByBounds$ui_release() {
        return getChildren(true, false);
    }

    @Nullable
    public final RootForTest getRoot() {
        Owner owner = this.layoutNode.getOwner();
        if (owner == null) {
            return null;
        }
        return owner.getRootForTest();
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m2640getSizeYbymL2g() {
        return findWrapperToGetBounds().mo2480getSizeYbymL2g();
    }

    @NotNull
    /* JADX INFO: renamed from: getUnmergedConfig$ui_release, reason: from getter */
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* JADX INFO: renamed from: isFake$ui_release, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final boolean isRoot() {
        return getParent() == null;
    }

    public final void setFake$ui_release(boolean z) {
        this.isFake = z;
    }

    @NotNull
    public final List<SemanticsNode> unmergedChildren$ui_release(boolean sortByBounds) {
        if (this.isFake) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        List listFindOneLayerOfSemanticsWrappersSortedByBounds$default = sortByBounds ? SemanticsSortKt.findOneLayerOfSemanticsWrappersSortedByBounds$default(this.layoutNode, null, 1, null) : SemanticsNodeKt.findOneLayerOfSemanticsWrappers$default(this.layoutNode, null, 1, null);
        int i = 0;
        int size = listFindOneLayerOfSemanticsWrappersSortedByBounds$default.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                arrayList.add(new SemanticsNode((SemanticsWrapper) listFindOneLayerOfSemanticsWrappersSortedByBounds$default.get(i), getMergingEnabled()));
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        emitFakeNodes(arrayList);
        return arrayList;
    }

    private final List<SemanticsNode> getChildren(boolean sortByBounds, boolean includeReplacedSemantics) {
        if (includeReplacedSemantics || !this.unmergedConfig.getIsClearingSemantics()) {
            return isMergingSemanticsOfDescendants() ? findOneLayerOfMergingSemanticsNodes$default(this, null, sortByBounds, 1, null) : unmergedChildren$ui_release(sortByBounds);
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
