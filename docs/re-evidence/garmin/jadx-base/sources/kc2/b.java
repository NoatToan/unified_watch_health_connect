package kc2;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lkc2/b;", "Landroid/os/Parcelable;", "", "errorGroupName", "errorType", "errorMessage", "errorStackTrace", "errorPriority", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "h", "m", "c", "d", "j", "g", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_EXPONENT, "f", "setErrorPriority", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ErrorTag")
    private String errorGroupName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Type")
    private String errorType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Message")
    private String errorMessage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("StackTrace")
    private String errorStackTrace;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ErrorPriority")
    private String errorPriority;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, String str2, String str3, String str4, String str5) {
        kg.f.p(str, str2, str3, str4);
        this.errorGroupName = str;
        this.errorType = str2;
        this.errorMessage = str3;
        this.errorStackTrace = str4;
        this.errorPriority = str5;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorGroupName() {
        return this.errorGroupName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
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
        return s.g(this.errorGroupName, bVar.errorGroupName) && s.g(this.errorType, bVar.errorType) && s.g(this.errorMessage, bVar.errorMessage) && s.g(this.errorStackTrace, bVar.errorStackTrace) && s.g(this.errorPriority, bVar.errorPriority);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getErrorPriority() {
        return this.errorPriority;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getErrorStackTrace() {
        return this.errorStackTrace;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(wr.g.j(this.errorGroupName.hashCode() * 31, 31, this.errorType), 31, this.errorMessage), 31, this.errorStackTrace);
        String str = this.errorPriority;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final void i(String str) {
        this.errorGroupName = str;
    }

    public final void j(String str) {
        this.errorMessage = str;
    }

    public final void k(String str) {
        this.errorStackTrace = str;
    }

    public final void m(String str) {
        this.errorType = str;
    }

    public final String toString() {
        String str = this.errorGroupName;
        String str2 = this.errorType;
        String str3 = this.errorMessage;
        String str4 = this.errorStackTrace;
        String str5 = this.errorPriority;
        StringBuilder sbI = p6.b.i("ErrorInfo(errorGroupName=", str, ", errorType=", str2, ", errorMessage=");
        sn.a.t(sbI, str3, ", errorStackTrace=", str4, ", errorPriority=");
        return j.o(str5, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.errorGroupName);
        parcel.writeString(this.errorType);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.errorStackTrace);
        parcel.writeString(this.errorPriority);
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, str4, (i14 & 16) != 0 ? null : str5);
    }
}
