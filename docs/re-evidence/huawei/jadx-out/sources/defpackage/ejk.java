package defpackage;

import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.open.data.HealthDataParser;
import com.huawei.health.device.open.data.model.HealthData;

/* JADX INFO: loaded from: classes7.dex */
public class ejk extends MeasureKit {
    @Override // com.huawei.health.device.open.MeasureKit
    public HealthDevice.HealthDeviceKind getHealthDataKind() {
        return HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE;
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public String getUuid() {
        return "5e5a6d06-a7f5-433c-adcc-26713447b839";
    }

    static /* synthetic */ HealthData c(byte[] bArr) {
        return new HealthData();
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public HealthDataParser getHealthDataParser() {
        return new HealthDataParser() { // from class: eji
            @Override // com.huawei.health.device.open.data.HealthDataParser
            public final HealthData parseData(byte[] bArr) {
                return ejk.c(bArr);
            }
        };
    }

    @Override // com.huawei.health.device.open.MeasureKit
    public MeasureController getMeasureController() {
        return ejg.d();
    }
}
