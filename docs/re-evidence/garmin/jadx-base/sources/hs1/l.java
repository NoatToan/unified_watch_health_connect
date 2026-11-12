package hs1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lhs1/l;", "", "", "avgValue", "maxValue", "minValue", "latestValue", "", "latestTimestampGmt", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "getMaxValue", "c", "getMinValue", "d", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "getLatestTimestampGmt", "()Ljava/lang/String;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgValue")
    private final Integer avgValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxValue")
    private final Integer maxValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minValue")
    private final Integer minValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestValue")
    private final Integer latestValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestTimestampGmt")
    private final String latestTimestampGmt;

    public /* synthetic */ l(Integer num, Integer num2, Integer num3, Integer num4, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, (i14 & 8) != 0 ? null : num4, (i14 & 16) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAvgValue() {
        return this.avgValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getLatestValue() {
        return this.latestValue;
    }

    public final DateTime c() {
        return g22.k.q(this.latestTimestampGmt, "yyyy-MM-dd'T'HH:mm:ss.S", DateTimeZone.UTC);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.avgValue, lVar.avgValue) && s.g(this.maxValue, lVar.maxValue) && s.g(this.minValue, lVar.minValue) && s.g(this.latestValue, lVar.latestValue) && s.g(this.latestTimestampGmt, lVar.latestTimestampGmt);
    }

    public final int hashCode() {
        Integer num = this.avgValue;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxValue;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minValue;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.latestValue;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.latestTimestampGmt;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.avgValue;
        Integer num2 = this.maxValue;
        Integer num3 = this.minValue;
        Integer num4 = this.latestValue;
        String str = this.latestTimestampGmt;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "Respiration(avgValue=", ", maxValue=", ", minValue=", num2);
        x.m(sbL, num3, ", latestValue=", num4, ", latestTimestampGmt=");
        return am.j.o(str, ")", sbL);
    }

    public l(Integer num, Integer num2, Integer num3, Integer num4, String str) {
        this.avgValue = num;
        this.maxValue = num2;
        this.minValue = num3;
        this.latestValue = num4;
        this.latestTimestampGmt = str;
    }

    public l() {
        this(null, null, null, null, null, 31, null);
    }
}
