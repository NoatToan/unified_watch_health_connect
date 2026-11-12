package com.huami.pay.cashier;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"Lcom/huami/pay/cashier/PayChannelAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/huami/pay/cashier/PayItem;", "Lcom/huami/pay/cashier/PayChannelViewHolder;", "payItem", "", "a", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "<init>", "()V", "pay-cashier_release"}, k = 1, mv = {1, 5, 1})
public final class PayChannelAdapter extends ListAdapter<PayItem, PayChannelViewHolder> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/pay/cashier/PayItem;", "payItem", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayItem, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull PayItem payItem) {
            PayChannelAdapter.this.a(payItem);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayItem payItem) {
            a(payItem);
            return Unit.INSTANCE;
        }
    }

    public PayChannelAdapter() {
        super(new com.huami.pay.cashier.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(PayItem payItem) {
        boolean select = payItem.getSelect();
        if (select) {
            return;
        }
        List<PayItem> currentList = getCurrentList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(currentList, 10));
        for (PayItem payItem2 : currentList) {
            arrayList.add(new PayItem(payItem2.getPayChannel(), payItem2.getPayChannel() == payItem.getPayChannel() ? !select : select));
        }
        submitList(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PayChannelViewHolder holder, int position) {
        holder.bind(getCurrentList().get(position), new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PayChannelViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new PayChannelViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.pay_cashier_item, parent, false));
    }
}
