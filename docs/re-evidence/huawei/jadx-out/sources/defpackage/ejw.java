package defpackage;

import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.open.data.HealthDataParser;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ejw extends MeasureKit {
    @Override // com.huawei.health.device.open.MeasureKit
    public HealthDevice.HealthDeviceKind getHealthDataKind() {
        return HealthDevice.HealthDeviceKind.HDK_ELLIPTICAL_MACHINE;
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public String getUuid() {
        return "4714128a99e84fbca3b5a8a717b958ac";
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public HealthDataParser getHealthDataParser() {
        LogUtil.a("PDSPORT_EllipticalMachineKit", "getHealthDataParser");
        return new HealthDataParser() { // from class: ejt
            @Override // com.huawei.health.device.open.data.HealthDataParser
            public final HealthData parseData(byte[] bArr) {
                return ejw.b(bArr);
            }
        };
    }

    static /* synthetic */ HealthData b(byte[] bArr) {
        return new HealthData();
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public MeasureController getMeasureController() {
        LogUtil.a("PDSPORT_EllipticalMachineKit", "getMeasureController");
        return new ejx();
    }
}
