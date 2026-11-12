package com.huami.nfc.door.service;

import com.facebook.GraphRequest;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.DoorCardType;
import com.unionpay.tsmservice.data.Constant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'J(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u00052\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\u0004\u001a\u00020\u0002H'J5\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\u0019\b\u0001\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u000f0\u000eH'J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'J@\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u00052\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\nH'J*\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u00052\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH'J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH'¨\u0006\u0019"}, d2 = {"Lcom/huami/nfc/door/service/AccessDoorServer;", "", "", "sessionId", Constant.KEY_CARD_TYPE, "Lretrofit2/Call;", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardInfo", "Lokhttp3/RequestBody;", "body", "", "updateCardInfo", "", "Lkotlin/jvm/JvmSuppressWildcards;", "params", "getCardList", "Lokhttp3/ResponseBody;", "query", GraphRequest.FIELDS_PARAM, "verify", "verifyByIdCard", "bind", "getSupportCommunity", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public interface AccessDoorServer {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Call getCardInfo$default(AccessDoorServer accessDoorServer, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCardInfo");
            }
            if ((i & 2) != 0) {
                str2 = DoorCardType.ACCESS_CARD.getType();
            }
            return accessDoorServer.getCardInfo(str, str2);
        }

        public static /* synthetic */ Call updateCardInfo$default(AccessDoorServer accessDoorServer, RequestBody requestBody, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCardInfo");
            }
            if ((i & 2) != 0) {
                str = DoorCardType.ACCESS_CARD.getType();
            }
            return accessDoorServer.updateCardInfo(requestBody, str);
        }
    }

    @POST("/nfc/realname/bind")
    @NotNull
    Call<PayResponse<Unit>> bind(@QueryMap @NotNull Map<String, String> params);

    @GET("/nfc/accessCard/info")
    @NotNull
    Call<PayResponse<List<DoorCardInfo>>> getCardInfo(@NotNull @Query("sessionId") String sessionId, @NotNull @Query("userNFCCardType") String cardType);

    @GET("/nfc/accessCard/list")
    @NotNull
    Call<PayResponse<List<DoorCardInfo>>> getCardList(@QueryMap @NotNull Map<String, Object> params);

    @POST("/nfc/accessCard/estate")
    @NotNull
    Call<ResponseBody> getSupportCommunity(@Body @NotNull RequestBody body);

    @GET("/nfc/realname/info")
    @NotNull
    Call<ResponseBody> query(@QueryMap @NotNull Map<String, String> params);

    @POST("/nfc/accessCard/info")
    @NotNull
    Call<PayResponse<Unit>> updateCardInfo(@Body @NotNull RequestBody body, @NotNull @Query("userNFCCardType") String cardType);

    @FormUrlEncoded
    @POST("/nfc/realname/verify")
    @NotNull
    Call<PayResponse<Unit>> verify(@QueryMap @NotNull Map<String, String> params, @FieldMap @NotNull Map<String, String> fields);

    @POST("nfc/realname/verifyByCard")
    @NotNull
    Call<ResponseBody> verifyByIdCard(@QueryMap @NotNull Map<String, String> params, @Body @NotNull RequestBody body);
}
