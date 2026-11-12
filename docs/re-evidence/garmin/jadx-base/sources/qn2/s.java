package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lqn2/s;", "Lpn2/d;", "", "requestId", "operationId", "accessToken", "Lqn2/k;", "clientInfo", "xMfiVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqn2/k;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "b", "getOperationId", "setOperationId", "c", "setAccessToken", "d", "Lqn2/k;", "()Lqn2/k;", "setClientInfo", "(Lqn2/k;)V", JWKParameterNames.RSA_EXPONENT, "getXMfiVersion", "setXMfiVersion", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements pn2.d {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestId")
    private String requestId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("operationId")
    private String operationId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("accessToken")
    private String accessToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clientInfo")
    private k clientInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("xMfiVersion")
    private String xMfiVersion;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new s(parcel.readString(), parcel.readString(), parcel.readString(), k.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public s(String str, String str2, String str3, k kVar, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        kVar.getClass();
        this.requestId = str;
        this.operationId = str2;
        this.accessToken = str3;
        this.clientInfo = kVar;
        this.xMfiVersion = str4;
        if (str.length() != 37) {
            vb.h.x(am.j.h(this.requestId.length(), "requestId length(37): "));
            throw null;
        }
        if (this.operationId.length() != 37) {
            vb.h.x(am.j.h(this.operationId.length(), "operationId length(37): "));
            throw null;
        }
        int length = this.accessToken.length();
        if (1 > length || length >= 513) {
            vb.h.x(am.j.h(this.accessToken.length(), "accessToken length(1-512): "));
            throw null;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getClientInfo() {
        return this.clientInfo;
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
        return p005kotlin.jvm.internal.s.g(this.requestId, sVar.requestId) && p005kotlin.jvm.internal.s.g(this.operationId, sVar.operationId) && p005kotlin.jvm.internal.s.g(this.accessToken, sVar.accessToken) && p005kotlin.jvm.internal.s.g(this.clientInfo, sVar.clientInfo) && p005kotlin.jvm.internal.s.g(this.xMfiVersion, sVar.xMfiVersion);
    }

    public final int hashCode() {
        int iHashCode = (this.clientInfo.hashCode() + wr.g.j(wr.g.j(this.requestId.hashCode() * 31, 31, this.operationId), 31, this.accessToken)) * 31;
        String str = this.xMfiVersion;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.requestId;
        String str2 = this.operationId;
        String str3 = this.accessToken;
        k kVar = this.clientInfo;
        String str4 = this.xMfiVersion;
        StringBuilder sbI = p6.b.i("FNRequestHeaderAccessTokenDto(requestId='", str, "', operationId='", str2, "', accessToken='");
        sbI.append(str3);
        sbI.append("', clientInfo=");
        sbI.append(kVar);
        sbI.append("), xMfiVersion=");
        sbI.append(str4);
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.requestId);
        parcel.writeString(this.operationId);
        parcel.writeString(this.accessToken);
        this.clientInfo.writeToParcel(parcel, i14);
        parcel.writeString(this.xMfiVersion);
    }
}
