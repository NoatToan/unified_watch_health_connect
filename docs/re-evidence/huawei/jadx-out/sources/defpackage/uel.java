package defpackage;

import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.model.HiHearRateUpMetaData;
import com.huawei.hihealth.data.model.HiHeartRateData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.fitness.activity.heartrate.helper.HeartRateDetailData;
import com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.utils.AggregateOptionBuilder;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class uel {
    public static void a(String str, int i, final ResponseCallback<List<ued>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HealthHeartRate_HeartRateHistoryHelper", "queryModelUnitByDetail callback is null");
            return;
        }
        LogUtil.a("HealthHeartRate_HeartRateHistoryHelper", "queryModelUnitByDetail detailKey=", str, ",detailAggregate=", Integer.valueOf(i));
        AggregateOptionBuilder aggregateOptionBuilder = new AggregateOptionBuilder();
        aggregateOptionBuilder.d(0L, System.currentTimeMillis());
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(aggregateOptionBuilder.e(AggregateOptionBuilder.DataGroupUnit.NONE, str, i));
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthDataEx(arrayList, new HiAggregateListenerEx() { // from class: uem
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public final void onResult(SparseArray sparseArray, int i2, int i3) {
                uel.c(responseCallback, sparseArray, i2, i3);
            }
        });
    }

    static /* synthetic */ void c(ResponseCallback responseCallback, SparseArray sparseArray, int i, int i2) {
        if (sparseArray == null || sparseArray.size() == 0) {
            LogUtil.j("HealthHeartRate_HeartRateHistoryHelper", "queryModelUnitByDetail dataListArray is empty");
            responseCallback.onResponse(-1, null);
            return;
        }
        List list = (List) sparseArray.get(0);
        if (njy.e(list)) {
            LogUtil.j("HealthHeartRate_HeartRateHistoryHelper", "queryModelUnitByDetail dataList is empty");
            responseCallback.onResponse(-1, null);
        } else {
            SparseArray sparseArray2 = new SparseArray();
            b((List<HiHealthData>) list, (SparseArray<ued>) sparseArray2);
            responseCallback.onResponse(0, b(sparseArray2));
        }
    }

    private static List<ued> b(SparseArray<ued> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (sparseArray.size() == 0) {
            LogUtil.j("HealthHeartRate_HeartRateHistoryHelper", "sortHeartRateData monthDataList is empty");
            return arrayList;
        }
        int size = sparseArray.size();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < size; i++) {
            ued uedVarValueAt = sparseArray.valueAt(i);
            if (uedVarValueAt != null) {
                arrayList2.add(Integer.valueOf(sparseArray.keyAt(i)));
                d(uedVarValueAt.e());
            }
        }
        if (!njy.e(arrayList2)) {
            Collections.sort(arrayList2, new Comparator() { // from class: ueo
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return uel.a((Integer) obj, (Integer) obj2);
                }
            });
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(sparseArray.get(((Integer) it.next()).intValue()));
            }
        }
        return arrayList;
    }

    static /* synthetic */ int a(Integer num, Integer num2) {
        return num2.intValue() - num.intValue();
    }

    private static void b(List<HiHealthData> list, SparseArray<ued> sparseArray) {
        HiHearRateUpMetaData hiHearRateUpMetaData;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && (hiHearRateUpMetaData = (HiHearRateUpMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiHearRateUpMetaData.class)) != null) {
                uef uefVar = new uef();
                uefVar.d(hiHearRateUpMetaData.getMinHeartRate());
                uefVar.c(hiHearRateUpMetaData.getMaxHeartRate());
                uefVar.c(hiHealthData.getStartTime());
                uefVar.a(hiHealthData.getEndTime());
                e(hiHearRateUpMetaData.getDetails(), uefVar);
                long startTime = hiHealthData.getStartTime();
                int iE = ifp.e((Object) HiDateUtil.c(new Date(startTime), "yyyyMM"));
                ued uedVar = sparseArray.get(iE);
                if (uedVar == null) {
                    uedVar = new ued();
                }
                List<uef> listE = uedVar.e();
                if (njy.e(listE)) {
                    listE = new ArrayList<>();
                }
                listE.add(uefVar);
                uedVar.e(false);
                uedVar.c(startTime);
                uedVar.e(listE);
                sparseArray.put(iE, uedVar);
            }
        }
    }

    private static void e(List<HiHeartRateData> list, uef uefVar) {
        if (njy.e(list)) {
            LogUtil.j("HealthHeartRate_HeartRateHistoryHelper", "setHeartRateDetail warningList is empty");
            return;
        }
        ArrayList<HeartRateDetailData> arrayList = new ArrayList<>(16);
        for (HiHeartRateData hiHeartRateData : list) {
            HeartRateDetailData heartRateDetailData = new HeartRateDetailData();
            heartRateDetailData.setTime(hiHeartRateData.getTimestamp());
            heartRateDetailData.setValue(hiHeartRateData.getHeartRate());
            arrayList.add(heartRateDetailData);
        }
        uefVar.e(arrayList);
    }

    private static void d(List<uef> list) {
        if (njy.e(list)) {
            LogUtil.j("HealthHeartRate_HeartRateHistoryHelper", "compare dayList is empty");
        } else {
            Collections.sort(list, new Comparator() { // from class: uen
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return uel.b((uef) obj, (uef) obj2);
                }
            });
        }
    }

    static /* synthetic */ int b(uef uefVar, uef uefVar2) {
        if (uefVar == null || uefVar2 == null) {
            return 0;
        }
        return (int) (uefVar2.e() - uefVar.e());
    }
}
