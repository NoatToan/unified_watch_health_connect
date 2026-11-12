package xo2;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lxo2/b;", "", "", "commandId", "responseCode", "responseData", "", "continueOnFailure", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("commandId")
    private final String commandId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("responseCode")
    private final String responseCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("responseData")
    private String responseData;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Boolean f191764d;

    public /* synthetic */ b(String str, String str2, String str3, Boolean bool, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : bool);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCommandId() {
        return this.commandId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getResponseCode() {
        return this.responseCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getResponseData() {
        return this.responseData;
    }

    public final boolean d() {
        byte[] bArrB = aq2.h.b(this.responseCode);
        byte[] bArr = vo2.d.f179121b;
        if (bArr == bArrB) {
            return true;
        }
        return bArrB != null && bArrB.length <= 2 && bArr[0] == bArrB[0];
    }

    public final void e(String str) {
        this.responseData = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.commandId, bVar.commandId) && s.g(this.responseCode, bVar.responseCode) && s.g(this.responseData, bVar.responseData) && s.g(this.f191764d, bVar.f191764d);
    }

    public final int hashCode() {
        String str = this.commandId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.responseCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.responseData;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f191764d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.commandId;
        String str2 = this.responseCode;
        String str3 = this.responseData;
        StringBuilder sbI = p6.b.i("ApduCommandResult(commandId=", str, ", responseCode=", str2, ", responseData=");
        sbI.append(str3);
        sbI.append(", continueOnFailure=");
        sbI.append(this.f191764d);
        sbI.append(")");
        return sbI.toString();
    }

    public b(String str, String str2, String str3, Boolean bool) {
        this.commandId = str;
        this.responseCode = str2;
        this.responseData = str3;
        this.f191764d = bool;
    }

    public b() {
        this(null, null, null, null, 15, null);
    }
}
