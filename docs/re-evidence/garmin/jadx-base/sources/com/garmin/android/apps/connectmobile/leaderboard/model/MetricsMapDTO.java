package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(MetricsMapDTODeserializer.class)
public class MetricsMapDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<MetricsMapDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f38034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.connections.model.c f38035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Double f38036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f38037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38038f;

    public static class MetricsMapDTODeserializer implements JsonDeserializer<MetricsMapDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final MetricsMapDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                MetricsMapDTO metricsMapDTO = new MetricsMapDTO();
                metricsMapDTO.k(new JSONObject(jsonElement.toString()));
                return metricsMapDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<MetricsMapDTO> {
        @Override // android.os.Parcelable.Creator
        public final MetricsMapDTO createFromParcel(Parcel parcel) {
            return new MetricsMapDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MetricsMapDTO[] newArray(int i14) {
            return new MetricsMapDTO[i14];
        }
    }

    public MetricsMapDTO(Parcel parcel) {
        this.f38033a = parcel.readInt();
        this.f38034b = parcel.readDouble();
        this.f38035c = (com.garmin.android.apps.connectmobile.connections.model.c) parcel.readParcelable(com.garmin.android.apps.connectmobile.connections.model.c.class.getClassLoader());
        this.f38037e = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f38036d = (Double) parcel.readValue(Double.class.getClassLoader());
        this.f38038f = parcel.readInt() == 1;
    }

    public static MetricsMapDTO[] C(JSONArray jSONArray) throws JSONException {
        MetricsMapDTO[] metricsMapDTOArr = new MetricsMapDTO[jSONArray.length()];
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i14);
            MetricsMapDTO metricsMapDTO = new MetricsMapDTO();
            metricsMapDTO.k(jSONObject);
            metricsMapDTOArr[i14] = metricsMapDTO;
        }
        return metricsMapDTOArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f38034b = jSONObject.optDouble("value");
            this.f38033a = jSONObject.optInt("rank");
            com.garmin.android.apps.connectmobile.connections.model.c cVar = new com.garmin.android.apps.connectmobile.connections.model.c();
            this.f38035c = cVar;
            cVar.k(jSONObject.optJSONObject("userInfo"));
            this.f38037e = s1.t(jSONObject, "lastSyncTime");
            this.f38036d = s1.q(jSONObject, "todayValue");
            this.f38038f = jSONObject.optBoolean("hasPrivate");
        }
    }

    public final String toString() {
        return "MetricsMapDTO [mValue=" + this.f38034b + ", mUserInfo=" + this.f38035c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f38033a);
        parcel.writeDouble(this.f38034b);
        parcel.writeParcelable(this.f38035c, i14);
        parcel.writeValue(this.f38037e);
        parcel.writeValue(this.f38036d);
        parcel.writeInt(this.f38038f ? 1 : 0);
    }

    public MetricsMapDTO() {
    }
}
