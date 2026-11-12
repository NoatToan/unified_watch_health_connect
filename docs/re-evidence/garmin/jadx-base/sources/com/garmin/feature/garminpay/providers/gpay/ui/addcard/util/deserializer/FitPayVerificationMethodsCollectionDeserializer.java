package com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer;

import aq2.j;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import dq2.f;
import dq2.g;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/util/deserializer/FitPayVerificationMethodsCollectionDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Ldq2/g;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayVerificationMethodsCollectionDeserializer implements JsonDeserializer<g> {
    @Override // com.google.gson.JsonDeserializer
    public final g deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        ArrayList arrayList = new ArrayList();
        if (jsonElement == null) {
            return null;
        }
        try {
            JsonArray asJsonArray = jsonElement.getAsJsonObject().getAsJsonArray("verificationMethods");
            JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("creditCardId");
            String asString = jsonElement2 != null ? jsonElement2.getAsString() : null;
            asJsonArray.getClass();
            for (JsonElement jsonElement3 : asJsonArray) {
                j.f12491a.getClass();
                f fVar = (f) j.d().fromJson(jsonElement3, f.class);
                fVar.getClass();
                arrayList.add(fVar);
            }
            return new g(asString, arrayList);
        } catch (Exception unused) {
            return null;
        }
    }
}
