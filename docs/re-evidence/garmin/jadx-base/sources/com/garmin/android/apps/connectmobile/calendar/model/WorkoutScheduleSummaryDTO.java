package com.garmin.android.apps.connectmobile.calendar.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.nimbusds.jose.shaded.gson.internal.a;
import java.lang.reflect.Type;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(WorkoutScheduleSummaryDeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u00012\u00020\u0002:\u0002\t\nB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/model/WorkoutScheduleSummaryDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "CREATOR", "WorkoutScheduleSummaryDeserializer", "a", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutScheduleSummaryDTO extends s1 implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31051c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/model/WorkoutScheduleSummaryDTO$WorkoutScheduleSummaryDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/calendar/model/WorkoutScheduleSummaryDTO;", "<init>", "()V", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WorkoutScheduleSummaryDeserializer implements JsonDeserializer<WorkoutScheduleSummaryDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final WorkoutScheduleSummaryDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            a.p(jsonElement, type, jsonDeserializationContext);
            try {
                WorkoutScheduleSummaryDTO workoutScheduleSummaryDTO = new WorkoutScheduleSummaryDTO();
                workoutScheduleSummaryDTO.k(new JSONObject(jsonElement.toString()));
                return workoutScheduleSummaryDTO;
            } catch (Exception e4) {
                i2.a.j(i2.f36769a, "WorkoutScheduleSummaryDTO", e4.getMessage());
                return null;
            }
        }
    }

    public WorkoutScheduleSummaryDTO(Parcel parcel) {
        parcel.getClass();
        this.f31049a = parcel.readString();
        this.f31050b = parcel.readString();
        this.f31051c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f31049a = jSONObject.optString("scheduleStartDate");
        this.f31050b = jSONObject.optString("scheduleEndDate");
        this.f31051c = jSONObject.optInt("scheduleWorkoutCount");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f31049a);
        parcel.writeString(this.f31050b);
        parcel.writeInt(this.f31051c);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.calendar.model.WorkoutScheduleSummaryDTO$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/model/WorkoutScheduleSummaryDTO$a;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/calendar/model/WorkoutScheduleSummaryDTO;", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "SCHEDULE_START_DATE", "SCHEDULE_END_DATE", "SCHEDULE_WORKOUT_COUNT", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<WorkoutScheduleSummaryDTO> {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final WorkoutScheduleSummaryDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new WorkoutScheduleSummaryDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WorkoutScheduleSummaryDTO[] newArray(int i14) {
            return new WorkoutScheduleSummaryDTO[i14];
        }

        private Companion() {
        }
    }

    public WorkoutScheduleSummaryDTO() {
    }
}
