package com.garmin.android.apps.connectmobile.segments.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import d53.n;
import java.lang.reflect.Type;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@JsonAdapter(StravaStatusDeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\b\t\nB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "c", "StravaStatusDeserializer", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StravaStatusDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<StravaStatusDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f41333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41334f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO$StravaStatusDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StravaStatusDeserializer implements JsonDeserializer<StravaStatusDTO>, JsonSerializer<StravaStatusDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final StravaStatusDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                StravaStatusDTO stravaStatusDTO = new StravaStatusDTO();
                stravaStatusDTO.k(new JSONObject(jsonElement.toString()));
                return stravaStatusDTO;
            } catch (Exception e4) {
                i2.a.j(i2.f36769a, "StravaStatusDTO", e4.getMessage());
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(StravaStatusDTO stravaStatusDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            StravaStatusDTO stravaStatusDTO2 = stravaStatusDTO;
            stravaStatusDTO2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("connectAccessToStravaData", stravaStatusDTO2.f41330b);
                jSONObject.put("stravaAccessToConnectData", stravaStatusDTO2.f41331c);
                jSONObject.put("premium", stravaStatusDTO2.f41332d);
                jSONObject.put("stravaSegmentsElection", stravaStatusDTO2.f41333e);
                return (JsonElement) GsonUtil.f47253b.fromJson(jSONObject.toString(), JsonElement.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StravaStatusDTO> {
        @Override // android.os.Parcelable.Creator
        public final StravaStatusDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new StravaStatusDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StravaStatusDTO[] newArray(int i14) {
            return new StravaStatusDTO[i14];
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        OPT_IN("OPT_IN"),
        OPT_OUT("OPT_OUT"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41339a;

        c(String str) {
            this.f41339a = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f41339a;
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public StravaStatusDTO(Parcel parcel) {
        parcel.getClass();
        this.f41329a = parcel.readString();
        this.f41330b = parcel.readInt() == 1;
        this.f41331c = parcel.readInt() == 1;
        this.f41332d = parcel.readInt() == 1;
        try {
            String string = parcel.readString();
            string.getClass();
            this.f41333e = c.valueOf(string);
        } catch (IllegalArgumentException unused) {
            this.f41333e = c.UNKNOWN;
        }
        this.f41334f = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        c cVarValueOf;
        jSONObject.getClass();
        this.f41329a = jSONObject.toString();
        this.f41330b = jSONObject.optBoolean("connectAccessToStravaData");
        this.f41331c = jSONObject.optBoolean("stravaAccessToConnectData");
        this.f41332d = jSONObject.optBoolean("premium");
        this.f41334f = jSONObject.optBoolean("beaconEnabled");
        try {
            String strOptString = jSONObject.optString("stravaSegmentsElection");
            strOptString.getClass();
            cVarValueOf = c.valueOf(strOptString);
        } catch (IllegalArgumentException unused) {
            cVarValueOf = c.UNKNOWN;
        }
        this.f41333e = cVarValueOf;
    }

    public final String toString() {
        boolean z14 = this.f41330b;
        boolean z15 = this.f41331c;
        boolean z16 = this.f41332d;
        c cVar = this.f41333e;
        boolean z17 = this.f41334f;
        boolean z18 = z16 && z14 && z15;
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("\n             StravaStatusDTO:\n             connectAccessToStravaData: ", "\n             stravaAccessToConnectData: ", "\n             premium: ", z14, z15);
        sbM.append(z16);
        sbM.append("\n             stravaSegmentsElection: ");
        sbM.append(cVar);
        sbM.append("\n             beaconEnabled: ");
        sbM.append(z17);
        sbM.append("\n             beaconEligible: ");
        sbM.append(z18);
        sbM.append("\n             ");
        return n.c(sbM.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f41329a);
        parcel.writeInt(this.f41330b ? 1 : 0);
        parcel.writeInt(this.f41331c ? 1 : 0);
        parcel.writeInt(this.f41332d ? 1 : 0);
        c cVar = this.f41333e;
        parcel.writeString(cVar == null ? c.UNKNOWN.f41339a : String.valueOf(cVar));
        parcel.writeInt(this.f41334f ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "JSON_KEY_CONNECT_ACCESS_TO_STRAVA_DATA", "JSON_KEY_STRAVA_ACCESS_TO_CONNECT_DATA", "JSON_KEY_STRAVA_SEGMENTS_ELECTION", "JSON_KEY_PREMIUM", "JSON_KEY_BEACON_ENABLED", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public StravaStatusDTO() {
    }
}
