package com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer;

import aq2.f;
import aq2.g;
import com.garmin.feature.garminpay.providers.gpay.util.deserializers.AbstractDeserializer;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/util/deserializer/FitPayStateDeserializer;", "Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/AbstractDeserializer;", "Laq2/g;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayStateDeserializer extends AbstractDeserializer<g> {
    public FitPayStateDeserializer() {
        super("FitPayStateDeserializer");
    }

    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject asJsonObject;
        Locale locale;
        if (jsonElement == null) {
            a().error("deserialize: received null response for fitpay states request");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JsonElement jsonElement2 = jsonElement.getAsJsonObject().get("provinces");
        if (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) {
            a().error("deserialize: provinces object is null");
            return null;
        }
        Set<Map.Entry<String, JsonElement>> setEntrySet = asJsonObject.entrySet();
        setEntrySet.getClass();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            JsonElement jsonElement3 = ((JsonElement) entry.getValue()).getAsJsonObject().get("iso");
            String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
            JsonElement jsonElement4 = ((JsonElement) entry.getValue()).getAsJsonObject().get("name");
            String asString2 = jsonElement4 != null ? jsonElement4.getAsString() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set<Map.Entry<String, JsonElement>> setEntrySet2 = ((JsonElement) entry.getValue()).getAsJsonObject().get("names").getAsJsonObject().entrySet();
            setEntrySet2.getClass();
            Iterator<T> it3 = setEntrySet2.iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                Locale[] availableLocales = Locale.getAvailableLocales();
                availableLocales.getClass();
                int length = availableLocales.length;
                int i14 = 0;
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
                String asString3 = ((JsonElement) entry2.getValue()).getAsString();
                String string = asString3 != null ? asString3.toString() : null;
                if (locale != null && string != null) {
                    linkedHashMap.put(locale, string);
                }
            }
            arrayList.add(new f(asString, asString2, linkedHashMap));
            c0.t(arrayList);
        }
        return new g(arrayList);
    }
}
