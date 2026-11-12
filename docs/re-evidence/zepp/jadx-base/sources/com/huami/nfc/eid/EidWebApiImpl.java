package com.huami.nfc.eid;

import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.reflect.TypeToken;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.NfcChannelExtensionsKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.bus.ConstantKt;
import com.huami.nfc.eid.api.EidAppletApi;
import com.huami.nfc.eid.api.EidDeviceApi;
import com.huami.nfc.eid.api.EidWebApi;
import com.huami.nfc.eid.api.PostResultApi;
import com.huami.nfc.eid.entities.DeviceCertificate;
import com.huami.nfc.eid.entities.EidDigitalInfo;
import com.huami.nfc.eid.entities.EidInfoEntity;
import com.huami.nfc.eid.entities.EidStatus;
import com.huami.nfc.web.http.HttpComponent;
import com.huami.nfc.web.http.HttpComponentKt;
import com.huami.nfc.web.http.HttpEngine;
import com.unionpay.tsmservice.data.Constant;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'¢\u0006\u0004\b+\u0010,J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016J@\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0016R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/huami/nfc/eid/EidWebApiImpl;", "Lcom/huami/nfc/eid/api/EidWebApi;", "Lcom/huami/nfc/web/http/HttpComponent;", "", "queryType", "requestId", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/EidStatus;", "getEidStatus", "bizSerialNumber", Constant.KEY_SESSION_KEY, "image", "imageType", "", "auth", "issueEid", "deleteEid", "eidLevel", "carrierType", "phoneNum", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "eidInfo", "", "postResult", "Lcom/huami/nfc/eid/entities/EidDigitalInfo;", "getEidQrCode", "revoke", "Lcom/huami/nfc/eid/api/PostResultApi;", "a", "Lcom/huami/nfc/eid/api/PostResultApi;", "postResultApi", "Lcom/huami/nfc/eid/api/EidDeviceApi;", "b", "Lcom/huami/nfc/eid/api/EidDeviceApi;", "deviceApi", "Lcom/huami/nfc/eid/api/EidAppletApi;", "c", "Lcom/huami/nfc/eid/api/EidAppletApi;", "appletApi", "Lcom/huami/nfc/base/INfcChannel;", GoogleApiAvailabilityLight.a, "Lcom/huami/nfc/base/INfcChannel;", "channel", "<init>", "(Lcom/huami/nfc/eid/api/PostResultApi;Lcom/huami/nfc/eid/api/EidDeviceApi;Lcom/huami/nfc/eid/api/EidAppletApi;Lcom/huami/nfc/base/INfcChannel;)V", "nfc-eid_release"}, k = 1, mv = {1, 5, 1})
public final class EidWebApiImpl implements EidWebApi, HttpComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PostResultApi postResultApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final EidDeviceApi deviceApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final EidAppletApi appletApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel channel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, String str5) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("bizSerialNo", this.a);
            jSONObject.put("requestId", this.b);
            jSONObject.put("deSkey", this.c);
            jSONObject.put("userImage", this.d);
            jSONObject.put("userImageType", this.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return EidWebApiImpl.this.appletApi.deleteEid(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return EidWebApiImpl.this.appletApi.issueEid(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<JSONObject, Unit> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put(ConstantKt.KEY_APP_CODE, ConsatntKt.APP_CODE_EID);
            jSONObject.put("product_sub_type", "1");
            jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "revoke");
            jSONObject.put("bizSerialNo", "");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    public EidWebApiImpl(@NotNull PostResultApi postResultApi, @NotNull EidDeviceApi eidDeviceApi, @NotNull EidAppletApi eidAppletApi, @NotNull INfcChannel iNfcChannel) {
        this.postResultApi = postResultApi;
        this.deviceApi = eidDeviceApi;
        this.appletApi = eidAppletApi;
        this.channel = iNfcChannel;
    }

    @Override // com.huami.nfc.eid.api.EidWebApi
    @NotNull
    public PayResponse<Unit> auth(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull String sessionKey, @NotNull String image, @NotNull String imageType) {
        Object payResponse;
        Response responseHttpPost$default = HttpComponentKt.httpPost$default(this, "/nfc/eid/faceCompare", com.huami.nfc.web.Constant.requestBody$default(null, new a(bizSerialNumber, requestId, sessionKey, image, imageType), 1, null), null, 4, null);
        if (!responseHttpPost$default.isSuccessful() || responseHttpPost$default.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpPost$default.code()));
            ResponseBody responseBodyErrorBody = responseHttpPost$default.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpPost$default, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(((ResponseBody) responseHttpPost$default.body()).string(), new TypeToken<PayResponse<? extends Unit>>() { // from class: com.huami.nfc.eid.EidWebApiImpl$auth$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }

    @Override // com.huami.nfc.eid.api.EidAppletApi
    @NotNull
    public PayResponse<Unit> deleteEid(@NotNull String bizSerialNumber) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.channel, new b(bizSerialNumber));
    }

    @Override // com.huami.nfc.eid.api.EidWebApi
    @NotNull
    public PayResponse<EidDigitalInfo> getEidQrCode() {
        Object payResponse;
        Response responseHttpGet$default = HttpComponentKt.httpGet$default(this, "/nfc/eid/qrCode", null, null, 6, null);
        if (!responseHttpGet$default.isSuccessful() || responseHttpGet$default.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpGet$default.code()));
            ResponseBody responseBodyErrorBody = responseHttpGet$default.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpGet$default, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(((ResponseBody) responseHttpGet$default.body()).string(), new TypeToken<PayResponse<? extends EidDigitalInfo>>() { // from class: com.huami.nfc.eid.EidWebApiImpl$getEidQrCode$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }

    @Override // com.huami.nfc.eid.api.EidWebApi
    @NotNull
    public PayResponse<EidStatus> getEidStatus(@NotNull String queryType, @Nullable String requestId) {
        Object payResponse;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("queryType", queryType);
        if (requestId != null) {
            linkedHashMap.put("requestId", requestId);
        }
        Response responseHttpGet$default = HttpComponentKt.httpGet$default(this, "/nfc/eid/info", linkedHashMap, null, 4, null);
        if (!responseHttpGet$default.isSuccessful() || responseHttpGet$default.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpGet$default.code()));
            ResponseBody responseBodyErrorBody = responseHttpGet$default.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpGet$default, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(((ResponseBody) responseHttpGet$default.body()).string(), new TypeToken<PayResponse<? extends EidStatus>>() { // from class: com.huami.nfc.eid.EidWebApiImpl$getEidStatus$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }

    @Override // com.huami.nfc.web.http.HttpComponent
    @NotNull
    public HttpEngine getEngine() {
        return HttpComponent.DefaultImpls.getEngine(this);
    }

    @Override // com.huami.nfc.eid.api.EidAppletApi
    @NotNull
    public PayResponse<Unit> issueEid(@NotNull String bizSerialNumber) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.channel, new c(bizSerialNumber));
    }

    @Override // com.huami.nfc.eid.api.EidWebApi
    @NotNull
    public PayResponse<Boolean> postResult(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull String eidLevel, @NotNull String carrierType, @Nullable String phoneNum, @NotNull EidInfoEntity eidInfo) {
        PayResponse<DeviceCertificate> certificate = this.postResultApi.getCertificate(bizSerialNumber, requestId, eidLevel, carrierType, phoneNum, eidInfo);
        if (!certificate.isSuccessful() || certificate.getData() == null) {
            return PayResponse.INSTANCE.error("", Intrinsics.stringPlus("获取证书命令失败(网络)|", certificate.getMessage()));
        }
        PayResponse<String> payResponseWriteCert = this.deviceApi.writeCert(certificate.getData().getCertCmd());
        if (payResponseWriteCert.isSuccessful()) {
            this.postResultApi.openStepTwo(bizSerialNumber, "1", "FF", eidInfo.getIdCarrier());
            return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.TRUE, 1, null);
        }
        this.postResultApi.openStepTwo(bizSerialNumber, "0", payResponseWriteCert.getData(), eidInfo.getIdCarrier());
        return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.FALSE, 1, null);
    }

    @Override // com.huami.nfc.eid.api.EidWebApi
    @NotNull
    public PayResponse<Unit> revoke() {
        Object payResponse;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x-snbps-product-type", ConsatntKt.EID_PRODUCT_TYPE);
        Response<ResponseBody> responseHttpPost = HttpComponentKt.httpPost(this, "/nfc/card/init", com.huami.nfc.web.Constant.requestBody$default(null, d.a, 1, null), linkedHashMap);
        if (!responseHttpPost.isSuccessful() || responseHttpPost.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpPost.code()));
            ResponseBody responseBodyErrorBody = responseHttpPost.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpPost, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(responseHttpPost.body().string(), new TypeToken<PayResponse<? extends Unit>>() { // from class: com.huami.nfc.eid.EidWebApiImpl$revoke$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }
}
