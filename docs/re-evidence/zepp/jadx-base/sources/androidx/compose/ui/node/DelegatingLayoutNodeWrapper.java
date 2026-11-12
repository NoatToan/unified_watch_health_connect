package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.input.pointer.PointerInputFilter;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.semantics.SemanticsWrapper;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\bY\u0010ZJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J+\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J@\u0010$\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0019\u0010!\u001a\u0015\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e¢\u0006\u0002\b H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010*\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\n\u0010,\u001a\u0004\u0018\u00010+H\u0016J\n\u0010-\u001a\u0004\u0018\u00010+H\u0016J\n\u0010.\u001a\u0004\u0018\u00010+H\u0016J\n\u00100\u001a\u0004\u0018\u00010/H\u0016J\n\u00101\u001a\u0004\u0018\u00010/H\u0016J\n\u00103\u001a\u0004\u0018\u000102H\u0016J\n\u00104\u001a\u0004\u0018\u000102H\u0016J\n\u00105\u001a\u0004\u0018\u000102H\u0016J\u0010\u00107\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u0018H\u0016J\u0010\u00108\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u0018H\u0016J\u0010\u0010:\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u0018H\u0016J\u0010\u0010;\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u0018H\u0016R*\u0010=\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00038\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0004\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bI\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010J\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MR\u0016\u0010T\u001a\u00020Q8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006["}, d2 = {"Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/Modifier$Element;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "", "setModifierTo", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitPointerInputFilters", "hitTest-3MmeM6k", "(JLjava/util/List;)V", "hitTest", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitSemanticsWrappers", "hitTestSemantics-3MmeM6k", "hitTestSemantics", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "calculateAlignmentLine", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findPreviousFocusWrapper", "findNextFocusWrapper", "findLastFocusWrapper", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "findPreviousNestedScrollWrapper", "findNextNestedScrollWrapper", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "findPreviousKeyInputWrapper", "findNextKeyInputWrapper", "findLastKeyInputWrapper", "height", "minIntrinsicWidth", "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "minIntrinsicHeight", "maxIntrinsicHeight", "<set-?>", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getWrapped$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setWrapped", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "Landroidx/compose/ui/Modifier$Element;", "getModifier", "()Landroidx/compose/ui/Modifier$Element;", "setModifier", "(Landroidx/compose/ui/Modifier$Element;)V", "", "isChained", "Z", "()Z", "setChained", "(Z)V", "toBeReusedForSameModifier", "getToBeReusedForSameModifier", "setToBeReusedForSameModifier", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "", "getParentData", "()Ljava/lang/Object;", "parentData", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/Modifier$Element;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public class DelegatingLayoutNodeWrapper<T extends Modifier.Element> extends LayoutNodeWrapper {
    private boolean isChained;

    @NotNull
    private T modifier;
    private boolean toBeReusedForSameModifier;

    @NotNull
    private LayoutNodeWrapper wrapped;

    public DelegatingLayoutNodeWrapper(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull T t) {
        super(layoutNodeWrapper.getLayoutNode());
        this.wrapped = layoutNodeWrapper;
        this.modifier = t;
        getWrapped().setWrappedBy$ui_release(this);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        return getWrapped().get(alignmentLine);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findLastFocusWrapper() {
        ModifiedFocusNode modifiedFocusNode = null;
        for (ModifiedFocusNode modifiedFocusNodeFindNextFocusWrapper = findNextFocusWrapper(); modifiedFocusNodeFindNextFocusWrapper != null; modifiedFocusNodeFindNextFocusWrapper = modifiedFocusNodeFindNextFocusWrapper.getWrapped().findNextFocusWrapper()) {
            modifiedFocusNode = modifiedFocusNodeFindNextFocusWrapper;
        }
        return modifiedFocusNode;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findLastKeyInputWrapper() {
        ModifiedKeyInputNode modifiedKeyInputNodeFindPreviousKeyInputWrapper = getLayoutNode().getInnerLayoutNodeWrapper().findPreviousKeyInputWrapper();
        if (modifiedKeyInputNodeFindPreviousKeyInputWrapper != this) {
            return modifiedKeyInputNodeFindPreviousKeyInputWrapper;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findNextFocusWrapper() {
        return getWrapped().findNextFocusWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findNextKeyInputWrapper() {
        return getWrapped().findNextKeyInputWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public NestedScrollDelegatingWrapper findNextNestedScrollWrapper() {
        return getWrapped().findNextNestedScrollWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findPreviousFocusWrapper() {
        LayoutNodeWrapper wrappedBy = getWrappedBy();
        if (wrappedBy == null) {
            return null;
        }
        return wrappedBy.findPreviousFocusWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findPreviousKeyInputWrapper() {
        LayoutNodeWrapper wrappedBy = getWrappedBy();
        if (wrappedBy == null) {
            return null;
        }
        return wrappedBy.findPreviousKeyInputWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public NestedScrollDelegatingWrapper findPreviousNestedScrollWrapper() {
        LayoutNodeWrapper wrappedBy = getWrappedBy();
        if (wrappedBy == null) {
            return null;
        }
        return wrappedBy.findPreviousNestedScrollWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public MeasureScope getMeasureScope() {
        return getWrapped().getMeasureScope();
    }

    @NotNull
    public T getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return getWrapped().getParentData();
    }

    public final boolean getToBeReusedForSameModifier() {
        return this.toBeReusedForSameModifier;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    /* JADX INFO: renamed from: getWrapped$ui_release, reason: from getter */
    public LayoutNodeWrapper getWrapped() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /* JADX INFO: renamed from: hitTest-3MmeM6k, reason: not valid java name */
    public void mo2553hitTest3MmeM6k(long pointerPosition, @NotNull List<PointerInputFilter> hitPointerInputFilters) {
        if (m2575withinLayerBoundsk4lQ0M(pointerPosition)) {
            getWrapped().mo2553hitTest3MmeM6k(getWrapped().m2570fromParentPositionMKHz9U(pointerPosition), hitPointerInputFilters);
        }
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /* JADX INFO: renamed from: hitTestSemantics-3MmeM6k, reason: not valid java name */
    public void mo2554hitTestSemantics3MmeM6k(long pointerPosition, @NotNull List<SemanticsWrapper> hitSemanticsWrappers) {
        if (m2575withinLayerBoundsk4lQ0M(pointerPosition)) {
            getWrapped().mo2554hitTestSemantics3MmeM6k(getWrapped().m2570fromParentPositionMKHz9U(pointerPosition), hitSemanticsWrappers);
        }
    }

    /* JADX INFO: renamed from: isChained, reason: from getter */
    public final boolean getIsChained() {
        return this.isChained;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return getWrapped().maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return getWrapped().maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo2468measureBRTryo0(long constraints) {
        m2505setMeasurementConstraintsBRTryo0(constraints);
        final Placeable placeableMo2468measureBRTryo0 = getWrapped().mo2468measureBRTryo0(constraints);
        setMeasureResult$ui_release(new MeasureResult(this) { // from class: androidx.compose.ui.node.DelegatingLayoutNodeWrapper$measure$1$1

            @NotNull
            private final Map<AlignmentLine, Integer> alignmentLines = r.emptyMap();
            private final int height;
            public final /* synthetic */ DelegatingLayoutNodeWrapper<T> this$0;
            private final int width;

            {
                this.this$0 = this;
                this.width = this.getWrapped().getMeasureResult().getWidth();
                this.height = this.getWrapped().getMeasureResult().getHeight();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            @NotNull
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                Placeable placeable = placeableMo2468measureBRTryo0;
                long jM2501getApparentToRealOffsetnOccac = this.this$0.m2501getApparentToRealOffsetnOccac();
                Placeable.PlacementScope.m2506place70tqf50$default(companion, placeable, IntOffsetKt.IntOffset(-IntOffset.m3043getXimpl(jM2501getApparentToRealOffsetnOccac), -IntOffset.m3044getYimpl(jM2501getApparentToRealOffsetnOccac)), 0.0f, 2, null);
            }
        });
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return getWrapped().minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return getWrapped().minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void performDraw(@NotNull Canvas canvas) {
        getWrapped().draw(canvas);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo2469placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        super.mo2469placeAtf8xVGno(position, zIndex, layerBlock);
        LayoutNodeWrapper wrappedBy = getWrappedBy();
        boolean z = false;
        if (wrappedBy != null && wrappedBy.getIsShallowPlacing()) {
            z = true;
        }
        if (z) {
            return;
        }
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        int iM3085getWidthimpl = IntSize.m3085getWidthimpl(getMeasuredSize());
        LayoutDirection layoutDirection = getMeasureScope().getLayoutDirection();
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        Placeable.PlacementScope.parentWidth = iM3085getWidthimpl;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        getMeasureResult().placeChildren();
        Placeable.PlacementScope.parentWidth = parentWidth;
        Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
    }

    public final void setChained(boolean z) {
        this.isChained = z;
    }

    public void setModifier(@NotNull T t) {
        this.modifier = t;
    }

    public final void setModifierTo(@NotNull Modifier.Element modifier) {
        if (modifier != getModifier()) {
            if (!Intrinsics.areEqual(JvmActuals_jvmKt.nativeClass(modifier), JvmActuals_jvmKt.nativeClass(getModifier()))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            setModifier(modifier);
        }
    }

    public final void setToBeReusedForSameModifier(boolean z) {
        this.toBeReusedForSameModifier = z;
    }

    public void setWrapped(@NotNull LayoutNodeWrapper layoutNodeWrapper) {
        this.wrapped = layoutNodeWrapper;
    }
}
