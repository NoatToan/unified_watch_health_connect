package com.garmin.android.apps.connectmobile.courses.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "Lcom/garmin/android/apps/connectmobile/courses/model/h;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "name", "<init>", "(DDLcom/garmin/android/apps/connectmobile/courses/model/h;Ljava/lang/String;)V", "a", "D", "b", "()D", "d", "c", "Lcom/garmin/android/apps/connectmobile/courses/model/h;", "g", "()Lcom/garmin/android/apps/connectmobile/courses/model/h;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "CoursePointOfInterestTypeAdapter", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PointOfInterestDTO implements Parcelable {
    public static final Parcelable.Creator<PointOfInterestDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latitude")
    private final double latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longitude")
    private final double longitude;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    @JsonAdapter(CoursePointOfInterestTypeAdapter.class)
    private final h type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO$CoursePointOfInterestTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/garmin/android/apps/connectmobile/courses/model/h;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CoursePointOfInterestTypeAdapter extends TypeAdapter<h> {
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final h read2(JsonReader jsonReader) {
            jsonReader.getClass();
            h.a aVar = h.f32946d;
            String strNextString = jsonReader.nextString();
            strNextString.getClass();
            aVar.getClass();
            return h.a.a(strNextString);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, h hVar) {
            h hVar2 = hVar;
            jsonWriter.getClass();
            jsonWriter.value(hVar2 != null ? hVar2.f32965a : null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PointOfInterestDTO> {
        @Override // android.os.Parcelable.Creator
        public final PointOfInterestDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PointOfInterestDTO(parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? null : h.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PointOfInterestDTO[] newArray(int i14) {
            return new PointOfInterestDTO[i14];
        }
    }

    public PointOfInterestDTO(double d14, double d15, h hVar, String str) {
        this.latitude = d14;
        this.longitude = d15;
        this.type = hVar;
        this.name = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointOfInterestDTO)) {
            return false;
        }
        PointOfInterestDTO pointOfInterestDTO = (PointOfInterestDTO) obj;
        return Double.compare(this.latitude, pointOfInterestDTO.latitude) == 0 && Double.compare(this.longitude, pointOfInterestDTO.longitude) == 0 && this.type == pointOfInterestDTO.type && s.g(this.name, pointOfInterestDTO.name);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h getType() {
        return this.type;
    }

    public final int hashCode() {
        int iB = org.apache.commons.lang3.e.b(Double.hashCode(this.latitude) * 31, 31, this.longitude);
        h hVar = this.type;
        int iHashCode = (iB + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str = this.name;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        double d14 = this.latitude;
        double d15 = this.longitude;
        h hVar = this.type;
        String str = this.name;
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("PointOfInterestDTO(latitude=", d14, ", longitude=");
        sbA.append(d15);
        sbA.append(", type=");
        sbA.append(hVar);
        return e0.h(sbA, ", name=", str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        h hVar = this.type;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(hVar.name());
        }
        parcel.writeString(this.name);
    }
}
