package com.xiaomi.hm.health.play.card.intelligence.watchface;

import com.google.gson.reflect.TypeToken;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.xiaomi.hm.health.play.bean.WatchFaceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/watchface/WatchFaceApi;", "Lcom/huami/http/HttpKit;", "", "deviceSource", "", "Lcom/xiaomi/hm/health/play/bean/WatchFaceData;", "getWatchFaceList", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceApi implements HttpKit {

    @NotNull
    public static final WatchFaceApi INSTANCE = new WatchFaceApi();

    private WatchFaceApi() {
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @NotNull
    public final List<WatchFaceData> getWatchFaceList(int deviceSource) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "/market/devices/" + deviceSource + "/watch/new-random?userid=" + HMWebUtil.getUserId() + "&user_country=" + SelectAreaHelper.getAreaBySave().getValue(), null, null, 6, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (List) converter.convert(responseBodyBody, new TypeToken<List<? extends WatchFaceData>>() { // from class: com.xiaomi.hm.health.play.card.intelligence.watchface.WatchFaceApi$getWatchFaceList$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
