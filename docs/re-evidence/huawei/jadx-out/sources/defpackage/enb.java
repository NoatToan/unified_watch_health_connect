package defpackage;

import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.open.data.model.IHeartRate;

/* JADX INFO: loaded from: classes7.dex */
public class enb extends HealthData implements IHeartRate {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33219c;

    @Override // com.huawei.health.ecologydevice.open.data.model.IHeartRate
    public int getHeartRate() {
        return this.f33219c;
    }

    @Override // com.huawei.health.ecologydevice.open.data.model.IHeartRate
    public void setHeartRate(Integer num) {
        this.f33219c = num == null ? 0 : num.intValue();
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public String toString() {
        return "HeartRate [mHeartRate=" + this.f33219c + "]";
    }
}
