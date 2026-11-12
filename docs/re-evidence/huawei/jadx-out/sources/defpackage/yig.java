package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.wearengine.capability.EnumWearEngineCapabilityItem;

/* JADX INFO: loaded from: classes20.dex */
public class yig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yig f53373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EnumWearEngineCapabilityItem f53374b;
    private DeviceInfo d;

    public yig(DeviceInfo deviceInfo, EnumWearEngineCapabilityItem enumWearEngineCapabilityItem) {
        this.d = deviceInfo;
        this.f53374b = enumWearEngineCapabilityItem;
    }

    public int e() {
        if (yie.e(this.d, this.f53374b)) {
            return 0;
        }
        return b();
    }

    private int b() {
        yig yigVar = this.f53373a;
        if (yigVar != null) {
            return yigVar.e();
        }
        return 1;
    }

    public yig d(EnumWearEngineCapabilityItem enumWearEngineCapabilityItem) {
        yig yigVar = new yig(this.d, enumWearEngineCapabilityItem);
        this.f53373a = yigVar;
        return yigVar;
    }
}
