package bc0;

import com.garmin.proto.generated.GDIDeviceStatus;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbc0/a;", "", "", "deviceUnitId", "", "deviceName", "Lcom/garmin/proto/generated/GDIDeviceStatus$RemoteDeviceBatteryStatusBatteryStatus;", "status", "<init>", "(JLjava/lang/String;Lcom/garmin/proto/generated/GDIDeviceStatus$RemoteDeviceBatteryStatusBatteryStatus;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus f17405c;

    public a(long j8, String str, GDIDeviceStatus.RemoteDeviceBatteryStatusBatteryStatus remoteDeviceBatteryStatusBatteryStatus) {
        str.getClass();
        remoteDeviceBatteryStatusBatteryStatus.getClass();
        this.f17403a = j8;
        this.f17404b = str;
        this.f17405c = remoteDeviceBatteryStatusBatteryStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17403a == aVar.f17403a && this.f17404b.equals(aVar.f17404b) && this.f17405c == aVar.f17405c;
    }

    public final int hashCode() {
        return this.f17405c.hashCode() + g.j(Long.hashCode(this.f17403a) * 31, 31, this.f17404b);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f17403a, "RemoteDeviceBatteryStatus(deviceUnitId=", ", deviceName=", this.f17404b);
        sbK.append(", status=");
        sbK.append(this.f17405c);
        sbK.append(")");
        return sbK.toString();
    }
}
