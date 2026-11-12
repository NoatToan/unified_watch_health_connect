package com.xiaomi.hm.health.cashier.webapi;

import com.huami.nfc.base.PayResponse;
import com.xiaomi.hm.health.cashier.model.Order;
import com.xiaomi.hm.health.cashier.model.PaymentInfo;
import com.xiaomi.hm.health.cashier.model.Product;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/cashier/webapi/CashierWebApi;", "", "", "userId", "", "Lcom/xiaomi/hm/health/cashier/model/Product;", "productList", "name", "Lcom/huami/nfc/base/PayResponse;", "Lcom/xiaomi/hm/health/cashier/model/Order;", "generateOrder", "orderId", "payChannel", "Lcom/xiaomi/hm/health/cashier/model/PaymentInfo;", "getPaymentInfo", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface CashierWebApi {
    @NotNull
    PayResponse<Order> generateOrder(@NotNull String userId, @NotNull List<Product> productList, @Nullable String name);

    @NotNull
    PayResponse<PaymentInfo> getPaymentInfo(@NotNull String userId, @NotNull String orderId, @NotNull String payChannel);
}
