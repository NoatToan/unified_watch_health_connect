package defpackage;

import android.content.Context;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.report.bean.AnnualReportStepResult;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import health.compact.a.HiDateUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes13.dex */
public class ovz extends BaseCalculator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PluginAchieveAdapter f44899b = getPluginAchieveAdapter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f44898a = BaseApplication.getContext();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        e(i);
        c(i);
    }

    public void e(final int i) {
        LogUtil.a("PLGACHIEVE_StepCalculator", "getAnnualStepData enter");
        long jA = oxi.a(i, true);
        long jA2 = oxi.a(i, false);
        this.f44899b.readBestStepDayOfYear(this.f44898a, jA, jA2, new AchieveCallback() { // from class: ovz.4
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                ovz.this.e(i, obj);
            }
        });
        this.f44899b.readEveryMonthStepsOfYear(this.f44898a, jA, jA2, new AchieveCallback() { // from class: ovz.5
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                ovz.this.c(i, obj);
            }
        });
        this.f44899b.fetchSequenceDataBySportType(this.f44898a, jA, jA2, 257, new AchieveCallback() { // from class: ovy
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public final void onResponse(int i2, Object obj) {
                this.d.c(i, i2, obj);
            }
        });
    }

    /* synthetic */ void c(int i, int i2, Object obj) {
        List<HiHealthData> list;
        LogUtil.a("PLGACHIEVE_StepCalculator", "getAnnualStepData: ret -> " + i2);
        if (njy.b(obj, HiHealthData.class)) {
            list = (List) obj;
        } else {
            LogUtil.j("PLGACHIEVE_StepCalculator", "getAnnualStepData: data is not list");
            list = null;
        }
        insertData(i, EnumAnnualType.REPORT_STEP.value(), d(list));
        LogUtil.a("PLGACHIEVE_StepCalculator", "getAnnualStepData: end");
    }

    private Map<Integer, String> d(List<HiHealthData> list) {
        HiTrackMetaData hiTrackMetaData;
        HashMap map = new HashMap(2);
        int i = 0;
        if (!njy.e(list)) {
            Iterator<HiHealthData> it = list.iterator();
            while (it.hasNext()) {
                try {
                    hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(it.next().getMetaData(), HiTrackMetaData.class);
                } catch (JsonSyntaxException e) {
                    LogUtil.e("PLGACHIEVE_StepCalculator", "computeWalkData: exception -> " + e.getMessage());
                    hiTrackMetaData = null;
                }
                if (hiTrackMetaData == null || oxe.e(hiTrackMetaData)) {
                    LogUtil.j("PLGACHIEVE_StepCalculator", "computeWalkData: Invalid data -> " + hiTrackMetaData);
                } else {
                    i++;
                }
            }
        } else {
            LogUtil.j("PLGACHIEVE_StepCalculator", "computeWalkData: walkDataList is null");
        }
        map.put(3010, String.valueOf(i));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void e(int i, T t) {
        if (!(t instanceof AnnualReportStepResult)) {
            LogUtil.a("PLGACHIEVE_StepCalculator", "readBestStepDayOfYear obj not instanceof AnnualReportStepResult");
            return;
        }
        try {
            AnnualReportStepResult annualReportStepResult = (AnnualReportStepResult) t;
            int overGoal = annualReportStepResult.getOverGoal();
            if (i <= 2019) {
                insertData(i, EnumAnnualType.REPORT_SUMARY.value(), 6004, String.valueOf(overGoal));
            } else {
                insertData(i, EnumAnnualType.REPORT_STEP.value(), IEventListener.EVENT_ID_DEVICE_RTSP_CONN, String.valueOf(overGoal));
            }
            insertData(i, EnumAnnualType.REPORT_STEP.value(), 3003, String.valueOf(annualReportStepResult.getValue()));
            insertData(i, EnumAnnualType.REPORT_STEP.value(), 3004, String.valueOf(oxi.e(annualReportStepResult.getTimestamp())));
            Map<Long, Long> reachStepDayData = annualReportStepResult.getReachStepDayData();
            int iC = reachStepDayData == null ? 0 : owj.c(new ArrayList(reachStepDayData.keySet()));
            insertData(i, EnumAnnualType.REPORT_STEP.value(), 10026, String.valueOf(iC));
            LogUtil.a("PLGACHIEVE_StepCalculator", "maxStepContinuousDays reachDays == ", Integer.valueOf(iC));
            a(i, reachStepDayData);
        } catch (ClassCastException unused) {
            LogUtil.e("PLGACHIEVE_StepCalculator", "readBestStepDayOfYear data ClassCastException");
        }
    }

    private void a(int i, Map<Long, Long> map) {
        if (i < 2025 || map == null) {
            return;
        }
        final LinkedList linkedList = new LinkedList();
        map.entrySet().stream().sorted(new Comparator() { // from class: owb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ovz.c((Map.Entry) obj, (Map.Entry) obj2);
            }
        }).limit(8L).forEach(new Consumer() { // from class: owa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ovz.c(linkedList, (Map.Entry) obj);
            }
        });
        insertData(i, EnumAnnualType.REPORT_STEP.value(), 10072, HiJsonUtil.d(linkedList));
    }

    static /* synthetic */ int c(Map.Entry entry, Map.Entry entry2) {
        int iCompare = Long.compare(((Long) entry2.getValue()).longValue(), ((Long) entry.getValue()).longValue());
        return iCompare == 0 ? Long.compare(((Long) entry.getKey()).longValue(), ((Long) entry2.getKey()).longValue()) : iCompare;
    }

    static /* synthetic */ void c(LinkedList linkedList, Map.Entry entry) {
        JsonObject jsonObject = new JsonObject();
        int iD = HiDateUtil.d(((Long) entry.getKey()).longValue());
        jsonObject.addProperty(String.valueOf(iD), (Number) entry.getValue());
        linkedList.add(jsonObject);
    }

    private void a(int i, List<HiHealthData> list) {
        int i2;
        if (list == null || list.size() < 2) {
            i2 = -1;
        } else {
            long startTime = ((HiHealthData) Collections.max(list, new c())).getStartTime();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(startTime);
            i2 = calendar.get(2) + 1;
        }
        insertData(i, EnumAnnualType.REPORT_STEP.value(), IEventListener.EVENT_ID_DEVICE_DISCONN_SUCC, String.valueOf(i2));
    }

    private void c(final int i) {
        LogUtil.a("PLGACHIEVE_StepCalculator", "enter getAnnualAvgStepData");
        if (this.f44899b == null) {
            LogUtil.j("PLGACHIEVE_StepCalculator", "mAchieveAdapter is null,return");
            return;
        }
        this.f44899b.getSumYearData(this.f44898a, oxi.a(2015, true), oxi.a(i, false), 19, new AchieveCallback() { // from class: ovz.2
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                ovz.this.a(obj, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void a(T t, int i) {
        if (t == null) {
            LogUtil.j("PLGACHIEVE_StepCalculator", "saveAnnualAvgData is null,return");
            return;
        }
        try {
            List list = (List) t;
            if (njy.e(list)) {
                return;
            }
            int size = list.size();
            StringBuilder sb = new StringBuilder(size);
            LogUtil.a("PLGACHIEVE_StepCalculator", "saveAnnualAvgData size ", Integer.valueOf(size));
            for (int i2 = 0; i2 < size; i2++) {
                HiHealthData hiHealthData = (HiHealthData) list.get(i2);
                sb.append(oxi.b(hiHealthData.getLong("start_time")) + "_" + oxi.c(hiHealthData.getDouble("sport_walk_step_sum")));
                if (i2 != size - 1) {
                    sb.append(",");
                }
            }
            insertData(i, EnumAnnualType.REPORT_STEP.value(), 9006, sb.toString());
        } catch (ClassCastException unused) {
            LogUtil.e("PLGACHIEVE_StepCalculator", "getWeightData data ClassCastException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void c(int i, T t) {
        if (!(t instanceof List)) {
            LogUtil.j("PLGACHIEVE_StepCalculator", "getSeasonStep data error.");
            return;
        }
        List<HiHealthData> list = (List) t;
        a(i, list);
        e(i, list);
    }

    private void e(int i, List<HiHealthData> list) {
        if (list == null || list.size() < 2) {
            insertData(i, EnumAnnualType.REPORT_STEP.value(), 3009, String.valueOf(0));
            insertData(i, EnumAnnualType.REPORT_STEP.value(), IEventListener.EVENT_ID_DEVICE_UPDATE, String.valueOf(-1));
            return;
        }
        Map<Integer, Float> mapA = oxd.a(list);
        int iC = oxd.c(mapA);
        if (mapA == null || !mapA.containsKey(Integer.valueOf(iC))) {
            return;
        }
        insertData(i, EnumAnnualType.REPORT_STEP.value(), 3009, String.valueOf(mapA.get(Integer.valueOf(iC)).intValue()));
        insertData(i, EnumAnnualType.REPORT_STEP.value(), IEventListener.EVENT_ID_DEVICE_UPDATE, String.valueOf(iC));
    }

    public static class c implements Serializable, Comparator<HiHealthData> {
        private static final long serialVersionUID = 2022707229507542336L;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            return paw.b(hiHealthData == null ? 0.0f : hiHealthData.getFloat("sum"), hiHealthData2 != null ? hiHealthData2.getFloat("sum") : 0.0f);
        }
    }
}
