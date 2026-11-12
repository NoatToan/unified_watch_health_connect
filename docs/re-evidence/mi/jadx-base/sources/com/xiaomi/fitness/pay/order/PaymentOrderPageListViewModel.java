package com.xiaomi.fitness.pay.order;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.pay.api.PaymentApiRequest;
import com.xiaomi.fitness.pay.export.data.response.OrderInfo;
import com.xiaomi.fitness.pay.export.data.response.OrderPageResponse;
import com.xiaomi.fitness.pay.order.PaymentOrderPageListViewModel;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListModel;", "<init>", "()V", "paymentApiRequest", "Lcom/xiaomi/fitness/pay/api/PaymentApiRequest;", "getPaymentApiRequest", "()Lcom/xiaomi/fitness/pay/api/PaymentApiRequest;", "setPaymentApiRequest", "(Lcom/xiaomi/fitness/pay/api/PaymentApiRequest;)V", "nextKey", "", "orderPageData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListViewModel$OrderPageData;", "getOrderPageData", "()Landroidx/lifecycle/MutableLiveData;", "orderPageData$delegate", "Lkotlin/Lazy;", "getOrderPageList", "", "refresh", "", "isCourseVip", "OrderPageData", "Companion", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentOrderPageListViewModel extends BaseViewModel<PaymentOrderPageListModel> {

    @NotNull
    private static final String TAG = "PaymentOrderPageListViewModel";

    @Nullable
    private String nextKey;

    /* JADX INFO: renamed from: orderPageData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy orderPageData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sph
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentOrderPageListViewModel.orderPageData_delegate$lambda$0();
        }
    });
    public PaymentApiRequest paymentApiRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.order.PaymentOrderPageListViewModel$getOrderPageList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.order.PaymentOrderPageListViewModel$getOrderPageList$1", f = "PaymentOrderPageListViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isCourseVip;
        final /* synthetic */ boolean $refresh;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, boolean z2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$isCourseVip = z;
            this.$refresh = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PaymentOrderPageListViewModel paymentOrderPageListViewModel, boolean z, OrderPageResponse orderPageResponse) {
            String tag = paymentOrderPageListViewModel.getTAG();
            List<OrderInfo> order_info_list = orderPageResponse.getOrder_info_list();
            Integer numValueOf = order_info_list != null ? Integer.valueOf(order_info_list.size()) : null;
            Logger.i(tag, "getOrderPageList success: " + numValueOf + " " + orderPageResponse.getNext_key());
            paymentOrderPageListViewModel.nextKey = orderPageResponse.getNext_key();
            MutableLiveData<OrderPageData> orderPageData = paymentOrderPageListViewModel.getOrderPageData();
            List<OrderInfo> order_info_list2 = orderPageResponse.getOrder_info_list();
            String str = paymentOrderPageListViewModel.nextKey;
            orderPageData.postValue(new OrderPageData(order_info_list2, !(str == null || str.length() == 0), z, StateData.Status.SUCCESS));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(PaymentOrderPageListViewModel paymentOrderPageListViewModel, boolean z, ApiException apiException) {
            Logger.i(paymentOrderPageListViewModel.getTAG(), "getOrderPageList fail: " + apiException);
            paymentOrderPageListViewModel.getOrderPageData().postValue(new OrderPageData(null, true, z, ((apiException.getCause() instanceof UnknownHostException) || (apiException.getCause() instanceof SocketTimeoutException)) ? StateData.Status.NO_NET : StateData.Status.ERROR));
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentOrderPageListViewModel.this.new AnonymousClass1(this.$isCourseVip, this.$refresh, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentApiRequest paymentApiRequest = PaymentOrderPageListViewModel.this.getPaymentApiRequest();
                String str = PaymentOrderPageListViewModel.this.nextKey;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                boolean z = this.$isCourseVip;
                String str3 = z ? "vip" : Feature.WATCHFACE;
                int i2 = z ? 3 : 1;
                final PaymentOrderPageListViewModel paymentOrderPageListViewModel = PaymentOrderPageListViewModel.this;
                final boolean z2 = this.$refresh;
                Function1 function1 = new Function1() { // from class: com.xiaomi.fitness.pay.order.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return PaymentOrderPageListViewModel.AnonymousClass1.invokeSuspend$lambda$0(paymentOrderPageListViewModel, z2, (OrderPageResponse) obj2);
                    }
                };
                final PaymentOrderPageListViewModel paymentOrderPageListViewModel2 = PaymentOrderPageListViewModel.this;
                final boolean z3 = this.$refresh;
                Function1 function2 = new Function1() { // from class: com.xiaomi.fitness.pay.order.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return PaymentOrderPageListViewModel.AnonymousClass1.invokeSuspend$lambda$1(paymentOrderPageListViewModel2, z3, (ApiException) obj2);
                    }
                };
                this.label = 1;
                if (paymentApiRequest.getOrderPageList((2 & 1) != 0 ? "" : str2, (2 & 2) != 0 ? 50 : 0, (2 & 4) != 0 ? Feature.WATCHFACE : str3, (2 & 8) != 0 ? 1 : i2, function1, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ void getOrderPageList$default(PaymentOrderPageListViewModel paymentOrderPageListViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        paymentOrderPageListViewModel.getOrderPageList(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData orderPageData_delegate$lambda$0() {
        return new MutableLiveData();
    }

    @NotNull
    public final MutableLiveData<OrderPageData> getOrderPageData() {
        return (MutableLiveData) this.orderPageData.getValue();
    }

    public final void getOrderPageList(boolean refresh, boolean isCourseVip) {
        if (refresh) {
            this.nextKey = "";
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(isCourseVip, refresh, null), 3, null);
    }

    @NotNull
    public final PaymentApiRequest getPaymentApiRequest() {
        PaymentApiRequest paymentApiRequest = this.paymentApiRequest;
        if (paymentApiRequest != null) {
            return paymentApiRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentApiRequest");
        return null;
    }

    public final void setPaymentApiRequest(@NotNull PaymentApiRequest paymentApiRequest) {
        Intrinsics.checkNotNullParameter(paymentApiRequest, "<set-?>");
        this.paymentApiRequest = paymentApiRequest;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListViewModel$OrderPageData;", "", "list", "", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", "hasNext", "", "refresh", "status", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData$Status;", "<init>", "(Ljava/util/List;ZZLcom/xiaomi/fitness/baseui/recyclerview/StateData$Status;)V", "getList", "()Ljava/util/List;", "getHasNext", "()Z", "getRefresh", "getStatus", "()Lcom/xiaomi/fitness/baseui/recyclerview/StateData$Status;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderPageData {
        private final boolean hasNext;

        @Nullable
        private final List<OrderInfo> list;
        private final boolean refresh;

        @NotNull
        private final StateData.Status status;

        public OrderPageData(@Nullable List<OrderInfo> list, boolean z, boolean z2, @NotNull StateData.Status status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.list = list;
            this.hasNext = z;
            this.refresh = z2;
            this.status = status;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OrderPageData copy$default(OrderPageData orderPageData, List list, boolean z, boolean z2, StateData.Status status, int i, Object obj) {
            if ((i & 1) != 0) {
                list = orderPageData.list;
            }
            if ((i & 2) != 0) {
                z = orderPageData.hasNext;
            }
            if ((i & 4) != 0) {
                z2 = orderPageData.refresh;
            }
            if ((i & 8) != 0) {
                status = orderPageData.status;
            }
            return orderPageData.copy(list, z, z2, status);
        }

        @Nullable
        public final List<OrderInfo> component1() {
            return this.list;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getHasNext() {
            return this.hasNext;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getRefresh() {
            return this.refresh;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StateData.Status getStatus() {
            return this.status;
        }

        @NotNull
        public final OrderPageData copy(@Nullable List<OrderInfo> list, boolean hasNext, boolean refresh, @NotNull StateData.Status status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new OrderPageData(list, hasNext, refresh, status);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderPageData)) {
                return false;
            }
            OrderPageData orderPageData = (OrderPageData) other;
            return Intrinsics.areEqual(this.list, orderPageData.list) && this.hasNext == orderPageData.hasNext && this.refresh == orderPageData.refresh && this.status == orderPageData.status;
        }

        public final boolean getHasNext() {
            return this.hasNext;
        }

        @Nullable
        public final List<OrderInfo> getList() {
            return this.list;
        }

        public final boolean getRefresh() {
            return this.refresh;
        }

        @NotNull
        public final StateData.Status getStatus() {
            return this.status;
        }

        public int hashCode() {
            List<OrderInfo> list = this.list;
            return ((((((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.hasNext)) * 31) + Boolean.hashCode(this.refresh)) * 31) + this.status.hashCode();
        }

        @NotNull
        public String toString() {
            return "OrderPageData(list=" + this.list + ", hasNext=" + this.hasNext + ", refresh=" + this.refresh + ", status=" + this.status + ")";
        }

        public /* synthetic */ OrderPageData(List list, boolean z, boolean z2, StateData.Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, z, (i & 4) != 0 ? false : z2, status);
        }
    }
}
