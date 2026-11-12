package com.huami.member_card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.member_card.MembershipCardBgColorAdapter;
import com.huami.member_card.bean.CardBgBean;
import com.huami.member_card.bean.MemberCardColorBg;
import com.huami.member_card.databinding.MembershipCardBgColorBinding;
import com.huami.member_card.fragment.MembershipHomeFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\f\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0006\u0010\u000e\u001a\u00020\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/member_card/MembershipCardBgColorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/member_card/MembershipCardBgColorAdapter$CardBgViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "Lcom/huami/member_card/bean/MemberCardColorBg;", "getSelectColorBg", "Lcom/huami/member_card/bean/CardBgBean;", "a", "Lcom/huami/member_card/bean/CardBgBean;", "lastSelectBean", "", "value", "b", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "setColors", "(Ljava/util/List;)V", "colors", "<init>", "()V", "CardBgViewHolder", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final class MembershipCardBgColorAdapter extends RecyclerView.Adapter<CardBgViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private CardBgBean lastSelectBean;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<CardBgBean> colors = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/member_card/MembershipCardBgColorAdapter$CardBgViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/member_card/bean/CardBgBean;", "cardBgBean", "", "bindColor", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "Lcom/huami/member_card/databinding/MembershipCardBgColorBinding;", "a", "Lcom/huami/member_card/databinding/MembershipCardBgColorBinding;", "binding", "<init>", "(Lcom/huami/member_card/MembershipCardBgColorAdapter;Lcom/huami/member_card/databinding/MembershipCardBgColorBinding;)V", "member_card_release"}, k = 1, mv = {1, 5, 1})
    public final class CardBgViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final MembershipCardBgColorBinding binding;

        public CardBgViewHolder(MembershipCardBgColorBinding membershipCardBgColorBinding) {
            super(membershipCardBgColorBinding.getRoot());
            this.binding = membershipCardBgColorBinding;
        }

        public final void bindColor(@NotNull CardBgBean cardBgBean) {
            Context context = this.binding.getRoot().getContext();
            Drawable drawable = ContextCompat.getDrawable(context, R.drawable.membership_shape_card_bg_checked);
            Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawable).setStroke(MembershipHomeFragment.INSTANCE.dip2px(context, 2.0f), ContextCompat.getColor(context, cardBgBean.getBgColor().getArgb()));
            Drawable drawable2 = ContextCompat.getDrawable(context, R.drawable.membership_shape_card_bg_round);
            Objects.requireNonNull(drawable2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawable2).setColor(ContextCompat.getColor(context, cardBgBean.getBgColor().getArgb()));
            this.binding.membershipColorCheckedBorder.setVisibility(cardBgBean.isChecked() ? 0 : 8);
            this.binding.membershipColorCheckedBorder.setBackgroundDrawable(drawable);
            this.binding.membershipCardColor.setBackgroundDrawable(drawable2);
            this.binding.membershipColorCheckedIcon.setVisibility(cardBgBean.isChecked() ? 0 : 8);
            this.binding.getRoot().setTag(cardBgBean);
            if (cardBgBean.isChecked()) {
                MembershipCardBgColorAdapter.this.lastSelectBean = cardBgBean;
            }
        }

        public final void setOnClickListener(@NotNull View.OnClickListener listener) {
            this.binding.getRoot().setOnClickListener(listener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MembershipCardBgColorAdapter membershipCardBgColorAdapter, View view) {
        Object tag = view.getTag();
        if (Intrinsics.areEqual(membershipCardBgColorAdapter.lastSelectBean, tag)) {
            return;
        }
        Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.member_card.bean.CardBgBean");
        CardBgBean cardBgBean = (CardBgBean) tag;
        cardBgBean.setChecked(true);
        int iIndexOf = membershipCardBgColorAdapter.getColors().indexOf(cardBgBean);
        if (iIndexOf != -1) {
            membershipCardBgColorAdapter.notifyItemChanged(iIndexOf);
        }
        CardBgBean cardBgBean2 = membershipCardBgColorAdapter.lastSelectBean;
        if (cardBgBean2 == null) {
            return;
        }
        cardBgBean2.setChecked(false);
        int iIndexOf2 = membershipCardBgColorAdapter.getColors().indexOf(cardBgBean2);
        if (iIndexOf2 != -1) {
            membershipCardBgColorAdapter.notifyItemChanged(iIndexOf2);
        }
    }

    @NotNull
    public final List<CardBgBean> getColors() {
        return this.colors;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.colors.size();
    }

    @NotNull
    public final MemberCardColorBg getSelectColorBg() {
        Object next;
        Iterator<T> it2 = this.colors.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((CardBgBean) next).isChecked());
        CardBgBean cardBgBean = (CardBgBean) next;
        MemberCardColorBg bgColor = cardBgBean != null ? cardBgBean.getBgColor() : null;
        return bgColor == null ? MemberCardColorBg.COLOR1 : bgColor;
    }

    public final void setColors(@NotNull List<CardBgBean> list) {
        this.colors.clear();
        this.colors.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CardBgViewHolder holder, int position) {
        holder.bindColor(this.colors.get(position));
        holder.setOnClickListener(new View.OnClickListener() { // from class: wy4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MembershipCardBgColorAdapter.b(this.a, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CardBgViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new CardBgViewHolder(MembershipCardBgColorBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
