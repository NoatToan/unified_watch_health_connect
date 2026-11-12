package com.huami.sky.lib.api;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.PlaybackParamBean;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huami/sky/lib/api/SkyAppSettingApiImpl;", "Lcom/huami/sky/lib/api/SkyAppSettingApi;", "Lcom/huami/http/HttpKit;", "Lcom/huami/sky/lib/entity/PlaybackParamBean;", "getPlaybackParam", "<init>", "()V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SkyAppSettingApiImpl implements SkyAppSettingApi, HttpKit {
    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.sky.lib.api.SkyAppSettingApi
    @NotNull
    public PlaybackParamBean getPlaybackParam() throws HttpError {
        String string;
        Bundle bundle = ((Context) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).getPackageManager().getApplicationInfo(((Context) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).getPackageName(), 128).metaData;
        String str = "";
        if (bundle != null && (string = bundle.getString("hm_app_id")) != null) {
            str = string;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, String.format("apps/%s/settings", Arrays.copyOf(new Object[]{str}, 1)), r.mapOf(TuplesKt.to("settingName", WebConstant.QueryParam.FADE_IN_OUT_SETTING_NAME), TuplesKt.to("mode", "SINGLE")), null, 4, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (PlaybackParamBean) converter.convert(responseBodyBody, new TypeToken<PlaybackParamBean>() { // from class: com.huami.sky.lib.api.SkyAppSettingApiImpl$getPlaybackParam$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
