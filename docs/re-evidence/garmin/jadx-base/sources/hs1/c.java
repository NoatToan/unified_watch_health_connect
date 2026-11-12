package hs1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, d2 = {"Lhs1/c;", "", "", "burnedResting", "burnedActive", "burnedTotal", "consumedGoal", "consumedValue", "consumedRemaining", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("burnedResting")
    private final Integer burnedResting;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("burnedActive")
    private final Integer burnedActive;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("burnedTotal")
    private final Integer burnedTotal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumedGoal")
    private final Integer consumedGoal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumedValue")
    private final Integer consumedValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumedRemaining")
    private final Integer consumedRemaining;

    public /* synthetic */ c(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, (i14 & 8) != 0 ? null : num4, (i14 & 16) != 0 ? null : num5, (i14 & 32) != 0 ? null : num6);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getBurnedActive() {
        return this.burnedActive;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getBurnedResting() {
        return this.burnedResting;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getBurnedTotal() {
        return this.burnedTotal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getConsumedGoal() {
        return this.consumedGoal;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getConsumedRemaining() {
        return this.consumedRemaining;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.burnedResting, cVar.burnedResting) && s.g(this.burnedActive, cVar.burnedActive) && s.g(this.burnedTotal, cVar.burnedTotal) && s.g(this.consumedGoal, cVar.consumedGoal) && s.g(this.consumedValue, cVar.consumedValue) && s.g(this.consumedRemaining, cVar.consumedRemaining);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getConsumedValue() {
        return this.consumedValue;
    }

    public final int hashCode() {
        Integer num = this.burnedResting;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.burnedActive;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.burnedTotal;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.consumedGoal;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.consumedValue;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.consumedRemaining;
        return iHashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.burnedResting;
        Integer num2 = this.burnedActive;
        Integer num3 = this.burnedTotal;
        Integer num4 = this.consumedGoal;
        Integer num5 = this.consumedValue;
        Integer num6 = this.consumedRemaining;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "Calories(burnedResting=", ", burnedActive=", ", burnedTotal=", num2);
        x.m(sbL, num3, ", consumedGoal=", num4, ", consumedValue=");
        return b71.i.h(sbL, num5, ", consumedRemaining=", num6, ")");
    }

    public c(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.burnedResting = num;
        this.burnedActive = num2;
        this.burnedTotal = num3;
        this.consumedGoal = num4;
        this.consumedValue = num5;
        this.consumedRemaining = num6;
    }

    public c() {
        this(null, null, null, null, null, null, 63, null);
    }
}
