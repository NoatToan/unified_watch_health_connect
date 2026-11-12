package androidx.compose.ui.node;

import androidx.compose.ui.layout.ParentDataModifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/ModifiedParentDataNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/layout/ParentDataModifier;", "", "getParentData", "()Ljava/lang/Object;", "parentData", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "parentDataModifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/ParentDataModifier;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class ModifiedParentDataNode extends DelegatingLayoutNodeWrapper<ParentDataModifier> {
    public ModifiedParentDataNode(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull ParentDataModifier parentDataModifier) {
        super(layoutNodeWrapper, parentDataModifier);
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return getModifier().modifyParentData(getLayoutNode().getMeasureScope(), getWrapped().getParentData());
    }
}
