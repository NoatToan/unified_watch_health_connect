package defpackage;

import android.annotation.SuppressLint;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.sport_eco_manager.utils.UserInfo;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.wearable.gpsalgorithm.FitnessSportAlgo;
import com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class dln implements ISportStateChangedListener {
    public static final float[] n = {10.0f, 20.0f, 30.0f, 40.0f, 60.0f, 80.0f};
    public static final float[] o = {1.0182f, 1.0161f, 0.9522f, 0.9776f, 1.1171f, 1.0103f};
    public int d;
    public double e;
    public float f;
    public int g;
    public long h;
    public IFitnessSportAlgo i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15666k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f15664a = new double[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f15665b = new int[10];
    public float[] c = new float[10];
    public float[] l = new float[10];
    public float[] m = new float[10];

    public dln() {
        UserProfile userProfile = UserInfo.INSTANCE.getUserProfile();
        if (userProfile.getSex() == null) {
            userProfile.setSex("male");
        }
        this.i = FitnessSportAlgo.getInstance(userProfile);
    }

    private float d(int i) {
        if (i <= 10) {
            return o[0];
        }
        if (i >= 80) {
            return o[5];
        }
        int i2 = 1;
        while (true) {
            float[] fArr = n;
            if (i2 >= fArr.length) {
                return 0.0f;
            }
            float f = i;
            float f2 = fArr[i2];
            if (f < f2) {
                float[] fArr2 = o;
                int i3 = i2 - 1;
                float f3 = fArr2[i3];
                float f4 = f3 - fArr2[i2];
                if (f4 > 0.0f) {
                    float f5 = fArr[i3];
                    return f3 - ((f4 / (f2 - f5)) * (f - f5));
                }
                float fAbs = Math.abs(f4);
                float f6 = fArr[i2];
                float f7 = fArr[i3];
                return f3 + ((fAbs / (f6 - f7)) * (f - f7));
            }
            i2++;
        }
    }

    private float h(int i, double d) {
        if (i == 3 || i == 1 || i == 2) {
            if (d >= 0.01d && d <= 0.88d) {
                return i(2.0f, 0.01f, 0.88f, d, 2.8f);
            }
            if (d > 0.88d && d <= 1.33d) {
                return i(2.8f, 0.88f, 1.33f, d, 3.5f);
            }
            if (d > 1.33d && d <= 1.78d) {
                return i(3.5f, 1.33f, 1.78f, d, 5.0f);
            }
            if (d > 1.78d && d <= 2.0d) {
                return i(5.0f, 1.78f, 2.0f, d, 7.5f);
            }
            if (d > 2.0d && d <= 2.23d) {
                return i(7.5f, 2.0f, 2.23f, d, 8.3f);
            }
            if (d > 2.23d && d <= 2.31d) {
                return i(8.3f, 2.23f, 2.31f, d, 9.0f);
            }
            if (d > 2.31d && d <= 2.67d) {
                return i(9.0f, 2.31f, 2.67f, d, 9.8f);
            }
            if (d > 2.67d && d <= 2.99d) {
                return i(9.8f, 2.67f, 2.99f, d, 10.5f);
            }
            if (d > 2.99d && d <= 3.12d) {
                return i(10.5f, 2.99f, 3.12f, d, 11.0f);
            }
            if (d > 3.12d && d <= 3.34d) {
                return i(11.0f, 3.12f, 3.34f, d, 11.5f);
            }
            if (d > 3.34d && d <= 3.57d) {
                return i(11.5f, 3.34f, 3.57f, d, 11.8f);
            }
            if (d > 3.57d && d <= 3.83d) {
                return i(11.8f, 3.57f, 3.83f, d, 12.3f);
            }
            if (d > 3.83d && d <= 4.01d) {
                return i(12.3f, 3.83f, 4.01f, d, 12.8f);
            }
            if (d > 4.01d && d <= 4.46d) {
                return i(12.8f, 4.01f, 4.46f, d, 14.5f);
            }
            if (d > 4.46d && d <= 4.91d) {
                return i(14.5f, 4.46f, 4.91f, d, 16.0f);
            }
            if (d > 4.91d && d <= 5.35d) {
                return i(16.0f, 4.91f, 5.35f, d, 18.5f);
            }
            if (d >= 5.36d) {
                return 18.5f;
            }
        }
        if (i != 6 && i != 7) {
            return 0.0f;
        }
        if (d >= 0.01d && d <= 2.49d) {
            return i(3.5f, 0.01f, 2.49f, d, 5.8f);
        }
        if (d > 2.49d && d <= 4.46d) {
            return i(5.8f, 2.49f, 4.46f, d, 6.8f);
        }
        if (d > 4.46d && d <= 5.35d) {
            return i(6.8f, 4.46f, 5.35f, d, 8.0f);
        }
        if (d > 5.35d && d <= 6.25d) {
            return i(8.0f, 5.35f, 6.25f, d, 10.0f);
        }
        if (d > 6.25d && d <= 7.14d) {
            return i(10.0f, 6.25f, 7.14f, d, 12.0f);
        }
        if (d <= 7.14d || d > 8.93d) {
            return d >= 8.94d ? 15.8f : 0.0f;
        }
        return i(12.0f, 7.14f, 8.93f, d, 15.8f);
    }

    private float i(float f, float f2, float f3, double d, float f4) {
        return (float) (((double) f) + (((d - ((double) f2)) / ((double) (f3 - f2))) * ((double) (f4 - f))));
    }

    @SuppressLint({"WrongConstant"})
    private void m() {
        n();
        this.d = 0;
        this.e = 0.0d;
        this.f = 0.0f;
    }

    private void n() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f15665b;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = 0;
            i2++;
        }
        while (true) {
            double[] dArr = this.f15664a;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = 0.0d;
            i++;
        }
    }

    public void a(float f, float f2, float f3) {
        this.i.autoPauseHandle(f, f2, f3);
    }

    public Location b(long j) {
        return this.i.computeSportInfoBySteps(System.currentTimeMillis(), j);
    }

    public float c(int i) {
        float f = 0.0f;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f15665b;
            if (i3 >= iArr.length - 1) {
                break;
            }
            int i4 = i3 + 1;
            iArr[i3] = iArr[i4];
            i3 = i4;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        if (this.h == 0) {
            this.h = seconds;
        }
        int[] iArr2 = this.f15665b;
        int length = iArr2.length - 1;
        long j = i - this.g;
        long j2 = this.h;
        iArr2[length] = (int) (j / (seconds - j2 > 1 ? seconds - j2 : 1L));
        this.g = i;
        this.h = timeUnit.toSeconds(System.currentTimeMillis());
        while (true) {
            int[] iArr3 = this.f15665b;
            if (i2 >= iArr3.length - 1) {
                float f2 = (f / 10.0f) * 60.0f;
                FitnessLogUtils.d("FitnessSportDistancePaceCal", "step : " + i + ", StepRate:" + f2);
                return f2;
            }
            f += iArr3[i2];
            i2++;
        }
    }

    public int e(int i, int i2) {
        return (int) ((i / i2) * 1000.0f);
    }

    public float f(float f, float f2) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        UserProfile userProfile = UserInfo.INSTANCE.getUserProfile();
        float weightOrDefault = userProfile.getWeightOrDefault();
        if (f2 == 0.0f) {
            f2 = 60.0f;
        }
        float fD = (float) (((double) ((weightOrDefault / 60.0f) * 1.673f * (f - f2) * d(userProfile.getAge()))) * 1.2d);
        this.f = fD;
        return fD;
    }

    public double g(float f, float f2, int i, double d, String str, int i2) {
        return ((double) h(i2, d)) * ((("male".equals(str) ? ((((double) (f * 10.0f)) + (((double) f2) * 6.25d)) - ((double) (i * 5))) + 5.0d : ((((double) (f * 10.0f)) + (((double) f2) * 6.25d)) - ((double) (i * 5))) - 161.0d) / 1440.0d) / 60.0d) * 1.0d;
    }

    public int j(int i, float f, float f2, float f3) {
        float[] fArr;
        float[] fArr2;
        int i2 = 0;
        while (true) {
            fArr = this.c;
            if (i2 >= fArr.length - 1) {
                break;
            }
            int i3 = i2 + 1;
            fArr[i2] = fArr[i3];
            i2 = i3;
        }
        fArr[9] = Math.abs(f) + Math.abs(f2) + Math.abs(f3);
        if (i % this.c.length == 0) {
            float f4 = 0.0f;
            float f5 = 0.0f;
            int i4 = 0;
            while (true) {
                fArr2 = this.c;
                if (i4 >= fArr2.length) {
                    break;
                }
                f5 += fArr2[i4];
                i4++;
            }
            float length = f5 / fArr2.length;
            int i5 = 0;
            while (true) {
                float[] fArr3 = this.c;
                if (i5 >= fArr3.length) {
                    break;
                }
                float f6 = fArr3[i5];
                f4 += (f6 - length) * (f6 - length);
                i5++;
            }
            float f7 = f4 / 10.0f;
            if (f7 <= 1.0d) {
                return 0;
            }
            if (f7 <= 10.0f) {
                return 1;
            }
            if (f7 <= 30.0f) {
                return 2;
            }
            if (f7 > 150.0f && f7 <= 400.0f) {
                return 4;
            }
        }
        return 3;
    }

    public int k(int i, int i2) {
        float[] fArr;
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            float[] fArr2 = this.l;
            if (i3 >= fArr2.length - 1) {
                break;
            }
            int i4 = i3 + 1;
            fArr2[i3] = fArr2[i4];
            i3 = i4;
        }
        int i5 = 0;
        while (true) {
            fArr = this.m;
            if (i5 >= fArr.length - 1) {
                break;
            }
            int i6 = i5 + 1;
            fArr[i5] = fArr[i6];
            i5 = i6;
        }
        float[] fArr3 = this.l;
        float f = i2;
        fArr3[fArr3.length - 1] = f - this.j;
        float f2 = i;
        fArr[fArr.length - 1] = f2 - this.f15666k;
        this.f15666k = f2;
        this.j = f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i7 = 0;
        while (true) {
            float[] fArr4 = this.m;
            if (i7 >= fArr4.length) {
                break;
            }
            f4 += fArr4[i7];
            f3 += this.l[i7];
            i7++;
        }
        if (f3 == 0.0f) {
            return 0;
        }
        return (int) ((f4 / f3) * 100.0f);
    }

    public void l(int i) {
        m();
        this.d = i;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, @Nullable byte[] bArr) {
        FitnessLogUtils.i("FitnessSportDistancePaceCal", "onSportFinished");
        this.i.notifySportStateChanged(this.d, 4);
        m();
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        FitnessLogUtils.i("FitnessSportDistancePaceCal", "onSportPaused");
        this.i.notifySportStateChanged(this.d, 2);
        n();
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        FitnessLogUtils.i("FitnessSportDistancePaceCal", "onSportRestarted");
        this.i.notifySportStateChanged(this.d, 3);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int i, int i2, int i3, int i4) {
        FitnessLogUtils.i("FitnessSportDistancePaceCal", "onSportStarted");
        l(i3);
        this.i.notifySportStateChanged(i3, 1);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void preSport() {
    }
}
