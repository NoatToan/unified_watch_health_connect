package com.garmin.android.apps.connectmobile.googlehealthconnect;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;
import y8.q0;
import y8.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/GoogleHealthConnectGsonUtil;", "", "<init>", "()V", "Companion", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GoogleHealthConnectGsonUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f36011a = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Gson f36012b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/GoogleHealthConnectGsonUtil$Companion;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DATE_FORMAT", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "RecordTypeAdapter", "GsonInstantTypeAdapter", "GsonZoneOffsetTypeAdapter", "ExerciseRouteResultTypeAdapter", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/GoogleHealthConnectGsonUtil$Companion$ExerciseRouteResultTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Ly8/t;", "<init>", "()V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ExerciseRouteResultTypeAdapter extends TypeAdapter<t> {
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: read */
            public final t read2(JsonReader jsonReader) {
                jsonReader.getClass();
                jsonReader.nextString();
                return new t.b();
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, t tVar) {
                if (jsonWriter != null) {
                    new t.b();
                    jsonWriter.value("NoData");
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/GoogleHealthConnectGsonUtil$Companion$GsonInstantTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Ljava/time/Instant;", "<init>", "()V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class GsonInstantTypeAdapter extends TypeAdapter<Instant> {
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: read */
            public final Instant read2(JsonReader jsonReader) {
                jsonReader.getClass();
                Instant instant = Instant.parse(jsonReader.nextString());
                instant.getClass();
                return instant;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Instant instant) {
                Instant instant2 = instant;
                if (jsonWriter != null) {
                    jsonWriter.value(String.valueOf(instant2));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/GoogleHealthConnectGsonUtil$Companion$GsonZoneOffsetTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Ljava/time/ZoneOffset;", "<init>", "()V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class GsonZoneOffsetTypeAdapter extends TypeAdapter<ZoneOffset> {
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: read */
            public final ZoneOffset read2(JsonReader jsonReader) {
                jsonReader.getClass();
                ZoneOffset zoneOffsetOf = ZoneOffset.of(jsonReader.nextString());
                zoneOffsetOf.getClass();
                return zoneOffsetOf;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, ZoneOffset zoneOffset) {
                ZoneOffset zoneOffset2 = zoneOffset;
                if (jsonWriter != null) {
                    jsonWriter.value(String.valueOf(zoneOffset2));
                }
            }
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/GoogleHealthConnectGsonUtil$Companion$RecordTypeAdapter;", "Lcom/google/gson/JsonDeserializer;", "", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "a", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class RecordTypeAdapter implements JsonDeserializer<Object>, JsonSerializer<Object> {
            static {
                new a(null);
            }

            @Override // com.google.gson.JsonDeserializer
            public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
                try {
                    JsonObject asJsonObject = jsonElement.getAsJsonObject();
                    JsonElement jsonElement2 = asJsonObject.get("CLASSNAME");
                    jsonElement2.getClass();
                    String asString = ((JsonPrimitive) jsonElement2).getAsString();
                    asString.getClass();
                    try {
                        return jsonDeserializationContext.deserialize(asJsonObject.get("DATA"), Class.forName(asString));
                    } catch (ClassNotFoundException e4) {
                        throw new JsonParseException(e4.getMessage());
                    }
                } catch (Exception e14) {
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(e14, "RecordTypeAdapter - exception=");
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar.getClass();
                    i2.a.f(a2Var, "GoogleHealthConnectGsonUtil", strD);
                    return null;
                }
            }

            @Override // com.google.gson.JsonSerializer
            public final JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
                obj.getClass();
                type.getClass();
                jsonSerializationContext.getClass();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("CLASSNAME", obj.getClass().getName());
                jsonObject.add("DATA", jsonSerializationContext.serialize(obj));
                return jsonObject;
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/GoogleHealthConnectGsonUtil$Companion$RecordTypeAdapter$a;", "", "<init>", "()V", "", "CLASSNAME", "Ljava/lang/String;", "DATA", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                    this();
                }

                private a() {
                }
            }
        }

        private Companion() {
        }
    }

    static {
        Gson gsonCreate = new GsonBuilder().registerTypeAdapter(q0.class, new Companion.RecordTypeAdapter()).registerTypeAdapter(Instant.class, new Companion.GsonInstantTypeAdapter()).registerTypeAdapter(ZoneOffset.class, new Companion.GsonZoneOffsetTypeAdapter()).registerTypeAdapter(t.class, new Companion.ExerciseRouteResultTypeAdapter()).setExclusionStrategies(new com.garmin.android.apps.connectmobile.util.gson.a()).serializeSpecialFloatingPointValues().setDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").create();
        gsonCreate.getClass();
        f36012b = gsonCreate;
    }
}
