package zd0;

import com.garmin.device.datatypes.DeviceProfile;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lzd0/c;", "", "Lcom/garmin/device/datatypes/DeviceProfile;", "deviceProfile", "<init>", "(Lcom/garmin/device/datatypes/DeviceProfile;)V", "c", "a", "b", "Lzd0/c$a;", "Lzd0/c$b;", "Lzd0/c$c;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzd0/c$a;", "Lzd0/c;", "Lcom/garmin/device/datatypes/DeviceProfile;", "device", "<init>", "(Lcom/garmin/device/datatypes/DeviceProfile;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeviceProfile f203988a;

        public a(DeviceProfile deviceProfile) {
            super(deviceProfile, null);
            this.f203988a = deviceProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f203988a, ((a) obj).f203988a);
        }

        public final int hashCode() {
            DeviceProfile deviceProfile = this.f203988a;
            if (deviceProfile == null) {
                return 0;
            }
            return deviceProfile.hashCode();
        }

        public final String toString() {
            return "Connected(device=" + this.f203988a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzd0/c$b;", "Lzd0/c;", "Lcom/garmin/device/datatypes/DeviceProfile;", "device", "<init>", "(Lcom/garmin/device/datatypes/DeviceProfile;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeviceProfile f203989a;

        public b(DeviceProfile deviceProfile) {
            super(deviceProfile, null);
            this.f203989a = deviceProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f203989a, ((b) obj).f203989a);
        }

        public final int hashCode() {
            DeviceProfile deviceProfile = this.f203989a;
            if (deviceProfile == null) {
                return 0;
            }
            return deviceProfile.hashCode();
        }

        public final String toString() {
            return "Disconnected(device=" + this.f203989a + ")";
        }
    }

    /* JADX INFO: renamed from: zd0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzd0/c$c;", "Lzd0/c;", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3806c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3806c f203990a = new C3806c();

        /* JADX WARN: Multi-variable type inference failed */
        private C3806c() {
            super(null, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C3806c);
        }

        public final int hashCode() {
            return 1435814477;
        }

        public final String toString() {
            return "NoState";
        }
    }

    public /* synthetic */ c(DeviceProfile deviceProfile, p005kotlin.jvm.internal.j jVar) {
        this(deviceProfile);
    }

    private c(DeviceProfile deviceProfile) {
    }
}
