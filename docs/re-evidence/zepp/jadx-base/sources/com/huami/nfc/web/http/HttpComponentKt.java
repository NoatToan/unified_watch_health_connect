package com.huami.nfc.web.http;

import com.huami.watch.transdata.transport.Actions;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u001a,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003\u001a8\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u001a,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¨\u0006\u000e"}, d2 = {"Lcom/huami/nfc/web/http/HttpComponent;", "", "url", "", "params", Actions.KEY_HEADERS, "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "httpGet", "httpPostWithParams", "Lokhttp3/RequestBody;", "body", "httpPost", "httpDelete", "web_release"}, k = 2, mv = {1, 5, 1})
public final class HttpComponentKt {
    @NotNull
    public static final Response<ResponseBody> httpDelete(@NotNull HttpComponent httpComponent, @NotNull String str, @NotNull Map<String, String> map) {
        return httpComponent.getEngine().getService().delete(str, map).execute();
    }

    @NotNull
    public static final Response<ResponseBody> httpGet(@NotNull HttpComponent httpComponent, @NotNull String str, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        if (map == null) {
            return map2 == null ? httpComponent.getEngine().getService().get(str).execute() : httpComponent.getEngine().getService().getWithHeaders(str, map2).execute();
        }
        return map2 == null ? httpComponent.getEngine().getService().getWithParams(str, map).execute() : httpComponent.getEngine().getService().getWithHeadersAndParams(str, map2, map).execute();
    }

    public static /* synthetic */ Response httpGet$default(HttpComponent httpComponent, String str, Map map, Map map2, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            map2 = null;
        }
        return httpGet(httpComponent, str, map, map2);
    }

    @NotNull
    public static final Response<ResponseBody> httpPost(@NotNull HttpComponent httpComponent, @NotNull String str, @NotNull RequestBody requestBody, @Nullable Map<String, String> map) {
        return map == null ? httpComponent.getEngine().getService().post(str, requestBody).execute() : httpComponent.getEngine().getService().postWithHeaders(str, requestBody, map).execute();
    }

    public static /* synthetic */ Response httpPost$default(HttpComponent httpComponent, String str, RequestBody requestBody, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        return httpPost(httpComponent, str, requestBody, map);
    }

    @NotNull
    public static final Response<ResponseBody> httpPostWithParams(@NotNull HttpComponent httpComponent, @NotNull String str, @NotNull Map<String, String> map) {
        return httpComponent.getEngine().getService().postWithParams(str, map).execute();
    }
}
