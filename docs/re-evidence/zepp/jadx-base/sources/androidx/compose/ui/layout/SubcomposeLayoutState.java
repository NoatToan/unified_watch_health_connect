package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazon.identity.auth.device.datastore.DatabaseHelper;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.market.sdk.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003YZ[B\u000f\u0012\u0006\u00104\u001a\u00020\u0015¢\u0006\u0004\bW\u0010XB\t\b\u0016¢\u0006\u0004\bW\u0010/J4\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J<\u0010\u0013\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\u0012\u0010\u0019\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010\"\u001a\u00020!2\u001d\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001b¢\u0006\u0002\b\u001fH\u0002ø\u0001\u0000J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0015H\u0002J\"\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00152\b\b\u0002\u0010'\u001a\u00020\u0015H\u0002J\u0017\u0010)\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\bJ2\u0010\t\u001a\b\u0012\u0004\u0012\u00020+0*2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u00100\u001a\u00020\u0006H\u0000¢\u0006\u0004\b.\u0010/J*\u00102\u001a\u0002012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R$\u00106\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R-\u0010=\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060<¢\u0006\u0002\b\u001f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@RM\u0010A\u001a0\u0012\u0004\u0012\u00020\u0002\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001b¢\u0006\u0002\b\u001f\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b\u001f8\u0000@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00105R\"\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010J\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR\u001a\u0010L\u001a\u00060KR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR$\u0010N\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010IR\u0016\u0010O\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00105R\u0016\u0010P\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00105R\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\\"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "slotId", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "subcompose", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;", "nodeState", "Landroidx/compose/runtime/Composition;", "existing", "container", "Landroidx/compose/runtime/CompositionContext;", "parent", "composable", "subcomposeInto", "(Landroidx/compose/runtime/Composition;Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "", "currentIndex", "disposeAfterIndex", "makeSureStateIsConsistent", "takeNodeFromReusables", "disposeNode", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "Landroidx/compose/ui/layout/MeasurePolicy;", "createMeasurePolicy", "index", "createNodeAt", "from", "to", "count", "move", "ignoreRemeasureRequests", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose$ui_release", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "disposeCurrentNodes$ui_release", "()V", "disposeCurrentNodes", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "maxSlotsToRetainForReuse", LogUtil.I, "compositionContext", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext$ui_release", "()Landroidx/compose/runtime/CompositionContext;", "setCompositionContext$ui_release", "(Landroidx/compose/runtime/CompositionContext;)V", "Lkotlin/Function1;", "setRoot", "Lkotlin/jvm/functions/Function1;", "getSetRoot$ui_release", "()Lkotlin/jvm/functions/Function1;", "setMeasurePolicy", "Lkotlin/jvm/functions/Function2;", "getSetMeasurePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "_root", "Landroidx/compose/ui/node/LayoutNode;", "", "nodeToNodeState", "Ljava/util/Map;", "slotIdToNode", "Landroidx/compose/ui/layout/SubcomposeLayoutState$Scope;", "scope", "Landroidx/compose/ui/layout/SubcomposeLayoutState$Scope;", "precomposeMap", "reusableCount", "precomposedCount", "", "NoIntrinsicsMessage", "Ljava/lang/String;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", RootDescription.ROOT_ELEMENT, "<init>", "(I)V", "NodeState", "PrecomposedSlotHandle", DatabaseHelper.requestedScope_Scope, "ui_release"}, k = 1, mv = {1, 5, 1})
public final class SubcomposeLayoutState {
    public static final int $stable = 8;

    @NotNull
    private final String NoIntrinsicsMessage;

    @Nullable
    private LayoutNode _root;

    @Nullable
    private CompositionContext compositionContext;
    private int currentIndex;
    private final int maxSlotsToRetainForReuse;

    @NotNull
    private final Map<LayoutNode, NodeState> nodeToNodeState;

    @NotNull
    private final Map<Object, LayoutNode> precomposeMap;
    private int precomposedCount;
    private int reusableCount;

    @NotNull
    private final Scope scope;

    @NotNull
    private final Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> setMeasurePolicy;

    @NotNull
    private final Function1<LayoutNode, Unit> setRoot;

    @NotNull
    private final Map<Object, LayoutNode> slotIdToNode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "", "", "dispose", "ui_release"}, k = 1, mv = {1, 5, 1})
    public interface PrecomposedSlotHandle {
        void dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ2\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$Scope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "", "slotId", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "", Constants.JSON_DENSITY, "F", "getDensity", "()F", "setDensity", "(F)V", "fontScale", "getFontScale", "setFontScale", "<init>", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;

        @NotNull
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        @NotNull
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        @NotNull
        public MeasureResult layout(int i, int i2, @NotNull Map<AlignmentLine, Integer> map, @NotNull Function1<? super Placeable.PlacementScope, Unit> function1) {
            return SubcomposeMeasureScope.DefaultImpls.layout(this, i, i2, map, function1);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public int mo187roundToPxR2X_6o(long j) {
            return SubcomposeMeasureScope.DefaultImpls.m2542roundToPxR2X_6o(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public int mo188roundToPx0680j_4(float f) {
            return SubcomposeMeasureScope.DefaultImpls.m2543roundToPx0680j_4(this, f);
        }

        public void setDensity(float f) {
            this.density = f;
        }

        public void setFontScale(float f) {
            this.fontScale = f;
        }

        public void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        @NotNull
        public List<Measurable> subcompose(@Nullable Object slotId, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
            return SubcomposeLayoutState.this.subcompose$ui_release(slotId, content);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public float mo189toDpGaN1DYA(long j) {
            return SubcomposeMeasureScope.DefaultImpls.m2544toDpGaN1DYA(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo190toDpu2uoSUM(float f) {
            return SubcomposeMeasureScope.DefaultImpls.m2545toDpu2uoSUM(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public float mo192toPxR2X_6o(long j) {
            return SubcomposeMeasureScope.DefaultImpls.m2547toPxR2X_6o(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public float mo193toPx0680j_4(float f) {
            return SubcomposeMeasureScope.DefaultImpls.m2548toPx0680j_4(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        @NotNull
        public Rect toRect(@NotNull DpRect dpRect) {
            return SubcomposeMeasureScope.DefaultImpls.toRect(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public long mo194toSp0xMU5do(float f) {
            return SubcomposeMeasureScope.DefaultImpls.m2549toSp0xMU5do(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo195toSpkPz2Gy4(float f) {
            return SubcomposeMeasureScope.DefaultImpls.m2550toSpkPz2Gy4(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo191toDpu2uoSUM(int i) {
            return SubcomposeMeasureScope.DefaultImpls.m2546toDpu2uoSUM((SubcomposeMeasureScope) this, i);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo196toSpkPz2Gy4(int i) {
            return SubcomposeMeasureScope.DefaultImpls.m2551toSpkPz2Gy4((SubcomposeMeasureScope) this, i);
        }
    }

    public SubcomposeLayoutState(int i) {
        this.maxSlotsToRetainForReuse = i;
        this.setRoot = new Function1<LayoutNode, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
                invoke2(layoutNode);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode) {
                this.this$0._root = layoutNode;
            }
        };
        this.setMeasurePolicy = new Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2) {
                invoke2(layoutNode, function2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutNode layoutNode, @NotNull Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2) {
                layoutNode.setMeasurePolicy(this.this$0.createMeasurePolicy(function2));
            }
        };
        this.nodeToNodeState = new LinkedHashMap();
        this.slotIdToNode = new LinkedHashMap();
        this.scope = new Scope();
        this.precomposeMap = new LinkedHashMap();
        this.NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurePolicy createMeasurePolicy(final Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> block) {
        return new LayoutNode.NoIntrinsicsMeasurePolicy(this.NoIntrinsicsMessage) { // from class: androidx.compose.ui.layout.SubcomposeLayoutState.createMeasurePolicy.1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                SubcomposeLayoutState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
                SubcomposeLayoutState.this.scope.setDensity(measureScope.getDensity());
                SubcomposeLayoutState.this.scope.setFontScale(measureScope.getFontScale());
                SubcomposeLayoutState.this.currentIndex = 0;
                final MeasureResult measureResultInvoke = block.invoke(SubcomposeLayoutState.this.scope, Constraints.m2923boximpl(j));
                final int i = SubcomposeLayoutState.this.currentIndex;
                final SubcomposeLayoutState subcomposeLayoutState = SubcomposeLayoutState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$createMeasurePolicy$1$measure$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    @NotNull
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return measureResultInvoke.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return measureResultInvoke.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return measureResultInvoke.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        subcomposeLayoutState.currentIndex = i;
                        measureResultInvoke.placeChildren();
                        SubcomposeLayoutState subcomposeLayoutState2 = subcomposeLayoutState;
                        subcomposeLayoutState2.disposeAfterIndex(subcomposeLayoutState2.currentIndex);
                    }
                };
            }
        };
    }

    private final LayoutNode createNodeAt(int index) {
        LayoutNode layoutNode = new LayoutNode(true);
        LayoutNode root = getRoot();
        root.ignoreRemeasureRequests = true;
        getRoot().insertAt$ui_release(index, layoutNode);
        root.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeAfterIndex(int currentIndex) {
        int size = getRoot().getFoldedChildren$ui_release().size() - this.precomposedCount;
        int iMax = Math.max(currentIndex, size - this.maxSlotsToRetainForReuse);
        int i = size - iMax;
        this.reusableCount = i;
        int i2 = i + iMax;
        if (iMax < i2) {
            int i3 = iMax;
            while (true) {
                int i4 = i3 + 1;
                this.slotIdToNode.remove(this.nodeToNodeState.get(getRoot().getFoldedChildren$ui_release().get(i3)).getSlotId());
                if (i4 >= i2) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        }
        int i5 = iMax - currentIndex;
        if (i5 > 0) {
            LayoutNode root = getRoot();
            root.ignoreRemeasureRequests = true;
            int i6 = currentIndex + i5;
            if (currentIndex < i6) {
                int i7 = currentIndex;
                while (true) {
                    int i8 = i7 + 1;
                    disposeNode(getRoot().getFoldedChildren$ui_release().get(i7));
                    if (i8 >= i6) {
                        break;
                    } else {
                        i7 = i8;
                    }
                }
            }
            getRoot().removeAt$ui_release(currentIndex, i5);
            root.ignoreRemeasureRequests = false;
        }
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeNode(LayoutNode node) {
        NodeState nodeStateRemove = this.nodeToNodeState.remove(node);
        nodeStateRemove.getComposition().dispose();
        this.slotIdToNode.remove(nodeStateRemove.getSlotId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNode getRoot() {
        LayoutNode layoutNode = this._root;
        if (layoutNode != null) {
            return layoutNode;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void ignoreRemeasureRequests(Function0<Unit> block) {
        LayoutNode root = getRoot();
        root.ignoreRemeasureRequests = true;
        block.invoke();
        root.ignoreRemeasureRequests = false;
    }

    private final void makeSureStateIsConsistent() {
        if (this.nodeToNodeState.size() == getRoot().getFoldedChildren$ui_release().size()) {
            return;
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + getRoot().getFoldedChildren$ui_release().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void move(int from, int to, int count) {
        LayoutNode root = getRoot();
        root.ignoreRemeasureRequests = true;
        getRoot().move$ui_release(from, to, count);
        root.ignoreRemeasureRequests = false;
    }

    public static /* synthetic */ void move$default(SubcomposeLayoutState subcomposeLayoutState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        subcomposeLayoutState.move(i, i2, i3);
    }

    private final void subcompose(LayoutNode node, Object slotId, Function2<? super Composer, ? super Integer, Unit> content) {
        Map<LayoutNode, NodeState> map = this.nodeToNodeState;
        NodeState nodeState = map.get(node);
        if (nodeState == null) {
            nodeState = new NodeState(slotId, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m2458getLambda1$ui_release(), null, 4, null);
            map.put(node, nodeState);
        }
        NodeState nodeState2 = nodeState;
        Composition composition = nodeState2.getComposition();
        boolean hasInvalidations = composition == null ? true : composition.getHasInvalidations();
        if (nodeState2.getContent() != content || hasInvalidations) {
            nodeState2.setContent(content);
            subcompose(node, nodeState2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Composition subcomposeInto(Composition existing, LayoutNode container, CompositionContext parent, Function2<? super Composer, ? super Integer, Unit> composable) {
        if (existing == null || existing.getDisposed()) {
            existing = Wrapper_androidKt.createSubcomposition(container, parent);
        }
        existing.setContent(composable);
        return existing;
    }

    private final LayoutNode takeNodeFromReusables(Object slotId) {
        if (!(this.reusableCount > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int size = getRoot().getFoldedChildren$ui_release().size() - this.precomposedCount;
        int i = size - this.reusableCount;
        int i2 = i;
        while (true) {
            NodeState nodeState = (NodeState) MapsKt.getValue(this.nodeToNodeState, getRoot().getFoldedChildren$ui_release().get(i2));
            if (Intrinsics.areEqual(nodeState.getSlotId(), slotId)) {
                break;
            }
            if (i2 == size - 1) {
                nodeState.setSlotId(slotId);
                break;
            }
            i2++;
        }
        if (i2 != i) {
            move(i2, i, 1);
        }
        this.reusableCount--;
        return getRoot().getFoldedChildren$ui_release().get(i);
    }

    public final void disposeCurrentNodes$ui_release() {
        Iterator<T> it2 = this.nodeToNodeState.values().iterator();
        while (it2.hasNext()) {
            ((NodeState) it2.next()).getComposition().dispose();
        }
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
    }

    @Nullable
    /* JADX INFO: renamed from: getCompositionContext$ui_release, reason: from getter */
    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    @NotNull
    public final Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    @NotNull
    public final Function1<LayoutNode, Unit> getSetRoot$ui_release() {
        return this.setRoot;
    }

    @NotNull
    public final PrecomposedSlotHandle precompose(@Nullable final Object slotId, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(slotId)) {
            Map<Object, LayoutNode> map = this.precomposeMap;
            LayoutNode layoutNodeCreateNodeAt = map.get(slotId);
            if (layoutNodeCreateNodeAt == null) {
                if (this.reusableCount > 0) {
                    layoutNodeCreateNodeAt = takeNodeFromReusables(slotId);
                    move(getRoot().getFoldedChildren$ui_release().indexOf(layoutNodeCreateNodeAt), getRoot().getFoldedChildren$ui_release().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNodeCreateNodeAt = createNodeAt(getRoot().getFoldedChildren$ui_release().size());
                    this.precomposedCount++;
                }
                map.put(slotId, layoutNodeCreateNodeAt);
            }
            subcompose(layoutNodeCreateNodeAt, slotId, content);
        }
        return new PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState.precompose.1
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                LayoutNode layoutNode = (LayoutNode) SubcomposeLayoutState.this.precomposeMap.remove(slotId);
                if (layoutNode != null) {
                    int iIndexOf = SubcomposeLayoutState.this.getRoot().getFoldedChildren$ui_release().indexOf(layoutNode);
                    if (!(iIndexOf != -1)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (SubcomposeLayoutState.this.reusableCount < SubcomposeLayoutState.this.maxSlotsToRetainForReuse) {
                        SubcomposeLayoutState.this.move(iIndexOf, (SubcomposeLayoutState.this.getRoot().getFoldedChildren$ui_release().size() - SubcomposeLayoutState.this.precomposedCount) - SubcomposeLayoutState.this.reusableCount, 1);
                        SubcomposeLayoutState.this.reusableCount++;
                    } else {
                        SubcomposeLayoutState subcomposeLayoutState = SubcomposeLayoutState.this;
                        LayoutNode root = subcomposeLayoutState.getRoot();
                        root.ignoreRemeasureRequests = true;
                        subcomposeLayoutState.disposeNode(layoutNode);
                        subcomposeLayoutState.getRoot().removeAt$ui_release(iIndexOf, 1);
                        root.ignoreRemeasureRequests = false;
                    }
                    if (!(SubcomposeLayoutState.this.precomposedCount > 0)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    SubcomposeLayoutState.this.precomposedCount--;
                }
            }
        };
    }

    public final void setCompositionContext$ui_release(@Nullable CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    @NotNull
    public final List<Measurable> subcompose$ui_release(@Nullable Object slotId, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState = getRoot().getLayoutState();
        if (!(layoutState == LayoutNode.LayoutState.Measuring || layoutState == LayoutNode.LayoutState.LayingOut)) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }
        Map<Object, LayoutNode> map = this.slotIdToNode;
        LayoutNode layoutNodeRemove = map.get(slotId);
        if (layoutNodeRemove == null) {
            layoutNodeRemove = this.precomposeMap.remove(slotId);
            if (layoutNodeRemove != null) {
                int i = this.precomposedCount;
                if (!(i > 0)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                this.precomposedCount = i - 1;
            } else {
                layoutNodeRemove = this.reusableCount > 0 ? takeNodeFromReusables(slotId) : createNodeAt(this.currentIndex);
            }
            map.put(slotId, layoutNodeRemove);
        }
        LayoutNode layoutNode = layoutNodeRemove;
        int iIndexOf = getRoot().getFoldedChildren$ui_release().indexOf(layoutNode);
        int i2 = this.currentIndex;
        if (iIndexOf >= i2) {
            if (i2 != iIndexOf) {
                move$default(this, iIndexOf, i2, 0, 4, null);
            }
            this.currentIndex++;
            subcompose(layoutNode, slotId, content);
            return layoutNode.getChildren$ui_release();
        }
        throw new IllegalArgumentException("Key " + slotId + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B0\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R-\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;", "", "slotId", "Ljava/lang/Object;", "getSlotId", "()Ljava/lang/Object;", "setSlotId", "(Ljava/lang/Object;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/Composition;", "composition", "Landroidx/compose/runtime/Composition;", "getComposition", "()Landroidx/compose/runtime/Composition;", "setComposition", "(Landroidx/compose/runtime/Composition;)V", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composition;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class NodeState {

        @Nullable
        private Composition composition;

        @NotNull
        private Function2<? super Composer, ? super Integer, Unit> content;

        @Nullable
        private Object slotId;

        public NodeState(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composition composition) {
            this.slotId = obj;
            this.content = function2;
            this.composition = composition;
        }

        @Nullable
        public final Composition getComposition() {
            return this.composition;
        }

        @NotNull
        public final Function2<Composer, Integer, Unit> getContent() {
            return this.content;
        }

        @Nullable
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setComposition(@Nullable Composition composition) {
            this.composition = composition;
        }

        public final void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
            this.content = function2;
        }

        public final void setSlotId(@Nullable Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ NodeState(Object obj, Function2 function2, Composition composition, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i & 4) != 0 ? null : composition);
        }
    }

    public SubcomposeLayoutState() {
        this(0);
    }

    private final void subcompose(final LayoutNode node, final NodeState nodeState) {
        node.withNoSnapshotReadObservation$ui_release(new Function0<Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState.subcompose.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SubcomposeLayoutState subcomposeLayoutState = SubcomposeLayoutState.this;
                NodeState nodeState2 = nodeState;
                LayoutNode layoutNode = node;
                LayoutNode root = subcomposeLayoutState.getRoot();
                root.ignoreRemeasureRequests = true;
                final Function2<Composer, Integer, Unit> content = nodeState2.getContent();
                Composition composition = nodeState2.getComposition();
                CompositionContext compositionContext = subcomposeLayoutState.getCompositionContext();
                if (compositionContext == null) {
                    throw new IllegalStateException("parent composition reference not set".toString());
                }
                nodeState2.setComposition(subcomposeLayoutState.subcomposeInto(composition, layoutNode, compositionContext, ComposableLambdaKt.composableLambdaInstance(-985540201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$subcompose$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer, int i) {
                        if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                        } else {
                            content.invoke(composer, 0);
                        }
                    }
                })));
                root.ignoreRemeasureRequests = false;
            }
        });
    }
}
