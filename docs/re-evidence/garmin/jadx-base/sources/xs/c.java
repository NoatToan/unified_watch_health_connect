package xs;

import com.garmin.device.datatypes.DeviceProfile;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lxs/c;", "", "Lcom/garmin/device/datatypes/DeviceProfile;", "deviceProfile", "<init>", "(Lcom/garmin/device/datatypes/DeviceProfile;)V", "a", "b", "Lxs/c$a;", "Lxs/c$b;", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceProfile f192043a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxs/c$a;", "Lxs/c;", "Lcom/garmin/device/datatypes/DeviceProfile;", "device", "<init>", "(Lcom/garmin/device/datatypes/DeviceProfile;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DeviceProfile f192044b;

        public a(DeviceProfile deviceProfile) {
            super(deviceProfile, null);
            this.f192044b = deviceProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f192044b, ((a) obj).f192044b);
        }

        public final int hashCode() {
            DeviceProfile deviceProfile = this.f192044b;
            if (deviceProfile == null) {
                return 0;
            }
            return deviceProfile.hashCode();
        }

        public final String toString() {
            return "Connected(device=" + this.f192044b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxs/c$b;", "Lxs/c;", "Lcom/garmin/device/datatypes/DeviceProfile;", "device", "<init>", "(Lcom/garmin/device/datatypes/DeviceProfile;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DeviceProfile f192045b;

        public b(DeviceProfile deviceProfile) {
            super(deviceProfile, null);
            this.f192045b = deviceProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f192045b, ((b) obj).f192045b);
        }

        public final int hashCode() {
            DeviceProfile deviceProfile = this.f192045b;
            if (deviceProfile == null) {
                return 0;
            }
            return deviceProfile.hashCode();
        }

        public final String toString() {
            return "Disconnected(device=" + this.f192045b + ")";
        }
    }

    private c(DeviceProfile deviceProfile) {
        this.f192043a = deviceProfile;
    }

    public /* synthetic */ c(DeviceProfile deviceProfile, p005kotlin.jvm.internal.j jVar) {
        this(deviceProfile);
    }
}
