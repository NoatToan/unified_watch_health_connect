package com.huawei.ui.main.stories.history.model;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.huawei.basefitnessadvice.model.FitnessTrackRecord;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.iwn;
import defpackage.jqq;
import defpackage.jry;
import defpackage.njy;
import defpackage.ntx;
import defpackage.nub;
import defpackage.vqw;
import defpackage.vqy;
import defpackage.vra;
import health.compact.a.CommonUtils;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SportRecordStatData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f28346c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f28347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SportRecordDataAdapter f28348b;
    private Context e;
    private vqw h;
    private int i;
    private long l;
    private int f = 0;
    private Map<Pair<Long, Long>, List<vra>> g = new HashMap();
    private Map<vqy, SportRecordDataAdapter> j = new HashMap();
    private Map<vqy, List<HiHealthData>> o = new HashMap();
    private Handler d = new Handler() { // from class: com.huawei.ui.main.stories.history.model.SportRecordStatData.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.e("Track_SportRecordStatData", "msg is null");
                return;
            }
            int i = message.what;
            if (i == 101) {
                SportRecordStatData.this.b();
            } else {
                if (i != 102) {
                    return;
                }
                SportRecordStatData.this.c(message.obj);
            }
        }
    };

    public SportRecordStatData(Context context) {
        this.e = BaseApplication.getContext();
        this.e = context;
    }

    private void d(vqy vqyVar, SportRecordDataAdapter sportRecordDataAdapter) {
        this.j.put(vqyVar, sportRecordDataAdapter);
    }

    public void d(long j, long j2, int i, int i2, SportRecordDataAdapter sportRecordDataAdapter) {
        LogUtil.a("Track_SportRecordStatData", "sportType = ", Integer.valueOf(i), ", timeUnit = ", Integer.valueOf(i2));
        synchronized (f28346c) {
            int i3 = this.f + 1;
            this.f = i3;
            this.i = i;
            this.l = j;
            this.f28347a = j2;
            if (i3 >= Integer.MAX_VALUE) {
                this.f = 0;
            }
        }
        this.f28348b = sportRecordDataAdapter;
        b();
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("Track_SportRecordStatData", "getData recordApi is null.");
            return;
        }
        ntx ntxVarA = new ntx.d().b(j).d(j2).c(this.i).d(i2).a();
        int i4 = this.i;
        if (i4 == 0) {
            vqw vqwVar = new vqw(this.d, 2);
            this.h = vqwVar;
            e(j, j2, i2, vqwVar);
            recordApi.acquireSummaryFitnessRecord(ntxVarA, this.h);
            return;
        }
        if (i4 == 10001) {
            vqw vqwVar2 = new vqw(this.d, 1);
            this.h = vqwVar2;
            recordApi.acquireSummaryFitnessRecord(ntxVarA, vqwVar2);
        } else {
            vqw vqwVar3 = new vqw(this.d, 1);
            this.h = vqwVar3;
            e(j, j2, i2, vqwVar3);
        }
    }

    private void e(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setTimeInterval(j, j2);
        if (i == 4) {
            i = 7;
        }
        hiSportStatDataAggregateOption.setGroupUnitType(i);
        hiSportStatDataAggregateOption.setSortOrder(1);
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setReadType(0);
        jry jryVarA = jry.a(this.e);
        if (jryVarA.b(this.i) == null || jryVarA.b(this.i).getSportDataStatics() == null) {
            LogUtil.e("Track_SportRecordStatData", "can not find sport type in json");
            return;
        }
        int[] iArrA = a(jryVarA);
        String[] strArrE = e(jryVarA);
        hiSportStatDataAggregateOption.setType(iArrA);
        hiSportStatDataAggregateOption.setConstantsKey(strArrE);
        int i2 = this.i;
        if (i2 != 0) {
            hiSportStatDataAggregateOption.setHiHealthTypes(iwn.c(i2));
        }
        HiHealthNativeApi.a(BaseApplication.getContext()).aggregateSportStatData(hiSportStatDataAggregateOption, new e(iBaseResponseCallback));
    }

    private int[] a(jry jryVar) {
        int[] iArrD = jqq.d(this.e, this.i);
        int[] iArrC = jryVar.c(jryVar.b(this.i).getSportDataStatics());
        int length = iArrD.length + iArrC.length;
        int[] iArr = new int[length];
        System.arraycopy(iArrD, 0, iArr, 0, iArrD.length);
        System.arraycopy(iArrC, 0, iArr, iArrD.length, iArrC.length);
        if (this.i == 0) {
            int[] iArrA = iwn.a(this.e).a();
            int[] iArr2 = new int[iArrA.length + length];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            System.arraycopy(iArrA, 0, iArr2, length, iArrA.length);
            iArr = iArr2;
        }
        int i = this.i;
        if (i != 286) {
            return i == 217 ? d(jryVar) : iArr;
        }
        int[] iArr3 = new int[iArr.length + 6];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(new int[]{42405, 42406, 42404, 42403, 42413, 23}, 0, iArr3, iArr.length, 6);
        return iArr3;
    }

    private int[] d(jry jryVar) {
        int[] iArr = {42352, 42353, 42355, 42354, 42352, 42362, 42355, 42356, 42354, 42353};
        int[] iArr2 = nub.f43727a;
        int length = iArr2.length;
        int i = 0;
        while (i < length) {
            int[] iArrC = jryVar.c(jryVar.b(iArr2[i]).getSportDataStatics());
            int[] iArr3 = new int[iArr.length + iArrC.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArrC, 0, iArr3, iArr.length, iArrC.length);
            i++;
            iArr = iArr3;
        }
        return iArr;
    }

    private String[] e(jry jryVar) {
        String[] strArrE = jqq.e(this.e, this.i);
        String[] strArrD = jryVar.d(jryVar.b(this.i).getSportDataStatics());
        int length = strArrE.length + strArrD.length;
        String[] strArr = new String[length];
        System.arraycopy(strArrE, 0, strArr, 0, strArrE.length);
        System.arraycopy(strArrD, 0, strArr, strArrE.length, strArrD.length);
        if (this.i == 0) {
            String[] strArrB = iwn.a(this.e).b();
            String[] strArr2 = new String[strArrB.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(strArrB, 0, strArr2, length, strArrB.length);
            strArr = strArr2;
        }
        int i = this.i;
        if (i == 286) {
            String[] strArrD2 = jryVar.d(jryVar.b(HeartRateThresholdConfig.HEART_RATE_LIMIT).getSportDataStatics());
            String[] strArr3 = new String[strArr.length + strArrD2.length];
            System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
            System.arraycopy(strArrD2, 0, strArr3, strArr.length, strArrD2.length);
            return strArr3;
        }
        if (i == 217) {
            int[] iArr = nub.f43727a;
            int length2 = iArr.length;
            int i2 = 0;
            while (i2 < length2) {
                String[] strArrD3 = jryVar.d(jryVar.b(iArr[i2]).getSportDataStatics());
                String[] strArr4 = new String[strArr.length + strArrD3.length];
                System.arraycopy(strArr, 0, strArr4, 0, strArr.length);
                System.arraycopy(strArrD3, 0, strArr4, strArr.length, strArrD3.length);
                i2++;
                strArr = strArr4;
            }
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.o == null || this.j == null) {
            LogUtil.j("Track_SportRecordStatData", "mTrackRecords or is mListenerList null in updateUi");
            return;
        }
        vqy vqyVarA = new vqy.b().c(this.l).b(this.f28347a).d(this.i).a();
        SportRecordDataAdapter sportRecordDataAdapter = this.j.get(vqyVarA);
        if (sportRecordDataAdapter != null) {
            sportRecordDataAdapter.updateUi(this.o.get(vqyVarA));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        if (!(obj instanceof List)) {
            LogUtil.j("Track_SportRecordStatData", "objData wrong type");
            return;
        }
        vqy vqyVarA = new vqy.b().c(this.l).b(this.f28347a).d(this.i).a();
        SportRecordDataAdapter sportRecordDataAdapter = this.f28348b;
        if (sportRecordDataAdapter != null) {
            d(vqyVarA, sportRecordDataAdapter);
        }
        List<Object> list = (List) obj;
        Iterator<Object> it = list.iterator();
        int i = 0;
        while (it.hasNext() && it.next() == null) {
            i++;
        }
        if (i == list.size()) {
            LogUtil.a("Track_SportRecordStatData", "send  is empty");
            this.d.sendEmptyMessage(101);
            return;
        }
        int i2 = this.i;
        if (i2 == 0) {
            d(list);
        } else if (i2 == 10001) {
            b(list);
        } else {
            c(list);
        }
        this.d.sendEmptyMessage(101);
    }

    private void d(List<Object> list) {
        for (Object obj : list) {
            if (njy.b(obj, HiHealthData.class)) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    b((HiHealthData) it.next());
                }
            } else if (njy.b(obj, FitnessTrackRecord.class)) {
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    e((FitnessTrackRecord) it2.next());
                }
            } else {
                LogUtil.j("Track_SportRecordStatData", "wrong data type = ", obj.getClass());
            }
        }
    }

    private void b(HiHealthData hiHealthData) {
        int i = hiHealthData.getInt("hihealth_type");
        if (i == 30001) {
            String[] strArrB = iwn.a(this.e).b();
            for (int i2 = 0; i2 < 8; i2++) {
                int iJ = CommonUtils.j(strArrB[i2].substring(6, 9));
                long startTime = hiHealthData.getStartTime();
                double d = hiHealthData.getDouble("Track_" + iJ + 2);
                double d2 = hiHealthData.getDouble("Track_" + iJ + 3);
                this.g.get(Pair.create(Long.valueOf(this.l), Long.valueOf(this.f28347a))).add(new vra(iJ, startTime, hiHealthData.getDouble("Track_" + iJ + 4), hiHealthData.getDouble("Track_" + iJ + 5), d2, d, hiHealthData.getDouble("Track_" + iJ + "abnormalTrack")));
            }
            return;
        }
        this.g.get(Pair.create(Long.valueOf(this.l), Long.valueOf(this.f28347a))).add(new vra(i, hiHealthData.getStartTime(), hiHealthData.getDouble("stat4"), hiHealthData.getDouble("stat5"), hiHealthData.getDouble("stat3"), hiHealthData.getDouble("stat2"), hiHealthData.getDouble("stat6")));
    }

    private void e(FitnessTrackRecord fitnessTrackRecord) {
        this.g.get(Pair.create(Long.valueOf(this.l), Long.valueOf(this.f28347a))).add(new vra(10001, fitnessTrackRecord.acquireMonthZeroTime(), fitnessTrackRecord.acquireSumExerciseTime(), fitnessTrackRecord.acquireSumExerciseTimes(), fitnessTrackRecord.acquireSumCalorie(), 0.0d, 0.0d));
    }

    private void c(List<Object> list) {
        if (njy.b(list.get(0), HiHealthData.class)) {
            List<HiHealthData> list2 = (List) list.get(0);
            if (njy.e(list2)) {
                LogUtil.j("Track_SportRecordStatData", "trackData records is empty");
            } else {
                this.o.put(new vqy.b().c(this.l).b(this.f28347a).d(this.i).a(), list2);
            }
        }
    }

    private void b(List<Object> list) {
        if (njy.b(list.get(0), FitnessTrackRecord.class)) {
            List<FitnessTrackRecord> list2 = (List) list.get(0);
            if (njy.e(list2)) {
                LogUtil.j("Track_SportRecordStatData", "Fitness records is empty");
                return;
            }
            for (FitnessTrackRecord fitnessTrackRecord : list2) {
                if (fitnessTrackRecord.acquireSumExerciseTime() > 0) {
                    HiHealthData hiHealthData = new HiHealthData();
                    hiHealthData.putFloat("Track_Fitness_Duration_Sum", fitnessTrackRecord.acquireSumExerciseTime());
                    hiHealthData.putInt("Track_Fitness_Count_Sum", fitnessTrackRecord.acquireSumExerciseTimes());
                    hiHealthData.putFloat("Track_Fitness_Calorie_Sum", fitnessTrackRecord.acquireSumCalorie());
                    this.o.get(new vqy.b().c(this.l).b(this.f28347a).d(this.i).a()).add(hiHealthData);
                }
            }
        }
    }

    static class e implements HiAggregateListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<IBaseResponseCallback> f28350c;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        private e(IBaseResponseCallback iBaseResponseCallback) {
            this.f28350c = new WeakReference<>(iBaseResponseCallback);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            WeakReference<IBaseResponseCallback> weakReference = this.f28350c;
            if (weakReference == null) {
                LogUtil.j("Track_SportRecordStatData", "mCallback == null");
                return;
            }
            IBaseResponseCallback iBaseResponseCallback = weakReference.get();
            if (iBaseResponseCallback == null) {
                LogUtil.j("Track_SportRecordStatData", "mCallback.get() == null");
            } else {
                iBaseResponseCallback.a(i, list);
            }
        }
    }
}
