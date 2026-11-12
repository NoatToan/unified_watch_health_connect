package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintHorizontalAnchorable;", "Landroidx/constraintlayout/compose/BaseHorizontalAnchorable;", "Landroidx/constraintlayout/compose/State;", "state", "Landroidx/constraintlayout/core/state/ConstraintReference;", "getConstraintReference", "", "id", "Ljava/lang/Object;", "getId", "()Ljava/lang/Object;", "", "index", "", "Lkotlin/Function1;", "", "tasks", "<init>", "(Ljava/lang/Object;ILjava/util/List;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
final class ConstraintHorizontalAnchorable extends BaseHorizontalAnchorable {

    @NotNull
    private final Object id;

    public ConstraintHorizontalAnchorable(@NotNull Object obj, int i, @NotNull List<Function1<State, Unit>> list) {
        super(list, i);
        this.id = obj;
    }

    @Override // androidx.constraintlayout.compose.BaseHorizontalAnchorable
    @NotNull
    public ConstraintReference getConstraintReference(@NotNull State state) {
        return state.constraints(this.id);
    }

    @NotNull
    public final Object getId() {
        return this.id;
    }
}
