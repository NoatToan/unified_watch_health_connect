package com.xiaomi.hm.health.cashier.webapi;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.nfc.base.PayResponse;
import com.xiaomi.hm.health.cashier.model.CashierPayChannel;
import com.xiaomi.hm.health.cashier.model.Order;
import com.xiaomi.hm.health.cashier.model.PaymentInfo;
import com.xiaomi.hm.health.cashier.model.PaymentOrder;
import com.xiaomi.hm.health.cashier.model.Product;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J(\u0010\u000b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0007\u0018\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/cashier/webapi/CashierWebApiImpl;", "Lcom/xiaomi/hm/health/cashier/webapi/CashierWebApi;", "Lcom/huami/http/HttpKit;", "", "data", "Lokhttp3/RequestBody;", "b", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/gson/Gson;", "gson", "value", "a", "(Lcom/google/gson/Gson;Ljava/lang/String;)Ljava/lang/Object;", "userId", "", "Lcom/xiaomi/hm/health/cashier/model/Product;", "productList", "name", "Lcom/huami/nfc/base/PayResponse;", "Lcom/xiaomi/hm/health/cashier/model/Order;", "generateOrder", "orderId", "payChannel", "Lcom/xiaomi/hm/health/cashier/model/PaymentInfo;", "getPaymentInfo", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CashierWebApiImpl implements CashierWebApi, HttpKit {
    private final /* synthetic */ <T> T a(Gson gson, String value) {
        Intrinsics.needClassReification();
        return (T) gson.fromJson(value, new TypeToken<T>() { // from class: com.xiaomi.hm.health.cashier.webapi.CashierWebApiImpl$fromJson$1
        }.getType());
    }

    private final RequestBody b(String data) {
        return RequestBody.create(MediaType.parse("application/json"), data);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.xiaomi.hm.health.cashier.webapi.CashierWebApi
    @NotNull
    public PayResponse<Order> generateOrder(@NotNull String userId, @NotNull List<Product> productList, @Nullable String name) {
        if (name == null) {
            name = "Description";
        }
        PaymentOrder paymentOrder = new PaymentOrder(new Order(productList, name, null, null, 12, null), null, 2, null);
        String str = "users/" + userId + "/orders";
        Gson gson = new Gson();
        Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(this, str, b(gson.toJson(paymentOrder)), null, null, 12, null);
        if (!responseHttpPost$default.isSuccessful()) {
            return new PayResponse<>(String.valueOf(responseHttpPost$default.code()), responseHttpPost$default.message(), null);
        }
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, ((PaymentOrder) gson.fromJson(ConverterKt.responseToJsonStr(responseHttpPost$default), new TypeToken<PaymentOrder>() { // from class: com.xiaomi.hm.health.cashier.webapi.CashierWebApiImpl$generateOrder$$inlined$fromJson$1
        }.getType())).getOrder(), 1, null);
    }

    @Override // com.xiaomi.hm.health.cashier.webapi.CashierWebApi
    @NotNull
    public PayResponse<PaymentInfo> getPaymentInfo(@NotNull String userId, @NotNull String orderId, @NotNull String payChannel) {
        String str = "users/" + userId + "/orders/" + orderId + "/payments";
        Gson gson = new Gson();
        Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(this, str, b(gson.toJson(new CashierPayChannel(payChannel))), null, null, 12, null);
        if (!responseHttpPost$default.isSuccessful()) {
            return new PayResponse<>(String.valueOf(responseHttpPost$default.code()), responseHttpPost$default.message(), null);
        }
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, (PaymentInfo) gson.fromJson(ConverterKt.responseToJsonStr(responseHttpPost$default), new TypeToken<PaymentInfo>() { // from class: com.xiaomi.hm.health.cashier.webapi.CashierWebApiImpl$getPaymentInfo$$inlined$fromJson$1
        }.getType()), 1, null);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
