package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\t\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/constraintlayout/compose/ChainVerticalAnchorable;", "Landroidx/constraintlayout/compose/BaseVerticalAnchorable;", "Landroidx/constraintlayout/compose/State;", "state", "Landroidx/constraintlayout/core/state/ConstraintReference;", "getConstraintReference", "", "id", "Ljava/lang/Object;", "", "Lkotlin/Function1;", "", "tasks", "", "index", "<init>", "(Ljava/util/List;Ljava/lang/Object;I)V", "compose_release"}, k = 1, mv = {1, 5, 1})
final class ChainVerticalAnchorable extends BaseVerticalAnchorable {

    @NotNull
    private final Object id;

    public ChainVerticalAnchorable(@NotNull List<Function1<State, Unit>> list, @NotNull Object obj, int i) {
        super(list, i);
        this.id = obj;
    }

    @Override // androidx.constraintlayout.compose.BaseVerticalAnchorable
    @NotNull
    public ConstraintReference getConstraintReference(@NotNull State state) {
        return state.helper(this.id, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN);
    }
}
