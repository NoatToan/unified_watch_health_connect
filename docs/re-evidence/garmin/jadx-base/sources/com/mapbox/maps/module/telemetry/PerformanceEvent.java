package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 &2\u00020\u0001:\u0002&'B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J0\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0\u000b0\u001f\"\u0004\b\u0000\u0010 2\b\u0010!\u001a\u0004\u0018\u00010\u00052\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0002J\u0012\u0010$\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010%\u001a\u00020\u0005H\u0016R$\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lcom/mapbox/maps/module/telemetry/PerformanceEvent;", "Lcom/mapbox/maps/module/telemetry/MapBaseEvent;", "phoneState", "Lcom/mapbox/maps/module/telemetry/PhoneState;", "sessionId", "", "bundle", "Landroid/os/Bundle;", "(Lcom/mapbox/maps/module/telemetry/PhoneState;Ljava/lang/String;Landroid/os/Bundle;)V", "attributes", "", "Lcom/mapbox/maps/module/telemetry/PerformanceEvent$PerformanceAttribute;", "getAttributes", "()Ljava/util/List;", "counters", "", "getCounters", TtmlNode.TAG_METADATA, "Lcom/google/gson/JsonObject;", "getMetadata", "()Lcom/google/gson/JsonObject;", "getSessionId", "()Ljava/lang/String;", "equals", "", "other", "", "getEventName", "hashCode", "", "initList", "Ljava/util/ArrayList;", "T", "fromString", "typeToken", "Lcom/google/gson/reflect/TypeToken;", "initMetaData", "toString", "Companion", "PerformanceAttribute", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"ParcelCreator"})
public final class PerformanceEvent extends MapBaseEvent {
    private static final String PERFORMANCE_TRACE = "mobile.performance_trace";

    @SerializedName("attributes")
    private final List<PerformanceAttribute<String>> attributes;

    @SerializedName("counters")
    private final List<PerformanceAttribute<Double>> counters;

    @SerializedName(TtmlNode.TAG_METADATA)
    private final JsonObject metadata;

    @SerializedName("sessionId")
    private final String sessionId;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/module/telemetry/PerformanceEvent$PerformanceAttribute;", "T", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Object;", "equals", "", "other", "hashCode", "", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PerformanceAttribute<T> {
        private final String name;
        private final T value;

        public PerformanceAttribute(String str, T t7) {
            this.name = str;
            this.value = t7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !PerformanceAttribute.class.equals(other.getClass())) {
                return false;
            }
            PerformanceAttribute performanceAttribute = (PerformanceAttribute) other;
            if (s.g(this.name, performanceAttribute.name)) {
                return s.g(this.value, performanceAttribute.value);
            }
            return false;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            T t7 = this.value;
            return iHashCode + (t7 != null ? t7.hashCode() : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceEvent(PhoneState phoneState, String str, Bundle bundle) {
        super(phoneState);
        phoneState.getClass();
        bundle.getClass();
        this.sessionId = str;
        this.attributes = initList(bundle.getString("attributes"), new TypeToken<ArrayList<PerformanceAttribute<String>>>() { // from class: com.mapbox.maps.module.telemetry.PerformanceEvent.1
        });
        this.counters = initList(bundle.getString("counters"), new TypeToken<ArrayList<PerformanceAttribute<Double>>>() { // from class: com.mapbox.maps.module.telemetry.PerformanceEvent.2
        });
        this.metadata = initMetaData(bundle.getString(TtmlNode.TAG_METADATA));
    }

    private final <T> ArrayList<PerformanceAttribute<T>> initList(String fromString, TypeToken<?> typeToken) {
        if (fromString == null || fromString.length() == 0) {
            return new ArrayList<>();
        }
        Object objFromJson = new Gson().fromJson(fromString, typeToken.getType());
        objFromJson.getClass();
        return (ArrayList) objFromJson;
    }

    private final JsonObject initMetaData(String fromString) {
        if (fromString == null) {
            return new JsonObject();
        }
        Object objFromJson = new Gson().fromJson(fromString, (Class<Object>) JsonObject.class);
        objFromJson.getClass();
        return (JsonObject) objFromJson;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !PerformanceEvent.class.equals(other.getClass())) {
            return false;
        }
        PerformanceEvent performanceEvent = (PerformanceEvent) other;
        if (s.g(getEvent(), performanceEvent.getEvent()) && s.g(getCreated(), performanceEvent.getCreated()) && s.g(this.sessionId, performanceEvent.sessionId) && s.g(this.attributes, performanceEvent.attributes) && s.g(this.counters, performanceEvent.counters)) {
            return s.g(this.metadata, performanceEvent.metadata);
        }
        return false;
    }

    public final List<PerformanceAttribute<String>> getAttributes() {
        return this.attributes;
    }

    public final List<PerformanceAttribute<Double>> getCounters() {
        return this.counters;
    }

    @Override // com.mapbox.maps.module.telemetry.MapBaseEvent
    public String getEventName() {
        return PERFORMANCE_TRACE;
    }

    public final JsonObject getMetadata() {
        return this.metadata;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.sessionId;
        int iHashCode = (getCreated().hashCode() + ((getEvent().hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31)) * 31;
        List<PerformanceAttribute<String>> list = this.attributes;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<PerformanceAttribute<Double>> list2 = this.counters;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        JsonObject jsonObject = this.metadata;
        return iHashCode3 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public String toString() {
        return "PerformanceEvent{sessionId='" + this.sessionId + "', attributes=" + this.attributes + ", counters=" + this.counters + ", metadata=" + this.metadata + CoreConstants.CURLY_RIGHT;
    }
}
