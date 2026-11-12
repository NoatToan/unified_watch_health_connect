package com.huami.member_card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.member_card.MembershipCardListAdapter;
import com.huami.member_card.bean.MemberCardColorBg;
import com.huami.member_card.databinding.MembershipListItemBinding;
import com.huami.member_card.move.OnStartDragListener;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 >2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002>?B\u0007¢\u0006\u0004\b<\u0010=J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010R*\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR6\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00106\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R&\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u000507j\b\u0012\u0004\u0012\u00020\u0005`88\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006@"}, d2 = {"Lcom/huami/member_card/MembershipCardListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/member_card/MembershipCardListAdapter$MembershipCardItem;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "srcPosition", "targetPosition", "swapItem", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", LargeWatchSkinActivity.KEY_BEAN, "removeItem", "", "value", "a", "Z", "isEdit", "()Z", "setEdit", "(Z)V", "", "b", "Ljava/util/List;", "getCards", "()Ljava/util/List;", "setCards", "(Ljava/util/List;)V", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, "Lcom/huami/member_card/move/OnStartDragListener;", "c", "Lcom/huami/member_card/move/OnStartDragListener;", "getMDragStartListener", "()Lcom/huami/member_card/move/OnStartDragListener;", "setMDragStartListener", "(Lcom/huami/member_card/move/OnStartDragListener;)V", "mDragStartListener", "Landroid/view/View$OnClickListener;", GoogleApiAvailabilityLight.a, "Landroid/view/View$OnClickListener;", "getListener", "()Landroid/view/View$OnClickListener;", "setListener", "(Landroid/view/View$OnClickListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "e", "getRemoveClickListener", "setRemoveClickListener", "removeClickListener", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "f", "Ljava/util/ArrayList;", "bgDrawable", "<init>", "()V", "Companion", "MembershipCardItem", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final class MembershipCardListAdapter extends RecyclerView.Adapter<MembershipCardItem> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isEdit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OnStartDragListener mDragStartListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener listener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener removeClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<MemberCard> cards = new ArrayList();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Integer> bgDrawable = CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(R.drawable.ic_member_card_bg1), Integer.valueOf(R.drawable.ic_member_card_bg2), Integer.valueOf(R.drawable.ic_member_card_bg3));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/huami/member_card/MembershipCardListAdapter$Companion;", "", "", "number", "formatNumber", "<init>", "()V", "member_card_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String formatNumber(@NotNull String number) {
            int length = number.length();
            if (length <= 10) {
                return new Regex("(\\S{4})(?=\\S)").replace(number, "$1 ");
            }
            return number.substring(0, 4) + " **** " + number.substring(length - 4, length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\tR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/member_card/MembershipCardListAdapter$MembershipCardItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "membershipCard", "", "bindData", "Lcom/huami/member_card/move/OnStartDragListener;", "l", "setDragLongClick", "Landroid/view/View$OnClickListener;", "setRemoveClick", "setItemViewClick", "Lcom/huami/member_card/databinding/MembershipListItemBinding;", "a", "Lcom/huami/member_card/databinding/MembershipListItemBinding;", "binding", "<init>", "(Lcom/huami/member_card/MembershipCardListAdapter;Lcom/huami/member_card/databinding/MembershipListItemBinding;)V", "member_card_release"}, k = 1, mv = {1, 5, 1})
    public final class MembershipCardItem extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final MembershipListItemBinding binding;

        public MembershipCardItem(MembershipListItemBinding membershipListItemBinding) {
            super(membershipListItemBinding.getRoot());
            this.binding = membershipListItemBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean b(OnStartDragListener onStartDragListener, MembershipCardItem membershipCardItem, View view) {
            if (onStartDragListener == null) {
                return false;
            }
            onStartDragListener.onStartDrag(membershipCardItem);
            Unit unit = Unit.INSTANCE;
            return true;
        }

        public final void bindData(@NotNull MemberCard membershipCard) {
            this.binding.getRoot().setTag(membershipCard);
            this.binding.membershipRemove.setTag(membershipCard);
            this.binding.membershipCardName.setText(membershipCard.getNameID());
            this.binding.membershipCardNumber.setText(MembershipCardListAdapter.INSTANCE.formatNumber(membershipCard.getNumber()));
            this.binding.membershipRemove.setVisibility(MembershipCardListAdapter.this.getIsEdit() ? 0 : 8);
            this.binding.membershipCardDrag.setVisibility(MembershipCardListAdapter.this.getIsEdit() ? 0 : 8);
            this.binding.membershipArrow.setVisibility(MembershipCardListAdapter.this.getIsEdit() ? 8 : 0);
            Drawable drawable = ContextCompat.getDrawable(this.binding.getRoot().getContext(), R.drawable.membership_shape_list_item);
            Drawable drawable2 = ContextCompat.getDrawable(this.binding.getRoot().getContext(), ((Number) MembershipCardListAdapter.this.bgDrawable.get(membershipCard.getColor() % 3)).intValue());
            Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            Context context = this.binding.getRoot().getContext();
            MemberCardColorBg colorValue = MemberCardColorBg.INSTANCE.parseColorValue(membershipCard.getColor());
            Integer numValueOf = colorValue == null ? null : Integer.valueOf(colorValue.getArgb());
            gradientDrawable.setColor(ContextCompat.getColor(context, numValueOf == null ? MemberCardColorBg.COLOR1.getArgb() : numValueOf.intValue()));
            this.binding.getRoot().setBackground(new LayerDrawable(new Drawable[]{drawable, drawable2}));
        }

        public final void setDragLongClick(@Nullable final OnStartDragListener l) {
            this.binding.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: xy4
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return MembershipCardListAdapter.MembershipCardItem.b(l, this, view);
                }
            });
        }

        public final void setItemViewClick(@Nullable View.OnClickListener l) {
            this.binding.getRoot().setOnClickListener(l);
        }

        public final void setRemoveClick(@Nullable View.OnClickListener l) {
            this.binding.membershipRemove.setOnClickListener(l);
        }
    }

    @NotNull
    public final List<MemberCard> getCards() {
        return this.cards;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.cards.size();
    }

    @Nullable
    public final View.OnClickListener getListener() {
        return this.listener;
    }

    @Nullable
    public final OnStartDragListener getMDragStartListener() {
        return this.mDragStartListener;
    }

    @Nullable
    public final View.OnClickListener getRemoveClickListener() {
        return this.removeClickListener;
    }

    /* JADX INFO: renamed from: isEdit, reason: from getter */
    public final boolean getIsEdit() {
        return this.isEdit;
    }

    public final void removeItem(@NotNull MemberCard bean) {
        int iIndexOf = this.cards.indexOf(bean);
        if (iIndexOf != -1) {
            this.cards.remove(iIndexOf);
            notifyItemRemoved(iIndexOf);
        }
    }

    public final void setCards(@NotNull List<MemberCard> list) {
        this.cards.clear();
        this.cards.addAll(list);
    }

    public final void setEdit(boolean z) {
        this.isEdit = z;
        notifyDataSetChanged();
    }

    public final void setListener(@Nullable View.OnClickListener onClickListener) {
        this.listener = onClickListener;
    }

    public final void setMDragStartListener(@Nullable OnStartDragListener onStartDragListener) {
        this.mDragStartListener = onStartDragListener;
    }

    public final void setRemoveClickListener(@Nullable View.OnClickListener onClickListener) {
        this.removeClickListener = onClickListener;
    }

    public final void swapItem(int srcPosition, int targetPosition) {
        if (srcPosition >= this.cards.size() || targetPosition >= this.cards.size()) {
            return;
        }
        Collections.swap(this.cards, srcPosition, targetPosition);
        notifyItemMoved(srcPosition, targetPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MembershipCardItem holder, int position) {
        holder.bindData(this.cards.get(position));
        holder.setDragLongClick(this.isEdit ? this.mDragStartListener : null);
        holder.setRemoveClick(this.isEdit ? this.removeClickListener : null);
        holder.setItemViewClick(this.listener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MembershipCardItem onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new MembershipCardItem(MembershipListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
