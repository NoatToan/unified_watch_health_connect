package qa2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lqa2/b;", "Landroid/os/Parcelable;", "", "reportID", "", "estimatedTimeForStatusCheck", "statusCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "I", "()I", "c", "f", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportId")
    private final String reportID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(alternate = {"checkInMilliSeconds"}, value = "estimatedTimeForStatusCheck")
    private final int estimatedTimeForStatusCheck;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("statusCode")
    private final String statusCode;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, int i14, String str2) {
        str.getClass();
        str2.getClass();
        this.reportID = str;
        this.estimatedTimeForStatusCheck = i14;
        this.statusCode = str2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getEstimatedTimeForStatusCheck() {
        return this.estimatedTimeForStatusCheck;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getReportID() {
        return this.reportID;
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
        return s.g(this.reportID, bVar.reportID) && this.estimatedTimeForStatusCheck == bVar.estimatedTimeForStatusCheck && s.g(this.statusCode, bVar.statusCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    public final int hashCode() {
        return this.statusCode.hashCode() + q2.d(this.estimatedTimeForStatusCheck, this.reportID.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.reportID;
        return am.j.o(this.statusCode, ")", androidx.core.view.j.k(this.estimatedTimeForStatusCheck, "ReportIDModel(reportID=", str, ", estimatedTimeForStatusCheck=", ", statusCode="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.reportID);
        parcel.writeInt(this.estimatedTimeForStatusCheck);
        parcel.writeString(this.statusCode);
    }

    public b(String str, int i14, String str2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, (i15 & 4) != 0 ? k.DEFAULT_STATE.f143942a : str2);
    }
}
