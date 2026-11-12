package com.xiaomi.fitness.pay.api;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.pay.export.data.response.CheckPayResponse;
import com.xiaomi.fitness.pay.export.data.response.OrderInfoResponse;
import com.xiaomi.fitness.pay.export.data.response.OrderPageResponse;
import com.xiaomi.fitness.pay.export.data.response.PayChannelResponse;
import com.xiaomi.fitness.pay.export.data.response.SyncAuthorizationResponse;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://watch.iot.mi.com/", path = "ops/v1/mall/")
@Secret(encryptResponse = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/pay/api/PaymentApiService;", "", "getPayChannel", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/pay/export/data/response/PayChannelResponse;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createOrder", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfoResponse;", "checkPay", "Lcom/xiaomi/fitness/pay/export/data/response/CheckPayResponse;", "getOrderPageList", "Lcom/xiaomi/fitness/pay/export/data/response/OrderPageResponse;", "getOrderInfo", "syncAuthorization", "Lcom/xiaomi/fitness/pay/export/data/response/SyncAuthorizationResponse;", "Companion", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PaymentApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String PAYMENT_HOST = "https://watch.iot.mi.com/";

    @NotNull
    public static final String PAYMENT_PATH = "ops/v1/mall/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/pay/api/PaymentApiService$Companion;", "", "<init>", "()V", "PAYMENT_HOST", "", "PAYMENT_PATH", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String PAYMENT_HOST = "https://watch.iot.mi.com/";

        @NotNull
        public static final String PAYMENT_PATH = "ops/v1/mall/";

        private Companion() {
        }
    }

    @Nullable
    @uua("order/pay/check")
    Object checkPay(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<CheckPayResponse>> continuation);

    @u0a
    @ngh("order/create")
    @Nullable
    Object createOrder(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<OrderInfoResponse>> continuation);

    @Nullable
    @uua("order/info")
    Object getOrderInfo(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<OrderInfoResponse>> continuation);

    @Nullable
    @uua("order/pagelist")
    Object getOrderPageList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<OrderPageResponse>> continuation);

    @Nullable
    @uua("pay/channel")
    Object getPayChannel(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<PayChannelResponse>> continuation);

    @u0a
    @ngh("order/sync")
    @Nullable
    Object syncAuthorization(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SyncAuthorizationResponse>> continuation);
}
