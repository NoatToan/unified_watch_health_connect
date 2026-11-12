package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class ifr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37576c;
    private int f;
    private boolean g;
    private int h;
    private int i;
    private float j;
    private int[] k;
    private int l;
    private float m;
    private int o = 4;
    private static final int[] e = {40, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f37574a = {10, 90, 180, 360, HwExerciseConstants.NINE_MINUTES_PACE, 720, 600};
    private static final int[] d = {10, 90, 180, 360, HwExerciseConstants.NINE_MINUTES_PACE, 720, 600};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f37575b = {10, 90, 180, 360, HwExerciseConstants.NINE_MINUTES_PACE, 720, 600};

    public ifr(float f, float f2, int[] iArr) {
        d(f, f2, iArr);
    }

    public static final int[] d() {
        return (int[]) e.clone();
    }

    public static final int[] a() {
        return (int[]) f37574a.clone();
    }

    public static final int[] b() {
        return (int[]) d.clone();
    }

    public static final int[] c() {
        return (int[]) f37575b.clone();
    }

    private void d(float f, float f2, int[] iArr) {
        this.j = f;
        this.m = f2;
        this.k = iArr;
        this.o = 4;
        this.l = 0;
        this.i = 0;
        this.f = 0;
        if (iArr.length > 0) {
            this.h = iArr[0];
        }
    }

    public void e(float f) {
        int iC = c(f);
        LogUtil.e("Suggestion_StatusUtil", "onUpdate mLowerLimit:", Float.valueOf(this.j));
        LogUtil.e("Suggestion_StatusUtil", "onUpdate mUpperLimit:", Float.valueOf(this.m));
        LogUtil.e("Suggestion_StatusUtil", "onUpdate mTime:", Integer.valueOf(this.h));
        LogUtil.e("Suggestion_StatusUtil", "onUpdate mTimeIndex:", Integer.valueOf(this.f));
        int i = this.o;
        if (i == iC && iC != 4 && iC != 3) {
            int i2 = this.l + 1;
            this.l = i2;
            if (i2 >= 30) {
                this.f37576c = true;
            }
        } else if (i == iC && iC == 3) {
            int i3 = this.i + 1;
            this.i = i3;
            if (i3 >= 30 && this.f37576c) {
                this.g = true;
                this.f37576c = false;
            }
        } else {
            d(this.j, this.m, this.k);
            if (iC == 2 || iC == 1) {
                this.l++;
            }
            if (iC == 3) {
                this.i++;
            }
        }
        LogUtil.a("Suggestion_StatusUtil", "onUpdate current value:", Float.valueOf(f), " mTypeCount:", Integer.valueOf(this.l), " mNormalTypeCount:", Integer.valueOf(this.i), " old type:", Integer.valueOf(this.o), " new type:", Integer.valueOf(iC));
        this.o = iC;
    }

    private int c(float f) {
        float f2 = this.m;
        if (f > f2) {
            return 2;
        }
        float f3 = this.j;
        if (f < f3) {
            return 1;
        }
        return (f3 > f || f > f2) ? 4 : 3;
    }

    public int e() {
        if (this.o == 3) {
            return h();
        }
        return i();
    }

    private int i() {
        int i = this.l;
        int i2 = this.h;
        if (i != i2 || i2 == -1) {
            return 4;
        }
        int i3 = this.f + 1;
        this.f = i3;
        int[] iArr = this.k;
        if (i3 >= iArr.length) {
            this.f = iArr.length - 1;
        }
        LogUtil.a("Suggestion_StatusUtil", "getStatus mLowerLimit: ", Float.valueOf(this.j), "mUpperLimit: ", Float.valueOf(this.m), " status:", Integer.valueOf(this.o));
        this.h = this.k[this.f];
        return this.o;
    }

    private int h() {
        if (this.i == 180) {
            LogUtil.a("Suggestion_StatusUtil", "getStatus normal: ", Float.valueOf(this.j), "mUpperLimit: ", Float.valueOf(this.m), " status:", Integer.valueOf(this.o));
            return this.o;
        }
        if (!this.g) {
            return 4;
        }
        LogUtil.a("Suggestion_StatusUtil", "recover normal.status:", Integer.valueOf(this.o));
        this.g = false;
        return this.o;
    }
}
