package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b4\u00105J%\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00020\t*\u00020\tH\u0003J\u0010\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bR\u0019\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0019\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R*\u0010&\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010+\u001a\u00020*8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u00100\u001a\u00020/8\u0006@\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Landroidx/compose/foundation/text/TextController;", "", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "", "outOfBoundary-0a9Yr6o", "(JJ)Z", "outOfBoundary", "Landroidx/compose/ui/Modifier;", "drawTextAndSelectionBehind", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "", "update", "Landroidx/compose/foundation/text/TextState;", "state", "Landroidx/compose/foundation/text/TextState;", "getState", "()Landroidx/compose/foundation/text/TextState;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "getSelectionRegistrar", "()Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "setSelectionRegistrar", "(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V", "modifiers", "Landroidx/compose/ui/Modifier;", "getModifiers", "()Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "commit", "Lkotlin/jvm/functions/Function1;", "getCommit", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/foundation/text/TextDragObserver;", "longPressDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getLongPressDragObserver", "()Landroidx/compose/foundation/text/TextDragObserver;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "<init>", "(Landroidx/compose/foundation/text/TextState;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class TextController {

    @Nullable
    private SelectionRegistrar selectionRegistrar;

    @NotNull
    private final TextState state;

    @NotNull
    private final Modifier modifiers = SemanticsModifierKt.semantics$default(OnGloballyPositionedModifierKt.onGloballyPositioned(drawTextAndSelectionBehind(Modifier.INSTANCE), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.TextController$modifiers$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            invoke2(layoutCoordinates);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LayoutCoordinates layoutCoordinates) {
            SelectionRegistrar selectionRegistrar;
            this.this$0.getState().setLayoutCoordinates(layoutCoordinates);
            if (SelectionRegistrarKt.hasSelection(this.this$0.getSelectionRegistrar(), this.this$0.getState().getSelectableId())) {
                long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(layoutCoordinates);
                if (!Offset.m980equalsimpl0(jPositionInWindow, this.this$0.getState().getPreviousGlobalPosition()) && (selectionRegistrar = this.this$0.getSelectionRegistrar()) != null) {
                    selectionRegistrar.notifyPositionChange(this.this$0.getState().getSelectableId());
                }
                this.this$0.getState().m494setPreviousGlobalPositionk4lQ0M(jPositionInWindow);
            }
        }
    }), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.TextController$modifiers$2
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
            final TextController textController = this.this$0;
            SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.TextController$modifiers$2.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull List<TextLayoutResult> list) {
                    boolean z;
                    if (textController.getState().getLayoutResult() != null) {
                        list.add(textController.getState().getLayoutResult());
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }, 1, null);
        }
    }, 1, null);

    @NotNull
    private final MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            return IntSize.m3084getHeightimpl(TextDelegate.m461layoutNN6EwU$default(this.this$0.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), null, 4, null).getSize());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            this.this$0.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
            return this.this$0.getState().getTextDelegate().getMaxIntrinsicWidth();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
            SelectionRegistrar selectionRegistrar;
            TextLayoutResult textLayoutResultM464layoutNN6EwU = this.this$0.getState().getTextDelegate().m464layoutNN6EwU(j, measureScope.getLayoutDirection(), this.this$0.getState().getLayoutResult());
            if (!Intrinsics.areEqual(this.this$0.getState().getLayoutResult(), textLayoutResultM464layoutNN6EwU)) {
                this.this$0.getState().getOnTextLayout().invoke(textLayoutResultM464layoutNN6EwU);
                TextLayoutResult layoutResult = this.this$0.getState().getLayoutResult();
                if (layoutResult != null) {
                    TextController textController = this.this$0;
                    if (!Intrinsics.areEqual(layoutResult.getLayoutInput().getText(), textLayoutResultM464layoutNN6EwU.getLayoutInput().getText()) && (selectionRegistrar = textController.getSelectionRegistrar()) != null) {
                        selectionRegistrar.notifySelectableChange(textController.getState().getSelectableId());
                    }
                }
            }
            this.this$0.getState().setLayoutResult(textLayoutResultM464layoutNN6EwU);
            if (!(list.size() >= textLayoutResultM464layoutNN6EwU.getPlaceholderRects().size())) {
                throw new IllegalStateException("Check failed.".toString());
            }
            List<Rect> placeholderRects = textLayoutResultM464layoutNN6EwU.getPlaceholderRects();
            final ArrayList arrayList = new ArrayList(placeholderRects.size());
            int size = placeholderRects.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Rect rect = placeholderRects.get(i);
                    Pair pair = rect == null ? null : new Pair(list.get(i).mo2468measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getWidth()), 0, (int) Math.floor(rect.getHeight()), 5, null)), IntOffset.m3034boximpl(IntOffsetKt.IntOffset(c.roundToInt(rect.getLeft()), c.roundToInt(rect.getTop()))));
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            return measureScope.layout(IntSize.m3085getWidthimpl(textLayoutResultM464layoutNN6EwU.getSize()), IntSize.m3084getHeightimpl(textLayoutResultM464layoutNN6EwU.getSize()), r.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(c.roundToInt(textLayoutResultM464layoutNN6EwU.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(c.roundToInt(textLayoutResultM464layoutNN6EwU.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                    List<Pair<Placeable, IntOffset>> list2 = arrayList;
                    int size2 = list2.size() - 1;
                    if (size2 < 0) {
                        return;
                    }
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        Pair<Placeable, IntOffset> pair2 = list2.get(i3);
                        Placeable.PlacementScope.m2507placeRelative70tqf50$default(placementScope, pair2.getFirst(), pair2.getSecond().getPackedValue(), 0.0f, 2, null);
                        if (i4 > size2) {
                            return;
                        } else {
                            i3 = i4;
                        }
                    }
                }
            });
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            return IntSize.m3084getHeightimpl(TextDelegate.m461layoutNN6EwU$default(this.this$0.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), null, 4, null).getSize());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
            this.this$0.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
            return this.this$0.getState().getTextDelegate().getMinIntrinsicWidth();
        }
    };

    @NotNull
    private final Function1<DisposableEffectScope, DisposableEffectResult> commit = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextController$commit$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
            SelectionRegistrar selectionRegistrar = this.this$0.getSelectionRegistrar();
            if (selectionRegistrar != null) {
                final TextController textController = this.this$0;
                textController.getState().setSelectable(selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(textController.getState().getSelectableId(), new Function0<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.TextController$commit$1$1$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final LayoutCoordinates invoke() {
                        return textController.getState().getLayoutCoordinates();
                    }
                }, new Function0<TextLayoutResult>() { // from class: androidx.compose.foundation.text.TextController$commit$1$1$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final TextLayoutResult invoke() {
                        return textController.getState().getLayoutResult();
                    }
                })));
            }
            final TextController textController2 = this.this$0;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextController$commit$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    SelectionRegistrar selectionRegistrar2;
                    Selectable selectable = textController2.getState().getSelectable();
                    if (selectable == null || (selectionRegistrar2 = textController2.getSelectionRegistrar()) == null) {
                        return;
                    }
                    selectionRegistrar2.unsubscribe(selectable);
                }
            };
        }
    };

    @NotNull
    private final TextDragObserver longPressDragObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.TextController$longPressDragObserver$1
        private long dragBeginPosition;
        private long dragTotalDistance;

        {
            Offset.Companion companion = Offset.INSTANCE;
            this.dragBeginPosition = companion.m999getZeroF1C5BW0();
            this.dragTotalDistance = companion.m999getZeroF1C5BW0();
        }

        public final long getDragBeginPosition() {
            return this.dragBeginPosition;
        }

        public final long getDragTotalDistance() {
            return this.dragTotalDistance;
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onCancel() {
            SelectionRegistrar selectionRegistrar;
            if (!SelectionRegistrarKt.hasSelection(this.this$0.getSelectionRegistrar(), this.this$0.getState().getSelectableId()) || (selectionRegistrar = this.this$0.getSelectionRegistrar()) == null) {
                return;
            }
            selectionRegistrar.notifySelectionUpdateEnd();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* JADX INFO: renamed from: onDrag-k-4lQ0M, reason: not valid java name */
        public void mo455onDragk4lQ0M(long delta) {
            SelectionRegistrar selectionRegistrar;
            LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return;
            }
            TextController textController = this.this$0;
            if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(textController.getSelectionRegistrar(), textController.getState().getSelectableId())) {
                setDragTotalDistance(Offset.m988plusMKHz9U(getDragTotalDistance(), delta));
                if (textController.m454outOfBoundary0a9Yr6o(getDragBeginPosition(), Offset.m988plusMKHz9U(getDragBeginPosition(), getDragTotalDistance())) || (selectionRegistrar = textController.getSelectionRegistrar()) == null) {
                    return;
                }
                selectionRegistrar.mo538notifySelectionUpdateDUneCvk(layoutCoordinates, getDragBeginPosition(), Offset.m988plusMKHz9U(getDragBeginPosition(), getDragTotalDistance()), SelectionAdjustment.CHARACTER);
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* JADX INFO: renamed from: onStart-k-4lQ0M, reason: not valid java name */
        public void mo456onStartk4lQ0M(long startPoint) {
            LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
            if (layoutCoordinates != null) {
                TextController textController = this.this$0;
                if (!layoutCoordinates.isAttached()) {
                    return;
                }
                if (textController.m454outOfBoundary0a9Yr6o(startPoint, startPoint)) {
                    SelectionRegistrar selectionRegistrar = textController.getSelectionRegistrar();
                    if (selectionRegistrar != null) {
                        selectionRegistrar.notifySelectionUpdateSelectAll(textController.getState().getSelectableId());
                    }
                } else {
                    SelectionRegistrar selectionRegistrar2 = textController.getSelectionRegistrar();
                    if (selectionRegistrar2 != null) {
                        selectionRegistrar2.mo540notifySelectionUpdateStartd4ec7I(layoutCoordinates, startPoint, SelectionAdjustment.WORD);
                    }
                }
                setDragBeginPosition(startPoint);
            }
            if (SelectionRegistrarKt.hasSelection(this.this$0.getSelectionRegistrar(), this.this$0.getState().getSelectableId())) {
                this.dragTotalDistance = Offset.INSTANCE.m999getZeroF1C5BW0();
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onStop() {
            SelectionRegistrar selectionRegistrar;
            if (!SelectionRegistrarKt.hasSelection(this.this$0.getSelectionRegistrar(), this.this$0.getState().getSelectableId()) || (selectionRegistrar = this.this$0.getSelectionRegistrar()) == null) {
                return;
            }
            selectionRegistrar.notifySelectionUpdateEnd();
        }

        public final void setDragBeginPosition(long j) {
            this.dragBeginPosition = j;
        }

        public final void setDragTotalDistance(long j) {
            this.dragTotalDistance = j;
        }
    };

    @NotNull
    private final MouseSelectionObserver mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.TextController$mouseSelectionObserver$1
        private long dragBeginPosition = Offset.INSTANCE.m999getZeroF1C5BW0();

        public final long getDragBeginPosition() {
            return this.dragBeginPosition;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* JADX INFO: renamed from: onDrag-3MmeM6k, reason: not valid java name */
        public boolean mo457onDrag3MmeM6k(long dragPosition, @NotNull SelectionAdjustment adjustment) {
            LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return true;
            }
            TextController textController = this.this$0;
            if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(textController.getSelectionRegistrar(), textController.getState().getSelectableId())) {
                return false;
            }
            SelectionRegistrar selectionRegistrar = textController.getSelectionRegistrar();
            if (selectionRegistrar == null) {
                return true;
            }
            selectionRegistrar.mo538notifySelectionUpdateDUneCvk(layoutCoordinates, getDragBeginPosition(), dragPosition, adjustment);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* JADX INFO: renamed from: onExtend-k-4lQ0M, reason: not valid java name */
        public boolean mo458onExtendk4lQ0M(long downPosition) {
            LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return false;
            }
            TextController textController = this.this$0;
            if (!layoutCoordinates.isAttached()) {
                return false;
            }
            SelectionRegistrar selectionRegistrar = textController.getSelectionRegistrar();
            if (selectionRegistrar != null) {
                selectionRegistrar.mo539notifySelectionUpdated4ec7I(layoutCoordinates, downPosition, SelectionAdjustment.NONE);
            }
            return SelectionRegistrarKt.hasSelection(textController.getSelectionRegistrar(), textController.getState().getSelectableId());
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
        public boolean mo459onExtendDragk4lQ0M(long dragPosition) {
            LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return true;
            }
            TextController textController = this.this$0;
            if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(textController.getSelectionRegistrar(), textController.getState().getSelectableId())) {
                return false;
            }
            SelectionRegistrar selectionRegistrar = textController.getSelectionRegistrar();
            if (selectionRegistrar == null) {
                return true;
            }
            selectionRegistrar.mo539notifySelectionUpdated4ec7I(layoutCoordinates, dragPosition, SelectionAdjustment.NONE);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* JADX INFO: renamed from: onStart-3MmeM6k, reason: not valid java name */
        public boolean mo460onStart3MmeM6k(long downPosition, @NotNull SelectionAdjustment adjustment) {
            LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return false;
            }
            TextController textController = this.this$0;
            if (!layoutCoordinates.isAttached()) {
                return false;
            }
            SelectionRegistrar selectionRegistrar = textController.getSelectionRegistrar();
            if (selectionRegistrar != null) {
                selectionRegistrar.mo538notifySelectionUpdateDUneCvk(layoutCoordinates, downPosition, downPosition, adjustment);
            }
            setDragBeginPosition(downPosition);
            return SelectionRegistrarKt.hasSelection(textController.getSelectionRegistrar(), textController.getState().getSelectableId());
        }

        public final void setDragBeginPosition(long j) {
            this.dragBeginPosition = j;
        }
    };

    public TextController(@NotNull TextState textState) {
        this.state = textState;
    }

    @Stable
    private final Modifier drawTextAndSelectionBehind(Modifier modifier) {
        return DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m1347graphicsLayersKFY_QE$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 8191, null), new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.TextController.drawTextAndSelectionBehind.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope drawScope) {
                Map<Long, Selection> subselections;
                TextLayoutResult layoutResult = TextController.this.getState().getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                TextController textController = TextController.this;
                SelectionRegistrar selectionRegistrar = textController.getSelectionRegistrar();
                Selection selection = null;
                if (selectionRegistrar != null && (subselections = selectionRegistrar.getSubselections()) != null) {
                    selection = subselections.get(Long.valueOf(textController.getState().getSelectableId()));
                }
                if (selection != null) {
                    int offset = !selection.getHandlesCrossed() ? selection.getStart().getOffset() : selection.getEnd().getOffset();
                    int offset2 = !selection.getHandlesCrossed() ? selection.getEnd().getOffset() : selection.getStart().getOffset();
                    if (offset != offset2) {
                        DrawScope.DefaultImpls.m1624drawPathLG529CI$default(drawScope, layoutResult.getMultiParagraph().getPathForRange(offset, offset2), textController.getState().getSelectionBackgroundColor(), 0.0f, null, null, 0, 60, null);
                    }
                }
                TextDelegate.INSTANCE.paint(drawScope.getDrawContext().getCanvas(), layoutResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: outOfBoundary-0a9Yr6o, reason: not valid java name */
    public final boolean m454outOfBoundary0a9Yr6o(long start, long end) {
        TextLayoutResult layoutResult = this.state.getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        int length = layoutResult.getLayoutInput().getText().getText().length();
        int iM2707getOffsetForPositionk4lQ0M = layoutResult.m2707getOffsetForPositionk4lQ0M(start);
        int iM2707getOffsetForPositionk4lQ0M2 = layoutResult.m2707getOffsetForPositionk4lQ0M(end);
        int i = length - 1;
        return (iM2707getOffsetForPositionk4lQ0M >= i && iM2707getOffsetForPositionk4lQ0M2 >= i) || (iM2707getOffsetForPositionk4lQ0M < 0 && iM2707getOffsetForPositionk4lQ0M2 < 0);
    }

    @NotNull
    public final Function1<DisposableEffectScope, DisposableEffectResult> getCommit() {
        return this.commit;
    }

    @NotNull
    public final TextDragObserver getLongPressDragObserver() {
        return this.longPressDragObserver;
    }

    @NotNull
    public final MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @NotNull
    public final Modifier getModifiers() {
        return this.modifiers;
    }

    @NotNull
    public final MouseSelectionObserver getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    @Nullable
    public final SelectionRegistrar getSelectionRegistrar() {
        return this.selectionRegistrar;
    }

    @NotNull
    public final TextState getState() {
        return this.state;
    }

    public final void setSelectionRegistrar(@Nullable SelectionRegistrar selectionRegistrar) {
        this.selectionRegistrar = selectionRegistrar;
    }

    public final void update(@Nullable SelectionRegistrar selectionRegistrar) {
        this.selectionRegistrar = selectionRegistrar;
    }
}
