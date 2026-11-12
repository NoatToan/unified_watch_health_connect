package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealthservice.db.helper.HiHealthDBHelper;
import com.huawei.hihealthservice.sync.dataswitch.HealthDataSwitch;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByTimeReq;
import com.huawei.hwcloudmodel.model.unite.GetHealthDataByTimeRsp;
import com.huawei.hwcloudmodel.model.unite.HealthDetail;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lgy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lqo f40114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthDataSwitch f40115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lfz f40116c;
    private Context d;
    private int e;
    private lhp h;
    private long j = 0;

    public lgy(Context context, int i) {
        this.d = context;
        this.h = lhp.b(context);
        this.f40114a = lqo.b(context);
        this.e = i;
        this.f40115b = new HealthDataSwitch(this.d);
        this.f40116c = lfz.d(this.d);
    }

    public void b() throws lif {
        int iValue = DicDataTypeUtil.DataType.ALTITUDE_TYPE_SET.value();
        List<SyncKey> listC = this.h.c(iValue);
        if (HiCommonUtil.b(listC)) {
            ReleaseLogUtil.e("HiH_HiSyncAltitude", "dictionary data not exist in cloud");
            return;
        }
        long jLongValue = listC.get(0).getVersion().longValue();
        if (jLongValue == 0) {
            return;
        }
        long jH = HiDateUtil.h(jLongValue);
        e(liq.b(jH, 7), jH);
        kxk.c().d(this.e, iValue, jLongValue, 0L);
    }

    private void e(long j, long j2) throws lif {
        GetHealthDataByTimeReq getHealthDataByTimeReqA = a(DicDataTypeUtil.DataType.ALTITUDE_TYPE_SET.value(), j, j2);
        ReleaseLogUtil.d("HiH_HiSyncAltitude", "pullDataByTime st,", Long.valueOf(j), ",et,", Long.valueOf(j2));
        GetHealthDataByTimeRsp getHealthDataByTimeRspA = this.f40114a.a(getHealthDataByTimeReqA);
        if (!lih.e(getHealthDataByTimeRspA, false)) {
            ReleaseLogUtil.e("HiH_HiSyncAltitude", "pullDataByTime error");
            return;
        }
        List<HealthDetail> detailInfos = getHealthDataByTimeRspA.getDetailInfos();
        if (detailInfos == null || detailInfos.isEmpty()) {
            ReleaseLogUtil.e("HiH_HiSyncAltitude", "pullDataByTime data error");
        } else {
            if (c(detailInfos, 0L)) {
                return;
            }
            ReleaseLogUtil.e("HiH_HiSyncAltitude", "pullDataByTime save data error");
        }
    }

    public void a() {
        this.j = SystemClock.elapsedRealtime();
        d(new HiAggregateListener() { // from class: lgy.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) throws Throwable {
                ReleaseLogUtil.d("HiH_HiSyncAltitude", "getLakeLouiseScoreList errorCode:", Integer.valueOf(i));
                if (i == 0 && njy.b(list)) {
                    try {
                        lgy.this.d(list);
                    } catch (lif e) {
                        ReleaseLogUtil.a("HiH_HiSyncAltitude", "pullAltitudeData SyncException:", e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x007d A[PHI: r4
      0x007d: PHI (r4v6 long) = (r4v4 long), (r4v15 long) binds: [B:12:0x0067, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x008a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
    /* JADX WARN: Code duplicated, block: B:22:0x00af  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
    public void d(List<HiHealthData> list) throws Throwable {
        long jR;
        long jC;
        long endTime;
        long startTime;
        long j;
        long jR2;
        long jC2;
        LogUtil.a("HiH_HiSyncAltitude", "divideAndPullData size:", Integer.valueOf(list.size()));
        if (list.get(0) == null) {
            return;
        }
        long startTime2 = list.get(0).getStartTime();
        long endTime2 = list.get(0).getEndTime();
        lhe lheVar = new lhe(this.d, new HiSyncOption(), this.e);
        boolean z = HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase() != null;
        int i = 1;
        while (i < list.size()) {
            if (endTime2 - list.get(i).getStartTime() < 604800000) {
                startTime2 = list.get(i).getStartTime();
                if (i != list.size() - 1) {
                    j = endTime2;
                    i = i;
                } else {
                    jR = lsl.r(startTime2);
                    jC = lsl.c(endTime2);
                    e(jR, jC);
                    if (z) {
                        lheVar.a(16, jR, jC);
                    }
                    endTime = list.get(i).getEndTime();
                    startTime = list.get(i).getStartTime();
                    if (i == list.size() - 1) {
                        jR2 = lsl.r(startTime);
                        jC2 = lsl.c(endTime);
                        e(jR2, jC2);
                        if (z) {
                            lheVar.a(16, jR2, jC2);
                        }
                    }
                    j = endTime;
                    startTime2 = startTime;
                }
            } else {
                jR = lsl.r(startTime2);
                jC = lsl.c(endTime2);
                e(jR, jC);
                if (z) {
                    lheVar.a(16, jR, jC);
                }
                endTime = list.get(i).getEndTime();
                startTime = list.get(i).getStartTime();
                if (i == list.size() - 1) {
                    jR2 = lsl.r(startTime);
                    jC2 = lsl.c(endTime);
                    e(jR2, jC2);
                    if (z) {
                        lheVar.a(16, jR2, jC2);
                    }
                }
                j = endTime;
                startTime2 = startTime;
            }
            i++;
            endTime2 = j;
        }
        LogUtil.a("HiH_HiSyncAltitude", "divideAndPullData totalTime:", Long.valueOf(SystemClock.elapsedRealtime() - this.j));
    }

    private void d(HiAggregateListener hiAggregateListener) {
        ReleaseLogUtil.d("HiH_HiSyncAltitude", "getLakeLouiseScoreList start");
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(1388509200000L);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setConstantsKey(new String[]{DicDataTypeUtil.DataType.LAKELOUISE_SCORE.name()});
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.LAKELOUISE_SCORE.value()});
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setSortOrder(1);
        HiHealthNativeApi.a(this.d).aggregateHiHealthDataPro(HiDataAggregateProOption.builder().c(hiAggregateOption).e(), hiAggregateListener);
    }

    private GetHealthDataByTimeReq a(int i, long j, long j2) {
        GetHealthDataByTimeReq getHealthDataByTimeReq = new GetHealthDataByTimeReq();
        getHealthDataByTimeReq.setQueryType(2);
        getHealthDataByTimeReq.setDataType(2);
        getHealthDataByTimeReq.setStartTime(Long.valueOf(j));
        getHealthDataByTimeReq.setEndTime(Long.valueOf(j2));
        getHealthDataByTimeReq.setType(Integer.valueOf(i));
        return getHealthDataByTimeReq;
    }

    private boolean c(List<HealthDetail> list, long j) throws lif {
        LogUtil.d("HiH_HiSyncAltitude", " saveData()");
        Collections.sort(list, lir.b());
        List<HiHealthData> listA = this.f40115b.a(list, this.e, j);
        if (HiCommonUtil.b(listA)) {
            ReleaseLogUtil.e("HiH_HiSyncAltitude", "local data empty");
            return true;
        }
        ReleaseLogUtil.d("HiH_HiSyncAltitude", "local point data type is ", Integer.valueOf(listA.get(0).getType()), ", size is ", Integer.valueOf(listA.size()));
        this.f40116c.saveSyncHealthDetailData(listA, this.e);
        return true;
    }
}
