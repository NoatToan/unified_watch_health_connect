package com.xiaomi.hm.health.play.card.health;

import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.databinding.LayoutToolFriendsItemBinding;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/play/card/health/FriendsHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/xiaomi/hm/health/databinding/LayoutToolFriendsItemBinding;", "a", "Lcom/xiaomi/hm/health/databinding/LayoutToolFriendsItemBinding;", "getBinding", "()Lcom/xiaomi/hm/health/databinding/LayoutToolFriendsItemBinding;", "binding", "<init>", "(Lcom/xiaomi/hm/health/databinding/LayoutToolFriendsItemBinding;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FriendsHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LayoutToolFriendsItemBinding binding;

    public FriendsHolder(@NotNull LayoutToolFriendsItemBinding layoutToolFriendsItemBinding) {
        super(layoutToolFriendsItemBinding.getRoot());
        this.binding = layoutToolFriendsItemBinding;
    }

    @NotNull
    public final LayoutToolFriendsItemBinding getBinding() {
        return this.binding;
    }
}
