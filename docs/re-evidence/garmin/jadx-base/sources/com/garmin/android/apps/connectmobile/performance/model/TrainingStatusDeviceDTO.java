package com.garmin.android.apps.connectmobile.performance.model;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(TrainingStatusDeviceDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusDeviceDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "<init>", "()V", "", TtmlNode.ATTR_ID, "(Ljava/lang/String;)V", "TrainingStatusDeviceDTODeserializer", "a", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrainingStatusDeviceDTO extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39908a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusDeviceDTO$TrainingStatusDeviceDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusDeviceDTO;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TrainingStatusDeviceDTODeserializer implements JsonDeserializer<TrainingStatusDeviceDTO>, JsonSerializer<TrainingStatusDeviceDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final TrainingStatusDeviceDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                TrainingStatusDeviceDTO trainingStatusDeviceDTO = new TrainingStatusDeviceDTO();
                trainingStatusDeviceDTO.k(new JSONObject(jsonElement.toString()));
                return trainingStatusDeviceDTO;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(TrainingStatusDeviceDTO trainingStatusDeviceDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            TrainingStatusDeviceDTO trainingStatusDeviceDTO2 = trainingStatusDeviceDTO;
            trainingStatusDeviceDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Action.KEY_ATTRIBUTE, "TrainingStatus.last.device");
                jSONObject.put("value", trainingStatusDeviceDTO2.f39908a);
                String string = jSONObject.toString();
                string.getClass();
                return (JsonElement) GsonUtil.f47253b.fromJson(string, JsonElement.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        new a(null);
    }

    public TrainingStatusDeviceDTO(String str) {
        this.f39908a = str;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getF39908a() {
        return this.f39908a;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f39908a = s1.u(jSONObject, "value");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusDeviceDTO$a;", "", "<init>", "()V", "", "KEY", "Ljava/lang/String;", "TRAINING_STATUS_LAST_DEVICE", "VALUE", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public TrainingStatusDeviceDTO() {
    }
}
