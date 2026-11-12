package jq0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;
import tn.k;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Ljq0/a;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "", "locale", "senderName", "", "contactUuids", "liveTrackLink", "", "supportsSpectatorMessaging", "userMessage", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "a", "I", "getLatitude", "()I", "b", "getLongitude", "c", "Ljava/lang/String;", "getLocale", "()Ljava/lang/String;", "d", "getSenderName", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "getContactUuids", "()Ljava/util/List;", "f", "getLiveTrackLink", "g", "Ljava/lang/Boolean;", "getSupportsSpectatorMessaging", "()Ljava/lang/Boolean;", "h", "getUserMessage", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1922a();

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

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveTrackLink")
    private final String liveTrackLink;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("supportsSpectatorMessaging")
    private final Boolean supportsSpectatorMessaging;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userMessage")
    private final String userMessage;

    /* JADX INFO: renamed from: jq0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1922a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new a(i14, i15, string, string2, arrayListCreateStringArrayList, string3, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(int i14, int i15, String str, String str2, List list, String str3, Boolean bool, String str4, int i16, j jVar) {
        this(i14, i15, str, (i16 & 8) != 0 ? null : str2, (i16 & 16) != 0 ? j0.f134944a : list, (i16 & 32) != 0 ? null : str3, (i16 & 64) != 0 ? null : bool, (i16 & 128) != 0 ? null : str4);
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
        return this.latitude == aVar.latitude && this.longitude == aVar.longitude && s.g(this.locale, aVar.locale) && s.g(this.senderName, aVar.senderName) && s.g(this.contactUuids, aVar.contactUuids) && s.g(this.liveTrackLink, aVar.liveTrackLink) && s.g(this.supportsSpectatorMessaging, aVar.supportsSpectatorMessaging) && s.g(this.userMessage, aVar.userMessage);
    }

    public final int hashCode() {
        int iJ = g.j(q2.d(this.longitude, Integer.hashCode(this.latitude) * 31, 31), 31, this.locale);
        String str = this.senderName;
        int iB = u0.b((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.contactUuids);
        String str2 = this.liveTrackLink;
        int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.supportsSpectatorMessaging;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.userMessage;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i14 = this.latitude;
        int i15 = this.longitude;
        String str = this.locale;
        String str2 = this.senderName;
        List<String> list = this.contactUuids;
        String str3 = this.liveTrackLink;
        Boolean bool = this.supportsSpectatorMessaging;
        String str4 = this.userMessage;
        StringBuilder sbJ = e5.j(i14, i15, "AssistanceRequestDTO(latitude=", ", longitude=", ", locale=");
        sn.a.t(sbJ, str, ", senderName=", str2, ", contactUuids=");
        o2.c.n(", liveTrackLink=", str3, ", supportsSpectatorMessaging=", sbJ, list);
        sbJ.append(bool);
        sbJ.append(", userMessage=");
        sbJ.append(str4);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.latitude);
        parcel.writeInt(this.longitude);
        parcel.writeString(this.locale);
        parcel.writeString(this.senderName);
        parcel.writeStringList(this.contactUuids);
        parcel.writeString(this.liveTrackLink);
        Boolean bool = this.supportsSpectatorMessaging;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        parcel.writeString(this.userMessage);
    }

    public a(int i14, int i15, String str, String str2, List<String> list, String str3, Boolean bool, String str4) {
        str.getClass();
        list.getClass();
        this.latitude = i14;
        this.longitude = i15;
        this.locale = str;
        this.senderName = str2;
        this.contactUuids = list;
        this.liveTrackLink = str3;
        this.supportsSpectatorMessaging = bool;
        this.userMessage = str4;
    }
}
