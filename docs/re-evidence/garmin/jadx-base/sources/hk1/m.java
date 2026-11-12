package hk1;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lhk1/m;", "", "", "authCode", "", "pushActivity", "pushEvent", "pushWorkout", "<init>", "(Ljava/lang/String;ZZZ)V", "a", "Ljava/lang/String;", "getAuthCode", "()Ljava/lang/String;", "b", "Z", "getPushActivity", "()Z", "c", "getPushEvent", "d", "getPushWorkout", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("authCode")
    private final String authCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushActivity")
    private final boolean pushActivity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushEvent")
    private final boolean pushEvent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushWorkout")
    private final boolean pushWorkout;

    public /* synthetic */ m(String str, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this.authCode, mVar.authCode) && this.pushActivity == mVar.pushActivity && this.pushEvent == mVar.pushEvent && this.pushWorkout == mVar.pushWorkout;
    }

    public final int hashCode() {
        String str = this.authCode;
        return Boolean.hashCode(this.pushWorkout) + q6.f.g(q6.f.g((str == null ? 0 : str.hashCode()) * 31, 31, this.pushActivity), 31, this.pushEvent);
    }

    public final String toString() {
        String str = this.authCode;
        boolean z14 = this.pushActivity;
        return com.airbnb.lottie.animation.keyframe.a.f(", pushWorkout=", ")", zl.a.d("Officer65SettingsRequest(authCode=", str, ", pushActivity=", z14, ", pushEvent="), this.pushEvent, this.pushWorkout);
    }

    public m(String str, boolean z14, boolean z15, boolean z16) {
        this.authCode = str;
        this.pushActivity = z14;
        this.pushEvent = z15;
        this.pushWorkout = z16;
    }

    public m() {
        this(null, false, false, false, 15, null);
    }
}
