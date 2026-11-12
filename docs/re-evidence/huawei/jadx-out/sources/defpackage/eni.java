package defpackage;

import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.open.data.model.IHeartRateAndBloodPressure;
import java.util.Calendar;

/* JADX INFO: loaded from: classes7.dex */
public class eni extends HealthData implements IHeartRateAndBloodPressure {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f33230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f33232c;
    private short d;
    private short e;

    public static int d(byte b2) {
        return b2 & 255;
    }

    @Override // com.huawei.health.ecologydevice.open.data.model.IHeartRateAndBloodPressure
    public short getSystolic() {
        return this.d;
    }

    @Override // com.huawei.health.ecologydevice.open.data.model.IHeartRateAndBloodPressure
    public void setSystolic(short s) {
        this.d = s;
    }

    @Override // com.huawei.health.ecologydevice.open.data.model.IHeartRateAndBloodPressure
    public short getDiastolic() {
        return this.e;
    }

    @Override // com.huawei.health.ecologydevice.open.data.model.IHeartRateAndBloodPressure
    public void setDiastolic(short s) {
        this.e = s;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public long getStartTime() {
        return this.f33231b;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public void setStartTime(long j) {
        this.f33231b = j;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public long getEndTime() {
        return this.f33230a;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public void setEndTime(long j) {
        this.f33230a = j;
    }

    @Override // com.huawei.health.ecologydevice.open.data.model.IHeartRateAndBloodPressure
    public short getHeartRate() {
        return this.f33232c;
    }

    @Override // com.huawei.health.ecologydevice.open.data.model.IHeartRateAndBloodPressure
    public void setHeartRate(short s) {
        this.f33232c = s;
    }

    public void c(byte[] bArr) {
        setSystolic((short) d(bArr[3]));
        setDiastolic((short) d(bArr[4]));
        setStartTime(Calendar.getInstance().getTimeInMillis());
        setHeartRate((short) d(bArr[2]));
    }
}
