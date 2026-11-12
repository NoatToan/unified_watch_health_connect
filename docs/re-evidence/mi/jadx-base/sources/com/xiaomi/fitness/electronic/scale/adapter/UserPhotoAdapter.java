package com.xiaomi.fitness.electronic.scale.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.electronic.scale.adapter.UserPhotoAdapter;
import com.xiaomi.fitness.electronic.scale.data.AddUserIcon;
import com.xiaomi.fitness.electronic.scale.data.Icon;
import com.xiaomi.fitness.electronic.scale.data.UserPhotoIcon;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.bri;
import defpackage.gui;
import defpackage.lni;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001c\u001dB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\u001b\u001a\u00020\u0015H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter$UserPhotoViewHolder;", "mIcons", "", "Lcom/xiaomi/fitness/electronic/scale/data/Icon;", "<init>", "(Ljava/util/List;)V", "getMIcons", "()Ljava/util/List;", "setMIcons", "onItemClickListener", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter$OnItemClickListener;", "getOnItemClickListener", "()Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter$OnItemClickListener;", "setOnItemClickListener", "(Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter$OnItemClickListener;)V", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "i", "", "onBindViewHolder", "", "myViewHolder", "updateData", "icons", "getItemCount", "UserPhotoViewHolder", "OnItemClickListener", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserPhotoAdapter extends RecyclerView.Adapter<UserPhotoViewHolder> {

    @NotNull
    private List<Icon> mIcons;

    @Nullable
    private OnItemClickListener onItemClickListener;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter$OnItemClickListener;", "", "onClick", "", "icon", "Lcom/xiaomi/fitness/electronic/scale/data/UserPhotoIcon;", "onAddUser", "did", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onAddUser(@NotNull String did);

        void onClick(@NotNull UserPhotoIcon icon);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter$UserPhotoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "iconIV", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "getIconIV", "()Lcom/xiaomi/fitness/widget/view/RoundImageView;", "setIconIV", "(Lcom/xiaomi/fitness/widget/view/RoundImageView;)V", "Landroid/widget/TextView;", "nameTV", "Landroid/widget/TextView;", "getNameTV", "()Landroid/widget/TextView;", "setNameTV", "(Landroid/widget/TextView;)V", "nameIcon", "getNameIcon", "setNameIcon", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter;Landroid/view/View;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class UserPhotoViewHolder extends RecyclerView.d0 {

        @NotNull
        private RoundImageView iconIV;

        @NotNull
        private TextView nameIcon;

        @NotNull
        private TextView nameTV;
        final /* synthetic */ UserPhotoAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserPhotoViewHolder(@NotNull UserPhotoAdapter userPhotoAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = userPhotoAdapter;
            View viewFindViewById = itemView.findViewById(bri.M0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.iconIV = (RoundImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bri.L2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.nameTV = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(bri.P0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.nameIcon = (TextView) viewFindViewById3;
        }

        @NotNull
        public final RoundImageView getIconIV() {
            return this.iconIV;
        }

        @NotNull
        public final TextView getNameIcon() {
            return this.nameIcon;
        }

        @NotNull
        public final TextView getNameTV() {
            return this.nameTV;
        }

        public final void setIconIV(@NotNull RoundImageView roundImageView) {
            Intrinsics.checkNotNullParameter(roundImageView, "<set-?>");
            this.iconIV = roundImageView;
        }

        public final void setNameIcon(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.nameIcon = textView;
        }

        public final void setNameTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.nameTV = textView;
        }
    }

    public UserPhotoAdapter(@NotNull List<Icon> mIcons) {
        Intrinsics.checkNotNullParameter(mIcons, "mIcons");
        this.mIcons = mIcons;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(UserPhotoAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onAddUser(this$0.mIcons.get(i).getDid());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(UserPhotoAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            Icon icon = this$0.mIcons.get(i);
            Intrinsics.checkNotNull(icon, "null cannot be cast to non-null type com.xiaomi.fitness.electronic.scale.data.UserPhotoIcon");
            onItemClickListener.onClick((UserPhotoIcon) icon);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Math.min(16, this.mIcons.size());
    }

    @NotNull
    public final List<Icon> getMIcons() {
        return this.mIcons;
    }

    @Nullable
    public final OnItemClickListener getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public final void setMIcons(@NotNull List<Icon> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mIcons = list;
    }

    public final void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public final void updateData(@NotNull List<Icon> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.mIcons = icons;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull UserPhotoViewHolder myViewHolder, final int i) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(myViewHolder, "myViewHolder");
        myViewHolder.getNameTV().setText(this.mIcons.get(i).getTitle());
        if (this.mIcons.get(i) instanceof AddUserIcon) {
            myViewHolder.getIconIV().setImageResource(this.mIcons.get(i).getDrawableId());
            myViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: biq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserPhotoAdapter.onBindViewHolder$lambda$0(this.f4266a, i, view);
                }
            });
            return;
        }
        if (this.mIcons.get(i).getTitle().length() > 0) {
            strSubstring = this.mIcons.get(i).getTitle().substring(this.mIcons.get(i).getTitle().length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        myViewHolder.getNameIcon().setText(strSubstring);
        myViewHolder.getIconIV().setImageResource(lni.B);
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: ciq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserPhotoAdapter.onBindViewHolder$lambda$1(this.f5385a, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public UserPhotoViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(gui.q0, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new UserPhotoViewHolder(this, viewInflate);
    }
}
