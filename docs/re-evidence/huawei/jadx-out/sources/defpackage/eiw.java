package defpackage;

import com.huawei.health.device.open.data.HealthDataParser;
import com.huawei.health.device.open.data.model.HealthData;

/* JADX INFO: loaded from: classes7.dex */
public class eiw implements HealthDataParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected byte[] f33046b;

    private int b(int i) {
        return i & 15;
    }

    private int d(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        return (i & i3) != 0 ? (i3 - (i & (i3 - 1))) * (-1) : i;
    }

    private int e(byte b2) {
        return b2 & 255;
    }

    public void c(int i) {
        this.f33045a = i;
    }

    @Override // com.huawei.health.device.open.data.HealthDataParser
    public HealthData parseData(byte[] bArr) {
        enb enbVar = new enb();
        enbVar.setHeartRate(d(bArr));
        return enbVar;
    }

    private int a(byte b2, byte b3) {
        return e(b2) + (e(b3) << 8);
    }

    private int b(byte b2, byte b3, byte b4, byte b5) {
        return e(b2) + (e(b3) << 8) + (e(b4) << 16) + (e(b5) << 24);
    }

    private Integer e(int i, int i2) {
        int iB = b(i);
        byte[] bArr = this.f33046b;
        if (iB + i2 > bArr.length) {
            return null;
        }
        if (i == 17) {
            return Integer.valueOf(e(bArr[i2]));
        }
        if (i == 18) {
            return Integer.valueOf(a(bArr[i2], bArr[i2 + 1]));
        }
        if (i == 20) {
            return Integer.valueOf(b(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]));
        }
        if (i == 36) {
            return Integer.valueOf(d(b(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]), 32));
        }
        if (i == 33) {
            return Integer.valueOf(d(e(bArr[i2]), 8));
        }
        if (i != 34) {
            return null;
        }
        return Integer.valueOf(d(a(bArr[i2], bArr[i2 + 1]), 16));
    }

    private Integer d(byte[] bArr) {
        this.f33046b = bArr;
        return e((this.f33045a & 1) != 0 ? 18 : 17, 1);
    }
}
