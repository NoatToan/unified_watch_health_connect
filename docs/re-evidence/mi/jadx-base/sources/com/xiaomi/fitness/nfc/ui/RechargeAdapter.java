package com.xiaomi.fitness.nfc.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.sesdk.OrderData;
import com.xiaomi.fitness.nfc.ui.RechargeAdapter;
import com.xiaomi.fitness.nfc.widget.RechargeFeeItemView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u001c\u0010\u0018\u001a\u00020\n2\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/RechargeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/nfc/ui/RechargeAdapter$RechargeViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/miui/tsmclient/sesdk/OrderData$Fee;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "defaultFee", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "setDefaultFee", "RechargeViewHolder", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RechargeAdapter extends RecyclerView.Adapter<RechargeViewHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<OrderData.Fee> dataList;

    @Nullable
    private OrderData.Fee defaultFee;

    @Nullable
    private Function1<? super OrderData.Fee, Unit> listener;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/RechargeAdapter$RechargeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/miui/tsmclient/sesdk/OrderData$Fee;", "fee", "", "bind", "(Lcom/miui/tsmclient/sesdk/OrderData$Fee;)V", "Lcom/xiaomi/fitness/nfc/widget/RechargeFeeItemView;", "view", "Lcom/xiaomi/fitness/nfc/widget/RechargeFeeItemView;", "getView", "()Lcom/xiaomi/fitness/nfc/widget/RechargeFeeItemView;", "setView", "(Lcom/xiaomi/fitness/nfc/widget/RechargeFeeItemView;)V", "<init>", "(Lcom/xiaomi/fitness/nfc/ui/RechargeAdapter;Lcom/xiaomi/fitness/nfc/widget/RechargeFeeItemView;)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class RechargeViewHolder extends RecyclerView.d0 {
        final /* synthetic */ RechargeAdapter this$0;

        @NotNull
        private RechargeFeeItemView view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RechargeViewHolder(@NotNull RechargeAdapter rechargeAdapter, RechargeFeeItemView view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = rechargeAdapter;
            this.view = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(RechargeAdapter this$0, OrderData.Fee fee, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(fee, "$fee");
            Function1<OrderData.Fee, Unit> listener = this$0.getListener();
            if (listener != null) {
                listener.invoke2(fee);
            }
        }

        public final void bind(@NotNull final OrderData.Fee fee) {
            Intrinsics.checkNotNullParameter(fee, "fee");
            this.view.b(fee, Intrinsics.areEqual(fee, this.this$0.defaultFee));
            RechargeFeeItemView rechargeFeeItemView = this.view;
            final RechargeAdapter rechargeAdapter = this.this$0;
            rechargeFeeItemView.setOnClickListener(new View.OnClickListener() { // from class: zhj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RechargeAdapter.RechargeViewHolder.bind$lambda$0(rechargeAdapter, fee, view);
                }
            });
        }

        @NotNull
        public final RechargeFeeItemView getView() {
            return this.view;
        }

        public final void setView(@NotNull RechargeFeeItemView rechargeFeeItemView) {
            Intrinsics.checkNotNullParameter(rechargeFeeItemView, "<set-?>");
            this.view = rechargeFeeItemView;
        }
    }

    public /* synthetic */ RechargeAdapter(Context context, List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i & 4) != 0 ? null : function1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Nullable
    public final Function1<OrderData.Fee, Unit> getListener() {
        return this.listener;
    }

    public final void setDefaultFee(@NotNull OrderData.Fee defaultFee) {
        Intrinsics.checkNotNullParameter(defaultFee, "defaultFee");
        this.defaultFee = defaultFee;
    }

    public final void setListener(@Nullable Function1<? super OrderData.Fee, Unit> function1) {
        this.listener = function1;
    }

    public RechargeAdapter(@NotNull Context context, @NotNull List<OrderData.Fee> dataList, @Nullable Function1<? super OrderData.Fee, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
        this.listener = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RechargeViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.dataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RechargeViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new RechargeViewHolder(this, new RechargeFeeItemView(this.context));
    }
}
