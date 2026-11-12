package com.huami.nfc.web.server;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.web.entity.ApduScript;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J(\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0010\u001a\u00020\bH'J\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J(\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J(\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0019"}, d2 = {"Lcom/huami/nfc/web/server/InitRequestServer;", "", "Lokhttp3/RequestBody;", "body", "Lretrofit2/Call;", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/web/entity/ApduScript;", PointCategory.INIT, "", "deviceId", "request", "productType", "accessInit", "accessRequest", "eidInit", "eidRequest", "sessionId", "unionpayInit", "unionpayRequest", "loockInit", "loockRequest", "secretKeyInit", "secretKeyRequest", "createAMSDInit", "createAMSDRequest", "web_release"}, k = 1, mv = {1, 5, 1})
public interface InitRequestServer {
    @POST("/nfc/accessCard/script/init")
    @NotNull
    Call<PayResponse<ApduScript>> accessInit(@Header("x-snbps-product-type") @NotNull String productType, @Body @NotNull RequestBody body);

    @POST("/nfc/accessCard/script/request")
    @NotNull
    Call<PayResponse<ApduScript>> accessRequest(@Header("x-snbps-product-type") @NotNull String productType, @Body @NotNull RequestBody body);

    @POST("/nfc/createamsd/script/init")
    @NotNull
    Call<PayResponse<ApduScript>> createAMSDInit(@Body @NotNull RequestBody body);

    @POST("/nfc/createamsd/script/request")
    @NotNull
    Call<PayResponse<ApduScript>> createAMSDRequest(@Body @NotNull RequestBody body);

    @POST("/nfc/card/init")
    @NotNull
    Call<PayResponse<ApduScript>> eidInit(@Header("x-snbps-product-type") @NotNull String productType, @Body @NotNull RequestBody body);

    @POST("/nfc/card/request")
    @NotNull
    Call<PayResponse<ApduScript>> eidRequest(@Header("x-snbps-product-type") @NotNull String productType, @Body @NotNull RequestBody body);

    @POST("/nfc/script/init")
    @NotNull
    Call<PayResponse<ApduScript>> init(@Body @NotNull RequestBody body);

    @POST("/nfc/card/init")
    @NotNull
    Call<PayResponse<ApduScript>> loockInit(@Header("x-snbps-product-type") @NotNull String productType, @Body @NotNull RequestBody body);

    @POST("/nfc/card/request")
    @NotNull
    Call<PayResponse<ApduScript>> loockRequest(@Header("x-snbps-product-type") @NotNull String productType, @Body @NotNull RequestBody body);

    @POST("/nfc/script/request")
    @NotNull
    Call<PayResponse<ApduScript>> request(@Header("deviceId") @NotNull String deviceId, @Body @NotNull RequestBody body);

    @POST("/nfc/secretkey/script/init")
    @NotNull
    Call<PayResponse<ApduScript>> secretKeyInit(@Body @NotNull RequestBody body);

    @POST("/nfc/secretkey/script/request")
    @NotNull
    Call<PayResponse<ApduScript>> secretKeyRequest(@Body @NotNull RequestBody body);

    @POST("/nfc/preparePayApplet/script/init")
    @NotNull
    Call<PayResponse<ApduScript>> unionpayInit(@NotNull @Query("session_id") String sessionId);

    @POST("/nfc/preparePayApplet/script/request")
    @NotNull
    Call<PayResponse<ApduScript>> unionpayRequest(@Body @NotNull RequestBody body);
}
