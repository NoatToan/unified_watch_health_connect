package com.xiaomi.fitness.membership.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.membership.dialog.MembershipDialogAdapter;
import com.xiaomi.fitness.membership.export.data.Membership;
import com.xiaomi.fitness.membership.export.data.Promotion;
import defpackage.k0j;
import defpackage.uni;
import defpackage.yof;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u000f\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u001c\u0010\u0017\u001a\u00020\u00072\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000eH\u0016R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/membership/dialog/MembershipDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/membership/dialog/MembershipDialogAdapter$MembershipDialogViewHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/membership/dialog/OnComboSelect;", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/membership/export/data/Membership;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "comboList", "", "select", "", "setComboList", "list", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "MembershipDialogViewHolder", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MembershipDialogAdapter extends RecyclerView.Adapter<MembershipDialogViewHolder> {

    @NotNull
    private final List<Membership> comboList;

    @NotNull
    private final Function1<Membership, Unit> listener;
    private int select;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/membership/dialog/MembershipDialogAdapter$MembershipDialogViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/membership/export/data/Membership;", "membership", "", "onBind", "(Lcom/xiaomi/fitness/membership/export/data/Membership;)V", "onClick", "Lyof;", "binding", "Lyof;", "<init>", "(Lcom/xiaomi/fitness/membership/dialog/MembershipDialogAdapter;Lyof;)V", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class MembershipDialogViewHolder extends RecyclerView.d0 {

        @NotNull
        private final yof binding;
        final /* synthetic */ MembershipDialogAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MembershipDialogViewHolder(@NotNull MembershipDialogAdapter membershipDialogAdapter, yof binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = membershipDialogAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$1(MembershipDialogAdapter this$0, MembershipDialogViewHolder this$1, Membership membership, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(membership, "$membership");
            this$0.notifyItemChanged(this$0.select);
            this$0.select = this$1.getBindingAdapterPosition();
            this$0.notifyItemChanged(this$0.select);
            this$0.listener.invoke2(membership);
        }

        public final void onBind(@NotNull Membership membership) {
            Intrinsics.checkNotNullParameter(membership, "membership");
            if (getBindingAdapterPosition() == this.this$0.select) {
                this.binding.B.setBackgroundResource(uni.c);
            } else {
                this.binding.B.setBackgroundResource(uni.f35951b);
            }
            this.binding.D.setText(membership.getName());
            if (membership.getPromotion() == null) {
                TextView textView = this.binding.E;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(membership.getPrice() / 100.0f)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
                TextView deprecated = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(deprecated, "deprecated");
                ViewExtKt.invisible(deprecated);
                TextView tag = this.binding.F;
                Intrinsics.checkNotNullExpressionValue(tag, "tag");
                ViewExtKt.invisible(tag);
                ImageView ivTagBg = this.binding.C;
                Intrinsics.checkNotNullExpressionValue(ivTagBg, "ivTagBg");
                ViewExtKt.invisible(ivTagBg);
                return;
            }
            TextView textView2 = this.binding.E;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Promotion promotion = membership.getPromotion();
            Intrinsics.checkNotNull(promotion);
            String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(promotion.getPrice() / 100.0f)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            textView2.setText(str2);
            TextView deprecated2 = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(deprecated2, "deprecated");
            ViewExtKt.visible(deprecated2);
            TextView textView3 = this.binding.A;
            textView3.setPaintFlags(textView3.getPaintFlags() | 16);
            this.binding.A.setText(ResourceExtKt.getString(k0j.g, Float.valueOf(membership.getPrice() / 100.0f)));
            Promotion promotion2 = membership.getPromotion();
            Intrinsics.checkNotNull(promotion2);
            String tagline = promotion2.getTagline();
            if (tagline == null || tagline.length() == 0) {
                TextView tag2 = this.binding.F;
                Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                ViewExtKt.gone(tag2);
                ImageView ivTagBg2 = this.binding.C;
                Intrinsics.checkNotNullExpressionValue(ivTagBg2, "ivTagBg");
                ViewExtKt.gone(ivTagBg2);
                return;
            }
            TextView tag3 = this.binding.F;
            Intrinsics.checkNotNullExpressionValue(tag3, "tag");
            ViewExtKt.visible(tag3);
            ImageView imageView = this.binding.C;
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.visible(imageView);
            imageView.setScaleX(AppUtil.isRTLDirection() ? -1.0f : 1.0f);
            this.binding.F.setText(tagline);
        }

        public final void onClick(@NotNull final Membership membership) {
            Intrinsics.checkNotNullParameter(membership, "membership");
            View root = this.binding.getRoot();
            final MembershipDialogAdapter membershipDialogAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: kof
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MembershipDialogAdapter.MembershipDialogViewHolder.onClick$lambda$1(membershipDialogAdapter, this, membership, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MembershipDialogAdapter(@NotNull Function1<? super Membership, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.comboList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.comboList.size();
    }

    public final void setComboList(@NotNull List<Membership> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.select = 0;
        this.comboList.clear();
        this.comboList.addAll(list);
        notifyDataSetChanged();
        if (!this.comboList.isEmpty()) {
            this.listener.invoke2(this.comboList.get(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MembershipDialogViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Membership membership = this.comboList.get(position);
        holder.onBind(membership);
        holder.onClick(membership);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MembershipDialogViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        yof yofVarA0 = yof.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(yofVarA0, "inflate(...)");
        return new MembershipDialogViewHolder(this, yofVarA0);
    }
}
