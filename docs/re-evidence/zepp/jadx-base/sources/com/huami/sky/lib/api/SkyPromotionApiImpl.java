package com.huami.sky.lib.api;

import com.google.gson.reflect.TypeToken;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.account.service.AreaService;
import com.huami.account.service.AreaServiceExtKt;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.SkyPromotionInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/sky/lib/api/SkyPromotionApiImpl;", "Lcom/huami/sky/lib/api/SkyPromotionApi;", "Lcom/huami/http/HttpKit;", "", "Lcom/huami/sky/lib/entity/SkyPromotionInfo;", "getFeatureUpdateTips", "Lcom/huami/account/service/AccountService;", "a", "Lcom/huami/account/service/AccountService;", "accountService", "Lcom/huami/account/service/AreaService;", "b", "Lcom/huami/account/service/AreaService;", "areaService", "Lcom/huami/sky/lib/api/DeviceDataApi;", "c", "Lcom/huami/sky/lib/api/DeviceDataApi;", "deviceDataApi", "<init>", "(Lcom/huami/account/service/AccountService;Lcom/huami/account/service/AreaService;Lcom/huami/sky/lib/api/DeviceDataApi;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPromotionApiImpl implements SkyPromotionApi, HttpKit {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AccountService accountService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AreaService areaService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DeviceDataApi deviceDataApi;

    public SkyPromotionApiImpl(@NotNull AccountService accountService, @NotNull AreaService areaService, @NotNull DeviceDataApi deviceDataApi) {
        this.accountService = accountService;
        this.areaService = areaService;
        this.deviceDataApi = deviceDataApi;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.sky.lib.api.SkyPromotionApi
    @Nullable
    public List<SkyPromotionInfo> getFeatureUpdateTips() throws HttpError {
        Pair[] pairArr = new Pair[4];
        String strUserId = AccountServiceExtKt.userId(this.accountService);
        if (strUserId == null) {
            strUserId = "";
        }
        pairArr[0] = TuplesKt.to("userid", strUserId);
        pairArr[1] = TuplesKt.to("user_country", this.areaService.userCountryCode());
        pairArr[2] = TuplesKt.to("user_region", AreaServiceExtKt.userRegion(this.areaService));
        pairArr[3] = TuplesKt.to("device_id", this.deviceDataApi.findAllActiveDeviceId());
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, WebConstant.Path.FEATURE_UPDATE_TIP, r.mapOf(pairArr), null, 4, null);
        ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
        if (!responseHttpGet$default.isSuccessful()) {
            throw new HttpError(responseHttpGet$default);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = responseHttpGet$default.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return (List) converter.convert(responseBodyBody, new TypeToken<List<? extends SkyPromotionInfo>>() { // from class: com.huami.sky.lib.api.SkyPromotionApiImpl$getFeatureUpdateTips$$inlined$deserializeOrThrow$1
        }.getType());
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
