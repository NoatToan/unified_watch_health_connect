package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lrn2/s;", "Lpn2/d;", "", "resultCode", "resultMessage", "nextAccessToken", "", "retryAfter", "xMfiVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "f", "c", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "h", "setXMfiVersion", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements pn2.d {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultCode")
    private final String resultCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultMessage")
    private final String resultMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nextAccessToken")
    private final String nextAccessToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("retryAfter")
    private final Integer retryAfter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("xMfiVersion")
    private String xMfiVersion;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new s(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public s(String str, String str2, String str3, Integer num, String str4) {
        int length;
        str.getClass();
        this.resultCode = str;
        this.resultMessage = str2;
        this.nextAccessToken = str3;
        this.retryAfter = num;
        this.xMfiVersion = str4;
        if (str.length() != 4) {
            vb.h.x(am.j.h(str.length(), "resultCode length(4): "));
            throw null;
        }
        if (str2 != null && (1 > (length = str2.length()) || length >= 1025)) {
            vb.h.x(am.j.h(str2.length(), "resultMessage length(1-1024): "));
            throw null;
        }
        if (str3 != null) {
            int length2 = str3.length();
            if (1 > length2 || length2 >= 513) {
                vb.h.x(am.j.h(str3.length(), "resultMessage length(1-512): "));
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextAccessToken() {
        return this.nextAccessToken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getResultCode() {
        return this.resultCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.resultCode, sVar.resultCode) && p005kotlin.jvm.internal.s.g(this.resultMessage, sVar.resultMessage) && p005kotlin.jvm.internal.s.g(this.nextAccessToken, sVar.nextAccessToken) && p005kotlin.jvm.internal.s.g(this.retryAfter, sVar.retryAfter) && p005kotlin.jvm.internal.s.g(this.xMfiVersion, sVar.xMfiVersion);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getResultMessage() {
        return this.resultMessage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getRetryAfter() {
        return this.retryAfter;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getXMfiVersion() {
        return this.xMfiVersion;
    }

    public final int hashCode() {
        int iHashCode = this.resultCode.hashCode() * 31;
        String str = this.resultMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextAccessToken;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.retryAfter;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.xMfiVersion;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.resultCode;
        String str2 = this.resultMessage;
        String str3 = this.nextAccessToken;
        Integer num = this.retryAfter;
        String str4 = this.xMfiVersion;
        StringBuilder sbI = p6.b.i("FNResponseHeaderDto(resultCode='", str, "', resultMessage=", str2, ", nextAccessToken=");
        fb1.c.u(num, str3, ", retryAfter=", ", xMfiVersion=", sbI);
        return am.j.o(str4, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.resultCode);
        parcel.writeString(this.resultMessage);
        parcel.writeString(this.nextAccessToken);
        Integer num = this.retryAfter;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.xMfiVersion);
    }
}
