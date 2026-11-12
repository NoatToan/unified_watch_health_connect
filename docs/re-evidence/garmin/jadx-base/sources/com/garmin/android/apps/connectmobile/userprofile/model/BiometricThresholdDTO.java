package com.garmin.android.apps.connectmobile.userprofile.model;

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
@JsonAdapter(BiometricThresholdDTODeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricThresholdDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "BiometricThresholdDTODeserializer", "b", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BiometricThresholdDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<BiometricThresholdDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f46809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f46810c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricThresholdDTO$BiometricThresholdDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricThresholdDTO;", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BiometricThresholdDTODeserializer implements JsonDeserializer<BiometricThresholdDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final BiometricThresholdDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                BiometricThresholdDTO biometricThresholdDTO = new BiometricThresholdDTO();
                biometricThresholdDTO.k(new JSONObject(jsonElement.toString()));
                return biometricThresholdDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/model/BiometricThresholdDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricThresholdDTO;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BiometricThresholdDTO> {
        @Override // android.os.Parcelable.Creator
        public final BiometricThresholdDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BiometricThresholdDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiometricThresholdDTO[] newArray(int i14) {
            return new BiometricThresholdDTO[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public BiometricThresholdDTO(Parcel parcel) {
        parcel.getClass();
        this.f46808a = parcel.readString();
        this.f46809b = parcel.readDouble();
        this.f46810c = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f46808a = s1.u(jSONObject, "bioDate");
        this.f46809b = jSONObject.optDouble("value");
        this.f46810c = jSONObject.optLong("sampleId");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f46808a);
        parcel.writeDouble(this.f46809b);
        parcel.writeLong(this.f46810c);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricThresholdDTO$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/BiometricThresholdDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "BIO_DATE_KEY", "Ljava/lang/String;", "VALUE_KEY", "SAMPLE_ID_KEY", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public BiometricThresholdDTO() {
    }
}
