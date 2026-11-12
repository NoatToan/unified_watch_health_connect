package fn0;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0013\u0010 ¨\u0006!"}, d2 = {"Lfn0/b;", "Landroid/os/Parcelable;", "", "typeKey", "geohash", "", "distanceIntoCourse", "lat", "lon", "Lorg/joda/time/DateTime;", "lastReportedDateTime", "", "confirmCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDDLorg/joda/time/DateTime;I)V", "a", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "d", "c", "D", "getDistanceIntoCourse", "()D", "g", JWKParameterNames.RSA_EXPONENT, "h", "f", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "I", "()I", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String typeKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("geohash")
    private final String geohash;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distanceIntoCourse")
    private final double distanceIntoCourse;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lat")
    private final double lat;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lon")
    private final double lon;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastReported")
    @JsonAdapter(GsonUtil.IsoDateTimeTypeAdapter.class)
    private final DateTime lastReportedDateTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("confirmCount")
    private final int confirmCount;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), (DateTime) parcel.readSerializable(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, String str2, double d14, double d15, double d16, DateTime dateTime, int i14) {
        str.getClass();
        str2.getClass();
        this.typeKey = str;
        this.geohash = str2;
        this.distanceIntoCourse = d14;
        this.lat = d15;
        this.lon = d16;
        this.lastReportedDateTime = dateTime;
        this.confirmCount = i14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getConfirmCount() {
        return this.confirmCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getGeohash() {
        return this.geohash;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.typeKey, bVar.typeKey) && s.g(this.geohash, bVar.geohash) && Double.compare(this.distanceIntoCourse, bVar.distanceIntoCourse) == 0 && Double.compare(this.lat, bVar.lat) == 0 && Double.compare(this.lon, bVar.lon) == 0 && s.g(this.lastReportedDateTime, bVar.lastReportedDateTime) && this.confirmCount == bVar.confirmCount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DateTime getLastReportedDateTime() {
        return this.lastReportedDateTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    public final int hashCode() {
        int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(g.j(this.typeKey.hashCode() * 31, 31, this.geohash), 31, this.distanceIntoCourse), 31, this.lat), 31, this.lon);
        DateTime dateTime = this.lastReportedDateTime;
        return Integer.hashCode(this.confirmCount) + ((iB + (dateTime == null ? 0 : dateTime.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTypeKey() {
        return this.typeKey;
    }

    public final String toString() {
        String str = this.typeKey;
        String str2 = this.geohash;
        double d14 = this.distanceIntoCourse;
        double d15 = this.lat;
        double d16 = this.lon;
        DateTime dateTime = this.lastReportedDateTime;
        int i14 = this.confirmCount;
        StringBuilder sbI = p6.b.i("GeohashHazardOnCourseDTO(typeKey=", str, ", geohash=", str2, ", distanceIntoCourse=");
        sbI.append(d14);
        j.x(sbI, ", lat=", d15, ", lon=");
        sbI.append(d16);
        sbI.append(", lastReportedDateTime=");
        sbI.append(dateTime);
        return u0.k(sbI, ", confirmCount=", i14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.typeKey);
        parcel.writeString(this.geohash);
        parcel.writeDouble(this.distanceIntoCourse);
        parcel.writeDouble(this.lat);
        parcel.writeDouble(this.lon);
        parcel.writeSerializable(this.lastReportedDateTime);
        parcel.writeInt(this.confirmCount);
    }
}
