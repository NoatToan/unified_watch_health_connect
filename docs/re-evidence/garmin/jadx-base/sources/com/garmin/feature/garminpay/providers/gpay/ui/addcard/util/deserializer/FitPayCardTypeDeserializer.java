package com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer;

import com.garmin.feature.garminpay.providers.gpay.util.deserializers.AbstractDeserializer;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import d53.t;
import d53.w;
import ep2.a;
import ep2.b;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/util/deserializer/FitPayCardTypeDeserializer;", "Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/AbstractDeserializer;", "Lep2/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayCardTypeDeserializer extends AbstractDeserializer<b> {
    public FitPayCardTypeDeserializer() {
        super("CardTypeDeserializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Integer numI;
        String str;
        String str2;
        JsonArray asJsonArray;
        JsonArray asJsonArray2;
        JsonArray asJsonArray3;
        JsonArray asJsonArray4;
        if (jsonElement == null) {
            a().error("deserialize: received null response for card type request");
            return null;
        }
        try {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            JsonElement jsonElement2 = asJsonObject.get("cardType");
            String asString = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = asJsonObject.get("cvvLength");
            Integer numValueOf = jsonElement3 != null ? Integer.valueOf(jsonElement3.getAsInt()) : null;
            JsonElement jsonElement4 = asJsonObject.get("cvvRequired");
            Boolean boolValueOf = jsonElement4 != null ? Boolean.valueOf(jsonElement4.getAsBoolean()) : null;
            JsonElement jsonElement5 = asJsonObject.get("displayName");
            String asString2 = jsonElement5 != null ? jsonElement5.getAsString() : null;
            JsonElement jsonElement6 = asJsonObject.get("logoUrl");
            String asString3 = jsonElement6 != null ? jsonElement6.getAsString() : null;
            ArrayList arrayList = new ArrayList();
            JsonElement jsonElement7 = asJsonObject.get("binRanges");
            int i14 = 2;
            if (jsonElement7 != null && (asJsonArray4 = jsonElement7.getAsJsonArray()) != null) {
                Iterator<JsonElement> it = asJsonArray4.iterator();
                while (it.hasNext()) {
                    String asString4 = it.next().getAsString();
                    asString4.getClass();
                    List listW = w.W(asString4, new String[]{"-"});
                    arrayList.add(new p(listW.get(0), listW.size() == 2 ? (String) listW.get(1) : null));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            JsonElement jsonElement8 = asJsonObject.get("capabilities");
            if (jsonElement8 != null && (asJsonArray3 = jsonElement8.getAsJsonArray()) != null) {
                for (JsonElement jsonElement9 : asJsonArray3) {
                    try {
                        String asString5 = jsonElement9.getAsString();
                        asString5.getClass();
                        arrayList2.add(a.valueOf(asString5));
                    } catch (IllegalArgumentException unused) {
                        a().error("Capability not found: " + jsonElement9);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            JsonElement jsonElement10 = asJsonObject.get("lengths");
            if (jsonElement10 != null && (asJsonArray2 = jsonElement10.getAsJsonArray()) != null) {
                Iterator<JsonElement> it3 = asJsonArray2.iterator();
                while (it3.hasNext()) {
                    String asString6 = it3.next().getAsString();
                    asString6.getClass();
                    List listW2 = w.W(asString6, new String[]{"-"});
                    arrayList3.add(new p(listW2.get(0), listW2.size() == i14 ? (String) listW2.get(1) : null));
                    i14 = 2;
                }
            }
            JsonElement jsonElement11 = asJsonObject.get("priority");
            Integer numValueOf2 = jsonElement11 != null ? Integer.valueOf(jsonElement11.getAsInt()) : null;
            ArrayList arrayList4 = new ArrayList();
            JsonElement jsonElement12 = asJsonObject.get("panFormat");
            if (jsonElement12 != null && (asJsonArray = jsonElement12.getAsJsonArray()) != null) {
                Iterator<JsonElement> it4 = asJsonArray.iterator();
                while (it4.hasNext()) {
                    String string = it4.next().toString();
                    string.getClass();
                    arrayList4.add(Integer.valueOf(Integer.parseInt(string) + 1));
                }
            }
            JsonElement jsonElement13 = asJsonObject.get("maxLength");
            Integer numValueOf3 = jsonElement13 != null ? Integer.valueOf(jsonElement13.getAsInt()) : null;
            JsonElement jsonElement14 = asJsonObject.get("minLength");
            Integer numValueOf4 = jsonElement14 != null ? Integer.valueOf(jsonElement14.getAsInt()) : null;
            p pVar = (p) h0.d0(arrayList3);
            Integer numI2 = (pVar == null || (str2 = (String) pVar.f128594a) == null) ? null : t.i(str2);
            if (pVar == null || (str = (String) pVar.f128595b) == null || (numI = t.i(str)) == null) {
                numI = numI2;
            }
            Integer num = numValueOf3;
            if (num != null) {
                numI = num;
            }
            return new b(asString, numValueOf, boolValueOf, asString2, asString3, arrayList, arrayList2, pVar, numValueOf2, arrayList4, numI, numValueOf4 == null ? numI2 : numValueOf4);
        } catch (Exception e4) {
            a().error("deserialize: " + e4);
            return null;
        }
    }
}
