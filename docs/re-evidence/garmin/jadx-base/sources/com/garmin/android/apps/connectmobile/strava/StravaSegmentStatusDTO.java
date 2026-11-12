package com.garmin.android.apps.connectmobile.strava;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(StravaSegmentStatusDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/strava/StravaSegmentStatusDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "StravaSegmentStatusDTODeserializer", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StravaSegmentStatusDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<StravaSegmentStatusDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f44976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44977b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/strava/StravaSegmentStatusDTO$StravaSegmentStatusDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/strava/StravaSegmentStatusDTO;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StravaSegmentStatusDTODeserializer implements JsonDeserializer<StravaSegmentStatusDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final StravaSegmentStatusDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                StravaSegmentStatusDTO stravaSegmentStatusDTO = new StravaSegmentStatusDTO();
                stravaSegmentStatusDTO.k(new JSONObject(jsonElement.toString()));
                return stravaSegmentStatusDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/strava/StravaSegmentStatusDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/strava/StravaSegmentStatusDTO;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StravaSegmentStatusDTO> {
        @Override // android.os.Parcelable.Creator
        public final StravaSegmentStatusDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new StravaSegmentStatusDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StravaSegmentStatusDTO[] newArray(int i14) {
            return new StravaSegmentStatusDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public StravaSegmentStatusDTO(Parcel parcel) {
        parcel.getClass();
        this.f44976a = parcel.readByte() != 0;
        this.f44977b = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f44976a = jSONObject.optBoolean("cyclingCompatible");
        this.f44977b = jSONObject.optBoolean("segmentCompatible");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeByte(this.f44976a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f44977b ? (byte) 1 : (byte) 0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/strava/StravaSegmentStatusDTO$b;", "", "<init>", "()V", "", "CYCLING_COMPATIBLE", "Ljava/lang/String;", "SEGMENT_COMPATIBLE", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/strava/StravaSegmentStatusDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public StravaSegmentStatusDTO() {
    }
}
