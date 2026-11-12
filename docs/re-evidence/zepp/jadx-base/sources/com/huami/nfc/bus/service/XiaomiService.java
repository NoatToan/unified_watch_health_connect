package com.huami.nfc.bus.service;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.CouponEntity;
import com.huami.nfc.bus.MiRefundStatus;
import com.huami.nfc.bus.OrderEntity;
import com.huami.nfc.bus.PrepareTransferOut;
import com.huami.nfc.bus.TransAmountEntity;
import com.huami.nfc.bus.TransferIn;
import com.huami.nfc.bus.XiaomiInVoiceEntity;
import com.huami.nfc.bus.XiaomiOrderInfoEntity;
import com.huami.nfc.bus.XiaomiPrepareReturn;
import com.huami.nfc.bus.entities.CardNo;
import com.huami.nfc.bus.entities.CarouselEntity;
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
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'J4\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H'J$\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00070\u00060\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'J$\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00070\u00060\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u0003H'J\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u0003H'J*\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'J4\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u001e\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u0003H'J\u001e\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u001e\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\u00052\b\b\u0001\u0010&\u001a\u00020\u0003H'J\u001e\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00060\u00052\b\b\u0001\u0010&\u001a\u00020\u0003H'J\"\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0001\u0010*\u001a\u00020\u00032\b\b\u0001\u0010+\u001a\u00020\u0003H'J\u001e\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u001e\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u001e\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u001e\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'J2\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\u00052\b\b\u0001\u00103\u001a\u00020\u00032\b\b\u0001\u00104\u001a\u00020\u00032\b\b\u0001\u00105\u001a\u00020\u0003H'¨\u00067"}, d2 = {"Lcom/huami/nfc/bus/service/XiaomiService;", "", "", "", "params", "Lretrofit2/Call;", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/TransAmountEntity;", "getTransactionAmount", "Lokhttp3/RequestBody;", "body", "Lcom/huami/nfc/bus/OrderEntity;", "generateOrder", "Lokhttp3/ResponseBody;", "getXiaomiOrders", "id", "Lcom/huami/nfc/bus/XiaomiOrderInfoEntity;", "getXiaomiOrderInfo", "", FirebaseAnalytics.Event.REFUND, "Lcom/huami/nfc/bus/entities/CardNo;", "getCardNum", "getMaintainNotices", "", "feeId", "Lcom/huami/nfc/bus/CouponEntity;", "getCoupon", "name", "Lcom/huami/nfc/bus/entities/CarouselEntity;", "getCarouselList", "getCardInstructions", "Lcom/huami/nfc/bus/XiaomiInVoiceEntity;", "getInvoiceAddress", "postFeeInvoice", "getChargeInvoiceDescription", "Lcom/huami/nfc/bus/PrepareTransferOut;", "prepareTransferOut", "orderId", "confirmTransferOut", "Lcom/huami/nfc/bus/TransferIn;", "startTransferIn", "tag", "extra", "bulletins", "Lcom/huami/nfc/bus/MiRefundStatus;", "queryRefundStatus", "applyRefund", "Lcom/huami/nfc/bus/XiaomiPrepareReturn;", "prepareReturn", "authorizationBind", "phone", "cardName", "actionType", "sendCaptcha", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public interface XiaomiService {
    @POST("/nfc/serviceFee/applyRefund")
    @NotNull
    Call<PayResponse<Unit>> applyRefund(@Body @NotNull RequestBody body);

    @POST("/nfc/payment/authorization/bind")
    @NotNull
    Call<PayResponse<Unit>> authorizationBind(@Body @NotNull RequestBody body);

    @GET("/nfc/query/bulletins")
    @NotNull
    Call<ResponseBody> bulletins(@NotNull @Query("tag") String tag, @NotNull @Query("extra") String extra);

    @POST("/nfc/confirmTransferOut")
    @NotNull
    Call<PayResponse<Unit>> confirmTransferOut(@NotNull @Query("orderId") String orderId);

    @POST("/nfc/orders")
    @NotNull
    Call<PayResponse<OrderEntity>> generateOrder(@Body @NotNull RequestBody body);

    @GET("/nfc/notices")
    @NotNull
    Call<ResponseBody> getCardInstructions(@NotNull @Query("xm_card_name") String name);

    @POST("nfc/cards/no")
    @NotNull
    Call<PayResponse<CardNo>> getCardNum(@Body @NotNull RequestBody body);

    @GET("/nfc/carousels")
    @NotNull
    Call<PayResponse<List<CarouselEntity>>> getCarouselList(@NotNull @Query("xm_card_name") String name);

    @GET("/nfc/rechargePage")
    @NotNull
    Call<PayResponse<String>> getChargeInvoiceDescription(@NotNull @Query("xm_card_name") String name);

    @GET("/nfc/coupon")
    @NotNull
    Call<PayResponse<List<CouponEntity>>> getCoupon(@Query("feeId") int feeId);

    @GET("/nfc/xmServiceFeeInvoice")
    @NotNull
    Call<PayResponse<XiaomiInVoiceEntity>> getInvoiceAddress(@QueryMap @NotNull Map<String, String> params);

    @GET("busMaintainCompanyNotices")
    @NotNull
    Call<ResponseBody> getMaintainNotices();

    @GET("nfc/order/transactionAmount")
    @NotNull
    Call<PayResponse<List<TransAmountEntity>>> getTransactionAmount(@QueryMap @NotNull Map<String, String> params);

    @GET("nfc/order/{id}")
    @NotNull
    Call<PayResponse<XiaomiOrderInfoEntity>> getXiaomiOrderInfo(@Path("id") @NotNull String id, @QueryMap @NotNull Map<String, String> params);

    @GET("nfc/orders")
    @NotNull
    Call<ResponseBody> getXiaomiOrders(@QueryMap @NotNull Map<String, String> params);

    @POST("/nfc/serviceFeeInvoice")
    @NotNull
    Call<PayResponse<Unit>> postFeeInvoice(@QueryMap @NotNull Map<String, String> params, @Body @NotNull RequestBody body);

    @POST("/nfc/returnCard/prepareReturn")
    @NotNull
    Call<PayResponse<XiaomiPrepareReturn>> prepareReturn(@Body @NotNull RequestBody body);

    @POST("/nfc/prepareTransferOut")
    @NotNull
    Call<PayResponse<PrepareTransferOut>> prepareTransferOut(@Body @NotNull RequestBody body);

    @POST("/nfc/serviceFee/queryRefundStatus")
    @NotNull
    Call<PayResponse<MiRefundStatus>> queryRefundStatus(@Body @NotNull RequestBody body);

    @POST("/nfc/order/refund")
    @NotNull
    Call<PayResponse<Unit>> refund(@Body @NotNull RequestBody body);

    @POST("/nfc/spcard/sendcaptcha")
    @NotNull
    Call<PayResponse<Unit>> sendCaptcha(@NotNull @Query("phone") String phone, @NotNull @Query("cardName") String cardName, @NotNull @Query("actionType") String actionType);

    @POST("/nfc/startTransferIn")
    @NotNull
    Call<PayResponse<TransferIn>> startTransferIn(@NotNull @Query("orderId") String orderId);
}
