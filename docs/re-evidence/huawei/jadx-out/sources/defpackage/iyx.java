package defpackage;

import androidx.media3.common.C;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class iyx {
    private int f = 0;
    private int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f38226a = new float[30];
    private float e = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38228c = 0;
    private float d = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Deque<d> f38227b = new LinkedList();

    static class d {
        private int d;
        private long e;

        d(long j, int i) {
            this.e = j;
            this.d = i;
        }
    }

    public void c(int i, long j) {
        Deque<d> deque = this.f38227b;
        if (deque == null) {
            LogUtil.j("Track_CalcPaceManager", "calcSpeedByDistanceChange mCalcPaceArray is null");
            return;
        }
        if (deque.size() < 2) {
            this.f38227b.add(new d(j, i));
        } else {
            this.f38227b.poll();
            this.f38227b.add(new d(j, i));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f38228c = jCurrentTimeMillis;
        LogUtil.a("Track_CalcPaceManager", "saveDataByDistanceChange mLastTimestamp = ", Long.valueOf(jCurrentTimeMillis), ", distance = ", Integer.valueOf(i), " time = ", Long.valueOf(j));
        ReleaseLogUtil.d("Track_CalcPaceManager", "saveDataByDistanceChange last time stamp");
    }

    private float a() {
        float f;
        if (System.currentTimeMillis() - this.f38228c >= C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
            return 0.0f;
        }
        Deque<d> deque = this.f38227b;
        if (deque == null || deque.size() != 2) {
            f = 0.0f;
        } else {
            float f2 = (this.f38227b.getLast().e - this.f38227b.getFirst().e) / 1000.0f;
            f = f2 > 0.0f ? (this.f38227b.getLast().d - this.f38227b.getFirst().d) / f2 : 0.0f;
            LogUtil.d("Track_CalcPaceManager", "calcSpeedByDistanceChange speed = ", Float.valueOf(f));
        }
        return f > 0.0f ? 1000.0f / f : f;
    }

    public float c() {
        return this.e;
    }

    public void e() {
        LogUtil.d("Track_CalcPaceManager", "enter calcAverageSpeedBySlidingFrame() startIndex = ", Integer.valueOf(this.f), " endIndex = ", Integer.valueOf(this.h));
        float fA = a();
        int i = this.h - this.f;
        int i2 = 0;
        if (i < 0 || e(fA, 0.0f)) {
            LogUtil.j("Track_CalcPaceManager", "calcAverageSpeedBySlidingFrame slidingFrameLength < 0 || isEqualFloat(newAddSpeed, 0)");
            this.h = 0;
            this.f = 0;
            this.e = 0.0f;
            this.d = 0.0f;
            return;
        }
        if (i < 2) {
            this.f38226a[i] = fA;
            this.h = i + 1;
            return;
        }
        int i3 = this.h;
        if (i3 < 30) {
            this.f38226a[i3] = fA;
            this.h = i3 + 1;
        } else {
            a(fA);
        }
        d(fA, i);
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = 0.0d;
        for (int i4 = this.f; i4 < this.h; i4++) {
            dDoubleValue2 += ((double) this.f38226a[i4]) * iyw.f38224b.get(i2).doubleValue();
            dDoubleValue += iyw.f38224b.get(i2).doubleValue();
            i2++;
        }
        if (dDoubleValue > 0.0d) {
            float f = (float) (dDoubleValue2 / dDoubleValue);
            this.e = f;
            LogUtil.a("Track_CalcPaceManager", "calcAverageSpeedBySlidingFrame mAverageSpeed(s/km) = ", Float.valueOf(f));
            float f2 = 3600.0f / this.e;
            this.e = f2;
            if (d(f2)) {
                this.e = this.d;
            }
            this.d = this.e;
        }
    }

    private void a(float f) {
        int i = 0;
        while (true) {
            float[] fArr = this.f38226a;
            if (i < fArr.length - 1) {
                int i2 = i + 1;
                fArr[i] = fArr[i2];
                i = i2;
            } else {
                fArr[fArr.length - 1] = f;
                return;
            }
        }
    }

    private void d(float f, int i) {
        LogUtil.d("Track_CalcPaceManager", "adjustSlidingFrame() newAddSpeed = ", Float.valueOf(f), " slidingFrameLength = ", Integer.valueOf(i));
        int i2 = this.h;
        float fMax = Math.max(Math.max((float) (((double) Math.abs(f - b(i2 - 2))) * 1.0d), (float) (((double) Math.abs(f - b(i2 - 3))) * 0.9d)), i2 + (-1) >= 3 ? (float) (((double) Math.abs(f - b(i2 - 4))) * 0.8333333333333334d) : 0.0f);
        List<Integer> listB = b(f);
        for (int i3 = 0; i3 < iyw.e.size(); i3++) {
            if (i3 == iyw.e.size() - 1) {
                this.f = this.h - 2;
                break;
            }
            if (fMax <= listB.get(i3).intValue()) {
                int iIntValue = i + iyw.e.get(i3).intValue();
                if (iIntValue >= 2) {
                    if (iIntValue <= 30) {
                        this.f = this.h - iIntValue;
                        break;
                    } else {
                        this.f = 0;
                        break;
                    }
                }
                this.f = this.h - 2;
                break;
            }
        }
        LogUtil.d("Track_CalcPaceManager", "adjustSlidingFrame() startIndex = ", Integer.valueOf(this.f), " endIndex = ", Integer.valueOf(this.h));
    }

    private List<Integer> b(float f) {
        if (f > 600.0f) {
            return iyw.d;
        }
        if (f > 450.0f) {
            return iyw.f38223a;
        }
        return iyw.f38225c;
    }

    private boolean e(float f, float f2) {
        return ((double) Math.abs(f - f2)) <= 1.0E-6d;
    }

    private float b(int i) {
        float[] fArr = this.f38226a;
        if (fArr == null) {
            return 0.0f;
        }
        if (i >= 0 && i < fArr.length) {
            return fArr[i];
        }
        LogUtil.j("Track_CalcPaceManager", "getSpecifiedElement Error index = ", Integer.valueOf(i));
        return 0.0f;
    }

    private boolean d(float f) {
        if (e(f, 0.0f)) {
            return false;
        }
        int iK = iwy.a(BaseApplication.getContext()).k();
        if (iK != 259) {
            float f2 = 3600.0f / f;
            if (iK == 257) {
                if (f2 <= 180.0f) {
                    LogUtil.j("Track_CalcPaceManager", "convertPace <= CalcPaceConstants.MAX_WALK_PACE");
                    return true;
                }
            } else if (iK != 258 && iK != 264) {
                LogUtil.d("Track_CalcPaceManager", "isAbnormalPaceData sportType = ", Integer.valueOf(iK));
            } else if (f2 <= 150.0f) {
                LogUtil.j("Track_CalcPaceManager", "convertPace <= CalcPaceConstants.MAX_RUN_PACE");
                return true;
            }
        } else if (f >= 100.0f) {
            LogUtil.j("Track_CalcPaceManager", "speed > CalcPaceConstants.MAX_RIDE_SPEED");
            return true;
        }
        return false;
    }
}
