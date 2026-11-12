package defpackage;

import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.open.data.HealthDataParser;

/* JADX INFO: loaded from: classes7.dex */
public class eio extends MeasureKit {
    @Override // com.huawei.health.device.open.MeasureKit
    public HealthDevice.HealthDeviceKind getHealthDataKind() {
        return HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR;
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public String getUuid() {
        return "bb11c776-c510-415d-ae3d-9a20207bd617";
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public HealthDataParser getHealthDataParser() {
        return new eip();
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public MeasureController getMeasureController() {
        return eis.b();
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public MeasureController getBackgroundController() {
        return new eis();
    }
}
