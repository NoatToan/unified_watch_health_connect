package com.huami.nfc.eid;

import com.google.gson.reflect.TypeToken;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.eid.api.PostResultApi;
import com.huami.nfc.eid.entities.DeviceCertificate;
import com.huami.nfc.eid.entities.EidInfoEntity;
import com.huami.nfc.web.Constant;
import com.huami.nfc.web.http.HttpComponent;
import com.huami.nfc.web.http.HttpComponentKt;
import com.huami.nfc.web.http.HttpEngine;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0015"}, d2 = {"Lcom/huami/nfc/eid/PostResultApiImpl;", "Lcom/huami/nfc/eid/api/PostResultApi;", "Lcom/huami/nfc/web/http/HttpComponent;", "", "orderNum", "requestId", "eidLevel", "carrierType", "phoneNum", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "eidInfo", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/DeviceCertificate;", "getCertificate", "result", "errorCode", "idCarrier", "", "openStepTwo", "<init>", "()V", "nfc-eid_release"}, k = 1, mv = {1, 5, 1})
public final class PostResultApiImpl implements PostResultApi, HttpComponent {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ EidInfoEntity f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, String str5, EidInfoEntity eidInfoEntity) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = eidInfoEntity;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("bizSerialNo", this.a);
            jSONObject.put("requestId", this.b);
            jSONObject.put("eidLevel", this.c);
            jSONObject.put("carrierType", this.d);
            String str = this.e;
            if (!(str == null || str.length() == 0)) {
                jSONObject.put("mobile", this.d);
            }
            jSONObject.put("idCarrier", this.f.getIdCarrier());
            jSONObject.put("eidType", this.f.getEidType());
            jSONObject.put("publicKey", this.f.getPublicKey());
            jSONObject.put("eidSign", this.f.getEidSign());
            jSONObject.put("carrierPubKey", this.f.getCarrierPubKey());
            jSONObject.put("version", this.f.getVersion());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, String str4) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("bizSerialNo", this.a);
            jSONObject.put("result", this.b);
            jSONObject.put("errorCode", this.c);
            jSONObject.put("idCarrier", this.d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Override // com.huami.nfc.eid.api.PostResultApi
    @NotNull
    public PayResponse<DeviceCertificate> getCertificate(@NotNull String orderNum, @NotNull String requestId, @NotNull String eidLevel, @NotNull String carrierType, @Nullable String phoneNum, @NotNull EidInfoEntity eidInfo) {
        Object payResponse;
        Response responseHttpPost$default = HttpComponentKt.httpPost$default(this, "/nfc/eid/openStepOne", Constant.requestBody$default(null, new a(orderNum, requestId, eidLevel, carrierType, phoneNum, eidInfo), 1, null), null, 4, null);
        if (!responseHttpPost$default.isSuccessful() || responseHttpPost$default.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpPost$default.code()));
            ResponseBody responseBodyErrorBody = responseHttpPost$default.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpPost$default, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(((ResponseBody) responseHttpPost$default.body()).string(), new TypeToken<PayResponse<? extends DeviceCertificate>>() { // from class: com.huami.nfc.eid.PostResultApiImpl$getCertificate$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }

    @Override // com.huami.nfc.web.http.HttpComponent
    @NotNull
    public HttpEngine getEngine() {
        return HttpComponent.DefaultImpls.getEngine(this);
    }

    @Override // com.huami.nfc.eid.api.PostResultApi
    @NotNull
    public PayResponse<Unit> openStepTwo(@NotNull String orderNum, @NotNull String result, @NotNull String errorCode, @NotNull String idCarrier) {
        Object payResponse;
        Response responseHttpPost$default = HttpComponentKt.httpPost$default(this, "/nfc/eid/openStepTwo", Constant.requestBody$default(null, new b(orderNum, result, errorCode, idCarrier), 1, null), null, 4, null);
        if (!responseHttpPost$default.isSuccessful() || responseHttpPost$default.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpPost$default.code()));
            ResponseBody responseBodyErrorBody = responseHttpPost$default.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpPost$default, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(((ResponseBody) responseHttpPost$default.body()).string(), new TypeToken<PayResponse<? extends Unit>>() { // from class: com.huami.nfc.eid.PostResultApiImpl$openStepTwo$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }
}
