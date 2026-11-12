package com.huami.ednetwork.apiImpl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.ednetwork.EdResponse;
import com.huami.ednetwork.EdResponseHelperKt;
import com.huami.ednetwork.EdResponseHelperKt$fromJson$gson$2;
import com.huami.ednetwork.HmKeyManager;
import com.huami.ednetwork.WebConfigKt;
import com.huami.ednetwork.WhiteBoxKeyEntity;
import com.huami.ednetwork.api.WhiteBoxKeyApi;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.xiaomi.hm.health.Constant;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/ednetwork/apiImpl/HmWhiteBoxKeyApiImpl;", "Lcom/huami/ednetwork/api/WhiteBoxKeyApi;", "Lcom/huami/http/HttpKit;", "Lcom/huami/ednetwork/EdResponse;", "Lcom/huami/ednetwork/WhiteBoxKeyEntity;", "getWhiteBoxKey", "<init>", "()V", "ednetwork_release"}, k = 1, mv = {1, 4, 0})
public final class HmWhiteBoxKeyApiImpl implements WhiteBoxKeyApi, HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/json/JSONObject;", "", "a", "(Lorg/json/JSONObject;)V"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function1<JSONObject, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("wb_key", HmKeyManager.INSTANCE.getWebKey());
            jSONObject.put("provider", Constant.PAI_KEY_HIGH_ZONE_MINUTES);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.ednetwork.api.WhiteBoxKeyApi
    @NotNull
    public EdResponse<WhiteBoxKeyEntity> getWhiteBoxKey() {
        Object edResponse;
        Response responseHttpPost = HttpKitKtxKt.httpPost(this, "encryption/whiteBoxKey", EdResponseHelperKt.requestBody$default(null, a.a, 1, null), null, WebConfigKt.getWebHeader().invoke());
        if (!responseHttpPost.isSuccessful() || responseHttpPost.body() == null) {
            int iCode = responseHttpPost.code();
            ResponseBody responseBodyBody = responseHttpPost.body();
            edResponse = new EdResponse(iCode, responseBodyBody != null ? responseBodyBody.string() : null, null);
        } else {
            ResponseBody responseBodyBody2 = responseHttpPost.body();
            if (responseBodyBody2 == null) {
                Intrinsics.throwNpe();
            }
            edResponse = ((Gson) LazyKt__LazyJVMKt.lazy(EdResponseHelperKt$fromJson$gson$2.INSTANCE).getValue()).fromJson(responseBodyBody2.string(), new TypeToken<EdResponse<? extends WhiteBoxKeyEntity>>() { // from class: com.huami.ednetwork.apiImpl.HmWhiteBoxKeyApiImpl$getWhiteBoxKey$$inlined$asEdResponse$1
            }.getType());
        }
        return (EdResponse) edResponse;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
