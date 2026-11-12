package com.xiaomi.hm.health.running.calori.source;

import com.huami.sport.service.model.HistoryRecord;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.dataprocess.StageSteps;
import com.xiaomi.hm.health.running.EnergyDataProvider;
import com.xiaomi.hm.health.running.StepDataManager;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J \u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/running/calori/source/DeviceCalorieColleague;", "Lcom/xiaomi/hm/health/running/calori/source/ICalorieColleague;", "", "startTime", "endTime", "", "Lcom/xiaomi/hm/health/running/EnergyDataProvider$EnergyData;", "getStepCalorie", "Lcom/huami/sport/service/model/HistoryRecord;", "getSportList", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceCalorieColleague extends ICalorieColleague {
    @Override // com.xiaomi.hm.health.running.calori.source.ICalorieColleague
    @Nullable
    public List<HistoryRecord> getSportList(long startTime, long endTime) {
        List<HistoryRecord> listFirstOrDefault = HistoryRecordManager.getInstance().loadLocalDataByTimeRangeInRx(Long.valueOf(startTime), Long.valueOf(endTime)).toBlocking().firstOrDefault(new ArrayList());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFirstOrDefault) {
            if (hashSet.add(((HistoryRecord) obj).getDistinctKey())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (true ^ ((HistoryRecord) obj2).isTraining()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            Integer source = ((HistoryRecord) obj3).getSource();
            if (source == null || source.intValue() != 0) {
                arrayList3.add(obj3);
            }
        }
        return CollectionsKt___CollectionsKt.sorted(arrayList3);
    }

    @Nullable
    public final List<EnergyDataProvider.EnergyData> getStepCalorie(long startTime, long endTime) {
        ArrayList arrayList;
        List<DateData> listLoadDateData = StepDataManager.INSTANCE.loadDateData(startTime, endTime);
        ArrayList arrayList2 = new ArrayList();
        for (DateData dateData : listLoadDateData) {
            List<StageSteps> stageStep = StepDataManager.INSTANCE.parseStageStep(dateData.getStageStepsSummary());
            if (stageStep == null) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(stageStep, 10));
                for (StageSteps stageSteps : stageStep) {
                    Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(dateData.getDate());
                    EnergyDataProvider.EnergyData stageStepToEnergyData = EnergyDataProvider.INSTANCE.parseStageStepToEnergyData(date == null ? 0L : date.getTime(), stageSteps);
                    if (stageStepToEnergyData.getStartTime() > endTime) {
                        stageStepToEnergyData.setStartTime(endTime);
                    }
                    arrayList3.add(stageStepToEnergyData);
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                arrayList2.add(arrayList);
            }
        }
        return CollectionsKt__IterablesKt.flatten(arrayList2);
    }
}
