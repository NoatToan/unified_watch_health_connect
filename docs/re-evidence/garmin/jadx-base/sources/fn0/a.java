package fn0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"Lfn0/a;", "Landroid/os/Parcelable;", "", "typeKey", "geohash", "", "lat", "lon", "Lorg/joda/time/DateTime;", "lastReportedDateTime", "confirmCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILorg/joda/time/DateTime;I)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "I", "f", "()I", "d", "g", JWKParameterNames.RSA_EXPONENT, "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "getConfirmCount", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1469a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String typeKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("geohash")
    private final String geohash;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lat")
    private final int lat;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lon")
    private final int lon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastReported")
    @JsonAdapter(GsonUtil.IsoDateTimeTypeAdapter.class)
    private final DateTime lastReportedDateTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("confirmCount")
    private final int confirmCount;

    /* JADX INFO: renamed from: fn0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1469a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), (DateTime) parcel.readSerializable(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, String str2, int i14, int i15, DateTime dateTime, int i16) {
        str.getClass();
        str2.getClass();
        this.typeKey = str;
        this.geohash = str2;
        this.lat = i14;
        this.lon = i15;
        this.lastReportedDateTime = dateTime;
        this.confirmCount = i16;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getGeohash() {
        return this.geohash;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DateTime getLastReportedDateTime() {
        return this.lastReportedDateTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.typeKey, aVar.typeKey) && s.g(this.geohash, aVar.geohash) && this.lat == aVar.lat && this.lon == aVar.lon && s.g(this.lastReportedDateTime, aVar.lastReportedDateTime) && this.confirmCount == aVar.confirmCount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getLon() {
        return this.lon;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    public final c h() {
        for (c cVar : c.values()) {
            if (s.g(cVar.f72173a, this.typeKey)) {
                if (cVar == null) {
                    return c.UNKNOWN;
                }
                return cVar;
            }
        }
        cVar = null;
        if (cVar == null) {
            return c.UNKNOWN;
        }
        return cVar;
    }

    public final int hashCode() {
        int iD = q2.d(this.lon, q2.d(this.lat, g.j(this.typeKey.hashCode() * 31, 31, this.geohash), 31), 31);
        DateTime dateTime = this.lastReportedDateTime;
        return Integer.hashCode(this.confirmCount) + ((iD + (dateTime == null ? 0 : dateTime.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.typeKey;
        String str2 = this.geohash;
        int i14 = this.lat;
        int i15 = this.lon;
        DateTime dateTime = this.lastReportedDateTime;
        int i16 = this.confirmCount;
        StringBuilder sbI = p6.b.i("GeohashHazardDTO(typeKey=", str, ", geohash=", str2, ", lat=");
        e0.m(i14, i15, ", lon=", ", lastReportedDateTime=", sbI);
        sbI.append(dateTime);
        sbI.append(", confirmCount=");
        sbI.append(i16);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.typeKey);
        parcel.writeString(this.geohash);
        parcel.writeInt(this.lat);
        parcel.writeInt(this.lon);
        parcel.writeSerializable(this.lastReportedDateTime);
        parcel.writeInt(this.confirmCount);
    }
}
