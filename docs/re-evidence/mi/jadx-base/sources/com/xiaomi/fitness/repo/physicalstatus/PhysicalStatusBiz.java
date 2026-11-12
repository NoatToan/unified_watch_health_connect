package com.xiaomi.fitness.repo.physicalstatus;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPhysicalStatusReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.PhysicalStatusItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.physicalstatus.PhysicalStatusBiz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/repo/physicalstatus/PhysicalStatusBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPhysicalStatusReport;", "<init>", "()V", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhysicalStatusBiz extends BaseProcessBiz<DailyPhysicalStatusReport> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean splitDailyReport$lambda$0(DailyRecordItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return ((PhysicalStatusItem) item).getPhysicalFitnessStatus() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DailyRecordItem splitDailyReport$lambda$1(DailyRecordItem newItem, DailyRecordItem dailyRecordItem) {
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (dailyRecordItem == null) {
            return newItem;
        }
        PhysicalStatusItem physicalStatusItem = (PhysicalStatusItem) newItem;
        PhysicalStatusItem physicalStatusItem2 = (PhysicalStatusItem) dailyRecordItem;
        return physicalStatusItem.getTime() > physicalStatusItem2.getTime() ? physicalStatusItem : physicalStatusItem2;
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyPhysicalStatusReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyPhysicalStatusReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        PhysicalStatusItem physicalStatusItem = null;
        if (!Intrinsics.areEqual(viewTag, "home") && TextUtils.isEmpty(sid)) {
            FitnessLogUtils.i(getTAG(), "splitDailyVitalityReport: sid is null or empty");
            return new DailyPhysicalStatusReport(timestamp, null);
        }
        if (itemMap.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "splitDailyVitalityReport: source data is empty");
            return new DailyPhysicalStatusReport(timestamp, null);
        }
        Pair<String, Map<String, List<DailyRecordItem>>> pairSpiltRecordList = spiltRecordList(itemMap, new Function1() { // from class: avh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(PhysicalStatusBiz.splitDailyReport$lambda$0((DailyRecordItem) obj));
            }
        }, new Function2() { // from class: bvh
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PhysicalStatusBiz.splitDailyReport$lambda$1((DailyRecordItem) obj, (DailyRecordItem) obj2);
            }
        });
        if (Intrinsics.areEqual(viewTag, "home")) {
            sid = pairSpiltRecordList.getFirst();
        } else {
            Intrinsics.checkNotNull(sid);
        }
        List<DailyRecordItem> list = pairSpiltRecordList.getSecond().get(sid);
        DailyPhysicalStatusReport dailyPhysicalStatusReport = new DailyPhysicalStatusReport(timestamp, sid);
        List<DailyRecordItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "vitality:no data to sid " + sid + ", time = " + timestamp);
            return dailyPhysicalStatusReport;
        }
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.PhysicalStatusItem>");
        Iterator<DailyRecordItem> it = list.iterator();
        while (it.hasNext()) {
            PhysicalStatusItem physicalStatusItem2 = (PhysicalStatusItem) it.next();
            physicalStatusItem2.setTimestamp(FitnessDateUtils.INSTANCE.changeZeroOfTheDay(physicalStatusItem2.getTime()));
            arrayList.add(physicalStatusItem2);
            if (physicalStatusItem == null || physicalStatusItem2.getTime() >= physicalStatusItem.getTime()) {
                physicalStatusItem = physicalStatusItem2;
            }
        }
        dailyPhysicalStatusReport.setLatestPhysicalStatusItem(physicalStatusItem);
        dailyPhysicalStatusReport.setPhysicalStatusItemList(arrayList);
        return dailyPhysicalStatusReport;
    }
}
