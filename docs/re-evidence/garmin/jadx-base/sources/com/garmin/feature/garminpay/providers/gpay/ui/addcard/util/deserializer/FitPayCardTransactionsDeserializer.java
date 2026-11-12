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
import p13.j0;
import vp2.c;
import vp2.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/util/deserializer/FitPayCardTransactionsDeserializer;", "Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/AbstractDeserializer;", "Lvp2/d;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayCardTransactionsDeserializer extends AbstractDeserializer<d> {
    public FitPayCardTransactionsDeserializer() {
        super("FitPayCardTransactionsDeserializer");
    }

    public final ArrayList b(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : jsonArray) {
            try {
                j.f12491a.getClass();
                c cVar = (c) j.d().fromJson(jsonElement, c.class);
                cVar.getClass();
                arrayList.add(cVar);
            } catch (Exception unused) {
                a().error("deserialize: failed to pass one of the transaction, skipping it");
            }
        }
        return arrayList;
    }

    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject asJsonObject;
        JsonElement jsonElement2;
        JsonObject asJsonObject2;
        JsonElement jsonElement3;
        if (jsonElement == null) {
            a().error("deserialize: received null response for card transaction request");
            return null;
        }
        try {
            JsonObject asJsonObject3 = jsonElement.getAsJsonObject();
            JsonElement jsonElement4 = asJsonObject3.get("_links");
            p pVar = new p((jsonElement4 == null || (asJsonObject = jsonElement4.getAsJsonObject()) == null || (jsonElement2 = asJsonObject.get("self")) == null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null || (jsonElement3 = asJsonObject2.get("href")) == null) ? null : jsonElement3.getAsString(), false, 2, null);
            if (!asJsonObject3.has("results")) {
                return new d(pVar, j0.f134944a);
            }
            JsonArray asJsonArray = asJsonObject3.getAsJsonArray("results");
            asJsonArray.getClass();
            return new d(pVar, b(asJsonArray));
        } catch (Exception e4) {
            a().debug("deserialize: ", (Throwable) e4);
            return null;
        }
    }
}
