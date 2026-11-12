package la2;

import com.garmin.device.datatypes.DeviceProfile;
import com.google.android.gms.common.Scopes;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lla2/h;", "", "Lcom/garmin/device/datatypes/DeviceProfile;", Scopes.PROFILE, "", "gattStatus", "", "connectionDurationMillis", "<init>", "(Lcom/garmin/device/datatypes/DeviceProfile;ILjava/lang/Long;)V", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceProfile f111673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f111675c;

    public h(DeviceProfile deviceProfile, int i14, Long l14) {
        deviceProfile.getClass();
        this.f111673a = deviceProfile;
        this.f111674b = i14;
        this.f111675c = l14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f111673a, hVar.f111673a) && this.f111674b == hVar.f111674b && s.g(this.f111675c, hVar.f111675c);
    }

    public final int hashCode() {
        int iD = q2.d(this.f111674b, this.f111673a.hashCode() * 31, 31);
        Long l14 = this.f111675c;
        return iD + (l14 == null ? 0 : l14.hashCode());
    }

    public final String toString() {
        String macAddress = this.f111673a.getMacAddress();
        Long l14 = this.f111675c;
        return am.j.i((l14 != null ? l14.longValue() : 0L) / ((long) 1000), " seconds]", androidx.core.view.j.k(this.f111674b, "DisconnectionEvent[macAddress:", macAddress, ", gattStatus:", ", duration:"));
    }

    public /* synthetic */ h(DeviceProfile deviceProfile, int i14, Long l14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(deviceProfile, i14, (i15 & 4) != 0 ? null : l14);
    }
}
