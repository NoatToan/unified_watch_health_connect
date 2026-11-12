package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(BiometricProfileDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricProfileDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "BiometricProfileDTODeserializer", "b", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BiometricProfileDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<BiometricProfileDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f46799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f46800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f46801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f46802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BiometricThresholdDTO f46804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public BiometricThresholdDTO f46805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BiometricThresholdDTO f46806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BiometricThresholdDTO f46807j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricProfileDTO$BiometricProfileDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricProfileDTO;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BiometricProfileDTODeserializer implements JsonDeserializer<BiometricProfileDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final BiometricProfileDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                BiometricProfileDTO biometricProfileDTO = new BiometricProfileDTO();
                biometricProfileDTO.k(new JSONObject(jsonElement.toString()));
                return biometricProfileDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/model/BiometricProfileDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricProfileDTO;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BiometricProfileDTO> {
        @Override // android.os.Parcelable.Creator
        public final BiometricProfileDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BiometricProfileDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiometricProfileDTO[] newArray(int i14) {
            return new BiometricProfileDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public BiometricProfileDTO(Parcel parcel) {
        parcel.getClass();
        this.f46798a = parcel.readString();
        this.f46799b = parcel.readDouble();
        this.f46800c = parcel.readDouble();
        this.f46801d = parcel.readDouble();
        this.f46802e = parcel.readDouble();
        this.f46803f = parcel.readInt();
        ClassLoader classLoader = BiometricThresholdDTO.class.getClassLoader();
        this.f46804g = (BiometricThresholdDTO) parcel.readParcelable(classLoader);
        this.f46805h = (BiometricThresholdDTO) parcel.readParcelable(classLoader);
        this.f46806i = (BiometricThresholdDTO) parcel.readParcelable(classLoader);
        this.f46807j = (BiometricThresholdDTO) parcel.readParcelable(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        this.f46798a = s1.u(jSONObject, "userId");
        this.f46799b = jSONObject.optDouble("height");
        this.f46800c = jSONObject.optDouble("weight");
        this.f46801d = jSONObject.optDouble("vo2Max");
        this.f46802e = jSONObject.optDouble("vo2MaxCycling");
        this.f46803f = jSONObject.optInt("activityClass");
        if (jSONObject.has("lactateThresholdSpeed") && !jSONObject.isNull("lactateThresholdSpeed")) {
            BiometricThresholdDTO biometricThresholdDTO = new BiometricThresholdDTO();
            this.f46804g = biometricThresholdDTO;
            JSONObject jSONObject2 = jSONObject.getJSONObject("lactateThresholdSpeed");
            jSONObject2.getClass();
            biometricThresholdDTO.k(jSONObject2);
        }
        if (jSONObject.has("lactateThresholdHeartRate")) {
            BiometricThresholdDTO biometricThresholdDTO2 = new BiometricThresholdDTO();
            this.f46805h = biometricThresholdDTO2;
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("lactateThresholdHeartRate");
                jSONObject3.getClass();
                biometricThresholdDTO2.k(jSONObject3);
            } catch (JSONException unused) {
                double dOptDouble = jSONObject.optDouble("lactateThresholdHeartRate");
                BiometricThresholdDTO biometricThresholdDTO3 = this.f46805h;
                biometricThresholdDTO3.getClass();
                biometricThresholdDTO3.f46809b = dOptDouble;
            }
        }
        if (jSONObject.has("lactateThresholdHeartRateCycling") && !jSONObject.isNull("lactateThresholdHeartRateCycling")) {
            BiometricThresholdDTO biometricThresholdDTO4 = new BiometricThresholdDTO();
            this.f46806i = biometricThresholdDTO4;
            JSONObject jSONObject4 = jSONObject.getJSONObject("lactateThresholdHeartRateCycling");
            jSONObject4.getClass();
            biometricThresholdDTO4.k(jSONObject4);
        }
        if (!jSONObject.has("functionalThresholdPower") || jSONObject.isNull("functionalThresholdPower")) {
            return;
        }
        BiometricThresholdDTO biometricThresholdDTO5 = new BiometricThresholdDTO();
        this.f46807j = biometricThresholdDTO5;
        JSONObject jSONObject5 = jSONObject.getJSONObject("functionalThresholdPower");
        jSONObject5.getClass();
        biometricThresholdDTO5.k(jSONObject5);
    }

    public final String toString() {
        String str = this.f46798a;
        double d14 = this.f46799b;
        double d15 = this.f46800c;
        double d16 = this.f46801d;
        int i14 = this.f46803f;
        StringBuilder sb3 = new StringBuilder("BiometricProfileDTO [userId=");
        sb3.append(str);
        sb3.append(", height=");
        sb3.append(d14);
        am.j.x(sb3, ", weight=", d15, ", vo2Max=");
        sb3.append(d16);
        sb3.append(", activityClass=");
        sb3.append(i14);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f46798a);
        parcel.writeDouble(this.f46799b);
        parcel.writeDouble(this.f46800c);
        parcel.writeDouble(this.f46801d);
        parcel.writeDouble(this.f46802e);
        parcel.writeInt(this.f46803f);
        parcel.writeParcelable(this.f46804g, i14);
        parcel.writeParcelable(this.f46805h, i14);
        parcel.writeParcelable(this.f46806i, i14);
        parcel.writeParcelable(this.f46807j, i14);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricProfileDTO$b;", "", "<init>", "()V", "", "USER_ID_PK", "Ljava/lang/String;", "HEIGHT_PK", "WEIGHT_PK", "VO_2_MAX_PK", "VO_2_MAX_CYCLING_PK", "ACTIVITY_CLASS_PK", "LACTATE_THRESHOLD_SPEED_PK", "LACTATE_THRESHOLD_HEART_RATE_PK", "LACTATE_THRESHOLD_HEART_RATE_CYCLING_PK", "FUNCTIONAL_THRESHOLD_POWER_PK", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricProfileDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public BiometricProfileDTO() {
    }
}
