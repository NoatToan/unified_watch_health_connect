package com.garmin.android.apps.connectmobile.performance.model;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import iu1.g;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import o61.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import x61.e;
import x61.i;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(CurrentTrainingStatusDTODeserializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/CurrentTrainingStatusDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "<init>", "()V", "CurrentTrainingStatusDTODeserializer", "a", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CurrentTrainingStatusDTO extends s1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f39895i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, q> f39896a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, c> f39898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f39900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f39901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap<String, i> f39902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f39903h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/CurrentTrainingStatusDTO$CurrentTrainingStatusDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/performance/model/CurrentTrainingStatusDTO;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CurrentTrainingStatusDTODeserializer implements JsonDeserializer<CurrentTrainingStatusDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final CurrentTrainingStatusDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                CurrentTrainingStatusDTO currentTrainingStatusDTO = new CurrentTrainingStatusDTO();
                currentTrainingStatusDTO.m(jsonElement.toString());
                return currentTrainingStatusDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        new a(null);
        f39895i = CurrentTrainingStatusDTO.class.getName();
    }

    public CurrentTrainingStatusDTO() {
        j0 j0Var = j0.f134944a;
        this.f39897b = j0Var;
        this.f39898c = new HashMap<>();
        this.f39901f = j0Var;
        this.f39902g = new HashMap<>();
    }

    public final double C(String str) {
        HashMap<String, q> map = this.f39896a;
        q qVar = map != null ? map.get(str) : null;
        if (qVar != null) {
            return qVar.getVo2MaxPreciseValue();
        }
        return Double.NaN;
    }

    public final c D(String str) {
        HashMap<String, c> map;
        if (this.f39898c == null || TextUtils.isEmpty(str) || (map = this.f39898c) == null) {
            return null;
        }
        return map.get(str);
    }

    public final double F(String str) {
        HashMap<String, q> map = this.f39896a;
        q qVar = map != null ? map.get(str) : null;
        if (qVar != null) {
            return qVar.getVo2MaxValue();
        }
        return Double.NaN;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectA;
        JSONObject jSONObjectA2;
        HashMap<String, q> map;
        HashMap<String, q> map2;
        HashMap<String, q> map3;
        JSONObject jSONObjectA3;
        JSONObject jSONObjectA4;
        JSONObject jSONObject2;
        com.garmin.android.apps.connectmobile.performance.model.a aVar;
        jSONObject.getClass();
        JSONObject jSONObjectA5 = s1.A(jSONObject, "mostRecentTrainingStatus");
        String str = f39895i;
        if (jSONObjectA5 != null && (jSONObjectA3 = s1.A(jSONObjectA5, "payload")) != null) {
            if (jSONObjectA3.has("recordedDevices")) {
                try {
                    JSONArray jSONArrayOptJSONArray = jSONObjectA3.optJSONArray("recordedDevices");
                    com.garmin.android.apps.connectmobile.performance.model.a.f39916e.getClass();
                    this.f39897b = com.garmin.android.apps.connectmobile.performance.model.a.b.b(jSONArrayOptJSONArray);
                } catch (JSONException unused) {
                    i2.a.j(i2.f36769a, str, "Error parsing device array");
                }
            }
            if (jSONObjectA3.has("showSelector")) {
                this.f39899d = jSONObjectA3.getBoolean("showSelector");
            }
            if (jSONObjectA3.has("lastPrimarySyncDate")) {
                this.f39900e = jSONObjectA3.optString("lastPrimarySyncDate");
            }
            Object obj = this.f39897b;
            if (obj != 0 && !obj.isEmpty() && (jSONObjectA4 = s1.A(jSONObjectA3, "latestTrainingStatusData")) != null) {
                Object obj2 = this.f39897b;
                this.f39898c = new HashMap<>(obj2 != 0 ? obj2.size() : 0);
                Object obj3 = this.f39897b;
                int size = obj3 != 0 ? obj3.size() : 0;
                for (int i14 = 0; i14 < size; i14++) {
                    Object obj4 = this.f39897b;
                    String str2 = (obj4 == 0 || (aVar = (com.garmin.android.apps.connectmobile.performance.model.a) obj4.get(i14)) == null) ? null : aVar.f39917a;
                    if (!TextUtils.isEmpty(str2) && jSONObjectA4.has(str2) && (jSONObject2 = jSONObjectA4.getJSONObject(str2)) != null) {
                        c.E.getClass();
                        c cVar = new c();
                        cVar.k(jSONObject2);
                        HashMap<String, c> map4 = this.f39898c;
                        if (map4 != null) {
                            map4.put(str2, cVar);
                        }
                    }
                }
            }
        }
        JSONObject jSONObjectA6 = s1.A(jSONObject, "mostRecentVO2Max");
        if (jSONObjectA6 != null) {
            this.f39896a = new HashMap<>(2);
            JSONObject jSONObjectA7 = s1.A(jSONObjectA6, "payload");
            JSONObject jSONObjectA8 = s1.A(jSONObjectA7, "generic");
            JSONObject jSONObjectA9 = s1.A(jSONObjectA7, "cycling");
            JSONObject jSONObjectA10 = s1.A(jSONObjectA7, "rowing");
            JSONObject jSONObjectA11 = s1.A(jSONObjectA7, "heatAltitudeAcclimation");
            q qVar = (q) new g().b(q.class, String.valueOf(jSONObjectA8));
            q qVar2 = (q) new g().b(q.class, String.valueOf(jSONObjectA9));
            q qVar3 = (q) new g().b(q.class, String.valueOf(jSONObjectA10));
            if (qVar != null && (map3 = this.f39896a) != null) {
                map3.put("generic", qVar);
            }
            if (qVar2 != null && (map2 = this.f39896a) != null) {
                map2.put("cycling", qVar2);
            }
            if (qVar3 != null && (map = this.f39896a) != null) {
                map.put("rowing", qVar3);
            }
            if (jSONObjectA11 != null) {
                this.f39903h = (e) new g().b(e.class, jSONObjectA11.toString());
            }
        }
        JSONObject jSONObjectA12 = s1.A(jSONObject, "mostRecentHeatAltitudeAcclimation");
        if (jSONObjectA12 != null && (jSONObjectA2 = s1.A(jSONObjectA12, "payload")) != null) {
            this.f39903h = (e) new g().b(e.class, jSONObjectA2.toString());
        }
        JSONObject jSONObjectA13 = s1.A(jSONObject, "mostRecentTrainingLoadBalance");
        if (jSONObjectA13 == null) {
            return;
        }
        try {
            JSONObject jSONObjectA14 = s1.A(jSONObjectA13, "payload");
            if (jSONObjectA14 == null) {
                return;
            }
            com.garmin.android.apps.connectmobile.performance.model.a.b bVar = com.garmin.android.apps.connectmobile.performance.model.a.f39916e;
            JSONArray jSONArray = jSONObjectA14.getJSONArray("recordedDevices");
            bVar.getClass();
            List listB = com.garmin.android.apps.connectmobile.performance.model.a.b.b(jSONArray);
            this.f39901f = listB;
            if (!listB.isEmpty() && (jSONObjectA = s1.A(jSONObjectA14, "metricsTrainingLoadBalanceDTOMap")) != null) {
                this.f39902g = new HashMap<>(this.f39901f.size());
                for (com.garmin.android.apps.connectmobile.performance.model.a aVar2 : this.f39901f) {
                    String str3 = aVar2 != null ? aVar2.f39917a : null;
                    if (!TextUtils.isEmpty(str3)) {
                        String strOptString = jSONObjectA.optString(str3);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f39902g.put(str3, (i) GsonUtil.f47253b.fromJson(strOptString, i.class));
                        }
                    }
                }
            }
        } catch (JSONException e4) {
            i2.a.c(i2.f36769a, str, e4.getMessage() + " - error parsing training load balance.");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/CurrentTrainingStatusDTO$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "MOST_RECENT_VO2_KEY", "MOST_RECENT_HEAT_ALTITUDE_ACCLIMATION", "MOST_RECENT_TRAINING_STATUS_KEY", "LATEST_TRAINING_STATUS_DATA_KEY", "MOST_RECENT_TRAINING_LOAD_BALANCE_KEY", "METRICS_TRAINING_LOAD_BALANCE_DTO_MAP_KEY", "PAYLOAD_KEY", "RECORDED_DEVICES_KEY", "SHOW_SELECTOR", "LAST_PRIMARY_SYNC_DATE", "VO2_CYCLING_KEY", "VO2_ROWING_KEY", "VO2_GENERIC_KEY", "VO2_HEAT_ALTITUDE_ACCLIMATION_KEY", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
