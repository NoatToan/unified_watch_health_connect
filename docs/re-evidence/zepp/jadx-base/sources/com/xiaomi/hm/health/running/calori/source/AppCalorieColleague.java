package com.xiaomi.hm.health.running.calori.source;

import com.huami.sport.service.model.HistoryRecord;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u001e\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/running/calori/source/AppCalorieColleague;", "Lcom/xiaomi/hm/health/running/calori/source/ICalorieColleague;", "", "startTime", "endTime", "", "Lcom/huami/sport/service/model/HistoryRecord;", "getSportList", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppCalorieColleague extends ICalorieColleague {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = AppCalorieColleague.class.getSimpleName();

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
            if (source != null && source.intValue() == 0) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (((HistoryRecord) obj4).isTraining()) {
                arrayList4.add(obj4);
            }
        }
        return CollectionsKt___CollectionsKt.sorted(CollectionsKt___CollectionsKt.plus((Collection) arrayList3, (Iterable) arrayList4));
    }
}
