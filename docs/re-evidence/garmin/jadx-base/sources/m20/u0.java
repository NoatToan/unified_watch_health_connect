package m20;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Date;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lm20/u0;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "longURL", "shortURL", "shortCode", "Ljava/util/Date;", "dateTimeExpiresOn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getLongURL", "c", "d", "getShortCode", JWKParameterNames.RSA_EXPONENT, "Ljava/util/Date;", "getDateTimeExpiresOn", "()Ljava/util/Date;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u0 implements Parcelable {
    public static final Parcelable.Creator<u0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longUrl")
    private final String longURL;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shortURL")
    private final String shortURL;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shortCode")
    private final String shortCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expiresOn")
    private final Date dateTimeExpiresOn;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u0> {
        @Override // android.os.Parcelable.Creator
        public final u0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new u0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final u0[] newArray(int i14) {
            return new u0[i14];
        }
    }

    public u0(String str, String str2, String str3, String str4, Date date) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        date.getClass();
        this.id = str;
        this.longURL = str2;
        this.shortURL = str3;
        this.shortCode = str4;
        this.dateTimeExpiresOn = date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getShortURL() {
        return this.shortURL;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return p005kotlin.jvm.internal.s.g(this.id, u0Var.id) && p005kotlin.jvm.internal.s.g(this.longURL, u0Var.longURL) && p005kotlin.jvm.internal.s.g(this.shortURL, u0Var.shortURL) && p005kotlin.jvm.internal.s.g(this.shortCode, u0Var.shortCode) && p005kotlin.jvm.internal.s.g(this.dateTimeExpiresOn, u0Var.dateTimeExpiresOn);
    }

    public final int hashCode() {
        return this.dateTimeExpiresOn.hashCode() + wr.g.j(wr.g.j(wr.g.j(this.id.hashCode() * 31, 31, this.longURL), 31, this.shortURL), 31, this.shortCode);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.longURL;
        String str3 = this.shortURL;
        String str4 = this.shortCode;
        Date date = this.dateTimeExpiresOn;
        StringBuilder sbI = p6.b.i("ShortLinkResponseDTO(id=", str, ", longURL=", str2, ", shortURL=");
        sn.a.t(sbI, str3, ", shortCode=", str4, ", dateTimeExpiresOn=");
        sbI.append(date);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.longURL);
        parcel.writeString(this.shortURL);
        parcel.writeString(this.shortCode);
        parcel.writeSerializable(this.dateTimeExpiresOn);
    }
}
