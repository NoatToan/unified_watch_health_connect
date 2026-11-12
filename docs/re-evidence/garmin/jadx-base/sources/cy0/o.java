package cy0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcy0/o;", "Landroid/os/Parcelable;", "Lcy0/r;", "mediaUuid", "", "url", "smallUrl", "mediumUrl", "largeUrl", "urlExpirationUTC", "<init>", "(Lcy0/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Lcy0/r;", "d", "()Lcy0/r;", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "c", "g", "f", JWKParameterNames.RSA_EXPONENT, "getUrlExpirationUTC", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mediaUUID")
    private final r mediaUuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    private final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("smallUrl")
    private final String smallUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mediumUrl")
    private final String mediumUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("largeUrl")
    private final String largeUrl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("urlExpiration")
    private final String urlExpirationUTC;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(r.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public o(r rVar, String str, String str2, String str3, String str4, String str5) {
        rVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.mediaUuid = rVar;
        this.url = str;
        this.smallUrl = str2;
        this.mediumUrl = str3;
        this.largeUrl = str4;
        this.urlExpirationUTC = str5;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLargeUrl() {
        return this.largeUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final r getMediaUuid() {
        return this.mediaUuid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.mediaUuid, oVar.mediaUuid) && p005kotlin.jvm.internal.s.g(this.url, oVar.url) && p005kotlin.jvm.internal.s.g(this.smallUrl, oVar.smallUrl) && p005kotlin.jvm.internal.s.g(this.mediumUrl, oVar.mediumUrl) && p005kotlin.jvm.internal.s.g(this.largeUrl, oVar.largeUrl) && p005kotlin.jvm.internal.s.g(this.urlExpirationUTC, oVar.urlExpirationUTC);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMediumUrl() {
        return this.mediumUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSmallUrl() {
        return this.smallUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(wr.g.j(wr.g.j(this.mediaUuid.hashCode() * 31, 31, this.url), 31, this.smallUrl), 31, this.mediumUrl), 31, this.largeUrl);
        String str = this.urlExpirationUTC;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        r rVar = this.mediaUuid;
        String str = this.url;
        String str2 = this.smallUrl;
        String str3 = this.mediumUrl;
        String str4 = this.largeUrl;
        String str5 = this.urlExpirationUTC;
        StringBuilder sb3 = new StringBuilder("MultiDayActivityImageDTO(mediaUuid=");
        sb3.append(rVar);
        sb3.append(", url=");
        sb3.append(str);
        sb3.append(", smallUrl=");
        sn.a.t(sb3, str2, ", mediumUrl=", str3, ", largeUrl=");
        return e5.h(sb3, str4, ", urlExpirationUTC=", str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.mediaUuid.writeToParcel(parcel, i14);
        parcel.writeString(this.url);
        parcel.writeString(this.smallUrl);
        parcel.writeString(this.mediumUrl);
        parcel.writeString(this.largeUrl);
        parcel.writeString(this.urlExpirationUTC);
    }

    public /* synthetic */ o(r rVar, String str, String str2, String str3, String str4, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
        this(rVar, str, str2, str3, str4, (i14 & 32) != 0 ? null : str5);
    }
}
