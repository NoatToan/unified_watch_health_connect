package defpackage;

import android.util.SparseArray;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.phoneprocess.SamplePointAfterProcess;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qgu implements SamplePointAfterProcess {
    @Override // com.huawei.health.devicemgr.api.phoneprocess.SamplePointAfterProcess
    public HiHealthData onSamplePointAfterProcess(HiHealthData hiHealthData, String str) {
        HiAggregateOption hiAggregateOptionE = e(hiHealthData);
        HiAggregateOption hiAggregateOptionB = b(hiHealthData);
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOptionE).e(true).e();
        HiDataAggregateProOption hiDataAggregateProOptionE2 = HiDataAggregateProOption.builder().c(hiAggregateOptionB).e(true).e();
        LogUtil.a("PhysiologicalCycleAfterProcess", "base option is ", hiAggregateOptionE, " temperature option is ", hiAggregateOptionB);
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthDataProEx(Arrays.asList(hiDataAggregateProOptionE, hiDataAggregateProOptionE2), new e(hiHealthData));
        return hiHealthData;
    }

    private HiAggregateOption e(HiHealthData hiHealthData) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(lsl.d(lsl.r(hiHealthData.getStartTime()), -59));
        hiAggregateOption.setEndTime(HiDateUtil.g(hiHealthData.getStartTime()));
        hiAggregateOption.setCount(1);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setType(new int[]{500048648});
        hiAggregateOption.setConstantsKey(new String[]{"physiological_cycle_base_line_key"});
        return hiAggregateOption;
    }

    private HiAggregateOption b(HiHealthData hiHealthData) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(lsl.d(lsl.r(hiHealthData.getStartTime()), -59));
        hiAggregateOption.setEndTime(HiDateUtil.g(hiHealthData.getStartTime()));
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.AVERAGE_WRIST_TEMPERATURE_ALL_NIGHT_VALUE.value()});
        hiAggregateOption.setConstantsKey(new String[]{"physiological_cycle_temperature_key"});
        return hiAggregateOption;
    }

    public static class e implements HiAggregateListenerEx {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HiHealthData f46202c;

        public e(HiHealthData hiHealthData) {
            this.f46202c = hiHealthData;
        }

        private List<HiHealthData> b(List<HiHealthData> list) {
            long jD = lsl.d(this.f46202c.getStartTime(), -1);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f46202c);
            if (!njy.e(list)) {
                for (HiHealthData hiHealthData : list) {
                    if (hiHealthData != null) {
                        if (!lsl.c(hiHealthData.getStartTime(), jD) && jD > hiHealthData.getStartTime()) {
                            jD = hiHealthData.getStartTime();
                        }
                        if (lsl.c(hiHealthData.getStartTime(), jD)) {
                            arrayList.add(hiHealthData);
                            jD = lsl.d(jD, -1);
                        }
                    }
                }
            }
            return arrayList;
        }

        private float d(List<HiHealthData> list) {
            boolean z;
            float fRound;
            boolean z2 = true;
            float f = 0.0f;
            for (HiHealthData hiHealthData : list) {
                if (z2) {
                    HashMap map = (HashMap) HiJsonUtil.d(hiHealthData.getFieldsValue(), new TypeToken<HashMap<Integer, Float>>() { // from class: com.huawei.threecircle.PhysiologicalCycleAfterProcess$PhysiologicalCycleListener$1
                    }.getType());
                    float fFloatValue = (map == null || !map.containsKey(Integer.valueOf(DicDataTypeUtil.DataType.AVERAGE_WRIST_TEMPERATURE_ALL_NIGHT_VALUE.value()))) ? 0.0f : ((Float) map.getOrDefault(Integer.valueOf(DicDataTypeUtil.DataType.AVERAGE_WRIST_TEMPERATURE_ALL_NIGHT_VALUE.value()), Float.valueOf(0.0f))).floatValue();
                    if (fFloatValue == 0.0f) {
                        fFloatValue = hiHealthData.getFloat("physiological_cycle_temperature_key");
                    }
                    fRound = Math.round(fFloatValue * 100.0f) / 100.0f;
                    z = false;
                } else {
                    float fRound2 = Math.round(hiHealthData.getFloat("physiological_cycle_temperature_key") * 100.0f) / 100.0f;
                    z = z2;
                    fRound = fRound2;
                }
                f += fRound;
                z2 = z;
            }
            return Math.round((f / list.size()) * 100.0f) / 100.0f;
        }

        private void c(List<HiHealthData> list) {
            long jA = lsl.a(this.f46202c.getStartTime(), 12, 0);
            ReleaseLogUtil.c("R_PhysiologicalCycleAfterProcess", "currentTime is ", Long.valueOf(jA));
            HiHealthData hiHealthData = new HiHealthData();
            hiHealthData.setType(500048648);
            float fD = d(list);
            hiHealthData.setValue(fD);
            hiHealthData.setDeviceUuid(this.f46202c.getDeviceUuid());
            hiHealthData.setTimeInterval(jA, jA);
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.addData(hiHealthData);
            LogUtil.a("PhysiologicalCycleAfterProcess", "base line is ", Float.valueOf(fD));
            HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: qgw
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    qgu.e.e(i, obj);
                }
            });
        }

        static /* synthetic */ void e(int i, Object obj) {
            if (i == 0) {
                LogUtil.a("PhysiologicalCycleAfterProcess", "saveBaseLine success");
            } else {
                LogUtil.a("PhysiologicalCycleAfterProcess", "saveBaseLine fail: ", Integer.valueOf(i));
            }
        }

        private void e(List<HiHealthData> list) {
            long jC = lsl.c(this.f46202c.getStartTime());
            long jR = lsl.r(lsl.d(jC, -6));
            ReleaseLogUtil.c("R_PhysiologicalCycleAfterProcess", "start time = ", Long.valueOf(jR), " end time is ", Long.valueOf(jC));
            ArrayList arrayList = new ArrayList();
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData.getStartTime() >= jR && hiHealthData.getStartTime() <= jC) {
                    arrayList.add(hiHealthData);
                }
            }
            LogUtil.a("PhysiologicalCycleAfterProcess", "inRangeList is ", arrayList);
            if (arrayList.size() < 5) {
                ReleaseLogUtil.e("R_PhysiologicalCycleAfterProcess", "inRangeList.size() < 5");
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            float fD = 0.0f;
            for (int i = 0; i < arrayList.size(); i++) {
                long jA = lsl.a(((HiHealthData) arrayList.get(i)).getStartTime(), 12, 0);
                HiHealthData hiHealthData2 = new HiHealthData();
                hiHealthData2.setType(500048648);
                if (arrayList.size() - i > 4) {
                    fD = d(arrayList.subList(i, arrayList.size()));
                }
                hiHealthData2.setValue(fD);
                hiHealthData2.setDeviceUuid(this.f46202c.getDeviceUuid());
                hiHealthData2.setTimeInterval(jA, jA);
                arrayList2.add(hiHealthData2);
            }
            LogUtil.a("PhysiologicalCycleAfterProcess", "base Line list is ", arrayList2);
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.setDatas(arrayList2);
            HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: qgs
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i2, Object obj) {
                    qgu.e.a(i2, obj);
                }
            });
        }

        static /* synthetic */ void a(int i, Object obj) {
            if (i == 0) {
                ReleaseLogUtil.c("R_PhysiologicalCycleAfterProcess", "saveBaseLine success");
            } else {
                ReleaseLogUtil.c("R_PhysiologicalCycleAfterProcess", "saveBaseLine fail: ", Integer.valueOf(i));
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
        public void onResult(SparseArray<List<HiHealthData>> sparseArray, int i, int i2) {
            if (sparseArray == null || i != 0) {
                ReleaseLogUtil.b("R_PhysiologicalCycleAfterProcess", "dataList is null, errorCode is ", Integer.valueOf(i));
                return;
            }
            List<HiHealthData> list = sparseArray.get(0);
            List<HiHealthData> list2 = sparseArray.get(1);
            List<HiHealthData> listB = b(list2);
            LogUtil.a("PhysiologicalCycleAfterProcess", "origin temperature list is ", list2, "filtered temperature list is ", listB);
            if (listB.size() < 5) {
                ReleaseLogUtil.b("R_PhysiologicalCycleAfterProcess", "filteredTemperatureList.size() < 5");
            } else if (njy.e(list)) {
                e(listB);
            } else {
                c(listB);
            }
        }
    }
}
