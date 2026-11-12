package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.joda.time.DateTime;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(WorkoutScheduleDeserializer.class)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutScheduleDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "workoutDetailsDTO", "", "workoutName", "", "workoutScheduleId", "mCalendarDate", "createdDate", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "WorkoutScheduleDeserializer", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutScheduleDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<WorkoutScheduleDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WorkoutDetailsDTO f48065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f48067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f48068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f48069e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutScheduleDTO$WorkoutScheduleDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutScheduleDTO;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WorkoutScheduleDeserializer implements JsonDeserializer<WorkoutScheduleDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final WorkoutScheduleDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                WorkoutScheduleDTO workoutScheduleDTO = new WorkoutScheduleDTO(null, null, 0L, null, null, 31, null);
                workoutScheduleDTO.k(new JSONObject(jsonElement.toString()));
                return workoutScheduleDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WorkoutScheduleDTO> {
        @Override // android.os.Parcelable.Creator
        public final WorkoutScheduleDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new WorkoutScheduleDTO(parcel.readInt() == 0 ? null : WorkoutDetailsDTO.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WorkoutScheduleDTO[] newArray(int i14) {
            return new WorkoutScheduleDTO[i14];
        }
    }

    public /* synthetic */ WorkoutScheduleDTO(WorkoutDetailsDTO workoutDetailsDTO, String str, long j8, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : workoutDetailsDTO, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? 0L : j8, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3);
    }

    public final DateTime C() {
        String str = this.f48068d;
        if (str != null) {
            return g22.k.p(str, "yyyy-MM-dd", null);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f48068d = jSONObject.optString("calendarDate");
            this.f48069e = jSONObject.optString("createdDate");
            this.f48067c = jSONObject.optInt("workoutScheduleId");
            WorkoutDetailsDTO workoutDetailsDTO = new WorkoutDetailsDTO();
            this.f48065a = workoutDetailsDTO;
            workoutDetailsDTO.k(jSONObject.optJSONObject("workout"));
            WorkoutDetailsDTO workoutDetailsDTO2 = this.f48065a;
            this.f48066b = workoutDetailsDTO2 != null ? workoutDetailsDTO2.f48041b : null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        WorkoutDetailsDTO workoutDetailsDTO = this.f48065a;
        if (workoutDetailsDTO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            workoutDetailsDTO.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f48066b);
        parcel.writeLong(this.f48067c);
        parcel.writeString(this.f48068d);
        parcel.writeString(this.f48069e);
    }

    public WorkoutScheduleDTO(WorkoutDetailsDTO workoutDetailsDTO, String str, long j8, String str2, String str3) {
        this.f48065a = workoutDetailsDTO;
        this.f48066b = str;
        this.f48067c = j8;
        this.f48068d = str2;
        this.f48069e = str3;
    }

    public WorkoutScheduleDTO() {
        this(null, null, 0L, null, null, 31, null);
    }
}
