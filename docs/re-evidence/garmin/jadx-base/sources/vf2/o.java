package vf2;

import com.garmin.android.apps.connectmobile.f3;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvf2/o;", "", "", "clusterId", "firstStepId", "lastStepId", "activeStepId", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(IIIILjava/lang/Integer;)V", "a", "I", "b", "()I", "d", "c", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Integer;", "getState", "()Ljava/lang/Integer;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clusterId")
    private final int clusterId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstStepId")
    private final int firstStepId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastStepId")
    private final int lastStepId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activeStepId")
    private final int activeStepId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final Integer state;

    public o(int i14, int i15, int i16, int i17, Integer num) {
        this.clusterId = i14;
        this.firstStepId = i15;
        this.lastStepId = i16;
        this.activeStepId = i17;
        this.state = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getActiveStepId() {
        return this.activeStepId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getClusterId() {
        return this.clusterId;
    }

    public final a c() {
        Integer num = this.state;
        Object obj = null;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        a.f177914b.getClass();
        for (Object obj2 : a.f177919g) {
            if (((a) obj2).f177920a == iIntValue) {
                obj = obj2;
                break;
            }
        }
        return (a) obj;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFirstStepId() {
        return this.firstStepId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getLastStepId() {
        return this.lastStepId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.clusterId == oVar.clusterId && this.firstStepId == oVar.firstStepId && this.lastStepId == oVar.lastStepId && this.activeStepId == oVar.activeStepId && p005kotlin.jvm.internal.s.g(this.state, oVar.state);
    }

    public final int hashCode() {
        int iD = q2.d(this.activeStepId, q2.d(this.lastStepId, q2.d(this.firstStepId, Integer.hashCode(this.clusterId) * 31, 31), 31), 31);
        Integer num = this.state;
        return iD + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        int i14 = this.clusterId;
        int i15 = this.firstStepId;
        int i16 = this.lastStepId;
        int i17 = this.activeStepId;
        Integer num = this.state;
        StringBuilder sbJ = e5.j(i14, i15, "WorkoutCluster(clusterId=", ", firstStepId=", ", lastStepId=");
        e0.m(i16, i17, ", activeStepId=", ", state=", sbJ);
        return f3.i(sbJ, num, ")");
    }
}
