package com.huami.watchfacesstore.api;

import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.watchfacesstore.bean.WatchFaceSetting;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huami/watchfacesstore/api/SettingApiImpl;", "Lcom/huami/watchfacesstore/api/SettingApi;", "Lcom/huami/watchfacesstore/api/WatchFaceHttpKit;", "Lcom/huami/watchfacesstore/bean/WatchFaceSetting;", "fetchSetting", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SettingApiImpl implements SettingApi, WatchFaceHttpKit {
    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return WatchFaceHttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.watchfacesstore.api.SettingApi
    @Nullable
    public WatchFaceSetting fetchSetting() {
        Object objM3845constructorimpl;
        Object objConvert;
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, "market/watch/setting", null, null, 6, null);
        try {
            Result.Companion companion = Result.Companion;
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (responseHttpGet$default.isSuccessful()) {
                ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                ResponseBody responseBodyBody = responseHttpGet$default.body();
                if (responseBodyBody == null) {
                    Intrinsics.throwNpe();
                }
                objConvert = converter.convert(responseBodyBody, new TypeToken<WatchFaceSetting>() { // from class: com.huami.watchfacesstore.api.SettingApiImpl$fetchSetting$$inlined$deserialize$1
                }.getType());
            } else {
                objM3845constructorimpl = Result.m3845constructorimpl(null);
                objConvert = Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (WatchFaceSetting) objConvert;
    }

    @Override // com.huami.watchfacesstore.api.WatchFaceHttpKit, com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return WatchFaceHttpKit.DefaultImpls.okHttpClient(this);
    }
}
