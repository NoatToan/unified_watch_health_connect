package com.garmin.feature.garminpay.providers.gpay.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o13.p;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.u0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@JsonAdapter(Adapter.class)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB3\u0012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "Ljava/io/Serializable;", "", "Lo13/p;", "", "Lfo2/p;", "pairs", "<init>", "([Lo13/p;)V", "Adapter", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Links implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f51142a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/model/Links$Adapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Adapter implements JsonDeserializer<Links>, JsonSerializer<Links> {
        @Override // com.google.gson.JsonDeserializer
        public final Links deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            jsonElement.getClass();
            type.getClass();
            jsonDeserializationContext.getClass();
            Set<Map.Entry<String, JsonElement>> setEntrySet = jsonElement.getAsJsonObject().entrySet();
            setEntrySet.getClass();
            Set<Map.Entry<String, JsonElement>> set = setEntrySet;
            ArrayList arrayList = new ArrayList(y.r(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new p(entry.getKey(), jsonDeserializationContext.deserialize((JsonElement) entry.getValue(), fo2.p.class)));
            }
            p[] pVarArr = (p[]) arrayList.toArray(new p[0]);
            return new Links((p[]) Arrays.copyOf(pVarArr, pVarArr.length));
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(Links links, Type type, JsonSerializationContext jsonSerializationContext) {
            Links links2 = links;
            links2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry entry : links2.f51142a.entrySet()) {
                jsonObject.add((String) entry.getKey(), jsonSerializationContext.serialize(entry.getValue()));
            }
            return jsonObject;
        }
    }

    public Links(p<String, fo2.p>... pVarArr) {
        pVarArr.getClass();
        this.f51142a = u0.e((p[]) Arrays.copyOf(pVarArr, pVarArr.length));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final fo2.p a(String str) {
        return (fo2.p) this.f51142a.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Links) {
            return s.g(this.f51142a, ((Links) obj).f51142a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51142a.hashCode();
    }

    public final String toString() {
        return e.f("Links(", ")", this.f51142a);
    }
}
