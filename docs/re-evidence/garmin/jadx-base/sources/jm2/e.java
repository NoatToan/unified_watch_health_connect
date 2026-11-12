package jm2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljm2/e;", "", "", "code", "subcode", "", NotificationConstants.KEY_DATA_MIME_TYPE, "message", "Lbm2/c;", "device", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lbm2/c;)V", "a", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "b", "c", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "d", "getMessage", JWKParameterNames.RSA_EXPONENT, "Lbm2/c;", "getDevice", "()Lbm2/c;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("code")
    private final Integer code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subcode")
    private final Integer subcode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private final String message;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("device")
    private final bm2.c device;

    public e(Integer num, Integer num2, String str, String str2, bm2.c cVar) {
        this.code = num;
        this.subcode = num2;
        this.type = str;
        this.message = str2;
        this.device = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getSubcode() {
        return this.subcode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.code, eVar.code) && s.g(this.subcode, eVar.subcode) && s.g(this.type, eVar.type) && s.g(this.message, eVar.message) && s.g(this.device, eVar.device);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.subcode;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.type;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        bm2.c cVar = this.device;
        return iHashCode4 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.code;
        Integer num2 = this.subcode;
        String str = this.type;
        String str2 = this.message;
        bm2.c cVar = this.device;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "RegistrationErrorDetailsDTO(code=", ", subcode=", ", type=", num2);
        sn.a.t(sbL, str, ", message=", str2, ", device=");
        sbL.append(cVar);
        sbL.append(")");
        return sbL.toString();
    }
}
