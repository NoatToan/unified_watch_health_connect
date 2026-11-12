package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(ConnectionLeaderBoardDTODeserializer.class)
public class ConnectionLeaderBoardDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<ConnectionLeaderBoardDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MetricsMapDTO[] f38024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38027g;

    public static class ConnectionLeaderBoardDTODeserializer implements JsonDeserializer<ConnectionLeaderBoardDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final ConnectionLeaderBoardDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                ConnectionLeaderBoardDTO connectionLeaderBoardDTO = new ConnectionLeaderBoardDTO();
                connectionLeaderBoardDTO.m(jsonElement.toString());
                return connectionLeaderBoardDTO;
            } catch (JSONException e4) {
                i2.g(e4, "ConnectionLeaderBoardDTO");
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<ConnectionLeaderBoardDTO> {
        @Override // android.os.Parcelable.Creator
        public final ConnectionLeaderBoardDTO createFromParcel(Parcel parcel) {
            return new ConnectionLeaderBoardDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ConnectionLeaderBoardDTO[] newArray(int i14) {
            return new ConnectionLeaderBoardDTO[i14];
        }
    }

    public enum b {
        ACTIVITY_TOTAL_DISTANCE,
        WELLNESS_TOTAL_STEPS,
        WELLNESS_ACTIVE_CALORIES,
        WELLNESS_TOTAL_PUSHES
    }

    public ConnectionLeaderBoardDTO(Parcel parcel) {
        this.f38021a = parcel.readInt();
        this.f38022b = parcel.readString();
        this.f38023c = parcel.readString();
        this.f38024d = (MetricsMapDTO[]) parcel.createTypedArray(MetricsMapDTO.CREATOR);
        this.f38025e = parcel.readString();
        this.f38026f = parcel.readInt();
        this.f38027g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null) {
            this.f38021a = jSONObject.optInt("userProfileId");
            this.f38022b = s1.u(jSONObject, "statisticsStartDate");
            this.f38023c = s1.u(jSONObject, "statisticsEndDate");
            this.f38025e = s1.u(jSONObject, "groupedMetrics");
            this.f38026f = jSONObject.optInt("userRank");
            this.f38027g = jSONObject.optInt("total");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("allMetrics");
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("metricsMap")) == null) {
                return;
            }
            b bVar = b.ACTIVITY_TOTAL_DISTANCE;
            if (!jSONObjectOptJSONObject.isNull(bVar.name())) {
                this.f38024d = MetricsMapDTO.C(jSONObjectOptJSONObject.getJSONArray(bVar.name()));
                return;
            }
            b bVar2 = b.WELLNESS_TOTAL_STEPS;
            if (!jSONObjectOptJSONObject.isNull(bVar2.name())) {
                this.f38024d = MetricsMapDTO.C(jSONObjectOptJSONObject.getJSONArray(bVar2.name()));
                return;
            }
            b bVar3 = b.WELLNESS_ACTIVE_CALORIES;
            if (!jSONObjectOptJSONObject.isNull(bVar3.name())) {
                this.f38024d = MetricsMapDTO.C(jSONObjectOptJSONObject.getJSONArray(bVar3.name()));
                return;
            }
            b bVar4 = b.WELLNESS_TOTAL_PUSHES;
            if (jSONObjectOptJSONObject.isNull(bVar4.name())) {
                return;
            }
            this.f38024d = MetricsMapDTO.C(jSONObjectOptJSONObject.getJSONArray(bVar4.name()));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f38021a);
        parcel.writeString(this.f38022b);
        parcel.writeString(this.f38023c);
        parcel.writeTypedArray(this.f38024d, 0);
        parcel.writeString(this.f38025e);
        parcel.writeInt(this.f38026f);
        parcel.writeInt(this.f38027g);
    }

    public ConnectionLeaderBoardDTO() {
    }
}
