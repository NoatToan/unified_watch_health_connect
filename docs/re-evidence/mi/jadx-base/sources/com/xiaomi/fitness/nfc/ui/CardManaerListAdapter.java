package com.xiaomi.fitness.nfc.ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.nfc.bean.CardManagerBean;
import com.xiaomi.fitness.nfc.widget.CardListView;
import defpackage.ehe;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B%\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CardManaerListAdapter;", "Lehe;", "Lcom/xiaomi/fitness/nfc/bean/CardManagerBean;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$d0;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/app/Activity;", "context", "Landroid/app/Activity;", "getContext", "()Landroid/app/Activity;", "setContext", "(Landroid/app/Activity;)V", "", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/nfc/widget/CardListView$CardListViewListener;", "cardListViewListener", "Lcom/xiaomi/fitness/nfc/widget/CardListView$CardListViewListener;", "getCardListViewListener", "()Lcom/xiaomi/fitness/nfc/widget/CardListView$CardListViewListener;", "setCardListViewListener", "(Lcom/xiaomi/fitness/nfc/widget/CardListView$CardListViewListener;)V", "<init>", "(Landroid/app/Activity;Ljava/util/List;Lcom/xiaomi/fitness/nfc/widget/CardListView$CardListViewListener;)V", "ItemViewHolder", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CardManaerListAdapter extends ehe<CardManagerBean> {

    @NotNull
    private CardListView.CardListViewListener cardListViewListener;

    @NotNull
    private Activity context;

    @NotNull
    private List<CardManagerBean> dataList;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CardManaerListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ItemViewHolder extends RecyclerView.d0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardManaerListAdapter(@NotNull Activity context, @NotNull List<CardManagerBean> dataList, @NotNull CardListView.CardListViewListener cardListViewListener) {
        super(dataList);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(cardListViewListener, "cardListViewListener");
        this.context = context;
        this.dataList = dataList;
        this.cardListViewListener = cardListViewListener;
    }

    @NotNull
    public final CardListView.CardListViewListener getCardListViewListener() {
        return this.cardListViewListener;
    }

    @NotNull
    public final Activity getContext() {
        return this.context;
    }

    @NotNull
    public final List<CardManagerBean> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.xiaomi.fitness.nfc.widget.CardListView");
        CardListView cardListView = (CardListView) view;
        CardManagerBean cardManagerBean = this.dataList.get(position);
        cardListView.init(cardManagerBean.getCardCategory());
        cardListView.setCardList(cardManagerBean.getList());
        cardListView.setListener(this.cardListViewListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ItemViewHolder(new CardListView(this.context, null, 0, 6, null));
    }

    public final void setCardListViewListener(@NotNull CardListView.CardListViewListener cardListViewListener) {
        Intrinsics.checkNotNullParameter(cardListViewListener, "<set-?>");
        this.cardListViewListener = cardListViewListener;
    }

    public final void setContext(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<set-?>");
        this.context = activity;
    }

    public final void setDataList(@NotNull List<CardManagerBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }
}
