package com.huami.nfc.bus.service;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.OrderEntity;
import com.huami.nfc.bus.TransAmountEntity;
import com.huami.nfc.bus.entities.CardNo;
import com.huami.nfc.bus.entities.SiteInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0003H'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'¨\u0006\u001a"}, d2 = {"Lcom/huami/nfc/bus/service/SnowballService;", "", "", "", "params", "Lretrofit2/Call;", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/TransAmountEntity;", "getTransactionAmount", "Lokhttp3/RequestBody;", "body", "Lcom/huami/nfc/bus/OrderEntity;", "generateOrder", "Lokhttp3/ResponseBody;", "getOrders", "id", "getOrderInfo", "", FirebaseAnalytics.Event.REFUND, "eseFormat", "getInstalledCards", "Lcom/huami/nfc/bus/entities/CardNo;", "getCardNum", "Lcom/huami/nfc/bus/entities/SiteInfo;", "getSiteInfo", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public interface SnowballService {
    @POST("nfc/notification/eseFormat")
    @NotNull
    Call<PayResponse<Unit>> eseFormat(@Body @NotNull RequestBody body);

    @POST("/nfc/orders")
    @NotNull
    Call<PayResponse<OrderEntity>> generateOrder(@Body @NotNull RequestBody body);

    @POST("nfc/cards/no")
    @NotNull
    Call<PayResponse<CardNo>> getCardNum(@Body @NotNull RequestBody body);

    @GET("nfc/cards/installed")
    @NotNull
    Call<ResponseBody> getInstalledCards();

    @GET("nfc/order/{id}")
    @NotNull
    Call<ResponseBody> getOrderInfo(@Path("id") @NotNull String id);

    @GET("nfc/orders")
    @NotNull
    Call<ResponseBody> getOrders(@QueryMap @NotNull Map<String, String> params);

    @POST("nfc/siteInfo")
    @NotNull
    Call<PayResponse<SiteInfo>> getSiteInfo(@Body @NotNull RequestBody body);

    @GET("nfc/order/transactionAmount")
    @NotNull
    Call<PayResponse<List<TransAmountEntity>>> getTransactionAmount(@QueryMap @NotNull Map<String, String> params);

    @POST("/nfc/order/refund")
    @NotNull
    Call<PayResponse<Unit>> refund(@Body @NotNull RequestBody body);
}
