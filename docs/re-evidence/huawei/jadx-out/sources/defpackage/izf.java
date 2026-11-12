package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class izf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<Double> f38244c = Collections.unmodifiableList(Arrays.asList(Double.valueOf(0.92d), Double.valueOf(0.8464d), Double.valueOf(0.778688d), Double.valueOf(0.716393d), Double.valueOf(0.659082d), Double.valueOf(0.606355d), Double.valueOf(0.557847d), Double.valueOf(0.513219d), Double.valueOf(0.472161d), Double.valueOf(0.434388d), Double.valueOf(0.399637d), Double.valueOf(0.36766d)));
    private int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38245a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f38246b = new int[60];
    private int e = 0;

    private int b(double d) {
        int i;
        if (d <= 1.0d) {
            i = 4;
        } else if (d <= 2.0d) {
            i = 3;
        } else if (d <= 3.0d) {
            i = -3;
        } else {
            i = d <= 4.0d ? -6 : -9;
        }
        if (i < 3) {
            return 3;
        }
        return i;
    }

    private double c(int i, double d) {
        return ((double) (i * 12)) * d;
    }

    public void a(int i) {
        int i2 = this.e;
        if (i2 < 60) {
            this.f38246b[i2] = i;
            this.e = i2 + 1;
        } else {
            c(i);
        }
        ReleaseLogUtil.d("Track_CalcStepRateManager", "saveDataByStepChange last time stamp");
    }

    private void c(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f38246b;
            if (i2 < iArr.length - 1) {
                int i3 = i2 + 1;
                iArr[i2] = iArr[i3];
                i2 = i3;
            } else {
                iArr[iArr.length - 1] = i;
                return;
            }
        }
    }

    public void e() {
        int i = this.e;
        if (i <= 10) {
            LogUtil.a("Track_CalcStepRateManager", "dealCalcRealStepRate size<2");
            return;
        }
        int i2 = (i - 1) / 5;
        b(i2, b(Math.max(Math.max(b(i), d(i)), h(i))), i);
    }

    private void b(int i, int i2, int i3) {
        if (i >= i2) {
            i = i2;
        }
        double dC = 0.0d;
        double dDoubleValue = 0.0d;
        for (int i4 = 0; i4 < i; i4++) {
            int iC = c(i3, i4);
            List<Double> list = f38244c;
            dC += c(iC, list.get(i4).doubleValue());
            dDoubleValue += list.get(i4).doubleValue();
        }
        a(dC, dDoubleValue);
    }

    private int c(int i, int i2) {
        int[] iArr = this.f38246b;
        return iArr[(i - 1) - (i2 * 5)] - iArr[(i - ((i2 + 1) * 5)) - 1];
    }

    private void a(double d, double d2) {
        int iE = e(Math.round((float) (d / d2)));
        this.d = iE;
        this.f38245a = iE;
    }

    private int e(int i) {
        if (i < 0) {
            LogUtil.j("Track_CalcStepRateManager", "checkStepRateValue exception", Integer.valueOf(i));
            return this.f38245a;
        }
        if (i <= 300) {
            return i;
        }
        LogUtil.j("Track_CalcStepRateManager", "checkStepRateValue exception", 0);
        return 0;
    }

    private double b(int i) {
        return ((double) Math.abs(c(i, 0) - c(i, 1))) * 1.0d;
    }

    private double d(int i) {
        return ((double) Math.abs(c(i, 0) - (i > 15 ? c(i, 2) : 0))) * 0.9d;
    }

    private double h(int i) {
        return ((double) Math.abs(c(i, 0) - (i > 20 ? c(i, 3) : 0))) * 0.8333333333333334d;
    }

    public int d() {
        LogUtil.a("Track_CalcStepRateManager", "getCurrentStepRate = ", Integer.valueOf(this.d));
        return this.d;
    }
}
