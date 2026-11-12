package qa2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001b"}, d2 = {"Lqa2/d;", "Landroid/os/Parcelable;", "", "reportId", "Lqa2/a;", "progress", "url", "", "fileSize", "creationTimestampGMT", "<init>", "(Ljava/lang/String;Lqa2/a;Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getReportId", "()Ljava/lang/String;", "b", "Lqa2/a;", "()Lqa2/a;", "c", "getUrl", "d", "I", "getFileSize", "()I", JWKParameterNames.RSA_EXPONENT, "getCreationTimestampGMT", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportId")
    private final String reportId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("progress")
    private final qa2.a progress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    private final String url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fileSize")
    private final int fileSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("creationTimestampGMT")
    private final String creationTimestampGMT;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), qa2.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(String str, qa2.a aVar, String str2, int i14, String str3) {
        str.getClass();
        aVar.getClass();
        str2.getClass();
        str3.getClass();
        this.reportId = str;
        this.progress = aVar;
        this.url = str2;
        this.fileSize = i14;
        this.creationTimestampGMT = str3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final qa2.a getProgress() {
        return this.progress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.reportId, dVar.reportId) && s.g(this.progress, dVar.progress) && s.g(this.url, dVar.url) && this.fileSize == dVar.fileSize && s.g(this.creationTimestampGMT, dVar.creationTimestampGMT);
    }

    public final int hashCode() {
        return this.creationTimestampGMT.hashCode() + q2.d(this.fileSize, wr.g.j((this.progress.hashCode() + (this.reportId.hashCode() * 31)) * 31, 31, this.url), 31);
    }

    public final String toString() {
        String str = this.reportId;
        qa2.a aVar = this.progress;
        String str2 = this.url;
        int i14 = this.fileSize;
        String str3 = this.creationTimestampGMT;
        StringBuilder sb3 = new StringBuilder("ReportStatusModel(reportId=");
        sb3.append(str);
        sb3.append(", progress=");
        sb3.append(aVar);
        sb3.append(", url=");
        q6.f.q(i14, str2, ", fileSize=", ", creationTimestampGMT=", sb3);
        return am.j.o(str3, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.reportId);
        this.progress.writeToParcel(parcel, i14);
        parcel.writeString(this.url);
        parcel.writeInt(this.fileSize);
        parcel.writeString(this.creationTimestampGMT);
    }
}
