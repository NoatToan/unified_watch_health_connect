package qa2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, d2 = {"Lqa2/j;", "Landroid/os/Parcelable;", "", "reportSubCategory", "reportFormat", "", "contentToSkip", "requestedDateFormatKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getReportSubCategory", "()Ljava/lang/String;", "setReportSubCategory", "(Ljava/lang/String;)V", "b", "getReportFormat", "setReportFormat", "c", "Ljava/util/List;", "getContentToSkip", "()Ljava/util/List;", "setContentToSkip", "(Ljava/util/List;)V", "d", "getRequestedDateFormatKey", "setRequestedDateFormatKey", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportSubCategory")
    private String reportSubCategory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportFormat")
    private String reportFormat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentToSkip")
    private List<String> contentToSkip;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestedDateFormatKey")
    private String requestedDateFormatKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(String str, String str2, List<String> list, String str3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        this.reportSubCategory = str;
        this.reportFormat = str2;
        this.contentToSkip = list;
        this.requestedDateFormatKey = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.reportSubCategory, jVar.reportSubCategory) && s.g(this.reportFormat, jVar.reportFormat) && s.g(this.contentToSkip, jVar.contentToSkip) && s.g(this.requestedDateFormatKey, jVar.requestedDateFormatKey);
    }

    public final int hashCode() {
        return this.requestedDateFormatKey.hashCode() + u0.b(wr.g.j(this.reportSubCategory.hashCode() * 31, 31, this.reportFormat), 31, this.contentToSkip);
    }

    public final String toString() {
        String str = this.reportSubCategory;
        String str2 = this.reportFormat;
        List<String> list = this.contentToSkip;
        String str3 = this.requestedDateFormatKey;
        StringBuilder sbI = p6.b.i("ReportsFormatModel(reportSubCategory=", str, ", reportFormat=", str2, ", contentToSkip=");
        sbI.append(list);
        sbI.append(", requestedDateFormatKey=");
        sbI.append(str3);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.reportSubCategory);
        parcel.writeString(this.reportFormat);
        parcel.writeStringList(this.contentToSkip);
        parcel.writeString(this.requestedDateFormatKey);
    }

    public j(String str, String str2, List list, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "PDF" : str2, (i14 & 4) != 0 ? j0.f134944a : list, str3);
    }
}
