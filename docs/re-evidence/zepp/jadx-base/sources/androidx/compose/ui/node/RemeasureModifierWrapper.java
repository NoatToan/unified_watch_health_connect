package androidx.compose.ui.node;

import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/node/RemeasureModifierWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "modifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/OnRemeasuredModifier;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class RemeasureModifierWrapper extends DelegatingLayoutNodeWrapper<OnRemeasuredModifier> {
    public RemeasureModifierWrapper(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull OnRemeasuredModifier onRemeasuredModifier) {
        super(layoutNodeWrapper, onRemeasuredModifier);
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.layout.Measurable
    @NotNull
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo2468measureBRTryo0(long constraints) {
        OwnerSnapshotObserver snapshotObserver;
        Placeable placeableMo2468measureBRTryo0 = super.mo2468measureBRTryo0(constraints);
        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.node.RemeasureModifierWrapper$measure$invokeRemeasureCallbacks$1
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
                this.this$0.getModifier().mo2497onRemeasuredozmzZPI(this.this$0.getMeasuredSize());
            }
        };
        Owner owner = getLayoutNode().getOwner();
        Unit unit = null;
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.withNoSnapshotReadObservation$ui_release(function0);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            function0.invoke();
        }
        return placeableMo2468measureBRTryo0;
    }
}
