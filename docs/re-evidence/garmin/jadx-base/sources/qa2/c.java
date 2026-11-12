package qa2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"Lqa2/c;", "Landroid/os/Parcelable;", "", "reportId", "", "checkInMilliSeconds", "statusCode", "errorType", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "getStatusCode", "getErrorType", JWKParameterNames.RSA_EXPONENT, "getErrorMessage", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportId")
    private final String reportId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("checkInMilliSeconds")
    private final Integer checkInMilliSeconds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("statusCode")
    private final String statusCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorType")
    private final String errorType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorMessage")
    private final String errorMessage;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(String str, Integer num, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? 0 : num, (i14 & 4) != 0 ? k.DEFAULT_STATE.f143942a : str2, str3, str4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getCheckInMilliSeconds() {
        return this.checkInMilliSeconds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getReportId() {
        return this.reportId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.reportId, cVar.reportId) && s.g(this.checkInMilliSeconds, cVar.checkInMilliSeconds) && s.g(this.statusCode, cVar.statusCode) && s.g(this.errorType, cVar.errorType) && s.g(this.errorMessage, cVar.errorMessage);
    }

    public final boolean f() {
        return this.errorType != null;
    }

    public final boolean g() {
        return this.reportId != null;
    }

    public final int hashCode() {
        String str = this.reportId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.checkInMilliSeconds;
        int iJ = wr.g.j((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.statusCode);
        String str2 = this.errorType;
        int iHashCode2 = (iJ + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.reportId;
        Integer num = this.checkInMilliSeconds;
        String str2 = this.statusCode;
        String str3 = this.errorType;
        String str4 = this.errorMessage;
        StringBuilder sbN = u0.n("ReportIdEcgModel(reportId=", num, str, ", checkInMilliSeconds=", ", statusCode=");
        sn.a.t(sbN, str2, ", errorType=", str3, ", errorMessage=");
        return am.j.o(str4, ")", sbN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.reportId);
        Integer num = this.checkInMilliSeconds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.statusCode);
        parcel.writeString(this.errorType);
        parcel.writeString(this.errorMessage);
    }

    public c(String str, Integer num, String str2, String str3, String str4) {
        str2.getClass();
        this.reportId = str;
        this.checkInMilliSeconds = num;
        this.statusCode = str2;
        this.errorType = str3;
        this.errorMessage = str4;
    }
}
