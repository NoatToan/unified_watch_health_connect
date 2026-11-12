package androidx.compose.ui.node;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.input.pointer.PointerInputFilter;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsWrapper;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.xiaomi.market.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u0000 k2\u00020\u00012\u00020\u0002:\u0001kB\u000f\u0012\u0006\u0010h\u001a\u00020\t¢\u0006\u0004\bi\u0010jJ]\u0010\u000f\u001a\u00020\n\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062)\u0010\f\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u0011*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u0015*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001c\u001a\u00020\u0019*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0097\u0001J\u001a\u0010\u0014\u001a\u00020\u0011*\u00020\u0019H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u0010*\u00020\u0019H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010\u0018\u001a\u00020\u0015*\u00020\u0019H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010#J\u001d\u0010$\u001a\u00020\u0010*\u00020\u0015H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u0019*\u00020\u0015H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b'\u0010\u001bJ\u001d\u0010$\u001a\u00020\u0010*\u00020\u0011H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b&\u0010(J\u001d\u0010\u001c\u001a\u00020\u0019*\u00020\u0011H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b'\u0010)J\u001d\u0010/\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\n\u00101\u001a\u0004\u0018\u000100H\u0016J\n\u00102\u001a\u0004\u0018\u000100H\u0016J\n\u00103\u001a\u0004\u0018\u000100H\u0016J\n\u00105\u001a\u0004\u0018\u000104H\u0016J\n\u00107\u001a\u0004\u0018\u000106H\u0016J\n\u00108\u001a\u0004\u0018\u000106H\u0016J\n\u00109\u001a\u0004\u0018\u000104H\u0016J\n\u0010:\u001a\u0004\u0018\u000104H\u0016J\u0010\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0011H\u0016J\u0010\u0010>\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u0011H\u0016J\u0010\u0010?\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0011H\u0016J\u0010\u0010@\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u0011H\u0016J@\u0010I\u001a\u00020\n2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u00152\u0019\u0010F\u001a\u0015\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\n\u0018\u00010D¢\u0006\u0002\b\u000bH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010L\u001a\u00020\u00112\u0006\u0010K\u001a\u00020JH\u0016J\u0010\u0010O\u001a\u00020\n2\u0006\u0010N\u001a\u00020MH\u0014J+\u0010T\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010SJ+\u0010X\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010SJ\b\u0010Z\u001a\u00020YH\u0014R\u0016\u0010]\u001a\u00020\u00158\u0016@\u0017X\u0097\u0005¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020\u00158\u0016@\u0017X\u0097\u0005¢\u0006\u0006\u001a\u0004\b^\u0010\\R\u0016\u0010c\u001a\u00020`8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006l"}, d2 = {"Landroidx/compose/ui/node/InnerPlaceable;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/unit/Density;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "", "hitResult", "Lkotlin/Function3;", "Landroidx/compose/ui/node/LayoutNode;", "", "Lkotlin/ExtensionFunctionType;", "nodeHitTest", "hitTestSubtree-9KIMszo", "(JLjava/util/List;Lkotlin/jvm/functions/Function3;)V", "hitTestSubtree", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "", "toPx-0680j_4", "(F)F", "toPx", "Landroidx/compose/ui/unit/TextUnit;", "toSp-0xMU5do", "(F)J", "toSp", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "toPx--R2X_6o", "toDp-u2uoSUM", "toSp-kPz2Gy4", "(I)F", "(I)J", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findPreviousFocusWrapper", "findNextFocusWrapper", "findLastFocusWrapper", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "findPreviousKeyInputWrapper", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "findPreviousNestedScrollWrapper", "findNextNestedScrollWrapper", "findNextKeyInputWrapper", "findLastKeyInputWrapper", "height", "minIntrinsicWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", "position", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitPointerInputFilters", "hitTest-3MmeM6k", "(JLjava/util/List;)V", "hitTest", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitSemanticsWrappers", "hitTestSemantics-3MmeM6k", "hitTestSemantics", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getWrappedByCoordinates", "getDensity", "()F", Constants.JSON_DENSITY, "getFontScale", "fontScale", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "", "getParentData", "()Ljava/lang/Object;", "parentData", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class InnerPlaceable extends LayoutNodeWrapper implements Density {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Paint innerBoundsPaint;
    private final /* synthetic */ MeasureScope $$delegate_0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/InnerPlaceable$Companion;", "", "Landroidx/compose/ui/graphics/Paint;", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Paint getInnerBoundsPaint() {
            return InnerPlaceable.innerBoundsPaint;
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo1104setColor8_81llA(Color.INSTANCE.m1246getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo1108setStylek9PVt8s(PaintingStyle.INSTANCE.m1413getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    public InnerPlaceable(@NotNull LayoutNode layoutNode) {
        super(layoutNode);
        this.$$delegate_0 = layoutNode.getMeasureScope();
    }

    /* JADX INFO: renamed from: hitTestSubtree-9KIMszo, reason: not valid java name */
    private final <T> void m2556hitTestSubtree9KIMszo(long pointerPosition, List<T> hitResult, Function3<? super LayoutNode, ? super Offset, ? super List<T>, Unit> nodeHitTest) {
        if (m2575withinLayerBoundsk4lQ0M(pointerPosition)) {
            int size = hitResult.size();
            MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
            int size2 = zSortedChildren.getSize();
            if (size2 > 0) {
                int i = size2 - 1;
                LayoutNode[] content = zSortedChildren.getContent();
                do {
                    LayoutNode layoutNode = content[i];
                    boolean z = false;
                    if (layoutNode.getIsPlaced()) {
                        nodeHitTest.invoke(layoutNode, Offset.m972boximpl(pointerPosition), hitResult);
                        if (hitResult.size() > size) {
                            z = true;
                        }
                    }
                    if (z) {
                        return;
                    } else {
                        i--;
                    }
                } while (i >= 0);
            }
        }
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        Integer num = getLayoutNode().calculateAlignmentLines$ui_release().get(alignmentLine);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findLastFocusWrapper() {
        return findPreviousFocusWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findLastKeyInputWrapper() {
        return findPreviousKeyInputWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findNextFocusWrapper() {
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findNextKeyInputWrapper() {
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public NestedScrollDelegatingWrapper findNextNestedScrollWrapper() {
        return null;
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

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public MeasureScope getMeasureScope() {
        return getLayoutNode().getMeasureScope();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public LayoutCoordinates getWrappedByCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /* JADX INFO: renamed from: hitTest-3MmeM6k */
    public void mo2553hitTest3MmeM6k(long pointerPosition, @NotNull List<PointerInputFilter> hitPointerInputFilters) {
        if (m2575withinLayerBoundsk4lQ0M(pointerPosition)) {
            int size = hitPointerInputFilters.size();
            MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
            int size2 = zSortedChildren.getSize();
            if (size2 > 0) {
                int i = size2 - 1;
                LayoutNode[] content = zSortedChildren.getContent();
                do {
                    LayoutNode layoutNode = content[i];
                    boolean z = false;
                    if (layoutNode.getIsPlaced()) {
                        layoutNode.m2558hitTest3MmeM6k$ui_release(pointerPosition, hitPointerInputFilters);
                        if (hitPointerInputFilters.size() > size) {
                            z = true;
                        }
                    }
                    if (z) {
                        return;
                    } else {
                        i--;
                    }
                } while (i >= 0);
            }
        }
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /* JADX INFO: renamed from: hitTestSemantics-3MmeM6k */
    public void mo2554hitTestSemantics3MmeM6k(long pointerPosition, @NotNull List<SemanticsWrapper> hitSemanticsWrappers) {
        if (m2575withinLayerBoundsk4lQ0M(pointerPosition)) {
            int size = hitSemanticsWrappers.size();
            MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
            int size2 = zSortedChildren.getSize();
            if (size2 > 0) {
                int i = size2 - 1;
                LayoutNode[] content = zSortedChildren.getContent();
                do {
                    LayoutNode layoutNode = content[i];
                    boolean z = false;
                    if (layoutNode.getIsPlaced()) {
                        layoutNode.m2559hitTestSemantics3MmeM6k$ui_release(pointerPosition, hitSemanticsWrappers);
                        if (hitSemanticsWrappers.size() > size) {
                            z = true;
                        }
                    }
                    if (z) {
                        return;
                    } else {
                        i--;
                    }
                } while (i >= 0);
            }
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return getLayoutNode().getIntrinsicsPolicy().maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return getLayoutNode().getIntrinsicsPolicy().maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo2468measureBRTryo0(long constraints) {
        m2505setMeasurementConstraintsBRTryo0(constraints);
        getLayoutNode().handleMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo6measure3p2s80s(getLayoutNode().getMeasureScope(), getLayoutNode().getChildren$ui_release(), constraints));
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return getLayoutNode().getIntrinsicsPolicy().minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return getLayoutNode().getIntrinsicsPolicy().minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void performDraw(@NotNull Canvas canvas) {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            int i = 0;
            LayoutNode[] content = zSortedChildren.getContent();
            do {
                LayoutNode layoutNode = content[i];
                if (layoutNode.getIsPlaced()) {
                    layoutNode.draw$ui_release(canvas);
                }
                i++;
            } while (i < size);
        }
        if (ownerRequireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
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
        getLayoutNode().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo187roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo187roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo188roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo188roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo189toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo189toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo190toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo190toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo191toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo191toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo192toPxR2X_6o(long j) {
        return this.$$delegate_0.mo192toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo193toPx0680j_4(float f) {
        return this.$$delegate_0.mo193toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo194toSp0xMU5do(float f) {
        return this.$$delegate_0.mo194toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo195toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo195toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo196toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo196toSpkPz2Gy4(i);
    }
}
