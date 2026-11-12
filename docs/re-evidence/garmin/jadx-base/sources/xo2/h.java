package xo2;

import am.j;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import java.util.UUID;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import w02.b0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101¨\u00064"}, d2 = {"Lxo2/h;", "", "", "createdTsEpoch", "", "targetDeviceType", "transitCardId", "targetDeviceId", "credentialId", "lastModifiedTsEpoch", "Lfo2/e;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "daysUntilExpiration", "userId", "Lorg/joda/time/DateTime;", "created", "lastModified", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLfo2/e;ILjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "J", "getCreatedTsEpoch", "()J", "b", "Ljava/lang/String;", "getTargetDeviceType", "()Ljava/lang/String;", "c", "getTransitCardId", "d", "getTargetDeviceId", JWKParameterNames.RSA_EXPONENT, "getCredentialId", "f", "getLastModifiedTsEpoch", "g", "Lfo2/e;", "getState", "()Lfo2/e;", "h", "I", "getDaysUntilExpiration", "()I", IntegerTokenConverter.CONVERTER_KEY, "getUserId", "j", "Lorg/joda/time/DateTime;", "getCreated", "()Lorg/joda/time/DateTime;", JWKParameterNames.OCT_KEY_VALUE, "getLastModified", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTsEpoch")
    private final long createdTsEpoch;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("targetDeviceType")
    private final String targetDeviceType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transitCardId")
    private final String transitCardId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("targetDeviceId")
    private final String targetDeviceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("credentialId")
    private final String credentialId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastModifiedTsEpoch")
    private final long lastModifiedTsEpoch;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final fo2.e state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("daysUntilExpiration")
    private final int daysUntilExpiration;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final String userId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTs")
    private final DateTime created;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastModifiedTs")
    private final DateTime lastModified;

    public h(long j8, String str, String str2, String str3, String str4, long j14, fo2.e eVar, int i14, String str5, DateTime dateTime, DateTime dateTime2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        eVar.getClass();
        str5.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.createdTsEpoch = j8;
        this.targetDeviceType = str;
        this.transitCardId = str2;
        this.targetDeviceId = str3;
        this.credentialId = str4;
        this.lastModifiedTsEpoch = j14;
        this.state = eVar;
        this.daysUntilExpiration = i14;
        this.userId = str5;
        this.created = dateTime;
        this.lastModified = dateTime2;
    }

    public final byte[] a() {
        UUID uuidFromString = UUID.fromString(this.credentialId);
        uuidFromString.getClass();
        return b0.A(uuidFromString);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.createdTsEpoch == hVar.createdTsEpoch && s.g(this.targetDeviceType, hVar.targetDeviceType) && s.g(this.transitCardId, hVar.transitCardId) && s.g(this.targetDeviceId, hVar.targetDeviceId) && s.g(this.credentialId, hVar.credentialId) && this.lastModifiedTsEpoch == hVar.lastModifiedTsEpoch && this.state == hVar.state && this.daysUntilExpiration == hVar.daysUntilExpiration && s.g(this.userId, hVar.userId) && s.g(this.created, hVar.created) && s.g(this.lastModified, hVar.lastModified);
    }

    public final int hashCode() {
        return this.lastModified.hashCode() + e0.a(wr.g.j(q2.d(this.daysUntilExpiration, (this.state.hashCode() + q6.f.e(wr.g.j(wr.g.j(wr.g.j(wr.g.j(Long.hashCode(this.createdTsEpoch) * 31, 31, this.targetDeviceType), 31, this.transitCardId), 31, this.targetDeviceId), 31, this.credentialId), 31, this.lastModifiedTsEpoch)) * 31, 31), 31, this.userId), this.created, 31);
    }

    public final String toString() {
        long j8 = this.createdTsEpoch;
        String str = this.targetDeviceType;
        String str2 = this.transitCardId;
        String str3 = this.targetDeviceId;
        String str4 = this.credentialId;
        long j14 = this.lastModifiedTsEpoch;
        fo2.e eVar = this.state;
        int i14 = this.daysUntilExpiration;
        String str5 = this.userId;
        DateTime dateTime = this.created;
        DateTime dateTime2 = this.lastModified;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "TransitCardCommitsDto(createdTsEpoch=", ", targetDeviceType=", str);
        sn.a.t(sbK, ", transitCardId=", str2, ", targetDeviceId=", str3);
        j.y(sbK, ", credentialId=", str4, ", lastModifiedTsEpoch=");
        sbK.append(j14);
        sbK.append(", state=");
        sbK.append(eVar);
        sbK.append(", daysUntilExpiration=");
        sbK.append(i14);
        sbK.append(", userId=");
        sbK.append(str5);
        sbK.append(", created=");
        sbK.append(dateTime);
        sbK.append(", lastModified=");
        sbK.append(dateTime2);
        sbK.append(")");
        return sbK.toString();
    }
}
