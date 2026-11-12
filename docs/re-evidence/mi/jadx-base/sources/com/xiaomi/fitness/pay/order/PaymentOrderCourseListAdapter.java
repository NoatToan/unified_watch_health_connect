package com.xiaomi.fitness.pay.order;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.pay.export.data.response.OrderInfo;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import com.xiaomi.fitness.pay.order.PaymentOrderCourseListAdapter;
import defpackage.hnh;
import defpackage.r0j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0019\u001aB=\u0012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000fj\u0002`\u0010\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u0013j\u0002`\u0014¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\n\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/pay/order/PaymentOrderCourseListAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", "Lcom/xiaomi/fitness/pay/order/PaymentOrderCourseListAdapter$PaymentOrderPageListHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/pay/order/PaymentOrderCourseListAdapter$PaymentOrderPageListHolder;", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/pay/order/PaymentOrderCourseListAdapter$PaymentOrderPageListHolder;I)V", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/pay/order/OnOrderItemClickListener;", "onOrderItemClickListener", "Lkotlin/jvm/functions/Function2;", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/pay/order/OnOrderPayListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "DiffCallback", "PaymentOrderPageListHolder", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PaymentOrderCourseListAdapter extends p<OrderInfo, PaymentOrderPageListHolder> {

    @NotNull
    private final Function1<OrderInfo, Unit> listener;

    @NotNull
    private final Function2<Integer, OrderInfo, Unit> onOrderItemClickListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/pay/order/PaymentOrderCourseListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;)Z", "areContentsTheSame", "<init>", "()V", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<OrderInfo> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull OrderInfo oldItem, @NotNull OrderInfo newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull OrderInfo oldItem, @NotNull OrderInfo newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getOrder_id(), newItem.getOrder_id());
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/pay/order/PaymentOrderCourseListAdapter$PaymentOrderPageListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", TSMAuthContants.PARAM_ORDER_INFO, "", "bindData", "(Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;)V", "onClick", "Lhnh;", "binding", "Lhnh;", "<init>", "(Lcom/xiaomi/fitness/pay/order/PaymentOrderCourseListAdapter;Lhnh;)V", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class PaymentOrderPageListHolder extends RecyclerView.d0 {

        @NotNull
        private final hnh binding;
        final /* synthetic */ PaymentOrderCourseListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentOrderPageListHolder(@NotNull PaymentOrderCourseListAdapter paymentOrderCourseListAdapter, hnh binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = paymentOrderCourseListAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$0(PaymentOrderCourseListAdapter this$0, PaymentOrderPageListHolder this$1, OrderInfo orderInfo, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(orderInfo, "$orderInfo");
            this$0.onOrderItemClickListener.invoke(Integer.valueOf(this$1.getBindingAdapterPosition()), orderInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$1(PaymentOrderCourseListAdapter this$0, OrderInfo orderInfo, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(orderInfo, "$orderInfo");
            this$0.listener.invoke2(orderInfo);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:27:0x00ec  */
        public final void bindData(@NotNull OrderInfo orderInfo) {
            Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
            this.binding.A.setText(TimeDateUtil.getDateYYYYMMDDHHmmssLocalFormat(orderInfo.getCreate_time()));
            switch (orderInfo.getOrder_status()) {
                case "RefundSuccess":
                    TextView orderStatus = this.binding.F;
                    Intrinsics.checkNotNullExpressionValue(orderStatus, "orderStatus");
                    ViewExtKt.visible(orderStatus);
                    TextView orderPay = this.binding.E;
                    Intrinsics.checkNotNullExpressionValue(orderPay, "orderPay");
                    ViewExtKt.gone(orderPay);
                    this.binding.F.setText(r0j.H);
                    break;
                case "RefundFail":
                    TextView orderStatus2 = this.binding.F;
                    Intrinsics.checkNotNullExpressionValue(orderStatus2, "orderStatus");
                    ViewExtKt.visible(orderStatus2);
                    TextView orderPay2 = this.binding.E;
                    Intrinsics.checkNotNullExpressionValue(orderPay2, "orderPay");
                    ViewExtKt.gone(orderPay2);
                    this.binding.F.setText(r0j.G);
                    break;
                case "PaymentSuccess":
                    TextView orderStatus3 = this.binding.F;
                    Intrinsics.checkNotNullExpressionValue(orderStatus3, "orderStatus");
                    ViewExtKt.visible(orderStatus3);
                    TextView orderPay3 = this.binding.E;
                    Intrinsics.checkNotNullExpressionValue(orderPay3, "orderPay");
                    ViewExtKt.gone(orderPay3);
                    this.binding.F.setText(r0j.F);
                    break;
                case "InPayment":
                    TextView orderStatus4 = this.binding.F;
                    Intrinsics.checkNotNullExpressionValue(orderStatus4, "orderStatus");
                    ViewExtKt.gone(orderStatus4);
                    TextView orderPay4 = this.binding.E;
                    Intrinsics.checkNotNullExpressionValue(orderPay4, "orderPay");
                    ViewExtKt.visible(orderPay4);
                    break;
                case "WaitRefund":
                    TextView orderStatus5 = this.binding.F;
                    Intrinsics.checkNotNullExpressionValue(orderStatus5, "orderStatus");
                    ViewExtKt.visible(orderStatus5);
                    TextView orderPay5 = this.binding.E;
                    Intrinsics.checkNotNullExpressionValue(orderPay5, "orderPay");
                    ViewExtKt.gone(orderPay5);
                    this.binding.F.setText(r0j.I);
                    break;
                case "Cancel":
                    TextView orderStatus6 = this.binding.F;
                    Intrinsics.checkNotNullExpressionValue(orderStatus6, "orderStatus");
                    ViewExtKt.visible(orderStatus6);
                    TextView orderPay6 = this.binding.E;
                    Intrinsics.checkNotNullExpressionValue(orderPay6, "orderPay");
                    ViewExtKt.gone(orderPay6);
                    this.binding.F.setText(r0j.E);
                    break;
                default:
                    TextView orderStatus7 = this.binding.F;
                    Intrinsics.checkNotNullExpressionValue(orderStatus7, "orderStatus");
                    ViewExtKt.visible(orderStatus7);
                    TextView orderPay7 = this.binding.E;
                    Intrinsics.checkNotNullExpressionValue(orderPay7, "orderPay");
                    ViewExtKt.gone(orderPay7);
                    this.binding.F.setText(orderInfo.getOrder_status());
                    break;
            }
            SkuObject skuObject = orderInfo.getSku_list().get(0);
            this.binding.C.setText(skuObject.getSku_name());
            this.binding.D.setText(ApplicationExtKt.getApplication().getString(r0j.D, orderInfo.getOrder_id()));
            this.binding.G.setText(ApplicationExtKt.getApplication().getString(r0j.d, Float.valueOf(((Intrinsics.areEqual(orderInfo.getOrder_status(), OrderStatus.PAYMENT_SUCCESS) || Intrinsics.areEqual(orderInfo.getOrder_status(), OrderStatus.REFUND_SUCCESS)) ? orderInfo.getPay_fee() : skuObject.getPrice()) / 100.0f)));
        }

        public final void onClick(@NotNull final OrderInfo orderInfo) {
            Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
            View root = this.binding.getRoot();
            final PaymentOrderCourseListAdapter paymentOrderCourseListAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: gph
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentOrderCourseListAdapter.PaymentOrderPageListHolder.onClick$lambda$0(paymentOrderCourseListAdapter, this, orderInfo, view);
                }
            });
            TextView textView = this.binding.E;
            final PaymentOrderCourseListAdapter paymentOrderCourseListAdapter2 = this.this$0;
            textView.setOnClickListener(new View.OnClickListener() { // from class: hph
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentOrderCourseListAdapter.PaymentOrderPageListHolder.onClick$lambda$1(paymentOrderCourseListAdapter2, orderInfo, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOrderCourseListAdapter(@NotNull Function2<? super Integer, ? super OrderInfo, Unit> onOrderItemClickListener, @NotNull Function1<? super OrderInfo, Unit> listener) {
        super(new DiffCallback());
        Intrinsics.checkNotNullParameter(onOrderItemClickListener, "onOrderItemClickListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onOrderItemClickListener = onOrderItemClickListener;
        this.listener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PaymentOrderPageListHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        OrderInfo item = getItem(position);
        Intrinsics.checkNotNull(item);
        holder.bindData(item);
        holder.onClick(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PaymentOrderPageListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        hnh hnhVarA0 = hnh.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(hnhVarA0, "inflate(...)");
        return new PaymentOrderPageListHolder(this, hnhVarA0);
    }
}
