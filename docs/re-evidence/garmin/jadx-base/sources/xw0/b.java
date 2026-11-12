package xw0;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Lxw0/b;", "Landroid/os/Parcelable;", "", "userProfilePk", "", "periodStartDate", "periodLength", "cycleLength", "reportTimestamp", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "a", "Ljava/lang/Long;", "getUserProfilePk", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getPeriodStartDate", "()Ljava/lang/String;", "c", "getPeriodLength", "d", "getCycleLength", JWKParameterNames.RSA_EXPONENT, "getReportTimestamp", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("periodStartDate")
    private final String periodStartDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("periodLength")
    private final Long periodLength;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cycleLength")
    private final Long cycleLength;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportTimestamp")
    private final String reportTimestamp;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long lValueOf2;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                lValueOf2 = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                lValueOf2 = null;
            }
            String string = parcel.readString();
            Long lValueOf3 = parcel.readInt() == 0 ? lValueOf2 : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new b(lValueOf, string, lValueOf3, lValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(Long l14, String str, Long l15, Long l16, String str2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : l15, (i14 & 8) != 0 ? null : l16, (i14 & 16) != 0 ? null : str2);
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
        return s.g(this.userProfilePk, bVar.userProfilePk) && s.g(this.periodStartDate, bVar.periodStartDate) && s.g(this.periodLength, bVar.periodLength) && s.g(this.cycleLength, bVar.cycleLength) && s.g(this.reportTimestamp, bVar.reportTimestamp);
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.periodStartDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l15 = this.periodLength;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.cycleLength;
        int iHashCode4 = (iHashCode3 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str2 = this.reportTimestamp;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        String str = this.periodStartDate;
        Long l15 = this.periodLength;
        Long l16 = this.cycleLength;
        String str2 = this.reportTimestamp;
        StringBuilder sbJ = i.j("InitialMenstrualCycleDTO(userProfilePk=", ", periodStartDate=", str, l14, ", periodLength=");
        f.s(sbJ, l15, ", cycleLength=", l16, ", reportTimestamp=");
        return am.j.o(str2, ")", sbJ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userProfilePk;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.periodStartDate);
        Long l15 = this.periodLength;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Long l16 = this.cycleLength;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        parcel.writeString(this.reportTimestamp);
    }

    public b(Long l14, String str, Long l15, Long l16, String str2) {
        this.userProfilePk = l14;
        this.periodStartDate = str;
        this.periodLength = l15;
        this.cycleLength = l16;
        this.reportTimestamp = str2;
    }

    public b() {
        this(null, null, null, null, null, 31, null);
    }
}
