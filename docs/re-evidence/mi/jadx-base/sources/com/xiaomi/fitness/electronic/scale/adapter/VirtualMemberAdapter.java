package com.xiaomi.fitness.electronic.scale.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.electronic.scale.adapter.VirtualMemberAdapter;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.bri;
import defpackage.gui;
import defpackage.lni;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001d\u001eB\u0017\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u001c\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u0016\u0010\u001a\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\b\u0010\u001c\u001a\u00020\u0015H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/VirtualMemberAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/electronic/scale/adapter/VirtualMemberAdapter$ViewHolder;", "users", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "<init>", "(Ljava/util/List;)V", "getUsers", "()Ljava/util/List;", "setUsers", "onItemClickListener", "Lcom/xiaomi/fitness/electronic/scale/adapter/VirtualMemberAdapter$OnItemClickListener;", "getOnItemClickListener", "()Lcom/xiaomi/fitness/electronic/scale/adapter/VirtualMemberAdapter$OnItemClickListener;", "setOnItemClickListener", "(Lcom/xiaomi/fitness/electronic/scale/adapter/VirtualMemberAdapter$OnItemClickListener;)V", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "i", "", "onBindViewHolder", "", "myViewHolder", "position", "updateData", "data", "getItemCount", "ViewHolder", "OnItemClickListener", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VirtualMemberAdapter extends RecyclerView.Adapter<ViewHolder> {

    @Nullable
    private OnItemClickListener onItemClickListener;

    @NotNull
    private List<VirtualAccount> users;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/VirtualMemberAdapter$OnItemClickListener;", "", "onClick", "", SceneRecogBroadcastReceiver.FROM_USER, "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "i", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull VirtualAccount user, int i);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/VirtualMemberAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "icon", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "getIcon", "()Lcom/xiaomi/fitness/widget/view/RoundImageView;", "setIcon", "(Lcom/xiaomi/fitness/widget/view/RoundImageView;)V", "Landroid/widget/TextView;", "tvName", "Landroid/widget/TextView;", "getTvName", "()Landroid/widget/TextView;", "setTvName", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/electronic/scale/adapter/VirtualMemberAdapter;Landroid/view/View;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ViewHolder extends RecyclerView.d0 {

        @NotNull
        private RoundImageView icon;
        final /* synthetic */ VirtualMemberAdapter this$0;

        @NotNull
        private TextView tvName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull VirtualMemberAdapter virtualMemberAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = virtualMemberAdapter;
            View viewFindViewById = itemView.findViewById(bri.M0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (RoundImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bri.b5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.tvName = (TextView) viewFindViewById2;
        }

        @NotNull
        public final RoundImageView getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextView getTvName() {
            return this.tvName;
        }

        public final void setIcon(@NotNull RoundImageView roundImageView) {
            Intrinsics.checkNotNullParameter(roundImageView, "<set-?>");
            this.icon = roundImageView;
        }

        public final void setTvName(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvName = textView;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VirtualMemberAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(VirtualMemberAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onClick(this$0.users.get(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.users.size();
    }

    @Nullable
    public final OnItemClickListener getOnItemClickListener() {
        return this.onItemClickListener;
    }

    @NotNull
    public final List<VirtualAccount> getUsers() {
        return this.users;
    }

    public final void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public final void setUsers(@NotNull List<VirtualAccount> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.users = list;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateData(@NotNull List<VirtualAccount> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.users = data;
        notifyDataSetChanged();
    }

    public /* synthetic */ VirtualMemberAdapter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder myViewHolder, final int position) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(myViewHolder, "myViewHolder");
        myViewHolder.itemView.setVisibility(0);
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: ozq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualMemberAdapter.onBindViewHolder$lambda$0(this.f29851a, position, view);
            }
        });
        myViewHolder.getIcon().setTag(Boolean.TRUE);
        if (this.users.get(position).getName().length() > 0) {
            strSubstring = this.users.get(position).getName().substring(this.users.get(position).getName().length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        myViewHolder.getTvName().setText(strSubstring);
        myViewHolder.getIcon().setImageResource(lni.B);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"InflateParams"})
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(gui.r0, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.width = ExtUtilsKt.getDp(Float.valueOf(70.0f));
        viewInflate.setLayoutParams(layoutParams);
        Intrinsics.checkNotNull(viewInflate);
        return new ViewHolder(this, viewInflate);
    }

    public VirtualMemberAdapter(@NotNull List<VirtualAccount> users) {
        Intrinsics.checkNotNullParameter(users, "users");
        this.users = users;
    }
}
