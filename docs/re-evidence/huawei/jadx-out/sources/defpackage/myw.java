package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.PeriodRriEntity;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class myw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Semaphore f42708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f42709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f42710c;
    private HiStressMetaData e;

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final myw f42714a = new myw();
    }

    private int c() {
        return 1;
    }

    private int d() {
        return 1;
    }

    private myw() {
        this.e = null;
        this.f42708a = new Semaphore(0);
        this.f42710c = new ArrayList(16);
        this.f42709b = new ArrayList(16);
    }

    public static myw b() {
        return d.f42714a;
    }

    public List<HiStressMetaData> b(PeriodRriEntity periodRriEntity) {
        int i;
        ArrayList arrayList = new ArrayList(16);
        int iFetchVersion = periodRriEntity.fetchVersion();
        if (iFetchVersion != 1) {
            i = iFetchVersion == 2 ? 120 : 60;
            return arrayList;
        }
        PeriodRriEntity periodRriEntityA = a(periodRriEntity);
        for (PeriodRriEntity.RriDataEntity rriDataEntity : periodRriEntityA.fetchRriDataList()) {
            long jFetchStartTime = rriDataEntity.fetchStartTime() * 1000;
            LogUtil.a("PeriodRriParseUtil", "mCycleStartMeasureTime = ", Long.valueOf(jFetchStartTime));
            e(rriDataEntity.fetchRriList(), rriDataEntity.fetchSqiList());
            long j = jFetchStartTime + (((long) i) * 1000);
            float[] fArrD = d(jFetchStartTime, j);
            LogUtil.a("PeriodRriParseUtil", "mMeasureCycleLibBack = openLibMeasure:", Long.valueOf(System.currentTimeMillis()));
            if (!mza.e().c()) {
                periodRriEntityA.configFailTime(jFetchStartTime);
                LogUtil.a("PeriodRriParseUtil", "fail configFailTime:", Long.valueOf(jFetchStartTime));
                break;
            }
            if (fArrD != null && fArrD[18] != 0.0f) {
                arrayList.add(b(fArrD, jFetchStartTime, j));
                LogUtil.a("PeriodRriParseUtil", "cycleDataList add");
            }
            d(this.f42710c);
            d(this.f42709b);
        }
        ReleaseLogUtil.d("BTSYNC_PeriodRri_PeriodRriParseUtil", "cycleDataList size:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private void d(List<?> list) {
        if (list != null) {
            list.clear();
            LogUtil.a("PeriodRriParseUtil", "clearList");
        }
    }

    private HiStressMetaData b(float[] fArr, long j, long j2) {
        LogUtil.a("PeriodRriParseUtil", "getCycleMeasureHiStressMetaData start");
        HiStressMetaData hiStressMetaData = new HiStressMetaData();
        hiStressMetaData.configStressStartTime(j);
        hiStressMetaData.configStressEndTime(j2);
        hiStressMetaData.configStressAlgorithmVer(b(fArr));
        hiStressMetaData.configStressDevNo(myk.e());
        hiStressMetaData.configStressScore(c(fArr));
        hiStressMetaData.configStressGrade(e(fArr));
        hiStressMetaData.configStressCalibFlag(a(fArr));
        hiStressMetaData.configStressMeasureType(1);
        hiStressMetaData.configStressAccFlag(c());
        hiStressMetaData.configStressPpgFlag(d());
        hiStressMetaData.configStressFeature(d(fArr));
        hiStressMetaData.configStressFeatureAtts(a());
        return hiStressMetaData;
    }

    private int b(float[] fArr) {
        return (int) fArr[10];
    }

    private int c(float[] fArr) {
        return (int) fArr[15];
    }

    private int e(float[] fArr) {
        return (int) fArr[16];
    }

    private int a(float[] fArr) {
        int i = (int) fArr[17];
        if (i == 0) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        LogUtil.d("PeriodRriParseUtil", "getStressFlag no match");
        return (int) fArr[17];
    }

    private List<Float> d(float[] fArr) {
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < 12; i++) {
            if (i >= 0 && i < 10) {
                arrayList.add(Float.valueOf(fArr[i]));
            }
            if (i >= 10 && i < 12) {
                arrayList.add(Float.valueOf(0.0f));
            }
        }
        return arrayList;
    }

    private List<String> a() {
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < 12; i++) {
            arrayList.add("0");
        }
        return arrayList;
    }

    private PeriodRriEntity a(PeriodRriEntity periodRriEntity) {
        ArrayList arrayList = new ArrayList(16);
        long j = 0;
        PeriodRriEntity.RriDataEntity rriDataEntity = null;
        for (PeriodRriEntity.RriDataEntity rriDataEntity2 : periodRriEntity.fetchRriDataList()) {
            long jFetchStartTime = rriDataEntity2.fetchStartTime();
            if (jFetchStartTime - j > 60 || rriDataEntity == null) {
                PeriodRriEntity.RriDataEntity rriDataEntity3 = new PeriodRriEntity.RriDataEntity();
                rriDataEntity3.configStartTime(jFetchStartTime);
                rriDataEntity3.configRriList(new ArrayList(15));
                rriDataEntity3.configSqiList(new ArrayList(15));
                arrayList.add(rriDataEntity3);
                rriDataEntity = rriDataEntity3;
            }
            rriDataEntity.fetchSqiList().addAll(rriDataEntity2.fetchSqiList());
            rriDataEntity.fetchRriList().addAll(rriDataEntity2.fetchRriList());
            j = jFetchStartTime;
        }
        periodRriEntity.configRriDataList(arrayList);
        ReleaseLogUtil.d("BTSYNC_PeriodRri_PeriodRriParseUtil", "wrapJavaBean datas size :", Integer.valueOf(arrayList.size()));
        return periodRriEntity;
    }

    private void e(List<Integer> list, List<Integer> list2) {
        for (Integer num : list) {
            if (num.intValue() != 0) {
                this.f42710c.add(num);
            }
        }
        for (Integer num2 : list2) {
            if (num2.intValue() != 0) {
                this.f42709b.add(num2);
            }
        }
    }

    private float[] d(long j, long j2) {
        return mza.e().c(((int) (j2 - j)) / 1000, e(0), this.f42710c, this.f42709b);
    }

    private float[] e(int i) {
        float[] fArrB;
        synchronized (this) {
            fArrB = b(i);
            if (mza.e().b(fArrB)) {
                LogUtil.a("PeriodRriParseUtil", "getStressData is all 0");
                fArrB = b(i);
            }
        }
        return fArrB;
    }

    public void c(final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: myw.4
            @Override // java.lang.Runnable
            public void run() {
                HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.pressure_adjust_userinfo");
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 == null) {
                    LogUtil.j("PeriodRriParseUtil", "callback is null");
                    return;
                }
                if (userPreference != null) {
                    LogUtil.a("PeriodRriParseUtil", "hiUserPreferenceBase != null");
                    if (!TextUtils.isEmpty(userPreference.getValue())) {
                        String value = userPreference.getValue();
                        LogUtil.a("PeriodRriParseUtil", "getUserPressureAdjustDatas value :", value);
                        iBaseResponseCallback.a(0, value);
                        return;
                    }
                    iBaseResponseCallback.a(100001, null);
                    return;
                }
                iBaseResponseCallback2.a(100006, null);
            }
        });
    }

    private float[] b(final int i) {
        final float[] fArr = new float[18];
        c(new IBaseResponseCallback() { // from class: myw.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 != 0 || !(obj instanceof String)) {
                    LogUtil.j("PeriodRriParseUtil", "getUserPressureAdjustDatas error");
                } else {
                    LogUtil.a("PeriodRriParseUtil", "getUserPressureAdjustDatas objectData :", obj);
                    myw.this.e = mbs.a((String) obj);
                    myw.this.d(fArr, i);
                }
                myw.this.f42708a.release();
                LogUtil.a("PeriodRriParseUtil", "getCalibratedData semaphore.release()");
            }
        });
        try {
            if (this.f42708a.tryAcquire(2L, TimeUnit.SECONDS)) {
                LogUtil.a("PeriodRriParseUtil", "getCalibratedData semaphore isTryAcquire()");
                return fArr;
            }
            LogUtil.a("PeriodRriParseUtil", "getCalibratedData semaphore isTryAcquire() fail");
            return fArr;
        } catch (InterruptedException unused) {
            LogUtil.e("PeriodRriParseUtil", "getCalibratedData semaphore InterruptedException");
            return fArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(float[] fArr, int i) {
        HiStressMetaData hiStressMetaData = this.e;
        if (hiStressMetaData == null) {
            return;
        }
        LogUtil.a("PeriodRriParseUtil", "setCalibratedData mHiStressMetaData:", hiStressMetaData.toString());
        List<Float> listFetchStressFeature = this.e.fetchStressFeature();
        for (int i2 = 0; i2 < 18; i2++) {
            if (i2 >= 0 && i2 < 10) {
                fArr[i2] = listFetchStressFeature.get(i2).floatValue();
            }
            if (i2 >= 10 && i2 <= 13) {
                fArr[i2] = 0.0f;
            }
            if (i2 > 13 && i2 <= 15) {
                fArr[i2] = 55.0f;
            }
            if (i2 == 16) {
                fArr[i2] = this.e.fetchStressScore();
            }
            if (i2 == 17) {
                fArr[i2] = i;
            }
        }
    }
}
