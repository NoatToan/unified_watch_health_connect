package vf2;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\r\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0019"}, d2 = {"Lvf2/w;", "", "", "priority", "targetType", "", "target", "targetHigh", "targetLow", "powerCurveDuration", "powerCurveScale", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "a", "Ljava/lang/Integer;", "getPriority", "()Ljava/lang/Integer;", "b", "f", "c", "Ljava/lang/Float;", "()Ljava/lang/Float;", "d", JWKParameterNames.RSA_EXPONENT, "g", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("priority")
    private final Integer priority;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("targetType")
    private final Integer targetType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("target")
    private final Float target;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("targetHigh")
    private final Float targetHigh;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("targetLow")
    private final Float targetLow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("powerCurveDuration")
    private final Float powerCurveDuration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("powerCurveScale")
    private final Float powerCurveScale;

    public /* synthetic */ w(Integer num, Integer num2, Float f14, Float f15, Float f16, Float f17, Float f18, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : f14, (i14 & 8) != 0 ? null : f15, (i14 & 16) != 0 ? null : f16, (i14 & 32) != 0 ? null : f17, (i14 & 64) != 0 ? null : f18);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getPowerCurveDuration() {
        return this.powerCurveDuration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getPowerCurveScale() {
        return this.powerCurveScale;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getTargetHigh() {
        return this.targetHigh;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getTargetLow() {
        return this.targetLow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return p005kotlin.jvm.internal.s.g(this.priority, wVar.priority) && p005kotlin.jvm.internal.s.g(this.targetType, wVar.targetType) && p005kotlin.jvm.internal.s.g(this.target, wVar.target) && p005kotlin.jvm.internal.s.g(this.targetHigh, wVar.targetHigh) && p005kotlin.jvm.internal.s.g(this.targetLow, wVar.targetLow) && p005kotlin.jvm.internal.s.g(this.powerCurveDuration, wVar.powerCurveDuration) && p005kotlin.jvm.internal.s.g(this.powerCurveScale, wVar.powerCurveScale);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getTargetType() {
        return this.targetType;
    }

    public final int hashCode() {
        Integer num = this.priority;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.targetType;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f14 = this.target;
        int iHashCode3 = (iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.targetHigh;
        int iHashCode4 = (iHashCode3 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.targetLow;
        int iHashCode5 = (iHashCode4 + (f16 == null ? 0 : f16.hashCode())) * 31;
        Float f17 = this.powerCurveDuration;
        int iHashCode6 = (iHashCode5 + (f17 == null ? 0 : f17.hashCode())) * 31;
        Float f18 = this.powerCurveScale;
        return iHashCode6 + (f18 != null ? f18.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.priority;
        Integer num2 = this.targetType;
        Float f14 = this.target;
        Float f15 = this.targetHigh;
        Float f16 = this.targetLow;
        Float f17 = this.powerCurveDuration;
        Float f18 = this.powerCurveScale;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "WorkoutTarget(priority=", ", targetType=", ", target=", num2);
        sbL.append(f14);
        sbL.append(", targetHigh=");
        sbL.append(f15);
        sbL.append(", targetLow=");
        sbL.append(f16);
        sbL.append(", powerCurveDuration=");
        sbL.append(f17);
        sbL.append(", powerCurveScale=");
        sbL.append(f18);
        sbL.append(")");
        return sbL.toString();
    }

    public w(Integer num, Integer num2, Float f14, Float f15, Float f16, Float f17, Float f18) {
        this.priority = num;
        this.targetType = num2;
        this.target = f14;
        this.targetHigh = f15;
        this.targetLow = f16;
        this.powerCurveDuration = f17;
        this.powerCurveScale = f18;
    }

    public w() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
