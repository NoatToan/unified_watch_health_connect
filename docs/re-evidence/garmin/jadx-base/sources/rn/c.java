package rn;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import v.e0;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0012R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Lrn/c;", "Landroid/os/Parcelable;", "", "activityUUuid", "reportSubCategory", "reportFormat", "", "contentToSkip", "requestedDateFormatKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getActivityUUuid", "()Ljava/lang/String;", "b", "getReportSubCategory", "setReportSubCategory", "(Ljava/lang/String;)V", "c", "getReportFormat", "setReportFormat", "d", "Ljava/util/List;", "getContentToSkip", "()Ljava/util/List;", "setContentToSkip", "(Ljava/util/List;)V", JWKParameterNames.RSA_EXPONENT, "getRequestedDateFormatKey", "setRequestedDateFormatKey", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("supplementalId")
    private final String activityUUuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportSubCategory")
    private String reportSubCategory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportFormat")
    private String reportFormat;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentToSkip")
    private List<String> contentToSkip;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestedDateFormatKey")
    private String requestedDateFormatKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(String str, String str2, String str3, List<String> list, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        str4.getClass();
        this.activityUUuid = str;
        this.reportSubCategory = str2;
        this.reportFormat = str3;
        this.contentToSkip = list;
        this.requestedDateFormatKey = str4;
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
        return s.g(this.activityUUuid, cVar.activityUUuid) && s.g(this.reportSubCategory, cVar.reportSubCategory) && s.g(this.reportFormat, cVar.reportFormat) && s.g(this.contentToSkip, cVar.contentToSkip) && s.g(this.requestedDateFormatKey, cVar.requestedDateFormatKey);
    }

    public final int hashCode() {
        return this.requestedDateFormatKey.hashCode() + u0.b(g.j(g.j(this.activityUUuid.hashCode() * 31, 31, this.reportSubCategory), 31, this.reportFormat), 31, this.contentToSkip);
    }

    public final String toString() {
        String str = this.activityUUuid;
        String str2 = this.reportSubCategory;
        String str3 = this.reportFormat;
        List<String> list = this.contentToSkip;
        String str4 = this.requestedDateFormatKey;
        StringBuilder sbI = p6.b.i("WellnessActivityReportsRequest(activityUUuid=", str, ", reportSubCategory=", str2, ", reportFormat=");
        e0.o(str3, ", contentToSkip=", ", requestedDateFormatKey=", sbI, list);
        return j.o(str4, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.activityUUuid);
        parcel.writeString(this.reportSubCategory);
        parcel.writeString(this.reportFormat);
        parcel.writeStringList(this.contentToSkip);
        parcel.writeString(this.requestedDateFormatKey);
    }

    public c(String str, String str2, String str3, List list, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? "PDF" : str3, (i14 & 8) != 0 ? j0.f134944a : list, str4);
    }
}
