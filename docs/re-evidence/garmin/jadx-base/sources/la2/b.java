package la2;

import com.garmin.device.datatypes.DeviceProfile;
import com.google.android.gms.common.Scopes;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lla2/b;", "", "Lcom/garmin/device/datatypes/DeviceProfile;", Scopes.PROFILE, "<init>", "(Lcom/garmin/device/datatypes/DeviceProfile;)V", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceProfile f111632a;

    public b(DeviceProfile deviceProfile) {
        deviceProfile.getClass();
        this.f111632a = deviceProfile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f111632a.equals(((b) obj).f111632a);
    }

    public final int hashCode() {
        return this.f111632a.hashCode();
    }

    public final String toString() {
        return "ConnectionEvent[" + this.f111632a + "]";
    }
}
