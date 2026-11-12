package com.xiaomi.hm.health.device.introduce;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.introduce.ChooseRestoreAdapter;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/ChooseRestoreAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/introduce/ChooseRestoreHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/xiaomi/hm/health/device/introduce/RestoreItem;", "a", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "Lcom/xiaomi/hm/health/device/introduce/RestoreAdapterCallback;", "b", "Lcom/xiaomi/hm/health/device/introduce/RestoreAdapterCallback;", "restoreAdapterCallback", "", "c", "Z", "isBind", "<init>", "(Ljava/util/List;Lcom/xiaomi/hm/health/device/introduce/RestoreAdapterCallback;Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ChooseRestoreAdapter extends RecyclerView.Adapter<ChooseRestoreHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<RestoreItem> data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RestoreAdapterCallback restoreAdapterCallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isBind;

    public ChooseRestoreAdapter(@NotNull List<RestoreItem> list, @NotNull RestoreAdapterCallback restoreAdapterCallback, boolean z) {
        this.data = list;
        this.restoreAdapterCallback = restoreAdapterCallback;
        this.isBind = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ChooseRestoreAdapter chooseRestoreAdapter, int i, CompoundButton compoundButton, boolean z) {
        chooseRestoreAdapter.getData().get(i).setRestore(z);
        chooseRestoreAdapter.restoreAdapterCallback.onCheckChange(z);
    }

    @NotNull
    public final List<RestoreItem> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.data.size();
    }

    public final void setData(@NotNull List<RestoreItem> list) {
        this.data = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ChooseRestoreHolder holder, final int position) {
        holder.getChooseRestoreTitleTv().setText(getData().get(position).getRestoreName());
        holder.getChooseRestoreItemTipsTv().setText(this.isBind ? getData().get(position).getRestoreTips() : getData().get(position).getEnableRestoreTips());
        holder.getRestoreCb().setChecked(getData().get(position).getRestore());
        holder.getRestoreCb().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: jo0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ChooseRestoreAdapter.b(this.a, position, compoundButton, z);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ChooseRestoreHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ChooseRestoreHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_choose_restore, parent, false));
    }
}
