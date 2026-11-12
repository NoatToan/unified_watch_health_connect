package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Lqn2/v;", "Lpn2/d;", "", "requestId", "operationId", "Lqn2/k;", "clientInfo", "xMfiVersion", "recoveryType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lqn2/k;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "b", "getOperationId", "setOperationId", "c", "Lqn2/k;", "getClientInfo", "()Lqn2/k;", "setClientInfo", "(Lqn2/k;)V", "d", "getXMfiVersion", "setXMfiVersion", JWKParameterNames.RSA_EXPONENT, "getRecoveryType", "setRecoveryType", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v implements pn2.d {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestId")
    private String requestId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("operationId")
    private String operationId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clientInfo")
    private k clientInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("xMfiVersion")
    private String xMfiVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recoveryType")
    private String recoveryType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new v(parcel.readString(), parcel.readString(), k.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i14) {
            return new v[i14];
        }
    }

    public v(String str, String str2, k kVar, String str3, String str4) {
        str.getClass();
        str2.getClass();
        kVar.getClass();
        str4.getClass();
        this.requestId = str;
        this.operationId = str2;
        this.clientInfo = kVar;
        this.xMfiVersion = str3;
        this.recoveryType = str4;
        if (str.length() != 37) {
            vb.h.x(am.j.h(this.requestId.length(), "requestId length(37): "));
            throw null;
        }
        if (this.operationId.length() == 37) {
            return;
        }
        vb.h.x(am.j.h(this.operationId.length(), "operationId length(37): "));
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.requestId, vVar.requestId) && p005kotlin.jvm.internal.s.g(this.operationId, vVar.operationId) && p005kotlin.jvm.internal.s.g(this.clientInfo, vVar.clientInfo) && p005kotlin.jvm.internal.s.g(this.xMfiVersion, vVar.xMfiVersion) && p005kotlin.jvm.internal.s.g(this.recoveryType, vVar.recoveryType);
    }

    public final int hashCode() {
        int iHashCode = (this.clientInfo.hashCode() + wr.g.j(this.requestId.hashCode() * 31, 31, this.operationId)) * 31;
        String str = this.xMfiVersion;
        return this.recoveryType.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.requestId;
        String str2 = this.operationId;
        k kVar = this.clientInfo;
        String str3 = this.xMfiVersion;
        String str4 = this.recoveryType;
        StringBuilder sbI = p6.b.i("FNRequestHeaderBasicDto(requestId='", str, "', operationId='", str2, "', clientInfo=");
        sbI.append(kVar);
        sbI.append(", xMfiVersion=");
        sbI.append(str3);
        sbI.append(",recoveryType=");
        return am.j.o(str4, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.requestId);
        parcel.writeString(this.operationId);
        this.clientInfo.writeToParcel(parcel, i14);
        parcel.writeString(this.xMfiVersion);
        parcel.writeString(this.recoveryType);
    }
}
