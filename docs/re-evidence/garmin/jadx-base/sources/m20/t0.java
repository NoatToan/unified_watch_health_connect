package m20;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lm20/t0;", "Landroid/os/Parcelable;", "", "longURL", "domain", "shortCode", "Ljava/util/Date;", "dateTimeExpiresOn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "a", "Ljava/lang/String;", "getLongURL", "()Ljava/lang/String;", "b", "getDomain", "c", "getShortCode", "d", "Ljava/util/Date;", "getDateTimeExpiresOn", "()Ljava/util/Date;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t0 implements Parcelable {
    public static final Parcelable.Creator<t0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longURL")
    private final String longURL;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("domain")
    private final String domain;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shortCode")
    private final String shortCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expiresOn")
    private final Date dateTimeExpiresOn;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<t0> {
        @Override // android.os.Parcelable.Creator
        public final t0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new t0(parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final t0[] newArray(int i14) {
            return new t0[i14];
        }
    }

    public t0(String str, String str2, String str3, Date date) {
        str.getClass();
        str2.getClass();
        this.longURL = str;
        this.domain = str2;
        this.shortCode = str3;
        this.dateTimeExpiresOn = date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return p005kotlin.jvm.internal.s.g(this.longURL, t0Var.longURL) && p005kotlin.jvm.internal.s.g(this.domain, t0Var.domain) && p005kotlin.jvm.internal.s.g(this.shortCode, t0Var.shortCode) && p005kotlin.jvm.internal.s.g(this.dateTimeExpiresOn, t0Var.dateTimeExpiresOn);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.longURL.hashCode() * 31, 31, this.domain);
        String str = this.shortCode;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.dateTimeExpiresOn;
        return iHashCode + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        String str = this.longURL;
        String str2 = this.domain;
        String str3 = this.shortCode;
        Date date = this.dateTimeExpiresOn;
        StringBuilder sbI = p6.b.i("ShortLinkRequestDTO(longURL=", str, ", domain=", str2, ", shortCode=");
        sbI.append(str3);
        sbI.append(", dateTimeExpiresOn=");
        sbI.append(date);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.longURL);
        parcel.writeString(this.domain);
        parcel.writeString(this.shortCode);
        parcel.writeSerializable(this.dateTimeExpiresOn);
    }

    public /* synthetic */ t0(String str, String str2, String str3, Date date, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : date);
    }
}
