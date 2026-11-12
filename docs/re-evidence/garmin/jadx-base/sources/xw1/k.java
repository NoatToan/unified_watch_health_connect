package xw1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, d2 = {"Lxw1/k;", "Landroid/os/Parcelable;", "", "raceDate", "raceRegistrationUrl", "raceTitle", "", "raceEventId", "raceEventUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "b", "getRaceRegistrationUrl", "s", "c", "h", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Ljava/lang/Long;)V", JWKParameterNames.RSA_EXPONENT, "g", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("raceDate")
    private String raceDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("raceRegistrationUrl")
    private String raceRegistrationUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("raceTitle")
    private String raceTitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("raceEventId")
    private Long raceEventId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("raceEventUuid")
    private String raceEventUuid;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f192409f = new a(null);
    public static final Parcelable.Creator<k> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public /* synthetic */ k(String str, String str2, String str3, Long l14, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : l14, (i14 & 16) != 0 ? null : str4);
    }

    public final DateTime b() {
        String str = this.raceDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRaceDate() {
        return this.raceDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.raceDate, kVar.raceDate) && s.g(this.raceRegistrationUrl, kVar.raceRegistrationUrl) && s.g(this.raceTitle, kVar.raceTitle) && s.g(this.raceEventId, kVar.raceEventId) && s.g(this.raceEventUuid, kVar.raceEventUuid);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getRaceEventId() {
        return this.raceEventId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRaceEventUuid() {
        return this.raceEventUuid;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRaceTitle() {
        return this.raceTitle;
    }

    public final int hashCode() {
        String str = this.raceDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.raceRegistrationUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.raceTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.raceEventId;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str4 = this.raceEventUuid;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean i() {
        return this.raceEventId != null || g22.n.d(this.raceEventUuid);
    }

    public final boolean j(Long l14, String str) {
        Long l15 = this.raceEventId;
        if (l15 != null && s.g(l15, l14)) {
            return true;
        }
        String str2 = this.raceEventUuid;
        return str2 != null && s.g(str2, str);
    }

    public final boolean k(fg0.k kVar) {
        Long l14 = this.raceEventId;
        if (l14 != null) {
            if (s.g(l14, kVar != null ? kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null)) {
                return true;
            }
        }
        String str = this.raceEventUuid;
        if (str != null) {
            return s.g(str, kVar != null ? kVar.getShareableEventUuid() : null);
        }
        return false;
    }

    public final boolean m() {
        if (this.raceEventId == null) {
            return false;
        }
        String str = this.raceEventUuid;
        return str == null || str.length() == 0;
    }

    public final void o(String str) {
        this.raceDate = str;
    }

    public final void q(Long l14) {
        this.raceEventId = l14;
    }

    public final void r(String str) {
        this.raceEventUuid = str;
    }

    public final void s(String str) {
        this.raceRegistrationUrl = str;
    }

    public final void t(String str) {
        this.raceTitle = str;
    }

    public final String toString() {
        String str = this.raceDate;
        String str2 = this.raceRegistrationUrl;
        String str3 = this.raceTitle;
        Long l14 = this.raceEventId;
        String str4 = this.raceEventUuid;
        StringBuilder sbI = p6.b.i("RaceDTO(raceDate=", str, ", raceRegistrationUrl=", str2, ", raceTitle=");
        n23.j.q(l14, str3, ", raceEventId=", ", raceEventUuid=", sbI);
        return am.j.o(str4, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.raceDate);
        parcel.writeString(this.raceRegistrationUrl);
        parcel.writeString(this.raceTitle);
        Long l14 = this.raceEventId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.raceEventUuid);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxw1/k$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public k(String str, String str2, String str3, Long l14, String str4) {
        this.raceDate = str;
        this.raceRegistrationUrl = str2;
        this.raceTitle = str3;
        this.raceEventId = l14;
        this.raceEventUuid = str4;
    }

    public k() {
        this(null, null, null, null, null, 31, null);
    }
}
