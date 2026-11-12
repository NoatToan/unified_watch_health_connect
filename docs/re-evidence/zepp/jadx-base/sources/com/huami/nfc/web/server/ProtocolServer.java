package com.huami.nfc.web.server;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.web.entity.ProtocolEntity;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'J*\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¨\u0006\n"}, d2 = {"Lcom/huami/nfc/web/server/ProtocolServer;", "", "", "", "params", "Lretrofit2/Call;", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "agreeProtocol", "web_release"}, k = 1, mv = {1, 5, 1})
public interface ProtocolServer {
    @POST("nfc/protocol")
    @NotNull
    Call<PayResponse<String>> agreeProtocol(@QueryMap @NotNull Map<String, String> params);

    @GET("nfc/protocol")
    @NotNull
    Call<PayResponse<ProtocolEntity>> getProtocol(@QueryMap @NotNull Map<String, String> params);
}
