package com.garmin.android.apps.connectmobile.performance.trainingload.model;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(ExerciseLoadRecordDeserializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/model/ExerciseLoadRecordDto;", "Lcom/garmin/android/apps/connectmobile/s1;", "<init>", "()V", "a", "ExerciseLoadRecordDeserializer", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExerciseLoadRecordDto extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f40246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f40248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Double f40249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f40250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f40251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Double f40252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Double f40253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f40254i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/model/ExerciseLoadRecordDto$ExerciseLoadRecordDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/performance/trainingload/model/ExerciseLoadRecordDto;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ExerciseLoadRecordDeserializer implements JsonDeserializer<ExerciseLoadRecordDto> {
        @Override // com.google.gson.JsonDeserializer
        public final ExerciseLoadRecordDto deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                ExerciseLoadRecordDto exerciseLoadRecordDto = new ExerciseLoadRecordDto();
                exerciseLoadRecordDto.k(new JSONObject(String.valueOf(jsonElement)));
                return exerciseLoadRecordDto;
            } catch (Exception e4) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.g(a2Var, "ExerciseLoadRecordDto", e4);
                return null;
            }
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        this.f40246a = jSONObject != null ? Long.valueOf(jSONObject.optLong("activityId")) : null;
        this.f40247b = s1.u(jSONObject, "trainingEffectLabel");
        this.f40248c = s1.u(jSONObject, "startLocal");
        this.f40249d = jSONObject != null ? Double.valueOf(jSONObject.optDouble("distance", 0.0d)) : null;
        this.f40250e = s1.u(jSONObject, "activityType");
        s1.u(jSONObject, "activitySubType");
        if (jSONObject != null) {
            jSONObject.optLong("deviceId");
        }
        this.f40251f = jSONObject != null ? Long.valueOf(jSONObject.optLong("parentId", -1L)) : null;
        this.f40252g = jSONObject != null ? Double.valueOf(jSONObject.optDouble("activityTrainingLoad", 0.0d)) : null;
        this.f40253h = jSONObject != null ? Double.valueOf(jSONObject.optDouble("activityTrainingLoadSrvrCalc", 0.0d)) : null;
        this.f40254i = s1.u(jSONObject, "trainingEffectLabelSrvrCalc");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/model/ExerciseLoadRecordDto$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ACTIVITY_ID", "TRAINING_EFFECT_LABEL", "START_LOCAL", "DISTANCE", "ACTIVITY_TYPE", "ACTIVITY_SUB_TYPE", "DEVICE_ID", "PARENT_ID", "ACTIVITY_TRAINING_LOAD", "TRAINING_EFFECT_LABEL_SRVR_CALC", "ACTIVITY_TRAINING_LOAD_SRVR_CALC", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
