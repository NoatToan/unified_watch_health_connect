package defpackage;

import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.open.data.HealthDataParser;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ejd extends MeasureKit {
    @Override // com.huawei.health.device.open.MeasureKit
    public HealthDevice.HealthDeviceKind getHealthDataKind() {
        return HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING;
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public String getUuid() {
        return "1bc29e6ea15546158a913daa9e31631c";
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public HealthDataParser getHealthDataParser() {
        LogUtil.a("PDROPE_RopeSkippingSportKit", "getHealthDataParser");
        return new HealthDataParser() { // from class: eje
            @Override // com.huawei.health.device.open.data.HealthDataParser
            public final HealthData parseData(byte[] bArr) {
                return ejd.d(bArr);
            }
        };
    }

    static /* synthetic */ HealthData d(byte[] bArr) {
        return new HealthData();
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public MeasureController getMeasureController() {
        LogUtil.a("PDROPE_RopeSkippingSportKit", "getMeasureController");
        return new ejf();
    }
}
