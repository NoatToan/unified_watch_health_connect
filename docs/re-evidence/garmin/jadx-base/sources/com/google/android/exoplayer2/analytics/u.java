package com.google.android.exoplayer2.analytics;

import com.garmin.android.gncs.NotificationConstants;
import com.garmin.feature.garminpay.providers.felica.exception.GooglePayException;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentDataRequest;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class u implements ListenerSet.Event, q03.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f52957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52958b;

    public /* synthetic */ u(Object obj, float f14) {
        this.f52958b = obj;
        this.f52957a = f14;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Map] */
    @Override // q03.e
    public void f(z03.c.a aVar) throws GooglePayException {
        JSONObject jSONObject;
        un2.a aVar2 = (un2.a) this.f52958b;
        Logger logger = un2.a.f172058d;
        un2.b bVar = aVar2.f172060b;
        String strValueOf = String.valueOf(this.f52957a);
        bVar.getClass();
        strValueOf.getClass();
        try {
            jSONObject = new JSONObject(bVar.f172063b.toString());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObjectA = bVar.a();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(NotificationConstants.KEY_DATA_MIME_TYPE, "PAYMENT_GATEWAY");
            jSONObject2.put("parameters", new JSONObject((Map) bVar.f172064c));
            jSONObjectA.put("tokenizationSpecification", jSONObject2);
            jSONObject.put("allowedPaymentMethods", jSONArray.put(jSONObjectA));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("totalPrice", strValueOf);
            jSONObject3.put("totalPriceStatus", "FINAL");
            jSONObject3.put("currencyCode", bVar.f172062a.getCurrencyCode());
            jSONObject.put("transactionInfo", jSONObject3);
            JSONObject jSONObjectPut = new JSONObject().put("merchantName", "Example Merchant");
            jSONObjectPut.getClass();
            jSONObject.put("merchantInfo", jSONObjectPut);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            throw new GooglePayException("requestPayment: Json error");
        }
        PaymentDataRequest paymentDataRequestFromJson = PaymentDataRequest.fromJson(jSONObject.toString());
        if (paymentDataRequestFromJson == null) {
            throw new GooglePayException("requestPayment: request build failed");
        }
        AutoResolveHelper.resolveTask(aVar2.f172061c.loadPaymentData(paymentDataRequestFromJson), aVar2.f172059a, 51887);
        aVar.a();
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onVolumeChanged((AnalyticsListener.EventTime) this.f52958b, this.f52957a);
    }
}
