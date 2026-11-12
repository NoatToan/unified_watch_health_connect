package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiHearRateUpMetaData;
import com.huawei.hihealth.data.model.HiHeartRateData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.model.StorageGenericModel;
import com.huawei.ui.commonui.linechart.model.StorageGenericModel.a;
import com.huawei.ui.commonui.linechart.model.StorageGenericModel.d;
import com.huawei.ui.main.stories.fitness.activity.heartrate.helper.HeartRateDetailData;
import com.huawei.ui.main.stories.fitness.views.heartrate.unixtimelistview.utils.AggregateOptionBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class uei {
    public static void a(Map<Long, IStorageModel> map, String str, SparseArray<List<HiHealthData>> sparseArray, ues uesVar) {
        StorageGenericModel storageGenericModel;
        if (uesVar == null) {
            return;
        }
        List<HiHealthData> list = sparseArray.get(uesVar.e());
        if (njy.e(list)) {
            LogUtil.a("HeartRateStorageHelper", "loadStatisticsValue, hrKey: ", str, " data is empty");
            return;
        }
        LogUtil.a("HeartRateStorageHelper", "loadStatisticsValue, hrKey: ", str, " data size: ", Integer.valueOf(list.size()));
        int iC = uesVar.c();
        for (HiHealthData hiHealthData : list) {
            long jE = ues.e(hiHealthData.getStartTime(), iC);
            if (map.containsKey(Long.valueOf(jE))) {
                storageGenericModel = (StorageGenericModel) map.get(Long.valueOf(jE));
            } else {
                storageGenericModel = new StorageGenericModel();
            }
            if (storageGenericModel != null) {
                storageGenericModel.e(str, hiHealthData.getFloat(str));
                map.put(Long.valueOf(jE), storageGenericModel);
            }
        }
    }

    public static void a(Map<Long, IStorageModel> map, String str, List<HiHealthData> list, ues uesVar) {
        StorageGenericModel storageGenericModel;
        int iC = uesVar != null ? uesVar.c() : 0;
        if (njy.e(list)) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            long jE = ues.e(hiHealthData.getStartTime(), iC);
            if (map.get(Long.valueOf(jE)) != null) {
                storageGenericModel = (StorageGenericModel) map.get(Long.valueOf(jE));
            } else {
                storageGenericModel = new StorageGenericModel();
            }
            ueu ueuVar = new ueu();
            ueuVar.c(hiHealthData.getStartTime(), hiHealthData.getEndTime());
            HiHearRateUpMetaData hiHearRateUpMetaData = (HiHearRateUpMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiHearRateUpMetaData.class);
            if (hiHearRateUpMetaData != null) {
                ueuVar.e(hiHearRateUpMetaData.getMinHeartRate(), hiHearRateUpMetaData.getMaxHeartRate());
                List<HiHeartRateData> details = hiHearRateUpMetaData.getDetails();
                ArrayList<HeartRateDetailData> arrayList = new ArrayList<>(16);
                if (njy.b(details)) {
                    for (HiHeartRateData hiHeartRateData : details) {
                        HeartRateDetailData heartRateDetailData = new HeartRateDetailData();
                        heartRateDetailData.setTime(hiHeartRateData.getTimestamp());
                        heartRateDetailData.setValue(hiHeartRateData.getHeartRate());
                        arrayList.add(heartRateDetailData);
                    }
                }
                ueuVar.e(arrayList);
                storageGenericModel.a(str, ueuVar);
                map.put(Long.valueOf(jE), storageGenericModel);
            }
        }
    }

    public static void e(Map<Long, IStorageModel> map, boolean z) {
        StorageGenericModel.PresentStyle aVar;
        ArrayList arrayList = new ArrayList(16);
        for (Map.Entry<Long, IStorageModel> entry : map.entrySet()) {
            StorageGenericModel storageGenericModel = (StorageGenericModel) entry.getValue();
            if (z) {
                Objects.requireNonNull(storageGenericModel);
                aVar = storageGenericModel.new d("HR_NORMAL_DETAIL", new String[0]);
            } else {
                Objects.requireNonNull(storageGenericModel);
                aVar = storageGenericModel.new a("HR_NORMAL_MIN", "HR_NORMAL_MAX");
            }
            storageGenericModel.b(aVar);
            if (!storageGenericModel.e()) {
                Long key = entry.getKey();
                key.longValue();
                arrayList.add(key);
                LogUtil.a("HeartRateStorageHelper", "processNormal key ", key);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((Long) it.next());
        }
    }

    public static void d(Map<Long, IStorageModel> map, boolean z) {
        String str = z ? "HR_REST_DETAIL" : "HR_REST";
        ArrayList arrayList = new ArrayList(16);
        for (Map.Entry<Long, IStorageModel> entry : map.entrySet()) {
            StorageGenericModel storageGenericModel = (StorageGenericModel) entry.getValue();
            Objects.requireNonNull(storageGenericModel);
            storageGenericModel.b(storageGenericModel.new d(str, new String[0]));
            if (!storageGenericModel.e()) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((Long) it.next());
        }
    }

    public static void b(Map<Long, IStorageModel> map, boolean z) {
        StorageGenericModel.PresentStyle aVar;
        ArrayList arrayList = new ArrayList(16);
        for (Map.Entry<Long, IStorageModel> entry : map.entrySet()) {
            StorageGenericModel storageGenericModel = (StorageGenericModel) entry.getValue();
            if (z) {
                aVar = new StorageGenericModel.c("HR_WARNING_DETAIL");
            } else {
                Objects.requireNonNull(storageGenericModel);
                aVar = storageGenericModel.new a("HR_WARNING_MIN", "HR_WARNING_MAX");
            }
            storageGenericModel.b(aVar);
            if (!storageGenericModel.e()) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((Long) it.next());
        }
    }

    public static void c(Map<Long, IStorageModel> map, boolean z) {
        StorageGenericModel.PresentStyle aVar;
        ArrayList arrayList = new ArrayList(16);
        for (Map.Entry<Long, IStorageModel> entry : map.entrySet()) {
            StorageGenericModel storageGenericModel = (StorageGenericModel) entry.getValue();
            if (z) {
                aVar = new StorageGenericModel.c("BRADYCARDIA_DETAIL");
            } else {
                Objects.requireNonNull(storageGenericModel);
                aVar = storageGenericModel.new a("BRADYCARDIA_MIN", "BRADYCARDIA_MAX");
            }
            storageGenericModel.b(aVar);
            if (!storageGenericModel.e()) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((Long) it.next());
        }
    }

    public static void a(SparseArray<List<HiHealthData>> sparseArray, DataInfos dataInfos) {
        List<HiHealthData> listE = e(sparseArray.get(0), sparseArray.get(1));
        if (dataInfos.isYearData()) {
            listE = e(listE);
        }
        sparseArray.put(0, listE);
    }

    public static List<HiHealthData> d(List<HiHealthData> list, List<HiHealthData> list2) {
        ArrayList arrayList = new ArrayList();
        if (!njy.b(list2)) {
            return njy.b(list) ? list : arrayList;
        }
        HiHealthData hiHealthData = list2.get(0);
        long j = 0;
        for (HiHealthData hiHealthData2 : list2) {
            if (hiHealthData2 == null) {
                LogUtil.j("HeartRateStorageHelper", "preProcessDayRestHeartRate healthData is null");
            } else {
                long startTime = hiHealthData2.getStartTime();
                if (j < startTime) {
                    hiHealthData = hiHealthData2;
                    j = startTime;
                }
            }
        }
        b(hiHealthData, 2018, "HR_SLEEP_REST_DETAIL", "HR_REST_DETAIL");
        arrayList.add(hiHealthData);
        return arrayList;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0052 -> B:20:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:20:0x0053
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static java.util.List<com.huawei.hihealth.HiHealthData> e(java.util.List<com.huawei.hihealth.HiHealthData> r8, java.util.List<com.huawei.hihealth.HiHealthData> r9) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uei.e(java.util.List, java.util.List):java.util.List");
    }

    private static List<HiHealthData> e(List<HiHealthData> list) {
        if (njy.e(list)) {
            return list;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        HiHealthData hiHealthData = null;
        for (HiHealthData hiHealthData2 : list) {
            if (hiHealthData == null) {
                linkedList2.add(hiHealthData2);
            } else if (TextUtils.equals(c(hiHealthData.getStartTime()), c(hiHealthData2.getStartTime()))) {
                linkedList2.add(hiHealthData2);
            } else {
                linkedList.add(b(linkedList2));
                linkedList2.clear();
                linkedList2.add(hiHealthData2);
            }
            hiHealthData = hiHealthData2;
        }
        if (njy.b(linkedList2)) {
            linkedList.add(b(linkedList2));
        }
        return linkedList;
    }

    private static String c(long j) {
        if (j == 0) {
            return "";
        }
        return DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DATE_FORMAT_6);
    }

    private static HiHealthData b(List<HiHealthData> list) {
        if (njy.e(list)) {
            return null;
        }
        int size = list.size();
        Iterator<HiHealthData> it = list.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            f += it.next().getFloat("HR_REST");
        }
        HiHealthData hiHealthData = list.get(0);
        hiHealthData.putFloat("HR_REST", f / size);
        return hiHealthData;
    }

    public static HiHealthData b(HiHealthData hiHealthData, int i, String str, String str2) {
        if (hiHealthData == null) {
            return null;
        }
        hiHealthData.setType(i);
        hiHealthData.putFloat(str2, hiHealthData.getFloat(str));
        return hiHealthData;
    }

    public static AggregateOptionBuilder.DataGroupUnit a(DataInfos dataInfos) {
        return e(dataInfos, (String) null);
    }

    public static AggregateOptionBuilder.DataGroupUnit e(DataInfos dataInfos, String str) {
        if (dataInfos.isDayData()) {
            return AggregateOptionBuilder.DataGroupUnit.NONE;
        }
        if (dataInfos.isWeekData()) {
            return AggregateOptionBuilder.DataGroupUnit.DAY;
        }
        if (dataInfos.isMonthData()) {
            return AggregateOptionBuilder.DataGroupUnit.DAY;
        }
        if (dataInfos.isYearData()) {
            if ("HR_SLEEP_REST".equals(str) || "HR_REST".equals(str)) {
                return AggregateOptionBuilder.DataGroupUnit.DAY;
            }
            return AggregateOptionBuilder.DataGroupUnit.MONTH;
        }
        return AggregateOptionBuilder.DataGroupUnit.YEAR;
    }
}
