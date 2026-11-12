package ww1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rBG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lww1/h;", "Landroid/os/Parcelable;", "", "raceDay", "raceName", "raceUrl", "", "activeRace", "", "raceEventId", "raceEventUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "h", "c", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "getActiveRace", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "setRaceEventId", "(Ljava/lang/Long;)V", "g", "setRaceEventUuid", "(Ljava/lang/String;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("raceDay")
    private final String raceDay;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("raceName")
    private final String raceName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("raceUrl")
    private final String raceUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activeRace")
    private final Boolean activeRace;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("raceEventId")
    private Long raceEventId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("raceEventUuid")
    private String raceEventUuid;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new h(string, string2, string3, boolValueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ h(String str, String str2, String str3, Boolean bool, Long l14, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, bool, (i14 & 16) != 0 ? null : l14, (i14 & 32) != 0 ? null : str4);
    }

    public final DateTime b() {
        String str = this.raceDay;
        if (str != null) {
            try {
                return g22.k.p(str, "yyyy-MM-dd", null);
            } catch (IllegalArgumentException e4) {
                String strN = fb1.c.n("Error parsing race day: ", e4.getMessage());
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "AthleteRaceDTO", strN);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRaceDay() {
        return this.raceDay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.raceDay, hVar.raceDay) && p005kotlin.jvm.internal.s.g(this.raceName, hVar.raceName) && p005kotlin.jvm.internal.s.g(this.raceUrl, hVar.raceUrl) && p005kotlin.jvm.internal.s.g(this.activeRace, hVar.activeRace) && p005kotlin.jvm.internal.s.g(this.raceEventId, hVar.raceEventId) && p005kotlin.jvm.internal.s.g(this.raceEventUuid, hVar.raceEventUuid);
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
    public final String getRaceName() {
        return this.raceName;
    }

    public final int hashCode() {
        String str = this.raceDay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.raceName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.raceUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.activeRace;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l14 = this.raceEventId;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str4 = this.raceEventUuid;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRaceUrl() {
        return this.raceUrl;
    }

    public final xw1.k j() {
        return new xw1.k(this.raceDay, this.raceUrl, this.raceName, this.raceEventId, this.raceEventUuid);
    }

    public final String toString() {
        String str = this.raceDay;
        String str2 = this.raceName;
        String str3 = this.raceUrl;
        Boolean bool = this.activeRace;
        Long l14 = this.raceEventId;
        String str4 = this.raceEventUuid;
        StringBuilder sbI = p6.b.i("AthleteRaceDTO(raceDay=", str, ", raceName=", str2, ", raceUrl=");
        b71.i.w(sbI, str3, ", activeRace=", bool, ", raceEventId=");
        sbI.append(l14);
        sbI.append(", raceEventUuid=");
        sbI.append(str4);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.raceDay);
        parcel.writeString(this.raceName);
        parcel.writeString(this.raceUrl);
        Boolean bool = this.activeRace;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Long l14 = this.raceEventId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.raceEventUuid);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lww1/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DATE_FORMAT", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public h(String str, String str2, String str3, Boolean bool, Long l14, String str4) {
        this.raceDay = str;
        this.raceName = str2;
        this.raceUrl = str3;
        this.activeRace = bool;
        this.raceEventId = l14;
        this.raceEventUuid = str4;
    }
}
