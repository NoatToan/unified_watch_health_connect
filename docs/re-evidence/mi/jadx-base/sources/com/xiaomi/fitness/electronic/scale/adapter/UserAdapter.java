package com.xiaomi.fitness.electronic.scale.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.electronic.scale.adapter.UserAdapter;
import com.xiaomi.fitness.electronic.scale.callback.OnHandleUserCallback;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.bri;
import defpackage.gui;
import defpackage.lni;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/UserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserAdapter$UserViewHolder;", "users", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "onHandleUserCallback", "Lcom/xiaomi/fitness/electronic/scale/callback/OnHandleUserCallback;", "<init>", "(Ljava/util/List;Lcom/xiaomi/fitness/electronic/scale/callback/OnHandleUserCallback;)V", "getUsers", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "getOnHandleUserCallback", "()Lcom/xiaomi/fitness/electronic/scale/callback/OnHandleUserCallback;", "setOnHandleUserCallback", "(Lcom/xiaomi/fitness/electronic/scale/callback/OnHandleUserCallback;)V", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "i", "", "onBindViewHolder", "", "myViewHolder", "getItemCount", "UserViewHolder", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {

    @NotNull
    private OnHandleUserCallback onHandleUserCallback;

    @NotNull
    private List<VirtualAccount> users;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/UserAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "icon", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "getIcon", "()Lcom/xiaomi/fitness/widget/view/RoundImageView;", "setIcon", "(Lcom/xiaomi/fitness/widget/view/RoundImageView;)V", "Landroid/widget/TextView;", "tvName", "Landroid/widget/TextView;", "getTvName", "()Landroid/widget/TextView;", "setTvName", "(Landroid/widget/TextView;)V", "userIdTv", "getUserIdTv", "setUserIdTv", "Landroid/widget/FrameLayout;", "delLayout", "Landroid/widget/FrameLayout;", "getDelLayout", "()Landroid/widget/FrameLayout;", "setDelLayout", "(Landroid/widget/FrameLayout;)V", "editLayout", "getEditLayout", "setEditLayout", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/electronic/scale/adapter/UserAdapter;Landroid/view/View;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class UserViewHolder extends RecyclerView.d0 {

        @NotNull
        private FrameLayout delLayout;

        @NotNull
        private FrameLayout editLayout;

        @NotNull
        private RoundImageView icon;
        final /* synthetic */ UserAdapter this$0;

        @NotNull
        private TextView tvName;

        @NotNull
        private TextView userIdTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserViewHolder(@NotNull UserAdapter userAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = userAdapter;
            View viewFindViewById = itemView.findViewById(bri.M0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (RoundImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bri.b5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.tvName = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(bri.f6);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.userIdTv = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(bri.A1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.delLayout = (FrameLayout) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(bri.B1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.editLayout = (FrameLayout) viewFindViewById5;
        }

        @NotNull
        public final FrameLayout getDelLayout() {
            return this.delLayout;
        }

        @NotNull
        public final FrameLayout getEditLayout() {
            return this.editLayout;
        }

        @NotNull
        public final RoundImageView getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextView getTvName() {
            return this.tvName;
        }

        @NotNull
        public final TextView getUserIdTv() {
            return this.userIdTv;
        }

        public final void setDelLayout(@NotNull FrameLayout frameLayout) {
            Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
            this.delLayout = frameLayout;
        }

        public final void setEditLayout(@NotNull FrameLayout frameLayout) {
            Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
            this.editLayout = frameLayout;
        }

        public final void setIcon(@NotNull RoundImageView roundImageView) {
            Intrinsics.checkNotNullParameter(roundImageView, "<set-?>");
            this.icon = roundImageView;
        }

        public final void setTvName(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvName = textView;
        }

        public final void setUserIdTv(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.userIdTv = textView;
        }
    }

    public UserAdapter(@NotNull List<VirtualAccount> users, @NotNull OnHandleUserCallback onHandleUserCallback) {
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(onHandleUserCallback, "onHandleUserCallback");
        this.users = users;
        this.onHandleUserCallback = onHandleUserCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$0(UserAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.users.get(i).setDel(!this$0.users.get(i).isDel());
        this$0.notifyDataSetChanged();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(UserAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onHandleUserCallback.onDel(this$0.users.get(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(UserAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onHandleUserCallback.onEdit(this$0.users.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.users.size();
    }

    @NotNull
    public final OnHandleUserCallback getOnHandleUserCallback() {
        return this.onHandleUserCallback;
    }

    @NotNull
    public final List<VirtualAccount> getUsers() {
        return this.users;
    }

    public final void setOnHandleUserCallback(@NotNull OnHandleUserCallback onHandleUserCallback) {
        Intrinsics.checkNotNullParameter(onHandleUserCallback, "<set-?>");
        this.onHandleUserCallback = onHandleUserCallback;
    }

    public final void setUsers(@NotNull List<VirtualAccount> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.users = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull UserViewHolder myViewHolder, final int i) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(myViewHolder, "myViewHolder");
        if (this.users.get(i).getName().length() > 0) {
            strSubstring = this.users.get(i).getName().substring(this.users.get(i).getName().length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        myViewHolder.getTvName().setText(strSubstring);
        myViewHolder.getIcon().setImageResource(lni.B);
        myViewHolder.getUserIdTv().setText(this.users.get(i).getName());
        myViewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: zdq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return UserAdapter.onBindViewHolder$lambda$0(this.f41164a, i, view);
            }
        });
        if (this.users.get(i).isDel()) {
            myViewHolder.getDelLayout().setVisibility(0);
            myViewHolder.getDelLayout().setOnClickListener(new View.OnClickListener() { // from class: aeq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserAdapter.onBindViewHolder$lambda$1(this.f932a, i, view);
                }
            });
        } else {
            myViewHolder.getDelLayout().setVisibility(8);
        }
        myViewHolder.getEditLayout().setOnClickListener(new View.OnClickListener() { // from class: beq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAdapter.onBindViewHolder$lambda$2(this.f4132a, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public UserViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(gui.p0, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new UserViewHolder(this, viewInflate);
    }
}
