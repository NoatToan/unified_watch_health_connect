package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import com.huami.passport.Configs;
import com.xiaomi.market.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b5\u00106J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0019\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR+\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030+8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\r028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/core/state/State;", "Landroidx/constraintlayout/compose/SolverState;", "", "value", "", "convertDimension", "", Configs.Params.RESET, "id", "baselineNeededFor$compose_release", "(Ljava/lang/Object;)V", "baselineNeededFor", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "constraintWidget", "", "isBaselineNeeded$compose_release", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Z", "isBaselineNeeded", "Landroidx/constraintlayout/core/widgets/HelperWidget;", "helperWidget", "getKeyId$compose_release", "(Landroidx/constraintlayout/core/widgets/HelperWidget;)Ljava/lang/Object;", "getKeyId", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "rootIncomingConstraints", "J", "getRootIncomingConstraints-msEJaDk", "()J", "setRootIncomingConstraints-BRTryo0", "(J)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "", "baselineNeeded", "Ljava/util/List;", "getBaselineNeeded$compose_release", "()Ljava/util/List;", "dirtyBaselineNeededWidgets", "Z", "", "baselineNeededWidgets", "Ljava/util/Set;", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
public final class State extends androidx.constraintlayout.core.state.State {
    public static final int $stable = 8;

    @NotNull
    private final Density density;
    public LayoutDirection layoutDirection;
    private long rootIncomingConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    @NotNull
    private final List<Object> baselineNeeded = new ArrayList();
    private boolean dirtyBaselineNeededWidgets = true;

    @NotNull
    private final Set<ConstraintWidget> baselineNeededWidgets = new LinkedHashSet();

    public State(@NotNull Density density) {
        this.density = density;
    }

    public final void baselineNeededFor$compose_release(@NotNull Object id) {
        this.baselineNeeded.add(id);
        this.dirtyBaselineNeededWidgets = true;
    }

    @Override // androidx.constraintlayout.core.state.State
    public int convertDimension(@Nullable Object value) {
        return value instanceof Dp ? this.density.mo188roundToPx0680j_4(((Dp) value).m2979unboximpl()) : super.convertDimension(value);
    }

    @NotNull
    public final List<Object> getBaselineNeeded$compose_release() {
        return this.baselineNeeded;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @Nullable
    public final Object getKeyId$compose_release(@NotNull HelperWidget helperWidget) {
        Object next;
        Iterator<T> it2 = this.mHelperReferences.entrySet().iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(((HelperReference) ((Map.Entry) next).getValue()).getHelperWidget(), helperWidget));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        Objects.requireNonNull(layoutDirection);
        return layoutDirection;
    }

    /* JADX INFO: renamed from: getRootIncomingConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getRootIncomingConstraints() {
        return this.rootIncomingConstraints;
    }

    public final boolean isBaselineNeeded$compose_release(@NotNull ConstraintWidget constraintWidget) {
        if (this.dirtyBaselineNeededWidgets) {
            this.baselineNeededWidgets.clear();
            Iterator<T> it2 = this.baselineNeeded.iterator();
            while (it2.hasNext()) {
                Reference reference = this.mReferences.get(it2.next());
                ConstraintWidget constraintWidget2 = reference == null ? null : reference.getConstraintWidget();
                if (constraintWidget2 != null) {
                    this.baselineNeededWidgets.add(constraintWidget2);
                }
            }
            this.dirtyBaselineNeededWidgets = false;
        }
        return this.baselineNeededWidgets.contains(constraintWidget);
    }

    @Override // androidx.constraintlayout.core.state.State
    public void reset() {
        ConstraintWidget constraintWidget;
        Iterator<Map.Entry<Object, Reference>> it2 = this.mReferences.entrySet().iterator();
        while (it2.hasNext()) {
            Reference value = it2.next().getValue();
            if (value != null && (constraintWidget = value.getConstraintWidget()) != null) {
                constraintWidget.reset();
            }
        }
        this.mReferences.clear();
        this.mReferences.put(androidx.constraintlayout.core.state.State.PARENT, this.mParent);
        this.baselineNeeded.clear();
        this.dirtyBaselineNeededWidgets = true;
        super.reset();
    }

    public final void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: setRootIncomingConstraints-BRTryo0, reason: not valid java name */
    public final void m3265setRootIncomingConstraintsBRTryo0(long j) {
        this.rootIncomingConstraints = j;
    }
}
