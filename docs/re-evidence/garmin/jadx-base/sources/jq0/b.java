package jq0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;
import u62.z;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ljq0/b;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "", "locale", "senderName", "", "contactUuids", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "I", "getLatitude", "()I", "b", "getLongitude", "c", "Ljava/lang/String;", "getLocale", "()Ljava/lang/String;", "d", "getSenderName", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "getContactUuids", "()Ljava/util/List;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lat")
    private final int latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lon")
    private final int longitude;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    private final String locale;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("senderName")
    private final String senderName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactUuids")
    private final List<String> contactUuids;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(int i14, int i15, String str, String str2, List list, int i16, j jVar) {
        this(i14, i15, str, (i16 & 8) != 0 ? null : str2, (i16 & 16) != 0 ? j0.f134944a : list);
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
        return this.latitude == bVar.latitude && this.longitude == bVar.longitude && s.g(this.locale, bVar.locale) && s.g(this.senderName, bVar.senderName) && s.g(this.contactUuids, bVar.contactUuids);
    }

    public final int hashCode() {
        int iJ = g.j(q2.d(this.longitude, Integer.hashCode(this.latitude) * 31, 31), 31, this.locale);
        String str = this.senderName;
        return this.contactUuids.hashCode() + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        int i14 = this.latitude;
        int i15 = this.longitude;
        String str = this.locale;
        String str2 = this.senderName;
        List<String> list = this.contactUuids;
        StringBuilder sbJ = e5.j(i14, i15, "CyclingIncidentRequestDTO(latitude=", ", longitude=", ", locale=");
        sn.a.t(sbJ, str, ", senderName=", str2, ", contactUuids=");
        return z.c(sbJ, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.latitude);
        parcel.writeInt(this.longitude);
        parcel.writeString(this.locale);
        parcel.writeString(this.senderName);
        parcel.writeStringList(this.contactUuids);
    }

    public b(int i14, int i15, String str, String str2, List<String> list) {
        str.getClass();
        list.getClass();
        this.latitude = i14;
        this.longitude = i15;
        this.locale = str;
        this.senderName = str2;
        this.contactUuids = list;
    }
}
