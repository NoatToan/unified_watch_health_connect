package com.huami.watchfacesstore.api;

import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.watchfacesstore.bean.HomePageBean;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.huami.watchfacesstore.bean.RankingBean;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.bean.WatchFaceDetailBean;
import com.huami.watchfacesstore.bean.WatchListBean;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J&\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002J\u001e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002J\u0016\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002J\u0016\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002J&\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0002¨\u0006'"}, d2 = {"Lcom/huami/watchfacesstore/api/HomeApi;", "Lcom/huami/watchfacesstore/api/WatchFaceHttpKit;", "", "device", "Lcom/huami/watchfacesstore/bean/HomePageBean;", "getHomePageList", "", DTransferConstants.PAGE, "perPage", "Lcom/huami/watchfacesstore/bean/WatchListBean;", "getHomeWatchList", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "getNewWatchList", "rankingType", "Lcom/huami/watchfacesstore/bean/RankingBean;", "getRankingList", "categoryId", "getCategoryList", WatchFaceDetailActivity.WATCH_FACE_ID, "styles", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "getWatchFaceDetail", "getCollectionList", "ids", "", "collectWatchFace", "deleteCollectWatchFace", "builtinIds", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "getMyWatchList", "reportDownLoad", "publisherId", "getPublisherWatchList", "id", "deviceId", "getCoolSpecialList", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class HomeApi implements WatchFaceHttpKit {
    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return WatchFaceHttpKit.DefaultImpls.baseUrl(this);
    }

    public final boolean collectWatchFace(@NotNull String device, @NotNull String ids) {
        return ResponseExtKt.checkSuccessfulOrThrow(HttpKitKtxKt.httpPost$default(this, "market/devices/" + device + "/watch/favorites", new FormBody.Builder().add("ids", ids).build(), null, null, 12, null));
    }

    public final boolean deleteCollectWatchFace(@NotNull String device, @NotNull String ids) {
        return ResponseExtKt.checkSuccessfulOrThrow(HttpKitKtxKt.httpPost$default(this, "market/devices/" + device + "/watch/favorites/delete", new FormBody.Builder().add("ids", ids).build(), null, null, 12, null));
    }

    @NotNull
    public final WatchListBean getCategoryList(@NotNull String device, int categoryId, int page, int perPage) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "market/devices/" + device + "/watch/category-apps/" + categoryId + "?page=" + page + "&per_page=" + perPage, null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (WatchListBean) converter.convert(responseBodyBody, new TypeToken<WatchListBean>() { // from class: com.huami.watchfacesstore.api.HomeApi$getCategoryList$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @NotNull
    public final WatchListBean getCollectionList(@NotNull String device, int page, int perPage) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "market/devices/" + device + "/watch/favorites?page=" + page + "&per_page=" + perPage, null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (WatchListBean) converter.convert(responseBodyBody, new TypeToken<WatchListBean>() { // from class: com.huami.watchfacesstore.api.HomeApi$getCollectionList$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @NotNull
    public final WatchListBean getCoolSpecialList(int id, @NotNull String deviceId) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "market/devices/" + deviceId + "/watch/topics/" + id, null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (WatchListBean) converter.convert(responseBodyBody, new TypeToken<WatchListBean>() { // from class: com.huami.watchfacesstore.api.HomeApi$getCoolSpecialList$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @NotNull
    public final HomePageBean getHomePageList(@NotNull String device) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "market/devices/" + device + "/watch/homepage", null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (HomePageBean) converter.convert(responseBodyBody, new TypeToken<HomePageBean>() { // from class: com.huami.watchfacesstore.api.HomeApi$getHomePageList$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @NotNull
    public final WatchListBean getHomeWatchList(@NotNull String device, int page, int perPage) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "market/devices/" + device + "/watch?customizable=disable&page=" + page + "&per_page=" + perPage, null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (WatchListBean) converter.convert(responseBodyBody, new TypeToken<WatchListBean>() { // from class: com.huami.watchfacesstore.api.HomeApi$getHomeWatchList$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @NotNull
    public final List<MyWatchFaceBean> getMyWatchList(@NotNull String device, @NotNull String builtinIds) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "market/devices/" + device + "/watch/builtin?builtin_ids=" + builtinIds, null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (List) converter.convert(responseBodyBody, new TypeToken<List<? extends MyWatchFaceBean>>() { // from class: com.huami.watchfacesstore.api.HomeApi$getMyWatchList$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @NotNull
    public final List<WatchData> getNewWatchList(@NotNull String device) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "market/devices/" + device + "/watch/new", null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (List) converter.convert(responseBodyBody, new TypeToken<List<? extends WatchData>>() { // from class: com.huami.watchfacesstore.api.HomeApi$getNewWatchList$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @NotNull
    public final WatchListBean getPublisherWatchList(int publisherId, @NotNull String device, int page, int perPage) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "market/devices/" + device + "/watch?publisher_id=" + publisherId + "&page=" + page + "&per_page=" + perPage, null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (WatchListBean) converter.convert(responseBodyBody, new TypeToken<WatchListBean>() { // from class: com.huami.watchfacesstore.api.HomeApi$getPublisherWatchList$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @NotNull
    public final RankingBean getRankingList(@NotNull String device, @NotNull String rankingType, int page, int perPage) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "market/devices/" + device + "/watch/ranking/" + rankingType + "?page=" + page + "&per_page=" + perPage, null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (RankingBean) converter.convert(responseBodyBody, new TypeToken<RankingBean>() { // from class: com.huami.watchfacesstore.api.HomeApi$getRankingList$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @NotNull
    public final WatchFaceDetailBean getWatchFaceDetail(@NotNull String device, int watchFaceId, @NotNull String styles) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "market/devices/" + device + "/watch/apps/" + watchFaceId + "?recommend_count=4&styles=" + styles, null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (WatchFaceDetailBean) converter.convert(responseBodyBody, new TypeToken<WatchFaceDetailBean>() { // from class: com.huami.watchfacesstore.api.HomeApi$getWatchFaceDetail$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.watchfacesstore.api.WatchFaceHttpKit, com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return WatchFaceHttpKit.DefaultImpls.okHttpClient(this);
    }

    public final boolean reportDownLoad(@NotNull String device, @NotNull String ids) {
        return ResponseExtKt.checkSuccessfulOrThrow(HttpKitKtxKt.httpPost$default(this, "market/watch/download-report", new FormBody.Builder().add("device", device).add("ids", ids).build(), null, null, 12, null));
    }
}
