package com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer;

import aq2.j;
import com.garmin.feature.garminpay.providers.gpay.util.deserializers.AbstractDeserializer;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import fo2.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p005kotlin.Metadata;
import yo2.b;
import yo2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/util/deserializer/FitPayCreditCardCollectionDeserializer;", "Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/AbstractDeserializer;", "Lyo2/f;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayCreditCardCollectionDeserializer extends AbstractDeserializer<f> {
    public FitPayCreditCardCollectionDeserializer() {
        super("CreditCardCollectionDeserializer");
    }

    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject asJsonObject;
        JsonElement jsonElement2;
        JsonObject asJsonObject2;
        JsonElement jsonElement3;
        ArrayList arrayList = new ArrayList();
        try {
            if (jsonElement == null) {
                a().error("deserialize: received null response from the server for creditcard");
                return null;
            }
            JsonElement jsonElement4 = jsonElement.getAsJsonObject().get("_links");
            p pVar = new p((jsonElement4 == null || (asJsonObject = jsonElement4.getAsJsonObject()) == null || (jsonElement2 = asJsonObject.get("self")) == null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null || (jsonElement3 = asJsonObject2.get("href")) == null) ? null : jsonElement3.getAsString(), false);
            JsonElement jsonElement5 = jsonElement.getAsJsonObject().get("totalResults");
            Long lValueOf = jsonElement5 != null ? Long.valueOf(jsonElement5.getAsLong()) : null;
            JsonArray asJsonArray = jsonElement.getAsJsonObject().getAsJsonArray("results");
            asJsonArray.getClass();
            for (JsonElement jsonElement6 : asJsonArray) {
                j.f12491a.getClass();
                b bVar = (b) j.d().fromJson(jsonElement6, b.class);
                bVar.getClass();
                arrayList.add(bVar);
            }
            return new f(pVar, lValueOf, arrayList);
        } catch (Exception e4) {
            a().debug("deserialize:", (Throwable) e4);
            return null;
        }
    }
}
