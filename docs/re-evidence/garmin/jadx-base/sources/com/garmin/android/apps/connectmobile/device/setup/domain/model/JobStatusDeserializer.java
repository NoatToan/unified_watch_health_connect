package com.garmin.android.apps.connectmobile.device.setup.domain.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/setup/domain/model/JobStatusDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/device/setup/domain/model/a$b;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JobStatusDeserializer implements JsonDeserializer<a.b> {
    @Override // com.google.gson.JsonDeserializer
    public final a.b deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Object next;
        com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
        a.b.C0571a c0571a = a.b.f33773b;
        int asInt = jsonElement.getAsInt();
        c0571a.getClass();
        Iterator<T> it = a.b.f33780i.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((a.b) next).f33781a == asInt) {
                return (a.b) next;
            }
        }
        next = null;
        return (a.b) next;
    }
}
