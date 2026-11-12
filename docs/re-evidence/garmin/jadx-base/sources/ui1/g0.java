package ui1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a\"\u0004\b\u0011\u0010\u001d¨\u0006\u001e"}, d2 = {"Lui1/g0;", "", "Lui1/f0;", "oldDevice", "newDevice", "", "callbackUrl", "referenceId", "", "blackListDevice", "validateOnly", "<init>", "(Lui1/f0;Lui1/f0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Lui1/f0;", "b", "()Lui1/f0;", "c", "Ljava/lang/String;", "getCallbackUrl", "()Ljava/lang/String;", "d", "getReferenceId", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Boolean;", "getBlackListDevice", "()Ljava/lang/Boolean;", "f", "getValidateOnly", "(Ljava/lang/Boolean;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("OldResource")
    private final f0 oldDevice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("NewResource")
    private final f0 newDevice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("CallbackUrl")
    private final String callbackUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ReferenceId")
    private final String referenceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("BlackListDevice")
    private final Boolean blackListDevice;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ValidateOnly")
    private Boolean validateOnly;

    public /* synthetic */ g0(f0 f0Var, f0 f0Var2, String str, String str2, Boolean bool, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : f0Var, (i14 & 2) != 0 ? null : f0Var2, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? Boolean.FALSE : bool, (i14 & 32) != 0 ? Boolean.TRUE : bool2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f0 getNewDevice() {
        return this.newDevice;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f0 getOldDevice() {
        return this.oldDevice;
    }

    public final void c() {
        this.validateOnly = Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return p005kotlin.jvm.internal.s.g(this.oldDevice, g0Var.oldDevice) && p005kotlin.jvm.internal.s.g(this.newDevice, g0Var.newDevice) && p005kotlin.jvm.internal.s.g(this.callbackUrl, g0Var.callbackUrl) && p005kotlin.jvm.internal.s.g(this.referenceId, g0Var.referenceId) && p005kotlin.jvm.internal.s.g(this.blackListDevice, g0Var.blackListDevice) && p005kotlin.jvm.internal.s.g(this.validateOnly, g0Var.validateOnly);
    }

    public final int hashCode() {
        f0 f0Var = this.oldDevice;
        int iHashCode = (f0Var == null ? 0 : f0Var.hashCode()) * 31;
        f0 f0Var2 = this.newDevice;
        int iHashCode2 = (iHashCode + (f0Var2 == null ? 0 : f0Var2.hashCode())) * 31;
        String str = this.callbackUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.referenceId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.blackListDevice;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.validateOnly;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        f0 f0Var = this.oldDevice;
        f0 f0Var2 = this.newDevice;
        String str = this.callbackUrl;
        String str2 = this.referenceId;
        Boolean bool = this.blackListDevice;
        Boolean bool2 = this.validateOnly;
        StringBuilder sb3 = new StringBuilder("RMARequest(oldDevice=");
        sb3.append(f0Var);
        sb3.append(", newDevice=");
        sb3.append(f0Var2);
        sb3.append(", callbackUrl=");
        sn.a.t(sb3, str, ", referenceId=", str2, ", blackListDevice=");
        sb3.append(bool);
        sb3.append(", validateOnly=");
        sb3.append(bool2);
        sb3.append(")");
        return sb3.toString();
    }

    public g0(f0 f0Var, f0 f0Var2, String str, String str2, Boolean bool, Boolean bool2) {
        this.oldDevice = f0Var;
        this.newDevice = f0Var2;
        this.callbackUrl = str;
        this.referenceId = str2;
        this.blackListDevice = bool;
        this.validateOnly = bool2;
    }

    public g0() {
        this(null, null, null, null, null, null, 63, null);
    }
}
