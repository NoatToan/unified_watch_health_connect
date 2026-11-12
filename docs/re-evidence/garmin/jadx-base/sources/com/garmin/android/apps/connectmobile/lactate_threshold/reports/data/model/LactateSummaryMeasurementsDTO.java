package com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.model;

import a61.c;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import o61.g;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import p13.x;
import ph0.b;

/* JADX INFO: loaded from: classes8.dex */
@JsonAdapter(LactateSummarySummaryDTODeserializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/data/model/LactateSummaryMeasurementsDTO;", "Lph0/b;", "<init>", "()V", "LactateSummarySummaryDTODeserializer", "a", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LactateSummaryMeasurementsDTO extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f37138g = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<g> f37139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<g> f37140f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/data/model/LactateSummaryMeasurementsDTO$LactateSummarySummaryDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/data/model/LactateSummaryMeasurementsDTO;", "<init>", "()V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LactateSummarySummaryDTODeserializer implements JsonDeserializer<LactateSummaryMeasurementsDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final LactateSummaryMeasurementsDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO = new LactateSummaryMeasurementsDTO();
                lactateSummaryMeasurementsDTO.m(jsonElement.toString());
                return lactateSummaryMeasurementsDTO;
            } catch (Exception e4) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.g(a2Var, "LactateSummaryMeasurementsDTO", e4);
                return null;
            }
        }
    }

    static {
        new a(null);
    }

    @Override // ph0.b
    public final j0 C() {
        return j0.f134944a;
    }

    @Override // ph0.b
    public final List<String> D() {
        return x.k("lactateThresholdHeartRateCycling", "ftp", "lactateThresholdSpeed", "lactateThresholdHeartRate");
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        HashMap<String, HashMap<String, ph0.a>> map = this.f137707d;
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        this.f37139e = h0.N0(oh0.a.a("lactateThresholdHeartRate", map), new c(new vp1.a(4), 28));
        this.f37140f = h0.N0(oh0.a.a("lactateThresholdSpeed", map), new c(new vp1.a(5), 29));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/data/model/LactateSummaryMeasurementsDTO$a;", "", "<init>", "()V", "", "LACTATE_THRESHOLD_HEART_RATE_CYCLING", "Ljava/lang/String;", "FTP", "LACTATE_THRESHOLD_SPEED", "LACTATE_THRESHOLD_HEART_RATE", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
