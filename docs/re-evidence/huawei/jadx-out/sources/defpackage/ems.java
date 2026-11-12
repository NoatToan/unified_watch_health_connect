package defpackage;

import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hwlogsmodel.LogUtil;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public class ems extends HealthData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short f33206a;
    private short d;
    private short e;

    private static float c(short s) {
        if (s == Short.MIN_VALUE) {
            return Float.MIN_VALUE;
        }
        if (s < 90) {
            return (s * 10.0f) / 90.0f;
        }
        if (s < 130) {
            return (((s - 90) * 10.0f) / 40.0f) + 10.0f;
        }
        if (s < 140) {
            return (((s - 130) * 10.0f) / 10.0f) + 20.0f;
        }
        if (s < 160) {
            return (((s - 140) * 10.0f) / 20.0f) + 30.0f;
        }
        if (s < 180) {
            return (((s - 160) * 10.0f) / 20.0f) + 40.0f;
        }
        if (s < 200) {
            return (((s - 180) * 10.0f) / 20.0f) + 50.0f;
        }
        return 60.0f;
    }

    private static float d(short s) {
        if (s == Short.MIN_VALUE) {
            return Float.MIN_VALUE;
        }
        if (s < 60) {
            return (s * 10.0f) / 60.0f;
        }
        if (s < 80) {
            return (((s - 60) * 10.0f) / 20.0f) + 10.0f;
        }
        if (s < 90) {
            return (((s - 80) * 10.0f) / 10.0f) + 20.0f;
        }
        if (s < 100) {
            return (((s - 90) * 10.0f) / 10.0f) + 30.0f;
        }
        if (s < 110) {
            return (((s - 100) * 10.0f) / 10.0f) + 40.0f;
        }
        if (s < 120) {
            return (((s - 110) * 10.0f) / 10.0f) + 50.0f;
        }
        return 60.0f;
    }

    private static boolean i(short s) {
        return s >= 90 && s < 130;
    }

    private static boolean j(short s) {
        return s >= 60 && s < 80;
    }

    public short d() {
        return this.d;
    }

    public void a(short s) {
        this.d = s;
    }

    public short e() {
        return this.e;
    }

    public void b(short s) {
        this.e = s;
    }

    public void e(short s) {
        this.f33206a = s;
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public String toString() {
        return "BloodPressure [state=" + ((int) this.f33206a) + ", systolic=" + ((int) this.d) + ", diastolic=" + ((int) this.e) + super.toString() + "]";
    }

    public static float c(short s, short s2) {
        float fD;
        if (s == Short.MIN_VALUE || s2 == Short.MIN_VALUE) {
            return Float.MIN_VALUE;
        }
        if (j(s2)) {
            fD = c(s);
        } else if (i(s)) {
            fD = d(s2);
        } else if (s2 >= 80 && s >= 130) {
            fD = Math.max(c(s), d(s2));
        } else if (s2 < 60 && s < 90) {
            fD = Math.min(c(s), d(s2));
        } else {
            fD = (s2 >= 60 || s < 130) ? 60.0f : d(s2);
        }
        return new BigDecimal(fD).setScale(2, 4).floatValue();
    }

    public static int b(short s, short s2) {
        return e(c(s, s2));
    }

    public static int e(float f) {
        if (Math.abs(f - Float.MIN_VALUE) < 1.0E-6d) {
            return -32768;
        }
        if (f < c(0)) {
            return 0;
        }
        if (f < c(1)) {
            return 1;
        }
        if (f < c(2)) {
            return 2;
        }
        if (f < c(3)) {
            return 3;
        }
        return f < c(4) ? 4 : 5;
    }

    public static float c(int i) {
        float fFloatValue = new BigDecimal((i + 1) * 10.0f).setScale(2, 4).floatValue();
        if (i == -32768) {
            return Float.MIN_VALUE;
        }
        return fFloatValue;
    }

    public void e(short s, short s2, short s3, long j) {
        LogUtil.a("BloodPressure", "BloodPressure setBloodPressureData()");
        setStartTime(j);
        setEndTime(j);
        a(s);
        b(s2);
        setReferData(Short.valueOf(s3));
        setType(HealthData.BLOODPRESURE);
        setSubType(HealthData.BLOODPRESURE);
        e((short) b(d(), e()));
    }
}
