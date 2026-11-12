package com.huami.nfc.bus.service;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.entities.InvoiceEntity;
import com.huami.nfc.bus.entities.OpenFeeStateEntity;
import com.huami.nfc.bus.entities.PayAuthorizationInfo;
import com.huami.nfc.bus.entities.RefundOpenFeeEntity;
import com.huami.nfc.bus.entities.RefundTicket;
import com.huami.nfc.bus.entities.ReturnCardReason;
import com.xiaomi.infra.galaxy.fds.Common;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'JL\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'JB\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0002H'J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006H'J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\t\u001a\u00020\u0002H'J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002H'J.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'J*\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'J4\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001c0\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'J$\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'J4\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001c0\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'J(\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001c0\u00062\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u0002H'J\u001e\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001c0\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH'J\u001a\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u001c0\u0006H'J\u001e\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH'J4\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u001c0\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'¨\u0006/"}, d2 = {"Lcom/huami/nfc/bus/service/HuamiService;", "", "", "userId", "", "params", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "getUserProperties", "appCode", "cardNumber", "Lokhttp3/RequestBody;", "body", "uploadTransactions", "getTransactionsRecord", "sendCaptcha", "verifyCaptcha", "deviceId", "cardId", "bindingBusCard", "unbindingBusCard", "Lorg/json/JSONObject;", "getAvailableCities", "getCityInfo", "cityCode", "getOpenedBusCardCities", "getAvailableCitiesWithStatus", "requestNotices", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/entities/InvoiceEntity;", "getFeeInvoice", "", "postFeeInvoice", "getCardInfoList", "postCardInfo", "cardNo", "Lcom/huami/nfc/bus/entities/OpenFeeStateEntity;", "getOpenFeeStatus", "Lcom/huami/nfc/bus/entities/RefundOpenFeeEntity;", "applyRefundOpenFee", "", "Lcom/huami/nfc/bus/entities/ReturnCardReason;", "returnCardReason", "Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;", Common.AUTHORIZATION, "Lcom/huami/nfc/bus/entities/RefundTicket;", "refundTicket", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public interface HuamiService {
    @POST("nfc/applyRefundOpenFee")
    @NotNull
    Call<PayResponse<RefundOpenFeeEntity>> applyRefundOpenFee(@Body @NotNull RequestBody body);

    @POST("nfc/payment/authorization/generate")
    @NotNull
    Call<PayResponse<PayAuthorizationInfo>> authorization(@Body @NotNull RequestBody body);

    @POST("users/{userId}/devices/{deviceId}/busCards/{cardId}")
    @NotNull
    Call<ResponseBody> bindingBusCard(@Path("userId") @NotNull String userId, @Path("deviceId") @NotNull String deviceId, @Path("cardId") @NotNull String cardId, @Body @NotNull RequestBody body);

    @GET("/busCardCities")
    @NotNull
    Call<JSONObject> getAvailableCities();

    @GET("/devices/{deviceId}/busCardCities")
    @NotNull
    Call<ResponseBody> getAvailableCitiesWithStatus(@Path("deviceId") @NotNull String deviceId, @QueryMap @NotNull Map<String, String> params);

    @GET("nfc/cardDetails")
    @NotNull
    Call<ResponseBody> getCardInfoList(@QueryMap @NotNull Map<String, String> params);

    @GET("/busCardCities/{appCode}")
    @NotNull
    Call<ResponseBody> getCityInfo(@Path("appCode") @NotNull String appCode);

    @GET("nfc/serviceFeeInvoice")
    @NotNull
    Call<PayResponse<InvoiceEntity>> getFeeInvoice(@QueryMap @NotNull Map<String, String> params);

    @GET("nfc/getOpenFeeStatus")
    @NotNull
    Call<PayResponse<OpenFeeStateEntity>> getOpenFeeStatus(@NotNull @Query("appCode") String appCode, @NotNull @Query("cardNo") String cardNo);

    @GET("/devices/{deviceId}/openedBusCardCities")
    @NotNull
    Call<ResponseBody> getOpenedBusCardCities(@Path("deviceId") @NotNull String deviceId, @Nullable @Query("busCode") String cityCode);

    @GET("/users/{userId}/cities/{appCode}/busCards/{cardId}/transactions")
    @NotNull
    Call<ResponseBody> getTransactionsRecord(@Path("userId") @NotNull String userId, @Path("appCode") @NotNull String appCode, @Path("cardId") @NotNull String cardNumber, @QueryMap @NotNull Map<String, String> params);

    @GET("/users/{userId}/properties")
    @NotNull
    Call<ResponseBody> getUserProperties(@Path("userId") @NotNull String userId, @QueryMap @NotNull Map<String, String> params);

    @POST("nfc/cardDetails")
    @NotNull
    Call<PayResponse<Unit>> postCardInfo(@QueryMap @NotNull Map<String, String> params, @Body @NotNull RequestBody body);

    @POST("nfc/serviceFeeInvoice")
    @NotNull
    Call<PayResponse<Unit>> postFeeInvoice(@QueryMap @NotNull Map<String, String> params, @Body @NotNull RequestBody body);

    @POST("nfc/refundTicket")
    @NotNull
    Call<PayResponse<RefundTicket>> refundTicket(@QueryMap @NotNull Map<String, String> params, @Body @NotNull RequestBody body);

    @GET("/busCompanyNotices")
    @NotNull
    Call<ResponseBody> requestNotices();

    @GET("nfc/returnCard/reason")
    @NotNull
    Call<PayResponse<List<ReturnCardReason>>> returnCardReason();

    @GET("/users/{userId}/requestCaptcha")
    @NotNull
    Call<ResponseBody> sendCaptcha(@Path("userId") @NotNull String userId, @QueryMap @NotNull Map<String, String> params);

    @DELETE("users/{userId}/devices/{deviceId}/busCards/{cardId}")
    @NotNull
    Call<ResponseBody> unbindingBusCard(@Path("userId") @NotNull String userId, @Path("deviceId") @NotNull String deviceId, @Path("cardId") @NotNull String cardId);

    @POST("/users/{userId}/cities/{appCode}/busCards/{cardId}/transactions")
    @NotNull
    Call<ResponseBody> uploadTransactions(@Path("userId") @NotNull String userId, @Path("appCode") @NotNull String appCode, @Path("cardId") @NotNull String cardNumber, @QueryMap @NotNull Map<String, String> params, @Body @NotNull RequestBody body);

    @POST("users/{userId}/verifyCaptcha")
    @NotNull
    Call<ResponseBody> verifyCaptcha(@Path("userId") @NotNull String userId, @Body @NotNull RequestBody body);
}
