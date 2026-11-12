package com.huami.nfc.watch.unionpay.api.impl;

import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi;
import com.huami.nfc.watch.unionpay.entity.BankCardBindStatus;
import com.huami.nfc.web.http.HttpComponent;
import com.huami.nfc.web.http.HttpComponentKt;
import com.huami.nfc.web.http.HttpEngine;
import com.huami.watch.companion.common.AppSettingsKeys;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0016J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\r\u001a\u00020\u0007H\u0016¨\u0006\u0012"}, d2 = {"Lcom/huami/nfc/watch/unionpay/api/impl/WatchUnionpayWebApiImpl;", "Lcom/huami/nfc/watch/unionpay/api/WatchUnionpayWebApi;", "Lcom/huami/nfc/web/http/HttpComponent;", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/watch/unionpay/entity/BankCardBindStatus;", "getBindCards", "", "aidList", "", "deleteCards", "aid", "bindCard", "appName", "getTsmDownloadUrl", "<init>", "()V", "Companion", "nfc-watch-unionpay_release"}, k = 1, mv = {1, 5, 1})
public final class WatchUnionpayWebApiImpl implements WatchUnionpayWebApi, HttpComponent {

    @NotNull
    public static final String URL_BINDING = "/nfc/bindings";

    @NotNull
    public static final String URL_TSM_DOWNLOAD = "/apps/%s/settings";

    @Override // com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi
    @NotNull
    public PayResponse<Unit> bindCard(@NotNull String aid) {
        Object payResponse;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aid", aid);
        Response<ResponseBody> responseHttpPostWithParams = HttpComponentKt.httpPostWithParams(this, URL_BINDING, linkedHashMap);
        if (!responseHttpPostWithParams.isSuccessful() || responseHttpPostWithParams.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpPostWithParams.code()));
            ResponseBody responseBodyErrorBody = responseHttpPostWithParams.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpPostWithParams, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(responseHttpPostWithParams.body().string(), new TypeToken<PayResponse<? extends Unit>>() { // from class: com.huami.nfc.watch.unionpay.api.impl.WatchUnionpayWebApiImpl$bindCard$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }

    @Override // com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi
    @NotNull
    public PayResponse<Unit> deleteCards(@NotNull List<String> aidList) {
        Object payResponse;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aids", WatchUnionpayWebApiImplKt.join$default(aidList, null, 1, null));
        Response<ResponseBody> responseHttpDelete = HttpComponentKt.httpDelete(this, URL_BINDING, linkedHashMap);
        if (!responseHttpDelete.isSuccessful() || responseHttpDelete.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpDelete.code()));
            ResponseBody responseBodyErrorBody = responseHttpDelete.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpDelete, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(responseHttpDelete.body().string(), new TypeToken<PayResponse<? extends Unit>>() { // from class: com.huami.nfc.watch.unionpay.api.impl.WatchUnionpayWebApiImpl$deleteCards$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }

    @Override // com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi
    @NotNull
    public PayResponse<List<BankCardBindStatus>> getBindCards() {
        Object payResponse;
        Response responseHttpGet$default = HttpComponentKt.httpGet$default(this, URL_BINDING, null, null, 6, null);
        if (!responseHttpGet$default.isSuccessful() || responseHttpGet$default.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpGet$default.code()));
            ResponseBody responseBodyErrorBody = responseHttpGet$default.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpGet$default, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(((ResponseBody) responseHttpGet$default.body()).string(), new TypeToken<PayResponse<? extends List<? extends BankCardBindStatus>>>() { // from class: com.huami.nfc.watch.unionpay.api.impl.WatchUnionpayWebApiImpl$getBindCards$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }

    @Override // com.huami.nfc.web.http.HttpComponent
    @NotNull
    public HttpEngine getEngine() {
        return HttpComponent.DefaultImpls.getEngine(this);
    }

    @Override // com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi
    @NotNull
    public PayResponse<String> getTsmDownloadUrl(@NotNull String appName) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("settingName", AppSettingsKeys.KEY_UNIONPAY_TSM_DOWNLOAD_URL);
        linkedHashMap.put("mode", "SINGLE");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Response responseHttpGet$default = HttpComponentKt.httpGet$default(this, String.format(URL_TSM_DOWNLOAD, Arrays.copyOf(new Object[]{appName}, 1)), linkedHashMap, null, 4, null);
        if (!responseHttpGet$default.isSuccessful()) {
            return new PayResponse<>(String.valueOf(responseHttpGet$default.code()), responseHttpGet$default.message(), "");
        }
        ResponseBody responseBody = (ResponseBody) responseHttpGet$default.body();
        return responseBody == null ? new PayResponse<>(String.valueOf(responseHttpGet$default.code()), "body is null", "") : PayResponse.Companion.success$default(PayResponse.INSTANCE, null, new JsonParser().parse(new JSONObject(responseBody.string()).getString(AppSettingsKeys.KEY_UNIONPAY_TSM_DOWNLOAD_URL)).getAsJsonObject().get("normal").getAsJsonObject().get("shortChain").getAsString(), 1, null);
    }
}
