package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.layout.MeasurePolicy;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007R\u0019\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy;", "", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicyFromState", "measurePolicy", "", "updateFrom", "", "height", "minIntrinsicWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/MutableState;", "measurePolicyState", "Landroidx/compose/runtime/MutableState;", "pendingMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class IntrinsicsPolicy {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    private static final String NoPolicyError = "Intrinsic size is queried but there is no measure policy in place.";

    @NotNull
    private final LayoutNode layoutNode;

    @Nullable
    private MutableState<MeasurePolicy> measurePolicyState;

    @Nullable
    private MeasurePolicy pendingMeasurePolicy;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy$Companion;", "", "", "NoPolicyError", "Ljava/lang/String;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public IntrinsicsPolicy(@NotNull LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    private final MeasurePolicy measurePolicyFromState() {
        MutableState<MeasurePolicy> mutableStateMutableStateOf$default = this.measurePolicyState;
        if (mutableStateMutableStateOf$default == null) {
            MeasurePolicy measurePolicy = this.pendingMeasurePolicy;
            if (measurePolicy == null) {
                throw new IllegalStateException(NoPolicyError.toString());
            }
            mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(measurePolicy, null, 2, null);
        }
        this.measurePolicyState = mutableStateMutableStateOf$default;
        return mutableStateMutableStateOf$default.getValue();
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final int maxIntrinsicHeight(int width) {
        return measurePolicyFromState().maxIntrinsicHeight(getLayoutNode().getMeasureScope(), getLayoutNode().getChildren$ui_release(), width);
    }

    public final int maxIntrinsicWidth(int height) {
        return measurePolicyFromState().maxIntrinsicWidth(getLayoutNode().getMeasureScope(), getLayoutNode().getChildren$ui_release(), height);
    }

    public final int minIntrinsicHeight(int width) {
        return measurePolicyFromState().minIntrinsicHeight(getLayoutNode().getMeasureScope(), getLayoutNode().getChildren$ui_release(), width);
    }

    public final int minIntrinsicWidth(int height) {
        return measurePolicyFromState().minIntrinsicWidth(getLayoutNode().getMeasureScope(), getLayoutNode().getChildren$ui_release(), height);
    }

    public final void updateFrom(@NotNull MeasurePolicy measurePolicy) {
        MutableState<MeasurePolicy> mutableState = this.measurePolicyState;
        if (mutableState != null) {
            mutableState.setValue(measurePolicy);
        } else {
            this.pendingMeasurePolicy = measurePolicy;
        }
    }
}
