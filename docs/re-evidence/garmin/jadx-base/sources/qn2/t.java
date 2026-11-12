package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lqn2/t;", "Lpn2/d;", "", "requestId", "operationId", "Lqn2/k;", "clientInfo", "xMfiVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lqn2/k;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "b", "d", "setOperationId", "c", "Lqn2/k;", "()Lqn2/k;", "setClientInfo", "(Lqn2/k;)V", "getXMfiVersion", "f", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t implements pn2.d {
    public static final Parcelable.Creator<t> CREATOR = new a();

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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new t(parcel.readString(), parcel.readString(), k.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    public t(String str, String str2, k kVar, String str3) {
        str.getClass();
        str2.getClass();
        kVar.getClass();
        this.requestId = str;
        this.operationId = str2;
        this.clientInfo = kVar;
        this.xMfiVersion = str3;
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

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k getClientInfo() {
        return this.clientInfo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOperationId() {
        return this.operationId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.requestId, tVar.requestId) && p005kotlin.jvm.internal.s.g(this.operationId, tVar.operationId) && p005kotlin.jvm.internal.s.g(this.clientInfo, tVar.clientInfo) && p005kotlin.jvm.internal.s.g(this.xMfiVersion, tVar.xMfiVersion);
    }

    public final void f(String str) {
        this.xMfiVersion = str;
    }

    public final int hashCode() {
        int iHashCode = (this.clientInfo.hashCode() + wr.g.j(this.requestId.hashCode() * 31, 31, this.operationId)) * 31;
        String str = this.xMfiVersion;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.requestId;
        String str2 = this.operationId;
        k kVar = this.clientInfo;
        String str3 = this.xMfiVersion;
        StringBuilder sbI = p6.b.i("FNRequestHeaderBasicDto(requestId='", str, "', operationId='", str2, "', clientInfo=");
        sbI.append(kVar);
        sbI.append("), xMfiVersion=");
        sbI.append(str3);
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.requestId);
        parcel.writeString(this.operationId);
        this.clientInfo.writeToParcel(parcel, i14);
        parcel.writeString(this.xMfiVersion);
    }
}
