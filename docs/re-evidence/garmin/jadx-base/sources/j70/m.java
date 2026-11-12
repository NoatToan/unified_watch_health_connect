package j70;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lj70/m;", "", "Lj70/l;", "_activeCalories", "_bodyBattery", "_pushes", "_steps", "_stress", "<init>", "(Lj70/l;Lj70/l;Lj70/l;Lj70/l;Lj70/l;)V", "a", "Lj70/l;", "()Lj70/l;", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activeCalories")
    private final l _activeCalories;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyBattery")
    private final l _bodyBattery;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushes")
    private final l _pushes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("steps")
    private final l _steps;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stress")
    private final l _stress;

    public m(l lVar, l lVar2, l lVar3, l lVar4, l lVar5) {
        this._activeCalories = lVar;
        this._bodyBattery = lVar2;
        this._pushes = lVar3;
        this._steps = lVar4;
        this._stress = lVar5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l get_activeCalories() {
        return this._activeCalories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l get_bodyBattery() {
        return this._bodyBattery;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l get_pushes() {
        return this._pushes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final l get_steps() {
        return this._steps;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final l get_stress() {
        return this._stress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this._activeCalories, mVar._activeCalories) && p005kotlin.jvm.internal.s.g(this._bodyBattery, mVar._bodyBattery) && p005kotlin.jvm.internal.s.g(this._pushes, mVar._pushes) && p005kotlin.jvm.internal.s.g(this._steps, mVar._steps) && p005kotlin.jvm.internal.s.g(this._stress, mVar._stress);
    }

    public final int hashCode() {
        l lVar = this._activeCalories;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l lVar2 = this._bodyBattery;
        int iHashCode2 = (iHashCode + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        l lVar3 = this._pushes;
        int iHashCode3 = (iHashCode2 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
        l lVar4 = this._steps;
        int iHashCode4 = (iHashCode3 + (lVar4 == null ? 0 : lVar4.hashCode())) * 31;
        l lVar5 = this._stress;
        return iHashCode4 + (lVar5 != null ? lVar5.hashCode() : 0);
    }

    public final String toString() {
        return "EpochChartData(_activeCalories=" + this._activeCalories + ", _bodyBattery=" + this._bodyBattery + ", _pushes=" + this._pushes + ", _steps=" + this._steps + ", _stress=" + this._stress + ")";
    }
}
