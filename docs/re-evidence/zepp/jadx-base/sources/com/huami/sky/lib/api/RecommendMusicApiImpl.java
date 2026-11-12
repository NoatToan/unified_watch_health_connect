package com.huami.sky.lib.api;

import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.MusicEntity;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/sky/lib/api/RecommendMusicApiImpl;", "Lcom/huami/sky/lib/api/RecommendMusicApi;", "Lcom/huami/http/HttpKit;", "", WebConstant.QueryParam.LAUNCH, "", WebConstant.QueryParam.SWITCH, "Lcom/huami/sky/lib/entity/MusicEntity;", "recommendMusic", "(ZLjava/lang/Integer;)Lcom/huami/sky/lib/entity/MusicEntity;", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class RecommendMusicApiImpl implements RecommendMusicApi, HttpKit {
    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.sky.lib.api.RecommendMusicApi
    @Nullable
    public MusicEntity recommendMusic(boolean launch, @Nullable Integer num) throws HttpError {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(WebConstant.QueryParam.LAUNCH, String.valueOf(launch));
        if (num != null) {
            linkedHashMap.put(WebConstant.QueryParam.SWITCH, String.valueOf(num.intValue()));
        }
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, WebConstant.Path.RECOMMEND_MUSIC, linkedHashMap, null, 4, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (MusicEntity) converter.convert(responseBodyBody, new TypeToken<MusicEntity>() { // from class: com.huami.sky.lib.api.RecommendMusicApiImpl$recommendMusic$$inlined$deserializeOrThrow$1
        }.getType());
    }
}
