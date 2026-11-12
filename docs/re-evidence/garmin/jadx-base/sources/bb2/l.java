package bb2;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import j20.x;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\f\u0010\u0016¨\u0006\u0017"}, d2 = {"Lbb2/l;", "", "", "inputTimestamp", "", "inputAction", "unitId", "remoteDeviceProfile", "", "deviceXML", "<init>", "(JLjava/lang/String;JLjava/lang/String;[B)V", "a", "J", "c", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "d", "[B", "()[B", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inputTimestamp")
    private final long inputTimestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inputAction")
    private final String inputAction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitId")
    private final long unitId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("remoteDeviceProfile")
    private final String remoteDeviceProfile;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceXML")
    private final byte[] deviceXML;

    public l(long j8, String str, long j14, String str2, byte[] bArr) {
        str.getClass();
        str2.getClass();
        this.inputTimestamp = j8;
        this.inputAction = str;
        this.unitId = j14;
        this.remoteDeviceProfile = str2;
        this.deviceXML = bArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getDeviceXML() {
        return this.deviceXML;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInputAction() {
        return this.inputAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getInputTimestamp() {
        return this.inputTimestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRemoteDeviceProfile() {
        return this.remoteDeviceProfile;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getUnitId() {
        return this.unitId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        l lVar = (l) obj;
        if (this.inputTimestamp != lVar.inputTimestamp || !s.g(this.inputAction, lVar.inputAction) || this.unitId != lVar.unitId || !s.g(this.remoteDeviceProfile, lVar.remoteDeviceProfile)) {
            return false;
        }
        byte[] bArr = this.deviceXML;
        byte[] bArr2 = lVar.deviceXML;
        if (bArr != null) {
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (bArr2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iJ = wr.g.j(q6.f.e(wr.g.j(Long.hashCode(this.inputTimestamp) * 31, 31, this.inputAction), 31, this.unitId), 31, this.remoteDeviceProfile);
        byte[] bArr = this.deviceXML;
        return iJ + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        long j8 = this.inputTimestamp;
        String str = this.inputAction;
        long j14 = this.unitId;
        String str2 = this.remoteDeviceProfile;
        String string = Arrays.toString(this.deviceXML);
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "DeviceWorkInput(inputTimestamp=", ", inputAction=", str);
        x.j(j14, ", unitId=", ", remoteDeviceProfile=", sbK);
        return e5.h(sbK, str2, ", deviceXML=", string, ")");
    }
}
