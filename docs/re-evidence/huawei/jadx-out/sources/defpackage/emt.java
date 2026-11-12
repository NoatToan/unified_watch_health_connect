package defpackage;

import com.huawei.health.device.open.data.model.HealthData;

/* JADX INFO: loaded from: classes7.dex */
public class emt extends HealthData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f33208c;
    private long d;

    public float e() {
        return this.f33208c;
    }

    public void b(float f) {
        this.f33208c = f;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public long getStartTime() {
        return this.f33207b;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public void setStartTime(long j) {
        this.f33207b = j;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public long getEndTime() {
        return this.d;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public void setEndTime(long j) {
        this.d = j;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public String toString() {
        return "BloodOxygen [mStartTime=" + this.f33207b + ", mEndTime=" + this.d + "]";
    }
}
