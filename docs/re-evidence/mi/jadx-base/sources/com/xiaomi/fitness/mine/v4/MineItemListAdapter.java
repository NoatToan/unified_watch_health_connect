package com.xiaomi.fitness.mine.v4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.mine.v4.MineItemListAdapter;
import defpackage.nuf;
import defpackage.qoi;
import defpackage.x2g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u001f\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000fj\u0002`\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/mine/v4/MineItemListAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/mine/v4/MineItemListModel$MineItem;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/mine/v4/ItemClickCallBack;", "itemOnClickListener", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ItemViewHolder", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MineItemListAdapter extends p<MineItemListModel.MineItem, RecyclerView.d0> {

    @NotNull
    private final Function1<MineItemListModel.MineItem, Unit> itemOnClickListener;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/mine/v4/MineItemListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/mine/v4/MineItemListModel$MineItem;", "entity", "", "bind", "(Lcom/xiaomi/fitness/mine/v4/MineItemListModel$MineItem;)V", "Lx2g;", "binding", "Lx2g;", "<init>", "(Lcom/xiaomi/fitness/mine/v4/MineItemListAdapter;Lx2g;)V", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nMineItemListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineItemListAdapter.kt\ncom/xiaomi/fitness/mine/v4/MineItemListAdapter$ItemViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
    public final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final x2g binding;
        final /* synthetic */ MineItemListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull MineItemListAdapter mineItemListAdapter, x2g binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = mineItemListAdapter;
            this.binding = binding;
            try {
                this.itemView.setBackgroundResource(qoi.common_card_bg_white);
                nuf.f(this.itemView);
            } catch (Exception e) {
                Logger.i("MineItemListAdapter", "applyPressedTintAndScaleStyle error: " + e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1(MineItemListAdapter this$0, MineItemListModel.MineItem entity, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(entity, "$entity");
            this$0.itemOnClickListener.invoke2(entity);
        }

        public final void bind(@NotNull final MineItemListModel.MineItem entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            this.binding.A.setTitle(entity.getTitle());
            this.binding.A.setIcon(entity.getIcon());
            this.binding.A.showMore(entity.getShowMode());
            Integer remindDotColor = entity.getRemindDotColor();
            if (remindDotColor != null) {
                this.binding.A.setRemindDotColor(remindDotColor.intValue());
            }
            String sunTitle = entity.getSunTitle();
            if (sunTitle != null && sunTitle.length() != 0) {
                this.binding.A.setSubtitle(entity.getSunTitle());
            }
            String remindText = entity.getRemindText();
            if (remindText != null && remindText.length() != 0) {
                this.binding.A.setRemindText(entity.getRemindText());
            }
            String rightText = entity.getRightText();
            if (rightText != null && rightText.length() != 0) {
                this.binding.A.setRightText(entity.getRightText());
            }
            View view = this.itemView;
            final MineItemListAdapter mineItemListAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: u1g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MineItemListAdapter.ItemViewHolder.bind$lambda$1(mineItemListAdapter, entity, view2);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MineItemListAdapter(@NotNull Function1<? super MineItemListModel.MineItem, Unit> itemOnClickListener) {
        super(new ItemDiffCallback());
        Intrinsics.checkNotNullParameter(itemOnClickListener, "itemOnClickListener");
        this.itemOnClickListener = itemOnClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MineItemListModel.MineItem mineItem = getCurrentList().get(position);
        if (holder instanceof ItemViewHolder) {
            Intrinsics.checkNotNull(mineItem);
            ((ItemViewHolder) holder).bind(mineItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        x2g x2gVarA0 = x2g.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(x2gVarA0, "inflate(...)");
        return new ItemViewHolder(this, x2gVarA0);
    }
}
