package com.huami.utils.easypermission.manager;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.utils.easypermission.manager.PermissionManagerAdapter;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/utils/easypermission/manager/PermissionManagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/utils/easypermission/manager/ManagerViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "Lcom/huami/utils/easypermission/manager/PermissionEntry;", "a", "Ljava/util/List;", "permissionList", "<init>", "(Ljava/util/List;)V", "easypermission_release"}, k = 1, mv = {1, 5, 1})
public final class PermissionManagerAdapter extends RecyclerView.Adapter<ManagerViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<PermissionEntry> permissionList;

    public PermissionManagerAdapter(@NotNull List<PermissionEntry> list) {
        this.permissionList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(PermissionEntry permissionEntry, View view) {
        permissionEntry.getClickListener().invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.permissionList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ManagerViewHolder holder, int position) {
        final PermissionEntry permissionEntry = this.permissionList.get(position);
        holder.getTitleView().setText(permissionEntry.getTitle());
        holder.getContentView().setText(permissionEntry.getContent());
        holder.getStatusView().setText(permissionEntry.getStatus());
        holder.getStatusView().setOnClickListener(new View.OnClickListener() { // from class: ys5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionManagerAdapter.b(permissionEntry, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ManagerViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return ManagerViewHolder.INSTANCE.create(parent);
    }
}
