package com.garmin.android.apps.connectmobile.performance.model;

import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import iu1.g;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o61.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(TrainingStatusReportDTODeserializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "<init>", "()V", "TrainingStatusReportDTODeserializer", "a", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrainingStatusReportDTO extends s1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f39909g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f39910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39911b = j0.f134944a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, List<c>> f39912c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<Object> f39913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Object> f39914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<Object> f39915f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO$TrainingStatusReportDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TrainingStatusReportDTODeserializer implements JsonDeserializer<TrainingStatusReportDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final TrainingStatusReportDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                TrainingStatusReportDTO trainingStatusReportDTO = new TrainingStatusReportDTO();
                trainingStatusReportDTO.k(new JSONObject(jsonElement.toString()));
                return trainingStatusReportDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Long.valueOf(((n) t7).getTimestamp()), Long.valueOf(((n) t14).getTimestamp()));
        }
    }

    static {
        new a(null);
        f39909g = 8;
    }

    public final ArrayList C() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f39912c.keySet()) {
            str.getClass();
            List<c> list = this.f39912c.get(str);
            list.getClass();
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public final List<n> D() {
        ArrayList<c> arrayList = new ArrayList();
        Set<Map.Entry<String, List<c>>> setEntrySet = this.f39912c.entrySet();
        setEntrySet.getClass();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            List<c> list = this.f39912c.get(((Map.Entry) it.next()).getKey());
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    c cVar = (c) obj;
                    if (cVar != null && cVar.f39942a != null) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(new ArrayList(arrayList2));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (c cVar2 : arrayList) {
            if (cVar2 != null) {
                arrayList3.add(cVar2.M());
            }
        }
        return h0.N0(arrayList3, new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void F(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectA;
        int length;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        if (jSONObject.has("currentTrainingStatus") && (jSONObject2 = jSONObject.getJSONObject("currentTrainingStatus")) != null) {
            new c().k(jSONObject2);
        }
        if (jSONObject.has("recordedDevices")) {
            JSONArray jSONArray = jSONObject.getJSONArray("recordedDevices");
            com.garmin.android.apps.connectmobile.performance.model.a.f39916e.getClass();
            this.f39911b = com.garmin.android.apps.connectmobile.performance.model.a.b.b(jSONArray);
        }
        Object obj = this.f39911b;
        if (obj != 0 && !obj.isEmpty() && (jSONObjectA = s1.A(jSONObject, "reportData")) != null) {
            Object obj2 = this.f39911b;
            obj2.getClass();
            this.f39912c = new HashMap<>(obj2.size());
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONArray jSONArrayZ = s1.z(jSONObjectA, next);
                HashMap<String, List<c>> map = this.f39912c;
                c.E.getClass();
                Object arrayList = j0.f134944a;
                if (jSONArrayZ != null && (length = jSONArrayZ.length()) > 0) {
                    arrayList = new ArrayList(length);
                    for (int i14 = 0; i14 < length; i14++) {
                        c cVar = new c();
                        JSONObject jSONObject3 = jSONArrayZ.getJSONObject(i14);
                        jSONObject3.getClass();
                        cVar.k(jSONObject3);
                        arrayList.add(cVar);
                    }
                }
                map.put(next, (List<c>) arrayList);
            }
        }
        if (jSONObject.has("showSelector")) {
            this.f39910a = jSONObject.getBoolean("showSelector");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject3 = null;
        if (jSONObject.has("weeklyTrainingStatus")) {
            jSONObject2 = jSONObject.getJSONObject("weeklyTrainingStatus");
        } else {
            jSONObject2 = jSONObject.has("monthlyTrainingStatus") ? jSONObject.getJSONObject("monthlyTrainingStatus") : null;
        }
        if (jSONObject.has("payload") || !jSONObject.has("reportData")) {
            F(s1.A(jSONObject2, "payload"));
        } else {
            F(jSONObject);
        }
        if (jSONObject.has("vo2MaxMonthlyStatistics")) {
            jSONObject3 = jSONObject.getJSONObject("vo2MaxMonthlyStatistics");
        } else if (jSONObject.has("vo2MaxWeeklyStatistics")) {
            jSONObject3 = jSONObject.getJSONObject("vo2MaxWeeklyStatistics");
        }
        JSONObject jSONObjectA = s1.A(jSONObject3, "payload");
        if (jSONObjectA == null) {
            return;
        }
        JSONObject jSONObjectA2 = s1.A(s1.A(jSONObjectA, "allMetrics"), "metricsMap");
        List<Object> list = (List) new g().b(List.class, String.valueOf(s1.z(jSONObjectA2, "ACTIVITY_VO2_MAX")));
        if (list == null) {
            list = j0.f134944a;
        }
        this.f39913d = list;
        List<Object> list2 = (List) new g().b(List.class, String.valueOf(s1.z(jSONObjectA2, "ACTIVITY_VO2_MAX_CYCLING")));
        if (list2 == null) {
            list2 = j0.f134944a;
        }
        this.f39914e = list2;
        List<Object> list3 = (List) new g().b(List.class, String.valueOf(s1.z(jSONObjectA2, "ACTIVITY_VO2_MAX_ROWING")));
        if (list3 == null) {
            list3 = j0.f134944a;
        }
        this.f39915f = list3;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO$a;", "", "<init>", "()V", "", "WEEKLY_TRAINING_STATUS_KEY", "Ljava/lang/String;", "MONTHLY_TRAINING_STATUS_KEY", "WEEKLY_VO2_MAX_KEY", "MONTHLY_VO2_MAX_KEY", "PAYLOAD_KEY", "CURRENT_TRAINING_STATUS_KEY", "RECORDED_DEVICES_KEY", "REPORT_DATA_KEY", "ALL_METRICS_KEY", "METRICS_MAP_KEY", "ACTIVITY_VO_2_MAX_KEY", "ACTIVITY_VO_2_MAX_CYCLING_KEY", "ACTIVITY_VO_2_MAX_ROWING_KEY", "SHOW_SELECTOR", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
