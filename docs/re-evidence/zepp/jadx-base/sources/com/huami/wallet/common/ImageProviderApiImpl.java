package com.huami.wallet.common;

import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.web.http.HttpComponent;
import com.huami.nfc.web.http.HttpComponentKt;
import com.huami.nfc.web.http.HttpEngine;
import com.huami.wallet.common.api.ImageProviderApi;
import com.huami.wallet.common.entity.SupportMasterCountry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J,\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016J2\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00100\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/wallet/common/ImageProviderApiImpl;", "Lcom/huami/wallet/common/api/ImageProviderApi;", "Lcom/huami/nfc/web/http/HttpComponent;", "Lorg/json/JSONObject;", "json", "Lcom/huami/wallet/common/entity/SupportMasterCountry;", "a", "", "appName", "settingName", "key", "Lcom/huami/nfc/base/PayResponse;", "getImageUrlByKey", "mode", "", "getSupportMasterByKey", "", "getPreloadResInfo", "", "Ljava/util/Map;", "cacheMap", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
public final class ImageProviderApiImpl implements ImageProviderApi, HttpComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<String, String> cacheMap = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Response<ResponseBody> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Response<ResponseBody> response) {
            super(0);
            this.a = str;
            this.b = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "getPreloadResInfo: " + this.a + " : " + this.b.isSuccessful();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Response<ResponseBody> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Response<ResponseBody> response) {
            super(0);
            this.a = str;
            this.b = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "getPreloadResInfo: " + this.a + " : " + this.b.isSuccessful();
        }
    }

    private final SupportMasterCountry a(JSONObject json) {
        return new SupportMasterCountry(json.optString("country"), json.optString("router"));
    }

    @Override // com.huami.nfc.web.http.HttpComponent
    @NotNull
    public HttpEngine getEngine() {
        return HttpComponent.DefaultImpls.getEngine(this);
    }

    @Override // com.huami.wallet.common.api.ImageProviderApi
    @NotNull
    public PayResponse<String> getImageUrlByKey(@NotNull String appName, @NotNull String settingName, @NotNull String key) {
        Map<? extends String, ? extends String> map;
        if (!this.cacheMap.containsKey(key)) {
            PayResponse preloadResInfo$default = ImageProviderApi.DefaultImpls.getPreloadResInfo$default(this, appName, settingName, null, 4, null);
            if (preloadResInfo$default.isSuccessful() && (map = (Map) preloadResInfo$default.getData()) != null) {
                this.cacheMap.putAll(map);
            }
        }
        PayResponse.Companion companion = PayResponse.INSTANCE;
        String str = this.cacheMap.get(key);
        if (str == null) {
            str = "";
        }
        return PayResponse.Companion.success$default(companion, null, str, 1, null);
    }

    @Override // com.huami.wallet.common.api.ImageProviderApi
    @NotNull
    public PayResponse<Map<String, String>> getPreloadResInfo(@NotNull String appName, @NotNull String settingName, @NotNull String mode) {
        Response responseHttpGet$default = HttpComponentKt.httpGet$default(this, "/apps/" + appName + "/settings", r.mapOf(TuplesKt.to("settingName", settingName), TuplesKt.to("mode", mode)), null, 4, null);
        LogcatKt.info$default(Logcat.INSTANCE, null, new a(settingName, responseHttpGet$default), 1, null);
        if (!responseHttpGet$default.isSuccessful()) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpGet$default.code()));
            ResponseBody responseBodyErrorBody = responseHttpGet$default.errorBody();
            return new PayResponse<>(strStringPlus, responseBodyErrorBody == null ? null : responseBodyErrorBody.string(), null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ResponseBody responseBody = (ResponseBody) responseHttpGet$default.body();
            JSONObject jSONObject = new JSONObject(new JSONObject(responseBody == null ? null : responseBody.string()).optString(settingName));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.optJSONObject(next).optString("value", ""));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, linkedHashMap, 1, null);
    }

    @Override // com.huami.wallet.common.api.ImageProviderApi
    @NotNull
    public PayResponse<List<SupportMasterCountry>> getSupportMasterByKey(@NotNull String appName, @NotNull String settingName, @NotNull String mode) {
        int i = 0;
        Response responseHttpGet$default = HttpComponentKt.httpGet$default(this, "/apps/" + appName + "/settings", r.mapOf(TuplesKt.to("settingName", settingName), TuplesKt.to("mode", mode)), null, 4, null);
        LogcatKt.info$default(Logcat.INSTANCE, null, new b(settingName, responseHttpGet$default), 1, null);
        if (!responseHttpGet$default.isSuccessful()) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpGet$default.code()));
            ResponseBody responseBodyErrorBody = responseHttpGet$default.errorBody();
            return new PayResponse<>(strStringPlus, responseBodyErrorBody == null ? null : responseBodyErrorBody.string(), null);
        }
        ArrayList arrayList = new ArrayList();
        try {
            ResponseBody responseBody = (ResponseBody) responseHttpGet$default.body();
            JSONArray jSONArray = new JSONArray(new JSONObject(responseBody == null ? null : responseBody.string()).optString(settingName));
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i2 = i + 1;
                    SupportMasterCountry supportMasterCountryA = a(jSONArray.optJSONObject(i));
                    if (supportMasterCountryA != null) {
                        arrayList.add(supportMasterCountryA);
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, arrayList, 1, null);
    }
}
