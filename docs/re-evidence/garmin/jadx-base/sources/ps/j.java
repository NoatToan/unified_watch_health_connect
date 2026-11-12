package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016¨\u0006'"}, d2 = {"Lps/j;", "Landroid/os/Parcelable;", "", "imageId", "url", "mediumUrl", "smallUrl", "feedUrl", "", "expirationTimestamp", "", "latitude", "longitude", "photoDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "g", "c", "f", "getSmallUrl", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Long;", "getExpirationTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Double;", "getLatitude", "()Ljava/lang/Double;", "h", "getLongitude", IntegerTokenConverter.CONVERTER_KEY, "getPhotoDate", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageId")
    private final String imageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    private final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mediumUrl")
    private final String mediumUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("smallUrl")
    private final String smallUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedUrl")
    private final String feedUrl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expirationTimestamp")
    private final Long expirationTimestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latitude")
    private final Double latitude;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longitude")
    private final Double longitude;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("photoDate")
    private final String photoDate;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(JSONObject jSONObject) {
        this(jSONObject.optString("imageId", ""), jSONObject.optString("url", ""), jSONObject.optString("mediumUrl", ""), jSONObject.optString("smallUrl", ""), jSONObject.optString("feedUrl", ""), jSONObject.isNull("expirationTimestamp") ? null : Long.valueOf(jSONObject.optLong("expirationTimestamp")), Double.valueOf(jSONObject.optDouble("latitude")), Double.valueOf(jSONObject.optDouble("longitude")), jSONObject.optString("photoDate", ""));
        jSONObject.getClass();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFeedUrl() {
        return this.feedUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.imageId, jVar.imageId) && p005kotlin.jvm.internal.s.g(this.url, jVar.url) && p005kotlin.jvm.internal.s.g(this.mediumUrl, jVar.mediumUrl) && p005kotlin.jvm.internal.s.g(this.smallUrl, jVar.smallUrl) && p005kotlin.jvm.internal.s.g(this.feedUrl, jVar.feedUrl) && p005kotlin.jvm.internal.s.g(this.expirationTimestamp, jVar.expirationTimestamp) && p005kotlin.jvm.internal.s.g(this.latitude, jVar.latitude) && p005kotlin.jvm.internal.s.g(this.longitude, jVar.longitude) && p005kotlin.jvm.internal.s.g(this.photoDate, jVar.photoDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMediumUrl() {
        return this.mediumUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.imageId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediumUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.smallUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.feedUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l14 = this.expirationTimestamp;
        int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Double d14 = this.latitude;
        int iHashCode7 = (iHashCode6 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.longitude;
        int iHashCode8 = (iHashCode7 + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str6 = this.photoDate;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.imageId;
        String str2 = this.url;
        String str3 = this.mediumUrl;
        String str4 = this.smallUrl;
        String str5 = this.feedUrl;
        Long l14 = this.expirationTimestamp;
        Double d14 = this.latitude;
        Double d15 = this.longitude;
        String str6 = this.photoDate;
        StringBuilder sbI = p6.b.i("ActivityImageDTO(imageId=", str, ", url=", str2, ", mediumUrl=");
        sn.a.t(sbI, str3, ", smallUrl=", str4, ", feedUrl=");
        n23.j.q(l14, str5, ", expirationTimestamp=", ", latitude=", sbI);
        b71.i.p(d14, d15, ", longitude=", ", photoDate=", sbI);
        return am.j.o(str6, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.imageId);
        parcel.writeString(this.url);
        parcel.writeString(this.mediumUrl);
        parcel.writeString(this.smallUrl);
        parcel.writeString(this.feedUrl);
        Long l14 = this.expirationTimestamp;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Double d14 = this.latitude;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.longitude;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeString(this.photoDate);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lps/j$a;", "", "<init>", "()V", "", "FEED_URL_KEY", "Ljava/lang/String;", "IMAGE_ID_KEY", "LATITUDE_KEY", "LONGITUDE_KEY", "MEDIUM_URL_KEY", "PHOTO_DATE_KEY", "SMALL_URL_KEY", "URL_KEY", "EXPIRATION_TIMESTAMP_KEY", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public j(String str, String str2, String str3, String str4, String str5, Long l14, Double d14, Double d15, String str6) {
        this.imageId = str;
        this.url = str2;
        this.mediumUrl = str3;
        this.smallUrl = str4;
        this.feedUrl = str5;
        this.expirationTimestamp = l14;
        this.latitude = d14;
        this.longitude = d15;
        this.photoDate = str6;
    }

    public /* synthetic */ j(String str, String str2, String str3, String str4, String str5, Long l14, Double d14, Double d15, String str6, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : l14, (i14 & 64) != 0 ? null : d14, (i14 & 128) != 0 ? null : d15, (i14 & 256) != 0 ? null : str6);
    }

    public j() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
