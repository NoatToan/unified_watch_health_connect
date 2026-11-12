package ii1;

import com.garmin.device.datatypes.DeviceProfile;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lii1/d;", "", "Ll80/b;", "delegate", "<init>", "(Ll80/b;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.b f93771a;

    public d(l80.b bVar) {
        bVar.getClass();
        this.f93771a = bVar;
    }

    public final xt2.a a(String str) {
        str.getClass();
        da2.b bVarX = this.f93771a.x();
        DeviceProfile deviceProfileD = bVarX.d(str);
        if (deviceProfileD == null) {
            return null;
        }
        String macAddress = deviceProfileD.getMacAddress();
        macAddress.getClass();
        return (xt2.a) bVarX.getCapability(macAddress, xt2.a.class);
    }
}
