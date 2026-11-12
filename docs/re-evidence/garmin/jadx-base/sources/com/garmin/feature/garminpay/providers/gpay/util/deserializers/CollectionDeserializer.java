package com.garmin.feature.garminpay.providers.gpay.util.deserializers;

import android.os.Parcelable;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.maps.MapboxMap;
import fo2.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/CollectionDeserializer;", "Landroid/os/Parcelable;", "K", "Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/AbstractDeserializer;", "Lfo2/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CollectionDeserializer<K extends Parcelable> extends AbstractDeserializer<b<K>> {
    public CollectionDeserializer() {
        super("CollectionDeserializer");
    }

    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Parcelable parcelable;
        if (jsonElement == null || jsonDeserializationContext == null) {
            a().error("deserialize: received null response from the server");
            return null;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        Links links = (Links) jsonDeserializationContext.deserialize(asJsonObject.get("_links"), Links.class);
        int asInt = asJsonObject.get(MapboxMap.QFE_LIMIT).getAsInt();
        int asInt2 = asJsonObject.get(MapboxMap.QFE_OFFSET).getAsInt();
        int asInt3 = asJsonObject.get("totalResults").getAsInt();
        JsonArray asJsonArray = asJsonObject.getAsJsonArray("results");
        asJsonArray.getClass();
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement2 : asJsonArray) {
            try {
                type.getClass();
                parcelable = (Parcelable) jsonDeserializationContext.deserialize(jsonElement2, ((ParameterizedType) type).getActualTypeArguments()[0]);
            } catch (Throwable th3) {
                a().warn("Error while parsing " + jsonElement2 + ", ignore it", th3);
                parcelable = null;
            }
            if (parcelable != null) {
                arrayList.add(parcelable);
            }
        }
        links.getClass();
        return new b(links, asInt, asInt2, asInt3, arrayList);
    }
}
