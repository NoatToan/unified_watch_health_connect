package com.huawei.health.connectivity.extendstepcounter;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.health.manager.common.FlushableStepDataCache;
import com.huawei.health.manager.util.MotionType;
import com.huawei.health.manager.util.UserInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lsl;
import health.compact.a.OneMinuteStepData;
import health.compact.a.StepDataFileCache;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendStepDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6257a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f6258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FlushableStepDataCache f6259c;
    private StepDataFileCache e;

    public ExtendStepDataManager(Context context) {
        this.f6259c = null;
        this.e = null;
        this.f6258b = null;
        if (context == null) {
            LogUtil.j("Step_ExtendStepDataManager", "ExtendStepDataManager context is null.");
            this.f6258b = BaseApplication.getContext();
        } else {
            this.f6258b = context;
        }
        this.f6259c = new FlushableStepDataCache(this.f6258b);
        this.e = new StepDataFileCache(this.f6258b, "StepCounterFileCache");
        h();
    }

    public void c(int i, long j, int i2, int i3, int i4) {
        synchronized (this.f6257a) {
            FlushableStepDataCache flushableStepDataCache = this.f6259c;
            if (flushableStepDataCache == null) {
                return;
            }
            OneMinuteStepData oneMinuteStepDataE = flushableStepDataCache.e(j);
            if (oneMinuteStepDataE != null) {
                int iB = MotionType.b(MotionType.d(oneMinuteStepDataE.c()), i4);
                oneMinuteStepDataE.d(i2, i3);
                oneMinuteStepDataE.a(MotionType.e(iB));
                this.f6259c.d(oneMinuteStepDataE);
            } else {
                this.f6259c.b(i, j, i2, i3, MotionType.e(i4));
            }
        }
    }

    private void h() {
        LogUtil.a("Step_ExtendStepDataManager", "initCacheFromFile enter...");
        long jR = lsl.r(System.currentTimeMillis());
        synchronized (this.f6257a) {
            try {
                this.e.e(this.f6258b, this.f6259c, jR, System.currentTimeMillis());
            } catch (Exception unused) {
                LogUtil.e("Step_ExtendStepDataManager", "initMemoryFromFile exception");
            }
        }
    }

    public void e() {
        synchronized (this.f6257a) {
            try {
                this.e.c(this.f6258b, this.f6259c.c());
            } catch (Exception unused) {
                LogUtil.e("Step_ExtendStepDataManager", "flushMemoryCacheToFile exception");
            }
        }
    }

    public void d() {
        synchronized (this.f6257a) {
            this.f6259c.e();
            try {
                this.e.a(this.f6258b);
            } catch (Exception unused) {
                LogUtil.e("Step_ExtendStepDataManager", "clearCache exception");
            }
        }
    }

    public double a() {
        synchronized (this.f6257a) {
            SparseArray<OneMinuteStepData> sparseArrayC = this.f6259c.c();
            if (sparseArrayC == null) {
                LogUtil.j("Step_ExtendStepDataManager", "calculateCaloriesWithCache dataArray == null");
                return 0.0d;
            }
            int iD = 0;
            for (int i = 0; i < sparseArrayC.size(); i++) {
                if (sparseArrayC.valueAt(i).j()) {
                    iD = (int) (((double) iD) + sparseArrayC.valueAt(i).d(UserInfo.a()));
                }
            }
            return iD;
        }
    }

    public void b() {
        synchronized (this.f6257a) {
            this.f6259c.a();
        }
    }

    public void d(String str) {
        synchronized (this.f6257a) {
            try {
                if (str != null) {
                    this.f6259c.d(str);
                } else {
                    LogUtil.j("Step_ExtendStepDataManager", "deviceUuid == null");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(FlushableStepDataCache.MyFlushCallback myFlushCallback) {
        synchronized (this.f6257a) {
            try {
                if (myFlushCallback != null) {
                    this.f6259c.e(myFlushCallback);
                } else {
                    LogUtil.j("Step_ExtendStepDataManager", "callback == null");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int f() {
        int iD;
        synchronized (this.f6257a) {
            iD = this.f6259c.d();
        }
        return iD;
    }

    public int j() {
        int size;
        synchronized (this.f6257a) {
            size = this.f6259c.c().size();
        }
        return size;
    }

    public double c() {
        synchronized (this.f6257a) {
            SparseArray<OneMinuteStepData> sparseArrayC = this.f6259c.c();
            if (sparseArrayC == null) {
                LogUtil.j("Step_ExtendStepDataManager", "calculateAltitudeWithCache datas == null");
                return 0.0d;
            }
            int iA = 0;
            for (int i = 0; i < sparseArrayC.size(); i++) {
                if (sparseArrayC.valueAt(i).j()) {
                    iA += sparseArrayC.valueAt(i).a();
                }
            }
            return iA;
        }
    }

    public OneMinuteStepData e(int i) {
        OneMinuteStepData oneMinuteStepDataE;
        synchronized (this.f6257a) {
            oneMinuteStepDataE = this.f6259c.e(TimeUnit.MINUTES.toMillis(i));
        }
        return oneMinuteStepDataE;
    }
}
