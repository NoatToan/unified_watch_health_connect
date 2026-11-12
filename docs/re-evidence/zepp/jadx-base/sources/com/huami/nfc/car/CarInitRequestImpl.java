package com.huami.nfc.car;

import com.google.gson.reflect.TypeToken;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.web.Constant;
import com.huami.nfc.web.InitRequestApi;
import com.huami.nfc.web.entity.ApduScript;
import com.huami.nfc.web.http.HttpComponent;
import com.huami.nfc.web.http.HttpComponentKt;
import com.huami.nfc.web.http.HttpEngine;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/nfc/car/CarInitRequestImpl;", "Lcom/huami/nfc/web/InitRequestApi;", "Lcom/huami/nfc/web/http/HttpComponent;", "", "", "", SportAnalytics.ParamValue.MapButtonType.MAP, "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/web/entity/ApduScript;", "initApdu", "requestApdu", "<init>", "()V", "nfc-car_release"}, k = 1, mv = {1, 5, 1})
public final class CarInitRequestImpl implements InitRequestApi, HttpComponent {
    @Override // com.huami.nfc.web.http.HttpComponent
    @NotNull
    public HttpEngine getEngine() {
        return HttpComponent.DefaultImpls.getEngine(this);
    }

    @Override // com.huami.nfc.web.InitRequestApi
    @NotNull
    public PayResponse<ApduScript> initApdu(@NotNull Map<String, Object> map) {
        Object payResponse;
        Response<ResponseBody> responseHttpPost = HttpComponentKt.httpPost(this, "/nfc/card/init", Constant.requestBody(map), ConstantKt.getHEADERS());
        if (!responseHttpPost.isSuccessful() || responseHttpPost.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpPost.code()));
            ResponseBody responseBodyErrorBody = responseHttpPost.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpPost, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(responseHttpPost.body().string(), new TypeToken<PayResponse<? extends ApduScript>>() { // from class: com.huami.nfc.car.CarInitRequestImpl$initApdu$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }

    @Override // com.huami.nfc.web.InitRequestApi
    @NotNull
    public PayResponse<ApduScript> requestApdu(@NotNull Map<String, Object> map) {
        Object payResponse;
        Response<ResponseBody> responseHttpPost = HttpComponentKt.httpPost(this, "/nfc/card/request", Constant.requestBody(map), ConstantKt.getHEADERS());
        if (!responseHttpPost.isSuccessful() || responseHttpPost.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpPost.code()));
            ResponseBody responseBodyErrorBody = responseHttpPost.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpPost, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(responseHttpPost.body().string(), new TypeToken<PayResponse<? extends ApduScript>>() { // from class: com.huami.nfc.car.CarInitRequestImpl$requestApdu$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }
}
