package com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer;

import aq2.c;
import aq2.d;
import com.garmin.feature.garminpay.providers.gpay.util.deserializers.AbstractDeserializer;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import fo2.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.c0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/util/deserializer/FitPayCountriesDeserializer;", "Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/AbstractDeserializer;", "Laq2/c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayCountriesDeserializer extends AbstractDeserializer<c> {
    public FitPayCountriesDeserializer() {
        super("FitPayCountriesDeserializer");
    }

    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Locale locale;
        JsonElement jsonElement2;
        JsonObject asJsonObject;
        JsonElement jsonElement3;
        JsonObject asJsonObject2;
        JsonElement jsonElement4;
        if (jsonElement == null) {
            a().error("deserialize: received null response for fitpay Countries request");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<String, JsonElement>> setEntrySet = jsonElement.getAsJsonObject().entrySet();
        setEntrySet.getClass();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            JsonElement jsonElement5 = ((JsonElement) entry.getValue()).getAsJsonObject().get("iso");
            String asString = jsonElement5 != null ? jsonElement5.getAsString() : null;
            JsonElement jsonElement6 = ((JsonElement) entry.getValue()).getAsJsonObject().get("name");
            String asString2 = jsonElement6 != null ? jsonElement6.getAsString() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JsonObject asJsonObject3 = ((JsonElement) entry.getValue()).getAsJsonObject();
            String asString3 = (asJsonObject3 == null || (jsonElement2 = asJsonObject3.get("_links")) == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null || (jsonElement3 = asJsonObject.get("provinces")) == null || (asJsonObject2 = jsonElement3.getAsJsonObject()) == null || (jsonElement4 = asJsonObject2.get("href")) == null) ? null : jsonElement4.getAsString();
            Set<Map.Entry<String, JsonElement>> setEntrySet2 = ((JsonElement) entry.getValue()).getAsJsonObject().get("names").getAsJsonObject().entrySet();
            setEntrySet2.getClass();
            Iterator<T> it3 = setEntrySet2.iterator();
            while (true) {
                int i14 = 0;
                if (it3.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it3.next();
                    Locale[] availableLocales = Locale.getAvailableLocales();
                    availableLocales.getClass();
                    int length = availableLocales.length;
                    while (true) {
                        if (i14 >= length) {
                            locale = null;
                            break;
                        }
                        locale = availableLocales[i14];
                        if (s.g(locale.getLanguage(), entry2.getKey())) {
                            break;
                        }
                        i14++;
                    }
                    String asString4 = ((JsonElement) entry2.getValue()).getAsString();
                    String string = asString4 != null ? asString4.toString() : null;
                    if (locale != null && string != null) {
                        linkedHashMap.put(locale, string);
                    }
                }
            }
            arrayList.add(new d(asString, asString2, new p(asString3, false, 2, null), linkedHashMap));
            c0.t(arrayList);
        }
        return new c(arrayList);
    }
}
