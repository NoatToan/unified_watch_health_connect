package com.xiaomi.fitness.electronic.scale.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.electronic.scale.adapter.SharedAccountAdapter;
import com.xiaomi.fitness.electronic.scale.callback.OnDelDeviceCallback;
import com.xiaomi.fitness.electronic.scale.export.bean.ShareAccount;
import defpackage.bri;
import defpackage.gui;
import defpackage.zzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0005R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/SharedAccountAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/electronic/scale/adapter/SharedAccountAdapter$ClaimRecordViewHolder;", "shareAccounts", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ShareAccount;", "onDelDeviceCallback", "Lcom/xiaomi/fitness/electronic/scale/callback/OnDelDeviceCallback;", "<init>", "(Ljava/util/List;Lcom/xiaomi/fitness/electronic/scale/callback/OnDelDeviceCallback;)V", "getShareAccounts", "()Ljava/util/List;", "setShareAccounts", "(Ljava/util/List;)V", "getOnDelDeviceCallback", "()Lcom/xiaomi/fitness/electronic/scale/callback/OnDelDeviceCallback;", "setOnDelDeviceCallback", "(Lcom/xiaomi/fitness/electronic/scale/callback/OnDelDeviceCallback;)V", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "i", "", "onBindViewHolder", "", "myViewHolder", "getItemCount", "remove", "shareAccount", "ClaimRecordViewHolder", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedAccountAdapter extends RecyclerView.Adapter<ClaimRecordViewHolder> {

    @NotNull
    private OnDelDeviceCallback onDelDeviceCallback;

    @NotNull
    private List<ShareAccount> shareAccounts;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/SharedAccountAdapter$ClaimRecordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "userIdTv", "Landroid/widget/TextView;", "getUserIdTv", "()Landroid/widget/TextView;", "setUserIdTv", "(Landroid/widget/TextView;)V", "acceptStatus", "getAcceptStatus", "setAcceptStatus", "Landroid/widget/FrameLayout;", "delLayout", "Landroid/widget/FrameLayout;", "getDelLayout", "()Landroid/widget/FrameLayout;", "setDelLayout", "(Landroid/widget/FrameLayout;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/electronic/scale/adapter/SharedAccountAdapter;Landroid/view/View;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ClaimRecordViewHolder extends RecyclerView.d0 {

        @NotNull
        private TextView acceptStatus;

        @NotNull
        private FrameLayout delLayout;
        final /* synthetic */ SharedAccountAdapter this$0;

        @NotNull
        private TextView userIdTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClaimRecordViewHolder(@NotNull SharedAccountAdapter sharedAccountAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sharedAccountAdapter;
            View viewFindViewById = itemView.findViewById(bri.f6);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.userIdTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bri.f4512a);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.acceptStatus = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(bri.A1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.delLayout = (FrameLayout) viewFindViewById3;
        }

        @NotNull
        public final TextView getAcceptStatus() {
            return this.acceptStatus;
        }

        @NotNull
        public final FrameLayout getDelLayout() {
            return this.delLayout;
        }

        @NotNull
        public final TextView getUserIdTv() {
            return this.userIdTv;
        }

        public final void setAcceptStatus(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.acceptStatus = textView;
        }

        public final void setDelLayout(@NotNull FrameLayout frameLayout) {
            Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
            this.delLayout = frameLayout;
        }

        public final void setUserIdTv(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.userIdTv = textView;
        }
    }

    public SharedAccountAdapter(@NotNull List<ShareAccount> shareAccounts, @NotNull OnDelDeviceCallback onDelDeviceCallback) {
        Intrinsics.checkNotNullParameter(shareAccounts, "shareAccounts");
        Intrinsics.checkNotNullParameter(onDelDeviceCallback, "onDelDeviceCallback");
        this.shareAccounts = shareAccounts;
        this.onDelDeviceCallback = onDelDeviceCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(ShareAccount shareAccount, SharedAccountAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(shareAccount, "$shareAccount");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        shareAccount.setDel(!shareAccount.isDel());
        this$0.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(SharedAccountAdapter this$0, ShareAccount shareAccount, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareAccount, "$shareAccount");
        this$0.onDelDeviceCallback.onDel(shareAccount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.shareAccounts.size();
    }

    @NotNull
    public final OnDelDeviceCallback getOnDelDeviceCallback() {
        return this.onDelDeviceCallback;
    }

    @NotNull
    public final List<ShareAccount> getShareAccounts() {
        return this.shareAccounts;
    }

    public final void remove(@NotNull ShareAccount shareAccount) {
        Intrinsics.checkNotNullParameter(shareAccount, "shareAccount");
        this.shareAccounts.remove(shareAccount);
        notifyDataSetChanged();
    }

    public final void setOnDelDeviceCallback(@NotNull OnDelDeviceCallback onDelDeviceCallback) {
        Intrinsics.checkNotNullParameter(onDelDeviceCallback, "<set-?>");
        this.onDelDeviceCallback = onDelDeviceCallback;
    }

    public final void setShareAccounts(@NotNull List<ShareAccount> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.shareAccounts = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"NotifyDataSetChanged"})
    public void onBindViewHolder(@NotNull ClaimRecordViewHolder myViewHolder, int i) {
        Intrinsics.checkNotNullParameter(myViewHolder, "myViewHolder");
        final ShareAccount shareAccount = this.shareAccounts.get(i);
        myViewHolder.getUserIdTv().setText(shareAccount.getShareUserId());
        if (shareAccount.isAccepted()) {
            myViewHolder.getAcceptStatus().setText(ResourceExtKt.getString(zzi.f41832k));
        } else {
            myViewHolder.getAcceptStatus().setText(ResourceExtKt.getString(zzi.l));
        }
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: cam
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SharedAccountAdapter.onBindViewHolder$lambda$0(shareAccount, this, view);
            }
        });
        if (!shareAccount.isDel()) {
            myViewHolder.getDelLayout().setVisibility(8);
        } else {
            myViewHolder.getDelLayout().setVisibility(0);
            myViewHolder.getDelLayout().setOnClickListener(new View.OnClickListener() { // from class: dam
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SharedAccountAdapter.onBindViewHolder$lambda$1(this.f15319a, shareAccount, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ClaimRecordViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(gui.o0, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new ClaimRecordViewHolder(this, viewInflate);
    }
}
