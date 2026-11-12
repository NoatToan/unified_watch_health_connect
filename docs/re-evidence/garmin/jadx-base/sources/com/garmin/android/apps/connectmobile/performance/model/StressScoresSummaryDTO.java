package com.garmin.android.apps.connectmobile.performance.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import o61.g;
import o61.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(StressScoresSummaryDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/StressScoresSummaryDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "StressScoresSummaryDTODeserializer", "b", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StressScoresSummaryDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f39904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39907d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/StressScoresSummaryDTO$StressScoresSummaryDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/performance/model/StressScoresSummaryDTO;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StressScoresSummaryDTODeserializer implements JsonDeserializer<StressScoresSummaryDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final StressScoresSummaryDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                StressScoresSummaryDTO stressScoresSummaryDTO = new StressScoresSummaryDTO();
                String string = jsonElement.toString();
                string.getClass();
                stressScoresSummaryDTO.m(string);
                return stressScoresSummaryDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/performance/model/StressScoresSummaryDTO$a", "Landroid/os/Parcelable$Creator;", "Lo61/g;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public StressScoresSummaryDTO(Parcel parcel) {
        parcel.getClass();
        this.f39905b = parcel.readLong();
        this.f39906c = parcel.readString();
        this.f39907d = parcel.readString();
        this.f39904a = parcel.createTypedArrayList(i.CREATOR);
    }

    public final void C(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        String string = !jSONObject.isNull("calendarDate") ? jSONObject.getString("calendarDate") : null;
        if (!jSONObject.isNull("deviceId")) {
            jSONObject.getLong("deviceId");
        }
        long j8 = !jSONObject.isNull("userProfilePK") ? jSONObject.getLong("userProfilePK") : -1L;
        if (!jSONObject.isNull("timestampGmt")) {
            jSONObject.getString("timestampGmt");
        }
        int i14 = !jSONObject.isNull("manualStressLevel") ? jSONObject.getInt("manualStressLevel") : 0;
        i iVar = new i();
        iVar.f129595a = string;
        iVar.f129596b = i14;
        if (j8 != -1) {
            this.f39905b = j8;
        }
        ArrayList arrayList = this.f39904a;
        if (arrayList != null) {
            arrayList.add(iVar);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void m(String str) throws JSONException {
        Object objNextValue = new JSONTokener(str).nextValue();
        this.f39904a = new ArrayList();
        if (objNextValue instanceof JSONObject) {
            C((JSONObject) objNextValue);
            return;
        }
        if (objNextValue instanceof JSONArray) {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                C(jSONArray.getJSONObject(i14));
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f39905b);
        parcel.writeString(this.f39906c);
        parcel.writeString(this.f39907d);
        parcel.writeTypedList(this.f39904a);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/StressScoresSummaryDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lo61/g;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "JSON_KEY_CALENDAR_DATE", "Ljava/lang/String;", "JSON_KEY_DEVICE_ID", "JSON_KEY_USER_ID", "JSON_KEY_TIME_STAMP_GMT", "JSON_KEY_MANUAL_STRESS_LEVEL", "PAY_LOAD", "CALENDAR_START_DATE", "CALENDAR_END_DATE", "USER_ID", "ALL_METRICS", "METRICS_MAP", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public StressScoresSummaryDTO() {
    }
}
