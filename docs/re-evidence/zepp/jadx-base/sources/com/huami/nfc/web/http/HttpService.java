package com.huami.nfc.web.http;

import com.huami.watch.transdata.transport.Actions;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H'J.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H'JD\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH'J8\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H'J.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H'J.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H'¨\u0006\u0013"}, d2 = {"Lcom/huami/nfc/web/http/HttpService;", "", "", "url", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "get", "", Actions.KEY_HEADERS, "getWithHeaders", "params", "getWithParams", "getWithHeadersAndParams", "Lokhttp3/RequestBody;", "body", DataItem.HTTP_METHOD_POST, "postWithHeaders", "postWithParams", "delete", "web_release"}, k = 1, mv = {1, 5, 1})
public interface HttpService {
    @DELETE
    @NotNull
    Call<ResponseBody> delete(@Url @NotNull String url, @QueryMap @NotNull Map<String, String> params);

    @GET
    @NotNull
    Call<ResponseBody> get(@Url @NotNull String url);

    @GET
    @NotNull
    Call<ResponseBody> getWithHeaders(@Url @NotNull String url, @HeaderMap @NotNull Map<String, String> headers);

    @GET
    @NotNull
    Call<ResponseBody> getWithHeadersAndParams(@Url @NotNull String url, @HeaderMap @NotNull Map<String, String> headers, @QueryMap @NotNull Map<String, String> params);

    @GET
    @NotNull
    Call<ResponseBody> getWithParams(@Url @NotNull String url, @QueryMap @NotNull Map<String, String> params);

    @POST
    @NotNull
    Call<ResponseBody> post(@Url @NotNull String url, @Body @NotNull RequestBody body);

    @POST
    @NotNull
    Call<ResponseBody> postWithHeaders(@Url @NotNull String url, @Body @NotNull RequestBody body, @HeaderMap @NotNull Map<String, String> headers);

    @POST
    @NotNull
    Call<ResponseBody> postWithParams(@Url @NotNull String url, @QueryMap @NotNull Map<String, String> params);
}
