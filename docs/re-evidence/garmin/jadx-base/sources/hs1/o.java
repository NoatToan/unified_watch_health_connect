package hs1;

import c22.j0;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lhs1/o;", "", "", "startTimestampGmt", "startTimestampLocal", "endTimestampGmt", "endTimestampLocal", "", "totalDurationInMillis", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "a", "Ljava/lang/String;", "getStartTimestampGmt", "()Ljava/lang/String;", "b", "getStartTimestampLocal", "c", "getEndTimestampGmt", "d", "getEndTimestampLocal", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Long;", "getTotalDurationInMillis", "()Ljava/lang/Long;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestampGmt")
    private final String startTimestampGmt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimestampLocal")
    private final String startTimestampLocal;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimestampGmt")
    private final String endTimestampGmt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimestampLocal")
    private final String endTimestampLocal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalDurationInMillis")
    private final Long totalDurationInMillis;

    public /* synthetic */ o(String str, String str2, String str3, String str4, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : l14);
    }

    public final DateTime a() {
        return j0.N(this.endTimestampGmt, true);
    }

    public final DateTime b() {
        return j0.N(this.endTimestampLocal, true);
    }

    public final DateTime c() {
        return j0.N(this.startTimestampGmt, true);
    }

    public final DateTime d() {
        return j0.N(this.startTimestampLocal, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return s.g(this.startTimestampGmt, oVar.startTimestampGmt) && s.g(this.startTimestampLocal, oVar.startTimestampLocal) && s.g(this.endTimestampGmt, oVar.endTimestampGmt) && s.g(this.endTimestampLocal, oVar.endTimestampLocal) && s.g(this.totalDurationInMillis, oVar.totalDurationInMillis);
    }

    public final int hashCode() {
        String str = this.startTimestampGmt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.startTimestampLocal;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endTimestampGmt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.endTimestampLocal;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l14 = this.totalDurationInMillis;
        return iHashCode4 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.startTimestampGmt;
        String str2 = this.startTimestampLocal;
        String str3 = this.endTimestampGmt;
        String str4 = this.endTimestampLocal;
        Long l14 = this.totalDurationInMillis;
        StringBuilder sbI = p6.b.i("WellnessChronology(startTimestampGmt=", str, ", startTimestampLocal=", str2, ", endTimestampGmt=");
        sn.a.t(sbI, str3, ", endTimestampLocal=", str4, ", totalDurationInMillis=");
        return p6.b.g(sbI, l14, ")");
    }

    public o(String str, String str2, String str3, String str4, Long l14) {
        this.startTimestampGmt = str;
        this.startTimestampLocal = str2;
        this.endTimestampGmt = str3;
        this.endTimestampLocal = str4;
        this.totalDurationInMillis = l14;
    }

    public o() {
        this(null, null, null, null, null, 31, null);
    }
}
