package gg1;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lgg1/k;", "", "", "spectatorMessaging", "livetrackWithLiveEventSharing", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Boolean;", "getSpectatorMessaging", "()Ljava/lang/Boolean;", "setSpectatorMessaging", "(Ljava/lang/Boolean;)V", "b", "setLivetrackWithLiveEventSharing", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spectatorMessaging")
    private Boolean spectatorMessaging;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("livetrackWithLiveEventSharing")
    private Boolean livetrackWithLiveEventSharing;

    public /* synthetic */ k(Boolean bool, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : bool2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getLivetrackWithLiveEventSharing() {
        return this.livetrackWithLiveEventSharing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.spectatorMessaging, kVar.spectatorMessaging) && p005kotlin.jvm.internal.s.g(this.livetrackWithLiveEventSharing, kVar.livetrackWithLiveEventSharing);
    }

    public final int hashCode() {
        Boolean bool = this.spectatorMessaging;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.livetrackWithLiveEventSharing;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceSupportedLiveTrackFeatures(spectatorMessaging=" + this.spectatorMessaging + ", livetrackWithLiveEventSharing=" + this.livetrackWithLiveEventSharing + ")";
    }

    public k(Boolean bool, Boolean bool2) {
        this.spectatorMessaging = bool;
        this.livetrackWithLiveEventSharing = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
