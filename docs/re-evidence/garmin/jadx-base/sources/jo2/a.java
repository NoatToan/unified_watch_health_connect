package jo2;

import b71.i;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Date;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b\u001d\u0010\u0013¨\u0006 "}, d2 = {"Ljo2/a;", "", "", "keyId", "Ljava/util/Date;", "createdTs", "", "createdTsEpoch", "expirationTs", "expirationTsEpoch", "serverPublicKey", "clientPublicKey", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/Long;Ljava/util/Date;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "Ljava/util/Date;", "getCreatedTs", "()Ljava/util/Date;", "c", "Ljava/lang/Long;", "getCreatedTsEpoch", "()Ljava/lang/Long;", "d", "getExpirationTs", JWKParameterNames.RSA_EXPONENT, "getExpirationTsEpoch", "g", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("keyId")
    private String keyId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTs")
    private final Date createdTs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTsEpoch")
    private final Long createdTsEpoch;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expirationTs")
    private final Date expirationTs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expirationTsEpoch")
    private final Long expirationTsEpoch;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("serverPublicKey")
    private final String serverPublicKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clientPublicKey")
    private String clientPublicKey;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient String f99821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient byte[] f99822i;

    public /* synthetic */ a(String str, Date date, Long l14, Date date2, Long l15, String str2, String str3, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : date, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : date2, (i14 & 16) != 0 ? null : l15, (i14 & 32) != 0 ? null : str2, (i14 & 64) != 0 ? null : str3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClientPublicKey() {
        return this.clientPublicKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKeyId() {
        return this.keyId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getServerPublicKey() {
        return this.serverPublicKey;
    }

    public final Boolean d() {
        if (this.expirationTsEpoch != null) {
            return Boolean.valueOf(System.currentTimeMillis() - this.expirationTsEpoch.longValue() > 0);
        }
        return null;
    }

    public final void e(String str) {
        this.clientPublicKey = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.keyId, aVar.keyId) && s.g(this.createdTs, aVar.createdTs) && s.g(this.createdTsEpoch, aVar.createdTsEpoch) && s.g(this.expirationTs, aVar.expirationTs) && s.g(this.expirationTsEpoch, aVar.expirationTsEpoch) && s.g(this.serverPublicKey, aVar.serverPublicKey) && s.g(this.clientPublicKey, aVar.clientPublicKey);
    }

    public final void f(String str) {
        this.keyId = str;
    }

    public final int hashCode() {
        String str = this.keyId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.createdTs;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Long l14 = this.createdTsEpoch;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Date date2 = this.expirationTs;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Long l15 = this.expirationTsEpoch;
        int iHashCode5 = (iHashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str2 = this.serverPublicKey;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientPublicKey;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.keyId;
        Date date = this.createdTs;
        Long l14 = this.createdTsEpoch;
        Date date2 = this.expirationTs;
        Long l15 = this.expirationTsEpoch;
        String str2 = this.serverPublicKey;
        String str3 = this.clientPublicKey;
        StringBuilder sb3 = new StringBuilder("ECCKeyPair(keyId=");
        sb3.append(str);
        sb3.append(", createdTs=");
        sb3.append(date);
        sb3.append(", createdTsEpoch=");
        sb3.append(l14);
        sb3.append(", expirationTs=");
        sb3.append(date2);
        sb3.append(", expirationTsEpoch=");
        i.q(l15, ", serverPublicKey=", str2, ", clientPublicKey=", sb3);
        return am.j.o(str3, ")", sb3);
    }

    public a(String str, Date date, Long l14, Date date2, Long l15, String str2, String str3) {
        this.keyId = str;
        this.createdTs = date;
        this.createdTsEpoch = l14;
        this.expirationTs = date2;
        this.expirationTsEpoch = l15;
        this.serverPublicKey = str2;
        this.clientPublicKey = str3;
    }

    public a() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
