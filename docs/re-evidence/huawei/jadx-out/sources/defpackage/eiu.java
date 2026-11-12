package defpackage;

import com.huawei.health.device.open.data.HealthDataParser;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Calendar;

/* JADX INFO: loaded from: classes7.dex */
public class eiu implements HealthDataParser {
    @Override // com.huawei.health.device.open.data.HealthDataParser
    public HealthData parseData(byte[] bArr) {
        return b(bArr);
    }

    private ems b(byte[] bArr) {
        LogUtil.a("HdpBloodPressureDataParser", "Enter getBloodPressureData()");
        if (bArr != null && bArr.length >= 63) {
            short s = (short) (bArr[45] & 255);
            short s2 = (short) (bArr[47] & 255);
            short s3 = (short) (bArr[63] & 255);
            long jE = e(bArr);
            if (s < Short.MAX_VALUE && s > 0) {
                if (s2 >= Short.MAX_VALUE || s2 <= 0) {
                    LogUtil.j("HdpBloodPressureDataParser", "getBloodPressureData() diastolic invalid");
                    return null;
                }
                if (s3 >= Short.MAX_VALUE || s3 <= 0) {
                    LogUtil.j("HdpBloodPressureDataParser", "getBloodPressureData() heartRate invalid");
                    return null;
                }
                ReleaseLogUtil.d("BTSYNC_HdpBloodPressureDataParser", "BloodPressureData time is", Long.valueOf(jE));
                ems emsVar = new ems();
                emsVar.e(s, s2, s3, jE);
                return emsVar;
            }
            LogUtil.j("HdpBloodPressureDataParser", "getBloodPressureData() systolic invalid");
        }
        return null;
    }

    private long e(byte[] bArr) {
        Calendar calendar = Calendar.getInstance();
        int iA = a(bArr[50]);
        calendar.set(a(bArr[51]) + (iA * 100), a(bArr[52]) - 1, a(bArr[53]), a(bArr[54]), a(bArr[55]), a(bArr[56]));
        long timeInMillis = calendar.getTimeInMillis();
        long j = timeInMillis - 9249352595000L;
        if (j < 1000 && j > -1000) {
            timeInMillis = System.currentTimeMillis();
        }
        LogUtil.d("HdpBloodPressureDataParser", "getTime() time = ", Long.valueOf(timeInMillis));
        return timeInMillis;
    }

    private int a(byte b2) {
        try {
            return Integer.parseInt(Integer.toString(b2 & 255, 16));
        } catch (NumberFormatException e) {
            LogUtil.e("HdpBloodPressureDataParser", "hexadecimalToDecimal e = ", e.getMessage());
            return 0;
        }
    }
}
