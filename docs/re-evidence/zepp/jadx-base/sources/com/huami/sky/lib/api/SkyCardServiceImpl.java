package com.huami.sky.lib.api;

import com.google.gson.reflect.TypeToken;
import com.huami.account.service.AreaService;
import com.huami.account.service.AreaServiceExtKt;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.sky.entry.SkyCardEntry;
import com.huami.sky.entry.SkySurveyEntry;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.service.SkyCardService;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/sky/lib/api/SkyCardServiceImpl;", "Lcom/huami/sky/service/SkyCardService;", "Lcom/huami/http/HttpKit;", "", WebConstant.QueryParam.LAST_SHOW_AT, "Lcom/huami/sky/entry/SkyCardEntry;", "getSkyCardEntry", "(Ljava/lang/Long;)Lcom/huami/sky/entry/SkyCardEntry;", "Lcom/huami/sky/entry/SkySurveyEntry;", "getSkyQuestionnaireUrl", "Lcom/huami/account/service/AreaService;", "a", "Lcom/huami/account/service/AreaService;", "areaService", "<init>", "(Lcom/huami/account/service/AreaService;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SkyCardServiceImpl implements SkyCardService, HttpKit {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AreaService areaService;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取星空调查接口异常：" + this.a;
        }
    }

    public SkyCardServiceImpl(@NotNull AreaService areaService) {
        this.areaService = areaService;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.sky.service.SkyCardService
    @NotNull
    public SkyCardEntry getSkyCardEntry(@Nullable Long lastUpgradeInfoShowedAt) throws HttpError {
        HashMap mapHashMapOf = r.hashMapOf(TuplesKt.to(WebConstant.QueryParam.USER_COUNTRY, this.areaService.userCountryCode()), TuplesKt.to(WebConstant.QueryParam.USER_REGION, AreaServiceExtKt.userRegion(this.areaService)));
        if (lastUpgradeInfoShowedAt != null) {
        }
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, WebConstant.Path.GET_MUSIC_CARD, mapHashMapOf, null, 4, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (SkyCardEntry) converter.convert(responseBodyBody, new TypeToken<SkyCardEntry>() { // from class: com.huami.sky.lib.api.SkyCardServiceImpl$getSkyCardEntry$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.sky.service.SkyCardService
    @Nullable
    public SkySurveyEntry getSkyQuestionnaireUrl() {
        try {
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, WebConstant.Path.GET_RELAX_SURVEY, null, null, 6, null);
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (!responseHttpGet$default.isSuccessful()) {
                throw new HttpError(responseHttpGet$default);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = responseHttpGet$default.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            return (SkySurveyEntry) converter.convert(responseBodyBody, new TypeToken<SkySurveyEntry>() { // from class: com.huami.sky.lib.api.SkyCardServiceImpl$getSkyQuestionnaireUrl$$inlined$deserializeOrThrow$1
            }.getType());
        } catch (Exception e) {
            HMLog.error$default("SkyCardService", null, null, new a(e), 6, null);
            return null;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
