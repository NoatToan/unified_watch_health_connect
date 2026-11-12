package com.huami.sky.lib.api;

import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.RelaxDataResponse;
import com.huami.sky.lib.entity.RelaxScoreResponse;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/huami/sky/lib/api/RelaxDataApiImpl;", "Lcom/huami/sky/lib/api/RelaxDataApi;", "Lcom/huami/http/HttpKit;", "", "sleepStartTime", "sleepEndTime", "Lcom/huami/sky/lib/entity/RelaxDataResponse;", "getRelaxScoreAndTags", "startTime", "endTime", "Lcom/huami/sky/lib/entity/RelaxScoreResponse;", "getRelaxScore", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class RelaxDataApiImpl implements RelaxDataApi, HttpKit {
    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.sky.lib.api.RelaxDataApi
    @Nullable
    public RelaxScoreResponse getRelaxScore(long startTime, long endTime) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, WebConstant.Path.GET_RELAX_SCORE, r.mapOf(TuplesKt.to(WebConstant.QueryParam.START_TIME, String.valueOf(startTime)), TuplesKt.to(WebConstant.QueryParam.END_TIME, String.valueOf(endTime))), null, 4, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (RelaxScoreResponse) converter.convert(responseBodyBody, new TypeToken<RelaxScoreResponse>() { // from class: com.huami.sky.lib.api.RelaxDataApiImpl$getRelaxScore$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.sky.lib.api.RelaxDataApi
    @Nullable
    public RelaxDataResponse getRelaxScoreAndTags(long sleepStartTime, long sleepEndTime) throws HttpError {
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, WebConstant.Path.GET_SLEEP_RELAX_DATA, r.mapOf(TuplesKt.to(WebConstant.QueryParam.SLEEP_START_TIME, String.valueOf(sleepStartTime)), TuplesKt.to(WebConstant.QueryParam.SLEEP_END_TIME, String.valueOf(sleepEndTime))), null, 4, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (RelaxDataResponse) converter.convert(responseBodyBody, new TypeToken<RelaxDataResponse>() { // from class: com.huami.sky.lib.api.RelaxDataApiImpl$getRelaxScoreAndTags$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
