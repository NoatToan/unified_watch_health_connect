package com.huami.watchfacesstore.api;

import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.watchfacesstore.bean.WatchListBean;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"Lcom/huami/watchfacesstore/api/HistoryRecordApiImpl;", "Lcom/huami/watchfacesstore/api/HistoryRecordApi;", "Lcom/huami/watchfacesstore/api/WatchFaceHttpKit;", "", "device", "", DTransferConstants.PAGE, "perPage", "Lcom/huami/watchfacesstore/bean/WatchListBean;", "getHistoryRecord", "ids", "", "deleteHistoryRecord", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class HistoryRecordApiImpl implements HistoryRecordApi, WatchFaceHttpKit {
    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return WatchFaceHttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.watchfacesstore.api.HistoryRecordApi
    public boolean deleteHistoryRecord(@NotNull String device, @NotNull String ids) {
        return ResponseExtKt.checkSuccessfulOrThrow(HttpKitKtxKt.httpPost$default(this, "market/devices/" + device + "/watch/purchased-apps/delete", new FormBody.Builder().add("ids", ids).build(), null, null, 12, null));
    }

    @Override // com.huami.watchfacesstore.api.HistoryRecordApi
    @NotNull
    public WatchListBean getHistoryRecord(@NotNull String device, int page, int perPage) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "market/devices/" + device + "/watch/purchased-apps?page=" + page + "&per_page=" + perPage, null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (WatchListBean) converter.convert(responseBodyBody, new TypeToken<WatchListBean>() { // from class: com.huami.watchfacesstore.api.HistoryRecordApiImpl$getHistoryRecord$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.watchfacesstore.api.WatchFaceHttpKit, com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return WatchFaceHttpKit.DefaultImpls.okHttpClient(this);
    }
}
