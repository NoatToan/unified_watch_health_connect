package defpackage;

import com.huawei.health.device.open.data.model.HealthData;

/* JADX INFO: loaded from: classes7.dex */
public class emp extends HealthData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33200b;
    private float d;
    private long e;

    public float c() {
        return this.d;
    }

    public void b(float f) {
        this.d = f;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public long getStartTime() {
        return this.f33200b;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public void setStartTime(long j) {
        this.f33200b = j;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public long getEndTime() {
        return this.e;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public void setEndTime(long j) {
        this.e = j;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public String toString() {
        return "BodyTemperature [mStartTime=" + this.f33200b + ", mEndTime=" + this.e + "]";
    }
}
