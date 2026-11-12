package com.xiaomi.hm.health.play.card.health;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.databases.model.Friend;
import com.xiaomi.hm.health.databinding.LayoutToolFriendsItemBinding;
import com.xiaomi.hm.health.manager.AvatarManager;
import com.xiaomi.hm.health.play.card.health.FriendsAdapter;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/play/card/health/FriendsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/play/card/health/FriendsHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Lcom/xiaomi/hm/health/play/card/health/OnFriendsItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/xiaomi/hm/health/databases/model/Friend;", "b", "Ljava/util/List;", "friendsList", "c", "Lcom/xiaomi/hm/health/play/card/health/OnFriendsItemClickListener;", "mOnItemClick", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FriendsAdapter extends RecyclerView.Adapter<FriendsHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Friend> friendsList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OnFriendsItemClickListener mOnItemClick;

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsAdapter(@NotNull Context context, @NotNull List<? extends Friend> list) {
        this.context = context;
        this.friendsList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(FriendsAdapter friendsAdapter, int i, View view) {
        OnFriendsItemClickListener onFriendsItemClickListener = friendsAdapter.mOnItemClick;
        if (onFriendsItemClickListener == null) {
            return;
        }
        onFriendsItemClickListener.onItemClick(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        int size = this.friendsList.size();
        if (size > 3) {
            return 3;
        }
        return size;
    }

    public final void setOnItemClickListener(@NotNull OnFriendsItemClickListener listener) {
        this.mOnItemClick = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FriendsHolder holder, final int position) {
        Friend friend = this.friendsList.get(position);
        holder.getBinding().toolFriendsName.setText(friend.getDisplayName());
        AvatarManager.updateAvatarUI((ImageView) holder.getBinding().toolFriendsIcon, friend.icon, true, friend.getDisplayName());
        holder.getBinding().getRoot().setOnClickListener(new View.OnClickListener() { // from class: pb2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsAdapter.b(this.a, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FriendsHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new FriendsHolder(LayoutToolFriendsItemBinding.inflate(LayoutInflater.from(this.context), parent, false));
    }
}
